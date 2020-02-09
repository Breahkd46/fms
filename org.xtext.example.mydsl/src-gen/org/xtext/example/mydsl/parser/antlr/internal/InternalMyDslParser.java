package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'FSM'", "'{'", "','", "'}'", "'state'", "'stateinit'", "'statefinal'", "'tr'", "'->'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "FSM";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFSM"
    // InternalMyDsl.g:64:1: entryRuleFSM returns [EObject current=null] : iv_ruleFSM= ruleFSM EOF ;
    public final EObject entryRuleFSM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFSM = null;


        try {
            // InternalMyDsl.g:64:44: (iv_ruleFSM= ruleFSM EOF )
            // InternalMyDsl.g:65:2: iv_ruleFSM= ruleFSM EOF
            {
             newCompositeNode(grammarAccess.getFSMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFSM=ruleFSM();

            state._fsp--;

             current =iv_ruleFSM; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFSM"


    // $ANTLR start "ruleFSM"
    // InternalMyDsl.g:71:1: ruleFSM returns [EObject current=null] : ( () otherlv_1= 'FSM' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_state_4_0= ruleInitState ) ) otherlv_5= ',' ( (lv_state_6_0= ruleFinalState ) ) otherlv_7= ',' ( ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( ( (lv_state_10_0= ruleState ) ) | ( (lv_transition_11_0= ruleTransition ) ) ) )* )? otherlv_12= '}' ) ;
    public final EObject ruleFSM() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_state_4_0 = null;

        EObject lv_state_6_0 = null;

        EObject lv_state_8_0 = null;

        EObject lv_state_10_0 = null;

        EObject lv_transition_11_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( () otherlv_1= 'FSM' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_state_4_0= ruleInitState ) ) otherlv_5= ',' ( (lv_state_6_0= ruleFinalState ) ) otherlv_7= ',' ( ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( ( (lv_state_10_0= ruleState ) ) | ( (lv_transition_11_0= ruleTransition ) ) ) )* )? otherlv_12= '}' ) )
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'FSM' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_state_4_0= ruleInitState ) ) otherlv_5= ',' ( (lv_state_6_0= ruleFinalState ) ) otherlv_7= ',' ( ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( ( (lv_state_10_0= ruleState ) ) | ( (lv_transition_11_0= ruleTransition ) ) ) )* )? otherlv_12= '}' )
            {
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'FSM' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_state_4_0= ruleInitState ) ) otherlv_5= ',' ( (lv_state_6_0= ruleFinalState ) ) otherlv_7= ',' ( ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( ( (lv_state_10_0= ruleState ) ) | ( (lv_transition_11_0= ruleTransition ) ) ) )* )? otherlv_12= '}' )
            // InternalMyDsl.g:79:3: () otherlv_1= 'FSM' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_state_4_0= ruleInitState ) ) otherlv_5= ',' ( (lv_state_6_0= ruleFinalState ) ) otherlv_7= ',' ( ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( ( (lv_state_10_0= ruleState ) ) | ( (lv_transition_11_0= ruleTransition ) ) ) )* )? otherlv_12= '}'
            {
            // InternalMyDsl.g:79:3: ()
            // InternalMyDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFSMAccess().getFSMAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFSMAccess().getFSMKeyword_1());
            		
            // InternalMyDsl.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:91:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFSMAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFSMRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getFSMAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:113:3: ( (lv_state_4_0= ruleInitState ) )
            // InternalMyDsl.g:114:4: (lv_state_4_0= ruleInitState )
            {
            // InternalMyDsl.g:114:4: (lv_state_4_0= ruleInitState )
            // InternalMyDsl.g:115:5: lv_state_4_0= ruleInitState
            {

            					newCompositeNode(grammarAccess.getFSMAccess().getStateInitStateParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_state_4_0=ruleInitState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFSMRule());
            					}
            					add(
            						current,
            						"state",
            						lv_state_4_0,
            						"org.xtext.example.mydsl.MyDsl.InitState");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getFSMAccess().getCommaKeyword_5());
            		
            // InternalMyDsl.g:136:3: ( (lv_state_6_0= ruleFinalState ) )
            // InternalMyDsl.g:137:4: (lv_state_6_0= ruleFinalState )
            {
            // InternalMyDsl.g:137:4: (lv_state_6_0= ruleFinalState )
            // InternalMyDsl.g:138:5: lv_state_6_0= ruleFinalState
            {

            					newCompositeNode(grammarAccess.getFSMAccess().getStateFinalStateParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_6);
            lv_state_6_0=ruleFinalState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFSMRule());
            					}
            					add(
            						current,
            						"state",
            						lv_state_6_0,
            						"org.xtext.example.mydsl.MyDsl.FinalState");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getFSMAccess().getCommaKeyword_7());
            		
            // InternalMyDsl.g:159:3: ( ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( ( (lv_state_10_0= ruleState ) ) | ( (lv_transition_11_0= ruleTransition ) ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:160:4: ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( ( (lv_state_10_0= ruleState ) ) | ( (lv_transition_11_0= ruleTransition ) ) ) )*
                    {
                    // InternalMyDsl.g:160:4: ( (lv_state_8_0= ruleState ) )
                    // InternalMyDsl.g:161:5: (lv_state_8_0= ruleState )
                    {
                    // InternalMyDsl.g:161:5: (lv_state_8_0= ruleState )
                    // InternalMyDsl.g:162:6: lv_state_8_0= ruleState
                    {

                    						newCompositeNode(grammarAccess.getFSMAccess().getStateStateParserRuleCall_8_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_state_8_0=ruleState();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFSMRule());
                    						}
                    						add(
                    							current,
                    							"state",
                    							lv_state_8_0,
                    							"org.xtext.example.mydsl.MyDsl.State");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:179:4: (otherlv_9= ',' ( ( (lv_state_10_0= ruleState ) ) | ( (lv_transition_11_0= ruleTransition ) ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==13) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalMyDsl.g:180:5: otherlv_9= ',' ( ( (lv_state_10_0= ruleState ) ) | ( (lv_transition_11_0= ruleTransition ) ) )
                    	    {
                    	    otherlv_9=(Token)match(input,13,FOLLOW_10); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getFSMAccess().getCommaKeyword_8_1_0());
                    	    				
                    	    // InternalMyDsl.g:184:5: ( ( (lv_state_10_0= ruleState ) ) | ( (lv_transition_11_0= ruleTransition ) ) )
                    	    int alt1=2;
                    	    int LA1_0 = input.LA(1);

                    	    if ( (LA1_0==15) ) {
                    	        alt1=1;
                    	    }
                    	    else if ( (LA1_0==18) ) {
                    	        alt1=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 1, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt1) {
                    	        case 1 :
                    	            // InternalMyDsl.g:185:6: ( (lv_state_10_0= ruleState ) )
                    	            {
                    	            // InternalMyDsl.g:185:6: ( (lv_state_10_0= ruleState ) )
                    	            // InternalMyDsl.g:186:7: (lv_state_10_0= ruleState )
                    	            {
                    	            // InternalMyDsl.g:186:7: (lv_state_10_0= ruleState )
                    	            // InternalMyDsl.g:187:8: lv_state_10_0= ruleState
                    	            {

                    	            								newCompositeNode(grammarAccess.getFSMAccess().getStateStateParserRuleCall_8_1_1_0_0());
                    	            							
                    	            pushFollow(FOLLOW_9);
                    	            lv_state_10_0=ruleState();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getFSMRule());
                    	            								}
                    	            								add(
                    	            									current,
                    	            									"state",
                    	            									lv_state_10_0,
                    	            									"org.xtext.example.mydsl.MyDsl.State");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalMyDsl.g:205:6: ( (lv_transition_11_0= ruleTransition ) )
                    	            {
                    	            // InternalMyDsl.g:205:6: ( (lv_transition_11_0= ruleTransition ) )
                    	            // InternalMyDsl.g:206:7: (lv_transition_11_0= ruleTransition )
                    	            {
                    	            // InternalMyDsl.g:206:7: (lv_transition_11_0= ruleTransition )
                    	            // InternalMyDsl.g:207:8: lv_transition_11_0= ruleTransition
                    	            {

                    	            								newCompositeNode(grammarAccess.getFSMAccess().getTransitionTransitionParserRuleCall_8_1_1_1_0());
                    	            							
                    	            pushFollow(FOLLOW_9);
                    	            lv_transition_11_0=ruleTransition();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getFSMRule());
                    	            								}
                    	            								add(
                    	            									current,
                    	            									"transition",
                    	            									lv_transition_11_0,
                    	            									"org.xtext.example.mydsl.MyDsl.Transition");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getFSMAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFSM"


    // $ANTLR start "entryRuleState"
    // InternalMyDsl.g:235:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalMyDsl.g:235:46: (iv_ruleState= ruleState EOF )
            // InternalMyDsl.g:236:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalMyDsl.g:242:1: ruleState returns [EObject current=null] : ( () otherlv_1= 'state' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:248:2: ( ( () otherlv_1= 'state' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:249:2: ( () otherlv_1= 'state' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:249:2: ( () otherlv_1= 'state' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMyDsl.g:250:3: () otherlv_1= 'state' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:250:3: ()
            // InternalMyDsl.g:251:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStateAccess().getStateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
            		
            // InternalMyDsl.g:261:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:262:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:262:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:263:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleInitState"
    // InternalMyDsl.g:284:1: entryRuleInitState returns [EObject current=null] : iv_ruleInitState= ruleInitState EOF ;
    public final EObject entryRuleInitState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitState = null;


        try {
            // InternalMyDsl.g:284:50: (iv_ruleInitState= ruleInitState EOF )
            // InternalMyDsl.g:285:2: iv_ruleInitState= ruleInitState EOF
            {
             newCompositeNode(grammarAccess.getInitStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitState=ruleInitState();

            state._fsp--;

             current =iv_ruleInitState; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInitState"


    // $ANTLR start "ruleInitState"
    // InternalMyDsl.g:291:1: ruleInitState returns [EObject current=null] : ( () otherlv_1= 'stateinit' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleInitState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:297:2: ( ( () otherlv_1= 'stateinit' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:298:2: ( () otherlv_1= 'stateinit' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:298:2: ( () otherlv_1= 'stateinit' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMyDsl.g:299:3: () otherlv_1= 'stateinit' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:299:3: ()
            // InternalMyDsl.g:300:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInitStateAccess().getInitStateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInitStateAccess().getStateinitKeyword_1());
            		
            // InternalMyDsl.g:310:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:311:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:311:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:312:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInitStateAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitState"


    // $ANTLR start "entryRuleFinalState"
    // InternalMyDsl.g:333:1: entryRuleFinalState returns [EObject current=null] : iv_ruleFinalState= ruleFinalState EOF ;
    public final EObject entryRuleFinalState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinalState = null;


        try {
            // InternalMyDsl.g:333:51: (iv_ruleFinalState= ruleFinalState EOF )
            // InternalMyDsl.g:334:2: iv_ruleFinalState= ruleFinalState EOF
            {
             newCompositeNode(grammarAccess.getFinalStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFinalState=ruleFinalState();

            state._fsp--;

             current =iv_ruleFinalState; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFinalState"


    // $ANTLR start "ruleFinalState"
    // InternalMyDsl.g:340:1: ruleFinalState returns [EObject current=null] : ( () otherlv_1= 'statefinal' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleFinalState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:346:2: ( ( () otherlv_1= 'statefinal' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:347:2: ( () otherlv_1= 'statefinal' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:347:2: ( () otherlv_1= 'statefinal' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMyDsl.g:348:3: () otherlv_1= 'statefinal' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:348:3: ()
            // InternalMyDsl.g:349:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFinalStateAccess().getFinalStateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFinalStateAccess().getStatefinalKeyword_1());
            		
            // InternalMyDsl.g:359:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:360:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:360:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:361:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFinalStateAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFinalStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFinalState"


    // $ANTLR start "entryRuleTransition"
    // InternalMyDsl.g:382:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalMyDsl.g:382:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalMyDsl.g:383:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalMyDsl.g:389:1: ruleTransition returns [EObject current=null] : ( () otherlv_1= 'tr' ( (lv_name_2_0= ruleEString ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:395:2: ( ( () otherlv_1= 'tr' ( (lv_name_2_0= ruleEString ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalMyDsl.g:396:2: ( () otherlv_1= 'tr' ( (lv_name_2_0= ruleEString ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalMyDsl.g:396:2: ( () otherlv_1= 'tr' ( (lv_name_2_0= ruleEString ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) )
            // InternalMyDsl.g:397:3: () otherlv_1= 'tr' ( (lv_name_2_0= ruleEString ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) )
            {
            // InternalMyDsl.g:397:3: ()
            // InternalMyDsl.g:398:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTransitionAccess().getTransitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getTrKeyword_1());
            		
            // InternalMyDsl.g:408:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:409:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:409:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:410:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:427:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:428:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:428:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:429:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getStateStartStateCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalMyDsl.g:444:3: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:445:4: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:445:4: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:446:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getStateEndStateCrossReference_5_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:461:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:461:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:462:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMyDsl.g:468:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:474:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:475:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:475:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:476:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:484:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});

}