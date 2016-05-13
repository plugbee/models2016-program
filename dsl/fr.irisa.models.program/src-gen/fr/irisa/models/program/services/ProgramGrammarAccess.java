/*
 * generated by Xtext
 */
package fr.irisa.models.program.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class ProgramGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ProgramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Program");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Keyword cRoomsKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cRoomsAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cRoomsRoomParserRuleCall_0_1_0 = (RuleCall)cRoomsAssignment_0_1.eContents().get(0);
		private final Assignment cRoomsAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cRoomsRoomParserRuleCall_0_2_0 = (RuleCall)cRoomsAssignment_0_2.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cDaysKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cDaysAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cDaysDayParserRuleCall_1_1_0 = (RuleCall)cDaysAssignment_1_1.eContents().get(0);
		private final Assignment cDaysAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cDaysDayParserRuleCall_1_2_0 = (RuleCall)cDaysAssignment_1_2.eContents().get(0);
		
		//Program:
		//	("Rooms" rooms+=Room rooms+=Room*)? ("Days" days+=Day days+=Day*)?;
		@Override public ParserRule getRule() { return rule; }

		//("Rooms" rooms+=Room rooms+=Room*)? ("Days" days+=Day days+=Day*)?
		public Group getGroup() { return cGroup; }

		//("Rooms" rooms+=Room rooms+=Room*)?
		public Group getGroup_0() { return cGroup_0; }

		//"Rooms"
		public Keyword getRoomsKeyword_0_0() { return cRoomsKeyword_0_0; }

		//rooms+=Room
		public Assignment getRoomsAssignment_0_1() { return cRoomsAssignment_0_1; }

		//Room
		public RuleCall getRoomsRoomParserRuleCall_0_1_0() { return cRoomsRoomParserRuleCall_0_1_0; }

		//rooms+=Room*
		public Assignment getRoomsAssignment_0_2() { return cRoomsAssignment_0_2; }

		//Room
		public RuleCall getRoomsRoomParserRuleCall_0_2_0() { return cRoomsRoomParserRuleCall_0_2_0; }

		//("Days" days+=Day days+=Day*)?
		public Group getGroup_1() { return cGroup_1; }

		//"Days"
		public Keyword getDaysKeyword_1_0() { return cDaysKeyword_1_0; }

		//days+=Day
		public Assignment getDaysAssignment_1_1() { return cDaysAssignment_1_1; }

		//Day
		public RuleCall getDaysDayParserRuleCall_1_1_0() { return cDaysDayParserRuleCall_1_1_0; }

		//days+=Day*
		public Assignment getDaysAssignment_1_2() { return cDaysAssignment_1_2; }

		//Day
		public RuleCall getDaysDayParserRuleCall_1_2_0() { return cDaysDayParserRuleCall_1_2_0; }
	}

	public class RoomElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Room");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Room:
		//	name=STRING;
		@Override public ParserRule getRule() { return rule; }

		//name=STRING
		public Assignment getNameAssignment() { return cNameAssignment; }

		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_0() { return cNameSTRINGTerminalRuleCall_0; }
	}

	public class DayElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Day");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cSessionsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cSessionsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cSessionsSessionParserRuleCall_3_1_0 = (RuleCall)cSessionsAssignment_3_1.eContents().get(0);
		private final Assignment cSessionsAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cSessionsSessionParserRuleCall_3_2_0 = (RuleCall)cSessionsAssignment_3_2.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Day:
		//	"[" "name" name=STRING ("Sessions" sessions+=Session sessions+=Session*)? "]";
		@Override public ParserRule getRule() { return rule; }

		//"[" "name" name=STRING ("Sessions" sessions+=Session sessions+=Session*)? "]"
		public Group getGroup() { return cGroup; }

		//"["
		public Keyword getLeftSquareBracketKeyword_0() { return cLeftSquareBracketKeyword_0; }

		//"name"
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }

		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }

		//("Sessions" sessions+=Session sessions+=Session*)?
		public Group getGroup_3() { return cGroup_3; }

		//"Sessions"
		public Keyword getSessionsKeyword_3_0() { return cSessionsKeyword_3_0; }

		//sessions+=Session
		public Assignment getSessionsAssignment_3_1() { return cSessionsAssignment_3_1; }

		//Session
		public RuleCall getSessionsSessionParserRuleCall_3_1_0() { return cSessionsSessionParserRuleCall_3_1_0; }

		//sessions+=Session*
		public Assignment getSessionsAssignment_3_2() { return cSessionsAssignment_3_2; }

		//Session
		public RuleCall getSessionsSessionParserRuleCall_3_2_0() { return cSessionsSessionParserRuleCall_3_2_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_4() { return cRightSquareBracketKeyword_4; }
	}

	public class SessionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Session");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cStartKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cStartAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cStartSTRINGTerminalRuleCall_4_0 = (RuleCall)cStartAssignment_4.eContents().get(0);
		private final Keyword cEndKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cEndAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cEndSTRINGTerminalRuleCall_6_0 = (RuleCall)cEndAssignment_6.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cTalksKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cTalksAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cTalksTalkParserRuleCall_7_1_0 = (RuleCall)cTalksAssignment_7_1.eContents().get(0);
		private final Assignment cTalksAssignment_7_2 = (Assignment)cGroup_7.eContents().get(2);
		private final RuleCall cTalksTalkParserRuleCall_7_2_0 = (RuleCall)cTalksAssignment_7_2.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//Session:
		//	"[" "name" name=STRING "start" start=STRING "end" end=STRING ("Talks" talks+=Talk talks+=Talk*)? "]";
		@Override public ParserRule getRule() { return rule; }

		//"[" "name" name=STRING "start" start=STRING "end" end=STRING ("Talks" talks+=Talk talks+=Talk*)? "]"
		public Group getGroup() { return cGroup; }

		//"["
		public Keyword getLeftSquareBracketKeyword_0() { return cLeftSquareBracketKeyword_0; }

		//"name"
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }

		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }

		//"start"
		public Keyword getStartKeyword_3() { return cStartKeyword_3; }

		//start=STRING
		public Assignment getStartAssignment_4() { return cStartAssignment_4; }

		//STRING
		public RuleCall getStartSTRINGTerminalRuleCall_4_0() { return cStartSTRINGTerminalRuleCall_4_0; }

		//"end"
		public Keyword getEndKeyword_5() { return cEndKeyword_5; }

		//end=STRING
		public Assignment getEndAssignment_6() { return cEndAssignment_6; }

		//STRING
		public RuleCall getEndSTRINGTerminalRuleCall_6_0() { return cEndSTRINGTerminalRuleCall_6_0; }

		//("Talks" talks+=Talk talks+=Talk*)?
		public Group getGroup_7() { return cGroup_7; }

		//"Talks"
		public Keyword getTalksKeyword_7_0() { return cTalksKeyword_7_0; }

		//talks+=Talk
		public Assignment getTalksAssignment_7_1() { return cTalksAssignment_7_1; }

		//Talk
		public RuleCall getTalksTalkParserRuleCall_7_1_0() { return cTalksTalkParserRuleCall_7_1_0; }

		//talks+=Talk*
		public Assignment getTalksAssignment_7_2() { return cTalksAssignment_7_2; }

		//Talk
		public RuleCall getTalksTalkParserRuleCall_7_2_0() { return cTalksTalkParserRuleCall_7_2_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_8() { return cRightSquareBracketKeyword_8; }
	}

	public class TalkElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Talk");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cTitleKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTilteAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTilteSTRINGTerminalRuleCall_2_0 = (RuleCall)cTilteAssignment_2.eContents().get(0);
		private final Keyword cRoomKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cRoomAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cRoomSTRINGTerminalRuleCall_4_0 = (RuleCall)cRoomAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cSpeakersKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cSpeakersAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cSpeakersSTRINGTerminalRuleCall_5_1_0 = (RuleCall)cSpeakersAssignment_5_1.eContents().get(0);
		private final Group cGroup_5_2 = (Group)cGroup_5.eContents().get(2);
		private final Keyword cCommaKeyword_5_2_0 = (Keyword)cGroup_5_2.eContents().get(0);
		private final Assignment cSpeakersAssignment_5_2_1 = (Assignment)cGroup_5_2.eContents().get(1);
		private final RuleCall cSpeakersSTRINGTerminalRuleCall_5_2_1_0 = (RuleCall)cSpeakersAssignment_5_2_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Talk:
		//	"[" "title" tilte=STRING "room" room=STRING ("speakers" speakers+=STRING ("," speakers+=STRING)*)? "]";
		@Override public ParserRule getRule() { return rule; }

		//"[" "title" tilte=STRING "room" room=STRING ("speakers" speakers+=STRING ("," speakers+=STRING)*)? "]"
		public Group getGroup() { return cGroup; }

		//"["
		public Keyword getLeftSquareBracketKeyword_0() { return cLeftSquareBracketKeyword_0; }

		//"title"
		public Keyword getTitleKeyword_1() { return cTitleKeyword_1; }

		//tilte=STRING
		public Assignment getTilteAssignment_2() { return cTilteAssignment_2; }

		//STRING
		public RuleCall getTilteSTRINGTerminalRuleCall_2_0() { return cTilteSTRINGTerminalRuleCall_2_0; }

		//"room"
		public Keyword getRoomKeyword_3() { return cRoomKeyword_3; }

		//room=STRING
		public Assignment getRoomAssignment_4() { return cRoomAssignment_4; }

		//STRING
		public RuleCall getRoomSTRINGTerminalRuleCall_4_0() { return cRoomSTRINGTerminalRuleCall_4_0; }

		//("speakers" speakers+=STRING ("," speakers+=STRING)*)?
		public Group getGroup_5() { return cGroup_5; }

		//"speakers"
		public Keyword getSpeakersKeyword_5_0() { return cSpeakersKeyword_5_0; }

		//speakers+=STRING
		public Assignment getSpeakersAssignment_5_1() { return cSpeakersAssignment_5_1; }

		//STRING
		public RuleCall getSpeakersSTRINGTerminalRuleCall_5_1_0() { return cSpeakersSTRINGTerminalRuleCall_5_1_0; }

		//("," speakers+=STRING)*
		public Group getGroup_5_2() { return cGroup_5_2; }

		//","
		public Keyword getCommaKeyword_5_2_0() { return cCommaKeyword_5_2_0; }

		//speakers+=STRING
		public Assignment getSpeakersAssignment_5_2_1() { return cSpeakersAssignment_5_2_1; }

		//STRING
		public RuleCall getSpeakersSTRINGTerminalRuleCall_5_2_1_0() { return cSpeakersSTRINGTerminalRuleCall_5_2_1_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_6() { return cRightSquareBracketKeyword_6; }
	}
	
	
	private final ProgramElements pProgram;
	private final RoomElements pRoom;
	private final DayElements pDay;
	private final SessionElements pSession;
	private final TalkElements pTalk;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ProgramGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pProgram = new ProgramElements();
		this.pRoom = new RoomElements();
		this.pDay = new DayElements();
		this.pSession = new SessionElements();
		this.pTalk = new TalkElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.irisa.models.program.Program".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Program:
	//	("Rooms" rooms+=Room rooms+=Room*)? ("Days" days+=Day days+=Day*)?;
	public ProgramElements getProgramAccess() {
		return pProgram;
	}
	
	public ParserRule getProgramRule() {
		return getProgramAccess().getRule();
	}

	//Room:
	//	name=STRING;
	public RoomElements getRoomAccess() {
		return pRoom;
	}
	
	public ParserRule getRoomRule() {
		return getRoomAccess().getRule();
	}

	//Day:
	//	"[" "name" name=STRING ("Sessions" sessions+=Session sessions+=Session*)? "]";
	public DayElements getDayAccess() {
		return pDay;
	}
	
	public ParserRule getDayRule() {
		return getDayAccess().getRule();
	}

	//Session:
	//	"[" "name" name=STRING "start" start=STRING "end" end=STRING ("Talks" talks+=Talk talks+=Talk*)? "]";
	public SessionElements getSessionAccess() {
		return pSession;
	}
	
	public ParserRule getSessionRule() {
		return getSessionAccess().getRule();
	}

	//Talk:
	//	"[" "title" tilte=STRING "room" room=STRING ("speakers" speakers+=STRING ("," speakers+=STRING)*)? "]";
	public TalkElements getTalkAccess() {
		return pTalk;
	}
	
	public ParserRule getTalkRule() {
		return getTalkAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}