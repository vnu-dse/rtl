package org.tzi.rtl.trafo.matching;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.tzi.use.uml.mm.MClass;
import org.tzi.use.uml.mm.MOperation;
import org.tzi.use.uml.mm.ModelFactory;
import org.tzi.use.uml.ocl.type.TupleType.Part;
import org.tzi.use.uml.sys.MObject;

@SuppressWarnings("unchecked")
public class MatchingEachPart extends Matching {
	// Store all matches for each part: <matchSR, list match> like a cache
	public static Map<String, List<Map<String, MObject>>> listMatch;
	// Store all match for part
	List<Map<String, MObject>> matchS;
	List<Map<String, MObject>> matchC;
	List<Map<String, MObject>> matchT;
	// mark object existed in parameter
	private Set<MObject> marks = new HashSet<MObject>();
	
	public MatchingEachPart() {
		super();
	}

	public MatchingEachPart(MOperation _operation){
		super(_operation);
		//setParameters();
		if (listMatch == null)
			listMatch = new HashMap<String, List<Map<String,MObject>>>();
		if (matchC == null)
			matchC = new ArrayList<Map<String,MObject>>();
		if (matchS == null)
			matchS = new ArrayList<Map<String,MObject>>();
		if (matchT == null)
			matchT = new ArrayList<Map<String,MObject>>();
	}

	public MatchingEachPart(MatchingEachPart match){
		super();
		objectList4LHS.putAll(match.objectList4LHS);
		objectList4RHS.putAll(match.objectList4RHS);
		fSystemState = match.fSystemState;
		//fSystemState = new MSystemState(fUniqueNameGenerator.generate("tggState#"), match.fSystemState);
		operation = match.operation;
		rule = match.rule;
		//next = match.next;
		previous = match.previous;
	}
	
	@Override
	public List<Matching> findMatchIntegration() {
		List<Matching> result = new ArrayList<Matching>();
		// Source
		// Find all match if there is the first time we find match for this rule
		if (!listMatch.containsKey(operation.name() + "S")){
			objectList4LHS.clear();
			findAllMatchForPart(1, 0);
			listMatch.put(operation.name() + "S", matchS);
		}
		else // get match from cache
			matchS = listMatch.get(operation.name() + "S");
		//Target
		if (!listMatch.containsKey(operation.name() + "T")){
			objectList4LHS.clear();
			// if there are no element in source => target would be empty 
			if (matchS.size() == 0)
				matchT = new ArrayList<Map<String,MObject>>();
			else
				findAllMatchForPart(1, 2);
			listMatch.put(operation.name() + "T", matchT);
		}
		else // get match from cache
				matchT = listMatch.get(operation.name() + "T");
		
		// union 3 part to have a parameter
		// Source
		for (Iterator iter1 = matchS.iterator(); iter1.hasNext();) {
			objectList4LHS.putAll((Map<String, MObject>) iter1.next());
			// Target
			for (Iterator iter2 = matchT.iterator(); iter2.hasNext();) {
				objectList4LHS.putAll((Map<String, MObject>) iter2.next());
				if (rule.getCorrRule().getLHS().getObjects().size() > 0){
					matchC.clear();
					findAllMatchForPart(1, 1);
					// Correspondence
					for (Iterator iter3 = matchC.iterator(); iter3.hasNext();) {
						objectList4LHS.putAll((Map<String, MObject>) iter3.next());
						if (!checkExistInPreviousMatch()){
							if (checkPreCondition()){
								// save current match
								Matching tmp = new MatchingEachPart(this);
								result.add(tmp);
							}
						}
					}
				}
				else{
					if (!checkExistInPreviousMatch()){
						if (checkPreCondition()){
							// save current match
							Matching tmp = new MatchingEachPart(this);
							result.add(tmp);
						}
					}
				}
			
			}
		}
		return result;
	}

