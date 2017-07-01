package fr.inria.aoste.timmo2use.tadl2.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.inria.aoste.timmo2use.tadl2.services.Tadl2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalTadl2Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TimingSpecification'", "'{'", "'}'", "'import'", "'as'", "';'", "'Event'", "','", "'EventChain'", "'stimulus'", "'response'", "'eventChains'", "'DelayConstraint'", "'source'", "'target'", "'lower'", "'='", "'upper'", "'RepetitionConstraint'", "'event'", "'span'", "'jitter'", "'SynchronizationConstraint'", "'events'", "'tolerance'", "'OrderConstraint'", "'left'", "'right'", "'PatternConstraint'", "'ref'", "'minimum'", "'offset'", "'SporadicConstraint'", "'PeriodicConstraint'", "'period'", "'ArbitraryConstraint'", "'maximum'", "'BurstConstraint'", "'maxOccurrence'", "'length'", "'ReactionConstraint'", "'scope'", "'AgeConstraint'", "'('", "'+'", "')'", "'var'", "'on'", "':='", "'-'", "'*'", "'/'", "'>'", "'<'", "'=>'", "'<='", "'TimeBase'", "'dimension'", "'precisionFactor'", "'precisionUnit'", "'factor'", "'reference'", "'Dimension'", "'kind'", "'Units'", "'TimeBaseRelation'", "'.'", "'E'", "'e'", "'other'", "'Time'", "'Angle'", "'Distance'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=6;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__81=81;
    public static final int T__47=47;
    public static final int T__82=82;
    public static final int T__44=44;
    public static final int T__83=83;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalTadl2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTadl2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTadl2Parser.tokenNames; }
    public String getGrammarFileName() { return "../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private Tadl2GrammarAccess grammarAccess;
     	
        public InternalTadl2Parser(TokenStream input, Tadl2GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "TimingExpressionSpecification";	
       	}
       	
       	@Override
       	protected Tadl2GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleTimingExpressionSpecification"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:74:1: entryRuleTimingExpressionSpecification returns [EObject current=null] : iv_ruleTimingExpressionSpecification= ruleTimingExpressionSpecification EOF ;
    public final EObject entryRuleTimingExpressionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimingExpressionSpecification = null;


        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:75:2: (iv_ruleTimingExpressionSpecification= ruleTimingExpressionSpecification EOF )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:76:2: iv_ruleTimingExpressionSpecification= ruleTimingExpressionSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimingExpressionSpecificationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTimingExpressionSpecification_in_entryRuleTimingExpressionSpecification81);
            iv_ruleTimingExpressionSpecification=ruleTimingExpressionSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimingExpressionSpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTimingExpressionSpecification91); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimingExpressionSpecification"


    // $ANTLR start "ruleTimingExpressionSpecification"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:83:1: ruleTimingExpressionSpecification returns [EObject current=null] : (otherlv_0= 'TimingSpecification' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (otherlv_3= '{' ( (lv_timingExpressions_4_0= ruleSymbolicTimingExpression ) ) otherlv_5= '}' ) | ( (lv_importStatements_6_0= ruleImportStatement ) ) | ( (lv_events_7_0= ruleEvent ) ) | ( (lv_eventChains_8_0= ruleEventChain ) ) | ( (lv_constraints_9_0= ruleTimingConstraint ) ) | ( (lv_timingExpressions_10_0= ruleVariableTimingExpression ) ) | ( (lv_timeBases_11_0= ruleTimeBase ) ) | ( (lv_dimensions_12_0= ruleDimension ) ) | ( (lv_timeBaseRelations_13_0= ruleTimeBaseRelation ) ) )+ otherlv_14= '}' ) ;
    public final EObject ruleTimingExpressionSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_timingExpressions_4_0 = null;

        EObject lv_importStatements_6_0 = null;

        EObject lv_events_7_0 = null;

        EObject lv_eventChains_8_0 = null;

        EObject lv_constraints_9_0 = null;

        EObject lv_timingExpressions_10_0 = null;

        EObject lv_timeBases_11_0 = null;

        EObject lv_dimensions_12_0 = null;

        EObject lv_timeBaseRelations_13_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:86:28: ( (otherlv_0= 'TimingSpecification' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (otherlv_3= '{' ( (lv_timingExpressions_4_0= ruleSymbolicTimingExpression ) ) otherlv_5= '}' ) | ( (lv_importStatements_6_0= ruleImportStatement ) ) | ( (lv_events_7_0= ruleEvent ) ) | ( (lv_eventChains_8_0= ruleEventChain ) ) | ( (lv_constraints_9_0= ruleTimingConstraint ) ) | ( (lv_timingExpressions_10_0= ruleVariableTimingExpression ) ) | ( (lv_timeBases_11_0= ruleTimeBase ) ) | ( (lv_dimensions_12_0= ruleDimension ) ) | ( (lv_timeBaseRelations_13_0= ruleTimeBaseRelation ) ) )+ otherlv_14= '}' ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:87:1: (otherlv_0= 'TimingSpecification' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (otherlv_3= '{' ( (lv_timingExpressions_4_0= ruleSymbolicTimingExpression ) ) otherlv_5= '}' ) | ( (lv_importStatements_6_0= ruleImportStatement ) ) | ( (lv_events_7_0= ruleEvent ) ) | ( (lv_eventChains_8_0= ruleEventChain ) ) | ( (lv_constraints_9_0= ruleTimingConstraint ) ) | ( (lv_timingExpressions_10_0= ruleVariableTimingExpression ) ) | ( (lv_timeBases_11_0= ruleTimeBase ) ) | ( (lv_dimensions_12_0= ruleDimension ) ) | ( (lv_timeBaseRelations_13_0= ruleTimeBaseRelation ) ) )+ otherlv_14= '}' )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:87:1: (otherlv_0= 'TimingSpecification' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (otherlv_3= '{' ( (lv_timingExpressions_4_0= ruleSymbolicTimingExpression ) ) otherlv_5= '}' ) | ( (lv_importStatements_6_0= ruleImportStatement ) ) | ( (lv_events_7_0= ruleEvent ) ) | ( (lv_eventChains_8_0= ruleEventChain ) ) | ( (lv_constraints_9_0= ruleTimingConstraint ) ) | ( (lv_timingExpressions_10_0= ruleVariableTimingExpression ) ) | ( (lv_timeBases_11_0= ruleTimeBase ) ) | ( (lv_dimensions_12_0= ruleDimension ) ) | ( (lv_timeBaseRelations_13_0= ruleTimeBaseRelation ) ) )+ otherlv_14= '}' )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:87:3: otherlv_0= 'TimingSpecification' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (otherlv_3= '{' ( (lv_timingExpressions_4_0= ruleSymbolicTimingExpression ) ) otherlv_5= '}' ) | ( (lv_importStatements_6_0= ruleImportStatement ) ) | ( (lv_events_7_0= ruleEvent ) ) | ( (lv_eventChains_8_0= ruleEventChain ) ) | ( (lv_constraints_9_0= ruleTimingConstraint ) ) | ( (lv_timingExpressions_10_0= ruleVariableTimingExpression ) ) | ( (lv_timeBases_11_0= ruleTimeBase ) ) | ( (lv_dimensions_12_0= ruleDimension ) ) | ( (lv_timeBaseRelations_13_0= ruleTimeBaseRelation ) ) )+ otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleTimingExpressionSpecification128); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTimingExpressionSpecificationAccess().getTimingSpecificationKeyword_0());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:91:1: ( (lv_name_1_0= ruleEString ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:92:1: (lv_name_1_0= ruleEString )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:92:1: (lv_name_1_0= ruleEString )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:93:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimingExpressionSpecificationAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTimingExpressionSpecification149);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTimingExpressionSpecificationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTimingExpressionSpecification161); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTimingExpressionSpecificationAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:113:1: ( (otherlv_3= '{' ( (lv_timingExpressions_4_0= ruleSymbolicTimingExpression ) ) otherlv_5= '}' ) | ( (lv_importStatements_6_0= ruleImportStatement ) ) | ( (lv_events_7_0= ruleEvent ) ) | ( (lv_eventChains_8_0= ruleEventChain ) ) | ( (lv_constraints_9_0= ruleTimingConstraint ) ) | ( (lv_timingExpressions_10_0= ruleVariableTimingExpression ) ) | ( (lv_timeBases_11_0= ruleTimeBase ) ) | ( (lv_dimensions_12_0= ruleDimension ) ) | ( (lv_timeBaseRelations_13_0= ruleTimeBaseRelation ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=10;
                switch ( input.LA(1) ) {
                case 12:
                    {
                    alt1=1;
                    }
                    break;
                case 14:
                    {
                    alt1=2;
                    }
                    break;
                case 17:
                    {
                    alt1=3;
                    }
                    break;
                case 19:
                    {
                    alt1=4;
                    }
                    break;
                case RULE_INT:
                case 23:
                case 29:
                case 33:
                case 36:
                case 39:
                case 43:
                case 44:
                case 46:
                case 48:
                case 51:
                case 53:
                case 54:
                case 60:
                case 77:
                    {
                    alt1=5;
                    }
                    break;
                case 57:
                    {
                    alt1=6;
                    }
                    break;
                case 67:
                    {
                    alt1=7;
                    }
                    break;
                case 73:
                    {
                    alt1=8;
                    }
                    break;
                case 76:
                    {
                    alt1=9;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:113:2: (otherlv_3= '{' ( (lv_timingExpressions_4_0= ruleSymbolicTimingExpression ) ) otherlv_5= '}' )
            	    {
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:113:2: (otherlv_3= '{' ( (lv_timingExpressions_4_0= ruleSymbolicTimingExpression ) ) otherlv_5= '}' )
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:113:4: otherlv_3= '{' ( (lv_timingExpressions_4_0= ruleSymbolicTimingExpression ) ) otherlv_5= '}'
            	    {
            	    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTimingExpressionSpecification175); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getTimingExpressionSpecificationAccess().getLeftCurlyBracketKeyword_3_0_0());
            	          
            	    }
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:117:1: ( (lv_timingExpressions_4_0= ruleSymbolicTimingExpression ) )
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:118:1: (lv_timingExpressions_4_0= ruleSymbolicTimingExpression )
            	    {
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:118:1: (lv_timingExpressions_4_0= ruleSymbolicTimingExpression )
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:119:3: lv_timingExpressions_4_0= ruleSymbolicTimingExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTimingExpressionSpecificationAccess().getTimingExpressionsSymbolicTimingExpressionParserRuleCall_3_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSymbolicTimingExpression_in_ruleTimingExpressionSpecification196);
            	    lv_timingExpressions_4_0=ruleSymbolicTimingExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTimingExpressionSpecificationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"timingExpressions",
            	              		lv_timingExpressions_4_0, 
            	              		"SymbolicTimingExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTimingExpressionSpecification208); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getTimingExpressionSpecificationAccess().getRightCurlyBracketKeyword_3_0_2());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:140:6: ( (lv_importStatements_6_0= ruleImportStatement ) )
            	    {
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:140:6: ( (lv_importStatements_6_0= ruleImportStatement ) )
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:141:1: (lv_importStatements_6_0= ruleImportStatement )
            	    {
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:141:1: (lv_importStatements_6_0= ruleImportStatement )
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:142:3: lv_importStatements_6_0= ruleImportStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTimingExpressionSpecificationAccess().getImportStatementsImportStatementParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleImportStatement_in_ruleTimingExpressionSpecification236);
            	    lv_importStatements_6_0=ruleImportStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTimingExpressionSpecificationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"importStatements",
            	              		lv_importStatements_6_0, 
            	              		"ImportStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:159:6: ( (lv_events_7_0= ruleEvent ) )
            	    {
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:159:6: ( (lv_events_7_0= ruleEvent ) )
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:160:1: (lv_events_7_0= ruleEvent )
            	    {
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:160:1: (lv_events_7_0= ruleEvent )
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:161:3: lv_events_7_0= ruleEvent
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTimingExpressionSpecificationAccess().getEventsEventParserRuleCall_3_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleEvent_in_ruleTimingExpressionSpecification263);
            	    lv_events_7_0=ruleEvent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTimingExpressionSpecificationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"events",
            	              		lv_events_7_0, 
            	              		"Event");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:178:6: ( (lv_eventChains_8_0= ruleEventChain ) )
            	    {
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:178:6: ( (lv_eventChains_8_0= ruleEventChain ) )
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:179:1: (lv_eventChains_8_0= ruleEventChain )
            	    {
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:179:1: (lv_eventChains_8_0= ruleEventChain )
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:180:3: lv_eventChains_8_0= ruleEventChain
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTimingExpressionSpecificationAccess().getEventChainsEventChainParserRuleCall_3_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleEventChain_in_ruleTimingExpressionSpecification290);
            	    lv_eventChains_8_0=ruleEventChain();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTimingExpressionSpecificationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"eventChains",
            	              		lv_eventChains_8_0, 
            	              		"EventChain");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:197:6: ( (lv_constraints_9_0= ruleTimingConstraint ) )
            	    {
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:197:6: ( (lv_constraints_9_0= ruleTimingConstraint ) )
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:198:1: (lv_constraints_9_0= ruleTimingConstraint )
            	    {
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:198:1: (lv_constraints_9_0= ruleTimingConstraint )
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:199:3: lv_constraints_9_0= ruleTimingConstraint
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTimingExpressionSpecificationAccess().getConstraintsTimingConstraintParserRuleCall_3_4_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTimingConstraint_in_ruleTimingExpressionSpecification317);
            	    lv_constraints_9_0=ruleTimingConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTimingExpressionSpecificationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"constraints",
            	              		lv_constraints_9_0, 
            	              		"TimingConstraint");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:216:6: ( (lv_timingExpressions_10_0= ruleVariableTimingExpression ) )
            	    {
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:216:6: ( (lv_timingExpressions_10_0= ruleVariableTimingExpression ) )
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:217:1: (lv_timingExpressions_10_0= ruleVariableTimingExpression )
            	    {
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:217:1: (lv_timingExpressions_10_0= ruleVariableTimingExpression )
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:218:3: lv_timingExpressions_10_0= ruleVariableTimingExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTimingExpressionSpecificationAccess().getTimingExpressionsVariableTimingExpressionParserRuleCall_3_5_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleVariableTimingExpression_in_ruleTimingExpressionSpecification344);
            	    lv_timingExpressions_10_0=ruleVariableTimingExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTimingExpressionSpecificationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"timingExpressions",
            	              		lv_timingExpressions_10_0, 
            	              		"VariableTimingExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:235:6: ( (lv_timeBases_11_0= ruleTimeBase ) )
            	    {
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:235:6: ( (lv_timeBases_11_0= ruleTimeBase ) )
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:236:1: (lv_timeBases_11_0= ruleTimeBase )
            	    {
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:236:1: (lv_timeBases_11_0= ruleTimeBase )
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:237:3: lv_timeBases_11_0= ruleTimeBase
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTimingExpressionSpecificationAccess().getTimeBasesTimeBaseParserRuleCall_3_6_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTimeBase_in_ruleTimingExpressionSpecification371);
            	    lv_timeBases_11_0=ruleTimeBase();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTimingExpressionSpecificationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"timeBases",
            	              		lv_timeBases_11_0, 
            	              		"TimeBase");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:254:6: ( (lv_dimensions_12_0= ruleDimension ) )
            	    {
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:254:6: ( (lv_dimensions_12_0= ruleDimension ) )
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:255:1: (lv_dimensions_12_0= ruleDimension )
            	    {
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:255:1: (lv_dimensions_12_0= ruleDimension )
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:256:3: lv_dimensions_12_0= ruleDimension
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTimingExpressionSpecificationAccess().getDimensionsDimensionParserRuleCall_3_7_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleDimension_in_ruleTimingExpressionSpecification398);
            	    lv_dimensions_12_0=ruleDimension();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTimingExpressionSpecificationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"dimensions",
            	              		lv_dimensions_12_0, 
            	              		"Dimension");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:273:6: ( (lv_timeBaseRelations_13_0= ruleTimeBaseRelation ) )
            	    {
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:273:6: ( (lv_timeBaseRelations_13_0= ruleTimeBaseRelation ) )
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:274:1: (lv_timeBaseRelations_13_0= ruleTimeBaseRelation )
            	    {
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:274:1: (lv_timeBaseRelations_13_0= ruleTimeBaseRelation )
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:275:3: lv_timeBaseRelations_13_0= ruleTimeBaseRelation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTimingExpressionSpecificationAccess().getTimeBaseRelationsTimeBaseRelationParserRuleCall_3_8_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTimeBaseRelation_in_ruleTimingExpressionSpecification425);
            	    lv_timeBaseRelations_13_0=ruleTimeBaseRelation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTimingExpressionSpecificationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"timeBaseRelations",
            	              		lv_timeBaseRelations_13_0, 
            	              		"TimeBaseRelation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_14=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTimingExpressionSpecification439); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getTimingExpressionSpecificationAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimingExpressionSpecification"


    // $ANTLR start "entryRuleImportStatement"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:303:1: entryRuleImportStatement returns [EObject current=null] : iv_ruleImportStatement= ruleImportStatement EOF ;
    public final EObject entryRuleImportStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportStatement = null;


        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:304:2: (iv_ruleImportStatement= ruleImportStatement EOF )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:305:2: iv_ruleImportStatement= ruleImportStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportStatementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleImportStatement_in_entryRuleImportStatement475);
            iv_ruleImportStatement=ruleImportStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportStatement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImportStatement485); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportStatement"


    // $ANTLR start "ruleImportStatement"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:312:1: ruleImportStatement returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_STRING ) ) otherlv_4= ';' ) ;
    public final EObject ruleImportStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;
        Token lv_alias_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:315:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_STRING ) ) otherlv_4= ';' ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:316:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_STRING ) ) otherlv_4= ';' )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:316:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_STRING ) ) otherlv_4= ';' )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:316:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_STRING ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleImportStatement522); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportStatementAccess().getImportKeyword_0());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:320:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:321:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:321:1: (lv_importURI_1_0= RULE_STRING )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:322:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleImportStatement539); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_importURI_1_0, grammarAccess.getImportStatementAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getImportStatementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"importURI",
                      		lv_importURI_1_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleImportStatement556); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getImportStatementAccess().getAsKeyword_2());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:342:1: ( (lv_alias_3_0= RULE_STRING ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:343:1: (lv_alias_3_0= RULE_STRING )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:343:1: (lv_alias_3_0= RULE_STRING )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:344:3: lv_alias_3_0= RULE_STRING
            {
            lv_alias_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleImportStatement573); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_alias_3_0, grammarAccess.getImportStatementAccess().getAliasSTRINGTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getImportStatementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"alias",
                      		lv_alias_3_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleImportStatement590); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getImportStatementAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportStatement"


    // $ANTLR start "entryRuleEvent"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:372:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:373:2: (iv_ruleEvent= ruleEvent EOF )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:374:2: iv_ruleEvent= ruleEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEvent_in_entryRuleEvent626);
            iv_ruleEvent=ruleEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEvent; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEvent636); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:381:1: ruleEvent returns [EObject current=null] : (otherlv_0= 'Event' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( ruleEString ) )? (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:384:28: ( (otherlv_0= 'Event' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( ruleEString ) )? (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= '}' ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:385:1: (otherlv_0= 'Event' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( ruleEString ) )? (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= '}' )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:385:1: (otherlv_0= 'Event' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( ruleEString ) )? (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= '}' )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:385:3: otherlv_0= 'Event' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( ruleEString ) )? (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEvent673); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:389:1: ( (lv_name_1_0= ruleEString ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:390:1: (lv_name_1_0= ruleEString )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:390:1: (lv_name_1_0= ruleEString )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:391:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEvent694);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEventRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEvent706); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:411:1: ( ( ruleEString ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING||LA2_0==RULE_ID) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:412:1: ( ruleEString )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:412:1: ( ruleEString )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:413:3: ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEventRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventAccess().getTriggerableElementsEObjectCrossReference_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEvent733);
                    ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:429:3: (otherlv_4= ',' ( ( ruleEString ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:429:5: otherlv_4= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEvent747); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getEventAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:433:1: ( ( ruleEString ) )
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:434:1: ( ruleEString )
            	    {
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:434:1: ( ruleEString )
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:435:3: ruleEString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getEventRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEventAccess().getTriggerableElementsEObjectCrossReference_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEvent774);
            	    ruleEString();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEvent788); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleEventChain"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:463:1: entryRuleEventChain returns [EObject current=null] : iv_ruleEventChain= ruleEventChain EOF ;
    public final EObject entryRuleEventChain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventChain = null;


        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:464:2: (iv_ruleEventChain= ruleEventChain EOF )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:465:2: iv_ruleEventChain= ruleEventChain EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventChainRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEventChain_in_entryRuleEventChain824);
            iv_ruleEventChain=ruleEventChain();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventChain; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEventChain834); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEventChain"


    // $ANTLR start "ruleEventChain"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:472:1: ruleEventChain returns [EObject current=null] : (otherlv_0= 'EventChain' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'stimulus' ( ( ruleEString ) ) otherlv_5= 'response' ( ( ruleEString ) ) (otherlv_7= 'eventChains' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? otherlv_11= '}' ) ;
    public final EObject ruleEventChain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:475:28: ( (otherlv_0= 'EventChain' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'stimulus' ( ( ruleEString ) ) otherlv_5= 'response' ( ( ruleEString ) ) (otherlv_7= 'eventChains' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? otherlv_11= '}' ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:476:1: (otherlv_0= 'EventChain' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'stimulus' ( ( ruleEString ) ) otherlv_5= 'response' ( ( ruleEString ) ) (otherlv_7= 'eventChains' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? otherlv_11= '}' )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:476:1: (otherlv_0= 'EventChain' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'stimulus' ( ( ruleEString ) ) otherlv_5= 'response' ( ( ruleEString ) ) (otherlv_7= 'eventChains' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? otherlv_11= '}' )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:476:3: otherlv_0= 'EventChain' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'stimulus' ( ( ruleEString ) ) otherlv_5= 'response' ( ( ruleEString ) ) (otherlv_7= 'eventChains' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEventChain871); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEventChainAccess().getEventChainKeyword_0());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:480:1: ( (lv_name_1_0= ruleEString ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:481:1: (lv_name_1_0= ruleEString )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:481:1: (lv_name_1_0= ruleEString )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:482:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventChainAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEventChain892);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEventChainRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEventChain904); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEventChainAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEventChain916); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEventChainAccess().getStimulusKeyword_3());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:506:1: ( ( ruleEString ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:507:1: ( ruleEString )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:507:1: ( ruleEString )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:508:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEventChainRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventChainAccess().getStimulusEventCrossReference_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEventChain943);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEventChain955); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getEventChainAccess().getResponseKeyword_5());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:528:1: ( ( ruleEString ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:529:1: ( ruleEString )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:529:1: ( ruleEString )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:530:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEventChainRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventChainAccess().getResponseEventCrossReference_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEventChain982);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:546:2: (otherlv_7= 'eventChains' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:546:4: otherlv_7= 'eventChains' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_7=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEventChain995); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getEventChainAccess().getEventChainsKeyword_7_0());
                          
                    }
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:550:1: ( ( ruleEString ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:551:1: ( ruleEString )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:551:1: ( ruleEString )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:552:3: ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEventChainRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventChainAccess().getSegmentEventCrossReference_7_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEventChain1022);
                    ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:568:2: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==18) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:568:4: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEventChain1035); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_9, grammarAccess.getEventChainAccess().getCommaKeyword_7_2_0());
                    	          
                    	    }
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:572:1: ( ( ruleEString ) )
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:573:1: ( ruleEString )
                    	    {
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:573:1: ( ruleEString )
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:574:3: ruleEString
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getEventChainRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEventChainAccess().getSegmentEventCrossReference_7_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEventChain1062);
                    	    ruleEString();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEventChain1078); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getEventChainAccess().getRightCurlyBracketKeyword_8());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEventChain"


    // $ANTLR start "entryRuleTimingConstraint"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:602:1: entryRuleTimingConstraint returns [EObject current=null] : iv_ruleTimingConstraint= ruleTimingConstraint EOF ;
    public final EObject entryRuleTimingConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimingConstraint = null;


        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:603:2: (iv_ruleTimingConstraint= ruleTimingConstraint EOF )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:604:2: iv_ruleTimingConstraint= ruleTimingConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimingConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTimingConstraint_in_entryRuleTimingConstraint1114);
            iv_ruleTimingConstraint=ruleTimingConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimingConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTimingConstraint1124); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimingConstraint"


    // $ANTLR start "ruleTimingConstraint"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:611:1: ruleTimingConstraint returns [EObject current=null] : (this_DelayConstraint_0= ruleDelayConstraint | this_RepetitionConstraint_1= ruleRepetitionConstraint | this_SynchronizationConstraint_2= ruleSynchronizationConstraint | this_OrderConstraint_3= ruleOrderConstraint | this_PatternConstraint_4= rulePatternConstraint | this_SporadicConstraint_5= ruleSporadicConstraint | this_PeriodicConstraint_6= rulePeriodicConstraint | this_ArbitraryConstraint_7= ruleArbitraryConstraint | this_BurstConstraint_8= ruleBurstConstraint | this_ReactionConstraint_9= ruleReactionConstraint | this_AgeConstraint_10= ruleAgeConstraint ) ;
    public final EObject ruleTimingConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_DelayConstraint_0 = null;

        EObject this_RepetitionConstraint_1 = null;

        EObject this_SynchronizationConstraint_2 = null;

        EObject this_OrderConstraint_3 = null;

        EObject this_PatternConstraint_4 = null;

        EObject this_SporadicConstraint_5 = null;

        EObject this_PeriodicConstraint_6 = null;

        EObject this_ArbitraryConstraint_7 = null;

        EObject this_BurstConstraint_8 = null;

        EObject this_ReactionConstraint_9 = null;

        EObject this_AgeConstraint_10 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:614:28: ( (this_DelayConstraint_0= ruleDelayConstraint | this_RepetitionConstraint_1= ruleRepetitionConstraint | this_SynchronizationConstraint_2= ruleSynchronizationConstraint | this_OrderConstraint_3= ruleOrderConstraint | this_PatternConstraint_4= rulePatternConstraint | this_SporadicConstraint_5= ruleSporadicConstraint | this_PeriodicConstraint_6= rulePeriodicConstraint | this_ArbitraryConstraint_7= ruleArbitraryConstraint | this_BurstConstraint_8= ruleBurstConstraint | this_ReactionConstraint_9= ruleReactionConstraint | this_AgeConstraint_10= ruleAgeConstraint ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:615:1: (this_DelayConstraint_0= ruleDelayConstraint | this_RepetitionConstraint_1= ruleRepetitionConstraint | this_SynchronizationConstraint_2= ruleSynchronizationConstraint | this_OrderConstraint_3= ruleOrderConstraint | this_PatternConstraint_4= rulePatternConstraint | this_SporadicConstraint_5= ruleSporadicConstraint | this_PeriodicConstraint_6= rulePeriodicConstraint | this_ArbitraryConstraint_7= ruleArbitraryConstraint | this_BurstConstraint_8= ruleBurstConstraint | this_ReactionConstraint_9= ruleReactionConstraint | this_AgeConstraint_10= ruleAgeConstraint )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:615:1: (this_DelayConstraint_0= ruleDelayConstraint | this_RepetitionConstraint_1= ruleRepetitionConstraint | this_SynchronizationConstraint_2= ruleSynchronizationConstraint | this_OrderConstraint_3= ruleOrderConstraint | this_PatternConstraint_4= rulePatternConstraint | this_SporadicConstraint_5= ruleSporadicConstraint | this_PeriodicConstraint_6= rulePeriodicConstraint | this_ArbitraryConstraint_7= ruleArbitraryConstraint | this_BurstConstraint_8= ruleBurstConstraint | this_ReactionConstraint_9= ruleReactionConstraint | this_AgeConstraint_10= ruleAgeConstraint )
            int alt6=11;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:616:2: this_DelayConstraint_0= ruleDelayConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTimingConstraintAccess().getDelayConstraintParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDelayConstraint_in_ruleTimingConstraint1174);
                    this_DelayConstraint_0=ruleDelayConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DelayConstraint_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:629:2: this_RepetitionConstraint_1= ruleRepetitionConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTimingConstraintAccess().getRepetitionConstraintParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleRepetitionConstraint_in_ruleTimingConstraint1204);
                    this_RepetitionConstraint_1=ruleRepetitionConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RepetitionConstraint_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:642:2: this_SynchronizationConstraint_2= ruleSynchronizationConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTimingConstraintAccess().getSynchronizationConstraintParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSynchronizationConstraint_in_ruleTimingConstraint1234);
                    this_SynchronizationConstraint_2=ruleSynchronizationConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SynchronizationConstraint_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:655:2: this_OrderConstraint_3= ruleOrderConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTimingConstraintAccess().getOrderConstraintParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleOrderConstraint_in_ruleTimingConstraint1264);
                    this_OrderConstraint_3=ruleOrderConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OrderConstraint_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:668:2: this_PatternConstraint_4= rulePatternConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTimingConstraintAccess().getPatternConstraintParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePatternConstraint_in_ruleTimingConstraint1294);
                    this_PatternConstraint_4=rulePatternConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PatternConstraint_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:681:2: this_SporadicConstraint_5= ruleSporadicConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTimingConstraintAccess().getSporadicConstraintParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSporadicConstraint_in_ruleTimingConstraint1324);
                    this_SporadicConstraint_5=ruleSporadicConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SporadicConstraint_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:694:2: this_PeriodicConstraint_6= rulePeriodicConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTimingConstraintAccess().getPeriodicConstraintParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePeriodicConstraint_in_ruleTimingConstraint1354);
                    this_PeriodicConstraint_6=rulePeriodicConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PeriodicConstraint_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:707:2: this_ArbitraryConstraint_7= ruleArbitraryConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTimingConstraintAccess().getArbitraryConstraintParserRuleCall_7()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleArbitraryConstraint_in_ruleTimingConstraint1384);
                    this_ArbitraryConstraint_7=ruleArbitraryConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ArbitraryConstraint_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:720:2: this_BurstConstraint_8= ruleBurstConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTimingConstraintAccess().getBurstConstraintParserRuleCall_8()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBurstConstraint_in_ruleTimingConstraint1414);
                    this_BurstConstraint_8=ruleBurstConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BurstConstraint_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:733:2: this_ReactionConstraint_9= ruleReactionConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTimingConstraintAccess().getReactionConstraintParserRuleCall_9()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleReactionConstraint_in_ruleTimingConstraint1444);
                    this_ReactionConstraint_9=ruleReactionConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReactionConstraint_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:746:2: this_AgeConstraint_10= ruleAgeConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTimingConstraintAccess().getAgeConstraintParserRuleCall_10()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAgeConstraint_in_ruleTimingConstraint1474);
                    this_AgeConstraint_10=ruleAgeConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AgeConstraint_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimingConstraint"


    // $ANTLR start "entryRuleDelayConstraint"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:765:1: entryRuleDelayConstraint returns [EObject current=null] : iv_ruleDelayConstraint= ruleDelayConstraint EOF ;
    public final EObject entryRuleDelayConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelayConstraint = null;


        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:766:2: (iv_ruleDelayConstraint= ruleDelayConstraint EOF )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:767:2: iv_ruleDelayConstraint= ruleDelayConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDelayConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDelayConstraint_in_entryRuleDelayConstraint1509);
            iv_ruleDelayConstraint=ruleDelayConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDelayConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDelayConstraint1519); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDelayConstraint"


    // $ANTLR start "ruleDelayConstraint"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:774:1: ruleDelayConstraint returns [EObject current=null] : (otherlv_0= 'DelayConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'source' ( ( ruleEString ) ) otherlv_5= 'target' ( ( ruleEString ) ) otherlv_7= 'lower' otherlv_8= '=' ( ( (lv_lower_9_0= ruleSymbolicTimingExpression ) ) | ( (lv_lower_10_0= ruleValueTimingExpression ) ) ) otherlv_11= 'upper' otherlv_12= '=' ( ( (lv_upper_13_0= ruleSymbolicTimingExpression ) ) | ( (lv_upper_14_0= ruleValueTimingExpression ) ) ) otherlv_15= '}' ) ;
    public final EObject ruleDelayConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_lower_9_0 = null;

        EObject lv_lower_10_0 = null;

        EObject lv_upper_13_0 = null;

        EObject lv_upper_14_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:777:28: ( (otherlv_0= 'DelayConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'source' ( ( ruleEString ) ) otherlv_5= 'target' ( ( ruleEString ) ) otherlv_7= 'lower' otherlv_8= '=' ( ( (lv_lower_9_0= ruleSymbolicTimingExpression ) ) | ( (lv_lower_10_0= ruleValueTimingExpression ) ) ) otherlv_11= 'upper' otherlv_12= '=' ( ( (lv_upper_13_0= ruleSymbolicTimingExpression ) ) | ( (lv_upper_14_0= ruleValueTimingExpression ) ) ) otherlv_15= '}' ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:778:1: (otherlv_0= 'DelayConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'source' ( ( ruleEString ) ) otherlv_5= 'target' ( ( ruleEString ) ) otherlv_7= 'lower' otherlv_8= '=' ( ( (lv_lower_9_0= ruleSymbolicTimingExpression ) ) | ( (lv_lower_10_0= ruleValueTimingExpression ) ) ) otherlv_11= 'upper' otherlv_12= '=' ( ( (lv_upper_13_0= ruleSymbolicTimingExpression ) ) | ( (lv_upper_14_0= ruleValueTimingExpression ) ) ) otherlv_15= '}' )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:778:1: (otherlv_0= 'DelayConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'source' ( ( ruleEString ) ) otherlv_5= 'target' ( ( ruleEString ) ) otherlv_7= 'lower' otherlv_8= '=' ( ( (lv_lower_9_0= ruleSymbolicTimingExpression ) ) | ( (lv_lower_10_0= ruleValueTimingExpression ) ) ) otherlv_11= 'upper' otherlv_12= '=' ( ( (lv_upper_13_0= ruleSymbolicTimingExpression ) ) | ( (lv_upper_14_0= ruleValueTimingExpression ) ) ) otherlv_15= '}' )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:778:3: otherlv_0= 'DelayConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'source' ( ( ruleEString ) ) otherlv_5= 'target' ( ( ruleEString ) ) otherlv_7= 'lower' otherlv_8= '=' ( ( (lv_lower_9_0= ruleSymbolicTimingExpression ) ) | ( (lv_lower_10_0= ruleValueTimingExpression ) ) ) otherlv_11= 'upper' otherlv_12= '=' ( ( (lv_upper_13_0= ruleSymbolicTimingExpression ) ) | ( (lv_upper_14_0= ruleValueTimingExpression ) ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleDelayConstraint1556); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDelayConstraintAccess().getDelayConstraintKeyword_0());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:782:1: ( (lv_name_1_0= ruleEString ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:783:1: (lv_name_1_0= ruleEString )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:783:1: (lv_name_1_0= ruleEString )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:784:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDelayConstraintAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDelayConstraint1577);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDelayConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDelayConstraint1589); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDelayConstraintAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleDelayConstraint1601); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDelayConstraintAccess().getSourceKeyword_3());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:808:1: ( ( ruleEString ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:809:1: ( ruleEString )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:809:1: ( ruleEString )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:810:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDelayConstraintRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDelayConstraintAccess().getSourceEventCrossReference_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDelayConstraint1628);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleDelayConstraint1640); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDelayConstraintAccess().getTargetKeyword_5());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:830:1: ( ( ruleEString ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:831:1: ( ruleEString )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:831:1: ( ruleEString )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:832:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDelayConstraintRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDelayConstraintAccess().getTargetEventCrossReference_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDelayConstraint1667);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleDelayConstraint1679); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getDelayConstraintAccess().getLowerKeyword_7());
                  
            }
            otherlv_8=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleDelayConstraint1691); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getDelayConstraintAccess().getEqualsSignKeyword_8());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:856:1: ( ( (lv_lower_9_0= ruleSymbolicTimingExpression ) ) | ( (lv_lower_10_0= ruleValueTimingExpression ) ) )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:856:2: ( (lv_lower_9_0= ruleSymbolicTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:856:2: ( (lv_lower_9_0= ruleSymbolicTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:857:1: (lv_lower_9_0= ruleSymbolicTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:857:1: (lv_lower_9_0= ruleSymbolicTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:858:3: lv_lower_9_0= ruleSymbolicTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDelayConstraintAccess().getLowerSymbolicTimingExpressionParserRuleCall_9_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSymbolicTimingExpression_in_ruleDelayConstraint1713);
                    lv_lower_9_0=ruleSymbolicTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDelayConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"lower",
                              		lv_lower_9_0, 
                              		"SymbolicTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:875:6: ( (lv_lower_10_0= ruleValueTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:875:6: ( (lv_lower_10_0= ruleValueTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:876:1: (lv_lower_10_0= ruleValueTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:876:1: (lv_lower_10_0= ruleValueTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:877:3: lv_lower_10_0= ruleValueTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDelayConstraintAccess().getLowerValueTimingExpressionParserRuleCall_9_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValueTimingExpression_in_ruleDelayConstraint1740);
                    lv_lower_10_0=ruleValueTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDelayConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"lower",
                              		lv_lower_10_0, 
                              		"ValueTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleDelayConstraint1753); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getDelayConstraintAccess().getUpperKeyword_10());
                  
            }
            otherlv_12=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleDelayConstraint1765); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getDelayConstraintAccess().getEqualsSignKeyword_11());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:901:1: ( ( (lv_upper_13_0= ruleSymbolicTimingExpression ) ) | ( (lv_upper_14_0= ruleValueTimingExpression ) ) )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:901:2: ( (lv_upper_13_0= ruleSymbolicTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:901:2: ( (lv_upper_13_0= ruleSymbolicTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:902:1: (lv_upper_13_0= ruleSymbolicTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:902:1: (lv_upper_13_0= ruleSymbolicTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:903:3: lv_upper_13_0= ruleSymbolicTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDelayConstraintAccess().getUpperSymbolicTimingExpressionParserRuleCall_12_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSymbolicTimingExpression_in_ruleDelayConstraint1787);
                    lv_upper_13_0=ruleSymbolicTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDelayConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"upper",
                              		lv_upper_13_0, 
                              		"SymbolicTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:920:6: ( (lv_upper_14_0= ruleValueTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:920:6: ( (lv_upper_14_0= ruleValueTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:921:1: (lv_upper_14_0= ruleValueTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:921:1: (lv_upper_14_0= ruleValueTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:922:3: lv_upper_14_0= ruleValueTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDelayConstraintAccess().getUpperValueTimingExpressionParserRuleCall_12_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValueTimingExpression_in_ruleDelayConstraint1814);
                    lv_upper_14_0=ruleValueTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDelayConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"upper",
                              		lv_upper_14_0, 
                              		"ValueTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDelayConstraint1827); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getDelayConstraintAccess().getRightCurlyBracketKeyword_13());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDelayConstraint"


    // $ANTLR start "entryRuleRepetitionConstraint"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:950:1: entryRuleRepetitionConstraint returns [EObject current=null] : iv_ruleRepetitionConstraint= ruleRepetitionConstraint EOF ;
    public final EObject entryRuleRepetitionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepetitionConstraint = null;


        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:951:2: (iv_ruleRepetitionConstraint= ruleRepetitionConstraint EOF )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:952:2: iv_ruleRepetitionConstraint= ruleRepetitionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRepetitionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRepetitionConstraint_in_entryRuleRepetitionConstraint1863);
            iv_ruleRepetitionConstraint=ruleRepetitionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRepetitionConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRepetitionConstraint1873); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRepetitionConstraint"


    // $ANTLR start "ruleRepetitionConstraint"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:959:1: ruleRepetitionConstraint returns [EObject current=null] : (otherlv_0= 'RepetitionConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'event' ( ( ruleEString ) ) otherlv_5= 'span' otherlv_6= '=' ( (lv_span_7_0= RULE_INT ) ) otherlv_8= 'lower' otherlv_9= '=' ( ( (lv_lower_10_0= ruleSymbolicTimingExpression ) ) | ( (lv_lower_11_0= ruleValueTimingExpression ) ) ) otherlv_12= 'upper' otherlv_13= '=' ( ( (lv_upper_14_0= ruleSymbolicTimingExpression ) ) | ( (lv_upper_15_0= ruleValueTimingExpression ) ) ) otherlv_16= 'jitter' otherlv_17= '=' ( ( (lv_jitter_18_0= ruleSymbolicTimingExpression ) ) | ( (lv_jitter_19_0= ruleValueTimingExpression ) ) ) otherlv_20= '}' ) ;
    public final EObject ruleRepetitionConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_span_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_lower_10_0 = null;

        EObject lv_lower_11_0 = null;

        EObject lv_upper_14_0 = null;

        EObject lv_upper_15_0 = null;

        EObject lv_jitter_18_0 = null;

        EObject lv_jitter_19_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:962:28: ( (otherlv_0= 'RepetitionConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'event' ( ( ruleEString ) ) otherlv_5= 'span' otherlv_6= '=' ( (lv_span_7_0= RULE_INT ) ) otherlv_8= 'lower' otherlv_9= '=' ( ( (lv_lower_10_0= ruleSymbolicTimingExpression ) ) | ( (lv_lower_11_0= ruleValueTimingExpression ) ) ) otherlv_12= 'upper' otherlv_13= '=' ( ( (lv_upper_14_0= ruleSymbolicTimingExpression ) ) | ( (lv_upper_15_0= ruleValueTimingExpression ) ) ) otherlv_16= 'jitter' otherlv_17= '=' ( ( (lv_jitter_18_0= ruleSymbolicTimingExpression ) ) | ( (lv_jitter_19_0= ruleValueTimingExpression ) ) ) otherlv_20= '}' ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:963:1: (otherlv_0= 'RepetitionConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'event' ( ( ruleEString ) ) otherlv_5= 'span' otherlv_6= '=' ( (lv_span_7_0= RULE_INT ) ) otherlv_8= 'lower' otherlv_9= '=' ( ( (lv_lower_10_0= ruleSymbolicTimingExpression ) ) | ( (lv_lower_11_0= ruleValueTimingExpression ) ) ) otherlv_12= 'upper' otherlv_13= '=' ( ( (lv_upper_14_0= ruleSymbolicTimingExpression ) ) | ( (lv_upper_15_0= ruleValueTimingExpression ) ) ) otherlv_16= 'jitter' otherlv_17= '=' ( ( (lv_jitter_18_0= ruleSymbolicTimingExpression ) ) | ( (lv_jitter_19_0= ruleValueTimingExpression ) ) ) otherlv_20= '}' )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:963:1: (otherlv_0= 'RepetitionConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'event' ( ( ruleEString ) ) otherlv_5= 'span' otherlv_6= '=' ( (lv_span_7_0= RULE_INT ) ) otherlv_8= 'lower' otherlv_9= '=' ( ( (lv_lower_10_0= ruleSymbolicTimingExpression ) ) | ( (lv_lower_11_0= ruleValueTimingExpression ) ) ) otherlv_12= 'upper' otherlv_13= '=' ( ( (lv_upper_14_0= ruleSymbolicTimingExpression ) ) | ( (lv_upper_15_0= ruleValueTimingExpression ) ) ) otherlv_16= 'jitter' otherlv_17= '=' ( ( (lv_jitter_18_0= ruleSymbolicTimingExpression ) ) | ( (lv_jitter_19_0= ruleValueTimingExpression ) ) ) otherlv_20= '}' )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:963:3: otherlv_0= 'RepetitionConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'event' ( ( ruleEString ) ) otherlv_5= 'span' otherlv_6= '=' ( (lv_span_7_0= RULE_INT ) ) otherlv_8= 'lower' otherlv_9= '=' ( ( (lv_lower_10_0= ruleSymbolicTimingExpression ) ) | ( (lv_lower_11_0= ruleValueTimingExpression ) ) ) otherlv_12= 'upper' otherlv_13= '=' ( ( (lv_upper_14_0= ruleSymbolicTimingExpression ) ) | ( (lv_upper_15_0= ruleValueTimingExpression ) ) ) otherlv_16= 'jitter' otherlv_17= '=' ( ( (lv_jitter_18_0= ruleSymbolicTimingExpression ) ) | ( (lv_jitter_19_0= ruleValueTimingExpression ) ) ) otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleRepetitionConstraint1910); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRepetitionConstraintAccess().getRepetitionConstraintKeyword_0());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:967:1: ( (lv_name_1_0= ruleEString ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:968:1: (lv_name_1_0= ruleEString )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:968:1: (lv_name_1_0= ruleEString )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:969:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRepetitionConstraintAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRepetitionConstraint1931);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRepetitionConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRepetitionConstraint1943); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRepetitionConstraintAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleRepetitionConstraint1955); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getRepetitionConstraintAccess().getEventKeyword_3());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:993:1: ( ( ruleEString ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:994:1: ( ruleEString )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:994:1: ( ruleEString )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:995:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getRepetitionConstraintRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRepetitionConstraintAccess().getEventEventCrossReference_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRepetitionConstraint1982);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleRepetitionConstraint1994); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getRepetitionConstraintAccess().getSpanKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleRepetitionConstraint2006); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getRepetitionConstraintAccess().getEqualsSignKeyword_6());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1019:1: ( (lv_span_7_0= RULE_INT ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1020:1: (lv_span_7_0= RULE_INT )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1020:1: (lv_span_7_0= RULE_INT )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1021:3: lv_span_7_0= RULE_INT
            {
            lv_span_7_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleRepetitionConstraint2023); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_span_7_0, grammarAccess.getRepetitionConstraintAccess().getSpanINTTerminalRuleCall_7_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRepetitionConstraintRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"span",
                      		lv_span_7_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleRepetitionConstraint2040); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getRepetitionConstraintAccess().getLowerKeyword_8());
                  
            }
            otherlv_9=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleRepetitionConstraint2052); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getRepetitionConstraintAccess().getEqualsSignKeyword_9());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1045:1: ( ( (lv_lower_10_0= ruleSymbolicTimingExpression ) ) | ( (lv_lower_11_0= ruleValueTimingExpression ) ) )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1045:2: ( (lv_lower_10_0= ruleSymbolicTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1045:2: ( (lv_lower_10_0= ruleSymbolicTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1046:1: (lv_lower_10_0= ruleSymbolicTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1046:1: (lv_lower_10_0= ruleSymbolicTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1047:3: lv_lower_10_0= ruleSymbolicTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRepetitionConstraintAccess().getLowerSymbolicTimingExpressionParserRuleCall_10_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSymbolicTimingExpression_in_ruleRepetitionConstraint2074);
                    lv_lower_10_0=ruleSymbolicTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRepetitionConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"lower",
                              		lv_lower_10_0, 
                              		"SymbolicTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1064:6: ( (lv_lower_11_0= ruleValueTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1064:6: ( (lv_lower_11_0= ruleValueTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1065:1: (lv_lower_11_0= ruleValueTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1065:1: (lv_lower_11_0= ruleValueTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1066:3: lv_lower_11_0= ruleValueTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRepetitionConstraintAccess().getLowerValueTimingExpressionParserRuleCall_10_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValueTimingExpression_in_ruleRepetitionConstraint2101);
                    lv_lower_11_0=ruleValueTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRepetitionConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"lower",
                              		lv_lower_11_0, 
                              		"ValueTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleRepetitionConstraint2114); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getRepetitionConstraintAccess().getUpperKeyword_11());
                  
            }
            otherlv_13=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleRepetitionConstraint2126); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getRepetitionConstraintAccess().getEqualsSignKeyword_12());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1090:1: ( ( (lv_upper_14_0= ruleSymbolicTimingExpression ) ) | ( (lv_upper_15_0= ruleValueTimingExpression ) ) )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1090:2: ( (lv_upper_14_0= ruleSymbolicTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1090:2: ( (lv_upper_14_0= ruleSymbolicTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1091:1: (lv_upper_14_0= ruleSymbolicTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1091:1: (lv_upper_14_0= ruleSymbolicTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1092:3: lv_upper_14_0= ruleSymbolicTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRepetitionConstraintAccess().getUpperSymbolicTimingExpressionParserRuleCall_13_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSymbolicTimingExpression_in_ruleRepetitionConstraint2148);
                    lv_upper_14_0=ruleSymbolicTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRepetitionConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"upper",
                              		lv_upper_14_0, 
                              		"SymbolicTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1109:6: ( (lv_upper_15_0= ruleValueTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1109:6: ( (lv_upper_15_0= ruleValueTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1110:1: (lv_upper_15_0= ruleValueTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1110:1: (lv_upper_15_0= ruleValueTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1111:3: lv_upper_15_0= ruleValueTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRepetitionConstraintAccess().getUpperValueTimingExpressionParserRuleCall_13_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValueTimingExpression_in_ruleRepetitionConstraint2175);
                    lv_upper_15_0=ruleValueTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRepetitionConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"upper",
                              		lv_upper_15_0, 
                              		"ValueTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleRepetitionConstraint2188); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getRepetitionConstraintAccess().getJitterKeyword_14());
                  
            }
            otherlv_17=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleRepetitionConstraint2200); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getRepetitionConstraintAccess().getEqualsSignKeyword_15());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1135:1: ( ( (lv_jitter_18_0= ruleSymbolicTimingExpression ) ) | ( (lv_jitter_19_0= ruleValueTimingExpression ) ) )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1135:2: ( (lv_jitter_18_0= ruleSymbolicTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1135:2: ( (lv_jitter_18_0= ruleSymbolicTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1136:1: (lv_jitter_18_0= ruleSymbolicTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1136:1: (lv_jitter_18_0= ruleSymbolicTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1137:3: lv_jitter_18_0= ruleSymbolicTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRepetitionConstraintAccess().getJitterSymbolicTimingExpressionParserRuleCall_16_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSymbolicTimingExpression_in_ruleRepetitionConstraint2222);
                    lv_jitter_18_0=ruleSymbolicTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRepetitionConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"jitter",
                              		lv_jitter_18_0, 
                              		"SymbolicTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1154:6: ( (lv_jitter_19_0= ruleValueTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1154:6: ( (lv_jitter_19_0= ruleValueTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1155:1: (lv_jitter_19_0= ruleValueTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1155:1: (lv_jitter_19_0= ruleValueTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1156:3: lv_jitter_19_0= ruleValueTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRepetitionConstraintAccess().getJitterValueTimingExpressionParserRuleCall_16_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValueTimingExpression_in_ruleRepetitionConstraint2249);
                    lv_jitter_19_0=ruleValueTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRepetitionConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"jitter",
                              		lv_jitter_19_0, 
                              		"ValueTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_20=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRepetitionConstraint2262); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_20, grammarAccess.getRepetitionConstraintAccess().getRightCurlyBracketKeyword_17());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRepetitionConstraint"


    // $ANTLR start "entryRuleSynchronizationConstraint"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1184:1: entryRuleSynchronizationConstraint returns [EObject current=null] : iv_ruleSynchronizationConstraint= ruleSynchronizationConstraint EOF ;
    public final EObject entryRuleSynchronizationConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSynchronizationConstraint = null;


        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1185:2: (iv_ruleSynchronizationConstraint= ruleSynchronizationConstraint EOF )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1186:2: iv_ruleSynchronizationConstraint= ruleSynchronizationConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSynchronizationConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSynchronizationConstraint_in_entryRuleSynchronizationConstraint2298);
            iv_ruleSynchronizationConstraint=ruleSynchronizationConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSynchronizationConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSynchronizationConstraint2308); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSynchronizationConstraint"


    // $ANTLR start "ruleSynchronizationConstraint"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1193:1: ruleSynchronizationConstraint returns [EObject current=null] : (otherlv_0= 'SynchronizationConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'events' ( ( ruleEString ) ) otherlv_5= ',' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= 'tolerance' otherlv_10= '=' ( ( (lv_tolerance_11_0= ruleSymbolicTimingExpression ) ) | ( (lv_tolerance_12_0= ruleValueTimingExpression ) ) ) otherlv_13= '}' ) ;
    public final EObject ruleSynchronizationConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_tolerance_11_0 = null;

        EObject lv_tolerance_12_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1196:28: ( (otherlv_0= 'SynchronizationConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'events' ( ( ruleEString ) ) otherlv_5= ',' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= 'tolerance' otherlv_10= '=' ( ( (lv_tolerance_11_0= ruleSymbolicTimingExpression ) ) | ( (lv_tolerance_12_0= ruleValueTimingExpression ) ) ) otherlv_13= '}' ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1197:1: (otherlv_0= 'SynchronizationConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'events' ( ( ruleEString ) ) otherlv_5= ',' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= 'tolerance' otherlv_10= '=' ( ( (lv_tolerance_11_0= ruleSymbolicTimingExpression ) ) | ( (lv_tolerance_12_0= ruleValueTimingExpression ) ) ) otherlv_13= '}' )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1197:1: (otherlv_0= 'SynchronizationConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'events' ( ( ruleEString ) ) otherlv_5= ',' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= 'tolerance' otherlv_10= '=' ( ( (lv_tolerance_11_0= ruleSymbolicTimingExpression ) ) | ( (lv_tolerance_12_0= ruleValueTimingExpression ) ) ) otherlv_13= '}' )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1197:3: otherlv_0= 'SynchronizationConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'events' ( ( ruleEString ) ) otherlv_5= ',' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= 'tolerance' otherlv_10= '=' ( ( (lv_tolerance_11_0= ruleSymbolicTimingExpression ) ) | ( (lv_tolerance_12_0= ruleValueTimingExpression ) ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleSynchronizationConstraint2345); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSynchronizationConstraintAccess().getSynchronizationConstraintKeyword_0());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1201:1: ( (lv_name_1_0= ruleEString ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1202:1: (lv_name_1_0= ruleEString )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1202:1: (lv_name_1_0= ruleEString )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1203:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSynchronizationConstraintAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSynchronizationConstraint2366);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSynchronizationConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSynchronizationConstraint2378); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSynchronizationConstraintAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleSynchronizationConstraint2390); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSynchronizationConstraintAccess().getEventsKeyword_3());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1227:1: ( ( ruleEString ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1228:1: ( ruleEString )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1228:1: ( ruleEString )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1229:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSynchronizationConstraintRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSynchronizationConstraintAccess().getEventsEventCrossReference_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSynchronizationConstraint2417);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSynchronizationConstraint2429); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getSynchronizationConstraintAccess().getCommaKeyword_5());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1249:1: ( ( ruleEString ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1250:1: ( ruleEString )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1250:1: ( ruleEString )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1251:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSynchronizationConstraintRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSynchronizationConstraintAccess().getEventsEventCrossReference_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSynchronizationConstraint2456);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1267:2: (otherlv_7= ',' ( ( ruleEString ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1267:4: otherlv_7= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSynchronizationConstraint2469); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getSynchronizationConstraintAccess().getCommaKeyword_7_0());
            	          
            	    }
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1271:1: ( ( ruleEString ) )
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1272:1: ( ruleEString )
            	    {
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1272:1: ( ruleEString )
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1273:3: ruleEString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getSynchronizationConstraintRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSynchronizationConstraintAccess().getEventsEventCrossReference_7_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSynchronizationConstraint2496);
            	    ruleEString();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_9=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleSynchronizationConstraint2510); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getSynchronizationConstraintAccess().getToleranceKeyword_8());
                  
            }
            otherlv_10=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleSynchronizationConstraint2522); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getSynchronizationConstraintAccess().getEqualsSignKeyword_9());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1297:1: ( ( (lv_tolerance_11_0= ruleSymbolicTimingExpression ) ) | ( (lv_tolerance_12_0= ruleValueTimingExpression ) ) )
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1297:2: ( (lv_tolerance_11_0= ruleSymbolicTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1297:2: ( (lv_tolerance_11_0= ruleSymbolicTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1298:1: (lv_tolerance_11_0= ruleSymbolicTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1298:1: (lv_tolerance_11_0= ruleSymbolicTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1299:3: lv_tolerance_11_0= ruleSymbolicTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSynchronizationConstraintAccess().getToleranceSymbolicTimingExpressionParserRuleCall_10_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSymbolicTimingExpression_in_ruleSynchronizationConstraint2544);
                    lv_tolerance_11_0=ruleSymbolicTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSynchronizationConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"tolerance",
                              		lv_tolerance_11_0, 
                              		"SymbolicTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1316:6: ( (lv_tolerance_12_0= ruleValueTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1316:6: ( (lv_tolerance_12_0= ruleValueTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1317:1: (lv_tolerance_12_0= ruleValueTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1317:1: (lv_tolerance_12_0= ruleValueTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1318:3: lv_tolerance_12_0= ruleValueTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSynchronizationConstraintAccess().getToleranceValueTimingExpressionParserRuleCall_10_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValueTimingExpression_in_ruleSynchronizationConstraint2571);
                    lv_tolerance_12_0=ruleValueTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSynchronizationConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"tolerance",
                              		lv_tolerance_12_0, 
                              		"ValueTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSynchronizationConstraint2584); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getSynchronizationConstraintAccess().getRightCurlyBracketKeyword_11());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSynchronizationConstraint"


    // $ANTLR start "entryRuleOrderConstraint"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1346:1: entryRuleOrderConstraint returns [EObject current=null] : iv_ruleOrderConstraint= ruleOrderConstraint EOF ;
    public final EObject entryRuleOrderConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderConstraint = null;


        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1347:2: (iv_ruleOrderConstraint= ruleOrderConstraint EOF )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1348:2: iv_ruleOrderConstraint= ruleOrderConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrderConstraint_in_entryRuleOrderConstraint2620);
            iv_ruleOrderConstraint=ruleOrderConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrderConstraint2630); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrderConstraint"


    // $ANTLR start "ruleOrderConstraint"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1355:1: ruleOrderConstraint returns [EObject current=null] : (otherlv_0= 'OrderConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'left' ( ( (lv_left_4_0= ruleSymbolicTimingExpression ) ) | ( (lv_left_5_0= ruleValueTimingExpression ) ) ) otherlv_6= 'right' ( ( (lv_right_7_0= ruleSymbolicTimingExpression ) ) | ( (lv_right_8_0= ruleValueTimingExpression ) ) ) otherlv_9= '}' ) ;
    public final EObject ruleOrderConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_left_4_0 = null;

        EObject lv_left_5_0 = null;

        EObject lv_right_7_0 = null;

        EObject lv_right_8_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1358:28: ( (otherlv_0= 'OrderConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'left' ( ( (lv_left_4_0= ruleSymbolicTimingExpression ) ) | ( (lv_left_5_0= ruleValueTimingExpression ) ) ) otherlv_6= 'right' ( ( (lv_right_7_0= ruleSymbolicTimingExpression ) ) | ( (lv_right_8_0= ruleValueTimingExpression ) ) ) otherlv_9= '}' ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1359:1: (otherlv_0= 'OrderConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'left' ( ( (lv_left_4_0= ruleSymbolicTimingExpression ) ) | ( (lv_left_5_0= ruleValueTimingExpression ) ) ) otherlv_6= 'right' ( ( (lv_right_7_0= ruleSymbolicTimingExpression ) ) | ( (lv_right_8_0= ruleValueTimingExpression ) ) ) otherlv_9= '}' )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1359:1: (otherlv_0= 'OrderConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'left' ( ( (lv_left_4_0= ruleSymbolicTimingExpression ) ) | ( (lv_left_5_0= ruleValueTimingExpression ) ) ) otherlv_6= 'right' ( ( (lv_right_7_0= ruleSymbolicTimingExpression ) ) | ( (lv_right_8_0= ruleValueTimingExpression ) ) ) otherlv_9= '}' )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1359:3: otherlv_0= 'OrderConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'left' ( ( (lv_left_4_0= ruleSymbolicTimingExpression ) ) | ( (lv_left_5_0= ruleValueTimingExpression ) ) ) otherlv_6= 'right' ( ( (lv_right_7_0= ruleSymbolicTimingExpression ) ) | ( (lv_right_8_0= ruleValueTimingExpression ) ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleOrderConstraint2667); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOrderConstraintAccess().getOrderConstraintKeyword_0());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1363:1: ( (lv_name_1_0= ruleEString ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1364:1: (lv_name_1_0= ruleEString )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1364:1: (lv_name_1_0= ruleEString )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1365:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrderConstraintAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOrderConstraint2688);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOrderConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOrderConstraint2700); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getOrderConstraintAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleOrderConstraint2712); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getOrderConstraintAccess().getLeftKeyword_3());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1389:1: ( ( (lv_left_4_0= ruleSymbolicTimingExpression ) ) | ( (lv_left_5_0= ruleValueTimingExpression ) ) )
            int alt14=2;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1389:2: ( (lv_left_4_0= ruleSymbolicTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1389:2: ( (lv_left_4_0= ruleSymbolicTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1390:1: (lv_left_4_0= ruleSymbolicTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1390:1: (lv_left_4_0= ruleSymbolicTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1391:3: lv_left_4_0= ruleSymbolicTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOrderConstraintAccess().getLeftSymbolicTimingExpressionParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSymbolicTimingExpression_in_ruleOrderConstraint2734);
                    lv_left_4_0=ruleSymbolicTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOrderConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"left",
                              		lv_left_4_0, 
                              		"SymbolicTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1408:6: ( (lv_left_5_0= ruleValueTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1408:6: ( (lv_left_5_0= ruleValueTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1409:1: (lv_left_5_0= ruleValueTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1409:1: (lv_left_5_0= ruleValueTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1410:3: lv_left_5_0= ruleValueTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOrderConstraintAccess().getLeftValueTimingExpressionParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValueTimingExpression_in_ruleOrderConstraint2761);
                    lv_left_5_0=ruleValueTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOrderConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"left",
                              		lv_left_5_0, 
                              		"ValueTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleOrderConstraint2774); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getOrderConstraintAccess().getRightKeyword_5());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1430:1: ( ( (lv_right_7_0= ruleSymbolicTimingExpression ) ) | ( (lv_right_8_0= ruleValueTimingExpression ) ) )
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1430:2: ( (lv_right_7_0= ruleSymbolicTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1430:2: ( (lv_right_7_0= ruleSymbolicTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1431:1: (lv_right_7_0= ruleSymbolicTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1431:1: (lv_right_7_0= ruleSymbolicTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1432:3: lv_right_7_0= ruleSymbolicTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOrderConstraintAccess().getRightSymbolicTimingExpressionParserRuleCall_6_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSymbolicTimingExpression_in_ruleOrderConstraint2796);
                    lv_right_7_0=ruleSymbolicTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOrderConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_7_0, 
                              		"SymbolicTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1449:6: ( (lv_right_8_0= ruleValueTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1449:6: ( (lv_right_8_0= ruleValueTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1450:1: (lv_right_8_0= ruleValueTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1450:1: (lv_right_8_0= ruleValueTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1451:3: lv_right_8_0= ruleValueTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOrderConstraintAccess().getRightValueTimingExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValueTimingExpression_in_ruleOrderConstraint2823);
                    lv_right_8_0=ruleValueTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOrderConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_8_0, 
                              		"ValueTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleOrderConstraint2836); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getOrderConstraintAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrderConstraint"


    // $ANTLR start "entryRulePatternConstraint"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1479:1: entryRulePatternConstraint returns [EObject current=null] : iv_rulePatternConstraint= rulePatternConstraint EOF ;
    public final EObject entryRulePatternConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternConstraint = null;


        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1480:2: (iv_rulePatternConstraint= rulePatternConstraint EOF )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1481:2: iv_rulePatternConstraint= rulePatternConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPatternConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePatternConstraint_in_entryRulePatternConstraint2872);
            iv_rulePatternConstraint=rulePatternConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePatternConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePatternConstraint2882); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatternConstraint"


    // $ANTLR start "rulePatternConstraint"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1488:1: rulePatternConstraint returns [EObject current=null] : ( (otherlv_0= 'PatternConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'event' ( ( ruleEString ) ) otherlv_5= 'ref' ( ( ruleEString ) ) otherlv_7= 'minimum' otherlv_8= '=' ( ( (lv_minimum_9_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_10_0= ruleValueTimingExpression ) ) ) otherlv_11= 'jitter' otherlv_12= '=' ( ( (lv_jitter_13_0= ruleSymbolicTimingExpression ) ) | ( (lv_jitter_14_0= ruleValueTimingExpression ) ) ) otherlv_15= 'offset' otherlv_16= '=' ( (lv_offset_17_0= ruleSymbolicTimingExpression ) ) ) | ( ( (lv_offset_18_0= ruleValueTimingExpression ) ) ( (otherlv_19= ',' ( (lv_offset_20_0= ruleSymbolicTimingExpression ) ) ) | ( (lv_offset_21_0= ruleValueTimingExpression ) ) )* otherlv_22= '}' ) ) ;
    public final EObject rulePatternConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_19=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_minimum_9_0 = null;

        EObject lv_minimum_10_0 = null;

        EObject lv_jitter_13_0 = null;

        EObject lv_jitter_14_0 = null;

        EObject lv_offset_17_0 = null;

        EObject lv_offset_18_0 = null;

        EObject lv_offset_20_0 = null;

        EObject lv_offset_21_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1491:28: ( ( (otherlv_0= 'PatternConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'event' ( ( ruleEString ) ) otherlv_5= 'ref' ( ( ruleEString ) ) otherlv_7= 'minimum' otherlv_8= '=' ( ( (lv_minimum_9_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_10_0= ruleValueTimingExpression ) ) ) otherlv_11= 'jitter' otherlv_12= '=' ( ( (lv_jitter_13_0= ruleSymbolicTimingExpression ) ) | ( (lv_jitter_14_0= ruleValueTimingExpression ) ) ) otherlv_15= 'offset' otherlv_16= '=' ( (lv_offset_17_0= ruleSymbolicTimingExpression ) ) ) | ( ( (lv_offset_18_0= ruleValueTimingExpression ) ) ( (otherlv_19= ',' ( (lv_offset_20_0= ruleSymbolicTimingExpression ) ) ) | ( (lv_offset_21_0= ruleValueTimingExpression ) ) )* otherlv_22= '}' ) ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1492:1: ( (otherlv_0= 'PatternConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'event' ( ( ruleEString ) ) otherlv_5= 'ref' ( ( ruleEString ) ) otherlv_7= 'minimum' otherlv_8= '=' ( ( (lv_minimum_9_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_10_0= ruleValueTimingExpression ) ) ) otherlv_11= 'jitter' otherlv_12= '=' ( ( (lv_jitter_13_0= ruleSymbolicTimingExpression ) ) | ( (lv_jitter_14_0= ruleValueTimingExpression ) ) ) otherlv_15= 'offset' otherlv_16= '=' ( (lv_offset_17_0= ruleSymbolicTimingExpression ) ) ) | ( ( (lv_offset_18_0= ruleValueTimingExpression ) ) ( (otherlv_19= ',' ( (lv_offset_20_0= ruleSymbolicTimingExpression ) ) ) | ( (lv_offset_21_0= ruleValueTimingExpression ) ) )* otherlv_22= '}' ) )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1492:1: ( (otherlv_0= 'PatternConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'event' ( ( ruleEString ) ) otherlv_5= 'ref' ( ( ruleEString ) ) otherlv_7= 'minimum' otherlv_8= '=' ( ( (lv_minimum_9_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_10_0= ruleValueTimingExpression ) ) ) otherlv_11= 'jitter' otherlv_12= '=' ( ( (lv_jitter_13_0= ruleSymbolicTimingExpression ) ) | ( (lv_jitter_14_0= ruleValueTimingExpression ) ) ) otherlv_15= 'offset' otherlv_16= '=' ( (lv_offset_17_0= ruleSymbolicTimingExpression ) ) ) | ( ( (lv_offset_18_0= ruleValueTimingExpression ) ) ( (otherlv_19= ',' ( (lv_offset_20_0= ruleSymbolicTimingExpression ) ) ) | ( (lv_offset_21_0= ruleValueTimingExpression ) ) )* otherlv_22= '}' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==39) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_INT||LA19_0==54||LA19_0==60||LA19_0==77) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1492:2: (otherlv_0= 'PatternConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'event' ( ( ruleEString ) ) otherlv_5= 'ref' ( ( ruleEString ) ) otherlv_7= 'minimum' otherlv_8= '=' ( ( (lv_minimum_9_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_10_0= ruleValueTimingExpression ) ) ) otherlv_11= 'jitter' otherlv_12= '=' ( ( (lv_jitter_13_0= ruleSymbolicTimingExpression ) ) | ( (lv_jitter_14_0= ruleValueTimingExpression ) ) ) otherlv_15= 'offset' otherlv_16= '=' ( (lv_offset_17_0= ruleSymbolicTimingExpression ) ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1492:2: (otherlv_0= 'PatternConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'event' ( ( ruleEString ) ) otherlv_5= 'ref' ( ( ruleEString ) ) otherlv_7= 'minimum' otherlv_8= '=' ( ( (lv_minimum_9_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_10_0= ruleValueTimingExpression ) ) ) otherlv_11= 'jitter' otherlv_12= '=' ( ( (lv_jitter_13_0= ruleSymbolicTimingExpression ) ) | ( (lv_jitter_14_0= ruleValueTimingExpression ) ) ) otherlv_15= 'offset' otherlv_16= '=' ( (lv_offset_17_0= ruleSymbolicTimingExpression ) ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1492:4: otherlv_0= 'PatternConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'event' ( ( ruleEString ) ) otherlv_5= 'ref' ( ( ruleEString ) ) otherlv_7= 'minimum' otherlv_8= '=' ( ( (lv_minimum_9_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_10_0= ruleValueTimingExpression ) ) ) otherlv_11= 'jitter' otherlv_12= '=' ( ( (lv_jitter_13_0= ruleSymbolicTimingExpression ) ) | ( (lv_jitter_14_0= ruleValueTimingExpression ) ) ) otherlv_15= 'offset' otherlv_16= '=' ( (lv_offset_17_0= ruleSymbolicTimingExpression ) )
                    {
                    otherlv_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_rulePatternConstraint2920); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getPatternConstraintAccess().getPatternConstraintKeyword_0_0());
                          
                    }
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1496:1: ( (lv_name_1_0= ruleEString ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1497:1: (lv_name_1_0= ruleEString )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1497:1: (lv_name_1_0= ruleEString )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1498:3: lv_name_1_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPatternConstraintAccess().getNameEStringParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePatternConstraint2941);
                    lv_name_1_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPatternConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePatternConstraint2953); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPatternConstraintAccess().getLeftCurlyBracketKeyword_0_2());
                          
                    }
                    otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_rulePatternConstraint2965); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPatternConstraintAccess().getEventKeyword_0_3());
                          
                    }
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1522:1: ( ( ruleEString ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1523:1: ( ruleEString )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1523:1: ( ruleEString )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1524:3: ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPatternConstraintRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPatternConstraintAccess().getEventEventCrossReference_0_4_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePatternConstraint2992);
                    ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,40,FollowSets000.FOLLOW_40_in_rulePatternConstraint3004); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getPatternConstraintAccess().getRefKeyword_0_5());
                          
                    }
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1544:1: ( ( ruleEString ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1545:1: ( ruleEString )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1545:1: ( ruleEString )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1546:3: ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPatternConstraintRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPatternConstraintAccess().getRefEventCrossReference_0_6_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePatternConstraint3031);
                    ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,41,FollowSets000.FOLLOW_41_in_rulePatternConstraint3043); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getPatternConstraintAccess().getMinimumKeyword_0_7());
                          
                    }
                    otherlv_8=(Token)match(input,27,FollowSets000.FOLLOW_27_in_rulePatternConstraint3055); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getPatternConstraintAccess().getEqualsSignKeyword_0_8());
                          
                    }
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1570:1: ( ( (lv_minimum_9_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_10_0= ruleValueTimingExpression ) ) )
                    int alt16=2;
                    alt16 = dfa16.predict(input);
                    switch (alt16) {
                        case 1 :
                            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1570:2: ( (lv_minimum_9_0= ruleSymbolicTimingExpression ) )
                            {
                            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1570:2: ( (lv_minimum_9_0= ruleSymbolicTimingExpression ) )
                            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1571:1: (lv_minimum_9_0= ruleSymbolicTimingExpression )
                            {
                            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1571:1: (lv_minimum_9_0= ruleSymbolicTimingExpression )
                            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1572:3: lv_minimum_9_0= ruleSymbolicTimingExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPatternConstraintAccess().getMinimumSymbolicTimingExpressionParserRuleCall_0_9_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleSymbolicTimingExpression_in_rulePatternConstraint3077);
                            lv_minimum_9_0=ruleSymbolicTimingExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getPatternConstraintRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"minimum",
                                      		lv_minimum_9_0, 
                                      		"SymbolicTimingExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1589:6: ( (lv_minimum_10_0= ruleValueTimingExpression ) )
                            {
                            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1589:6: ( (lv_minimum_10_0= ruleValueTimingExpression ) )
                            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1590:1: (lv_minimum_10_0= ruleValueTimingExpression )
                            {
                            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1590:1: (lv_minimum_10_0= ruleValueTimingExpression )
                            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1591:3: lv_minimum_10_0= ruleValueTimingExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPatternConstraintAccess().getMinimumValueTimingExpressionParserRuleCall_0_9_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleValueTimingExpression_in_rulePatternConstraint3104);
                            lv_minimum_10_0=ruleValueTimingExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getPatternConstraintRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"minimum",
                                      		lv_minimum_10_0, 
                                      		"ValueTimingExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,32,FollowSets000.FOLLOW_32_in_rulePatternConstraint3117); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getPatternConstraintAccess().getJitterKeyword_0_10());
                          
                    }
                    otherlv_12=(Token)match(input,27,FollowSets000.FOLLOW_27_in_rulePatternConstraint3129); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getPatternConstraintAccess().getEqualsSignKeyword_0_11());
                          
                    }
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1615:1: ( ( (lv_jitter_13_0= ruleSymbolicTimingExpression ) ) | ( (lv_jitter_14_0= ruleValueTimingExpression ) ) )
                    int alt17=2;
                    alt17 = dfa17.predict(input);
                    switch (alt17) {
                        case 1 :
                            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1615:2: ( (lv_jitter_13_0= ruleSymbolicTimingExpression ) )
                            {
                            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1615:2: ( (lv_jitter_13_0= ruleSymbolicTimingExpression ) )
                            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1616:1: (lv_jitter_13_0= ruleSymbolicTimingExpression )
                            {
                            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1616:1: (lv_jitter_13_0= ruleSymbolicTimingExpression )
                            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1617:3: lv_jitter_13_0= ruleSymbolicTimingExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPatternConstraintAccess().getJitterSymbolicTimingExpressionParserRuleCall_0_12_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleSymbolicTimingExpression_in_rulePatternConstraint3151);
                            lv_jitter_13_0=ruleSymbolicTimingExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getPatternConstraintRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"jitter",
                                      		lv_jitter_13_0, 
                                      		"SymbolicTimingExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1634:6: ( (lv_jitter_14_0= ruleValueTimingExpression ) )
                            {
                            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1634:6: ( (lv_jitter_14_0= ruleValueTimingExpression ) )
                            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1635:1: (lv_jitter_14_0= ruleValueTimingExpression )
                            {
                            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1635:1: (lv_jitter_14_0= ruleValueTimingExpression )
                            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1636:3: lv_jitter_14_0= ruleValueTimingExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPatternConstraintAccess().getJitterValueTimingExpressionParserRuleCall_0_12_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleValueTimingExpression_in_rulePatternConstraint3178);
                            lv_jitter_14_0=ruleValueTimingExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getPatternConstraintRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"jitter",
                                      		lv_jitter_14_0, 
                                      		"ValueTimingExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,42,FollowSets000.FOLLOW_42_in_rulePatternConstraint3191); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getPatternConstraintAccess().getOffsetKeyword_0_13());
                          
                    }
                    otherlv_16=(Token)match(input,27,FollowSets000.FOLLOW_27_in_rulePatternConstraint3203); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getPatternConstraintAccess().getEqualsSignKeyword_0_14());
                          
                    }
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1660:1: ( (lv_offset_17_0= ruleSymbolicTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1661:1: (lv_offset_17_0= ruleSymbolicTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1661:1: (lv_offset_17_0= ruleSymbolicTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1662:3: lv_offset_17_0= ruleSymbolicTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPatternConstraintAccess().getOffsetSymbolicTimingExpressionParserRuleCall_0_15_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSymbolicTimingExpression_in_rulePatternConstraint3224);
                    lv_offset_17_0=ruleSymbolicTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPatternConstraintRule());
                      	        }
                             		add(
                             			current, 
                             			"offset",
                              		lv_offset_17_0, 
                              		"SymbolicTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1679:6: ( ( (lv_offset_18_0= ruleValueTimingExpression ) ) ( (otherlv_19= ',' ( (lv_offset_20_0= ruleSymbolicTimingExpression ) ) ) | ( (lv_offset_21_0= ruleValueTimingExpression ) ) )* otherlv_22= '}' )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1679:6: ( ( (lv_offset_18_0= ruleValueTimingExpression ) ) ( (otherlv_19= ',' ( (lv_offset_20_0= ruleSymbolicTimingExpression ) ) ) | ( (lv_offset_21_0= ruleValueTimingExpression ) ) )* otherlv_22= '}' )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1679:7: ( (lv_offset_18_0= ruleValueTimingExpression ) ) ( (otherlv_19= ',' ( (lv_offset_20_0= ruleSymbolicTimingExpression ) ) ) | ( (lv_offset_21_0= ruleValueTimingExpression ) ) )* otherlv_22= '}'
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1679:7: ( (lv_offset_18_0= ruleValueTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1680:1: (lv_offset_18_0= ruleValueTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1680:1: (lv_offset_18_0= ruleValueTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1681:3: lv_offset_18_0= ruleValueTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPatternConstraintAccess().getOffsetValueTimingExpressionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValueTimingExpression_in_rulePatternConstraint3253);
                    lv_offset_18_0=ruleValueTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPatternConstraintRule());
                      	        }
                             		add(
                             			current, 
                             			"offset",
                              		lv_offset_18_0, 
                              		"ValueTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1697:2: ( (otherlv_19= ',' ( (lv_offset_20_0= ruleSymbolicTimingExpression ) ) ) | ( (lv_offset_21_0= ruleValueTimingExpression ) ) )*
                    loop18:
                    do {
                        int alt18=3;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==18) ) {
                            alt18=1;
                        }
                        else if ( (LA18_0==RULE_INT||LA18_0==54||LA18_0==60||LA18_0==77) ) {
                            alt18=2;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1697:3: (otherlv_19= ',' ( (lv_offset_20_0= ruleSymbolicTimingExpression ) ) )
                    	    {
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1697:3: (otherlv_19= ',' ( (lv_offset_20_0= ruleSymbolicTimingExpression ) ) )
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1697:5: otherlv_19= ',' ( (lv_offset_20_0= ruleSymbolicTimingExpression ) )
                    	    {
                    	    otherlv_19=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulePatternConstraint3267); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_19, grammarAccess.getPatternConstraintAccess().getCommaKeyword_1_1_0_0());
                    	          
                    	    }
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1701:1: ( (lv_offset_20_0= ruleSymbolicTimingExpression ) )
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1702:1: (lv_offset_20_0= ruleSymbolicTimingExpression )
                    	    {
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1702:1: (lv_offset_20_0= ruleSymbolicTimingExpression )
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1703:3: lv_offset_20_0= ruleSymbolicTimingExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPatternConstraintAccess().getOffsetSymbolicTimingExpressionParserRuleCall_1_1_0_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleSymbolicTimingExpression_in_rulePatternConstraint3288);
                    	    lv_offset_20_0=ruleSymbolicTimingExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getPatternConstraintRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"offset",
                    	              		lv_offset_20_0, 
                    	              		"SymbolicTimingExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1720:6: ( (lv_offset_21_0= ruleValueTimingExpression ) )
                    	    {
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1720:6: ( (lv_offset_21_0= ruleValueTimingExpression ) )
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1721:1: (lv_offset_21_0= ruleValueTimingExpression )
                    	    {
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1721:1: (lv_offset_21_0= ruleValueTimingExpression )
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1722:3: lv_offset_21_0= ruleValueTimingExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPatternConstraintAccess().getOffsetValueTimingExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleValueTimingExpression_in_rulePatternConstraint3316);
                    	    lv_offset_21_0=ruleValueTimingExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getPatternConstraintRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"offset",
                    	              		lv_offset_21_0, 
                    	              		"ValueTimingExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePatternConstraint3330); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getPatternConstraintAccess().getRightCurlyBracketKeyword_1_2());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatternConstraint"


    // $ANTLR start "entryRuleSporadicConstraint"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1750:1: entryRuleSporadicConstraint returns [EObject current=null] : iv_ruleSporadicConstraint= ruleSporadicConstraint EOF ;
    public final EObject entryRuleSporadicConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSporadicConstraint = null;


        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1751:2: (iv_ruleSporadicConstraint= ruleSporadicConstraint EOF )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1752:2: iv_ruleSporadicConstraint= ruleSporadicConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSporadicConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSporadicConstraint_in_entryRuleSporadicConstraint3367);
            iv_ruleSporadicConstraint=ruleSporadicConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSporadicConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSporadicConstraint3377); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSporadicConstraint"


    // $ANTLR start "ruleSporadicConstraint"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1759:1: ruleSporadicConstraint returns [EObject current=null] : (otherlv_0= 'SporadicConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'event' ( ( ruleEString ) ) otherlv_5= 'lower' otherlv_6= '=' ( ( (lv_lower_7_0= ruleSymbolicTimingExpression ) ) | ( (lv_lower_8_0= ruleValueTimingExpression ) ) ) otherlv_9= 'upper' otherlv_10= '=' ( ( (lv_upper_11_0= ruleSymbolicTimingExpression ) ) | ( (lv_upper_12_0= ruleValueTimingExpression ) ) ) otherlv_13= 'jitter' otherlv_14= '=' ( ( (lv_jitter_15_0= ruleSymbolicTimingExpression ) ) | ( (lv_jitter_16_0= ruleValueTimingExpression ) ) ) otherlv_17= 'minimum' otherlv_18= '=' ( ( (lv_minimum_19_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_20_0= ruleValueTimingExpression ) ) ) otherlv_21= '}' ) ;
    public final EObject ruleSporadicConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_lower_7_0 = null;

        EObject lv_lower_8_0 = null;

        EObject lv_upper_11_0 = null;

        EObject lv_upper_12_0 = null;

        EObject lv_jitter_15_0 = null;

        EObject lv_jitter_16_0 = null;

        EObject lv_minimum_19_0 = null;

        EObject lv_minimum_20_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1762:28: ( (otherlv_0= 'SporadicConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'event' ( ( ruleEString ) ) otherlv_5= 'lower' otherlv_6= '=' ( ( (lv_lower_7_0= ruleSymbolicTimingExpression ) ) | ( (lv_lower_8_0= ruleValueTimingExpression ) ) ) otherlv_9= 'upper' otherlv_10= '=' ( ( (lv_upper_11_0= ruleSymbolicTimingExpression ) ) | ( (lv_upper_12_0= ruleValueTimingExpression ) ) ) otherlv_13= 'jitter' otherlv_14= '=' ( ( (lv_jitter_15_0= ruleSymbolicTimingExpression ) ) | ( (lv_jitter_16_0= ruleValueTimingExpression ) ) ) otherlv_17= 'minimum' otherlv_18= '=' ( ( (lv_minimum_19_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_20_0= ruleValueTimingExpression ) ) ) otherlv_21= '}' ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1763:1: (otherlv_0= 'SporadicConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'event' ( ( ruleEString ) ) otherlv_5= 'lower' otherlv_6= '=' ( ( (lv_lower_7_0= ruleSymbolicTimingExpression ) ) | ( (lv_lower_8_0= ruleValueTimingExpression ) ) ) otherlv_9= 'upper' otherlv_10= '=' ( ( (lv_upper_11_0= ruleSymbolicTimingExpression ) ) | ( (lv_upper_12_0= ruleValueTimingExpression ) ) ) otherlv_13= 'jitter' otherlv_14= '=' ( ( (lv_jitter_15_0= ruleSymbolicTimingExpression ) ) | ( (lv_jitter_16_0= ruleValueTimingExpression ) ) ) otherlv_17= 'minimum' otherlv_18= '=' ( ( (lv_minimum_19_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_20_0= ruleValueTimingExpression ) ) ) otherlv_21= '}' )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1763:1: (otherlv_0= 'SporadicConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'event' ( ( ruleEString ) ) otherlv_5= 'lower' otherlv_6= '=' ( ( (lv_lower_7_0= ruleSymbolicTimingExpression ) ) | ( (lv_lower_8_0= ruleValueTimingExpression ) ) ) otherlv_9= 'upper' otherlv_10= '=' ( ( (lv_upper_11_0= ruleSymbolicTimingExpression ) ) | ( (lv_upper_12_0= ruleValueTimingExpression ) ) ) otherlv_13= 'jitter' otherlv_14= '=' ( ( (lv_jitter_15_0= ruleSymbolicTimingExpression ) ) | ( (lv_jitter_16_0= ruleValueTimingExpression ) ) ) otherlv_17= 'minimum' otherlv_18= '=' ( ( (lv_minimum_19_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_20_0= ruleValueTimingExpression ) ) ) otherlv_21= '}' )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1763:3: otherlv_0= 'SporadicConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'event' ( ( ruleEString ) ) otherlv_5= 'lower' otherlv_6= '=' ( ( (lv_lower_7_0= ruleSymbolicTimingExpression ) ) | ( (lv_lower_8_0= ruleValueTimingExpression ) ) ) otherlv_9= 'upper' otherlv_10= '=' ( ( (lv_upper_11_0= ruleSymbolicTimingExpression ) ) | ( (lv_upper_12_0= ruleValueTimingExpression ) ) ) otherlv_13= 'jitter' otherlv_14= '=' ( ( (lv_jitter_15_0= ruleSymbolicTimingExpression ) ) | ( (lv_jitter_16_0= ruleValueTimingExpression ) ) ) otherlv_17= 'minimum' otherlv_18= '=' ( ( (lv_minimum_19_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_20_0= ruleValueTimingExpression ) ) ) otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleSporadicConstraint3414); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSporadicConstraintAccess().getSporadicConstraintKeyword_0());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1767:1: ( (lv_name_1_0= ruleEString ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1768:1: (lv_name_1_0= ruleEString )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1768:1: (lv_name_1_0= ruleEString )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1769:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSporadicConstraintAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSporadicConstraint3435);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSporadicConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSporadicConstraint3447); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSporadicConstraintAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleSporadicConstraint3459); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSporadicConstraintAccess().getEventKeyword_3());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1793:1: ( ( ruleEString ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1794:1: ( ruleEString )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1794:1: ( ruleEString )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1795:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSporadicConstraintRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSporadicConstraintAccess().getEventEventCrossReference_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSporadicConstraint3486);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleSporadicConstraint3498); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getSporadicConstraintAccess().getLowerKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleSporadicConstraint3510); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getSporadicConstraintAccess().getEqualsSignKeyword_6());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1819:1: ( ( (lv_lower_7_0= ruleSymbolicTimingExpression ) ) | ( (lv_lower_8_0= ruleValueTimingExpression ) ) )
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1819:2: ( (lv_lower_7_0= ruleSymbolicTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1819:2: ( (lv_lower_7_0= ruleSymbolicTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1820:1: (lv_lower_7_0= ruleSymbolicTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1820:1: (lv_lower_7_0= ruleSymbolicTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1821:3: lv_lower_7_0= ruleSymbolicTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSporadicConstraintAccess().getLowerSymbolicTimingExpressionParserRuleCall_7_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSymbolicTimingExpression_in_ruleSporadicConstraint3532);
                    lv_lower_7_0=ruleSymbolicTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSporadicConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"lower",
                              		lv_lower_7_0, 
                              		"SymbolicTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1838:6: ( (lv_lower_8_0= ruleValueTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1838:6: ( (lv_lower_8_0= ruleValueTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1839:1: (lv_lower_8_0= ruleValueTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1839:1: (lv_lower_8_0= ruleValueTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1840:3: lv_lower_8_0= ruleValueTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSporadicConstraintAccess().getLowerValueTimingExpressionParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValueTimingExpression_in_ruleSporadicConstraint3559);
                    lv_lower_8_0=ruleValueTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSporadicConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"lower",
                              		lv_lower_8_0, 
                              		"ValueTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleSporadicConstraint3572); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getSporadicConstraintAccess().getUpperKeyword_8());
                  
            }
            otherlv_10=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleSporadicConstraint3584); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getSporadicConstraintAccess().getEqualsSignKeyword_9());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1864:1: ( ( (lv_upper_11_0= ruleSymbolicTimingExpression ) ) | ( (lv_upper_12_0= ruleValueTimingExpression ) ) )
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1864:2: ( (lv_upper_11_0= ruleSymbolicTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1864:2: ( (lv_upper_11_0= ruleSymbolicTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1865:1: (lv_upper_11_0= ruleSymbolicTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1865:1: (lv_upper_11_0= ruleSymbolicTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1866:3: lv_upper_11_0= ruleSymbolicTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSporadicConstraintAccess().getUpperSymbolicTimingExpressionParserRuleCall_10_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSymbolicTimingExpression_in_ruleSporadicConstraint3606);
                    lv_upper_11_0=ruleSymbolicTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSporadicConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"upper",
                              		lv_upper_11_0, 
                              		"SymbolicTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1883:6: ( (lv_upper_12_0= ruleValueTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1883:6: ( (lv_upper_12_0= ruleValueTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1884:1: (lv_upper_12_0= ruleValueTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1884:1: (lv_upper_12_0= ruleValueTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1885:3: lv_upper_12_0= ruleValueTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSporadicConstraintAccess().getUpperValueTimingExpressionParserRuleCall_10_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValueTimingExpression_in_ruleSporadicConstraint3633);
                    lv_upper_12_0=ruleValueTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSporadicConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"upper",
                              		lv_upper_12_0, 
                              		"ValueTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleSporadicConstraint3646); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getSporadicConstraintAccess().getJitterKeyword_11());
                  
            }
            otherlv_14=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleSporadicConstraint3658); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getSporadicConstraintAccess().getEqualsSignKeyword_12());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1909:1: ( ( (lv_jitter_15_0= ruleSymbolicTimingExpression ) ) | ( (lv_jitter_16_0= ruleValueTimingExpression ) ) )
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1909:2: ( (lv_jitter_15_0= ruleSymbolicTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1909:2: ( (lv_jitter_15_0= ruleSymbolicTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1910:1: (lv_jitter_15_0= ruleSymbolicTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1910:1: (lv_jitter_15_0= ruleSymbolicTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1911:3: lv_jitter_15_0= ruleSymbolicTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSporadicConstraintAccess().getJitterSymbolicTimingExpressionParserRuleCall_13_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSymbolicTimingExpression_in_ruleSporadicConstraint3680);
                    lv_jitter_15_0=ruleSymbolicTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSporadicConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"jitter",
                              		lv_jitter_15_0, 
                              		"SymbolicTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1928:6: ( (lv_jitter_16_0= ruleValueTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1928:6: ( (lv_jitter_16_0= ruleValueTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1929:1: (lv_jitter_16_0= ruleValueTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1929:1: (lv_jitter_16_0= ruleValueTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1930:3: lv_jitter_16_0= ruleValueTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSporadicConstraintAccess().getJitterValueTimingExpressionParserRuleCall_13_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValueTimingExpression_in_ruleSporadicConstraint3707);
                    lv_jitter_16_0=ruleValueTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSporadicConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"jitter",
                              		lv_jitter_16_0, 
                              		"ValueTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleSporadicConstraint3720); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getSporadicConstraintAccess().getMinimumKeyword_14());
                  
            }
            otherlv_18=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleSporadicConstraint3732); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_18, grammarAccess.getSporadicConstraintAccess().getEqualsSignKeyword_15());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1954:1: ( ( (lv_minimum_19_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_20_0= ruleValueTimingExpression ) ) )
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1954:2: ( (lv_minimum_19_0= ruleSymbolicTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1954:2: ( (lv_minimum_19_0= ruleSymbolicTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1955:1: (lv_minimum_19_0= ruleSymbolicTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1955:1: (lv_minimum_19_0= ruleSymbolicTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1956:3: lv_minimum_19_0= ruleSymbolicTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSporadicConstraintAccess().getMinimumSymbolicTimingExpressionParserRuleCall_16_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSymbolicTimingExpression_in_ruleSporadicConstraint3754);
                    lv_minimum_19_0=ruleSymbolicTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSporadicConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"minimum",
                              		lv_minimum_19_0, 
                              		"SymbolicTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1973:6: ( (lv_minimum_20_0= ruleValueTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1973:6: ( (lv_minimum_20_0= ruleValueTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1974:1: (lv_minimum_20_0= ruleValueTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1974:1: (lv_minimum_20_0= ruleValueTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:1975:3: lv_minimum_20_0= ruleValueTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSporadicConstraintAccess().getMinimumValueTimingExpressionParserRuleCall_16_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValueTimingExpression_in_ruleSporadicConstraint3781);
                    lv_minimum_20_0=ruleValueTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSporadicConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"minimum",
                              		lv_minimum_20_0, 
                              		"ValueTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_21=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSporadicConstraint3794); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_21, grammarAccess.getSporadicConstraintAccess().getRightCurlyBracketKeyword_17());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSporadicConstraint"


    // $ANTLR start "entryRulePeriodicConstraint"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2003:1: entryRulePeriodicConstraint returns [EObject current=null] : iv_rulePeriodicConstraint= rulePeriodicConstraint EOF ;
    public final EObject entryRulePeriodicConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePeriodicConstraint = null;


        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2004:2: (iv_rulePeriodicConstraint= rulePeriodicConstraint EOF )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2005:2: iv_rulePeriodicConstraint= rulePeriodicConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPeriodicConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePeriodicConstraint_in_entryRulePeriodicConstraint3830);
            iv_rulePeriodicConstraint=rulePeriodicConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePeriodicConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePeriodicConstraint3840); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePeriodicConstraint"


    // $ANTLR start "rulePeriodicConstraint"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2012:1: rulePeriodicConstraint returns [EObject current=null] : (otherlv_0= 'PeriodicConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'event' ( ( ruleEString ) ) otherlv_5= 'period' otherlv_6= '=' ( ( (lv_period_7_0= ruleSymbolicTimingExpression ) ) | ( (lv_period_8_0= ruleValueTimingExpression ) ) ) otherlv_9= 'minimum' otherlv_10= '=' ( ( (lv_minimum_11_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_12_0= ruleValueTimingExpression ) ) ) otherlv_13= 'jitter' otherlv_14= '=' ( ( (lv_jitter_15_0= ruleSymbolicTimingExpression ) ) | ( (lv_jitter_16_0= ruleValueTimingExpression ) ) ) otherlv_17= '}' ) ;
    public final EObject rulePeriodicConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_period_7_0 = null;

        EObject lv_period_8_0 = null;

        EObject lv_minimum_11_0 = null;

        EObject lv_minimum_12_0 = null;

        EObject lv_jitter_15_0 = null;

        EObject lv_jitter_16_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2015:28: ( (otherlv_0= 'PeriodicConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'event' ( ( ruleEString ) ) otherlv_5= 'period' otherlv_6= '=' ( ( (lv_period_7_0= ruleSymbolicTimingExpression ) ) | ( (lv_period_8_0= ruleValueTimingExpression ) ) ) otherlv_9= 'minimum' otherlv_10= '=' ( ( (lv_minimum_11_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_12_0= ruleValueTimingExpression ) ) ) otherlv_13= 'jitter' otherlv_14= '=' ( ( (lv_jitter_15_0= ruleSymbolicTimingExpression ) ) | ( (lv_jitter_16_0= ruleValueTimingExpression ) ) ) otherlv_17= '}' ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2016:1: (otherlv_0= 'PeriodicConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'event' ( ( ruleEString ) ) otherlv_5= 'period' otherlv_6= '=' ( ( (lv_period_7_0= ruleSymbolicTimingExpression ) ) | ( (lv_period_8_0= ruleValueTimingExpression ) ) ) otherlv_9= 'minimum' otherlv_10= '=' ( ( (lv_minimum_11_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_12_0= ruleValueTimingExpression ) ) ) otherlv_13= 'jitter' otherlv_14= '=' ( ( (lv_jitter_15_0= ruleSymbolicTimingExpression ) ) | ( (lv_jitter_16_0= ruleValueTimingExpression ) ) ) otherlv_17= '}' )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2016:1: (otherlv_0= 'PeriodicConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'event' ( ( ruleEString ) ) otherlv_5= 'period' otherlv_6= '=' ( ( (lv_period_7_0= ruleSymbolicTimingExpression ) ) | ( (lv_period_8_0= ruleValueTimingExpression ) ) ) otherlv_9= 'minimum' otherlv_10= '=' ( ( (lv_minimum_11_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_12_0= ruleValueTimingExpression ) ) ) otherlv_13= 'jitter' otherlv_14= '=' ( ( (lv_jitter_15_0= ruleSymbolicTimingExpression ) ) | ( (lv_jitter_16_0= ruleValueTimingExpression ) ) ) otherlv_17= '}' )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2016:3: otherlv_0= 'PeriodicConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'event' ( ( ruleEString ) ) otherlv_5= 'period' otherlv_6= '=' ( ( (lv_period_7_0= ruleSymbolicTimingExpression ) ) | ( (lv_period_8_0= ruleValueTimingExpression ) ) ) otherlv_9= 'minimum' otherlv_10= '=' ( ( (lv_minimum_11_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_12_0= ruleValueTimingExpression ) ) ) otherlv_13= 'jitter' otherlv_14= '=' ( ( (lv_jitter_15_0= ruleSymbolicTimingExpression ) ) | ( (lv_jitter_16_0= ruleValueTimingExpression ) ) ) otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_rulePeriodicConstraint3877); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPeriodicConstraintAccess().getPeriodicConstraintKeyword_0());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2020:1: ( (lv_name_1_0= ruleEString ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2021:1: (lv_name_1_0= ruleEString )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2021:1: (lv_name_1_0= ruleEString )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2022:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPeriodicConstraintAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePeriodicConstraint3898);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPeriodicConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePeriodicConstraint3910); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPeriodicConstraintAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_rulePeriodicConstraint3922); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPeriodicConstraintAccess().getEventKeyword_3());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2046:1: ( ( ruleEString ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2047:1: ( ruleEString )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2047:1: ( ruleEString )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2048:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPeriodicConstraintRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPeriodicConstraintAccess().getEventEventCrossReference_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePeriodicConstraint3949);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,45,FollowSets000.FOLLOW_45_in_rulePeriodicConstraint3961); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getPeriodicConstraintAccess().getPeriodKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,27,FollowSets000.FOLLOW_27_in_rulePeriodicConstraint3973); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getPeriodicConstraintAccess().getEqualsSignKeyword_6());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2072:1: ( ( (lv_period_7_0= ruleSymbolicTimingExpression ) ) | ( (lv_period_8_0= ruleValueTimingExpression ) ) )
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2072:2: ( (lv_period_7_0= ruleSymbolicTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2072:2: ( (lv_period_7_0= ruleSymbolicTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2073:1: (lv_period_7_0= ruleSymbolicTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2073:1: (lv_period_7_0= ruleSymbolicTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2074:3: lv_period_7_0= ruleSymbolicTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPeriodicConstraintAccess().getPeriodSymbolicTimingExpressionParserRuleCall_7_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSymbolicTimingExpression_in_rulePeriodicConstraint3995);
                    lv_period_7_0=ruleSymbolicTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPeriodicConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"period",
                              		lv_period_7_0, 
                              		"SymbolicTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2091:6: ( (lv_period_8_0= ruleValueTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2091:6: ( (lv_period_8_0= ruleValueTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2092:1: (lv_period_8_0= ruleValueTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2092:1: (lv_period_8_0= ruleValueTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2093:3: lv_period_8_0= ruleValueTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPeriodicConstraintAccess().getPeriodValueTimingExpressionParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValueTimingExpression_in_rulePeriodicConstraint4022);
                    lv_period_8_0=ruleValueTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPeriodicConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"period",
                              		lv_period_8_0, 
                              		"ValueTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,41,FollowSets000.FOLLOW_41_in_rulePeriodicConstraint4035); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getPeriodicConstraintAccess().getMinimumKeyword_8());
                  
            }
            otherlv_10=(Token)match(input,27,FollowSets000.FOLLOW_27_in_rulePeriodicConstraint4047); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getPeriodicConstraintAccess().getEqualsSignKeyword_9());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2117:1: ( ( (lv_minimum_11_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_12_0= ruleValueTimingExpression ) ) )
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2117:2: ( (lv_minimum_11_0= ruleSymbolicTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2117:2: ( (lv_minimum_11_0= ruleSymbolicTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2118:1: (lv_minimum_11_0= ruleSymbolicTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2118:1: (lv_minimum_11_0= ruleSymbolicTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2119:3: lv_minimum_11_0= ruleSymbolicTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPeriodicConstraintAccess().getMinimumSymbolicTimingExpressionParserRuleCall_10_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSymbolicTimingExpression_in_rulePeriodicConstraint4069);
                    lv_minimum_11_0=ruleSymbolicTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPeriodicConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"minimum",
                              		lv_minimum_11_0, 
                              		"SymbolicTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2136:6: ( (lv_minimum_12_0= ruleValueTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2136:6: ( (lv_minimum_12_0= ruleValueTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2137:1: (lv_minimum_12_0= ruleValueTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2137:1: (lv_minimum_12_0= ruleValueTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2138:3: lv_minimum_12_0= ruleValueTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPeriodicConstraintAccess().getMinimumValueTimingExpressionParserRuleCall_10_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValueTimingExpression_in_rulePeriodicConstraint4096);
                    lv_minimum_12_0=ruleValueTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPeriodicConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"minimum",
                              		lv_minimum_12_0, 
                              		"ValueTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,32,FollowSets000.FOLLOW_32_in_rulePeriodicConstraint4109); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getPeriodicConstraintAccess().getJitterKeyword_11());
                  
            }
            otherlv_14=(Token)match(input,27,FollowSets000.FOLLOW_27_in_rulePeriodicConstraint4121); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getPeriodicConstraintAccess().getEqualsSignKeyword_12());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2162:1: ( ( (lv_jitter_15_0= ruleSymbolicTimingExpression ) ) | ( (lv_jitter_16_0= ruleValueTimingExpression ) ) )
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2162:2: ( (lv_jitter_15_0= ruleSymbolicTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2162:2: ( (lv_jitter_15_0= ruleSymbolicTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2163:1: (lv_jitter_15_0= ruleSymbolicTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2163:1: (lv_jitter_15_0= ruleSymbolicTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2164:3: lv_jitter_15_0= ruleSymbolicTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPeriodicConstraintAccess().getJitterSymbolicTimingExpressionParserRuleCall_13_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSymbolicTimingExpression_in_rulePeriodicConstraint4143);
                    lv_jitter_15_0=ruleSymbolicTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPeriodicConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"jitter",
                              		lv_jitter_15_0, 
                              		"SymbolicTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2181:6: ( (lv_jitter_16_0= ruleValueTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2181:6: ( (lv_jitter_16_0= ruleValueTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2182:1: (lv_jitter_16_0= ruleValueTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2182:1: (lv_jitter_16_0= ruleValueTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2183:3: lv_jitter_16_0= ruleValueTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPeriodicConstraintAccess().getJitterValueTimingExpressionParserRuleCall_13_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValueTimingExpression_in_rulePeriodicConstraint4170);
                    lv_jitter_16_0=ruleValueTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPeriodicConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"jitter",
                              		lv_jitter_16_0, 
                              		"ValueTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePeriodicConstraint4183); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getPeriodicConstraintAccess().getRightCurlyBracketKeyword_14());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePeriodicConstraint"


    // $ANTLR start "entryRuleArbitraryConstraint"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2211:1: entryRuleArbitraryConstraint returns [EObject current=null] : iv_ruleArbitraryConstraint= ruleArbitraryConstraint EOF ;
    public final EObject entryRuleArbitraryConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArbitraryConstraint = null;


        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2212:2: (iv_ruleArbitraryConstraint= ruleArbitraryConstraint EOF )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2213:2: iv_ruleArbitraryConstraint= ruleArbitraryConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArbitraryConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleArbitraryConstraint_in_entryRuleArbitraryConstraint4219);
            iv_ruleArbitraryConstraint=ruleArbitraryConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArbitraryConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArbitraryConstraint4229); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArbitraryConstraint"


    // $ANTLR start "ruleArbitraryConstraint"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2220:1: ruleArbitraryConstraint returns [EObject current=null] : ( (otherlv_0= 'ArbitraryConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'event' ( ( ruleEString ) ) otherlv_5= 'minimum' otherlv_6= '=' ( (lv_minimum_7_0= ruleSymbolicTimingExpression ) ) ) | ( ( (lv_minimum_8_0= ruleValueTimingExpression ) ) ( (otherlv_9= ',' ( (lv_minimum_10_0= ruleSymbolicTimingExpression ) ) ) | ( (lv_minimum_11_0= ruleValueTimingExpression ) ) )* otherlv_12= 'maximum' otherlv_13= '=' ( (lv_maximum_14_0= ruleSymbolicTimingExpression ) ) ) | ( ( (lv_maximum_15_0= ruleValueTimingExpression ) ) ( (otherlv_16= ',' ( (lv_maximum_17_0= ruleSymbolicTimingExpression ) ) ) | ( (lv_maximum_18_0= ruleValueTimingExpression ) ) )* otherlv_19= '}' ) ) ;
    public final EObject ruleArbitraryConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_16=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_minimum_7_0 = null;

        EObject lv_minimum_8_0 = null;

        EObject lv_minimum_10_0 = null;

        EObject lv_minimum_11_0 = null;

        EObject lv_maximum_14_0 = null;

        EObject lv_maximum_15_0 = null;

        EObject lv_maximum_17_0 = null;

        EObject lv_maximum_18_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2223:28: ( ( (otherlv_0= 'ArbitraryConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'event' ( ( ruleEString ) ) otherlv_5= 'minimum' otherlv_6= '=' ( (lv_minimum_7_0= ruleSymbolicTimingExpression ) ) ) | ( ( (lv_minimum_8_0= ruleValueTimingExpression ) ) ( (otherlv_9= ',' ( (lv_minimum_10_0= ruleSymbolicTimingExpression ) ) ) | ( (lv_minimum_11_0= ruleValueTimingExpression ) ) )* otherlv_12= 'maximum' otherlv_13= '=' ( (lv_maximum_14_0= ruleSymbolicTimingExpression ) ) ) | ( ( (lv_maximum_15_0= ruleValueTimingExpression ) ) ( (otherlv_16= ',' ( (lv_maximum_17_0= ruleSymbolicTimingExpression ) ) ) | ( (lv_maximum_18_0= ruleValueTimingExpression ) ) )* otherlv_19= '}' ) ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2224:1: ( (otherlv_0= 'ArbitraryConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'event' ( ( ruleEString ) ) otherlv_5= 'minimum' otherlv_6= '=' ( (lv_minimum_7_0= ruleSymbolicTimingExpression ) ) ) | ( ( (lv_minimum_8_0= ruleValueTimingExpression ) ) ( (otherlv_9= ',' ( (lv_minimum_10_0= ruleSymbolicTimingExpression ) ) ) | ( (lv_minimum_11_0= ruleValueTimingExpression ) ) )* otherlv_12= 'maximum' otherlv_13= '=' ( (lv_maximum_14_0= ruleSymbolicTimingExpression ) ) ) | ( ( (lv_maximum_15_0= ruleValueTimingExpression ) ) ( (otherlv_16= ',' ( (lv_maximum_17_0= ruleSymbolicTimingExpression ) ) ) | ( (lv_maximum_18_0= ruleValueTimingExpression ) ) )* otherlv_19= '}' ) )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2224:1: ( (otherlv_0= 'ArbitraryConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'event' ( ( ruleEString ) ) otherlv_5= 'minimum' otherlv_6= '=' ( (lv_minimum_7_0= ruleSymbolicTimingExpression ) ) ) | ( ( (lv_minimum_8_0= ruleValueTimingExpression ) ) ( (otherlv_9= ',' ( (lv_minimum_10_0= ruleSymbolicTimingExpression ) ) ) | ( (lv_minimum_11_0= ruleValueTimingExpression ) ) )* otherlv_12= 'maximum' otherlv_13= '=' ( (lv_maximum_14_0= ruleSymbolicTimingExpression ) ) ) | ( ( (lv_maximum_15_0= ruleValueTimingExpression ) ) ( (otherlv_16= ',' ( (lv_maximum_17_0= ruleSymbolicTimingExpression ) ) ) | ( (lv_maximum_18_0= ruleValueTimingExpression ) ) )* otherlv_19= '}' ) )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt29=1;
                }
                break;
            case 54:
                {
                int LA29_2 = input.LA(2);

                if ( (synpred48_InternalTadl2()) ) {
                    alt29=2;
                }
                else if ( (true) ) {
                    alt29=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 2, input);

                    throw nvae;
                }
                }
                break;
            case 60:
                {
                int LA29_3 = input.LA(2);

                if ( (synpred48_InternalTadl2()) ) {
                    alt29=2;
                }
                else if ( (true) ) {
                    alt29=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA29_4 = input.LA(2);

                if ( (synpred48_InternalTadl2()) ) {
                    alt29=2;
                }
                else if ( (true) ) {
                    alt29=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 4, input);

                    throw nvae;
                }
                }
                break;
            case 77:
                {
                int LA29_5 = input.LA(2);

                if ( (synpred48_InternalTadl2()) ) {
                    alt29=2;
                }
                else if ( (true) ) {
                    alt29=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2224:2: (otherlv_0= 'ArbitraryConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'event' ( ( ruleEString ) ) otherlv_5= 'minimum' otherlv_6= '=' ( (lv_minimum_7_0= ruleSymbolicTimingExpression ) ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2224:2: (otherlv_0= 'ArbitraryConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'event' ( ( ruleEString ) ) otherlv_5= 'minimum' otherlv_6= '=' ( (lv_minimum_7_0= ruleSymbolicTimingExpression ) ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2224:4: otherlv_0= 'ArbitraryConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'event' ( ( ruleEString ) ) otherlv_5= 'minimum' otherlv_6= '=' ( (lv_minimum_7_0= ruleSymbolicTimingExpression ) )
                    {
                    otherlv_0=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleArbitraryConstraint4267); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getArbitraryConstraintAccess().getArbitraryConstraintKeyword_0_0());
                          
                    }
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2228:1: ( (lv_name_1_0= ruleEString ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2229:1: (lv_name_1_0= ruleEString )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2229:1: (lv_name_1_0= ruleEString )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2230:3: lv_name_1_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArbitraryConstraintAccess().getNameEStringParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArbitraryConstraint4288);
                    lv_name_1_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArbitraryConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleArbitraryConstraint4300); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getArbitraryConstraintAccess().getLeftCurlyBracketKeyword_0_2());
                          
                    }
                    otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleArbitraryConstraint4312); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getArbitraryConstraintAccess().getEventKeyword_0_3());
                          
                    }
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2254:1: ( ( ruleEString ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2255:1: ( ruleEString )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2255:1: ( ruleEString )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2256:3: ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getArbitraryConstraintRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArbitraryConstraintAccess().getEventEventCrossReference_0_4_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArbitraryConstraint4339);
                    ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleArbitraryConstraint4351); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getArbitraryConstraintAccess().getMinimumKeyword_0_5());
                          
                    }
                    otherlv_6=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleArbitraryConstraint4363); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getArbitraryConstraintAccess().getEqualsSignKeyword_0_6());
                          
                    }
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2280:1: ( (lv_minimum_7_0= ruleSymbolicTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2281:1: (lv_minimum_7_0= ruleSymbolicTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2281:1: (lv_minimum_7_0= ruleSymbolicTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2282:3: lv_minimum_7_0= ruleSymbolicTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArbitraryConstraintAccess().getMinimumSymbolicTimingExpressionParserRuleCall_0_7_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSymbolicTimingExpression_in_ruleArbitraryConstraint4384);
                    lv_minimum_7_0=ruleSymbolicTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArbitraryConstraintRule());
                      	        }
                             		add(
                             			current, 
                             			"minimum",
                              		lv_minimum_7_0, 
                              		"SymbolicTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2299:6: ( ( (lv_minimum_8_0= ruleValueTimingExpression ) ) ( (otherlv_9= ',' ( (lv_minimum_10_0= ruleSymbolicTimingExpression ) ) ) | ( (lv_minimum_11_0= ruleValueTimingExpression ) ) )* otherlv_12= 'maximum' otherlv_13= '=' ( (lv_maximum_14_0= ruleSymbolicTimingExpression ) ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2299:6: ( ( (lv_minimum_8_0= ruleValueTimingExpression ) ) ( (otherlv_9= ',' ( (lv_minimum_10_0= ruleSymbolicTimingExpression ) ) ) | ( (lv_minimum_11_0= ruleValueTimingExpression ) ) )* otherlv_12= 'maximum' otherlv_13= '=' ( (lv_maximum_14_0= ruleSymbolicTimingExpression ) ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2299:7: ( (lv_minimum_8_0= ruleValueTimingExpression ) ) ( (otherlv_9= ',' ( (lv_minimum_10_0= ruleSymbolicTimingExpression ) ) ) | ( (lv_minimum_11_0= ruleValueTimingExpression ) ) )* otherlv_12= 'maximum' otherlv_13= '=' ( (lv_maximum_14_0= ruleSymbolicTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2299:7: ( (lv_minimum_8_0= ruleValueTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2300:1: (lv_minimum_8_0= ruleValueTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2300:1: (lv_minimum_8_0= ruleValueTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2301:3: lv_minimum_8_0= ruleValueTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArbitraryConstraintAccess().getMinimumValueTimingExpressionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValueTimingExpression_in_ruleArbitraryConstraint4413);
                    lv_minimum_8_0=ruleValueTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArbitraryConstraintRule());
                      	        }
                             		add(
                             			current, 
                             			"minimum",
                              		lv_minimum_8_0, 
                              		"ValueTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2317:2: ( (otherlv_9= ',' ( (lv_minimum_10_0= ruleSymbolicTimingExpression ) ) ) | ( (lv_minimum_11_0= ruleValueTimingExpression ) ) )*
                    loop27:
                    do {
                        int alt27=3;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==18) ) {
                            alt27=1;
                        }
                        else if ( (LA27_0==RULE_INT||LA27_0==54||LA27_0==60||LA27_0==77) ) {
                            alt27=2;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2317:3: (otherlv_9= ',' ( (lv_minimum_10_0= ruleSymbolicTimingExpression ) ) )
                    	    {
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2317:3: (otherlv_9= ',' ( (lv_minimum_10_0= ruleSymbolicTimingExpression ) ) )
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2317:5: otherlv_9= ',' ( (lv_minimum_10_0= ruleSymbolicTimingExpression ) )
                    	    {
                    	    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleArbitraryConstraint4427); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_9, grammarAccess.getArbitraryConstraintAccess().getCommaKeyword_1_1_0_0());
                    	          
                    	    }
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2321:1: ( (lv_minimum_10_0= ruleSymbolicTimingExpression ) )
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2322:1: (lv_minimum_10_0= ruleSymbolicTimingExpression )
                    	    {
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2322:1: (lv_minimum_10_0= ruleSymbolicTimingExpression )
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2323:3: lv_minimum_10_0= ruleSymbolicTimingExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getArbitraryConstraintAccess().getMinimumSymbolicTimingExpressionParserRuleCall_1_1_0_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleSymbolicTimingExpression_in_ruleArbitraryConstraint4448);
                    	    lv_minimum_10_0=ruleSymbolicTimingExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getArbitraryConstraintRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"minimum",
                    	              		lv_minimum_10_0, 
                    	              		"SymbolicTimingExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2340:6: ( (lv_minimum_11_0= ruleValueTimingExpression ) )
                    	    {
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2340:6: ( (lv_minimum_11_0= ruleValueTimingExpression ) )
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2341:1: (lv_minimum_11_0= ruleValueTimingExpression )
                    	    {
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2341:1: (lv_minimum_11_0= ruleValueTimingExpression )
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2342:3: lv_minimum_11_0= ruleValueTimingExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getArbitraryConstraintAccess().getMinimumValueTimingExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleValueTimingExpression_in_ruleArbitraryConstraint4476);
                    	    lv_minimum_11_0=ruleValueTimingExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getArbitraryConstraintRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"minimum",
                    	              		lv_minimum_11_0, 
                    	              		"ValueTimingExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleArbitraryConstraint4490); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getArbitraryConstraintAccess().getMaximumKeyword_1_2());
                          
                    }
                    otherlv_13=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleArbitraryConstraint4502); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getArbitraryConstraintAccess().getEqualsSignKeyword_1_3());
                          
                    }
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2366:1: ( (lv_maximum_14_0= ruleSymbolicTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2367:1: (lv_maximum_14_0= ruleSymbolicTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2367:1: (lv_maximum_14_0= ruleSymbolicTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2368:3: lv_maximum_14_0= ruleSymbolicTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArbitraryConstraintAccess().getMaximumSymbolicTimingExpressionParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSymbolicTimingExpression_in_ruleArbitraryConstraint4523);
                    lv_maximum_14_0=ruleSymbolicTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArbitraryConstraintRule());
                      	        }
                             		add(
                             			current, 
                             			"maximum",
                              		lv_maximum_14_0, 
                              		"SymbolicTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2385:6: ( ( (lv_maximum_15_0= ruleValueTimingExpression ) ) ( (otherlv_16= ',' ( (lv_maximum_17_0= ruleSymbolicTimingExpression ) ) ) | ( (lv_maximum_18_0= ruleValueTimingExpression ) ) )* otherlv_19= '}' )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2385:6: ( ( (lv_maximum_15_0= ruleValueTimingExpression ) ) ( (otherlv_16= ',' ( (lv_maximum_17_0= ruleSymbolicTimingExpression ) ) ) | ( (lv_maximum_18_0= ruleValueTimingExpression ) ) )* otherlv_19= '}' )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2385:7: ( (lv_maximum_15_0= ruleValueTimingExpression ) ) ( (otherlv_16= ',' ( (lv_maximum_17_0= ruleSymbolicTimingExpression ) ) ) | ( (lv_maximum_18_0= ruleValueTimingExpression ) ) )* otherlv_19= '}'
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2385:7: ( (lv_maximum_15_0= ruleValueTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2386:1: (lv_maximum_15_0= ruleValueTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2386:1: (lv_maximum_15_0= ruleValueTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2387:3: lv_maximum_15_0= ruleValueTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArbitraryConstraintAccess().getMaximumValueTimingExpressionParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValueTimingExpression_in_ruleArbitraryConstraint4552);
                    lv_maximum_15_0=ruleValueTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArbitraryConstraintRule());
                      	        }
                             		add(
                             			current, 
                             			"maximum",
                              		lv_maximum_15_0, 
                              		"ValueTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2403:2: ( (otherlv_16= ',' ( (lv_maximum_17_0= ruleSymbolicTimingExpression ) ) ) | ( (lv_maximum_18_0= ruleValueTimingExpression ) ) )*
                    loop28:
                    do {
                        int alt28=3;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==18) ) {
                            alt28=1;
                        }
                        else if ( (LA28_0==RULE_INT||LA28_0==54||LA28_0==60||LA28_0==77) ) {
                            alt28=2;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2403:3: (otherlv_16= ',' ( (lv_maximum_17_0= ruleSymbolicTimingExpression ) ) )
                    	    {
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2403:3: (otherlv_16= ',' ( (lv_maximum_17_0= ruleSymbolicTimingExpression ) ) )
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2403:5: otherlv_16= ',' ( (lv_maximum_17_0= ruleSymbolicTimingExpression ) )
                    	    {
                    	    otherlv_16=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleArbitraryConstraint4566); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_16, grammarAccess.getArbitraryConstraintAccess().getCommaKeyword_2_1_0_0());
                    	          
                    	    }
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2407:1: ( (lv_maximum_17_0= ruleSymbolicTimingExpression ) )
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2408:1: (lv_maximum_17_0= ruleSymbolicTimingExpression )
                    	    {
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2408:1: (lv_maximum_17_0= ruleSymbolicTimingExpression )
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2409:3: lv_maximum_17_0= ruleSymbolicTimingExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getArbitraryConstraintAccess().getMaximumSymbolicTimingExpressionParserRuleCall_2_1_0_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleSymbolicTimingExpression_in_ruleArbitraryConstraint4587);
                    	    lv_maximum_17_0=ruleSymbolicTimingExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getArbitraryConstraintRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"maximum",
                    	              		lv_maximum_17_0, 
                    	              		"SymbolicTimingExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2426:6: ( (lv_maximum_18_0= ruleValueTimingExpression ) )
                    	    {
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2426:6: ( (lv_maximum_18_0= ruleValueTimingExpression ) )
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2427:1: (lv_maximum_18_0= ruleValueTimingExpression )
                    	    {
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2427:1: (lv_maximum_18_0= ruleValueTimingExpression )
                    	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2428:3: lv_maximum_18_0= ruleValueTimingExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getArbitraryConstraintAccess().getMaximumValueTimingExpressionParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleValueTimingExpression_in_ruleArbitraryConstraint4615);
                    	    lv_maximum_18_0=ruleValueTimingExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getArbitraryConstraintRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"maximum",
                    	              		lv_maximum_18_0, 
                    	              		"ValueTimingExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleArbitraryConstraint4629); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getArbitraryConstraintAccess().getRightCurlyBracketKeyword_2_2());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArbitraryConstraint"


    // $ANTLR start "entryRuleBurstConstraint"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2456:1: entryRuleBurstConstraint returns [EObject current=null] : iv_ruleBurstConstraint= ruleBurstConstraint EOF ;
    public final EObject entryRuleBurstConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBurstConstraint = null;


        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2457:2: (iv_ruleBurstConstraint= ruleBurstConstraint EOF )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2458:2: iv_ruleBurstConstraint= ruleBurstConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBurstConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBurstConstraint_in_entryRuleBurstConstraint4666);
            iv_ruleBurstConstraint=ruleBurstConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBurstConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBurstConstraint4676); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBurstConstraint"


    // $ANTLR start "ruleBurstConstraint"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2465:1: ruleBurstConstraint returns [EObject current=null] : (otherlv_0= 'BurstConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'event' ( ( ruleEString ) ) otherlv_5= 'maxOccurrence' otherlv_6= '=' ( (lv_maxOccurrence_7_0= RULE_INT ) ) otherlv_8= 'length' otherlv_9= '=' ( ( (lv_length_10_0= ruleSymbolicTimingExpression ) ) | ( (lv_length_11_0= ruleValueTimingExpression ) ) ) otherlv_12= 'minimum' otherlv_13= '=' ( ( (lv_minimum_14_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_15_0= ruleValueTimingExpression ) ) ) otherlv_16= '}' ) ;
    public final EObject ruleBurstConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_maxOccurrence_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_length_10_0 = null;

        EObject lv_length_11_0 = null;

        EObject lv_minimum_14_0 = null;

        EObject lv_minimum_15_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2468:28: ( (otherlv_0= 'BurstConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'event' ( ( ruleEString ) ) otherlv_5= 'maxOccurrence' otherlv_6= '=' ( (lv_maxOccurrence_7_0= RULE_INT ) ) otherlv_8= 'length' otherlv_9= '=' ( ( (lv_length_10_0= ruleSymbolicTimingExpression ) ) | ( (lv_length_11_0= ruleValueTimingExpression ) ) ) otherlv_12= 'minimum' otherlv_13= '=' ( ( (lv_minimum_14_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_15_0= ruleValueTimingExpression ) ) ) otherlv_16= '}' ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2469:1: (otherlv_0= 'BurstConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'event' ( ( ruleEString ) ) otherlv_5= 'maxOccurrence' otherlv_6= '=' ( (lv_maxOccurrence_7_0= RULE_INT ) ) otherlv_8= 'length' otherlv_9= '=' ( ( (lv_length_10_0= ruleSymbolicTimingExpression ) ) | ( (lv_length_11_0= ruleValueTimingExpression ) ) ) otherlv_12= 'minimum' otherlv_13= '=' ( ( (lv_minimum_14_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_15_0= ruleValueTimingExpression ) ) ) otherlv_16= '}' )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2469:1: (otherlv_0= 'BurstConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'event' ( ( ruleEString ) ) otherlv_5= 'maxOccurrence' otherlv_6= '=' ( (lv_maxOccurrence_7_0= RULE_INT ) ) otherlv_8= 'length' otherlv_9= '=' ( ( (lv_length_10_0= ruleSymbolicTimingExpression ) ) | ( (lv_length_11_0= ruleValueTimingExpression ) ) ) otherlv_12= 'minimum' otherlv_13= '=' ( ( (lv_minimum_14_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_15_0= ruleValueTimingExpression ) ) ) otherlv_16= '}' )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2469:3: otherlv_0= 'BurstConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'event' ( ( ruleEString ) ) otherlv_5= 'maxOccurrence' otherlv_6= '=' ( (lv_maxOccurrence_7_0= RULE_INT ) ) otherlv_8= 'length' otherlv_9= '=' ( ( (lv_length_10_0= ruleSymbolicTimingExpression ) ) | ( (lv_length_11_0= ruleValueTimingExpression ) ) ) otherlv_12= 'minimum' otherlv_13= '=' ( ( (lv_minimum_14_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_15_0= ruleValueTimingExpression ) ) ) otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleBurstConstraint4713); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBurstConstraintAccess().getBurstConstraintKeyword_0());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2473:1: ( (lv_name_1_0= ruleEString ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2474:1: (lv_name_1_0= ruleEString )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2474:1: (lv_name_1_0= ruleEString )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2475:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBurstConstraintAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBurstConstraint4734);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBurstConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBurstConstraint4746); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBurstConstraintAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleBurstConstraint4758); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getBurstConstraintAccess().getEventKeyword_3());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2499:1: ( ( ruleEString ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2500:1: ( ruleEString )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2500:1: ( ruleEString )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2501:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBurstConstraintRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBurstConstraintAccess().getEventEventCrossReference_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBurstConstraint4785);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleBurstConstraint4797); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getBurstConstraintAccess().getMaxOccurrenceKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleBurstConstraint4809); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getBurstConstraintAccess().getEqualsSignKeyword_6());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2525:1: ( (lv_maxOccurrence_7_0= RULE_INT ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2526:1: (lv_maxOccurrence_7_0= RULE_INT )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2526:1: (lv_maxOccurrence_7_0= RULE_INT )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2527:3: lv_maxOccurrence_7_0= RULE_INT
            {
            lv_maxOccurrence_7_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleBurstConstraint4826); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_maxOccurrence_7_0, grammarAccess.getBurstConstraintAccess().getMaxOccurrenceINTTerminalRuleCall_7_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBurstConstraintRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"maxOccurrence",
                      		lv_maxOccurrence_7_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleBurstConstraint4843); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getBurstConstraintAccess().getLengthKeyword_8());
                  
            }
            otherlv_9=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleBurstConstraint4855); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getBurstConstraintAccess().getEqualsSignKeyword_9());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2551:1: ( ( (lv_length_10_0= ruleSymbolicTimingExpression ) ) | ( (lv_length_11_0= ruleValueTimingExpression ) ) )
            int alt30=2;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2551:2: ( (lv_length_10_0= ruleSymbolicTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2551:2: ( (lv_length_10_0= ruleSymbolicTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2552:1: (lv_length_10_0= ruleSymbolicTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2552:1: (lv_length_10_0= ruleSymbolicTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2553:3: lv_length_10_0= ruleSymbolicTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBurstConstraintAccess().getLengthSymbolicTimingExpressionParserRuleCall_10_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSymbolicTimingExpression_in_ruleBurstConstraint4877);
                    lv_length_10_0=ruleSymbolicTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBurstConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"length",
                              		lv_length_10_0, 
                              		"SymbolicTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2570:6: ( (lv_length_11_0= ruleValueTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2570:6: ( (lv_length_11_0= ruleValueTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2571:1: (lv_length_11_0= ruleValueTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2571:1: (lv_length_11_0= ruleValueTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2572:3: lv_length_11_0= ruleValueTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBurstConstraintAccess().getLengthValueTimingExpressionParserRuleCall_10_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValueTimingExpression_in_ruleBurstConstraint4904);
                    lv_length_11_0=ruleValueTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBurstConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"length",
                              		lv_length_11_0, 
                              		"ValueTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleBurstConstraint4917); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getBurstConstraintAccess().getMinimumKeyword_11());
                  
            }
            otherlv_13=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleBurstConstraint4929); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getBurstConstraintAccess().getEqualsSignKeyword_12());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2596:1: ( ( (lv_minimum_14_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_15_0= ruleValueTimingExpression ) ) )
            int alt31=2;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2596:2: ( (lv_minimum_14_0= ruleSymbolicTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2596:2: ( (lv_minimum_14_0= ruleSymbolicTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2597:1: (lv_minimum_14_0= ruleSymbolicTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2597:1: (lv_minimum_14_0= ruleSymbolicTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2598:3: lv_minimum_14_0= ruleSymbolicTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBurstConstraintAccess().getMinimumSymbolicTimingExpressionParserRuleCall_13_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSymbolicTimingExpression_in_ruleBurstConstraint4951);
                    lv_minimum_14_0=ruleSymbolicTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBurstConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"minimum",
                              		lv_minimum_14_0, 
                              		"SymbolicTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2615:6: ( (lv_minimum_15_0= ruleValueTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2615:6: ( (lv_minimum_15_0= ruleValueTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2616:1: (lv_minimum_15_0= ruleValueTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2616:1: (lv_minimum_15_0= ruleValueTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2617:3: lv_minimum_15_0= ruleValueTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBurstConstraintAccess().getMinimumValueTimingExpressionParserRuleCall_13_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValueTimingExpression_in_ruleBurstConstraint4978);
                    lv_minimum_15_0=ruleValueTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBurstConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"minimum",
                              		lv_minimum_15_0, 
                              		"ValueTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleBurstConstraint4991); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getBurstConstraintAccess().getRightCurlyBracketKeyword_14());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBurstConstraint"


    // $ANTLR start "entryRuleReactionConstraint"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2645:1: entryRuleReactionConstraint returns [EObject current=null] : iv_ruleReactionConstraint= ruleReactionConstraint EOF ;
    public final EObject entryRuleReactionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionConstraint = null;


        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2646:2: (iv_ruleReactionConstraint= ruleReactionConstraint EOF )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2647:2: iv_ruleReactionConstraint= ruleReactionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleReactionConstraint_in_entryRuleReactionConstraint5027);
            iv_ruleReactionConstraint=ruleReactionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReactionConstraint5037); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactionConstraint"


    // $ANTLR start "ruleReactionConstraint"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2654:1: ruleReactionConstraint returns [EObject current=null] : (otherlv_0= 'ReactionConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'scope' ( ( ruleEString ) ) otherlv_5= 'maximum' otherlv_6= '=' ( ( (lv_maximum_7_0= ruleSymbolicTimingExpression ) ) | ( (lv_maximum_8_0= ruleValueTimingExpression ) ) ) otherlv_9= 'minimum' otherlv_10= '=' ( ( (lv_minimum_11_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_12_0= ruleValueTimingExpression ) ) ) otherlv_13= '}' ) ;
    public final EObject ruleReactionConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_maximum_7_0 = null;

        EObject lv_maximum_8_0 = null;

        EObject lv_minimum_11_0 = null;

        EObject lv_minimum_12_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2657:28: ( (otherlv_0= 'ReactionConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'scope' ( ( ruleEString ) ) otherlv_5= 'maximum' otherlv_6= '=' ( ( (lv_maximum_7_0= ruleSymbolicTimingExpression ) ) | ( (lv_maximum_8_0= ruleValueTimingExpression ) ) ) otherlv_9= 'minimum' otherlv_10= '=' ( ( (lv_minimum_11_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_12_0= ruleValueTimingExpression ) ) ) otherlv_13= '}' ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2658:1: (otherlv_0= 'ReactionConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'scope' ( ( ruleEString ) ) otherlv_5= 'maximum' otherlv_6= '=' ( ( (lv_maximum_7_0= ruleSymbolicTimingExpression ) ) | ( (lv_maximum_8_0= ruleValueTimingExpression ) ) ) otherlv_9= 'minimum' otherlv_10= '=' ( ( (lv_minimum_11_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_12_0= ruleValueTimingExpression ) ) ) otherlv_13= '}' )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2658:1: (otherlv_0= 'ReactionConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'scope' ( ( ruleEString ) ) otherlv_5= 'maximum' otherlv_6= '=' ( ( (lv_maximum_7_0= ruleSymbolicTimingExpression ) ) | ( (lv_maximum_8_0= ruleValueTimingExpression ) ) ) otherlv_9= 'minimum' otherlv_10= '=' ( ( (lv_minimum_11_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_12_0= ruleValueTimingExpression ) ) ) otherlv_13= '}' )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2658:3: otherlv_0= 'ReactionConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'scope' ( ( ruleEString ) ) otherlv_5= 'maximum' otherlv_6= '=' ( ( (lv_maximum_7_0= ruleSymbolicTimingExpression ) ) | ( (lv_maximum_8_0= ruleValueTimingExpression ) ) ) otherlv_9= 'minimum' otherlv_10= '=' ( ( (lv_minimum_11_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_12_0= ruleValueTimingExpression ) ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleReactionConstraint5074); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReactionConstraintAccess().getReactionConstraintKeyword_0());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2662:1: ( (lv_name_1_0= ruleEString ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2663:1: (lv_name_1_0= ruleEString )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2663:1: (lv_name_1_0= ruleEString )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2664:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReactionConstraintAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleReactionConstraint5095);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getReactionConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleReactionConstraint5107); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getReactionConstraintAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleReactionConstraint5119); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getReactionConstraintAccess().getScopeKeyword_3());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2688:1: ( ( ruleEString ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2689:1: ( ruleEString )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2689:1: ( ruleEString )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2690:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReactionConstraintRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReactionConstraintAccess().getScopeEventChainCrossReference_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleReactionConstraint5146);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleReactionConstraint5158); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getReactionConstraintAccess().getMaximumKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleReactionConstraint5170); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getReactionConstraintAccess().getEqualsSignKeyword_6());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2714:1: ( ( (lv_maximum_7_0= ruleSymbolicTimingExpression ) ) | ( (lv_maximum_8_0= ruleValueTimingExpression ) ) )
            int alt32=2;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2714:2: ( (lv_maximum_7_0= ruleSymbolicTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2714:2: ( (lv_maximum_7_0= ruleSymbolicTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2715:1: (lv_maximum_7_0= ruleSymbolicTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2715:1: (lv_maximum_7_0= ruleSymbolicTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2716:3: lv_maximum_7_0= ruleSymbolicTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionConstraintAccess().getMaximumSymbolicTimingExpressionParserRuleCall_7_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSymbolicTimingExpression_in_ruleReactionConstraint5192);
                    lv_maximum_7_0=ruleSymbolicTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReactionConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"maximum",
                              		lv_maximum_7_0, 
                              		"SymbolicTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2733:6: ( (lv_maximum_8_0= ruleValueTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2733:6: ( (lv_maximum_8_0= ruleValueTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2734:1: (lv_maximum_8_0= ruleValueTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2734:1: (lv_maximum_8_0= ruleValueTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2735:3: lv_maximum_8_0= ruleValueTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionConstraintAccess().getMaximumValueTimingExpressionParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValueTimingExpression_in_ruleReactionConstraint5219);
                    lv_maximum_8_0=ruleValueTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReactionConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"maximum",
                              		lv_maximum_8_0, 
                              		"ValueTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleReactionConstraint5232); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getReactionConstraintAccess().getMinimumKeyword_8());
                  
            }
            otherlv_10=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleReactionConstraint5244); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getReactionConstraintAccess().getEqualsSignKeyword_9());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2759:1: ( ( (lv_minimum_11_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_12_0= ruleValueTimingExpression ) ) )
            int alt33=2;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2759:2: ( (lv_minimum_11_0= ruleSymbolicTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2759:2: ( (lv_minimum_11_0= ruleSymbolicTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2760:1: (lv_minimum_11_0= ruleSymbolicTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2760:1: (lv_minimum_11_0= ruleSymbolicTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2761:3: lv_minimum_11_0= ruleSymbolicTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionConstraintAccess().getMinimumSymbolicTimingExpressionParserRuleCall_10_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSymbolicTimingExpression_in_ruleReactionConstraint5266);
                    lv_minimum_11_0=ruleSymbolicTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReactionConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"minimum",
                              		lv_minimum_11_0, 
                              		"SymbolicTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2778:6: ( (lv_minimum_12_0= ruleValueTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2778:6: ( (lv_minimum_12_0= ruleValueTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2779:1: (lv_minimum_12_0= ruleValueTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2779:1: (lv_minimum_12_0= ruleValueTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2780:3: lv_minimum_12_0= ruleValueTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionConstraintAccess().getMinimumValueTimingExpressionParserRuleCall_10_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValueTimingExpression_in_ruleReactionConstraint5293);
                    lv_minimum_12_0=ruleValueTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReactionConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"minimum",
                              		lv_minimum_12_0, 
                              		"ValueTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleReactionConstraint5306); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getReactionConstraintAccess().getRightCurlyBracketKeyword_11());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactionConstraint"


    // $ANTLR start "entryRuleAgeConstraint"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2808:1: entryRuleAgeConstraint returns [EObject current=null] : iv_ruleAgeConstraint= ruleAgeConstraint EOF ;
    public final EObject entryRuleAgeConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgeConstraint = null;


        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2809:2: (iv_ruleAgeConstraint= ruleAgeConstraint EOF )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2810:2: iv_ruleAgeConstraint= ruleAgeConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAgeConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAgeConstraint_in_entryRuleAgeConstraint5342);
            iv_ruleAgeConstraint=ruleAgeConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAgeConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAgeConstraint5352); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAgeConstraint"


    // $ANTLR start "ruleAgeConstraint"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2817:1: ruleAgeConstraint returns [EObject current=null] : (otherlv_0= 'AgeConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'scope' ( ( ruleEString ) ) otherlv_5= 'maximum' otherlv_6= '=' ( ( (lv_maximum_7_0= ruleSymbolicTimingExpression ) ) | ( (lv_maximum_8_0= ruleValueTimingExpression ) ) ) otherlv_9= 'minimum' otherlv_10= '=' ( ( (lv_minimum_11_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_12_0= ruleValueTimingExpression ) ) ) otherlv_13= '}' ) ;
    public final EObject ruleAgeConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_maximum_7_0 = null;

        EObject lv_maximum_8_0 = null;

        EObject lv_minimum_11_0 = null;

        EObject lv_minimum_12_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2820:28: ( (otherlv_0= 'AgeConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'scope' ( ( ruleEString ) ) otherlv_5= 'maximum' otherlv_6= '=' ( ( (lv_maximum_7_0= ruleSymbolicTimingExpression ) ) | ( (lv_maximum_8_0= ruleValueTimingExpression ) ) ) otherlv_9= 'minimum' otherlv_10= '=' ( ( (lv_minimum_11_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_12_0= ruleValueTimingExpression ) ) ) otherlv_13= '}' ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2821:1: (otherlv_0= 'AgeConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'scope' ( ( ruleEString ) ) otherlv_5= 'maximum' otherlv_6= '=' ( ( (lv_maximum_7_0= ruleSymbolicTimingExpression ) ) | ( (lv_maximum_8_0= ruleValueTimingExpression ) ) ) otherlv_9= 'minimum' otherlv_10= '=' ( ( (lv_minimum_11_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_12_0= ruleValueTimingExpression ) ) ) otherlv_13= '}' )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2821:1: (otherlv_0= 'AgeConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'scope' ( ( ruleEString ) ) otherlv_5= 'maximum' otherlv_6= '=' ( ( (lv_maximum_7_0= ruleSymbolicTimingExpression ) ) | ( (lv_maximum_8_0= ruleValueTimingExpression ) ) ) otherlv_9= 'minimum' otherlv_10= '=' ( ( (lv_minimum_11_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_12_0= ruleValueTimingExpression ) ) ) otherlv_13= '}' )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2821:3: otherlv_0= 'AgeConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'scope' ( ( ruleEString ) ) otherlv_5= 'maximum' otherlv_6= '=' ( ( (lv_maximum_7_0= ruleSymbolicTimingExpression ) ) | ( (lv_maximum_8_0= ruleValueTimingExpression ) ) ) otherlv_9= 'minimum' otherlv_10= '=' ( ( (lv_minimum_11_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_12_0= ruleValueTimingExpression ) ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleAgeConstraint5389); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAgeConstraintAccess().getAgeConstraintKeyword_0());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2825:1: ( (lv_name_1_0= ruleEString ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2826:1: (lv_name_1_0= ruleEString )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2826:1: (lv_name_1_0= ruleEString )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2827:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAgeConstraintAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAgeConstraint5410);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAgeConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAgeConstraint5422); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAgeConstraintAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleAgeConstraint5434); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAgeConstraintAccess().getScopeKeyword_3());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2851:1: ( ( ruleEString ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2852:1: ( ruleEString )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2852:1: ( ruleEString )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2853:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAgeConstraintRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAgeConstraintAccess().getScopeEventChainCrossReference_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAgeConstraint5461);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleAgeConstraint5473); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getAgeConstraintAccess().getMaximumKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleAgeConstraint5485); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getAgeConstraintAccess().getEqualsSignKeyword_6());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2877:1: ( ( (lv_maximum_7_0= ruleSymbolicTimingExpression ) ) | ( (lv_maximum_8_0= ruleValueTimingExpression ) ) )
            int alt34=2;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2877:2: ( (lv_maximum_7_0= ruleSymbolicTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2877:2: ( (lv_maximum_7_0= ruleSymbolicTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2878:1: (lv_maximum_7_0= ruleSymbolicTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2878:1: (lv_maximum_7_0= ruleSymbolicTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2879:3: lv_maximum_7_0= ruleSymbolicTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAgeConstraintAccess().getMaximumSymbolicTimingExpressionParserRuleCall_7_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSymbolicTimingExpression_in_ruleAgeConstraint5507);
                    lv_maximum_7_0=ruleSymbolicTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAgeConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"maximum",
                              		lv_maximum_7_0, 
                              		"SymbolicTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2896:6: ( (lv_maximum_8_0= ruleValueTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2896:6: ( (lv_maximum_8_0= ruleValueTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2897:1: (lv_maximum_8_0= ruleValueTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2897:1: (lv_maximum_8_0= ruleValueTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2898:3: lv_maximum_8_0= ruleValueTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAgeConstraintAccess().getMaximumValueTimingExpressionParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValueTimingExpression_in_ruleAgeConstraint5534);
                    lv_maximum_8_0=ruleValueTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAgeConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"maximum",
                              		lv_maximum_8_0, 
                              		"ValueTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleAgeConstraint5547); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getAgeConstraintAccess().getMinimumKeyword_8());
                  
            }
            otherlv_10=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleAgeConstraint5559); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getAgeConstraintAccess().getEqualsSignKeyword_9());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2922:1: ( ( (lv_minimum_11_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_12_0= ruleValueTimingExpression ) ) )
            int alt35=2;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2922:2: ( (lv_minimum_11_0= ruleSymbolicTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2922:2: ( (lv_minimum_11_0= ruleSymbolicTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2923:1: (lv_minimum_11_0= ruleSymbolicTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2923:1: (lv_minimum_11_0= ruleSymbolicTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2924:3: lv_minimum_11_0= ruleSymbolicTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAgeConstraintAccess().getMinimumSymbolicTimingExpressionParserRuleCall_10_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSymbolicTimingExpression_in_ruleAgeConstraint5581);
                    lv_minimum_11_0=ruleSymbolicTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAgeConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"minimum",
                              		lv_minimum_11_0, 
                              		"SymbolicTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2941:6: ( (lv_minimum_12_0= ruleValueTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2941:6: ( (lv_minimum_12_0= ruleValueTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2942:1: (lv_minimum_12_0= ruleValueTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2942:1: (lv_minimum_12_0= ruleValueTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2943:3: lv_minimum_12_0= ruleValueTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAgeConstraintAccess().getMinimumValueTimingExpressionParserRuleCall_10_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValueTimingExpression_in_ruleAgeConstraint5608);
                    lv_minimum_12_0=ruleValueTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAgeConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"minimum",
                              		lv_minimum_12_0, 
                              		"ValueTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAgeConstraint5621); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getAgeConstraintAccess().getRightCurlyBracketKeyword_11());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAgeConstraint"


    // $ANTLR start "entryRuleTimingExpression"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2971:1: entryRuleTimingExpression returns [EObject current=null] : iv_ruleTimingExpression= ruleTimingExpression EOF ;
    public final EObject entryRuleTimingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimingExpression = null;


        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2972:2: (iv_ruleTimingExpression= ruleTimingExpression EOF )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2973:2: iv_ruleTimingExpression= ruleTimingExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimingExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTimingExpression_in_entryRuleTimingExpression5657);
            iv_ruleTimingExpression=ruleTimingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimingExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTimingExpression5667); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimingExpression"


    // $ANTLR start "ruleTimingExpression"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2980:1: ruleTimingExpression returns [EObject current=null] : (this_SymbolicTimingExpression_0= ruleSymbolicTimingExpression | this_VariableTimingExpression_1= ruleVariableTimingExpression | this_ValueTimingExpression_2= ruleValueTimingExpression ) ;
    public final EObject ruleTimingExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SymbolicTimingExpression_0 = null;

        EObject this_VariableTimingExpression_1 = null;

        EObject this_ValueTimingExpression_2 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2983:28: ( (this_SymbolicTimingExpression_0= ruleSymbolicTimingExpression | this_VariableTimingExpression_1= ruleVariableTimingExpression | this_ValueTimingExpression_2= ruleValueTimingExpression ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2984:1: (this_SymbolicTimingExpression_0= ruleSymbolicTimingExpression | this_VariableTimingExpression_1= ruleVariableTimingExpression | this_ValueTimingExpression_2= ruleValueTimingExpression )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2984:1: (this_SymbolicTimingExpression_0= ruleSymbolicTimingExpression | this_VariableTimingExpression_1= ruleVariableTimingExpression | this_ValueTimingExpression_2= ruleValueTimingExpression )
            int alt36=3;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2985:2: this_SymbolicTimingExpression_0= ruleSymbolicTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTimingExpressionAccess().getSymbolicTimingExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSymbolicTimingExpression_in_ruleTimingExpression5717);
                    this_SymbolicTimingExpression_0=ruleSymbolicTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SymbolicTimingExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2998:2: this_VariableTimingExpression_1= ruleVariableTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTimingExpressionAccess().getVariableTimingExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVariableTimingExpression_in_ruleTimingExpression5747);
                    this_VariableTimingExpression_1=ruleVariableTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableTimingExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3011:2: this_ValueTimingExpression_2= ruleValueTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTimingExpressionAccess().getValueTimingExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValueTimingExpression_in_ruleTimingExpression5777);
                    this_ValueTimingExpression_2=ruleValueTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValueTimingExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimingExpression"


    // $ANTLR start "entryRuleAddition"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3030:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3031:2: (iv_ruleAddition= ruleAddition EOF )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3032:2: iv_ruleAddition= ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddition_in_entryRuleAddition5812);
            iv_ruleAddition=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddition5822); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3039:1: ruleAddition returns [EObject current=null] : (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= '+' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_leftOperand_1_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3042:28: ( (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= '+' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')' ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3043:1: (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= '+' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')' )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3043:1: (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= '+' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')' )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3043:3: otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= '+' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleAddition5859); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAdditionAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3047:1: ( (lv_leftOperand_1_0= ruleTimingExpression ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3048:1: (lv_leftOperand_1_0= ruleTimingExpression )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3048:1: (lv_leftOperand_1_0= ruleTimingExpression )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3049:3: lv_leftOperand_1_0= ruleTimingExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAdditionAccess().getLeftOperandTimingExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTimingExpression_in_ruleAddition5880);
            lv_leftOperand_1_0=ruleTimingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAdditionRule());
              	        }
                     		set(
                     			current, 
                     			"leftOperand",
                      		lv_leftOperand_1_0, 
                      		"TimingExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleAddition5892); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_2());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3069:1: ( (lv_rightOperand_3_0= ruleTimingExpression ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3070:1: (lv_rightOperand_3_0= ruleTimingExpression )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3070:1: (lv_rightOperand_3_0= ruleTimingExpression )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3071:3: lv_rightOperand_3_0= ruleTimingExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAdditionAccess().getRightOperandTimingExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTimingExpression_in_ruleAddition5913);
            lv_rightOperand_3_0=ruleTimingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAdditionRule());
              	        }
                     		set(
                     			current, 
                     			"rightOperand",
                      		lv_rightOperand_3_0, 
                      		"TimingExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleAddition5925); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAdditionAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleOperator"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3099:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3100:2: (iv_ruleOperator= ruleOperator EOF )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3101:2: iv_ruleOperator= ruleOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperatorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOperator_in_entryRuleOperator5961);
            iv_ruleOperator=ruleOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperator; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperator5971); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3108:1: ruleOperator returns [EObject current=null] : (this_Addition_0= ruleAddition | this_Subtraction_1= ruleSubtraction | this_Multiplication_2= ruleMultiplication | this_Division_3= ruleDivision | this_Assignment_4= ruleAssignment | this_GreaterThan_5= ruleGreaterThan | this_LessThan_6= ruleLessThan | this_GreaterThanOrEqual_7= ruleGreaterThanOrEqual | this_LessThanOrEqual_8= ruleLessThanOrEqual ) ;
    public final EObject ruleOperator() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;

        EObject this_Subtraction_1 = null;

        EObject this_Multiplication_2 = null;

        EObject this_Division_3 = null;

        EObject this_Assignment_4 = null;

        EObject this_GreaterThan_5 = null;

        EObject this_LessThan_6 = null;

        EObject this_GreaterThanOrEqual_7 = null;

        EObject this_LessThanOrEqual_8 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3111:28: ( (this_Addition_0= ruleAddition | this_Subtraction_1= ruleSubtraction | this_Multiplication_2= ruleMultiplication | this_Division_3= ruleDivision | this_Assignment_4= ruleAssignment | this_GreaterThan_5= ruleGreaterThan | this_LessThan_6= ruleLessThan | this_GreaterThanOrEqual_7= ruleGreaterThanOrEqual | this_LessThanOrEqual_8= ruleLessThanOrEqual ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3112:1: (this_Addition_0= ruleAddition | this_Subtraction_1= ruleSubtraction | this_Multiplication_2= ruleMultiplication | this_Division_3= ruleDivision | this_Assignment_4= ruleAssignment | this_GreaterThan_5= ruleGreaterThan | this_LessThan_6= ruleLessThan | this_GreaterThanOrEqual_7= ruleGreaterThanOrEqual | this_LessThanOrEqual_8= ruleLessThanOrEqual )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3112:1: (this_Addition_0= ruleAddition | this_Subtraction_1= ruleSubtraction | this_Multiplication_2= ruleMultiplication | this_Division_3= ruleDivision | this_Assignment_4= ruleAssignment | this_GreaterThan_5= ruleGreaterThan | this_LessThan_6= ruleLessThan | this_GreaterThanOrEqual_7= ruleGreaterThanOrEqual | this_LessThanOrEqual_8= ruleLessThanOrEqual )
            int alt37=9;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3113:2: this_Addition_0= ruleAddition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperatorAccess().getAdditionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAddition_in_ruleOperator6021);
                    this_Addition_0=ruleAddition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Addition_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3126:2: this_Subtraction_1= ruleSubtraction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperatorAccess().getSubtractionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSubtraction_in_ruleOperator6051);
                    this_Subtraction_1=ruleSubtraction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Subtraction_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3139:2: this_Multiplication_2= ruleMultiplication
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperatorAccess().getMultiplicationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMultiplication_in_ruleOperator6081);
                    this_Multiplication_2=ruleMultiplication();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Multiplication_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3152:2: this_Division_3= ruleDivision
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperatorAccess().getDivisionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDivision_in_ruleOperator6111);
                    this_Division_3=ruleDivision();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Division_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3165:2: this_Assignment_4= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperatorAccess().getAssignmentParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_ruleOperator6141);
                    this_Assignment_4=ruleAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Assignment_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3178:2: this_GreaterThan_5= ruleGreaterThan
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperatorAccess().getGreaterThanParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleGreaterThan_in_ruleOperator6171);
                    this_GreaterThan_5=ruleGreaterThan();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GreaterThan_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3191:2: this_LessThan_6= ruleLessThan
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperatorAccess().getLessThanParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLessThan_in_ruleOperator6201);
                    this_LessThan_6=ruleLessThan();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LessThan_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3204:2: this_GreaterThanOrEqual_7= ruleGreaterThanOrEqual
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperatorAccess().getGreaterThanOrEqualParserRuleCall_7()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleGreaterThanOrEqual_in_ruleOperator6231);
                    this_GreaterThanOrEqual_7=ruleGreaterThanOrEqual();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GreaterThanOrEqual_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3217:2: this_LessThanOrEqual_8= ruleLessThanOrEqual
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperatorAccess().getLessThanOrEqualParserRuleCall_8()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLessThanOrEqual_in_ruleOperator6261);
                    this_LessThanOrEqual_8=ruleLessThanOrEqual();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LessThanOrEqual_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleSymbolicTimingExpression"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3236:1: entryRuleSymbolicTimingExpression returns [EObject current=null] : iv_ruleSymbolicTimingExpression= ruleSymbolicTimingExpression EOF ;
    public final EObject entryRuleSymbolicTimingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbolicTimingExpression = null;


        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3237:2: (iv_ruleSymbolicTimingExpression= ruleSymbolicTimingExpression EOF )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3238:2: iv_ruleSymbolicTimingExpression= ruleSymbolicTimingExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSymbolicTimingExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSymbolicTimingExpression_in_entryRuleSymbolicTimingExpression6296);
            iv_ruleSymbolicTimingExpression=ruleSymbolicTimingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSymbolicTimingExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSymbolicTimingExpression6306); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSymbolicTimingExpression"


    // $ANTLR start "ruleSymbolicTimingExpression"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3245:1: ruleSymbolicTimingExpression returns [EObject current=null] : ( ( () ( ( ruleEString ) ) ) | ( (lv_operator_2_0= ruleOperator ) ) ) ;
    public final EObject ruleSymbolicTimingExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_operator_2_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3248:28: ( ( ( () ( ( ruleEString ) ) ) | ( (lv_operator_2_0= ruleOperator ) ) ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3249:1: ( ( () ( ( ruleEString ) ) ) | ( (lv_operator_2_0= ruleOperator ) ) )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3249:1: ( ( () ( ( ruleEString ) ) ) | ( (lv_operator_2_0= ruleOperator ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_STRING||LA38_0==RULE_ID) ) {
                alt38=1;
            }
            else if ( (LA38_0==54) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3249:2: ( () ( ( ruleEString ) ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3249:2: ( () ( ( ruleEString ) ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3249:3: () ( ( ruleEString ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3249:3: ()
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3250:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getSymbolicTimingExpressionAccess().getSymbolicTimingExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3258:2: ( ( ruleEString ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3259:1: ( ruleEString )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3259:1: ( ruleEString )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3260:3: ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getSymbolicTimingExpressionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSymbolicTimingExpressionAccess().getVariableVariableTimingExpressionCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSymbolicTimingExpression6371);
                    ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3277:6: ( (lv_operator_2_0= ruleOperator ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3277:6: ( (lv_operator_2_0= ruleOperator ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3278:1: (lv_operator_2_0= ruleOperator )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3278:1: (lv_operator_2_0= ruleOperator )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3279:3: lv_operator_2_0= ruleOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSymbolicTimingExpressionAccess().getOperatorOperatorParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleOperator_in_ruleSymbolicTimingExpression6399);
                    lv_operator_2_0=ruleOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSymbolicTimingExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"Operator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSymbolicTimingExpression"


    // $ANTLR start "entryRuleVariableTimingExpression"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3303:1: entryRuleVariableTimingExpression returns [EObject current=null] : iv_ruleVariableTimingExpression= ruleVariableTimingExpression EOF ;
    public final EObject entryRuleVariableTimingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableTimingExpression = null;


        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3304:2: (iv_ruleVariableTimingExpression= ruleVariableTimingExpression EOF )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3305:2: iv_ruleVariableTimingExpression= ruleVariableTimingExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableTimingExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariableTimingExpression_in_entryRuleVariableTimingExpression6435);
            iv_ruleVariableTimingExpression=ruleVariableTimingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableTimingExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableTimingExpression6445); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableTimingExpression"


    // $ANTLR start "ruleVariableTimingExpression"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3312:1: ruleVariableTimingExpression returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= 'on' ( ( ruleEString ) ) (otherlv_5= ':=' ( ( (lv_value_6_0= ruleSymbolicTimingExpression ) ) | ( (lv_value_7_0= ruleValueTimingExpression ) ) ) )? ) ;
    public final EObject ruleVariableTimingExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_value_6_0 = null;

        EObject lv_value_7_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3315:28: ( (otherlv_0= 'var' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= 'on' ( ( ruleEString ) ) (otherlv_5= ':=' ( ( (lv_value_6_0= ruleSymbolicTimingExpression ) ) | ( (lv_value_7_0= ruleValueTimingExpression ) ) ) )? ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3316:1: (otherlv_0= 'var' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= 'on' ( ( ruleEString ) ) (otherlv_5= ':=' ( ( (lv_value_6_0= ruleSymbolicTimingExpression ) ) | ( (lv_value_7_0= ruleValueTimingExpression ) ) ) )? )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3316:1: (otherlv_0= 'var' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= 'on' ( ( ruleEString ) ) (otherlv_5= ':=' ( ( (lv_value_6_0= ruleSymbolicTimingExpression ) ) | ( (lv_value_7_0= ruleValueTimingExpression ) ) ) )? )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3316:3: otherlv_0= 'var' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= 'on' ( ( ruleEString ) ) (otherlv_5= ':=' ( ( (lv_value_6_0= ruleSymbolicTimingExpression ) ) | ( (lv_value_7_0= ruleValueTimingExpression ) ) ) )?
            {
            otherlv_0=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleVariableTimingExpression6482); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getVariableTimingExpressionAccess().getVarKeyword_0());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3320:1: ( (lv_name_1_0= ruleEString ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3321:1: (lv_name_1_0= ruleEString )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3321:1: (lv_name_1_0= ruleEString )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3322:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableTimingExpressionAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariableTimingExpression6503);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableTimingExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3338:2: ( ( ruleEString ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3339:1: ( ruleEString )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3339:1: ( ruleEString )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3340:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableTimingExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableTimingExpressionAccess().getUnitUnitCrossReference_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariableTimingExpression6530);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleVariableTimingExpression6542); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getVariableTimingExpressionAccess().getOnKeyword_3());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3360:1: ( ( ruleEString ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3361:1: ( ruleEString )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3361:1: ( ruleEString )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3362:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableTimingExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableTimingExpressionAccess().getTimeBaseTimeBaseCrossReference_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariableTimingExpression6569);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3378:2: (otherlv_5= ':=' ( ( (lv_value_6_0= ruleSymbolicTimingExpression ) ) | ( (lv_value_7_0= ruleValueTimingExpression ) ) ) )?
            int alt40=2;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3378:4: otherlv_5= ':=' ( ( (lv_value_6_0= ruleSymbolicTimingExpression ) ) | ( (lv_value_7_0= ruleValueTimingExpression ) ) )
                    {
                    otherlv_5=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleVariableTimingExpression6582); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getVariableTimingExpressionAccess().getColonEqualsSignKeyword_5_0());
                          
                    }
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3382:1: ( ( (lv_value_6_0= ruleSymbolicTimingExpression ) ) | ( (lv_value_7_0= ruleValueTimingExpression ) ) )
                    int alt39=2;
                    alt39 = dfa39.predict(input);
                    switch (alt39) {
                        case 1 :
                            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3382:2: ( (lv_value_6_0= ruleSymbolicTimingExpression ) )
                            {
                            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3382:2: ( (lv_value_6_0= ruleSymbolicTimingExpression ) )
                            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3383:1: (lv_value_6_0= ruleSymbolicTimingExpression )
                            {
                            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3383:1: (lv_value_6_0= ruleSymbolicTimingExpression )
                            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3384:3: lv_value_6_0= ruleSymbolicTimingExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getVariableTimingExpressionAccess().getValueSymbolicTimingExpressionParserRuleCall_5_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleSymbolicTimingExpression_in_ruleVariableTimingExpression6604);
                            lv_value_6_0=ruleSymbolicTimingExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getVariableTimingExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"value",
                                      		lv_value_6_0, 
                                      		"SymbolicTimingExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3401:6: ( (lv_value_7_0= ruleValueTimingExpression ) )
                            {
                            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3401:6: ( (lv_value_7_0= ruleValueTimingExpression ) )
                            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3402:1: (lv_value_7_0= ruleValueTimingExpression )
                            {
                            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3402:1: (lv_value_7_0= ruleValueTimingExpression )
                            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3403:3: lv_value_7_0= ruleValueTimingExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getVariableTimingExpressionAccess().getValueValueTimingExpressionParserRuleCall_5_1_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleValueTimingExpression_in_ruleVariableTimingExpression6631);
                            lv_value_7_0=ruleValueTimingExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getVariableTimingExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"value",
                                      		lv_value_7_0, 
                                      		"ValueTimingExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableTimingExpression"


    // $ANTLR start "entryRuleValueTimingExpression"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3427:1: entryRuleValueTimingExpression returns [EObject current=null] : iv_ruleValueTimingExpression= ruleValueTimingExpression EOF ;
    public final EObject entryRuleValueTimingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueTimingExpression = null;


        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3428:2: (iv_ruleValueTimingExpression= ruleValueTimingExpression EOF )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3429:2: iv_ruleValueTimingExpression= ruleValueTimingExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueTimingExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValueTimingExpression_in_entryRuleValueTimingExpression6670);
            iv_ruleValueTimingExpression=ruleValueTimingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueTimingExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValueTimingExpression6680); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueTimingExpression"


    // $ANTLR start "ruleValueTimingExpression"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3436:1: ruleValueTimingExpression returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_value_1_0= ruleEDouble ) ) ( ( ruleEString ) ) (otherlv_3= 'on' ( ( ruleEString ) ) ) otherlv_5= ')' ) | ( (lv_value_6_0= ruleEDouble ) ) ) ;
    public final EObject ruleValueTimingExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3439:28: ( ( (otherlv_0= '(' ( (lv_value_1_0= ruleEDouble ) ) ( ( ruleEString ) ) (otherlv_3= 'on' ( ( ruleEString ) ) ) otherlv_5= ')' ) | ( (lv_value_6_0= ruleEDouble ) ) ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3440:1: ( (otherlv_0= '(' ( (lv_value_1_0= ruleEDouble ) ) ( ( ruleEString ) ) (otherlv_3= 'on' ( ( ruleEString ) ) ) otherlv_5= ')' ) | ( (lv_value_6_0= ruleEDouble ) ) )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3440:1: ( (otherlv_0= '(' ( (lv_value_1_0= ruleEDouble ) ) ( ( ruleEString ) ) (otherlv_3= 'on' ( ( ruleEString ) ) ) otherlv_5= ')' ) | ( (lv_value_6_0= ruleEDouble ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==54) ) {
                alt41=1;
            }
            else if ( (LA41_0==RULE_INT||LA41_0==60||LA41_0==77) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3440:2: (otherlv_0= '(' ( (lv_value_1_0= ruleEDouble ) ) ( ( ruleEString ) ) (otherlv_3= 'on' ( ( ruleEString ) ) ) otherlv_5= ')' )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3440:2: (otherlv_0= '(' ( (lv_value_1_0= ruleEDouble ) ) ( ( ruleEString ) ) (otherlv_3= 'on' ( ( ruleEString ) ) ) otherlv_5= ')' )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3440:4: otherlv_0= '(' ( (lv_value_1_0= ruleEDouble ) ) ( ( ruleEString ) ) (otherlv_3= 'on' ( ( ruleEString ) ) ) otherlv_5= ')'
                    {
                    otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleValueTimingExpression6718); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getValueTimingExpressionAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3444:1: ( (lv_value_1_0= ruleEDouble ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3445:1: (lv_value_1_0= ruleEDouble )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3445:1: (lv_value_1_0= ruleEDouble )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3446:3: lv_value_1_0= ruleEDouble
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValueTimingExpressionAccess().getValueEDoubleParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleValueTimingExpression6739);
                    lv_value_1_0=ruleEDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getValueTimingExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_1_0, 
                              		"EDouble");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3462:2: ( ( ruleEString ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3463:1: ( ruleEString )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3463:1: ( ruleEString )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3464:3: ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getValueTimingExpressionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValueTimingExpressionAccess().getUnitUnitCrossReference_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleValueTimingExpression6766);
                    ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3480:2: (otherlv_3= 'on' ( ( ruleEString ) ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3480:4: otherlv_3= 'on' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleValueTimingExpression6779); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getValueTimingExpressionAccess().getOnKeyword_0_3_0());
                          
                    }
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3484:1: ( ( ruleEString ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3485:1: ( ruleEString )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3485:1: ( ruleEString )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3486:3: ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getValueTimingExpressionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValueTimingExpressionAccess().getTimeBaseTimeBaseCrossReference_0_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleValueTimingExpression6806);
                    ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    otherlv_5=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleValueTimingExpression6819); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getValueTimingExpressionAccess().getRightParenthesisKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3507:6: ( (lv_value_6_0= ruleEDouble ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3507:6: ( (lv_value_6_0= ruleEDouble ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3508:1: (lv_value_6_0= ruleEDouble )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3508:1: (lv_value_6_0= ruleEDouble )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3509:3: lv_value_6_0= ruleEDouble
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValueTimingExpressionAccess().getValueEDoubleParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleValueTimingExpression6847);
                    lv_value_6_0=ruleEDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getValueTimingExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_6_0, 
                              		"EDouble");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueTimingExpression"


    // $ANTLR start "entryRuleSubtraction"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3533:1: entryRuleSubtraction returns [EObject current=null] : iv_ruleSubtraction= ruleSubtraction EOF ;
    public final EObject entryRuleSubtraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubtraction = null;


        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3534:2: (iv_ruleSubtraction= ruleSubtraction EOF )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3535:2: iv_ruleSubtraction= ruleSubtraction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubtractionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubtraction_in_entryRuleSubtraction6883);
            iv_ruleSubtraction=ruleSubtraction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubtraction; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubtraction6893); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubtraction"


    // $ANTLR start "ruleSubtraction"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3542:1: ruleSubtraction returns [EObject current=null] : (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= '-' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleSubtraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_leftOperand_1_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3545:28: ( (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= '-' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')' ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3546:1: (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= '-' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')' )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3546:1: (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= '-' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')' )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3546:3: otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= '-' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleSubtraction6930); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSubtractionAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3550:1: ( (lv_leftOperand_1_0= ruleTimingExpression ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3551:1: (lv_leftOperand_1_0= ruleTimingExpression )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3551:1: (lv_leftOperand_1_0= ruleTimingExpression )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3552:3: lv_leftOperand_1_0= ruleTimingExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSubtractionAccess().getLeftOperandTimingExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTimingExpression_in_ruleSubtraction6951);
            lv_leftOperand_1_0=ruleTimingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSubtractionRule());
              	        }
                     		set(
                     			current, 
                     			"leftOperand",
                      		lv_leftOperand_1_0, 
                      		"TimingExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleSubtraction6963); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSubtractionAccess().getHyphenMinusKeyword_2());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3572:1: ( (lv_rightOperand_3_0= ruleTimingExpression ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3573:1: (lv_rightOperand_3_0= ruleTimingExpression )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3573:1: (lv_rightOperand_3_0= ruleTimingExpression )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3574:3: lv_rightOperand_3_0= ruleTimingExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSubtractionAccess().getRightOperandTimingExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTimingExpression_in_ruleSubtraction6984);
            lv_rightOperand_3_0=ruleTimingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSubtractionRule());
              	        }
                     		set(
                     			current, 
                     			"rightOperand",
                      		lv_rightOperand_3_0, 
                      		"TimingExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleSubtraction6996); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSubtractionAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubtraction"


    // $ANTLR start "entryRuleMultiplication"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3602:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3603:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3604:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultiplication_in_entryRuleMultiplication7032);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplication; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplication7042); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3611:1: ruleMultiplication returns [EObject current=null] : (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= '*' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_leftOperand_1_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3614:28: ( (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= '*' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')' ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3615:1: (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= '*' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')' )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3615:1: (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= '*' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')' )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3615:3: otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= '*' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleMultiplication7079); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMultiplicationAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3619:1: ( (lv_leftOperand_1_0= ruleTimingExpression ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3620:1: (lv_leftOperand_1_0= ruleTimingExpression )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3620:1: (lv_leftOperand_1_0= ruleTimingExpression )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3621:3: lv_leftOperand_1_0= ruleTimingExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMultiplicationAccess().getLeftOperandTimingExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTimingExpression_in_ruleMultiplication7100);
            lv_leftOperand_1_0=ruleTimingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMultiplicationRule());
              	        }
                     		set(
                     			current, 
                     			"leftOperand",
                      		lv_leftOperand_1_0, 
                      		"TimingExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleMultiplication7112); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_2());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3641:1: ( (lv_rightOperand_3_0= ruleTimingExpression ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3642:1: (lv_rightOperand_3_0= ruleTimingExpression )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3642:1: (lv_rightOperand_3_0= ruleTimingExpression )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3643:3: lv_rightOperand_3_0= ruleTimingExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMultiplicationAccess().getRightOperandTimingExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTimingExpression_in_ruleMultiplication7133);
            lv_rightOperand_3_0=ruleTimingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMultiplicationRule());
              	        }
                     		set(
                     			current, 
                     			"rightOperand",
                      		lv_rightOperand_3_0, 
                      		"TimingExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleMultiplication7145); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMultiplicationAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleDivision"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3671:1: entryRuleDivision returns [EObject current=null] : iv_ruleDivision= ruleDivision EOF ;
    public final EObject entryRuleDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivision = null;


        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3672:2: (iv_ruleDivision= ruleDivision EOF )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3673:2: iv_ruleDivision= ruleDivision EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivisionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivision_in_entryRuleDivision7181);
            iv_ruleDivision=ruleDivision();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivision; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDivision7191); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivision"


    // $ANTLR start "ruleDivision"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3680:1: ruleDivision returns [EObject current=null] : (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= '/' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleDivision() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_leftOperand_1_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3683:28: ( (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= '/' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')' ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3684:1: (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= '/' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')' )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3684:1: (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= '/' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')' )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3684:3: otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= '/' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleDivision7228); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDivisionAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3688:1: ( (lv_leftOperand_1_0= ruleTimingExpression ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3689:1: (lv_leftOperand_1_0= ruleTimingExpression )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3689:1: (lv_leftOperand_1_0= ruleTimingExpression )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3690:3: lv_leftOperand_1_0= ruleTimingExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDivisionAccess().getLeftOperandTimingExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTimingExpression_in_ruleDivision7249);
            lv_leftOperand_1_0=ruleTimingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDivisionRule());
              	        }
                     		set(
                     			current, 
                     			"leftOperand",
                      		lv_leftOperand_1_0, 
                      		"TimingExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleDivision7261); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDivisionAccess().getSolidusKeyword_2());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3710:1: ( (lv_rightOperand_3_0= ruleTimingExpression ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3711:1: (lv_rightOperand_3_0= ruleTimingExpression )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3711:1: (lv_rightOperand_3_0= ruleTimingExpression )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3712:3: lv_rightOperand_3_0= ruleTimingExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDivisionAccess().getRightOperandTimingExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTimingExpression_in_ruleDivision7282);
            lv_rightOperand_3_0=ruleTimingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDivisionRule());
              	        }
                     		set(
                     			current, 
                     			"rightOperand",
                      		lv_rightOperand_3_0, 
                      		"TimingExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleDivision7294); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getDivisionAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDivision"


    // $ANTLR start "entryRuleAssignment"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3740:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3741:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3742:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_entryRuleAssignment7330);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignment7340); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3749:1: ruleAssignment returns [EObject current=null] : (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= ':=' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_leftOperand_1_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3752:28: ( (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= ':=' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')' ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3753:1: (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= ':=' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')' )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3753:1: (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= ':=' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')' )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3753:3: otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= ':=' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleAssignment7377); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3757:1: ( (lv_leftOperand_1_0= ruleTimingExpression ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3758:1: (lv_leftOperand_1_0= ruleTimingExpression )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3758:1: (lv_leftOperand_1_0= ruleTimingExpression )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3759:3: lv_leftOperand_1_0= ruleTimingExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getLeftOperandTimingExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTimingExpression_in_ruleAssignment7398);
            lv_leftOperand_1_0=ruleTimingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"leftOperand",
                      		lv_leftOperand_1_0, 
                      		"TimingExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleAssignment7410); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_2());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3779:1: ( (lv_rightOperand_3_0= ruleTimingExpression ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3780:1: (lv_rightOperand_3_0= ruleTimingExpression )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3780:1: (lv_rightOperand_3_0= ruleTimingExpression )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3781:3: lv_rightOperand_3_0= ruleTimingExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getRightOperandTimingExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTimingExpression_in_ruleAssignment7431);
            lv_rightOperand_3_0=ruleTimingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"rightOperand",
                      		lv_rightOperand_3_0, 
                      		"TimingExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleAssignment7443); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAssignmentAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleGreaterThan"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3809:1: entryRuleGreaterThan returns [EObject current=null] : iv_ruleGreaterThan= ruleGreaterThan EOF ;
    public final EObject entryRuleGreaterThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreaterThan = null;


        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3810:2: (iv_ruleGreaterThan= ruleGreaterThan EOF )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3811:2: iv_ruleGreaterThan= ruleGreaterThan EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGreaterThanRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleGreaterThan_in_entryRuleGreaterThan7479);
            iv_ruleGreaterThan=ruleGreaterThan();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreaterThan; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGreaterThan7489); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGreaterThan"


    // $ANTLR start "ruleGreaterThan"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3818:1: ruleGreaterThan returns [EObject current=null] : (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= '>' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleGreaterThan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_leftOperand_1_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3821:28: ( (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= '>' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')' ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3822:1: (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= '>' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')' )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3822:1: (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= '>' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')' )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3822:3: otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= '>' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleGreaterThan7526); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGreaterThanAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3826:1: ( (lv_leftOperand_1_0= ruleTimingExpression ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3827:1: (lv_leftOperand_1_0= ruleTimingExpression )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3827:1: (lv_leftOperand_1_0= ruleTimingExpression )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3828:3: lv_leftOperand_1_0= ruleTimingExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGreaterThanAccess().getLeftOperandTimingExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTimingExpression_in_ruleGreaterThan7547);
            lv_leftOperand_1_0=ruleTimingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGreaterThanRule());
              	        }
                     		set(
                     			current, 
                     			"leftOperand",
                      		lv_leftOperand_1_0, 
                      		"TimingExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleGreaterThan7559); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getGreaterThanAccess().getGreaterThanSignKeyword_2());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3848:1: ( (lv_rightOperand_3_0= ruleTimingExpression ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3849:1: (lv_rightOperand_3_0= ruleTimingExpression )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3849:1: (lv_rightOperand_3_0= ruleTimingExpression )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3850:3: lv_rightOperand_3_0= ruleTimingExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGreaterThanAccess().getRightOperandTimingExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTimingExpression_in_ruleGreaterThan7580);
            lv_rightOperand_3_0=ruleTimingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGreaterThanRule());
              	        }
                     		set(
                     			current, 
                     			"rightOperand",
                      		lv_rightOperand_3_0, 
                      		"TimingExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleGreaterThan7592); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getGreaterThanAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGreaterThan"


    // $ANTLR start "entryRuleLessThan"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3878:1: entryRuleLessThan returns [EObject current=null] : iv_ruleLessThan= ruleLessThan EOF ;
    public final EObject entryRuleLessThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLessThan = null;


        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3879:2: (iv_ruleLessThan= ruleLessThan EOF )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3880:2: iv_ruleLessThan= ruleLessThan EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLessThanRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLessThan_in_entryRuleLessThan7628);
            iv_ruleLessThan=ruleLessThan();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLessThan; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLessThan7638); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLessThan"


    // $ANTLR start "ruleLessThan"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3887:1: ruleLessThan returns [EObject current=null] : (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= '<' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleLessThan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_leftOperand_1_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3890:28: ( (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= '<' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')' ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3891:1: (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= '<' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')' )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3891:1: (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= '<' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')' )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3891:3: otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= '<' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleLessThan7675); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLessThanAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3895:1: ( (lv_leftOperand_1_0= ruleTimingExpression ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3896:1: (lv_leftOperand_1_0= ruleTimingExpression )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3896:1: (lv_leftOperand_1_0= ruleTimingExpression )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3897:3: lv_leftOperand_1_0= ruleTimingExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLessThanAccess().getLeftOperandTimingExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTimingExpression_in_ruleLessThan7696);
            lv_leftOperand_1_0=ruleTimingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLessThanRule());
              	        }
                     		set(
                     			current, 
                     			"leftOperand",
                      		lv_leftOperand_1_0, 
                      		"TimingExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleLessThan7708); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLessThanAccess().getLessThanSignKeyword_2());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3917:1: ( (lv_rightOperand_3_0= ruleTimingExpression ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3918:1: (lv_rightOperand_3_0= ruleTimingExpression )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3918:1: (lv_rightOperand_3_0= ruleTimingExpression )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3919:3: lv_rightOperand_3_0= ruleTimingExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLessThanAccess().getRightOperandTimingExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTimingExpression_in_ruleLessThan7729);
            lv_rightOperand_3_0=ruleTimingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLessThanRule());
              	        }
                     		set(
                     			current, 
                     			"rightOperand",
                      		lv_rightOperand_3_0, 
                      		"TimingExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleLessThan7741); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getLessThanAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLessThan"


    // $ANTLR start "entryRuleGreaterThanOrEqual"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3947:1: entryRuleGreaterThanOrEqual returns [EObject current=null] : iv_ruleGreaterThanOrEqual= ruleGreaterThanOrEqual EOF ;
    public final EObject entryRuleGreaterThanOrEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreaterThanOrEqual = null;


        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3948:2: (iv_ruleGreaterThanOrEqual= ruleGreaterThanOrEqual EOF )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3949:2: iv_ruleGreaterThanOrEqual= ruleGreaterThanOrEqual EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGreaterThanOrEqualRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleGreaterThanOrEqual_in_entryRuleGreaterThanOrEqual7777);
            iv_ruleGreaterThanOrEqual=ruleGreaterThanOrEqual();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreaterThanOrEqual; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGreaterThanOrEqual7787); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGreaterThanOrEqual"


    // $ANTLR start "ruleGreaterThanOrEqual"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3956:1: ruleGreaterThanOrEqual returns [EObject current=null] : (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= '=>' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleGreaterThanOrEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_leftOperand_1_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3959:28: ( (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= '=>' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')' ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3960:1: (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= '=>' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')' )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3960:1: (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= '=>' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')' )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3960:3: otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= '=>' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleGreaterThanOrEqual7824); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGreaterThanOrEqualAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3964:1: ( (lv_leftOperand_1_0= ruleTimingExpression ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3965:1: (lv_leftOperand_1_0= ruleTimingExpression )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3965:1: (lv_leftOperand_1_0= ruleTimingExpression )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3966:3: lv_leftOperand_1_0= ruleTimingExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGreaterThanOrEqualAccess().getLeftOperandTimingExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTimingExpression_in_ruleGreaterThanOrEqual7845);
            lv_leftOperand_1_0=ruleTimingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGreaterThanOrEqualRule());
              	        }
                     		set(
                     			current, 
                     			"leftOperand",
                      		lv_leftOperand_1_0, 
                      		"TimingExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleGreaterThanOrEqual7857); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getGreaterThanOrEqualAccess().getEqualsSignGreaterThanSignKeyword_2());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3986:1: ( (lv_rightOperand_3_0= ruleTimingExpression ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3987:1: (lv_rightOperand_3_0= ruleTimingExpression )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3987:1: (lv_rightOperand_3_0= ruleTimingExpression )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3988:3: lv_rightOperand_3_0= ruleTimingExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGreaterThanOrEqualAccess().getRightOperandTimingExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTimingExpression_in_ruleGreaterThanOrEqual7878);
            lv_rightOperand_3_0=ruleTimingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGreaterThanOrEqualRule());
              	        }
                     		set(
                     			current, 
                     			"rightOperand",
                      		lv_rightOperand_3_0, 
                      		"TimingExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleGreaterThanOrEqual7890); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getGreaterThanOrEqualAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGreaterThanOrEqual"


    // $ANTLR start "entryRuleLessThanOrEqual"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4016:1: entryRuleLessThanOrEqual returns [EObject current=null] : iv_ruleLessThanOrEqual= ruleLessThanOrEqual EOF ;
    public final EObject entryRuleLessThanOrEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLessThanOrEqual = null;


        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4017:2: (iv_ruleLessThanOrEqual= ruleLessThanOrEqual EOF )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4018:2: iv_ruleLessThanOrEqual= ruleLessThanOrEqual EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLessThanOrEqualRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLessThanOrEqual_in_entryRuleLessThanOrEqual7926);
            iv_ruleLessThanOrEqual=ruleLessThanOrEqual();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLessThanOrEqual; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLessThanOrEqual7936); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLessThanOrEqual"


    // $ANTLR start "ruleLessThanOrEqual"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4025:1: ruleLessThanOrEqual returns [EObject current=null] : (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= '<=' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleLessThanOrEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_leftOperand_1_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4028:28: ( (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= '<=' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')' ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4029:1: (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= '<=' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')' )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4029:1: (otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= '<=' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')' )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4029:3: otherlv_0= '(' ( (lv_leftOperand_1_0= ruleTimingExpression ) ) otherlv_2= '<=' ( (lv_rightOperand_3_0= ruleTimingExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleLessThanOrEqual7973); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLessThanOrEqualAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4033:1: ( (lv_leftOperand_1_0= ruleTimingExpression ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4034:1: (lv_leftOperand_1_0= ruleTimingExpression )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4034:1: (lv_leftOperand_1_0= ruleTimingExpression )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4035:3: lv_leftOperand_1_0= ruleTimingExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLessThanOrEqualAccess().getLeftOperandTimingExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTimingExpression_in_ruleLessThanOrEqual7994);
            lv_leftOperand_1_0=ruleTimingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLessThanOrEqualRule());
              	        }
                     		set(
                     			current, 
                     			"leftOperand",
                      		lv_leftOperand_1_0, 
                      		"TimingExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleLessThanOrEqual8006); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLessThanOrEqualAccess().getLessThanSignEqualsSignKeyword_2());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4055:1: ( (lv_rightOperand_3_0= ruleTimingExpression ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4056:1: (lv_rightOperand_3_0= ruleTimingExpression )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4056:1: (lv_rightOperand_3_0= ruleTimingExpression )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4057:3: lv_rightOperand_3_0= ruleTimingExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLessThanOrEqualAccess().getRightOperandTimingExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTimingExpression_in_ruleLessThanOrEqual8027);
            lv_rightOperand_3_0=ruleTimingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLessThanOrEqualRule());
              	        }
                     		set(
                     			current, 
                     			"rightOperand",
                      		lv_rightOperand_3_0, 
                      		"TimingExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleLessThanOrEqual8039); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getLessThanOrEqualAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLessThanOrEqual"


    // $ANTLR start "entryRuleEString"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4085:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4086:2: (iv_ruleEString= ruleEString EOF )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4087:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString8076);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString8087); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4094:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4097:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4098:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4098:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_STRING) ) {
                alt42=1;
            }
            else if ( (LA42_0==RULE_ID) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4098:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString8127); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4106:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString8153); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleTimeBase"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4121:1: entryRuleTimeBase returns [EObject current=null] : iv_ruleTimeBase= ruleTimeBase EOF ;
    public final EObject entryRuleTimeBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeBase = null;


        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4122:2: (iv_ruleTimeBase= ruleTimeBase EOF )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4123:2: iv_ruleTimeBase= ruleTimeBase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeBaseRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTimeBase_in_entryRuleTimeBase8198);
            iv_ruleTimeBase=ruleTimeBase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeBase; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTimeBase8208); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeBase"


    // $ANTLR start "ruleTimeBase"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4130:1: ruleTimeBase returns [EObject current=null] : (otherlv_0= 'TimeBase' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'dimension' ( ( ruleEString ) ) (otherlv_5= 'precisionFactor' ( (lv_precisionFactor_6_0= ruleEDouble ) ) )? (otherlv_7= 'precisionUnit' ( ( ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleTimeBase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_precisionFactor_6_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4133:28: ( (otherlv_0= 'TimeBase' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'dimension' ( ( ruleEString ) ) (otherlv_5= 'precisionFactor' ( (lv_precisionFactor_6_0= ruleEDouble ) ) )? (otherlv_7= 'precisionUnit' ( ( ruleEString ) ) )? otherlv_9= '}' ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4134:1: (otherlv_0= 'TimeBase' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'dimension' ( ( ruleEString ) ) (otherlv_5= 'precisionFactor' ( (lv_precisionFactor_6_0= ruleEDouble ) ) )? (otherlv_7= 'precisionUnit' ( ( ruleEString ) ) )? otherlv_9= '}' )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4134:1: (otherlv_0= 'TimeBase' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'dimension' ( ( ruleEString ) ) (otherlv_5= 'precisionFactor' ( (lv_precisionFactor_6_0= ruleEDouble ) ) )? (otherlv_7= 'precisionUnit' ( ( ruleEString ) ) )? otherlv_9= '}' )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4134:3: otherlv_0= 'TimeBase' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'dimension' ( ( ruleEString ) ) (otherlv_5= 'precisionFactor' ( (lv_precisionFactor_6_0= ruleEDouble ) ) )? (otherlv_7= 'precisionUnit' ( ( ruleEString ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleTimeBase8245); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTimeBaseAccess().getTimeBaseKeyword_0());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4138:1: ( (lv_name_1_0= ruleEString ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4139:1: (lv_name_1_0= ruleEString )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4139:1: (lv_name_1_0= ruleEString )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4140:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeBaseAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTimeBase8266);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTimeBaseRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTimeBase8278); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTimeBaseAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleTimeBase8290); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTimeBaseAccess().getDimensionKeyword_3());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4164:1: ( ( ruleEString ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4165:1: ( ruleEString )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4165:1: ( ruleEString )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4166:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTimeBaseRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeBaseAccess().getTypeDimensionCrossReference_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTimeBase8317);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4182:2: (otherlv_5= 'precisionFactor' ( (lv_precisionFactor_6_0= ruleEDouble ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==69) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4182:4: otherlv_5= 'precisionFactor' ( (lv_precisionFactor_6_0= ruleEDouble ) )
                    {
                    otherlv_5=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleTimeBase8330); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getTimeBaseAccess().getPrecisionFactorKeyword_5_0());
                          
                    }
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4186:1: ( (lv_precisionFactor_6_0= ruleEDouble ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4187:1: (lv_precisionFactor_6_0= ruleEDouble )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4187:1: (lv_precisionFactor_6_0= ruleEDouble )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4188:3: lv_precisionFactor_6_0= ruleEDouble
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTimeBaseAccess().getPrecisionFactorEDoubleParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleTimeBase8351);
                    lv_precisionFactor_6_0=ruleEDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTimeBaseRule());
                      	        }
                             		set(
                             			current, 
                             			"precisionFactor",
                              		lv_precisionFactor_6_0, 
                              		"EDouble");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4204:4: (otherlv_7= 'precisionUnit' ( ( ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==70) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4204:6: otherlv_7= 'precisionUnit' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleTimeBase8366); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getTimeBaseAccess().getPrecisionUnitKeyword_6_0());
                          
                    }
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4208:1: ( ( ruleEString ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4209:1: ( ruleEString )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4209:1: ( ruleEString )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4210:3: ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getTimeBaseRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTimeBaseAccess().getPrecisionUnitUnitCrossReference_6_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTimeBase8393);
                    ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTimeBase8407); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getTimeBaseAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeBase"


    // $ANTLR start "entryRuleUnit"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4238:1: entryRuleUnit returns [EObject current=null] : iv_ruleUnit= ruleUnit EOF ;
    public final EObject entryRuleUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnit = null;


        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4239:2: (iv_ruleUnit= ruleUnit EOF )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4240:2: iv_ruleUnit= ruleUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnitRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnit_in_entryRuleUnit8443);
            iv_ruleUnit=ruleUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnit; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnit8453); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnit"


    // $ANTLR start "ruleUnit"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4247:1: ruleUnit returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'factor' ( (lv_factor_4_0= ruleEDouble ) ) )? (otherlv_5= 'offset' ( (lv_offset_6_0= ruleEDouble ) ) )? (otherlv_7= 'reference' ( ( ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleUnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_factor_4_0 = null;

        AntlrDatatypeRuleToken lv_offset_6_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4250:28: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'factor' ( (lv_factor_4_0= ruleEDouble ) ) )? (otherlv_5= 'offset' ( (lv_offset_6_0= ruleEDouble ) ) )? (otherlv_7= 'reference' ( ( ruleEString ) ) )? otherlv_9= '}' ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4251:1: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'factor' ( (lv_factor_4_0= ruleEDouble ) ) )? (otherlv_5= 'offset' ( (lv_offset_6_0= ruleEDouble ) ) )? (otherlv_7= 'reference' ( ( ruleEString ) ) )? otherlv_9= '}' )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4251:1: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'factor' ( (lv_factor_4_0= ruleEDouble ) ) )? (otherlv_5= 'offset' ( (lv_offset_6_0= ruleEDouble ) ) )? (otherlv_7= 'reference' ( ( ruleEString ) ) )? otherlv_9= '}' )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4251:2: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'factor' ( (lv_factor_4_0= ruleEDouble ) ) )? (otherlv_5= 'offset' ( (lv_offset_6_0= ruleEDouble ) ) )? (otherlv_7= 'reference' ( ( ruleEString ) ) )? otherlv_9= '}'
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4251:2: ()
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4252:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUnitAccess().getUnitAction_0(),
                          current);
                  
            }

            }

            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4260:2: ( (lv_name_1_0= ruleEString ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4261:1: (lv_name_1_0= ruleEString )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4261:1: (lv_name_1_0= ruleEString )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4262:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUnitAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUnit8511);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUnitRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleUnit8523); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getUnitAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4282:1: (otherlv_3= 'factor' ( (lv_factor_4_0= ruleEDouble ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==71) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4282:3: otherlv_3= 'factor' ( (lv_factor_4_0= ruleEDouble ) )
                    {
                    otherlv_3=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleUnit8536); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getUnitAccess().getFactorKeyword_3_0());
                          
                    }
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4286:1: ( (lv_factor_4_0= ruleEDouble ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4287:1: (lv_factor_4_0= ruleEDouble )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4287:1: (lv_factor_4_0= ruleEDouble )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4288:3: lv_factor_4_0= ruleEDouble
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnitAccess().getFactorEDoubleParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleUnit8557);
                    lv_factor_4_0=ruleEDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnitRule());
                      	        }
                             		set(
                             			current, 
                             			"factor",
                              		lv_factor_4_0, 
                              		"EDouble");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4304:4: (otherlv_5= 'offset' ( (lv_offset_6_0= ruleEDouble ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==42) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4304:6: otherlv_5= 'offset' ( (lv_offset_6_0= ruleEDouble ) )
                    {
                    otherlv_5=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleUnit8572); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getUnitAccess().getOffsetKeyword_4_0());
                          
                    }
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4308:1: ( (lv_offset_6_0= ruleEDouble ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4309:1: (lv_offset_6_0= ruleEDouble )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4309:1: (lv_offset_6_0= ruleEDouble )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4310:3: lv_offset_6_0= ruleEDouble
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnitAccess().getOffsetEDoubleParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleUnit8593);
                    lv_offset_6_0=ruleEDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnitRule());
                      	        }
                             		set(
                             			current, 
                             			"offset",
                              		lv_offset_6_0, 
                              		"EDouble");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4326:4: (otherlv_7= 'reference' ( ( ruleEString ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==72) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4326:6: otherlv_7= 'reference' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleUnit8608); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getUnitAccess().getReferenceKeyword_5_0());
                          
                    }
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4330:1: ( ( ruleEString ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4331:1: ( ruleEString )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4331:1: ( ruleEString )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4332:3: ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getUnitRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnitAccess().getReferenceUnitCrossReference_5_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUnit8635);
                    ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleUnit8649); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getUnitAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnit"


    // $ANTLR start "entryRuleDimension"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4360:1: entryRuleDimension returns [EObject current=null] : iv_ruleDimension= ruleDimension EOF ;
    public final EObject entryRuleDimension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimension = null;


        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4361:2: (iv_ruleDimension= ruleDimension EOF )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4362:2: iv_ruleDimension= ruleDimension EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDimensionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDimension_in_entryRuleDimension8685);
            iv_ruleDimension=ruleDimension();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDimension; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDimension8695); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDimension"


    // $ANTLR start "ruleDimension"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4369:1: ruleDimension returns [EObject current=null] : (otherlv_0= 'Dimension' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'kind' ( (lv_kind_4_0= ruleDimensionKind ) ) )? otherlv_5= 'Units' otherlv_6= '{' ( (lv_units_7_0= ruleUnit ) ) (otherlv_8= ',' ( (lv_units_9_0= ruleUnit ) ) )* otherlv_10= '}' otherlv_11= '}' ) ;
    public final EObject ruleDimension() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_kind_4_0 = null;

        EObject lv_units_7_0 = null;

        EObject lv_units_9_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4372:28: ( (otherlv_0= 'Dimension' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'kind' ( (lv_kind_4_0= ruleDimensionKind ) ) )? otherlv_5= 'Units' otherlv_6= '{' ( (lv_units_7_0= ruleUnit ) ) (otherlv_8= ',' ( (lv_units_9_0= ruleUnit ) ) )* otherlv_10= '}' otherlv_11= '}' ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4373:1: (otherlv_0= 'Dimension' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'kind' ( (lv_kind_4_0= ruleDimensionKind ) ) )? otherlv_5= 'Units' otherlv_6= '{' ( (lv_units_7_0= ruleUnit ) ) (otherlv_8= ',' ( (lv_units_9_0= ruleUnit ) ) )* otherlv_10= '}' otherlv_11= '}' )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4373:1: (otherlv_0= 'Dimension' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'kind' ( (lv_kind_4_0= ruleDimensionKind ) ) )? otherlv_5= 'Units' otherlv_6= '{' ( (lv_units_7_0= ruleUnit ) ) (otherlv_8= ',' ( (lv_units_9_0= ruleUnit ) ) )* otherlv_10= '}' otherlv_11= '}' )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4373:3: otherlv_0= 'Dimension' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'kind' ( (lv_kind_4_0= ruleDimensionKind ) ) )? otherlv_5= 'Units' otherlv_6= '{' ( (lv_units_7_0= ruleUnit ) ) (otherlv_8= ',' ( (lv_units_9_0= ruleUnit ) ) )* otherlv_10= '}' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleDimension8732); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDimensionAccess().getDimensionKeyword_0());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4377:1: ( (lv_name_1_0= ruleEString ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4378:1: (lv_name_1_0= ruleEString )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4378:1: (lv_name_1_0= ruleEString )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4379:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDimensionAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDimension8753);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDimensionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDimension8765); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDimensionAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4399:1: (otherlv_3= 'kind' ( (lv_kind_4_0= ruleDimensionKind ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==74) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4399:3: otherlv_3= 'kind' ( (lv_kind_4_0= ruleDimensionKind ) )
                    {
                    otherlv_3=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruleDimension8778); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDimensionAccess().getKindKeyword_3_0());
                          
                    }
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4403:1: ( (lv_kind_4_0= ruleDimensionKind ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4404:1: (lv_kind_4_0= ruleDimensionKind )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4404:1: (lv_kind_4_0= ruleDimensionKind )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4405:3: lv_kind_4_0= ruleDimensionKind
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDimensionAccess().getKindDimensionKindEnumRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDimensionKind_in_ruleDimension8799);
                    lv_kind_4_0=ruleDimensionKind();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDimensionRule());
                      	        }
                             		set(
                             			current, 
                             			"kind",
                              		lv_kind_4_0, 
                              		"DimensionKind");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,75,FollowSets000.FOLLOW_75_in_ruleDimension8813); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDimensionAccess().getUnitsKeyword_4());
                  
            }
            otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDimension8825); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getDimensionAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4429:1: ( (lv_units_7_0= ruleUnit ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4430:1: (lv_units_7_0= ruleUnit )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4430:1: (lv_units_7_0= ruleUnit )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4431:3: lv_units_7_0= ruleUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDimensionAccess().getUnitsUnitParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnit_in_ruleDimension8846);
            lv_units_7_0=ruleUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDimensionRule());
              	        }
                     		add(
                     			current, 
                     			"units",
                      		lv_units_7_0, 
                      		"Unit");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4447:2: (otherlv_8= ',' ( (lv_units_9_0= ruleUnit ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==18) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4447:4: otherlv_8= ',' ( (lv_units_9_0= ruleUnit ) )
            	    {
            	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDimension8859); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getDimensionAccess().getCommaKeyword_7_0());
            	          
            	    }
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4451:1: ( (lv_units_9_0= ruleUnit ) )
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4452:1: (lv_units_9_0= ruleUnit )
            	    {
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4452:1: (lv_units_9_0= ruleUnit )
            	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4453:3: lv_units_9_0= ruleUnit
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDimensionAccess().getUnitsUnitParserRuleCall_7_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleUnit_in_ruleDimension8880);
            	    lv_units_9_0=ruleUnit();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDimensionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"units",
            	              		lv_units_9_0, 
            	              		"Unit");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDimension8894); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getDimensionAccess().getRightCurlyBracketKeyword_8());
                  
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDimension8906); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getDimensionAccess().getRightCurlyBracketKeyword_9());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDimension"


    // $ANTLR start "entryRuleTimeBaseRelation"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4485:1: entryRuleTimeBaseRelation returns [EObject current=null] : iv_ruleTimeBaseRelation= ruleTimeBaseRelation EOF ;
    public final EObject entryRuleTimeBaseRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeBaseRelation = null;


        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4486:2: (iv_ruleTimeBaseRelation= ruleTimeBaseRelation EOF )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4487:2: iv_ruleTimeBaseRelation= ruleTimeBaseRelation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeBaseRelationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTimeBaseRelation_in_entryRuleTimeBaseRelation8942);
            iv_ruleTimeBaseRelation=ruleTimeBaseRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeBaseRelation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTimeBaseRelation8952); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeBaseRelation"


    // $ANTLR start "ruleTimeBaseRelation"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4494:1: ruleTimeBaseRelation returns [EObject current=null] : (otherlv_0= 'TimeBaseRelation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_left_3_0= ruleSymbolicTimingExpression ) ) | (otherlv_4= '(' ( (lv_left_5_0= ruleVariableTimingExpression ) ) otherlv_6= ')' ) | ( (lv_left_7_0= ruleValueTimingExpression ) ) ) otherlv_8= '=' ( ( (lv_right_9_0= ruleSymbolicTimingExpression ) ) | (otherlv_10= '(' ( (lv_right_11_0= ruleVariableTimingExpression ) ) otherlv_12= ')' ) | ( (lv_right_13_0= ruleValueTimingExpression ) ) ) otherlv_14= '}' ) ;
    public final EObject ruleTimeBaseRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_left_3_0 = null;

        EObject lv_left_5_0 = null;

        EObject lv_left_7_0 = null;

        EObject lv_right_9_0 = null;

        EObject lv_right_11_0 = null;

        EObject lv_right_13_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4497:28: ( (otherlv_0= 'TimeBaseRelation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_left_3_0= ruleSymbolicTimingExpression ) ) | (otherlv_4= '(' ( (lv_left_5_0= ruleVariableTimingExpression ) ) otherlv_6= ')' ) | ( (lv_left_7_0= ruleValueTimingExpression ) ) ) otherlv_8= '=' ( ( (lv_right_9_0= ruleSymbolicTimingExpression ) ) | (otherlv_10= '(' ( (lv_right_11_0= ruleVariableTimingExpression ) ) otherlv_12= ')' ) | ( (lv_right_13_0= ruleValueTimingExpression ) ) ) otherlv_14= '}' ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4498:1: (otherlv_0= 'TimeBaseRelation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_left_3_0= ruleSymbolicTimingExpression ) ) | (otherlv_4= '(' ( (lv_left_5_0= ruleVariableTimingExpression ) ) otherlv_6= ')' ) | ( (lv_left_7_0= ruleValueTimingExpression ) ) ) otherlv_8= '=' ( ( (lv_right_9_0= ruleSymbolicTimingExpression ) ) | (otherlv_10= '(' ( (lv_right_11_0= ruleVariableTimingExpression ) ) otherlv_12= ')' ) | ( (lv_right_13_0= ruleValueTimingExpression ) ) ) otherlv_14= '}' )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4498:1: (otherlv_0= 'TimeBaseRelation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_left_3_0= ruleSymbolicTimingExpression ) ) | (otherlv_4= '(' ( (lv_left_5_0= ruleVariableTimingExpression ) ) otherlv_6= ')' ) | ( (lv_left_7_0= ruleValueTimingExpression ) ) ) otherlv_8= '=' ( ( (lv_right_9_0= ruleSymbolicTimingExpression ) ) | (otherlv_10= '(' ( (lv_right_11_0= ruleVariableTimingExpression ) ) otherlv_12= ')' ) | ( (lv_right_13_0= ruleValueTimingExpression ) ) ) otherlv_14= '}' )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4498:3: otherlv_0= 'TimeBaseRelation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_left_3_0= ruleSymbolicTimingExpression ) ) | (otherlv_4= '(' ( (lv_left_5_0= ruleVariableTimingExpression ) ) otherlv_6= ')' ) | ( (lv_left_7_0= ruleValueTimingExpression ) ) ) otherlv_8= '=' ( ( (lv_right_9_0= ruleSymbolicTimingExpression ) ) | (otherlv_10= '(' ( (lv_right_11_0= ruleVariableTimingExpression ) ) otherlv_12= ')' ) | ( (lv_right_13_0= ruleValueTimingExpression ) ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,76,FollowSets000.FOLLOW_76_in_ruleTimeBaseRelation8989); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTimeBaseRelationAccess().getTimeBaseRelationKeyword_0());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4502:1: ( (lv_name_1_0= ruleEString ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4503:1: (lv_name_1_0= ruleEString )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4503:1: (lv_name_1_0= ruleEString )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4504:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeBaseRelationAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTimeBaseRelation9010);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTimeBaseRelationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTimeBaseRelation9022); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTimeBaseRelationAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4524:1: ( ( (lv_left_3_0= ruleSymbolicTimingExpression ) ) | (otherlv_4= '(' ( (lv_left_5_0= ruleVariableTimingExpression ) ) otherlv_6= ')' ) | ( (lv_left_7_0= ruleValueTimingExpression ) ) )
            int alt50=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
                {
                alt50=1;
                }
                break;
            case 54:
                {
                int LA50_3 = input.LA(2);

                if ( (synpred79_InternalTadl2()) ) {
                    alt50=1;
                }
                else if ( (synpred80_InternalTadl2()) ) {
                    alt50=2;
                }
                else if ( (true) ) {
                    alt50=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case 60:
            case 77:
                {
                alt50=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4524:2: ( (lv_left_3_0= ruleSymbolicTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4524:2: ( (lv_left_3_0= ruleSymbolicTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4525:1: (lv_left_3_0= ruleSymbolicTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4525:1: (lv_left_3_0= ruleSymbolicTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4526:3: lv_left_3_0= ruleSymbolicTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTimeBaseRelationAccess().getLeftSymbolicTimingExpressionParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSymbolicTimingExpression_in_ruleTimeBaseRelation9044);
                    lv_left_3_0=ruleSymbolicTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTimeBaseRelationRule());
                      	        }
                             		set(
                             			current, 
                             			"left",
                              		lv_left_3_0, 
                              		"SymbolicTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4543:6: (otherlv_4= '(' ( (lv_left_5_0= ruleVariableTimingExpression ) ) otherlv_6= ')' )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4543:6: (otherlv_4= '(' ( (lv_left_5_0= ruleVariableTimingExpression ) ) otherlv_6= ')' )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4543:8: otherlv_4= '(' ( (lv_left_5_0= ruleVariableTimingExpression ) ) otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleTimeBaseRelation9063); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTimeBaseRelationAccess().getLeftParenthesisKeyword_3_1_0());
                          
                    }
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4547:1: ( (lv_left_5_0= ruleVariableTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4548:1: (lv_left_5_0= ruleVariableTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4548:1: (lv_left_5_0= ruleVariableTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4549:3: lv_left_5_0= ruleVariableTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTimeBaseRelationAccess().getLeftVariableTimingExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVariableTimingExpression_in_ruleTimeBaseRelation9084);
                    lv_left_5_0=ruleVariableTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTimeBaseRelationRule());
                      	        }
                             		set(
                             			current, 
                             			"left",
                              		lv_left_5_0, 
                              		"VariableTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleTimeBaseRelation9096); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getTimeBaseRelationAccess().getRightParenthesisKeyword_3_1_2());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4570:6: ( (lv_left_7_0= ruleValueTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4570:6: ( (lv_left_7_0= ruleValueTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4571:1: (lv_left_7_0= ruleValueTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4571:1: (lv_left_7_0= ruleValueTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4572:3: lv_left_7_0= ruleValueTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTimeBaseRelationAccess().getLeftValueTimingExpressionParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValueTimingExpression_in_ruleTimeBaseRelation9124);
                    lv_left_7_0=ruleValueTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTimeBaseRelationRule());
                      	        }
                             		set(
                             			current, 
                             			"left",
                              		lv_left_7_0, 
                              		"ValueTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleTimeBaseRelation9137); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getTimeBaseRelationAccess().getEqualsSignKeyword_4());
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4592:1: ( ( (lv_right_9_0= ruleSymbolicTimingExpression ) ) | (otherlv_10= '(' ( (lv_right_11_0= ruleVariableTimingExpression ) ) otherlv_12= ')' ) | ( (lv_right_13_0= ruleValueTimingExpression ) ) )
            int alt51=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
                {
                alt51=1;
                }
                break;
            case 54:
                {
                int LA51_3 = input.LA(2);

                if ( (synpred81_InternalTadl2()) ) {
                    alt51=1;
                }
                else if ( (synpred82_InternalTadl2()) ) {
                    alt51=2;
                }
                else if ( (true) ) {
                    alt51=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case 60:
            case 77:
                {
                alt51=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4592:2: ( (lv_right_9_0= ruleSymbolicTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4592:2: ( (lv_right_9_0= ruleSymbolicTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4593:1: (lv_right_9_0= ruleSymbolicTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4593:1: (lv_right_9_0= ruleSymbolicTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4594:3: lv_right_9_0= ruleSymbolicTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTimeBaseRelationAccess().getRightSymbolicTimingExpressionParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSymbolicTimingExpression_in_ruleTimeBaseRelation9159);
                    lv_right_9_0=ruleSymbolicTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTimeBaseRelationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_9_0, 
                              		"SymbolicTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4611:6: (otherlv_10= '(' ( (lv_right_11_0= ruleVariableTimingExpression ) ) otherlv_12= ')' )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4611:6: (otherlv_10= '(' ( (lv_right_11_0= ruleVariableTimingExpression ) ) otherlv_12= ')' )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4611:8: otherlv_10= '(' ( (lv_right_11_0= ruleVariableTimingExpression ) ) otherlv_12= ')'
                    {
                    otherlv_10=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleTimeBaseRelation9178); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getTimeBaseRelationAccess().getLeftParenthesisKeyword_5_1_0());
                          
                    }
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4615:1: ( (lv_right_11_0= ruleVariableTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4616:1: (lv_right_11_0= ruleVariableTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4616:1: (lv_right_11_0= ruleVariableTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4617:3: lv_right_11_0= ruleVariableTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTimeBaseRelationAccess().getRightVariableTimingExpressionParserRuleCall_5_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVariableTimingExpression_in_ruleTimeBaseRelation9199);
                    lv_right_11_0=ruleVariableTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTimeBaseRelationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_11_0, 
                              		"VariableTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_12=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleTimeBaseRelation9211); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getTimeBaseRelationAccess().getRightParenthesisKeyword_5_1_2());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4638:6: ( (lv_right_13_0= ruleValueTimingExpression ) )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4638:6: ( (lv_right_13_0= ruleValueTimingExpression ) )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4639:1: (lv_right_13_0= ruleValueTimingExpression )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4639:1: (lv_right_13_0= ruleValueTimingExpression )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4640:3: lv_right_13_0= ruleValueTimingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTimeBaseRelationAccess().getRightValueTimingExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValueTimingExpression_in_ruleTimeBaseRelation9239);
                    lv_right_13_0=ruleValueTimingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTimeBaseRelationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_13_0, 
                              		"ValueTimingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTimeBaseRelation9252); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getTimeBaseRelationAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeBaseRelation"


    // $ANTLR start "entryRuleEDouble"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4668:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4669:2: (iv_ruleEDouble= ruleEDouble EOF )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4670:2: iv_ruleEDouble= ruleEDouble EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDoubleRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble9289);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDouble.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble9300); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4677:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;

         enterRule(); 
            
        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4680:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4681:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4681:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4681:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4681:2: (kw= '-' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==60) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4682:2: kw= '-'
                    {
                    kw=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleEDouble9339); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4687:3: (this_INT_1= RULE_INT )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_INT) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4687:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble9357); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }

            kw=(Token)match(input,77,FollowSets000.FOLLOW_77_in_ruleEDouble9377); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
                  
            }
            this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble9392); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_3);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
                  
            }
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4707:1: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=78 && LA56_0<=79)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4707:2: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4707:2: (kw= 'E' | kw= 'e' )
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==78) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==79) ) {
                        alt54=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4708:2: kw= 'E'
                            {
                            kw=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleEDouble9412); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4715:2: kw= 'e'
                            {
                            kw=(Token)match(input,79,FollowSets000.FOLLOW_79_in_ruleEDouble9431); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4720:2: (kw= '-' )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==60) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4721:2: kw= '-'
                            {
                            kw=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleEDouble9446); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
                                  
                            }

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble9463); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "ruleDimensionKind"
    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4741:1: ruleDimensionKind returns [Enumerator current=null] : ( (enumLiteral_0= 'other' ) | (enumLiteral_1= 'Time' ) | (enumLiteral_2= 'Angle' ) | (enumLiteral_3= 'Distance' ) ) ;
    public final Enumerator ruleDimensionKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4743:28: ( ( (enumLiteral_0= 'other' ) | (enumLiteral_1= 'Time' ) | (enumLiteral_2= 'Angle' ) | (enumLiteral_3= 'Distance' ) ) )
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4744:1: ( (enumLiteral_0= 'other' ) | (enumLiteral_1= 'Time' ) | (enumLiteral_2= 'Angle' ) | (enumLiteral_3= 'Distance' ) )
            {
            // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4744:1: ( (enumLiteral_0= 'other' ) | (enumLiteral_1= 'Time' ) | (enumLiteral_2= 'Angle' ) | (enumLiteral_3= 'Distance' ) )
            int alt57=4;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt57=1;
                }
                break;
            case 81:
                {
                alt57=2;
                }
                break;
            case 82:
                {
                alt57=3;
                }
                break;
            case 83:
                {
                alt57=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4744:2: (enumLiteral_0= 'other' )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4744:2: (enumLiteral_0= 'other' )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4744:4: enumLiteral_0= 'other'
                    {
                    enumLiteral_0=(Token)match(input,80,FollowSets000.FOLLOW_80_in_ruleDimensionKind9524); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDimensionKindAccess().getOtherEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getDimensionKindAccess().getOtherEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4750:6: (enumLiteral_1= 'Time' )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4750:6: (enumLiteral_1= 'Time' )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4750:8: enumLiteral_1= 'Time'
                    {
                    enumLiteral_1=(Token)match(input,81,FollowSets000.FOLLOW_81_in_ruleDimensionKind9541); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDimensionKindAccess().getTimeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getDimensionKindAccess().getTimeEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4756:6: (enumLiteral_2= 'Angle' )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4756:6: (enumLiteral_2= 'Angle' )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4756:8: enumLiteral_2= 'Angle'
                    {
                    enumLiteral_2=(Token)match(input,82,FollowSets000.FOLLOW_82_in_ruleDimensionKind9558); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDimensionKindAccess().getAngleEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getDimensionKindAccess().getAngleEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4762:6: (enumLiteral_3= 'Distance' )
                    {
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4762:6: (enumLiteral_3= 'Distance' )
                    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4762:8: enumLiteral_3= 'Distance'
                    {
                    enumLiteral_3=(Token)match(input,83,FollowSets000.FOLLOW_83_in_ruleDimensionKind9575); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDimensionKindAccess().getDistanceEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getDimensionKindAccess().getDistanceEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDimensionKind"

    // $ANTLR start synpred18_InternalTadl2
    public final void synpred18_InternalTadl2_fragment() throws RecognitionException {   
        EObject this_PatternConstraint_4 = null;


        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:668:2: (this_PatternConstraint_4= rulePatternConstraint )
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:668:2: this_PatternConstraint_4= rulePatternConstraint
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_rulePatternConstraint_in_synpred18_InternalTadl21294);
        this_PatternConstraint_4=rulePatternConstraint();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalTadl2

    // $ANTLR start synpred21_InternalTadl2
    public final void synpred21_InternalTadl2_fragment() throws RecognitionException {   
        EObject this_ArbitraryConstraint_7 = null;


        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:707:2: (this_ArbitraryConstraint_7= ruleArbitraryConstraint )
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:707:2: this_ArbitraryConstraint_7= ruleArbitraryConstraint
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleArbitraryConstraint_in_synpred21_InternalTadl21384);
        this_ArbitraryConstraint_7=ruleArbitraryConstraint();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_InternalTadl2

    // $ANTLR start synpred48_InternalTadl2
    public final void synpred48_InternalTadl2_fragment() throws RecognitionException {   
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_minimum_8_0 = null;

        EObject lv_minimum_10_0 = null;

        EObject lv_minimum_11_0 = null;

        EObject lv_maximum_14_0 = null;


        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2299:6: ( ( ( (lv_minimum_8_0= ruleValueTimingExpression ) ) ( (otherlv_9= ',' ( (lv_minimum_10_0= ruleSymbolicTimingExpression ) ) ) | ( (lv_minimum_11_0= ruleValueTimingExpression ) ) )* otherlv_12= 'maximum' otherlv_13= '=' ( (lv_maximum_14_0= ruleSymbolicTimingExpression ) ) ) )
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2299:6: ( ( (lv_minimum_8_0= ruleValueTimingExpression ) ) ( (otherlv_9= ',' ( (lv_minimum_10_0= ruleSymbolicTimingExpression ) ) ) | ( (lv_minimum_11_0= ruleValueTimingExpression ) ) )* otherlv_12= 'maximum' otherlv_13= '=' ( (lv_maximum_14_0= ruleSymbolicTimingExpression ) ) )
        {
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2299:6: ( ( (lv_minimum_8_0= ruleValueTimingExpression ) ) ( (otherlv_9= ',' ( (lv_minimum_10_0= ruleSymbolicTimingExpression ) ) ) | ( (lv_minimum_11_0= ruleValueTimingExpression ) ) )* otherlv_12= 'maximum' otherlv_13= '=' ( (lv_maximum_14_0= ruleSymbolicTimingExpression ) ) )
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2299:7: ( (lv_minimum_8_0= ruleValueTimingExpression ) ) ( (otherlv_9= ',' ( (lv_minimum_10_0= ruleSymbolicTimingExpression ) ) ) | ( (lv_minimum_11_0= ruleValueTimingExpression ) ) )* otherlv_12= 'maximum' otherlv_13= '=' ( (lv_maximum_14_0= ruleSymbolicTimingExpression ) )
        {
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2299:7: ( (lv_minimum_8_0= ruleValueTimingExpression ) )
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2300:1: (lv_minimum_8_0= ruleValueTimingExpression )
        {
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2300:1: (lv_minimum_8_0= ruleValueTimingExpression )
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2301:3: lv_minimum_8_0= ruleValueTimingExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getArbitraryConstraintAccess().getMinimumValueTimingExpressionParserRuleCall_1_0_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleValueTimingExpression_in_synpred48_InternalTadl24413);
        lv_minimum_8_0=ruleValueTimingExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2317:2: ( (otherlv_9= ',' ( (lv_minimum_10_0= ruleSymbolicTimingExpression ) ) ) | ( (lv_minimum_11_0= ruleValueTimingExpression ) ) )*
        loop61:
        do {
            int alt61=3;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==18) ) {
                alt61=1;
            }
            else if ( (LA61_0==RULE_INT||LA61_0==54||LA61_0==60||LA61_0==77) ) {
                alt61=2;
            }


            switch (alt61) {
        	case 1 :
        	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2317:3: (otherlv_9= ',' ( (lv_minimum_10_0= ruleSymbolicTimingExpression ) ) )
        	    {
        	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2317:3: (otherlv_9= ',' ( (lv_minimum_10_0= ruleSymbolicTimingExpression ) ) )
        	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2317:5: otherlv_9= ',' ( (lv_minimum_10_0= ruleSymbolicTimingExpression ) )
        	    {
        	    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_synpred48_InternalTadl24427); if (state.failed) return ;
        	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2321:1: ( (lv_minimum_10_0= ruleSymbolicTimingExpression ) )
        	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2322:1: (lv_minimum_10_0= ruleSymbolicTimingExpression )
        	    {
        	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2322:1: (lv_minimum_10_0= ruleSymbolicTimingExpression )
        	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2323:3: lv_minimum_10_0= ruleSymbolicTimingExpression
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getArbitraryConstraintAccess().getMinimumSymbolicTimingExpressionParserRuleCall_1_1_0_1_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleSymbolicTimingExpression_in_synpred48_InternalTadl24448);
        	    lv_minimum_10_0=ruleSymbolicTimingExpression();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }


        	    }
        	    break;
        	case 2 :
        	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2340:6: ( (lv_minimum_11_0= ruleValueTimingExpression ) )
        	    {
        	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2340:6: ( (lv_minimum_11_0= ruleValueTimingExpression ) )
        	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2341:1: (lv_minimum_11_0= ruleValueTimingExpression )
        	    {
        	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2341:1: (lv_minimum_11_0= ruleValueTimingExpression )
        	    // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2342:3: lv_minimum_11_0= ruleValueTimingExpression
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getArbitraryConstraintAccess().getMinimumValueTimingExpressionParserRuleCall_1_1_1_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleValueTimingExpression_in_synpred48_InternalTadl24476);
        	    lv_minimum_11_0=ruleValueTimingExpression();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop61;
            }
        } while (true);

        otherlv_12=(Token)match(input,47,FollowSets000.FOLLOW_47_in_synpred48_InternalTadl24490); if (state.failed) return ;
        otherlv_13=(Token)match(input,27,FollowSets000.FOLLOW_27_in_synpred48_InternalTadl24502); if (state.failed) return ;
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2366:1: ( (lv_maximum_14_0= ruleSymbolicTimingExpression ) )
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2367:1: (lv_maximum_14_0= ruleSymbolicTimingExpression )
        {
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2367:1: (lv_maximum_14_0= ruleSymbolicTimingExpression )
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:2368:3: lv_maximum_14_0= ruleSymbolicTimingExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getArbitraryConstraintAccess().getMaximumSymbolicTimingExpressionParserRuleCall_1_4_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleSymbolicTimingExpression_in_synpred48_InternalTadl24523);
        lv_maximum_14_0=ruleSymbolicTimingExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred48_InternalTadl2

    // $ANTLR start synpred59_InternalTadl2
    public final void synpred59_InternalTadl2_fragment() throws RecognitionException {   
        EObject this_Addition_0 = null;


        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3113:2: (this_Addition_0= ruleAddition )
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3113:2: this_Addition_0= ruleAddition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleAddition_in_synpred59_InternalTadl26021);
        this_Addition_0=ruleAddition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_InternalTadl2

    // $ANTLR start synpred60_InternalTadl2
    public final void synpred60_InternalTadl2_fragment() throws RecognitionException {   
        EObject this_Subtraction_1 = null;


        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3126:2: (this_Subtraction_1= ruleSubtraction )
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3126:2: this_Subtraction_1= ruleSubtraction
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleSubtraction_in_synpred60_InternalTadl26051);
        this_Subtraction_1=ruleSubtraction();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_InternalTadl2

    // $ANTLR start synpred61_InternalTadl2
    public final void synpred61_InternalTadl2_fragment() throws RecognitionException {   
        EObject this_Multiplication_2 = null;


        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3139:2: (this_Multiplication_2= ruleMultiplication )
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3139:2: this_Multiplication_2= ruleMultiplication
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleMultiplication_in_synpred61_InternalTadl26081);
        this_Multiplication_2=ruleMultiplication();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_InternalTadl2

    // $ANTLR start synpred62_InternalTadl2
    public final void synpred62_InternalTadl2_fragment() throws RecognitionException {   
        EObject this_Division_3 = null;


        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3152:2: (this_Division_3= ruleDivision )
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3152:2: this_Division_3= ruleDivision
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleDivision_in_synpred62_InternalTadl26111);
        this_Division_3=ruleDivision();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_InternalTadl2

    // $ANTLR start synpred63_InternalTadl2
    public final void synpred63_InternalTadl2_fragment() throws RecognitionException {   
        EObject this_Assignment_4 = null;


        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3165:2: (this_Assignment_4= ruleAssignment )
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3165:2: this_Assignment_4= ruleAssignment
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_synpred63_InternalTadl26141);
        this_Assignment_4=ruleAssignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_InternalTadl2

    // $ANTLR start synpred64_InternalTadl2
    public final void synpred64_InternalTadl2_fragment() throws RecognitionException {   
        EObject this_GreaterThan_5 = null;


        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3178:2: (this_GreaterThan_5= ruleGreaterThan )
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3178:2: this_GreaterThan_5= ruleGreaterThan
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleGreaterThan_in_synpred64_InternalTadl26171);
        this_GreaterThan_5=ruleGreaterThan();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred64_InternalTadl2

    // $ANTLR start synpred65_InternalTadl2
    public final void synpred65_InternalTadl2_fragment() throws RecognitionException {   
        EObject this_LessThan_6 = null;


        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3191:2: (this_LessThan_6= ruleLessThan )
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3191:2: this_LessThan_6= ruleLessThan
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleLessThan_in_synpred65_InternalTadl26201);
        this_LessThan_6=ruleLessThan();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_InternalTadl2

    // $ANTLR start synpred66_InternalTadl2
    public final void synpred66_InternalTadl2_fragment() throws RecognitionException {   
        EObject this_GreaterThanOrEqual_7 = null;


        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3204:2: (this_GreaterThanOrEqual_7= ruleGreaterThanOrEqual )
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3204:2: this_GreaterThanOrEqual_7= ruleGreaterThanOrEqual
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleGreaterThanOrEqual_in_synpred66_InternalTadl26231);
        this_GreaterThanOrEqual_7=ruleGreaterThanOrEqual();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred66_InternalTadl2

    // $ANTLR start synpred69_InternalTadl2
    public final void synpred69_InternalTadl2_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        EObject lv_value_6_0 = null;

        EObject lv_value_7_0 = null;


        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3378:4: (otherlv_5= ':=' ( ( (lv_value_6_0= ruleSymbolicTimingExpression ) ) | ( (lv_value_7_0= ruleValueTimingExpression ) ) ) )
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3378:4: otherlv_5= ':=' ( ( (lv_value_6_0= ruleSymbolicTimingExpression ) ) | ( (lv_value_7_0= ruleValueTimingExpression ) ) )
        {
        otherlv_5=(Token)match(input,59,FollowSets000.FOLLOW_59_in_synpred69_InternalTadl26582); if (state.failed) return ;
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3382:1: ( ( (lv_value_6_0= ruleSymbolicTimingExpression ) ) | ( (lv_value_7_0= ruleValueTimingExpression ) ) )
        int alt62=2;
        alt62 = dfa62.predict(input);
        switch (alt62) {
            case 1 :
                // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3382:2: ( (lv_value_6_0= ruleSymbolicTimingExpression ) )
                {
                // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3382:2: ( (lv_value_6_0= ruleSymbolicTimingExpression ) )
                // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3383:1: (lv_value_6_0= ruleSymbolicTimingExpression )
                {
                // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3383:1: (lv_value_6_0= ruleSymbolicTimingExpression )
                // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3384:3: lv_value_6_0= ruleSymbolicTimingExpression
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getVariableTimingExpressionAccess().getValueSymbolicTimingExpressionParserRuleCall_5_1_0_0()); 
                  	    
                }
                pushFollow(FollowSets000.FOLLOW_ruleSymbolicTimingExpression_in_synpred69_InternalTadl26604);
                lv_value_6_0=ruleSymbolicTimingExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 2 :
                // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3401:6: ( (lv_value_7_0= ruleValueTimingExpression ) )
                {
                // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3401:6: ( (lv_value_7_0= ruleValueTimingExpression ) )
                // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3402:1: (lv_value_7_0= ruleValueTimingExpression )
                {
                // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3402:1: (lv_value_7_0= ruleValueTimingExpression )
                // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:3403:3: lv_value_7_0= ruleValueTimingExpression
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getVariableTimingExpressionAccess().getValueValueTimingExpressionParserRuleCall_5_1_1_0()); 
                  	    
                }
                pushFollow(FollowSets000.FOLLOW_ruleValueTimingExpression_in_synpred69_InternalTadl26631);
                lv_value_7_0=ruleValueTimingExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred69_InternalTadl2

    // $ANTLR start synpred79_InternalTadl2
    public final void synpred79_InternalTadl2_fragment() throws RecognitionException {   
        EObject lv_left_3_0 = null;


        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4524:2: ( ( (lv_left_3_0= ruleSymbolicTimingExpression ) ) )
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4524:2: ( (lv_left_3_0= ruleSymbolicTimingExpression ) )
        {
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4524:2: ( (lv_left_3_0= ruleSymbolicTimingExpression ) )
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4525:1: (lv_left_3_0= ruleSymbolicTimingExpression )
        {
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4525:1: (lv_left_3_0= ruleSymbolicTimingExpression )
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4526:3: lv_left_3_0= ruleSymbolicTimingExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTimeBaseRelationAccess().getLeftSymbolicTimingExpressionParserRuleCall_3_0_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleSymbolicTimingExpression_in_synpred79_InternalTadl29044);
        lv_left_3_0=ruleSymbolicTimingExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred79_InternalTadl2

    // $ANTLR start synpred80_InternalTadl2
    public final void synpred80_InternalTadl2_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_left_5_0 = null;


        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4543:6: ( (otherlv_4= '(' ( (lv_left_5_0= ruleVariableTimingExpression ) ) otherlv_6= ')' ) )
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4543:6: (otherlv_4= '(' ( (lv_left_5_0= ruleVariableTimingExpression ) ) otherlv_6= ')' )
        {
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4543:6: (otherlv_4= '(' ( (lv_left_5_0= ruleVariableTimingExpression ) ) otherlv_6= ')' )
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4543:8: otherlv_4= '(' ( (lv_left_5_0= ruleVariableTimingExpression ) ) otherlv_6= ')'
        {
        otherlv_4=(Token)match(input,54,FollowSets000.FOLLOW_54_in_synpred80_InternalTadl29063); if (state.failed) return ;
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4547:1: ( (lv_left_5_0= ruleVariableTimingExpression ) )
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4548:1: (lv_left_5_0= ruleVariableTimingExpression )
        {
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4548:1: (lv_left_5_0= ruleVariableTimingExpression )
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4549:3: lv_left_5_0= ruleVariableTimingExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTimeBaseRelationAccess().getLeftVariableTimingExpressionParserRuleCall_3_1_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleVariableTimingExpression_in_synpred80_InternalTadl29084);
        lv_left_5_0=ruleVariableTimingExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_6=(Token)match(input,56,FollowSets000.FOLLOW_56_in_synpred80_InternalTadl29096); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred80_InternalTadl2

    // $ANTLR start synpred81_InternalTadl2
    public final void synpred81_InternalTadl2_fragment() throws RecognitionException {   
        EObject lv_right_9_0 = null;


        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4592:2: ( ( (lv_right_9_0= ruleSymbolicTimingExpression ) ) )
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4592:2: ( (lv_right_9_0= ruleSymbolicTimingExpression ) )
        {
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4592:2: ( (lv_right_9_0= ruleSymbolicTimingExpression ) )
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4593:1: (lv_right_9_0= ruleSymbolicTimingExpression )
        {
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4593:1: (lv_right_9_0= ruleSymbolicTimingExpression )
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4594:3: lv_right_9_0= ruleSymbolicTimingExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTimeBaseRelationAccess().getRightSymbolicTimingExpressionParserRuleCall_5_0_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleSymbolicTimingExpression_in_synpred81_InternalTadl29159);
        lv_right_9_0=ruleSymbolicTimingExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred81_InternalTadl2

    // $ANTLR start synpred82_InternalTadl2
    public final void synpred82_InternalTadl2_fragment() throws RecognitionException {   
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_right_11_0 = null;


        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4611:6: ( (otherlv_10= '(' ( (lv_right_11_0= ruleVariableTimingExpression ) ) otherlv_12= ')' ) )
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4611:6: (otherlv_10= '(' ( (lv_right_11_0= ruleVariableTimingExpression ) ) otherlv_12= ')' )
        {
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4611:6: (otherlv_10= '(' ( (lv_right_11_0= ruleVariableTimingExpression ) ) otherlv_12= ')' )
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4611:8: otherlv_10= '(' ( (lv_right_11_0= ruleVariableTimingExpression ) ) otherlv_12= ')'
        {
        otherlv_10=(Token)match(input,54,FollowSets000.FOLLOW_54_in_synpred82_InternalTadl29178); if (state.failed) return ;
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4615:1: ( (lv_right_11_0= ruleVariableTimingExpression ) )
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4616:1: (lv_right_11_0= ruleVariableTimingExpression )
        {
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4616:1: (lv_right_11_0= ruleVariableTimingExpression )
        // ../fr.inria.aoste.timmo2use.tadl2.xtext/src-gen/fr/inria/aoste/timmo2use/tadl2/parser/antlr/internal/InternalTadl2.g:4617:3: lv_right_11_0= ruleVariableTimingExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTimeBaseRelationAccess().getRightVariableTimingExpressionParserRuleCall_5_1_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleVariableTimingExpression_in_synpred82_InternalTadl29199);
        lv_right_11_0=ruleVariableTimingExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_12=(Token)match(input,56,FollowSets000.FOLLOW_56_in_synpred82_InternalTadl29211); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred82_InternalTadl2

    // Delegated rules

    public final boolean synpred48_InternalTadl2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_InternalTadl2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_InternalTadl2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_InternalTadl2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalTadl2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalTadl2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred66_InternalTadl2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred66_InternalTadl2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred65_InternalTadl2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_InternalTadl2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred82_InternalTadl2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred82_InternalTadl2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred59_InternalTadl2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_InternalTadl2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred81_InternalTadl2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred81_InternalTadl2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred63_InternalTadl2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_InternalTadl2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred79_InternalTadl2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred79_InternalTadl2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_InternalTadl2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_InternalTadl2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred64_InternalTadl2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred64_InternalTadl2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred61_InternalTadl2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_InternalTadl2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalTadl2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalTadl2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred69_InternalTadl2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_InternalTadl2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred80_InternalTadl2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred80_InternalTadl2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA62 dfa62 = new DFA62(this);
    static final String DFA6_eotS =
        "\20\uffff";
    static final String DFA6_eofS =
        "\20\uffff";
    static final String DFA6_minS =
        "\1\5\5\uffff\4\0\6\uffff";
    static final String DFA6_maxS =
        "\1\115\5\uffff\4\0\6\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\4\uffff\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA6_specialS =
        "\6\uffff\1\0\1\1\1\2\1\3\6\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\10\21\uffff\1\1\5\uffff\1\2\3\uffff\1\3\2\uffff\1\4\2\uffff"+
            "\1\5\3\uffff\1\12\1\13\1\uffff\1\14\1\uffff\1\15\2\uffff\1\16"+
            "\1\uffff\1\17\1\6\5\uffff\1\7\20\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "615:1: (this_DelayConstraint_0= ruleDelayConstraint | this_RepetitionConstraint_1= ruleRepetitionConstraint | this_SynchronizationConstraint_2= ruleSynchronizationConstraint | this_OrderConstraint_3= ruleOrderConstraint | this_PatternConstraint_4= rulePatternConstraint | this_SporadicConstraint_5= ruleSporadicConstraint | this_PeriodicConstraint_6= rulePeriodicConstraint | this_ArbitraryConstraint_7= ruleArbitraryConstraint | this_BurstConstraint_8= ruleBurstConstraint | this_ReactionConstraint_9= ruleReactionConstraint | this_AgeConstraint_10= ruleAgeConstraint )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_6 = input.LA(1);

                         
                        int index6_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalTadl2()) ) {s = 5;}

                        else if ( (synpred21_InternalTadl2()) ) {s = 12;}

                         
                        input.seek(index6_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_7 = input.LA(1);

                         
                        int index6_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalTadl2()) ) {s = 5;}

                        else if ( (synpred21_InternalTadl2()) ) {s = 12;}

                         
                        input.seek(index6_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA6_8 = input.LA(1);

                         
                        int index6_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalTadl2()) ) {s = 5;}

                        else if ( (synpred21_InternalTadl2()) ) {s = 12;}

                         
                        input.seek(index6_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA6_9 = input.LA(1);

                         
                        int index6_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalTadl2()) ) {s = 5;}

                        else if ( (synpred21_InternalTadl2()) ) {s = 12;}

                         
                        input.seek(index6_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA7_eotS =
        "\14\uffff";
    static final String DFA7_eofS =
        "\14\uffff";
    static final String DFA7_minS =
        "\1\4\1\uffff\1\4\1\uffff\1\5\1\115\1\5\1\4\3\5\1\4";
    static final String DFA7_maxS =
        "\1\115\1\uffff\1\115\1\uffff\2\115\1\5\1\117\2\74\1\5\1\102";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\10\uffff";
    static final String DFA7_specialS =
        "\14\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1\1\3\1\1\57\uffff\1\2\5\uffff\1\3\20\uffff\1\3",
            "",
            "\1\1\1\5\1\1\57\uffff\1\1\2\uffff\1\1\2\uffff\1\4\20\uffff"+
            "\1\6",
            "",
            "\1\5\107\uffff\1\6",
            "\1\6",
            "\1\7",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1\13\uffff\1\10\1"+
            "\11",
            "\1\13\66\uffff\1\12",
            "\1\13\66\uffff\1\12",
            "\1\13",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1"
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "856:1: ( ( (lv_lower_9_0= ruleSymbolicTimingExpression ) ) | ( (lv_lower_10_0= ruleValueTimingExpression ) ) )";
        }
    }
    static final String DFA8_eotS =
        "\14\uffff";
    static final String DFA8_eofS =
        "\14\uffff";
    static final String DFA8_minS =
        "\1\4\1\uffff\1\4\1\uffff\1\5\1\115\1\5\1\4\3\5\1\4";
    static final String DFA8_maxS =
        "\1\115\1\uffff\1\115\1\uffff\2\115\1\5\1\117\2\74\1\5\1\102";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\10\uffff";
    static final String DFA8_specialS =
        "\14\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1\1\3\1\1\57\uffff\1\2\5\uffff\1\3\20\uffff\1\3",
            "",
            "\1\1\1\5\1\1\57\uffff\1\1\2\uffff\1\1\2\uffff\1\4\20\uffff"+
            "\1\6",
            "",
            "\1\5\107\uffff\1\6",
            "\1\6",
            "\1\7",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1\13\uffff\1\10\1"+
            "\11",
            "\1\13\66\uffff\1\12",
            "\1\13\66\uffff\1\12",
            "\1\13",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1"
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "901:1: ( ( (lv_upper_13_0= ruleSymbolicTimingExpression ) ) | ( (lv_upper_14_0= ruleValueTimingExpression ) ) )";
        }
    }
    static final String DFA9_eotS =
        "\14\uffff";
    static final String DFA9_eofS =
        "\14\uffff";
    static final String DFA9_minS =
        "\1\4\1\uffff\1\4\1\uffff\1\5\1\115\1\5\1\4\3\5\1\4";
    static final String DFA9_maxS =
        "\1\115\1\uffff\1\115\1\uffff\2\115\1\5\1\117\2\74\1\5\1\102";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\10\uffff";
    static final String DFA9_specialS =
        "\14\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1\1\3\1\1\57\uffff\1\2\5\uffff\1\3\20\uffff\1\3",
            "",
            "\1\1\1\5\1\1\57\uffff\1\1\2\uffff\1\1\2\uffff\1\4\20\uffff"+
            "\1\6",
            "",
            "\1\5\107\uffff\1\6",
            "\1\6",
            "\1\7",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1\13\uffff\1\10\1"+
            "\11",
            "\1\13\66\uffff\1\12",
            "\1\13\66\uffff\1\12",
            "\1\13",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1"
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1045:1: ( ( (lv_lower_10_0= ruleSymbolicTimingExpression ) ) | ( (lv_lower_11_0= ruleValueTimingExpression ) ) )";
        }
    }
    static final String DFA10_eotS =
        "\14\uffff";
    static final String DFA10_eofS =
        "\14\uffff";
    static final String DFA10_minS =
        "\1\4\1\uffff\1\4\1\uffff\1\5\1\115\1\5\1\4\3\5\1\4";
    static final String DFA10_maxS =
        "\1\115\1\uffff\1\115\1\uffff\2\115\1\5\1\117\2\74\1\5\1\102";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\10\uffff";
    static final String DFA10_specialS =
        "\14\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1\1\3\1\1\57\uffff\1\2\5\uffff\1\3\20\uffff\1\3",
            "",
            "\1\1\1\5\1\1\57\uffff\1\1\2\uffff\1\1\2\uffff\1\4\20\uffff"+
            "\1\6",
            "",
            "\1\5\107\uffff\1\6",
            "\1\6",
            "\1\7",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1\13\uffff\1\10\1"+
            "\11",
            "\1\13\66\uffff\1\12",
            "\1\13\66\uffff\1\12",
            "\1\13",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1"
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1090:1: ( ( (lv_upper_14_0= ruleSymbolicTimingExpression ) ) | ( (lv_upper_15_0= ruleValueTimingExpression ) ) )";
        }
    }
    static final String DFA11_eotS =
        "\14\uffff";
    static final String DFA11_eofS =
        "\14\uffff";
    static final String DFA11_minS =
        "\1\4\1\uffff\1\4\1\uffff\1\5\1\115\1\5\1\4\3\5\1\4";
    static final String DFA11_maxS =
        "\1\115\1\uffff\1\115\1\uffff\2\115\1\5\1\117\2\74\1\5\1\102";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\10\uffff";
    static final String DFA11_specialS =
        "\14\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1\1\3\1\1\57\uffff\1\2\5\uffff\1\3\20\uffff\1\3",
            "",
            "\1\1\1\5\1\1\57\uffff\1\1\2\uffff\1\1\2\uffff\1\4\20\uffff"+
            "\1\6",
            "",
            "\1\5\107\uffff\1\6",
            "\1\6",
            "\1\7",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1\13\uffff\1\10\1"+
            "\11",
            "\1\13\66\uffff\1\12",
            "\1\13\66\uffff\1\12",
            "\1\13",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1"
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1135:1: ( ( (lv_jitter_18_0= ruleSymbolicTimingExpression ) ) | ( (lv_jitter_19_0= ruleValueTimingExpression ) ) )";
        }
    }
    static final String DFA13_eotS =
        "\14\uffff";
    static final String DFA13_eofS =
        "\14\uffff";
    static final String DFA13_minS =
        "\1\4\1\uffff\1\4\1\uffff\1\5\1\115\1\5\1\4\3\5\1\4";
    static final String DFA13_maxS =
        "\1\115\1\uffff\1\115\1\uffff\2\115\1\5\1\117\2\74\1\5\1\102";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\10\uffff";
    static final String DFA13_specialS =
        "\14\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\1\1\3\1\1\57\uffff\1\2\5\uffff\1\3\20\uffff\1\3",
            "",
            "\1\1\1\5\1\1\57\uffff\1\1\2\uffff\1\1\2\uffff\1\4\20\uffff"+
            "\1\6",
            "",
            "\1\5\107\uffff\1\6",
            "\1\6",
            "\1\7",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1\13\uffff\1\10\1"+
            "\11",
            "\1\13\66\uffff\1\12",
            "\1\13\66\uffff\1\12",
            "\1\13",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1"
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1297:1: ( ( (lv_tolerance_11_0= ruleSymbolicTimingExpression ) ) | ( (lv_tolerance_12_0= ruleValueTimingExpression ) ) )";
        }
    }
    static final String DFA14_eotS =
        "\14\uffff";
    static final String DFA14_eofS =
        "\14\uffff";
    static final String DFA14_minS =
        "\1\4\1\uffff\1\4\1\uffff\1\5\1\115\1\5\1\4\3\5\1\4";
    static final String DFA14_maxS =
        "\1\115\1\uffff\1\115\1\uffff\2\115\1\5\1\117\2\74\1\5\1\102";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\10\uffff";
    static final String DFA14_specialS =
        "\14\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\1\1\3\1\1\57\uffff\1\2\5\uffff\1\3\20\uffff\1\3",
            "",
            "\1\1\1\5\1\1\57\uffff\1\1\2\uffff\1\1\2\uffff\1\4\20\uffff"+
            "\1\6",
            "",
            "\1\5\107\uffff\1\6",
            "\1\6",
            "\1\7",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1\13\uffff\1\10\1"+
            "\11",
            "\1\13\66\uffff\1\12",
            "\1\13\66\uffff\1\12",
            "\1\13",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1"
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1389:1: ( ( (lv_left_4_0= ruleSymbolicTimingExpression ) ) | ( (lv_left_5_0= ruleValueTimingExpression ) ) )";
        }
    }
    static final String DFA15_eotS =
        "\14\uffff";
    static final String DFA15_eofS =
        "\14\uffff";
    static final String DFA15_minS =
        "\1\4\1\uffff\1\4\1\uffff\1\5\1\115\1\5\1\4\3\5\1\4";
    static final String DFA15_maxS =
        "\1\115\1\uffff\1\115\1\uffff\2\115\1\5\1\117\2\74\1\5\1\102";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\10\uffff";
    static final String DFA15_specialS =
        "\14\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\1\1\3\1\1\57\uffff\1\2\5\uffff\1\3\20\uffff\1\3",
            "",
            "\1\1\1\5\1\1\57\uffff\1\1\2\uffff\1\1\2\uffff\1\4\20\uffff"+
            "\1\6",
            "",
            "\1\5\107\uffff\1\6",
            "\1\6",
            "\1\7",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1\13\uffff\1\10\1"+
            "\11",
            "\1\13\66\uffff\1\12",
            "\1\13\66\uffff\1\12",
            "\1\13",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1"
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1430:1: ( ( (lv_right_7_0= ruleSymbolicTimingExpression ) ) | ( (lv_right_8_0= ruleValueTimingExpression ) ) )";
        }
    }
    static final String DFA16_eotS =
        "\14\uffff";
    static final String DFA16_eofS =
        "\14\uffff";
    static final String DFA16_minS =
        "\1\4\1\uffff\1\4\1\uffff\1\5\1\115\1\5\1\4\3\5\1\4";
    static final String DFA16_maxS =
        "\1\115\1\uffff\1\115\1\uffff\2\115\1\5\1\117\2\74\1\5\1\102";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\10\uffff";
    static final String DFA16_specialS =
        "\14\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\1\1\3\1\1\57\uffff\1\2\5\uffff\1\3\20\uffff\1\3",
            "",
            "\1\1\1\5\1\1\57\uffff\1\1\2\uffff\1\1\2\uffff\1\4\20\uffff"+
            "\1\6",
            "",
            "\1\5\107\uffff\1\6",
            "\1\6",
            "\1\7",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1\13\uffff\1\10\1"+
            "\11",
            "\1\13\66\uffff\1\12",
            "\1\13\66\uffff\1\12",
            "\1\13",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1"
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1570:1: ( ( (lv_minimum_9_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_10_0= ruleValueTimingExpression ) ) )";
        }
    }
    static final String DFA17_eotS =
        "\14\uffff";
    static final String DFA17_eofS =
        "\14\uffff";
    static final String DFA17_minS =
        "\1\4\1\uffff\1\4\1\uffff\1\5\1\115\1\5\1\4\3\5\1\4";
    static final String DFA17_maxS =
        "\1\115\1\uffff\1\115\1\uffff\2\115\1\5\1\117\2\74\1\5\1\102";
    static final String DFA17_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\10\uffff";
    static final String DFA17_specialS =
        "\14\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\1\3\1\1\57\uffff\1\2\5\uffff\1\3\20\uffff\1\3",
            "",
            "\1\1\1\5\1\1\57\uffff\1\1\2\uffff\1\1\2\uffff\1\4\20\uffff"+
            "\1\6",
            "",
            "\1\5\107\uffff\1\6",
            "\1\6",
            "\1\7",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1\13\uffff\1\10\1"+
            "\11",
            "\1\13\66\uffff\1\12",
            "\1\13\66\uffff\1\12",
            "\1\13",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1"
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1615:1: ( ( (lv_jitter_13_0= ruleSymbolicTimingExpression ) ) | ( (lv_jitter_14_0= ruleValueTimingExpression ) ) )";
        }
    }
    static final String DFA20_eotS =
        "\14\uffff";
    static final String DFA20_eofS =
        "\14\uffff";
    static final String DFA20_minS =
        "\1\4\1\uffff\1\4\1\uffff\1\5\1\115\1\5\1\4\3\5\1\4";
    static final String DFA20_maxS =
        "\1\115\1\uffff\1\115\1\uffff\2\115\1\5\1\117\2\74\1\5\1\102";
    static final String DFA20_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\10\uffff";
    static final String DFA20_specialS =
        "\14\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\1\1\3\1\1\57\uffff\1\2\5\uffff\1\3\20\uffff\1\3",
            "",
            "\1\1\1\5\1\1\57\uffff\1\1\2\uffff\1\1\2\uffff\1\4\20\uffff"+
            "\1\6",
            "",
            "\1\5\107\uffff\1\6",
            "\1\6",
            "\1\7",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1\13\uffff\1\10\1"+
            "\11",
            "\1\13\66\uffff\1\12",
            "\1\13\66\uffff\1\12",
            "\1\13",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1"
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1819:1: ( ( (lv_lower_7_0= ruleSymbolicTimingExpression ) ) | ( (lv_lower_8_0= ruleValueTimingExpression ) ) )";
        }
    }
    static final String DFA21_eotS =
        "\14\uffff";
    static final String DFA21_eofS =
        "\14\uffff";
    static final String DFA21_minS =
        "\1\4\1\uffff\1\4\1\uffff\1\5\1\115\1\5\1\4\3\5\1\4";
    static final String DFA21_maxS =
        "\1\115\1\uffff\1\115\1\uffff\2\115\1\5\1\117\2\74\1\5\1\102";
    static final String DFA21_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\10\uffff";
    static final String DFA21_specialS =
        "\14\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\1\1\3\1\1\57\uffff\1\2\5\uffff\1\3\20\uffff\1\3",
            "",
            "\1\1\1\5\1\1\57\uffff\1\1\2\uffff\1\1\2\uffff\1\4\20\uffff"+
            "\1\6",
            "",
            "\1\5\107\uffff\1\6",
            "\1\6",
            "\1\7",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1\13\uffff\1\10\1"+
            "\11",
            "\1\13\66\uffff\1\12",
            "\1\13\66\uffff\1\12",
            "\1\13",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1"
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1864:1: ( ( (lv_upper_11_0= ruleSymbolicTimingExpression ) ) | ( (lv_upper_12_0= ruleValueTimingExpression ) ) )";
        }
    }
    static final String DFA22_eotS =
        "\14\uffff";
    static final String DFA22_eofS =
        "\14\uffff";
    static final String DFA22_minS =
        "\1\4\1\uffff\1\4\1\uffff\1\5\1\115\1\5\1\4\3\5\1\4";
    static final String DFA22_maxS =
        "\1\115\1\uffff\1\115\1\uffff\2\115\1\5\1\117\2\74\1\5\1\102";
    static final String DFA22_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\10\uffff";
    static final String DFA22_specialS =
        "\14\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\1\1\3\1\1\57\uffff\1\2\5\uffff\1\3\20\uffff\1\3",
            "",
            "\1\1\1\5\1\1\57\uffff\1\1\2\uffff\1\1\2\uffff\1\4\20\uffff"+
            "\1\6",
            "",
            "\1\5\107\uffff\1\6",
            "\1\6",
            "\1\7",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1\13\uffff\1\10\1"+
            "\11",
            "\1\13\66\uffff\1\12",
            "\1\13\66\uffff\1\12",
            "\1\13",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1"
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1909:1: ( ( (lv_jitter_15_0= ruleSymbolicTimingExpression ) ) | ( (lv_jitter_16_0= ruleValueTimingExpression ) ) )";
        }
    }
    static final String DFA23_eotS =
        "\14\uffff";
    static final String DFA23_eofS =
        "\14\uffff";
    static final String DFA23_minS =
        "\1\4\1\uffff\1\4\1\uffff\1\5\1\115\1\5\1\4\3\5\1\4";
    static final String DFA23_maxS =
        "\1\115\1\uffff\1\115\1\uffff\2\115\1\5\1\117\2\74\1\5\1\102";
    static final String DFA23_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\10\uffff";
    static final String DFA23_specialS =
        "\14\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\1\1\3\1\1\57\uffff\1\2\5\uffff\1\3\20\uffff\1\3",
            "",
            "\1\1\1\5\1\1\57\uffff\1\1\2\uffff\1\1\2\uffff\1\4\20\uffff"+
            "\1\6",
            "",
            "\1\5\107\uffff\1\6",
            "\1\6",
            "\1\7",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1\13\uffff\1\10\1"+
            "\11",
            "\1\13\66\uffff\1\12",
            "\1\13\66\uffff\1\12",
            "\1\13",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1"
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1954:1: ( ( (lv_minimum_19_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_20_0= ruleValueTimingExpression ) ) )";
        }
    }
    static final String DFA24_eotS =
        "\14\uffff";
    static final String DFA24_eofS =
        "\14\uffff";
    static final String DFA24_minS =
        "\1\4\1\uffff\1\4\1\uffff\1\5\1\115\1\5\1\4\3\5\1\4";
    static final String DFA24_maxS =
        "\1\115\1\uffff\1\115\1\uffff\2\115\1\5\1\117\2\74\1\5\1\102";
    static final String DFA24_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\10\uffff";
    static final String DFA24_specialS =
        "\14\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\1\1\3\1\1\57\uffff\1\2\5\uffff\1\3\20\uffff\1\3",
            "",
            "\1\1\1\5\1\1\57\uffff\1\1\2\uffff\1\1\2\uffff\1\4\20\uffff"+
            "\1\6",
            "",
            "\1\5\107\uffff\1\6",
            "\1\6",
            "\1\7",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1\13\uffff\1\10\1"+
            "\11",
            "\1\13\66\uffff\1\12",
            "\1\13\66\uffff\1\12",
            "\1\13",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1"
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "2072:1: ( ( (lv_period_7_0= ruleSymbolicTimingExpression ) ) | ( (lv_period_8_0= ruleValueTimingExpression ) ) )";
        }
    }
    static final String DFA25_eotS =
        "\14\uffff";
    static final String DFA25_eofS =
        "\14\uffff";
    static final String DFA25_minS =
        "\1\4\1\uffff\1\4\1\uffff\1\5\1\115\1\5\1\4\3\5\1\4";
    static final String DFA25_maxS =
        "\1\115\1\uffff\1\115\1\uffff\2\115\1\5\1\117\2\74\1\5\1\102";
    static final String DFA25_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\10\uffff";
    static final String DFA25_specialS =
        "\14\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\1\1\3\1\1\57\uffff\1\2\5\uffff\1\3\20\uffff\1\3",
            "",
            "\1\1\1\5\1\1\57\uffff\1\1\2\uffff\1\1\2\uffff\1\4\20\uffff"+
            "\1\6",
            "",
            "\1\5\107\uffff\1\6",
            "\1\6",
            "\1\7",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1\13\uffff\1\10\1"+
            "\11",
            "\1\13\66\uffff\1\12",
            "\1\13\66\uffff\1\12",
            "\1\13",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1"
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "2117:1: ( ( (lv_minimum_11_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_12_0= ruleValueTimingExpression ) ) )";
        }
    }
    static final String DFA26_eotS =
        "\14\uffff";
    static final String DFA26_eofS =
        "\14\uffff";
    static final String DFA26_minS =
        "\1\4\1\uffff\1\4\1\uffff\1\5\1\115\1\5\1\4\3\5\1\4";
    static final String DFA26_maxS =
        "\1\115\1\uffff\1\115\1\uffff\2\115\1\5\1\117\2\74\1\5\1\102";
    static final String DFA26_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\10\uffff";
    static final String DFA26_specialS =
        "\14\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\1\1\3\1\1\57\uffff\1\2\5\uffff\1\3\20\uffff\1\3",
            "",
            "\1\1\1\5\1\1\57\uffff\1\1\2\uffff\1\1\2\uffff\1\4\20\uffff"+
            "\1\6",
            "",
            "\1\5\107\uffff\1\6",
            "\1\6",
            "\1\7",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1\13\uffff\1\10\1"+
            "\11",
            "\1\13\66\uffff\1\12",
            "\1\13\66\uffff\1\12",
            "\1\13",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1"
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "2162:1: ( ( (lv_jitter_15_0= ruleSymbolicTimingExpression ) ) | ( (lv_jitter_16_0= ruleValueTimingExpression ) ) )";
        }
    }
    static final String DFA30_eotS =
        "\14\uffff";
    static final String DFA30_eofS =
        "\14\uffff";
    static final String DFA30_minS =
        "\1\4\1\uffff\1\4\1\uffff\1\5\1\115\1\5\1\4\3\5\1\4";
    static final String DFA30_maxS =
        "\1\115\1\uffff\1\115\1\uffff\2\115\1\5\1\117\2\74\1\5\1\102";
    static final String DFA30_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\10\uffff";
    static final String DFA30_specialS =
        "\14\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\1\1\3\1\1\57\uffff\1\2\5\uffff\1\3\20\uffff\1\3",
            "",
            "\1\1\1\5\1\1\57\uffff\1\1\2\uffff\1\1\2\uffff\1\4\20\uffff"+
            "\1\6",
            "",
            "\1\5\107\uffff\1\6",
            "\1\6",
            "\1\7",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1\13\uffff\1\10\1"+
            "\11",
            "\1\13\66\uffff\1\12",
            "\1\13\66\uffff\1\12",
            "\1\13",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1"
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "2551:1: ( ( (lv_length_10_0= ruleSymbolicTimingExpression ) ) | ( (lv_length_11_0= ruleValueTimingExpression ) ) )";
        }
    }
    static final String DFA31_eotS =
        "\14\uffff";
    static final String DFA31_eofS =
        "\14\uffff";
    static final String DFA31_minS =
        "\1\4\1\uffff\1\4\1\uffff\1\5\1\115\1\5\1\4\3\5\1\4";
    static final String DFA31_maxS =
        "\1\115\1\uffff\1\115\1\uffff\2\115\1\5\1\117\2\74\1\5\1\102";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\10\uffff";
    static final String DFA31_specialS =
        "\14\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\1\1\3\1\1\57\uffff\1\2\5\uffff\1\3\20\uffff\1\3",
            "",
            "\1\1\1\5\1\1\57\uffff\1\1\2\uffff\1\1\2\uffff\1\4\20\uffff"+
            "\1\6",
            "",
            "\1\5\107\uffff\1\6",
            "\1\6",
            "\1\7",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1\13\uffff\1\10\1"+
            "\11",
            "\1\13\66\uffff\1\12",
            "\1\13\66\uffff\1\12",
            "\1\13",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1"
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "2596:1: ( ( (lv_minimum_14_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_15_0= ruleValueTimingExpression ) ) )";
        }
    }
    static final String DFA32_eotS =
        "\14\uffff";
    static final String DFA32_eofS =
        "\14\uffff";
    static final String DFA32_minS =
        "\1\4\1\uffff\1\4\1\uffff\1\5\1\115\1\5\1\4\3\5\1\4";
    static final String DFA32_maxS =
        "\1\115\1\uffff\1\115\1\uffff\2\115\1\5\1\117\2\74\1\5\1\102";
    static final String DFA32_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\10\uffff";
    static final String DFA32_specialS =
        "\14\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\1\1\3\1\1\57\uffff\1\2\5\uffff\1\3\20\uffff\1\3",
            "",
            "\1\1\1\5\1\1\57\uffff\1\1\2\uffff\1\1\2\uffff\1\4\20\uffff"+
            "\1\6",
            "",
            "\1\5\107\uffff\1\6",
            "\1\6",
            "\1\7",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1\13\uffff\1\10\1"+
            "\11",
            "\1\13\66\uffff\1\12",
            "\1\13\66\uffff\1\12",
            "\1\13",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1"
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "2714:1: ( ( (lv_maximum_7_0= ruleSymbolicTimingExpression ) ) | ( (lv_maximum_8_0= ruleValueTimingExpression ) ) )";
        }
    }
    static final String DFA33_eotS =
        "\14\uffff";
    static final String DFA33_eofS =
        "\14\uffff";
    static final String DFA33_minS =
        "\1\4\1\uffff\1\4\1\uffff\1\5\1\115\1\5\1\4\3\5\1\4";
    static final String DFA33_maxS =
        "\1\115\1\uffff\1\115\1\uffff\2\115\1\5\1\117\2\74\1\5\1\102";
    static final String DFA33_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\10\uffff";
    static final String DFA33_specialS =
        "\14\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\1\1\3\1\1\57\uffff\1\2\5\uffff\1\3\20\uffff\1\3",
            "",
            "\1\1\1\5\1\1\57\uffff\1\1\2\uffff\1\1\2\uffff\1\4\20\uffff"+
            "\1\6",
            "",
            "\1\5\107\uffff\1\6",
            "\1\6",
            "\1\7",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1\13\uffff\1\10\1"+
            "\11",
            "\1\13\66\uffff\1\12",
            "\1\13\66\uffff\1\12",
            "\1\13",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1"
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "2759:1: ( ( (lv_minimum_11_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_12_0= ruleValueTimingExpression ) ) )";
        }
    }
    static final String DFA34_eotS =
        "\14\uffff";
    static final String DFA34_eofS =
        "\14\uffff";
    static final String DFA34_minS =
        "\1\4\1\uffff\1\4\1\uffff\1\5\1\115\1\5\1\4\3\5\1\4";
    static final String DFA34_maxS =
        "\1\115\1\uffff\1\115\1\uffff\2\115\1\5\1\117\2\74\1\5\1\102";
    static final String DFA34_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\10\uffff";
    static final String DFA34_specialS =
        "\14\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\1\1\3\1\1\57\uffff\1\2\5\uffff\1\3\20\uffff\1\3",
            "",
            "\1\1\1\5\1\1\57\uffff\1\1\2\uffff\1\1\2\uffff\1\4\20\uffff"+
            "\1\6",
            "",
            "\1\5\107\uffff\1\6",
            "\1\6",
            "\1\7",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1\13\uffff\1\10\1"+
            "\11",
            "\1\13\66\uffff\1\12",
            "\1\13\66\uffff\1\12",
            "\1\13",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1"
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "2877:1: ( ( (lv_maximum_7_0= ruleSymbolicTimingExpression ) ) | ( (lv_maximum_8_0= ruleValueTimingExpression ) ) )";
        }
    }
    static final String DFA35_eotS =
        "\14\uffff";
    static final String DFA35_eofS =
        "\14\uffff";
    static final String DFA35_minS =
        "\1\4\1\uffff\1\4\1\uffff\1\5\1\115\1\5\1\4\3\5\1\4";
    static final String DFA35_maxS =
        "\1\115\1\uffff\1\115\1\uffff\2\115\1\5\1\117\2\74\1\5\1\102";
    static final String DFA35_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\10\uffff";
    static final String DFA35_specialS =
        "\14\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\1\1\3\1\1\57\uffff\1\2\5\uffff\1\3\20\uffff\1\3",
            "",
            "\1\1\1\5\1\1\57\uffff\1\1\2\uffff\1\1\2\uffff\1\4\20\uffff"+
            "\1\6",
            "",
            "\1\5\107\uffff\1\6",
            "\1\6",
            "\1\7",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1\13\uffff\1\10\1"+
            "\11",
            "\1\13\66\uffff\1\12",
            "\1\13\66\uffff\1\12",
            "\1\13",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1"
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "2922:1: ( ( (lv_minimum_11_0= ruleSymbolicTimingExpression ) ) | ( (lv_minimum_12_0= ruleValueTimingExpression ) ) )";
        }
    }
    static final String DFA36_eotS =
        "\15\uffff";
    static final String DFA36_eofS =
        "\15\uffff";
    static final String DFA36_minS =
        "\1\4\1\uffff\1\4\2\uffff\1\5\1\115\1\5\1\4\3\5\1\4";
    static final String DFA36_maxS =
        "\1\115\1\uffff\1\115\2\uffff\2\115\1\5\1\117\2\74\1\5\1\102";
    static final String DFA36_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\10\uffff";
    static final String DFA36_specialS =
        "\15\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\1\1\4\1\1\57\uffff\1\2\2\uffff\1\3\2\uffff\1\4\20\uffff\1"+
            "\4",
            "",
            "\1\1\1\6\1\1\57\uffff\1\1\2\uffff\1\1\2\uffff\1\5\20\uffff"+
            "\1\7",
            "",
            "",
            "\1\6\107\uffff\1\7",
            "\1\7",
            "\1\10",
            "\1\4\1\uffff\1\4\60\uffff\1\1\3\uffff\10\1\13\uffff\1\11\1"+
            "\12",
            "\1\14\66\uffff\1\13",
            "\1\14\66\uffff\1\13",
            "\1\14",
            "\1\4\1\uffff\1\4\60\uffff\1\1\3\uffff\10\1"
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "2984:1: (this_SymbolicTimingExpression_0= ruleSymbolicTimingExpression | this_VariableTimingExpression_1= ruleVariableTimingExpression | this_ValueTimingExpression_2= ruleValueTimingExpression )";
        }
    }
    static final String DFA37_eotS =
        "\13\uffff";
    static final String DFA37_eofS =
        "\13\uffff";
    static final String DFA37_minS =
        "\1\66\1\0\11\uffff";
    static final String DFA37_maxS =
        "\1\66\1\0\11\uffff";
    static final String DFA37_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA37_specialS =
        "\1\uffff\1\0\11\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\1",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "3112:1: (this_Addition_0= ruleAddition | this_Subtraction_1= ruleSubtraction | this_Multiplication_2= ruleMultiplication | this_Division_3= ruleDivision | this_Assignment_4= ruleAssignment | this_GreaterThan_5= ruleGreaterThan | this_LessThan_6= ruleLessThan | this_GreaterThanOrEqual_7= ruleGreaterThanOrEqual | this_LessThanOrEqual_8= ruleLessThanOrEqual )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA37_1 = input.LA(1);

                         
                        int index37_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalTadl2()) ) {s = 2;}

                        else if ( (synpred60_InternalTadl2()) ) {s = 3;}

                        else if ( (synpred61_InternalTadl2()) ) {s = 4;}

                        else if ( (synpred62_InternalTadl2()) ) {s = 5;}

                        else if ( (synpred63_InternalTadl2()) ) {s = 6;}

                        else if ( (synpred64_InternalTadl2()) ) {s = 7;}

                        else if ( (synpred65_InternalTadl2()) ) {s = 8;}

                        else if ( (synpred66_InternalTadl2()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index37_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 37, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA40_eotS =
        "\44\uffff";
    static final String DFA40_eofS =
        "\1\2\43\uffff";
    static final String DFA40_minS =
        "\1\5\1\0\42\uffff";
    static final String DFA40_maxS =
        "\1\115\1\0\42\uffff";
    static final String DFA40_acceptS =
        "\2\uffff\1\2\40\uffff\1\1";
    static final String DFA40_specialS =
        "\1\uffff\1\0\42\uffff}>";
    static final String[] DFA40_transitionS = {
            "\1\2\6\uffff\3\2\2\uffff\1\2\1\uffff\1\2\3\uffff\1\2\5\uffff"+
            "\1\2\3\uffff\1\2\2\uffff\1\2\2\uffff\1\2\3\uffff\2\2\1\uffff"+
            "\1\2\1\uffff\1\2\2\uffff\1\2\1\uffff\5\2\1\uffff\1\1\10\2\5"+
            "\uffff\1\2\2\uffff\2\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "3378:2: (otherlv_5= ':=' ( ( (lv_value_6_0= ruleSymbolicTimingExpression ) ) | ( (lv_value_7_0= ruleValueTimingExpression ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA40_1 = input.LA(1);

                         
                        int index40_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_InternalTadl2()) ) {s = 35;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index40_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 40, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA39_eotS =
        "\14\uffff";
    static final String DFA39_eofS =
        "\14\uffff";
    static final String DFA39_minS =
        "\1\4\1\uffff\1\4\1\uffff\1\5\1\115\1\5\1\4\3\5\1\4";
    static final String DFA39_maxS =
        "\1\115\1\uffff\1\115\1\uffff\2\115\1\5\1\117\2\74\1\5\1\102";
    static final String DFA39_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\10\uffff";
    static final String DFA39_specialS =
        "\14\uffff}>";
    static final String[] DFA39_transitionS = {
            "\1\1\1\3\1\1\57\uffff\1\2\5\uffff\1\3\20\uffff\1\3",
            "",
            "\1\1\1\5\1\1\57\uffff\1\1\2\uffff\1\1\2\uffff\1\4\20\uffff"+
            "\1\6",
            "",
            "\1\5\107\uffff\1\6",
            "\1\6",
            "\1\7",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1\13\uffff\1\10\1"+
            "\11",
            "\1\13\66\uffff\1\12",
            "\1\13\66\uffff\1\12",
            "\1\13",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1"
    };

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "3382:1: ( ( (lv_value_6_0= ruleSymbolicTimingExpression ) ) | ( (lv_value_7_0= ruleValueTimingExpression ) ) )";
        }
    }
    static final String DFA62_eotS =
        "\14\uffff";
    static final String DFA62_eofS =
        "\14\uffff";
    static final String DFA62_minS =
        "\1\4\1\uffff\1\4\1\uffff\1\5\1\115\1\5\1\4\3\5\1\4";
    static final String DFA62_maxS =
        "\1\115\1\uffff\1\115\1\uffff\2\115\1\5\1\117\2\74\1\5\1\102";
    static final String DFA62_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\10\uffff";
    static final String DFA62_specialS =
        "\14\uffff}>";
    static final String[] DFA62_transitionS = {
            "\1\1\1\3\1\1\57\uffff\1\2\5\uffff\1\3\20\uffff\1\3",
            "",
            "\1\1\1\5\1\1\57\uffff\1\1\2\uffff\1\1\2\uffff\1\4\20\uffff"+
            "\1\6",
            "",
            "\1\5\107\uffff\1\6",
            "\1\6",
            "\1\7",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1\13\uffff\1\10\1"+
            "\11",
            "\1\13\66\uffff\1\12",
            "\1\13\66\uffff\1\12",
            "\1\13",
            "\1\3\1\uffff\1\3\60\uffff\1\1\3\uffff\10\1"
    };

    static final short[] DFA62_eot = DFA.unpackEncodedString(DFA62_eotS);
    static final short[] DFA62_eof = DFA.unpackEncodedString(DFA62_eofS);
    static final char[] DFA62_min = DFA.unpackEncodedStringToUnsignedChars(DFA62_minS);
    static final char[] DFA62_max = DFA.unpackEncodedStringToUnsignedChars(DFA62_maxS);
    static final short[] DFA62_accept = DFA.unpackEncodedString(DFA62_acceptS);
    static final short[] DFA62_special = DFA.unpackEncodedString(DFA62_specialS);
    static final short[][] DFA62_transition;

    static {
        int numStates = DFA62_transitionS.length;
        DFA62_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA62_transition[i] = DFA.unpackEncodedString(DFA62_transitionS[i]);
        }
    }

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = DFA62_eot;
            this.eof = DFA62_eof;
            this.min = DFA62_min;
            this.max = DFA62_max;
            this.accept = DFA62_accept;
            this.special = DFA62_special;
            this.transition = DFA62_transition;
        }
        public String getDescription() {
            return "3382:1: ( ( (lv_value_6_0= ruleSymbolicTimingExpression ) ) | ( (lv_value_7_0= ruleValueTimingExpression ) ) )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleTimingExpressionSpecification_in_entryRuleTimingExpressionSpecification81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTimingExpressionSpecification91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleTimingExpressionSpecification128 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTimingExpressionSpecification149 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTimingExpressionSpecification161 = new BitSet(new long[]{0x12695892208A5020L,0x0000000000003208L});
        public static final BitSet FOLLOW_12_in_ruleTimingExpressionSpecification175 = new BitSet(new long[]{0x0040000000000050L});
        public static final BitSet FOLLOW_ruleSymbolicTimingExpression_in_ruleTimingExpressionSpecification196 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTimingExpressionSpecification208 = new BitSet(new long[]{0x12695892208A7020L,0x0000000000003208L});
        public static final BitSet FOLLOW_ruleImportStatement_in_ruleTimingExpressionSpecification236 = new BitSet(new long[]{0x12695892208A7020L,0x0000000000003208L});
        public static final BitSet FOLLOW_ruleEvent_in_ruleTimingExpressionSpecification263 = new BitSet(new long[]{0x12695892208A7020L,0x0000000000003208L});
        public static final BitSet FOLLOW_ruleEventChain_in_ruleTimingExpressionSpecification290 = new BitSet(new long[]{0x12695892208A7020L,0x0000000000003208L});
        public static final BitSet FOLLOW_ruleTimingConstraint_in_ruleTimingExpressionSpecification317 = new BitSet(new long[]{0x12695892208A7020L,0x0000000000003208L});
        public static final BitSet FOLLOW_ruleVariableTimingExpression_in_ruleTimingExpressionSpecification344 = new BitSet(new long[]{0x12695892208A7020L,0x0000000000003208L});
        public static final BitSet FOLLOW_ruleTimeBase_in_ruleTimingExpressionSpecification371 = new BitSet(new long[]{0x12695892208A7020L,0x0000000000003208L});
        public static final BitSet FOLLOW_ruleDimension_in_ruleTimingExpressionSpecification398 = new BitSet(new long[]{0x12695892208A7020L,0x0000000000003208L});
        public static final BitSet FOLLOW_ruleTimeBaseRelation_in_ruleTimingExpressionSpecification425 = new BitSet(new long[]{0x12695892208A7020L,0x0000000000003208L});
        public static final BitSet FOLLOW_13_in_ruleTimingExpressionSpecification439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImportStatement_in_entryRuleImportStatement475 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImportStatement485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleImportStatement522 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleImportStatement539 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleImportStatement556 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleImportStatement573 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleImportStatement590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent626 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEvent636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleEvent673 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEvent694 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEvent706 = new BitSet(new long[]{0x0000000000042050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEvent733 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_18_in_ruleEvent747 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEvent774 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_13_in_ruleEvent788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEventChain_in_entryRuleEventChain824 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEventChain834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleEventChain871 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEventChain892 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEventChain904 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleEventChain916 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEventChain943 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleEventChain955 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEventChain982 = new BitSet(new long[]{0x0000000000402000L});
        public static final BitSet FOLLOW_22_in_ruleEventChain995 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEventChain1022 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_18_in_ruleEventChain1035 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEventChain1062 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_13_in_ruleEventChain1078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimingConstraint_in_entryRuleTimingConstraint1114 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTimingConstraint1124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDelayConstraint_in_ruleTimingConstraint1174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRepetitionConstraint_in_ruleTimingConstraint1204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSynchronizationConstraint_in_ruleTimingConstraint1234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderConstraint_in_ruleTimingConstraint1264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePatternConstraint_in_ruleTimingConstraint1294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSporadicConstraint_in_ruleTimingConstraint1324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePeriodicConstraint_in_ruleTimingConstraint1354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArbitraryConstraint_in_ruleTimingConstraint1384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBurstConstraint_in_ruleTimingConstraint1414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReactionConstraint_in_ruleTimingConstraint1444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAgeConstraint_in_ruleTimingConstraint1474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDelayConstraint_in_entryRuleDelayConstraint1509 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDelayConstraint1519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleDelayConstraint1556 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDelayConstraint1577 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDelayConstraint1589 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleDelayConstraint1601 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDelayConstraint1628 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleDelayConstraint1640 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDelayConstraint1667 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleDelayConstraint1679 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleDelayConstraint1691 = new BitSet(new long[]{0x1040008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleSymbolicTimingExpression_in_ruleDelayConstraint1713 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_ruleValueTimingExpression_in_ruleDelayConstraint1740 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleDelayConstraint1753 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleDelayConstraint1765 = new BitSet(new long[]{0x1040008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleSymbolicTimingExpression_in_ruleDelayConstraint1787 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_ruleValueTimingExpression_in_ruleDelayConstraint1814 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDelayConstraint1827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRepetitionConstraint_in_entryRuleRepetitionConstraint1863 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRepetitionConstraint1873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleRepetitionConstraint1910 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRepetitionConstraint1931 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRepetitionConstraint1943 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleRepetitionConstraint1955 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRepetitionConstraint1982 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleRepetitionConstraint1994 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleRepetitionConstraint2006 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleRepetitionConstraint2023 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleRepetitionConstraint2040 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleRepetitionConstraint2052 = new BitSet(new long[]{0x1040008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleSymbolicTimingExpression_in_ruleRepetitionConstraint2074 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_ruleValueTimingExpression_in_ruleRepetitionConstraint2101 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleRepetitionConstraint2114 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleRepetitionConstraint2126 = new BitSet(new long[]{0x1040008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleSymbolicTimingExpression_in_ruleRepetitionConstraint2148 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_ruleValueTimingExpression_in_ruleRepetitionConstraint2175 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleRepetitionConstraint2188 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleRepetitionConstraint2200 = new BitSet(new long[]{0x1040008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleSymbolicTimingExpression_in_ruleRepetitionConstraint2222 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_ruleValueTimingExpression_in_ruleRepetitionConstraint2249 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleRepetitionConstraint2262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSynchronizationConstraint_in_entryRuleSynchronizationConstraint2298 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSynchronizationConstraint2308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleSynchronizationConstraint2345 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSynchronizationConstraint2366 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSynchronizationConstraint2378 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleSynchronizationConstraint2390 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSynchronizationConstraint2417 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleSynchronizationConstraint2429 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSynchronizationConstraint2456 = new BitSet(new long[]{0x0000000800040000L});
        public static final BitSet FOLLOW_18_in_ruleSynchronizationConstraint2469 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSynchronizationConstraint2496 = new BitSet(new long[]{0x0000000800040000L});
        public static final BitSet FOLLOW_35_in_ruleSynchronizationConstraint2510 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleSynchronizationConstraint2522 = new BitSet(new long[]{0x1040008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleSymbolicTimingExpression_in_ruleSynchronizationConstraint2544 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_ruleValueTimingExpression_in_ruleSynchronizationConstraint2571 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSynchronizationConstraint2584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderConstraint_in_entryRuleOrderConstraint2620 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrderConstraint2630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleOrderConstraint2667 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOrderConstraint2688 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOrderConstraint2700 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleOrderConstraint2712 = new BitSet(new long[]{0x1040008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleSymbolicTimingExpression_in_ruleOrderConstraint2734 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_ruleValueTimingExpression_in_ruleOrderConstraint2761 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleOrderConstraint2774 = new BitSet(new long[]{0x1040008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleSymbolicTimingExpression_in_ruleOrderConstraint2796 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_ruleValueTimingExpression_in_ruleOrderConstraint2823 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleOrderConstraint2836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePatternConstraint_in_entryRulePatternConstraint2872 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePatternConstraint2882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rulePatternConstraint2920 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_rulePatternConstraint2941 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePatternConstraint2953 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_rulePatternConstraint2965 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_rulePatternConstraint2992 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_rulePatternConstraint3004 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_rulePatternConstraint3031 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_rulePatternConstraint3043 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_rulePatternConstraint3055 = new BitSet(new long[]{0x1040008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleSymbolicTimingExpression_in_rulePatternConstraint3077 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_ruleValueTimingExpression_in_rulePatternConstraint3104 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_rulePatternConstraint3117 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_rulePatternConstraint3129 = new BitSet(new long[]{0x1040008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleSymbolicTimingExpression_in_rulePatternConstraint3151 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_ruleValueTimingExpression_in_rulePatternConstraint3178 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_rulePatternConstraint3191 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_rulePatternConstraint3203 = new BitSet(new long[]{0x0040000000000050L});
        public static final BitSet FOLLOW_ruleSymbolicTimingExpression_in_rulePatternConstraint3224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValueTimingExpression_in_rulePatternConstraint3253 = new BitSet(new long[]{0x1040008000042020L,0x0000000000002000L});
        public static final BitSet FOLLOW_18_in_rulePatternConstraint3267 = new BitSet(new long[]{0x0040000000000050L});
        public static final BitSet FOLLOW_ruleSymbolicTimingExpression_in_rulePatternConstraint3288 = new BitSet(new long[]{0x1040008000042020L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleValueTimingExpression_in_rulePatternConstraint3316 = new BitSet(new long[]{0x1040008000042020L,0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_rulePatternConstraint3330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSporadicConstraint_in_entryRuleSporadicConstraint3367 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSporadicConstraint3377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleSporadicConstraint3414 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSporadicConstraint3435 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSporadicConstraint3447 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleSporadicConstraint3459 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSporadicConstraint3486 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleSporadicConstraint3498 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleSporadicConstraint3510 = new BitSet(new long[]{0x1040008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleSymbolicTimingExpression_in_ruleSporadicConstraint3532 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_ruleValueTimingExpression_in_ruleSporadicConstraint3559 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleSporadicConstraint3572 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleSporadicConstraint3584 = new BitSet(new long[]{0x1040008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleSymbolicTimingExpression_in_ruleSporadicConstraint3606 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_ruleValueTimingExpression_in_ruleSporadicConstraint3633 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleSporadicConstraint3646 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleSporadicConstraint3658 = new BitSet(new long[]{0x1040008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleSymbolicTimingExpression_in_ruleSporadicConstraint3680 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_ruleValueTimingExpression_in_ruleSporadicConstraint3707 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleSporadicConstraint3720 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleSporadicConstraint3732 = new BitSet(new long[]{0x1040008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleSymbolicTimingExpression_in_ruleSporadicConstraint3754 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_ruleValueTimingExpression_in_ruleSporadicConstraint3781 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSporadicConstraint3794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePeriodicConstraint_in_entryRulePeriodicConstraint3830 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePeriodicConstraint3840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rulePeriodicConstraint3877 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_rulePeriodicConstraint3898 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePeriodicConstraint3910 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_rulePeriodicConstraint3922 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_rulePeriodicConstraint3949 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_rulePeriodicConstraint3961 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_rulePeriodicConstraint3973 = new BitSet(new long[]{0x1040008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleSymbolicTimingExpression_in_rulePeriodicConstraint3995 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_ruleValueTimingExpression_in_rulePeriodicConstraint4022 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_rulePeriodicConstraint4035 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_rulePeriodicConstraint4047 = new BitSet(new long[]{0x1040008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleSymbolicTimingExpression_in_rulePeriodicConstraint4069 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_ruleValueTimingExpression_in_rulePeriodicConstraint4096 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_rulePeriodicConstraint4109 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_rulePeriodicConstraint4121 = new BitSet(new long[]{0x1040008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleSymbolicTimingExpression_in_rulePeriodicConstraint4143 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_ruleValueTimingExpression_in_rulePeriodicConstraint4170 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_rulePeriodicConstraint4183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArbitraryConstraint_in_entryRuleArbitraryConstraint4219 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArbitraryConstraint4229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleArbitraryConstraint4267 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArbitraryConstraint4288 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleArbitraryConstraint4300 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleArbitraryConstraint4312 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArbitraryConstraint4339 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleArbitraryConstraint4351 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleArbitraryConstraint4363 = new BitSet(new long[]{0x0040000000000050L});
        public static final BitSet FOLLOW_ruleSymbolicTimingExpression_in_ruleArbitraryConstraint4384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValueTimingExpression_in_ruleArbitraryConstraint4413 = new BitSet(new long[]{0x1040808000040020L,0x0000000000002000L});
        public static final BitSet FOLLOW_18_in_ruleArbitraryConstraint4427 = new BitSet(new long[]{0x0040000000000050L});
        public static final BitSet FOLLOW_ruleSymbolicTimingExpression_in_ruleArbitraryConstraint4448 = new BitSet(new long[]{0x1040808000040020L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleValueTimingExpression_in_ruleArbitraryConstraint4476 = new BitSet(new long[]{0x1040808000040020L,0x0000000000002000L});
        public static final BitSet FOLLOW_47_in_ruleArbitraryConstraint4490 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleArbitraryConstraint4502 = new BitSet(new long[]{0x0040000000000050L});
        public static final BitSet FOLLOW_ruleSymbolicTimingExpression_in_ruleArbitraryConstraint4523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValueTimingExpression_in_ruleArbitraryConstraint4552 = new BitSet(new long[]{0x1040008000042020L,0x0000000000002000L});
        public static final BitSet FOLLOW_18_in_ruleArbitraryConstraint4566 = new BitSet(new long[]{0x0040000000000050L});
        public static final BitSet FOLLOW_ruleSymbolicTimingExpression_in_ruleArbitraryConstraint4587 = new BitSet(new long[]{0x1040008000042020L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleValueTimingExpression_in_ruleArbitraryConstraint4615 = new BitSet(new long[]{0x1040008000042020L,0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleArbitraryConstraint4629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBurstConstraint_in_entryRuleBurstConstraint4666 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBurstConstraint4676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleBurstConstraint4713 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBurstConstraint4734 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBurstConstraint4746 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleBurstConstraint4758 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBurstConstraint4785 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_49_in_ruleBurstConstraint4797 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleBurstConstraint4809 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleBurstConstraint4826 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_ruleBurstConstraint4843 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleBurstConstraint4855 = new BitSet(new long[]{0x1040008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleSymbolicTimingExpression_in_ruleBurstConstraint4877 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_ruleValueTimingExpression_in_ruleBurstConstraint4904 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleBurstConstraint4917 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleBurstConstraint4929 = new BitSet(new long[]{0x1040008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleSymbolicTimingExpression_in_ruleBurstConstraint4951 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_ruleValueTimingExpression_in_ruleBurstConstraint4978 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleBurstConstraint4991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReactionConstraint_in_entryRuleReactionConstraint5027 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReactionConstraint5037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleReactionConstraint5074 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleReactionConstraint5095 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleReactionConstraint5107 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_52_in_ruleReactionConstraint5119 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleReactionConstraint5146 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_47_in_ruleReactionConstraint5158 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleReactionConstraint5170 = new BitSet(new long[]{0x1040008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleSymbolicTimingExpression_in_ruleReactionConstraint5192 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_ruleValueTimingExpression_in_ruleReactionConstraint5219 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleReactionConstraint5232 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleReactionConstraint5244 = new BitSet(new long[]{0x1040008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleSymbolicTimingExpression_in_ruleReactionConstraint5266 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_ruleValueTimingExpression_in_ruleReactionConstraint5293 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleReactionConstraint5306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAgeConstraint_in_entryRuleAgeConstraint5342 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAgeConstraint5352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleAgeConstraint5389 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAgeConstraint5410 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAgeConstraint5422 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_52_in_ruleAgeConstraint5434 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAgeConstraint5461 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_47_in_ruleAgeConstraint5473 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleAgeConstraint5485 = new BitSet(new long[]{0x1040008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleSymbolicTimingExpression_in_ruleAgeConstraint5507 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_ruleValueTimingExpression_in_ruleAgeConstraint5534 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleAgeConstraint5547 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleAgeConstraint5559 = new BitSet(new long[]{0x1040008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleSymbolicTimingExpression_in_ruleAgeConstraint5581 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_ruleValueTimingExpression_in_ruleAgeConstraint5608 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAgeConstraint5621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimingExpression_in_entryRuleTimingExpression5657 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTimingExpression5667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSymbolicTimingExpression_in_ruleTimingExpression5717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableTimingExpression_in_ruleTimingExpression5747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValueTimingExpression_in_ruleTimingExpression5777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition5812 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddition5822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleAddition5859 = new BitSet(new long[]{0x1240008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleTimingExpression_in_ruleAddition5880 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleAddition5892 = new BitSet(new long[]{0x1240008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleTimingExpression_in_ruleAddition5913 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_ruleAddition5925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperator_in_entryRuleOperator5961 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperator5971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddition_in_ruleOperator6021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubtraction_in_ruleOperator6051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplication_in_ruleOperator6081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivision_in_ruleOperator6111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_ruleOperator6141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGreaterThan_in_ruleOperator6171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLessThan_in_ruleOperator6201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGreaterThanOrEqual_in_ruleOperator6231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLessThanOrEqual_in_ruleOperator6261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSymbolicTimingExpression_in_entryRuleSymbolicTimingExpression6296 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSymbolicTimingExpression6306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSymbolicTimingExpression6371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperator_in_ruleSymbolicTimingExpression6399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableTimingExpression_in_entryRuleVariableTimingExpression6435 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableTimingExpression6445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleVariableTimingExpression6482 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariableTimingExpression6503 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariableTimingExpression6530 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_58_in_ruleVariableTimingExpression6542 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariableTimingExpression6569 = new BitSet(new long[]{0x0800000000000002L});
        public static final BitSet FOLLOW_59_in_ruleVariableTimingExpression6582 = new BitSet(new long[]{0x1040008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleSymbolicTimingExpression_in_ruleVariableTimingExpression6604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValueTimingExpression_in_ruleVariableTimingExpression6631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValueTimingExpression_in_entryRuleValueTimingExpression6670 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValueTimingExpression6680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleValueTimingExpression6718 = new BitSet(new long[]{0x1040008000000020L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleValueTimingExpression6739 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleValueTimingExpression6766 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_58_in_ruleValueTimingExpression6779 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleValueTimingExpression6806 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_ruleValueTimingExpression6819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleValueTimingExpression6847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubtraction_in_entryRuleSubtraction6883 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubtraction6893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleSubtraction6930 = new BitSet(new long[]{0x1240008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleTimingExpression_in_ruleSubtraction6951 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_60_in_ruleSubtraction6963 = new BitSet(new long[]{0x1240008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleTimingExpression_in_ruleSubtraction6984 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_ruleSubtraction6996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication7032 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication7042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleMultiplication7079 = new BitSet(new long[]{0x1240008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleTimingExpression_in_ruleMultiplication7100 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_61_in_ruleMultiplication7112 = new BitSet(new long[]{0x1240008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleTimingExpression_in_ruleMultiplication7133 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_ruleMultiplication7145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivision_in_entryRuleDivision7181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDivision7191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleDivision7228 = new BitSet(new long[]{0x1240008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleTimingExpression_in_ruleDivision7249 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_62_in_ruleDivision7261 = new BitSet(new long[]{0x1240008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleTimingExpression_in_ruleDivision7282 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_ruleDivision7294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment7330 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignment7340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleAssignment7377 = new BitSet(new long[]{0x1240008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleTimingExpression_in_ruleAssignment7398 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_59_in_ruleAssignment7410 = new BitSet(new long[]{0x1240008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleTimingExpression_in_ruleAssignment7431 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_ruleAssignment7443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGreaterThan_in_entryRuleGreaterThan7479 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGreaterThan7489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleGreaterThan7526 = new BitSet(new long[]{0x1240008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleTimingExpression_in_ruleGreaterThan7547 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_63_in_ruleGreaterThan7559 = new BitSet(new long[]{0x1240008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleTimingExpression_in_ruleGreaterThan7580 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_ruleGreaterThan7592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLessThan_in_entryRuleLessThan7628 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLessThan7638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleLessThan7675 = new BitSet(new long[]{0x1240008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleTimingExpression_in_ruleLessThan7696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_64_in_ruleLessThan7708 = new BitSet(new long[]{0x1240008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleTimingExpression_in_ruleLessThan7729 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_ruleLessThan7741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGreaterThanOrEqual_in_entryRuleGreaterThanOrEqual7777 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGreaterThanOrEqual7787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleGreaterThanOrEqual7824 = new BitSet(new long[]{0x1240008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleTimingExpression_in_ruleGreaterThanOrEqual7845 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleGreaterThanOrEqual7857 = new BitSet(new long[]{0x1240008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleTimingExpression_in_ruleGreaterThanOrEqual7878 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_ruleGreaterThanOrEqual7890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLessThanOrEqual_in_entryRuleLessThanOrEqual7926 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLessThanOrEqual7936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleLessThanOrEqual7973 = new BitSet(new long[]{0x1240008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleTimingExpression_in_ruleLessThanOrEqual7994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_66_in_ruleLessThanOrEqual8006 = new BitSet(new long[]{0x1240008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleTimingExpression_in_ruleLessThanOrEqual8027 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_ruleLessThanOrEqual8039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString8076 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString8087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString8127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString8153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimeBase_in_entryRuleTimeBase8198 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTimeBase8208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleTimeBase8245 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTimeBase8266 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTimeBase8278 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_68_in_ruleTimeBase8290 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTimeBase8317 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000060L});
        public static final BitSet FOLLOW_69_in_ruleTimeBase8330 = new BitSet(new long[]{0x1040008000000020L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleTimeBase8351 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000040L});
        public static final BitSet FOLLOW_70_in_ruleTimeBase8366 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTimeBase8393 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTimeBase8407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnit_in_entryRuleUnit8443 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnit8453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUnit8511 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleUnit8523 = new BitSet(new long[]{0x0000040000002000L,0x0000000000000180L});
        public static final BitSet FOLLOW_71_in_ruleUnit8536 = new BitSet(new long[]{0x1040008000000020L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleUnit8557 = new BitSet(new long[]{0x0000040000002000L,0x0000000000000100L});
        public static final BitSet FOLLOW_42_in_ruleUnit8572 = new BitSet(new long[]{0x1040008000000020L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleUnit8593 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000100L});
        public static final BitSet FOLLOW_72_in_ruleUnit8608 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUnit8635 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleUnit8649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDimension_in_entryRuleDimension8685 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDimension8695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_ruleDimension8732 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDimension8753 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDimension8765 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
        public static final BitSet FOLLOW_74_in_ruleDimension8778 = new BitSet(new long[]{0x0000000000000000L,0x00000000000F0000L});
        public static final BitSet FOLLOW_ruleDimensionKind_in_ruleDimension8799 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_75_in_ruleDimension8813 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDimension8825 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleUnit_in_ruleDimension8846 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_18_in_ruleDimension8859 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleUnit_in_ruleDimension8880 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_13_in_ruleDimension8894 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDimension8906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimeBaseRelation_in_entryRuleTimeBaseRelation8942 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTimeBaseRelation8952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_ruleTimeBaseRelation8989 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTimeBaseRelation9010 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTimeBaseRelation9022 = new BitSet(new long[]{0x1040008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleSymbolicTimingExpression_in_ruleTimeBaseRelation9044 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_54_in_ruleTimeBaseRelation9063 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_ruleVariableTimingExpression_in_ruleTimeBaseRelation9084 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_ruleTimeBaseRelation9096 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleValueTimingExpression_in_ruleTimeBaseRelation9124 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleTimeBaseRelation9137 = new BitSet(new long[]{0x1040008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleSymbolicTimingExpression_in_ruleTimeBaseRelation9159 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_54_in_ruleTimeBaseRelation9178 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_ruleVariableTimingExpression_in_ruleTimeBaseRelation9199 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_ruleTimeBaseRelation9211 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_ruleValueTimingExpression_in_ruleTimeBaseRelation9239 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTimeBaseRelation9252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble9289 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble9300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleEDouble9339 = new BitSet(new long[]{0x0000000000000020L,0x0000000000002000L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble9357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
        public static final BitSet FOLLOW_77_in_ruleEDouble9377 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble9392 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L});
        public static final BitSet FOLLOW_78_in_ruleEDouble9412 = new BitSet(new long[]{0x1000000000000020L});
        public static final BitSet FOLLOW_79_in_ruleEDouble9431 = new BitSet(new long[]{0x1000000000000020L});
        public static final BitSet FOLLOW_60_in_ruleEDouble9446 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble9463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_80_in_ruleDimensionKind9524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_81_in_ruleDimensionKind9541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_82_in_ruleDimensionKind9558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_83_in_ruleDimensionKind9575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePatternConstraint_in_synpred18_InternalTadl21294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArbitraryConstraint_in_synpred21_InternalTadl21384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValueTimingExpression_in_synpred48_InternalTadl24413 = new BitSet(new long[]{0x1040808000040020L,0x0000000000002000L});
        public static final BitSet FOLLOW_18_in_synpred48_InternalTadl24427 = new BitSet(new long[]{0x0040000000000050L});
        public static final BitSet FOLLOW_ruleSymbolicTimingExpression_in_synpred48_InternalTadl24448 = new BitSet(new long[]{0x1040808000040020L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleValueTimingExpression_in_synpred48_InternalTadl24476 = new BitSet(new long[]{0x1040808000040020L,0x0000000000002000L});
        public static final BitSet FOLLOW_47_in_synpred48_InternalTadl24490 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_synpred48_InternalTadl24502 = new BitSet(new long[]{0x0040000000000050L});
        public static final BitSet FOLLOW_ruleSymbolicTimingExpression_in_synpred48_InternalTadl24523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddition_in_synpred59_InternalTadl26021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubtraction_in_synpred60_InternalTadl26051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplication_in_synpred61_InternalTadl26081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivision_in_synpred62_InternalTadl26111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_synpred63_InternalTadl26141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGreaterThan_in_synpred64_InternalTadl26171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLessThan_in_synpred65_InternalTadl26201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGreaterThanOrEqual_in_synpred66_InternalTadl26231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_synpred69_InternalTadl26582 = new BitSet(new long[]{0x1040008000000070L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleSymbolicTimingExpression_in_synpred69_InternalTadl26604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValueTimingExpression_in_synpred69_InternalTadl26631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSymbolicTimingExpression_in_synpred79_InternalTadl29044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_synpred80_InternalTadl29063 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_ruleVariableTimingExpression_in_synpred80_InternalTadl29084 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_synpred80_InternalTadl29096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSymbolicTimingExpression_in_synpred81_InternalTadl29159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_synpred82_InternalTadl29178 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_ruleVariableTimingExpression_in_synpred82_InternalTadl29199 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_synpred82_InternalTadl29211 = new BitSet(new long[]{0x0000000000000002L});
    }


}