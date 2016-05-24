/*
 * generated by Xtext 2.9.2
 */
package fr.inria.diverse.models2016.dsl.serializer;

import com.google.inject.Inject;
import fr.inria.diverse.models2016.dsl.services.ProgramGrammarAccess;
import java.util.Set;
import models2016.Clinic;
import models2016.CoffeeBreak;
import models2016.Conference;
import models2016.Day;
import models2016.DoctoralSymposium;
import models2016.EducatorSymposium;
import models2016.Lunch;
import models2016.Meeting;
import models2016.Models2016Package;
import models2016.Panel;
import models2016.Paper;
import models2016.Person;
import models2016.Program;
import models2016.Reception;
import models2016.Room;
import models2016.Session;
import models2016.TalkSession;
import models2016.Tutorial;
import models2016.Workshop;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

@SuppressWarnings("all")
public class ProgramSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ProgramGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == Models2016Package.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case Models2016Package.CLINIC:
				sequence_Clinic(context, (Clinic) semanticObject); 
				return; 
			case Models2016Package.COFFEE_BREAK:
				sequence_CoffeeBreak(context, (CoffeeBreak) semanticObject); 
				return; 
			case Models2016Package.CONFERENCE:
				sequence_Conference(context, (Conference) semanticObject); 
				return; 
			case Models2016Package.DAY:
				sequence_Day(context, (Day) semanticObject); 
				return; 
			case Models2016Package.DOCTORAL_SYMPOSIUM:
				sequence_DoctoralSymposium(context, (DoctoralSymposium) semanticObject); 
				return; 
			case Models2016Package.EDUCATOR_SYMPOSIUM:
				sequence_EducatorSymposium(context, (EducatorSymposium) semanticObject); 
				return; 
			case Models2016Package.LUNCH:
				sequence_Lunch(context, (Lunch) semanticObject); 
				return; 
			case Models2016Package.MEETING:
				sequence_Meeting(context, (Meeting) semanticObject); 
				return; 
			case Models2016Package.PANEL:
				sequence_Panel(context, (Panel) semanticObject); 
				return; 
			case Models2016Package.PAPER:
				sequence_Paper(context, (Paper) semanticObject); 
				return; 
			case Models2016Package.PERSON:
				sequence_Person(context, (Person) semanticObject); 
				return; 
			case Models2016Package.PROGRAM:
				sequence_Program(context, (Program) semanticObject); 
				return; 
			case Models2016Package.RECEPTION:
				sequence_Reception(context, (Reception) semanticObject); 
				return; 
			case Models2016Package.ROOM:
				sequence_Room(context, (Room) semanticObject); 
				return; 
			case Models2016Package.SESSION:
				sequence_Session(context, (Session) semanticObject); 
				return; 
			case Models2016Package.TALK_SESSION:
				sequence_TalkSession(context, (TalkSession) semanticObject); 
				return; 
			case Models2016Package.TUTORIAL:
				sequence_Tutorial(context, (Tutorial) semanticObject); 
				return; 
			case Models2016Package.WORKSHOP:
				sequence_Workshop(context, (Workshop) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Event returns Clinic
	 *     Clinic returns Clinic
	 *
	 * Constraint:
	 *     (name=EString abstract=EString?)
	 */
	protected void sequence_Clinic(ISerializationContext context, Clinic semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Event returns CoffeeBreak
	 *     CoffeeBreak returns CoffeeBreak
	 *
	 * Constraint:
	 *     (name=EString abstract=EString?)
	 */
	protected void sequence_CoffeeBreak(ISerializationContext context, CoffeeBreak semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Conference returns Conference
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         talkDuration=EIntegerObject 
	 *         (resources+=Resource resources+=Resource*)? 
	 *         (papers+=Paper papers+=Paper*)? 
	 *         (events+=Event events+=Event*)? 
	 *         program=Program?
	 *     )
	 */
	protected void sequence_Conference(ISerializationContext context, Conference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Day returns Day
	 *
	 * Constraint:
	 *     (weekday=WeekDay date=DayDataType? (sessions+=Session sessions+=Session*)?)
	 */
	protected void sequence_Day(ISerializationContext context, Day semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Event returns DoctoralSymposium
	 *     DoctoralSymposium returns DoctoralSymposium
	 *
	 * Constraint:
	 *     (name=EString abstract=EString? (organizers+=Person organizers+=Person*)?)
	 */
	protected void sequence_DoctoralSymposium(ISerializationContext context, DoctoralSymposium semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Event returns EducatorSymposium
	 *     EducatorSymposium returns EducatorSymposium
	 *
	 * Constraint:
	 *     (name=EString abstract=EString? (organizers+=Person organizers+=Person*)?)
	 */
	protected void sequence_EducatorSymposium(ISerializationContext context, EducatorSymposium semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Event returns Lunch
	 *     Lunch returns Lunch
	 *
	 * Constraint:
	 *     (name=EString abstract=EString?)
	 */
	protected void sequence_Lunch(ISerializationContext context, Lunch semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Event returns Meeting
	 *     Meeting returns Meeting
	 *
	 * Constraint:
	 *     (name=EString abstract=EString?)
	 */
	protected void sequence_Meeting(ISerializationContext context, Meeting semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Event returns Panel
	 *     Panel returns Panel
	 *
	 * Constraint:
	 *     (name=EString abstract=EString? (panelists+=Person panelists+=Person*)? (moderators+=Person moderators+=Person*)?)
	 */
	protected void sequence_Panel(ISerializationContext context, Panel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Paper returns Paper
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         authors+=Person 
	 *         authors+=Person* 
	 *         abstract=EString? 
	 *         preprint=EString? 
	 *         kind=Track?
	 *     )
	 */
	protected void sequence_Paper(ISerializationContext context, Paper semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Person returns Person
	 *
	 * Constraint:
	 *     (name=EString email=EString? homepage=EString?)
	 */
	protected void sequence_Person(ISerializationContext context, Person semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Program returns Program
	 *
	 * Constraint:
	 *     (days+=Day days+=Day*)?
	 */
	protected void sequence_Program(ISerializationContext context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Event returns Reception
	 *     Reception returns Reception
	 *
	 * Constraint:
	 *     (name=EString abstract=EString?)
	 */
	protected void sequence_Reception(ISerializationContext context, Reception semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Resource returns Room
	 *     Room returns Room
	 *
	 * Constraint:
	 *     (name=EString capacity=EIntegerObject?)
	 */
	protected void sequence_Room(ISerializationContext context, Room semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Session returns Session
	 *
	 * Constraint:
	 *     (startingTime=HourDataType endingTime=HourDataType room=[Room|EString] events+=[Event|EString] events+=[Event|EString]*)
	 */
	protected void sequence_Session(ISerializationContext context, Session semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Event returns TalkSession
	 *     TalkSession returns TalkSession
	 *
	 * Constraint:
	 *     (name=EString chair=Person? abstract=EString? (papers+=[Paper|EString] papers+=[Paper|EString]*)?)
	 */
	protected void sequence_TalkSession(ISerializationContext context, TalkSession semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Event returns Tutorial
	 *     Tutorial returns Tutorial
	 *
	 * Constraint:
	 *     (name=EString abstract=EString? id=EString? (organizers+=Person organizers+=Person*)?)
	 */
	protected void sequence_Tutorial(ISerializationContext context, Tutorial semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Event returns Workshop
	 *     Workshop returns Workshop
	 *
	 * Constraint:
	 *     (name=EString abstract=EString? url=EString? id=EString? (organizers+=Person organizers+=Person*)?)
	 */
	protected void sequence_Workshop(ISerializationContext context, Workshop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