	@Override
	public List<Matching> findMatchForward() {
		List<Matching> result = new ArrayList<Matching>();
		// Source
		objectList4LHS.clear();
		if (!listMatch.containsKey(operation.name() + "S")){
			findAllMatchForPart(1, 0);
			listMatch.put(operation.name() + "S", matchS);
		}
		else
			matchS = listMatch.get(operation.name() + "S");
		
		// Target
		matchT.clear();
		objectList4LHS.clear();
		findAllMatchForPart(1, 2);
		// union 3 part to have a parameter
		// Source
		for (Iterator iter1 = matchS.iterator(); iter1.hasNext();) {
			Map<String, MObject> fMatchS = (Map<String, MObject>) iter1.next();
			objectList4LHS.putAll(fMatchS);
			// Target
			List objs1 = rule.getTargetRule().getLHS().getObjects();
			if (objs1.size() > 0){
				if (matchT.size() == 0)
					return result;
				for (Iterator iter2 = matchT.iterator(); iter2.hasNext();) {
					Map<String, MObject> fMatchT = (Map<String, MObject>) iter2.next();
					objectList4LHS.putAll(fMatchT);
					// Corr
					List objs = rule.getCorrRule().getLHS().getObjects();
					if (objs.size() > 0){
						matchC.clear();
						findAllMatchForPart(1, 1);
						for (Iterator iter3 = matchC.iterator(); iter3.hasNext();) {
							Map<String, MObject> fMatchC = (Map<String, MObject>) iter3.next();
							objectList4LHS.putAll(fMatchC);
							if (!checkExistInPreviousMatch()){
								if (checkPreCondition()){
									// save current match
									Matching tmp = new MatchingEachPart(this);
									result.add(tmp);
								}
							}
						}
					}
					else{
						if (!checkExistInPreviousMatch()){
							if (checkPreCondition()){
								// save current match
								Matching tmp = new MatchingEachPart(this);
								result.add(tmp);
							}
						}
					}
				}
			}
			else{
				if (!checkExistInPreviousMatch()){
					if (checkPreCondition()){
						// save current match
						Matching tmp = new MatchingEachPart(this);
						result.add(tmp);
					}
				}
			}
		}
		return result;
	}
	
	/**
	 * Find all match for each part
	 */
	private void findAllMatchForPart(int pos, int tuplePos){
		Part[] params = null;
		List<Map<String, MObject>> store = null;
		if (tuplePos == 1){
			params = paramC;
			store = matchC;
		}
		else if (tuplePos == 0){
			params = paramS;
			store = matchS;
		}
		else if (tuplePos == 2){
			params = paramT;
			store = matchT;
		}
		if (params != null){
			Set <MObject> objects;
			if (pos > params.length){
				// save to collection
				Map<String, MObject> temp = new HashMap<String, MObject>();
				for (int i = 0; i < params.length; i++) {
					temp.put(params[i].name(), objectList4LHS.get(params[i].name()));
				}
				if (!store.contains(temp))
					store.add(temp);
			}
			else {
				ModelFactory mf = new ModelFactory();
				MClass cls = mf.createClass(params[pos - 1].type().shortName(), false);
				objects = fSystemState.objectsOfClass(cls);
				Iterator iter = objects.iterator();
				while (iter.hasNext()){
					MObject obj = (MObject)iter.next();
					if (!marks.contains(obj)){
	                	marks.add(obj); // mark object in parameter
	                	objectList4LHS.put(params[pos - 1].name(), obj);
	                	if (hasLinkInPart(tuplePos, pos - 1))
	                		// find value for next position in parameter
	                		findAllMatchForPart(pos + 1, tuplePos);
	                	marks.remove(obj); // release object in parameter
					}
				}
			}
		}
	}
	
	/**
	 * @param listMatch the listMatch to set
	 */
	public static void setListMatch(
			Map<String, List<Map<String, MObject>>> listMatch) {
		MatchingEachPart.listMatch = listMatch;
	}
}
