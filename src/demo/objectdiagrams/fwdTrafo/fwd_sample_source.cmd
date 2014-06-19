-----------------------------------------------------------------------------
--open uml2csp.use
!create rc: RuleCollection 
-------------------------------------------------------Example ActivityDiagrma
!create start:InitialNode

!create s1:ActivityEdge
!create s2:ActivityEdge
!create s1Action:Action
!set s1.name:='S1'
!set s2.name:='S2'
!set s1Action.name := 'serverReceiveAlert'
!insert (s1,start) into ConnectsFrom
!insert (s1,s1Action) into ConnectsTo
!insert (s2,s1Action) into ConnectsFrom
--create action getDriverPhoneData
!create s2Action:Action
!set s2Action.name := 'getDriverPhoneData'
!create s3:ActivityEdge
!set s3.name := 'S3'
!insert (s2,s2Action) into ConnectsTo
!insert (s3,s2Action) into ConnectsFrom
--create action callDriver
!create s3Action:Action
!set s3Action.name := 'callDriver'
!create s4:ActivityEdge
!set s4.name := 'S4'
!insert (s3,s3Action) into ConnectsTo
!insert (s4,s3Action) into ConnectsFrom
-- create decision node
!create s4Decision:DecisionNode
!create m1:ActivityEdge
!create d1a:ActivityEdge
!create d2:ActivityEdge
!set m1.name := 'M1'
!set m1.guard := 'noHelp'
!set d1a.name := 'D1a'
!set d1a.guard := 'else'
!set d2.name := 'D2'
!set d2.guard := 'askHelp'
!insert (s4,s4Decision) into ConnectsTo
!insert (d2,s4Decision) into ConnectsFrom
!insert (d1a,s4Decision) into ConnectsFrom
!insert (m1,s4Decision) into ConnectsFrom
--create mergeNode
!create d2MergeNode:MergeNode
!create d1b:ActivityEdge
!create dm:ActivityEdge
!set d1b.name := 'D1b'
!set dm.name := 'DM'
!insert (d2, d2MergeNode) into ConnectsTo
!insert (d1b,d2MergeNode) into ConnectsTo
!insert (dm,d2MergeNode) into ConnectsFrom
--create d1aAction
!create d1aAction:Action
!set d1aAction.name := 'accessDescription'
!insert (d1a,d1aAction) into ConnectsTo
!insert (d1b,d1aAction) into ConnectsFrom
--create m1MergeNode
!create m1MergeNode:MergeNode
!create m2:ActivityEdge
!create c1:ActivityEdge
!set c1.name := 'C1'
!set m2.name := 'M2'
!set m2.guard := 'else'
!insert (m1,m1MergeNode) into ConnectsTo
!insert (m2,m1MergeNode) into ConnectsTo
!insert (c1,m1MergeNode) into ConnectsFrom
--create c1Action
!create c1Action:Action
!create c2:ActivityEdge
!set c1Action.name := 'cancelAlert'
!set c2.name := 'C2'
!insert (c1, c1Action) into ConnectsTo
!insert (c2, c1Action) into ConnectsFrom
--create finalNode
!create c2FinalNode:FinalNode
!insert (c2, c2FinalNode) into ConnectsTo
--create dmDecision
!create dmDecision:DecisionNode
!create d3:ActivityEdge
!set d3.name := 'D3'
!set d3.guard := 'real'
!insert (dm, dmDecision) into ConnectsTo
!insert (d3, dmDecision) into ConnectsFrom
!insert (m2, dmDecision) into ConnectsFrom
-------------------------------------------------------Example CSP Model
!create process1:Process
!set process1.name:='S1'
-------------------------------------------------------Corr
!create ae2p0:AE2P
!insert (ae2p0,process1) into R_Process_AE2P
!insert (ae2p0,s1) into L_ActivityEdge_AE2P