package com.leonardo.lsaf.sadl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.leonardo.lsaf.sadl.services.SADLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSADLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_EXP", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'end'", "'.'", "'unit'", "':'", "';'", "'primitive'", "'-'", "'interface'", "'enum'", "'topic'", "'alias'", "'['", "'*'", "']'", "'('", "')'", "'as'", "'value'", "'deprecated'", "'='", "'attribute'", "'..'", "'port'", "'receives'", "'sends'", "'requires'", "'provides'", "'platform'", "'processor'", "'link'", "'connects'", "','", "'over'", "'property'", "'?'", "'transport'", "'application'", "'container'", "'container_instance'", "'component'", "'component_instance'", "'connect'", "'self'", "'::'", "'using'", "'deployment'", "'hosts'", "'carries'", "'strategy'"
    };
    public static final int RULE_EXP=7;
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSADLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSADLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSADLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSADL.g"; }



     	private SADLGrammarAccess grammarAccess;

        public InternalSADLParser(TokenStream input, SADLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected SADLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalSADL.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSADL.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalSADL.g:65:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSADL.g:71:1: ruleModel returns [EObject current=null] : ( () ( (lv_package_1_0= rulePackage ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_package_1_0 = null;



        	enterRule();

        try {
            // InternalSADL.g:77:2: ( ( () ( (lv_package_1_0= rulePackage ) )* ) )
            // InternalSADL.g:78:2: ( () ( (lv_package_1_0= rulePackage ) )* )
            {
            // InternalSADL.g:78:2: ( () ( (lv_package_1_0= rulePackage ) )* )
            // InternalSADL.g:79:3: () ( (lv_package_1_0= rulePackage ) )*
            {
            // InternalSADL.g:79:3: ()
            // InternalSADL.g:80:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getModelAccess().getModelAction_0(),
              					current);
              			
            }

            }

            // InternalSADL.g:86:3: ( (lv_package_1_0= rulePackage ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSADL.g:87:4: (lv_package_1_0= rulePackage )
            	    {
            	    // InternalSADL.g:87:4: (lv_package_1_0= rulePackage )
            	    // InternalSADL.g:88:5: lv_package_1_0= rulePackage
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModelAccess().getPackagePackageParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_package_1_0=rulePackage();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"package",
            	      						lv_package_1_0,
            	      						"com.leonardo.lsaf.sadl.SADL.Package");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePackage"
    // InternalSADL.g:109:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalSADL.g:109:48: (iv_rulePackage= rulePackage EOF )
            // InternalSADL.g:110:2: iv_rulePackage= rulePackage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePackage=rulePackage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalSADL.g:116:1: rulePackage returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_contents_3_0= rulePackageableElement ) )* otherlv_4= 'end' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_description_2_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_contents_3_0 = null;



        	enterRule();

        try {
            // InternalSADL.g:122:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_contents_3_0= rulePackageableElement ) )* otherlv_4= 'end' ) )
            // InternalSADL.g:123:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_contents_3_0= rulePackageableElement ) )* otherlv_4= 'end' )
            {
            // InternalSADL.g:123:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_contents_3_0= rulePackageableElement ) )* otherlv_4= 'end' )
            // InternalSADL.g:124:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_contents_3_0= rulePackageableElement ) )* otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
              		
            }
            // InternalSADL.g:128:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalSADL.g:129:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalSADL.g:129:4: (lv_name_1_0= ruleQualifiedName )
            // InternalSADL.g:130:5: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPackageAccess().getNameQualifiedNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPackageRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.leonardo.lsaf.sadl.SADL.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSADL.g:147:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSADL.g:148:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalSADL.g:148:4: (lv_description_2_0= RULE_STRING )
                    // InternalSADL.g:149:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_description_2_0, grammarAccess.getPackageAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPackageRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"description",
                      						lv_description_2_0,
                      						"org.eclipse.xtext.common.Terminals.STRING");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSADL.g:165:3: ( (lv_contents_3_0= rulePackageableElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15||LA3_0==18||(LA3_0>=20 && LA3_0<=23)||LA3_0==40||(LA3_0>=48 && LA3_0<=50)||LA3_0==52||LA3_0==58||LA3_0==61) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSADL.g:166:4: (lv_contents_3_0= rulePackageableElement )
            	    {
            	    // InternalSADL.g:166:4: (lv_contents_3_0= rulePackageableElement )
            	    // InternalSADL.g:167:5: lv_contents_3_0= rulePackageableElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getPackageAccess().getContentsPackageableElementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_contents_3_0=rulePackageableElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getPackageRule());
            	      					}
            	      					add(
            	      						current,
            	      						"contents",
            	      						lv_contents_3_0,
            	      						"com.leonardo.lsaf.sadl.SADL.PackageableElement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getPackageAccess().getEndKeyword_4());
              		
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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSADL.g:192:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSADL.g:194:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSADL.g:195:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalSADL.g:204:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSADL.g:211:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSADL.g:212:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSADL.g:212:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSADL.g:213:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalSADL.g:220:3: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSADL.g:221:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRulePackageableElement"
    // InternalSADL.g:241:1: entryRulePackageableElement returns [EObject current=null] : iv_rulePackageableElement= rulePackageableElement EOF ;
    public final EObject entryRulePackageableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageableElement = null;


        try {
            // InternalSADL.g:241:59: (iv_rulePackageableElement= rulePackageableElement EOF )
            // InternalSADL.g:242:2: iv_rulePackageableElement= rulePackageableElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageableElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePackageableElement=rulePackageableElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackageableElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePackageableElement"


    // $ANTLR start "rulePackageableElement"
    // InternalSADL.g:248:1: rulePackageableElement returns [EObject current=null] : (this_Unit_0= ruleUnit | this_Type_1= ruleType | this_Component_2= ruleComponent | this_Interface_3= ruleInterface | this_Platform_4= rulePlatform | this_Application_5= ruleApplication | this_Transport_6= ruleTransport | this_Strategy_7= ruleStrategy | this_Deployment_8= ruleDeployment | this_Container_9= ruleContainer ) ;
    public final EObject rulePackageableElement() throws RecognitionException {
        EObject current = null;

        EObject this_Unit_0 = null;

        EObject this_Type_1 = null;

        EObject this_Component_2 = null;

        EObject this_Interface_3 = null;

        EObject this_Platform_4 = null;

        EObject this_Application_5 = null;

        EObject this_Transport_6 = null;

        EObject this_Strategy_7 = null;

        EObject this_Deployment_8 = null;

        EObject this_Container_9 = null;



        	enterRule();

        try {
            // InternalSADL.g:254:2: ( (this_Unit_0= ruleUnit | this_Type_1= ruleType | this_Component_2= ruleComponent | this_Interface_3= ruleInterface | this_Platform_4= rulePlatform | this_Application_5= ruleApplication | this_Transport_6= ruleTransport | this_Strategy_7= ruleStrategy | this_Deployment_8= ruleDeployment | this_Container_9= ruleContainer ) )
            // InternalSADL.g:255:2: (this_Unit_0= ruleUnit | this_Type_1= ruleType | this_Component_2= ruleComponent | this_Interface_3= ruleInterface | this_Platform_4= rulePlatform | this_Application_5= ruleApplication | this_Transport_6= ruleTransport | this_Strategy_7= ruleStrategy | this_Deployment_8= ruleDeployment | this_Container_9= ruleContainer )
            {
            // InternalSADL.g:255:2: (this_Unit_0= ruleUnit | this_Type_1= ruleType | this_Component_2= ruleComponent | this_Interface_3= ruleInterface | this_Platform_4= rulePlatform | this_Application_5= ruleApplication | this_Transport_6= ruleTransport | this_Strategy_7= ruleStrategy | this_Deployment_8= ruleDeployment | this_Container_9= ruleContainer )
            int alt5=10;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt5=1;
                }
                break;
            case 18:
            case 21:
            case 22:
            case 23:
                {
                alt5=2;
                }
                break;
            case 52:
                {
                alt5=3;
                }
                break;
            case 20:
                {
                alt5=4;
                }
                break;
            case 40:
                {
                alt5=5;
                }
                break;
            case 49:
                {
                alt5=6;
                }
                break;
            case 48:
                {
                alt5=7;
                }
                break;
            case 61:
                {
                alt5=8;
                }
                break;
            case 58:
                {
                alt5=9;
                }
                break;
            case 50:
                {
                alt5=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSADL.g:256:3: this_Unit_0= ruleUnit
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPackageableElementAccess().getUnitParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Unit_0=ruleUnit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Unit_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSADL.g:265:3: this_Type_1= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPackageableElementAccess().getTypeParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Type_1=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Type_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSADL.g:274:3: this_Component_2= ruleComponent
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPackageableElementAccess().getComponentParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Component_2=ruleComponent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Component_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSADL.g:283:3: this_Interface_3= ruleInterface
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPackageableElementAccess().getInterfaceParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Interface_3=ruleInterface();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Interface_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalSADL.g:292:3: this_Platform_4= rulePlatform
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPackageableElementAccess().getPlatformParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Platform_4=rulePlatform();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Platform_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalSADL.g:301:3: this_Application_5= ruleApplication
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPackageableElementAccess().getApplicationParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Application_5=ruleApplication();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Application_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalSADL.g:310:3: this_Transport_6= ruleTransport
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPackageableElementAccess().getTransportParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Transport_6=ruleTransport();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Transport_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalSADL.g:319:3: this_Strategy_7= ruleStrategy
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPackageableElementAccess().getStrategyParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Strategy_7=ruleStrategy();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Strategy_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalSADL.g:328:3: this_Deployment_8= ruleDeployment
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPackageableElementAccess().getDeploymentParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Deployment_8=ruleDeployment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Deployment_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalSADL.g:337:3: this_Container_9= ruleContainer
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPackageableElementAccess().getContainerParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Container_9=ruleContainer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Container_9;
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
    // $ANTLR end "rulePackageableElement"


    // $ANTLR start "entryRuleUnit"
    // InternalSADL.g:349:1: entryRuleUnit returns [EObject current=null] : iv_ruleUnit= ruleUnit EOF ;
    public final EObject entryRuleUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnit = null;


        try {
            // InternalSADL.g:349:45: (iv_ruleUnit= ruleUnit EOF )
            // InternalSADL.g:350:2: iv_ruleUnit= ruleUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnitRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnit=ruleUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnit; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalSADL.g:356:1: ruleUnit returns [EObject current=null] : (otherlv_0= 'unit' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) )? ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= ';' ) ;
    public final EObject ruleUnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalSADL.g:362:2: ( (otherlv_0= 'unit' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) )? ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= ';' ) )
            // InternalSADL.g:363:2: (otherlv_0= 'unit' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) )? ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= ';' )
            {
            // InternalSADL.g:363:2: (otherlv_0= 'unit' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) )? ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= ';' )
            // InternalSADL.g:364:3: otherlv_0= 'unit' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) )? ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getUnitAccess().getUnitKeyword_0());
              		
            }
            // InternalSADL.g:368:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSADL.g:369:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSADL.g:369:4: (lv_name_1_0= RULE_ID )
            // InternalSADL.g:370:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getUnitAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getUnitRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalSADL.g:386:3: (otherlv_2= ':' ( ( ruleQualifiedName ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSADL.g:387:4: otherlv_2= ':' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getUnitAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalSADL.g:391:4: ( ( ruleQualifiedName ) )
                    // InternalSADL.g:392:5: ( ruleQualifiedName )
                    {
                    // InternalSADL.g:392:5: ( ruleQualifiedName )
                    // InternalSADL.g:393:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getUnitRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnitAccess().getGroupUnitCrossReference_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    ruleQualifiedName();

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

            // InternalSADL.g:408:3: ( (lv_description_4_0= RULE_STRING ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSADL.g:409:4: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalSADL.g:409:4: (lv_description_4_0= RULE_STRING )
                    // InternalSADL.g:410:5: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_description_4_0, grammarAccess.getUnitAccess().getDescriptionSTRINGTerminalRuleCall_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getUnitRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"description",
                      						lv_description_4_0,
                      						"org.eclipse.xtext.common.Terminals.STRING");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getUnitAccess().getSemicolonKeyword_4());
              		
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


    // $ANTLR start "entryRuleType"
    // InternalSADL.g:434:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalSADL.g:434:45: (iv_ruleType= ruleType EOF )
            // InternalSADL.g:435:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalSADL.g:441:1: ruleType returns [EObject current=null] : (this_Primitive_0= rulePrimitive | this_Enumeration_1= ruleEnumeration | this_Topic_2= ruleTopic | this_Alias_3= ruleAlias ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Primitive_0 = null;

        EObject this_Enumeration_1 = null;

        EObject this_Topic_2 = null;

        EObject this_Alias_3 = null;



        	enterRule();

        try {
            // InternalSADL.g:447:2: ( (this_Primitive_0= rulePrimitive | this_Enumeration_1= ruleEnumeration | this_Topic_2= ruleTopic | this_Alias_3= ruleAlias ) )
            // InternalSADL.g:448:2: (this_Primitive_0= rulePrimitive | this_Enumeration_1= ruleEnumeration | this_Topic_2= ruleTopic | this_Alias_3= ruleAlias )
            {
            // InternalSADL.g:448:2: (this_Primitive_0= rulePrimitive | this_Enumeration_1= ruleEnumeration | this_Topic_2= ruleTopic | this_Alias_3= ruleAlias )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt8=1;
                }
                break;
            case 21:
                {
                alt8=2;
                }
                break;
            case 22:
                {
                alt8=3;
                }
                break;
            case 23:
                {
                alt8=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalSADL.g:449:3: this_Primitive_0= rulePrimitive
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getPrimitiveParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Primitive_0=rulePrimitive();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Primitive_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSADL.g:458:3: this_Enumeration_1= ruleEnumeration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Enumeration_1=ruleEnumeration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Enumeration_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSADL.g:467:3: this_Topic_2= ruleTopic
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getTopicParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Topic_2=ruleTopic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Topic_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSADL.g:476:3: this_Alias_3= ruleAlias
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getAliasParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Alias_3=ruleAlias();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Alias_3;
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRulePrimitive"
    // InternalSADL.g:488:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // InternalSADL.g:488:50: (iv_rulePrimitive= rulePrimitive EOF )
            // InternalSADL.g:489:2: iv_rulePrimitive= rulePrimitive EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitive; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // InternalSADL.g:495:1: rulePrimitive returns [EObject current=null] : (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_min_2_0= ruleReal ) ) ( ( '-' | RULE_INT )=> (lv_max_3_0= ruleReal ) ) (otherlv_4= ':' ( (lv_res_5_0= ruleReal ) ) )? )? otherlv_6= ';' ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_min_2_0 = null;

        AntlrDatatypeRuleToken lv_max_3_0 = null;

        AntlrDatatypeRuleToken lv_res_5_0 = null;



        	enterRule();

        try {
            // InternalSADL.g:501:2: ( (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_min_2_0= ruleReal ) ) ( ( '-' | RULE_INT )=> (lv_max_3_0= ruleReal ) ) (otherlv_4= ':' ( (lv_res_5_0= ruleReal ) ) )? )? otherlv_6= ';' ) )
            // InternalSADL.g:502:2: (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_min_2_0= ruleReal ) ) ( ( '-' | RULE_INT )=> (lv_max_3_0= ruleReal ) ) (otherlv_4= ':' ( (lv_res_5_0= ruleReal ) ) )? )? otherlv_6= ';' )
            {
            // InternalSADL.g:502:2: (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_min_2_0= ruleReal ) ) ( ( '-' | RULE_INT )=> (lv_max_3_0= ruleReal ) ) (otherlv_4= ':' ( (lv_res_5_0= ruleReal ) ) )? )? otherlv_6= ';' )
            // InternalSADL.g:503:3: otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_min_2_0= ruleReal ) ) ( ( '-' | RULE_INT )=> (lv_max_3_0= ruleReal ) ) (otherlv_4= ':' ( (lv_res_5_0= ruleReal ) ) )? )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPrimitiveAccess().getPrimitiveKeyword_0());
              		
            }
            // InternalSADL.g:507:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSADL.g:508:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSADL.g:508:4: (lv_name_1_0= RULE_ID )
            // InternalSADL.g:509:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getPrimitiveAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPrimitiveRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalSADL.g:525:3: ( ( (lv_min_2_0= ruleReal ) ) ( ( '-' | RULE_INT )=> (lv_max_3_0= ruleReal ) ) (otherlv_4= ':' ( (lv_res_5_0= ruleReal ) ) )? )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT||LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSADL.g:526:4: ( (lv_min_2_0= ruleReal ) ) ( ( '-' | RULE_INT )=> (lv_max_3_0= ruleReal ) ) (otherlv_4= ':' ( (lv_res_5_0= ruleReal ) ) )?
                    {
                    // InternalSADL.g:526:4: ( (lv_min_2_0= ruleReal ) )
                    // InternalSADL.g:527:5: (lv_min_2_0= ruleReal )
                    {
                    // InternalSADL.g:527:5: (lv_min_2_0= ruleReal )
                    // InternalSADL.g:528:6: lv_min_2_0= ruleReal
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimitiveAccess().getMinRealParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_min_2_0=ruleReal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimitiveRule());
                      						}
                      						set(
                      							current,
                      							"min",
                      							lv_min_2_0,
                      							"com.leonardo.lsaf.sadl.SADL.Real");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSADL.g:545:4: ( ( '-' | RULE_INT )=> (lv_max_3_0= ruleReal ) )
                    // InternalSADL.g:546:5: ( '-' | RULE_INT )=> (lv_max_3_0= ruleReal )
                    {
                    // InternalSADL.g:547:5: (lv_max_3_0= ruleReal )
                    // InternalSADL.g:548:6: lv_max_3_0= ruleReal
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimitiveAccess().getMaxRealParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
                    lv_max_3_0=ruleReal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimitiveRule());
                      						}
                      						set(
                      							current,
                      							"max",
                      							lv_max_3_0,
                      							"com.leonardo.lsaf.sadl.SADL.Real");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSADL.g:565:4: (otherlv_4= ':' ( (lv_res_5_0= ruleReal ) ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==16) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalSADL.g:566:5: otherlv_4= ':' ( (lv_res_5_0= ruleReal ) )
                            {
                            otherlv_4=(Token)match(input,16,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getPrimitiveAccess().getColonKeyword_2_2_0());
                              				
                            }
                            // InternalSADL.g:570:5: ( (lv_res_5_0= ruleReal ) )
                            // InternalSADL.g:571:6: (lv_res_5_0= ruleReal )
                            {
                            // InternalSADL.g:571:6: (lv_res_5_0= ruleReal )
                            // InternalSADL.g:572:7: lv_res_5_0= ruleReal
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getPrimitiveAccess().getResRealParserRuleCall_2_2_1_0());
                              						
                            }
                            pushFollow(FOLLOW_10);
                            lv_res_5_0=ruleReal();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getPrimitiveRule());
                              							}
                              							set(
                              								current,
                              								"res",
                              								lv_res_5_0,
                              								"com.leonardo.lsaf.sadl.SADL.Real");
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

            otherlv_6=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getPrimitiveAccess().getSemicolonKeyword_3());
              		
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
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRuleReal"
    // InternalSADL.g:599:1: entryRuleReal returns [String current=null] : iv_ruleReal= ruleReal EOF ;
    public final String entryRuleReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReal = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSADL.g:601:2: (iv_ruleReal= ruleReal EOF )
            // InternalSADL.g:602:2: iv_ruleReal= ruleReal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReal=ruleReal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReal.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleReal"


    // $ANTLR start "ruleReal"
    // InternalSADL.g:611:1: ruleReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' (this_EXP_3= RULE_EXP | this_INT_4= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_EXP_3=null;
        Token this_INT_4=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSADL.g:618:2: ( ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' (this_EXP_3= RULE_EXP | this_INT_4= RULE_INT ) ) )
            // InternalSADL.g:619:2: ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' (this_EXP_3= RULE_EXP | this_INT_4= RULE_INT ) )
            {
            // InternalSADL.g:619:2: ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' (this_EXP_3= RULE_EXP | this_INT_4= RULE_INT ) )
            // InternalSADL.g:620:3: (kw= '-' )? this_INT_1= RULE_INT kw= '.' (this_EXP_3= RULE_EXP | this_INT_4= RULE_INT )
            {
            // InternalSADL.g:620:3: (kw= '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSADL.g:621:4: kw= '-'
                    {
                    kw=(Token)match(input,19,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getRealAccess().getHyphenMinusKeyword_0());
                      			
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_1, grammarAccess.getRealAccess().getINTTerminalRuleCall_1());
              		
            }
            kw=(Token)match(input,14,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRealAccess().getFullStopKeyword_2());
              		
            }
            // InternalSADL.g:639:3: (this_EXP_3= RULE_EXP | this_INT_4= RULE_INT )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_EXP) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_INT) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSADL.g:640:4: this_EXP_3= RULE_EXP
                    {
                    this_EXP_3=(Token)match(input,RULE_EXP,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_EXP_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_EXP_3, grammarAccess.getRealAccess().getEXPTerminalRuleCall_3_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSADL.g:648:4: this_INT_4= RULE_INT
                    {
                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_4, grammarAccess.getRealAccess().getINTTerminalRuleCall_3_1());
                      			
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleReal"


    // $ANTLR start "entryRuleInterface"
    // InternalSADL.g:663:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalSADL.g:663:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalSADL.g:664:2: iv_ruleInterface= ruleInterface EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInterface=ruleInterface();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterface; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // InternalSADL.g:670:1: ruleInterface returns [EObject current=null] : (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_ports_3_0= rulePort ) )* otherlv_4= 'end' ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_4=null;
        EObject lv_ports_3_0 = null;



        	enterRule();

        try {
            // InternalSADL.g:676:2: ( (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_ports_3_0= rulePort ) )* otherlv_4= 'end' ) )
            // InternalSADL.g:677:2: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_ports_3_0= rulePort ) )* otherlv_4= 'end' )
            {
            // InternalSADL.g:677:2: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_ports_3_0= rulePort ) )* otherlv_4= 'end' )
            // InternalSADL.g:678:3: otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_ports_3_0= rulePort ) )* otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInterfaceAccess().getInterfaceKeyword_0());
              		
            }
            // InternalSADL.g:682:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSADL.g:683:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSADL.g:683:4: (lv_name_1_0= RULE_ID )
            // InternalSADL.g:684:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInterfaceRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalSADL.g:700:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSADL.g:701:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalSADL.g:701:4: (lv_description_2_0= RULE_STRING )
                    // InternalSADL.g:702:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_description_2_0, grammarAccess.getInterfaceAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getInterfaceRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"description",
                      						lv_description_2_0,
                      						"org.eclipse.xtext.common.Terminals.STRING");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSADL.g:718:3: ( (lv_ports_3_0= rulePort ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==35) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSADL.g:719:4: (lv_ports_3_0= rulePort )
            	    {
            	    // InternalSADL.g:719:4: (lv_ports_3_0= rulePort )
            	    // InternalSADL.g:720:5: lv_ports_3_0= rulePort
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getInterfaceAccess().getPortsPortParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_ports_3_0=rulePort();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getInterfaceRule());
            	      					}
            	      					add(
            	      						current,
            	      						"ports",
            	      						lv_ports_3_0,
            	      						"com.leonardo.lsaf.sadl.SADL.Port");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getInterfaceAccess().getEndKeyword_4());
              		
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
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleEnumeration"
    // InternalSADL.g:745:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalSADL.g:745:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalSADL.g:746:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumeration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalSADL.g:752:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_enumerators_3_0= ruleEnumerator ) )* otherlv_4= 'end' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_4=null;
        EObject lv_enumerators_3_0 = null;



        	enterRule();

        try {
            // InternalSADL.g:758:2: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_enumerators_3_0= ruleEnumerator ) )* otherlv_4= 'end' ) )
            // InternalSADL.g:759:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_enumerators_3_0= ruleEnumerator ) )* otherlv_4= 'end' )
            {
            // InternalSADL.g:759:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_enumerators_3_0= ruleEnumerator ) )* otherlv_4= 'end' )
            // InternalSADL.g:760:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_enumerators_3_0= ruleEnumerator ) )* otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getEnumKeyword_0());
              		
            }
            // InternalSADL.g:764:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSADL.g:765:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSADL.g:765:4: (lv_name_1_0= RULE_ID )
            // InternalSADL.g:766:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEnumerationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalSADL.g:782:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSADL.g:783:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalSADL.g:783:4: (lv_description_2_0= RULE_STRING )
                    // InternalSADL.g:784:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_description_2_0, grammarAccess.getEnumerationAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getEnumerationRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"description",
                      						lv_description_2_0,
                      						"org.eclipse.xtext.common.Terminals.STRING");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSADL.g:800:3: ( (lv_enumerators_3_0= ruleEnumerator ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=30 && LA16_0<=31)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSADL.g:801:4: (lv_enumerators_3_0= ruleEnumerator )
            	    {
            	    // InternalSADL.g:801:4: (lv_enumerators_3_0= ruleEnumerator )
            	    // InternalSADL.g:802:5: lv_enumerators_3_0= ruleEnumerator
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEnumerationAccess().getEnumeratorsEnumeratorParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_20);
            	    lv_enumerators_3_0=ruleEnumerator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"enumerators",
            	      						lv_enumerators_3_0,
            	      						"com.leonardo.lsaf.sadl.SADL.Enumerator");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getEnumerationAccess().getEndKeyword_4());
              		
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
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleTopic"
    // InternalSADL.g:827:1: entryRuleTopic returns [EObject current=null] : iv_ruleTopic= ruleTopic EOF ;
    public final EObject entryRuleTopic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopic = null;


        try {
            // InternalSADL.g:827:46: (iv_ruleTopic= ruleTopic EOF )
            // InternalSADL.g:828:2: iv_ruleTopic= ruleTopic EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTopicRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTopic=ruleTopic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTopic; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTopic"


    // $ANTLR start "ruleTopic"
    // InternalSADL.g:834:1: ruleTopic returns [EObject current=null] : (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= 'end' ) ;
    public final EObject ruleTopic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalSADL.g:840:2: ( (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= 'end' ) )
            // InternalSADL.g:841:2: (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= 'end' )
            {
            // InternalSADL.g:841:2: (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= 'end' )
            // InternalSADL.g:842:3: otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTopicAccess().getTopicKeyword_0());
              		
            }
            // InternalSADL.g:846:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSADL.g:847:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSADL.g:847:4: (lv_name_1_0= RULE_ID )
            // InternalSADL.g:848:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getTopicAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTopicRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalSADL.g:864:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSADL.g:865:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalSADL.g:865:4: (lv_description_2_0= RULE_STRING )
                    // InternalSADL.g:866:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_description_2_0, grammarAccess.getTopicAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getTopicRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"description",
                      						lv_description_2_0,
                      						"org.eclipse.xtext.common.Terminals.STRING");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSADL.g:882:3: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==31||LA18_0==33) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSADL.g:883:4: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // InternalSADL.g:883:4: (lv_attributes_3_0= ruleAttribute )
            	    // InternalSADL.g:884:5: lv_attributes_3_0= ruleAttribute
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTopicAccess().getAttributesAttributeParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_attributes_3_0=ruleAttribute();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTopicRule());
            	      					}
            	      					add(
            	      						current,
            	      						"attributes",
            	      						lv_attributes_3_0,
            	      						"com.leonardo.lsaf.sadl.SADL.Attribute");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getTopicAccess().getEndKeyword_4());
              		
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
    // $ANTLR end "ruleTopic"


    // $ANTLR start "entryRuleAlias"
    // InternalSADL.g:909:1: entryRuleAlias returns [EObject current=null] : iv_ruleAlias= ruleAlias EOF ;
    public final EObject entryRuleAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlias = null;


        try {
            // InternalSADL.g:909:46: (iv_ruleAlias= ruleAlias EOF )
            // InternalSADL.g:910:2: iv_ruleAlias= ruleAlias EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAliasRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAlias=ruleAlias();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlias; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAlias"


    // $ANTLR start "ruleAlias"
    // InternalSADL.g:916:1: ruleAlias returns [EObject current=null] : (otherlv_0= 'alias' ( ( ruleQualifiedName ) ) ( ( (lv_min_2_0= ruleReal ) ) ( ( '-' | RULE_INT )=> (lv_max_3_0= ruleReal ) ) (otherlv_4= ':' ( (lv_res_5_0= ruleReal ) ) )? )? ( (otherlv_6= '[' ( (lv_unbounded_7_0= '*' ) ) ) | ( ( (lv_upperbound_8_0= RULE_INT ) ) otherlv_9= ']' ) )? (otherlv_10= '(' ( ( ruleQualifiedName ) ) otherlv_12= ')' )? otherlv_13= 'as' ( (lv_name_14_0= RULE_ID ) ) ( (lv_description_15_0= RULE_STRING ) )? otherlv_16= ';' ) ;
    public final EObject ruleAlias() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_unbounded_7_0=null;
        Token lv_upperbound_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_name_14_0=null;
        Token lv_description_15_0=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_min_2_0 = null;

        AntlrDatatypeRuleToken lv_max_3_0 = null;

        AntlrDatatypeRuleToken lv_res_5_0 = null;



        	enterRule();

        try {
            // InternalSADL.g:922:2: ( (otherlv_0= 'alias' ( ( ruleQualifiedName ) ) ( ( (lv_min_2_0= ruleReal ) ) ( ( '-' | RULE_INT )=> (lv_max_3_0= ruleReal ) ) (otherlv_4= ':' ( (lv_res_5_0= ruleReal ) ) )? )? ( (otherlv_6= '[' ( (lv_unbounded_7_0= '*' ) ) ) | ( ( (lv_upperbound_8_0= RULE_INT ) ) otherlv_9= ']' ) )? (otherlv_10= '(' ( ( ruleQualifiedName ) ) otherlv_12= ')' )? otherlv_13= 'as' ( (lv_name_14_0= RULE_ID ) ) ( (lv_description_15_0= RULE_STRING ) )? otherlv_16= ';' ) )
            // InternalSADL.g:923:2: (otherlv_0= 'alias' ( ( ruleQualifiedName ) ) ( ( (lv_min_2_0= ruleReal ) ) ( ( '-' | RULE_INT )=> (lv_max_3_0= ruleReal ) ) (otherlv_4= ':' ( (lv_res_5_0= ruleReal ) ) )? )? ( (otherlv_6= '[' ( (lv_unbounded_7_0= '*' ) ) ) | ( ( (lv_upperbound_8_0= RULE_INT ) ) otherlv_9= ']' ) )? (otherlv_10= '(' ( ( ruleQualifiedName ) ) otherlv_12= ')' )? otherlv_13= 'as' ( (lv_name_14_0= RULE_ID ) ) ( (lv_description_15_0= RULE_STRING ) )? otherlv_16= ';' )
            {
            // InternalSADL.g:923:2: (otherlv_0= 'alias' ( ( ruleQualifiedName ) ) ( ( (lv_min_2_0= ruleReal ) ) ( ( '-' | RULE_INT )=> (lv_max_3_0= ruleReal ) ) (otherlv_4= ':' ( (lv_res_5_0= ruleReal ) ) )? )? ( (otherlv_6= '[' ( (lv_unbounded_7_0= '*' ) ) ) | ( ( (lv_upperbound_8_0= RULE_INT ) ) otherlv_9= ']' ) )? (otherlv_10= '(' ( ( ruleQualifiedName ) ) otherlv_12= ')' )? otherlv_13= 'as' ( (lv_name_14_0= RULE_ID ) ) ( (lv_description_15_0= RULE_STRING ) )? otherlv_16= ';' )
            // InternalSADL.g:924:3: otherlv_0= 'alias' ( ( ruleQualifiedName ) ) ( ( (lv_min_2_0= ruleReal ) ) ( ( '-' | RULE_INT )=> (lv_max_3_0= ruleReal ) ) (otherlv_4= ':' ( (lv_res_5_0= ruleReal ) ) )? )? ( (otherlv_6= '[' ( (lv_unbounded_7_0= '*' ) ) ) | ( ( (lv_upperbound_8_0= RULE_INT ) ) otherlv_9= ']' ) )? (otherlv_10= '(' ( ( ruleQualifiedName ) ) otherlv_12= ')' )? otherlv_13= 'as' ( (lv_name_14_0= RULE_ID ) ) ( (lv_description_15_0= RULE_STRING ) )? otherlv_16= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAliasAccess().getAliasKeyword_0());
              		
            }
            // InternalSADL.g:928:3: ( ( ruleQualifiedName ) )
            // InternalSADL.g:929:4: ( ruleQualifiedName )
            {
            // InternalSADL.g:929:4: ( ruleQualifiedName )
            // InternalSADL.g:930:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAliasRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAliasAccess().getTypeTypeCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_23);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSADL.g:944:3: ( ( (lv_min_2_0= ruleReal ) ) ( ( '-' | RULE_INT )=> (lv_max_3_0= ruleReal ) ) (otherlv_4= ':' ( (lv_res_5_0= ruleReal ) ) )? )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==19) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_INT) ) {
                int LA20_2 = input.LA(2);

                if ( (LA20_2==14) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalSADL.g:945:4: ( (lv_min_2_0= ruleReal ) ) ( ( '-' | RULE_INT )=> (lv_max_3_0= ruleReal ) ) (otherlv_4= ':' ( (lv_res_5_0= ruleReal ) ) )?
                    {
                    // InternalSADL.g:945:4: ( (lv_min_2_0= ruleReal ) )
                    // InternalSADL.g:946:5: (lv_min_2_0= ruleReal )
                    {
                    // InternalSADL.g:946:5: (lv_min_2_0= ruleReal )
                    // InternalSADL.g:947:6: lv_min_2_0= ruleReal
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAliasAccess().getMinRealParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_min_2_0=ruleReal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAliasRule());
                      						}
                      						set(
                      							current,
                      							"min",
                      							lv_min_2_0,
                      							"com.leonardo.lsaf.sadl.SADL.Real");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSADL.g:964:4: ( ( '-' | RULE_INT )=> (lv_max_3_0= ruleReal ) )
                    // InternalSADL.g:965:5: ( '-' | RULE_INT )=> (lv_max_3_0= ruleReal )
                    {
                    // InternalSADL.g:966:5: (lv_max_3_0= ruleReal )
                    // InternalSADL.g:967:6: lv_max_3_0= ruleReal
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAliasAccess().getMaxRealParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_24);
                    lv_max_3_0=ruleReal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAliasRule());
                      						}
                      						set(
                      							current,
                      							"max",
                      							lv_max_3_0,
                      							"com.leonardo.lsaf.sadl.SADL.Real");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSADL.g:984:4: (otherlv_4= ':' ( (lv_res_5_0= ruleReal ) ) )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==16) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalSADL.g:985:5: otherlv_4= ':' ( (lv_res_5_0= ruleReal ) )
                            {
                            otherlv_4=(Token)match(input,16,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getAliasAccess().getColonKeyword_2_2_0());
                              				
                            }
                            // InternalSADL.g:989:5: ( (lv_res_5_0= ruleReal ) )
                            // InternalSADL.g:990:6: (lv_res_5_0= ruleReal )
                            {
                            // InternalSADL.g:990:6: (lv_res_5_0= ruleReal )
                            // InternalSADL.g:991:7: lv_res_5_0= ruleReal
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getAliasAccess().getResRealParserRuleCall_2_2_1_0());
                              						
                            }
                            pushFollow(FOLLOW_25);
                            lv_res_5_0=ruleReal();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getAliasRule());
                              							}
                              							set(
                              								current,
                              								"res",
                              								lv_res_5_0,
                              								"com.leonardo.lsaf.sadl.SADL.Real");
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

            // InternalSADL.g:1010:3: ( (otherlv_6= '[' ( (lv_unbounded_7_0= '*' ) ) ) | ( ( (lv_upperbound_8_0= RULE_INT ) ) otherlv_9= ']' ) )?
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_INT) ) {
                alt21=2;
            }
            switch (alt21) {
                case 1 :
                    // InternalSADL.g:1011:4: (otherlv_6= '[' ( (lv_unbounded_7_0= '*' ) ) )
                    {
                    // InternalSADL.g:1011:4: (otherlv_6= '[' ( (lv_unbounded_7_0= '*' ) ) )
                    // InternalSADL.g:1012:5: otherlv_6= '[' ( (lv_unbounded_7_0= '*' ) )
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getAliasAccess().getLeftSquareBracketKeyword_3_0_0());
                      				
                    }
                    // InternalSADL.g:1016:5: ( (lv_unbounded_7_0= '*' ) )
                    // InternalSADL.g:1017:6: (lv_unbounded_7_0= '*' )
                    {
                    // InternalSADL.g:1017:6: (lv_unbounded_7_0= '*' )
                    // InternalSADL.g:1018:7: lv_unbounded_7_0= '*'
                    {
                    lv_unbounded_7_0=(Token)match(input,25,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_unbounded_7_0, grammarAccess.getAliasAccess().getUnboundedAsteriskKeyword_3_0_1_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getAliasRule());
                      							}
                      							setWithLastConsumed(current, "unbounded", lv_unbounded_7_0, "*");
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSADL.g:1032:4: ( ( (lv_upperbound_8_0= RULE_INT ) ) otherlv_9= ']' )
                    {
                    // InternalSADL.g:1032:4: ( ( (lv_upperbound_8_0= RULE_INT ) ) otherlv_9= ']' )
                    // InternalSADL.g:1033:5: ( (lv_upperbound_8_0= RULE_INT ) ) otherlv_9= ']'
                    {
                    // InternalSADL.g:1033:5: ( (lv_upperbound_8_0= RULE_INT ) )
                    // InternalSADL.g:1034:6: (lv_upperbound_8_0= RULE_INT )
                    {
                    // InternalSADL.g:1034:6: (lv_upperbound_8_0= RULE_INT )
                    // InternalSADL.g:1035:7: lv_upperbound_8_0= RULE_INT
                    {
                    lv_upperbound_8_0=(Token)match(input,RULE_INT,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_upperbound_8_0, grammarAccess.getAliasAccess().getUpperboundINTTerminalRuleCall_3_1_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getAliasRule());
                      							}
                      							setWithLastConsumed(
                      								current,
                      								"upperbound",
                      								lv_upperbound_8_0,
                      								"org.eclipse.xtext.common.Terminals.INT");
                      						
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,26,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getAliasAccess().getRightSquareBracketKeyword_3_1_1());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSADL.g:1057:3: (otherlv_10= '(' ( ( ruleQualifiedName ) ) otherlv_12= ')' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSADL.g:1058:4: otherlv_10= '(' ( ( ruleQualifiedName ) ) otherlv_12= ')'
                    {
                    otherlv_10=(Token)match(input,27,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getAliasAccess().getLeftParenthesisKeyword_4_0());
                      			
                    }
                    // InternalSADL.g:1062:4: ( ( ruleQualifiedName ) )
                    // InternalSADL.g:1063:5: ( ruleQualifiedName )
                    {
                    // InternalSADL.g:1063:5: ( ruleQualifiedName )
                    // InternalSADL.g:1064:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAliasRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAliasAccess().getUnitUnitCrossReference_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_29);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_12=(Token)match(input,28,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getAliasAccess().getRightParenthesisKeyword_4_2());
                      			
                    }

                    }
                    break;

            }

            otherlv_13=(Token)match(input,29,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getAliasAccess().getAsKeyword_5());
              		
            }
            // InternalSADL.g:1087:3: ( (lv_name_14_0= RULE_ID ) )
            // InternalSADL.g:1088:4: (lv_name_14_0= RULE_ID )
            {
            // InternalSADL.g:1088:4: (lv_name_14_0= RULE_ID )
            // InternalSADL.g:1089:5: lv_name_14_0= RULE_ID
            {
            lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_14_0, grammarAccess.getAliasAccess().getNameIDTerminalRuleCall_6_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAliasRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_14_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalSADL.g:1105:3: ( (lv_description_15_0= RULE_STRING ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSADL.g:1106:4: (lv_description_15_0= RULE_STRING )
                    {
                    // InternalSADL.g:1106:4: (lv_description_15_0= RULE_STRING )
                    // InternalSADL.g:1107:5: lv_description_15_0= RULE_STRING
                    {
                    lv_description_15_0=(Token)match(input,RULE_STRING,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_description_15_0, grammarAccess.getAliasAccess().getDescriptionSTRINGTerminalRuleCall_7_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getAliasRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"description",
                      						lv_description_15_0,
                      						"org.eclipse.xtext.common.Terminals.STRING");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_16, grammarAccess.getAliasAccess().getSemicolonKeyword_8());
              		
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
    // $ANTLR end "ruleAlias"


    // $ANTLR start "entryRulePort"
    // InternalSADL.g:1131:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalSADL.g:1131:45: (iv_rulePort= rulePort EOF )
            // InternalSADL.g:1132:2: iv_rulePort= rulePort EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPortRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePort=rulePort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePort; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalSADL.g:1138:1: rulePort returns [EObject current=null] : (this_TopicPort_0= ruleTopicPort | this_InterfacePort_1= ruleInterfacePort ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        EObject this_TopicPort_0 = null;

        EObject this_InterfacePort_1 = null;



        	enterRule();

        try {
            // InternalSADL.g:1144:2: ( (this_TopicPort_0= ruleTopicPort | this_InterfacePort_1= ruleInterfacePort ) )
            // InternalSADL.g:1145:2: (this_TopicPort_0= ruleTopicPort | this_InterfacePort_1= ruleInterfacePort )
            {
            // InternalSADL.g:1145:2: (this_TopicPort_0= ruleTopicPort | this_InterfacePort_1= ruleInterfacePort )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==RULE_ID) ) {
                    int LA24_2 = input.LA(3);

                    if ( ((LA24_2>=36 && LA24_2<=37)) ) {
                        alt24=1;
                    }
                    else if ( ((LA24_2>=38 && LA24_2<=39)) ) {
                        alt24=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalSADL.g:1146:3: this_TopicPort_0= ruleTopicPort
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPortAccess().getTopicPortParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TopicPort_0=ruleTopicPort();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TopicPort_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSADL.g:1155:3: this_InterfacePort_1= ruleInterfacePort
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPortAccess().getInterfacePortParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_InterfacePort_1=ruleInterfacePort();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_InterfacePort_1;
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
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleEnumerator"
    // InternalSADL.g:1167:1: entryRuleEnumerator returns [EObject current=null] : iv_ruleEnumerator= ruleEnumerator EOF ;
    public final EObject entryRuleEnumerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerator = null;


        try {
            // InternalSADL.g:1167:51: (iv_ruleEnumerator= ruleEnumerator EOF )
            // InternalSADL.g:1168:2: iv_ruleEnumerator= ruleEnumerator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumeratorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumerator=ruleEnumerator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumerator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumerator"


    // $ANTLR start "ruleEnumerator"
    // InternalSADL.g:1174:1: ruleEnumerator returns [EObject current=null] : ( (otherlv_0= 'value' | ( (lv_deprecated_1_0= 'deprecated' ) ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= RULE_INT ) ) )? ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= ';' ) ;
    public final EObject ruleEnumerator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_deprecated_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalSADL.g:1180:2: ( ( (otherlv_0= 'value' | ( (lv_deprecated_1_0= 'deprecated' ) ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= RULE_INT ) ) )? ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= ';' ) )
            // InternalSADL.g:1181:2: ( (otherlv_0= 'value' | ( (lv_deprecated_1_0= 'deprecated' ) ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= RULE_INT ) ) )? ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= ';' )
            {
            // InternalSADL.g:1181:2: ( (otherlv_0= 'value' | ( (lv_deprecated_1_0= 'deprecated' ) ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= RULE_INT ) ) )? ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= ';' )
            // InternalSADL.g:1182:3: (otherlv_0= 'value' | ( (lv_deprecated_1_0= 'deprecated' ) ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= RULE_INT ) ) )? ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= ';'
            {
            // InternalSADL.g:1182:3: (otherlv_0= 'value' | ( (lv_deprecated_1_0= 'deprecated' ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==30) ) {
                alt25=1;
            }
            else if ( (LA25_0==31) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalSADL.g:1183:4: otherlv_0= 'value'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getEnumeratorAccess().getValueKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSADL.g:1188:4: ( (lv_deprecated_1_0= 'deprecated' ) )
                    {
                    // InternalSADL.g:1188:4: ( (lv_deprecated_1_0= 'deprecated' ) )
                    // InternalSADL.g:1189:5: (lv_deprecated_1_0= 'deprecated' )
                    {
                    // InternalSADL.g:1189:5: (lv_deprecated_1_0= 'deprecated' )
                    // InternalSADL.g:1190:6: lv_deprecated_1_0= 'deprecated'
                    {
                    lv_deprecated_1_0=(Token)match(input,31,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_deprecated_1_0, grammarAccess.getEnumeratorAccess().getDeprecatedDeprecatedKeyword_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEnumeratorRule());
                      						}
                      						setWithLastConsumed(current, "deprecated", lv_deprecated_1_0 != null, "deprecated");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSADL.g:1203:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSADL.g:1204:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSADL.g:1204:4: (lv_name_2_0= RULE_ID )
            // InternalSADL.g:1205:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getEnumeratorAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEnumeratorRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalSADL.g:1221:3: (otherlv_3= '=' ( (lv_value_4_0= RULE_INT ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSADL.g:1222:4: otherlv_3= '=' ( (lv_value_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getEnumeratorAccess().getEqualsSignKeyword_2_0());
                      			
                    }
                    // InternalSADL.g:1226:4: ( (lv_value_4_0= RULE_INT ) )
                    // InternalSADL.g:1227:5: (lv_value_4_0= RULE_INT )
                    {
                    // InternalSADL.g:1227:5: (lv_value_4_0= RULE_INT )
                    // InternalSADL.g:1228:6: lv_value_4_0= RULE_INT
                    {
                    lv_value_4_0=(Token)match(input,RULE_INT,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_4_0, grammarAccess.getEnumeratorAccess().getValueINTTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEnumeratorRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_4_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSADL.g:1245:3: ( (lv_description_5_0= RULE_STRING ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_STRING) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSADL.g:1246:4: (lv_description_5_0= RULE_STRING )
                    {
                    // InternalSADL.g:1246:4: (lv_description_5_0= RULE_STRING )
                    // InternalSADL.g:1247:5: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_description_5_0, grammarAccess.getEnumeratorAccess().getDescriptionSTRINGTerminalRuleCall_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getEnumeratorRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"description",
                      						lv_description_5_0,
                      						"org.eclipse.xtext.common.Terminals.STRING");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getEnumeratorAccess().getSemicolonKeyword_4());
              		
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
    // $ANTLR end "ruleEnumerator"


    // $ANTLR start "entryRuleAttribute"
    // InternalSADL.g:1271:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalSADL.g:1271:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalSADL.g:1272:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalSADL.g:1278:1: ruleAttribute returns [EObject current=null] : ( (otherlv_0= 'attribute' | ( (lv_deprecated_1_0= 'deprecated' ) ) ) ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= '[' ( (lv_unbounded_5_0= '*' ) ) ) | ( (lv_lowerbound_6_0= RULE_INT ) ) | ( ( ( (lv_lowerbound_7_0= RULE_INT ) ) otherlv_8= '..' ( ( (lv_unbounded_9_0= '*' ) ) | ( (lv_upperbound_10_0= RULE_INT ) ) ) ) otherlv_11= ']' ) )? (otherlv_12= '(' ( ( ruleQualifiedName ) ) otherlv_14= ')' )? ( (lv_description_15_0= RULE_STRING ) )? otherlv_16= ';' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_deprecated_1_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_unbounded_5_0=null;
        Token lv_lowerbound_6_0=null;
        Token lv_lowerbound_7_0=null;
        Token otherlv_8=null;
        Token lv_unbounded_9_0=null;
        Token lv_upperbound_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_description_15_0=null;
        Token otherlv_16=null;


        	enterRule();

        try {
            // InternalSADL.g:1284:2: ( ( (otherlv_0= 'attribute' | ( (lv_deprecated_1_0= 'deprecated' ) ) ) ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= '[' ( (lv_unbounded_5_0= '*' ) ) ) | ( (lv_lowerbound_6_0= RULE_INT ) ) | ( ( ( (lv_lowerbound_7_0= RULE_INT ) ) otherlv_8= '..' ( ( (lv_unbounded_9_0= '*' ) ) | ( (lv_upperbound_10_0= RULE_INT ) ) ) ) otherlv_11= ']' ) )? (otherlv_12= '(' ( ( ruleQualifiedName ) ) otherlv_14= ')' )? ( (lv_description_15_0= RULE_STRING ) )? otherlv_16= ';' ) )
            // InternalSADL.g:1285:2: ( (otherlv_0= 'attribute' | ( (lv_deprecated_1_0= 'deprecated' ) ) ) ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= '[' ( (lv_unbounded_5_0= '*' ) ) ) | ( (lv_lowerbound_6_0= RULE_INT ) ) | ( ( ( (lv_lowerbound_7_0= RULE_INT ) ) otherlv_8= '..' ( ( (lv_unbounded_9_0= '*' ) ) | ( (lv_upperbound_10_0= RULE_INT ) ) ) ) otherlv_11= ']' ) )? (otherlv_12= '(' ( ( ruleQualifiedName ) ) otherlv_14= ')' )? ( (lv_description_15_0= RULE_STRING ) )? otherlv_16= ';' )
            {
            // InternalSADL.g:1285:2: ( (otherlv_0= 'attribute' | ( (lv_deprecated_1_0= 'deprecated' ) ) ) ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= '[' ( (lv_unbounded_5_0= '*' ) ) ) | ( (lv_lowerbound_6_0= RULE_INT ) ) | ( ( ( (lv_lowerbound_7_0= RULE_INT ) ) otherlv_8= '..' ( ( (lv_unbounded_9_0= '*' ) ) | ( (lv_upperbound_10_0= RULE_INT ) ) ) ) otherlv_11= ']' ) )? (otherlv_12= '(' ( ( ruleQualifiedName ) ) otherlv_14= ')' )? ( (lv_description_15_0= RULE_STRING ) )? otherlv_16= ';' )
            // InternalSADL.g:1286:3: (otherlv_0= 'attribute' | ( (lv_deprecated_1_0= 'deprecated' ) ) ) ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= '[' ( (lv_unbounded_5_0= '*' ) ) ) | ( (lv_lowerbound_6_0= RULE_INT ) ) | ( ( ( (lv_lowerbound_7_0= RULE_INT ) ) otherlv_8= '..' ( ( (lv_unbounded_9_0= '*' ) ) | ( (lv_upperbound_10_0= RULE_INT ) ) ) ) otherlv_11= ']' ) )? (otherlv_12= '(' ( ( ruleQualifiedName ) ) otherlv_14= ')' )? ( (lv_description_15_0= RULE_STRING ) )? otherlv_16= ';'
            {
            // InternalSADL.g:1286:3: (otherlv_0= 'attribute' | ( (lv_deprecated_1_0= 'deprecated' ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==33) ) {
                alt28=1;
            }
            else if ( (LA28_0==31) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalSADL.g:1287:4: otherlv_0= 'attribute'
                    {
                    otherlv_0=(Token)match(input,33,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSADL.g:1292:4: ( (lv_deprecated_1_0= 'deprecated' ) )
                    {
                    // InternalSADL.g:1292:4: ( (lv_deprecated_1_0= 'deprecated' ) )
                    // InternalSADL.g:1293:5: (lv_deprecated_1_0= 'deprecated' )
                    {
                    // InternalSADL.g:1293:5: (lv_deprecated_1_0= 'deprecated' )
                    // InternalSADL.g:1294:6: lv_deprecated_1_0= 'deprecated'
                    {
                    lv_deprecated_1_0=(Token)match(input,31,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_deprecated_1_0, grammarAccess.getAttributeAccess().getDeprecatedDeprecatedKeyword_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAttributeRule());
                      						}
                      						setWithLastConsumed(current, "deprecated", lv_deprecated_1_0 != null, "deprecated");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSADL.g:1307:3: ( ( ruleQualifiedName ) )
            // InternalSADL.g:1308:4: ( ruleQualifiedName )
            {
            // InternalSADL.g:1308:4: ( ruleQualifiedName )
            // InternalSADL.g:1309:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAttributeRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSADL.g:1323:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalSADL.g:1324:4: (lv_name_3_0= RULE_ID )
            {
            // InternalSADL.g:1324:4: (lv_name_3_0= RULE_ID )
            // InternalSADL.g:1325:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_3_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAttributeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_3_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalSADL.g:1341:3: ( (otherlv_4= '[' ( (lv_unbounded_5_0= '*' ) ) ) | ( (lv_lowerbound_6_0= RULE_INT ) ) | ( ( ( (lv_lowerbound_7_0= RULE_INT ) ) otherlv_8= '..' ( ( (lv_unbounded_9_0= '*' ) ) | ( (lv_upperbound_10_0= RULE_INT ) ) ) ) otherlv_11= ']' ) )?
            int alt30=4;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==24) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_INT) ) {
                int LA30_2 = input.LA(2);

                if ( (LA30_2==34) ) {
                    alt30=3;
                }
                else if ( (LA30_2==RULE_STRING||LA30_2==17||LA30_2==27) ) {
                    alt30=2;
                }
            }
            switch (alt30) {
                case 1 :
                    // InternalSADL.g:1342:4: (otherlv_4= '[' ( (lv_unbounded_5_0= '*' ) ) )
                    {
                    // InternalSADL.g:1342:4: (otherlv_4= '[' ( (lv_unbounded_5_0= '*' ) ) )
                    // InternalSADL.g:1343:5: otherlv_4= '[' ( (lv_unbounded_5_0= '*' ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_3_0_0());
                      				
                    }
                    // InternalSADL.g:1347:5: ( (lv_unbounded_5_0= '*' ) )
                    // InternalSADL.g:1348:6: (lv_unbounded_5_0= '*' )
                    {
                    // InternalSADL.g:1348:6: (lv_unbounded_5_0= '*' )
                    // InternalSADL.g:1349:7: lv_unbounded_5_0= '*'
                    {
                    lv_unbounded_5_0=(Token)match(input,25,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_unbounded_5_0, grammarAccess.getAttributeAccess().getUnboundedAsteriskKeyword_3_0_1_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getAttributeRule());
                      							}
                      							setWithLastConsumed(current, "unbounded", lv_unbounded_5_0 != null, "*");
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSADL.g:1363:4: ( (lv_lowerbound_6_0= RULE_INT ) )
                    {
                    // InternalSADL.g:1363:4: ( (lv_lowerbound_6_0= RULE_INT ) )
                    // InternalSADL.g:1364:5: (lv_lowerbound_6_0= RULE_INT )
                    {
                    // InternalSADL.g:1364:5: (lv_lowerbound_6_0= RULE_INT )
                    // InternalSADL.g:1365:6: lv_lowerbound_6_0= RULE_INT
                    {
                    lv_lowerbound_6_0=(Token)match(input,RULE_INT,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_lowerbound_6_0, grammarAccess.getAttributeAccess().getLowerboundINTTerminalRuleCall_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAttributeRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"lowerbound",
                      							lv_lowerbound_6_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSADL.g:1382:4: ( ( ( (lv_lowerbound_7_0= RULE_INT ) ) otherlv_8= '..' ( ( (lv_unbounded_9_0= '*' ) ) | ( (lv_upperbound_10_0= RULE_INT ) ) ) ) otherlv_11= ']' )
                    {
                    // InternalSADL.g:1382:4: ( ( ( (lv_lowerbound_7_0= RULE_INT ) ) otherlv_8= '..' ( ( (lv_unbounded_9_0= '*' ) ) | ( (lv_upperbound_10_0= RULE_INT ) ) ) ) otherlv_11= ']' )
                    // InternalSADL.g:1383:5: ( ( (lv_lowerbound_7_0= RULE_INT ) ) otherlv_8= '..' ( ( (lv_unbounded_9_0= '*' ) ) | ( (lv_upperbound_10_0= RULE_INT ) ) ) ) otherlv_11= ']'
                    {
                    // InternalSADL.g:1383:5: ( ( (lv_lowerbound_7_0= RULE_INT ) ) otherlv_8= '..' ( ( (lv_unbounded_9_0= '*' ) ) | ( (lv_upperbound_10_0= RULE_INT ) ) ) )
                    // InternalSADL.g:1384:6: ( (lv_lowerbound_7_0= RULE_INT ) ) otherlv_8= '..' ( ( (lv_unbounded_9_0= '*' ) ) | ( (lv_upperbound_10_0= RULE_INT ) ) )
                    {
                    // InternalSADL.g:1384:6: ( (lv_lowerbound_7_0= RULE_INT ) )
                    // InternalSADL.g:1385:7: (lv_lowerbound_7_0= RULE_INT )
                    {
                    // InternalSADL.g:1385:7: (lv_lowerbound_7_0= RULE_INT )
                    // InternalSADL.g:1386:8: lv_lowerbound_7_0= RULE_INT
                    {
                    lv_lowerbound_7_0=(Token)match(input,RULE_INT,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								newLeafNode(lv_lowerbound_7_0, grammarAccess.getAttributeAccess().getLowerboundINTTerminalRuleCall_3_2_0_0_0());
                      							
                    }
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElement(grammarAccess.getAttributeRule());
                      								}
                      								setWithLastConsumed(
                      									current,
                      									"lowerbound",
                      									lv_lowerbound_7_0,
                      									"org.eclipse.xtext.common.Terminals.INT");
                      							
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,34,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getFullStopFullStopKeyword_3_2_0_1());
                      					
                    }
                    // InternalSADL.g:1406:6: ( ( (lv_unbounded_9_0= '*' ) ) | ( (lv_upperbound_10_0= RULE_INT ) ) )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==25) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==RULE_INT) ) {
                        alt29=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalSADL.g:1407:7: ( (lv_unbounded_9_0= '*' ) )
                            {
                            // InternalSADL.g:1407:7: ( (lv_unbounded_9_0= '*' ) )
                            // InternalSADL.g:1408:8: (lv_unbounded_9_0= '*' )
                            {
                            // InternalSADL.g:1408:8: (lv_unbounded_9_0= '*' )
                            // InternalSADL.g:1409:9: lv_unbounded_9_0= '*'
                            {
                            lv_unbounded_9_0=(Token)match(input,25,FOLLOW_28); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              									newLeafNode(lv_unbounded_9_0, grammarAccess.getAttributeAccess().getUnboundedAsteriskKeyword_3_2_0_2_0_0());
                              								
                            }
                            if ( state.backtracking==0 ) {

                              									if (current==null) {
                              										current = createModelElement(grammarAccess.getAttributeRule());
                              									}
                              									setWithLastConsumed(current, "unbounded", lv_unbounded_9_0 != null, "*");
                              								
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSADL.g:1422:7: ( (lv_upperbound_10_0= RULE_INT ) )
                            {
                            // InternalSADL.g:1422:7: ( (lv_upperbound_10_0= RULE_INT ) )
                            // InternalSADL.g:1423:8: (lv_upperbound_10_0= RULE_INT )
                            {
                            // InternalSADL.g:1423:8: (lv_upperbound_10_0= RULE_INT )
                            // InternalSADL.g:1424:9: lv_upperbound_10_0= RULE_INT
                            {
                            lv_upperbound_10_0=(Token)match(input,RULE_INT,FOLLOW_28); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              									newLeafNode(lv_upperbound_10_0, grammarAccess.getAttributeAccess().getUpperboundINTTerminalRuleCall_3_2_0_2_1_0());
                              								
                            }
                            if ( state.backtracking==0 ) {

                              									if (current==null) {
                              										current = createModelElement(grammarAccess.getAttributeRule());
                              									}
                              									setWithLastConsumed(
                              										current,
                              										"upperbound",
                              										lv_upperbound_10_0,
                              										"org.eclipse.xtext.common.Terminals.INT");
                              								
                            }

                            }


                            }


                            }
                            break;

                    }


                    }

                    otherlv_11=(Token)match(input,26,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_3_2_1());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSADL.g:1448:3: (otherlv_12= '(' ( ( ruleQualifiedName ) ) otherlv_14= ')' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==27) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSADL.g:1449:4: otherlv_12= '(' ( ( ruleQualifiedName ) ) otherlv_14= ')'
                    {
                    otherlv_12=(Token)match(input,27,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_4_0());
                      			
                    }
                    // InternalSADL.g:1453:4: ( ( ruleQualifiedName ) )
                    // InternalSADL.g:1454:5: ( ruleQualifiedName )
                    {
                    // InternalSADL.g:1454:5: ( ruleQualifiedName )
                    // InternalSADL.g:1455:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAttributeRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAttributeAccess().getUnitUnitCrossReference_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_29);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,28,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getAttributeAccess().getRightParenthesisKeyword_4_2());
                      			
                    }

                    }
                    break;

            }

            // InternalSADL.g:1474:3: ( (lv_description_15_0= RULE_STRING ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRING) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSADL.g:1475:4: (lv_description_15_0= RULE_STRING )
                    {
                    // InternalSADL.g:1475:4: (lv_description_15_0= RULE_STRING )
                    // InternalSADL.g:1476:5: lv_description_15_0= RULE_STRING
                    {
                    lv_description_15_0=(Token)match(input,RULE_STRING,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_description_15_0, grammarAccess.getAttributeAccess().getDescriptionSTRINGTerminalRuleCall_5_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getAttributeRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"description",
                      						lv_description_15_0,
                      						"org.eclipse.xtext.common.Terminals.STRING");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_16, grammarAccess.getAttributeAccess().getSemicolonKeyword_6());
              		
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleTopicPort"
    // InternalSADL.g:1500:1: entryRuleTopicPort returns [EObject current=null] : iv_ruleTopicPort= ruleTopicPort EOF ;
    public final EObject entryRuleTopicPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopicPort = null;


        try {
            // InternalSADL.g:1500:50: (iv_ruleTopicPort= ruleTopicPort EOF )
            // InternalSADL.g:1501:2: iv_ruleTopicPort= ruleTopicPort EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTopicPortRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTopicPort=ruleTopicPort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTopicPort; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTopicPort"


    // $ANTLR start "ruleTopicPort"
    // InternalSADL.g:1507:1: ruleTopicPort returns [EObject current=null] : (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_conjugated_2_0= 'receives' ) ) | otherlv_3= 'sends' ) ( ( ruleQualifiedName ) ) otherlv_5= ';' ) ;
    public final EObject ruleTopicPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_conjugated_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalSADL.g:1513:2: ( (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_conjugated_2_0= 'receives' ) ) | otherlv_3= 'sends' ) ( ( ruleQualifiedName ) ) otherlv_5= ';' ) )
            // InternalSADL.g:1514:2: (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_conjugated_2_0= 'receives' ) ) | otherlv_3= 'sends' ) ( ( ruleQualifiedName ) ) otherlv_5= ';' )
            {
            // InternalSADL.g:1514:2: (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_conjugated_2_0= 'receives' ) ) | otherlv_3= 'sends' ) ( ( ruleQualifiedName ) ) otherlv_5= ';' )
            // InternalSADL.g:1515:3: otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_conjugated_2_0= 'receives' ) ) | otherlv_3= 'sends' ) ( ( ruleQualifiedName ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTopicPortAccess().getPortKeyword_0());
              		
            }
            // InternalSADL.g:1519:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSADL.g:1520:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSADL.g:1520:4: (lv_name_1_0= RULE_ID )
            // InternalSADL.g:1521:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getTopicPortAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTopicPortRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalSADL.g:1537:3: ( ( (lv_conjugated_2_0= 'receives' ) ) | otherlv_3= 'sends' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==36) ) {
                alt33=1;
            }
            else if ( (LA33_0==37) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalSADL.g:1538:4: ( (lv_conjugated_2_0= 'receives' ) )
                    {
                    // InternalSADL.g:1538:4: ( (lv_conjugated_2_0= 'receives' ) )
                    // InternalSADL.g:1539:5: (lv_conjugated_2_0= 'receives' )
                    {
                    // InternalSADL.g:1539:5: (lv_conjugated_2_0= 'receives' )
                    // InternalSADL.g:1540:6: lv_conjugated_2_0= 'receives'
                    {
                    lv_conjugated_2_0=(Token)match(input,36,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_conjugated_2_0, grammarAccess.getTopicPortAccess().getConjugatedReceivesKeyword_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTopicPortRule());
                      						}
                      						setWithLastConsumed(current, "conjugated", lv_conjugated_2_0 != null, "receives");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSADL.g:1553:4: otherlv_3= 'sends'
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getTopicPortAccess().getSendsKeyword_2_1());
                      			
                    }

                    }
                    break;

            }

            // InternalSADL.g:1558:3: ( ( ruleQualifiedName ) )
            // InternalSADL.g:1559:4: ( ruleQualifiedName )
            {
            // InternalSADL.g:1559:4: ( ruleQualifiedName )
            // InternalSADL.g:1560:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTopicPortRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTopicPortAccess().getTypeTopicCrossReference_3_0());
              				
            }
            pushFollow(FOLLOW_10);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTopicPortAccess().getSemicolonKeyword_4());
              		
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
    // $ANTLR end "ruleTopicPort"


    // $ANTLR start "entryRuleInterfacePort"
    // InternalSADL.g:1582:1: entryRuleInterfacePort returns [EObject current=null] : iv_ruleInterfacePort= ruleInterfacePort EOF ;
    public final EObject entryRuleInterfacePort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfacePort = null;


        try {
            // InternalSADL.g:1582:54: (iv_ruleInterfacePort= ruleInterfacePort EOF )
            // InternalSADL.g:1583:2: iv_ruleInterfacePort= ruleInterfacePort EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfacePortRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInterfacePort=ruleInterfacePort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfacePort; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInterfacePort"


    // $ANTLR start "ruleInterfacePort"
    // InternalSADL.g:1589:1: ruleInterfacePort returns [EObject current=null] : (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_conjugated_2_0= 'requires' ) ) | otherlv_3= 'provides' ) ( ( ruleQualifiedName ) ) otherlv_5= ';' ) ;
    public final EObject ruleInterfacePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_conjugated_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalSADL.g:1595:2: ( (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_conjugated_2_0= 'requires' ) ) | otherlv_3= 'provides' ) ( ( ruleQualifiedName ) ) otherlv_5= ';' ) )
            // InternalSADL.g:1596:2: (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_conjugated_2_0= 'requires' ) ) | otherlv_3= 'provides' ) ( ( ruleQualifiedName ) ) otherlv_5= ';' )
            {
            // InternalSADL.g:1596:2: (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_conjugated_2_0= 'requires' ) ) | otherlv_3= 'provides' ) ( ( ruleQualifiedName ) ) otherlv_5= ';' )
            // InternalSADL.g:1597:3: otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_conjugated_2_0= 'requires' ) ) | otherlv_3= 'provides' ) ( ( ruleQualifiedName ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInterfacePortAccess().getPortKeyword_0());
              		
            }
            // InternalSADL.g:1601:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSADL.g:1602:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSADL.g:1602:4: (lv_name_1_0= RULE_ID )
            // InternalSADL.g:1603:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getInterfacePortAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInterfacePortRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalSADL.g:1619:3: ( ( (lv_conjugated_2_0= 'requires' ) ) | otherlv_3= 'provides' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==38) ) {
                alt34=1;
            }
            else if ( (LA34_0==39) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalSADL.g:1620:4: ( (lv_conjugated_2_0= 'requires' ) )
                    {
                    // InternalSADL.g:1620:4: ( (lv_conjugated_2_0= 'requires' ) )
                    // InternalSADL.g:1621:5: (lv_conjugated_2_0= 'requires' )
                    {
                    // InternalSADL.g:1621:5: (lv_conjugated_2_0= 'requires' )
                    // InternalSADL.g:1622:6: lv_conjugated_2_0= 'requires'
                    {
                    lv_conjugated_2_0=(Token)match(input,38,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_conjugated_2_0, grammarAccess.getInterfacePortAccess().getConjugatedRequiresKeyword_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getInterfacePortRule());
                      						}
                      						setWithLastConsumed(current, "conjugated", lv_conjugated_2_0 != null, "requires");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSADL.g:1635:4: otherlv_3= 'provides'
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getInterfacePortAccess().getProvidesKeyword_2_1());
                      			
                    }

                    }
                    break;

            }

            // InternalSADL.g:1640:3: ( ( ruleQualifiedName ) )
            // InternalSADL.g:1641:4: ( ruleQualifiedName )
            {
            // InternalSADL.g:1641:4: ( ruleQualifiedName )
            // InternalSADL.g:1642:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInterfacePortRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInterfacePortAccess().getTypeInterfaceCrossReference_3_0());
              				
            }
            pushFollow(FOLLOW_10);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getInterfacePortAccess().getSemicolonKeyword_4());
              		
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
    // $ANTLR end "ruleInterfacePort"


    // $ANTLR start "entryRulePlatform"
    // InternalSADL.g:1664:1: entryRulePlatform returns [EObject current=null] : iv_rulePlatform= rulePlatform EOF ;
    public final EObject entryRulePlatform() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatform = null;


        try {
            // InternalSADL.g:1664:49: (iv_rulePlatform= rulePlatform EOF )
            // InternalSADL.g:1665:2: iv_rulePlatform= rulePlatform EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlatformRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePlatform=rulePlatform();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlatform; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePlatform"


    // $ANTLR start "rulePlatform"
    // InternalSADL.g:1671:1: rulePlatform returns [EObject current=null] : (otherlv_0= 'platform' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( (lv_processors_3_0= ruleProcessor ) ) | ( (lv_links_4_0= ruleLink ) ) )* otherlv_5= 'end' ) ;
    public final EObject rulePlatform() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_5=null;
        EObject lv_processors_3_0 = null;

        EObject lv_links_4_0 = null;



        	enterRule();

        try {
            // InternalSADL.g:1677:2: ( (otherlv_0= 'platform' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( (lv_processors_3_0= ruleProcessor ) ) | ( (lv_links_4_0= ruleLink ) ) )* otherlv_5= 'end' ) )
            // InternalSADL.g:1678:2: (otherlv_0= 'platform' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( (lv_processors_3_0= ruleProcessor ) ) | ( (lv_links_4_0= ruleLink ) ) )* otherlv_5= 'end' )
            {
            // InternalSADL.g:1678:2: (otherlv_0= 'platform' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( (lv_processors_3_0= ruleProcessor ) ) | ( (lv_links_4_0= ruleLink ) ) )* otherlv_5= 'end' )
            // InternalSADL.g:1679:3: otherlv_0= 'platform' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( (lv_processors_3_0= ruleProcessor ) ) | ( (lv_links_4_0= ruleLink ) ) )* otherlv_5= 'end'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPlatformAccess().getPlatformKeyword_0());
              		
            }
            // InternalSADL.g:1683:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSADL.g:1684:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSADL.g:1684:4: (lv_name_1_0= RULE_ID )
            // InternalSADL.g:1685:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getPlatformAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPlatformRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalSADL.g:1701:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_STRING) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSADL.g:1702:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalSADL.g:1702:4: (lv_description_2_0= RULE_STRING )
                    // InternalSADL.g:1703:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_description_2_0, grammarAccess.getPlatformAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPlatformRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"description",
                      						lv_description_2_0,
                      						"org.eclipse.xtext.common.Terminals.STRING");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSADL.g:1719:3: ( ( (lv_processors_3_0= ruleProcessor ) ) | ( (lv_links_4_0= ruleLink ) ) )*
            loop36:
            do {
                int alt36=3;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==41) ) {
                    alt36=1;
                }
                else if ( (LA36_0==42) ) {
                    alt36=2;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalSADL.g:1720:4: ( (lv_processors_3_0= ruleProcessor ) )
            	    {
            	    // InternalSADL.g:1720:4: ( (lv_processors_3_0= ruleProcessor ) )
            	    // InternalSADL.g:1721:5: (lv_processors_3_0= ruleProcessor )
            	    {
            	    // InternalSADL.g:1721:5: (lv_processors_3_0= ruleProcessor )
            	    // InternalSADL.g:1722:6: lv_processors_3_0= ruleProcessor
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPlatformAccess().getProcessorsProcessorParserRuleCall_3_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_39);
            	    lv_processors_3_0=ruleProcessor();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPlatformRule());
            	      						}
            	      						add(
            	      							current,
            	      							"processors",
            	      							lv_processors_3_0,
            	      							"com.leonardo.lsaf.sadl.SADL.Processor");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSADL.g:1740:4: ( (lv_links_4_0= ruleLink ) )
            	    {
            	    // InternalSADL.g:1740:4: ( (lv_links_4_0= ruleLink ) )
            	    // InternalSADL.g:1741:5: (lv_links_4_0= ruleLink )
            	    {
            	    // InternalSADL.g:1741:5: (lv_links_4_0= ruleLink )
            	    // InternalSADL.g:1742:6: lv_links_4_0= ruleLink
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPlatformAccess().getLinksLinkParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_39);
            	    lv_links_4_0=ruleLink();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPlatformRule());
            	      						}
            	      						add(
            	      							current,
            	      							"links",
            	      							lv_links_4_0,
            	      							"com.leonardo.lsaf.sadl.SADL.Link");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getPlatformAccess().getEndKeyword_4());
              		
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
    // $ANTLR end "rulePlatform"


    // $ANTLR start "entryRuleProcessor"
    // InternalSADL.g:1768:1: entryRuleProcessor returns [EObject current=null] : iv_ruleProcessor= ruleProcessor EOF ;
    public final EObject entryRuleProcessor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessor = null;


        try {
            // InternalSADL.g:1768:50: (iv_ruleProcessor= ruleProcessor EOF )
            // InternalSADL.g:1769:2: iv_ruleProcessor= ruleProcessor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcessorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProcessor=ruleProcessor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProcessor; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProcessor"


    // $ANTLR start "ruleProcessor"
    // InternalSADL.g:1775:1: ruleProcessor returns [EObject current=null] : (otherlv_0= 'processor' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) ;
    public final EObject ruleProcessor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSADL.g:1781:2: ( (otherlv_0= 'processor' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) )
            // InternalSADL.g:1782:2: (otherlv_0= 'processor' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            {
            // InternalSADL.g:1782:2: (otherlv_0= 'processor' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            // InternalSADL.g:1783:3: otherlv_0= 'processor' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getProcessorAccess().getProcessorKeyword_0());
              		
            }
            // InternalSADL.g:1787:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSADL.g:1788:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSADL.g:1788:4: (lv_name_1_0= RULE_ID )
            // InternalSADL.g:1789:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getProcessorAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getProcessorRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalSADL.g:1805:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_STRING) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSADL.g:1806:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalSADL.g:1806:4: (lv_description_2_0= RULE_STRING )
                    // InternalSADL.g:1807:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_description_2_0, grammarAccess.getProcessorAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getProcessorRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"description",
                      						lv_description_2_0,
                      						"org.eclipse.xtext.common.Terminals.STRING");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getProcessorAccess().getSemicolonKeyword_3());
              		
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
    // $ANTLR end "ruleProcessor"


    // $ANTLR start "entryRuleLink"
    // InternalSADL.g:1831:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalSADL.g:1831:45: (iv_ruleLink= ruleLink EOF )
            // InternalSADL.g:1832:2: iv_ruleLink= ruleLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLinkRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLink=ruleLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLink; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalSADL.g:1838:1: ruleLink returns [EObject current=null] : (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'connects' otherlv_4= '(' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= ')' otherlv_9= ';' )? (otherlv_10= 'over' ( (otherlv_11= RULE_ID ) ) (otherlv_12= '(' ( (lv_value_13_0= rulePropertyValue ) ) (otherlv_14= ',' ( (lv_value_15_0= rulePropertyValue ) ) )* otherlv_16= ')' )? otherlv_17= ';' )? otherlv_18= 'end' ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_value_13_0 = null;

        EObject lv_value_15_0 = null;



        	enterRule();

        try {
            // InternalSADL.g:1844:2: ( (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'connects' otherlv_4= '(' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= ')' otherlv_9= ';' )? (otherlv_10= 'over' ( (otherlv_11= RULE_ID ) ) (otherlv_12= '(' ( (lv_value_13_0= rulePropertyValue ) ) (otherlv_14= ',' ( (lv_value_15_0= rulePropertyValue ) ) )* otherlv_16= ')' )? otherlv_17= ';' )? otherlv_18= 'end' ) )
            // InternalSADL.g:1845:2: (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'connects' otherlv_4= '(' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= ')' otherlv_9= ';' )? (otherlv_10= 'over' ( (otherlv_11= RULE_ID ) ) (otherlv_12= '(' ( (lv_value_13_0= rulePropertyValue ) ) (otherlv_14= ',' ( (lv_value_15_0= rulePropertyValue ) ) )* otherlv_16= ')' )? otherlv_17= ';' )? otherlv_18= 'end' )
            {
            // InternalSADL.g:1845:2: (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'connects' otherlv_4= '(' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= ')' otherlv_9= ';' )? (otherlv_10= 'over' ( (otherlv_11= RULE_ID ) ) (otherlv_12= '(' ( (lv_value_13_0= rulePropertyValue ) ) (otherlv_14= ',' ( (lv_value_15_0= rulePropertyValue ) ) )* otherlv_16= ')' )? otherlv_17= ';' )? otherlv_18= 'end' )
            // InternalSADL.g:1846:3: otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'connects' otherlv_4= '(' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= ')' otherlv_9= ';' )? (otherlv_10= 'over' ( (otherlv_11= RULE_ID ) ) (otherlv_12= '(' ( (lv_value_13_0= rulePropertyValue ) ) (otherlv_14= ',' ( (lv_value_15_0= rulePropertyValue ) ) )* otherlv_16= ')' )? otherlv_17= ';' )? otherlv_18= 'end'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
              		
            }
            // InternalSADL.g:1850:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSADL.g:1851:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSADL.g:1851:4: (lv_name_1_0= RULE_ID )
            // InternalSADL.g:1852:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getLinkRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalSADL.g:1868:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_STRING) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSADL.g:1869:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalSADL.g:1869:4: (lv_description_2_0= RULE_STRING )
                    // InternalSADL.g:1870:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_description_2_0, grammarAccess.getLinkAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getLinkRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"description",
                      						lv_description_2_0,
                      						"org.eclipse.xtext.common.Terminals.STRING");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSADL.g:1886:3: (otherlv_3= 'connects' otherlv_4= '(' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= ')' otherlv_9= ';' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==43) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSADL.g:1887:4: otherlv_3= 'connects' otherlv_4= '(' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= ')' otherlv_9= ';'
                    {
                    otherlv_3=(Token)match(input,43,FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getConnectsKeyword_3_0());
                      			
                    }
                    otherlv_4=(Token)match(input,27,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getLeftParenthesisKeyword_3_1());
                      			
                    }
                    // InternalSADL.g:1895:4: ( ( ruleQualifiedName ) )
                    // InternalSADL.g:1896:5: ( ruleQualifiedName )
                    {
                    // InternalSADL.g:1896:5: ( ruleQualifiedName )
                    // InternalSADL.g:1897:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getLinkRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLinkAccess().getProcessorsProcessorCrossReference_3_2_0());
                      					
                    }
                    pushFollow(FOLLOW_43);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSADL.g:1911:4: (otherlv_6= ',' ( ( ruleQualifiedName ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==44) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalSADL.g:1912:5: otherlv_6= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,44,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getCommaKeyword_3_3_0());
                    	      				
                    	    }
                    	    // InternalSADL.g:1916:5: ( ( ruleQualifiedName ) )
                    	    // InternalSADL.g:1917:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalSADL.g:1917:6: ( ruleQualifiedName )
                    	    // InternalSADL.g:1918:7: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getLinkRule());
                    	      							}
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getLinkAccess().getProcessorsProcessorCrossReference_3_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_43);
                    	    ruleQualifiedName();

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
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,28,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getLinkAccess().getRightParenthesisKeyword_3_4());
                      			
                    }
                    otherlv_9=(Token)match(input,17,FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getLinkAccess().getSemicolonKeyword_3_5());
                      			
                    }

                    }
                    break;

            }

            // InternalSADL.g:1942:3: (otherlv_10= 'over' ( (otherlv_11= RULE_ID ) ) (otherlv_12= '(' ( (lv_value_13_0= rulePropertyValue ) ) (otherlv_14= ',' ( (lv_value_15_0= rulePropertyValue ) ) )* otherlv_16= ')' )? otherlv_17= ';' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==45) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSADL.g:1943:4: otherlv_10= 'over' ( (otherlv_11= RULE_ID ) ) (otherlv_12= '(' ( (lv_value_13_0= rulePropertyValue ) ) (otherlv_14= ',' ( (lv_value_15_0= rulePropertyValue ) ) )* otherlv_16= ')' )? otherlv_17= ';'
                    {
                    otherlv_10=(Token)match(input,45,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getLinkAccess().getOverKeyword_4_0());
                      			
                    }
                    // InternalSADL.g:1947:4: ( (otherlv_11= RULE_ID ) )
                    // InternalSADL.g:1948:5: (otherlv_11= RULE_ID )
                    {
                    // InternalSADL.g:1948:5: (otherlv_11= RULE_ID )
                    // InternalSADL.g:1949:6: otherlv_11= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getLinkRule());
                      						}
                      					
                    }
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_11, grammarAccess.getLinkAccess().getTransportTransportCrossReference_4_1_0());
                      					
                    }

                    }


                    }

                    // InternalSADL.g:1960:4: (otherlv_12= '(' ( (lv_value_13_0= rulePropertyValue ) ) (otherlv_14= ',' ( (lv_value_15_0= rulePropertyValue ) ) )* otherlv_16= ')' )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==27) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalSADL.g:1961:5: otherlv_12= '(' ( (lv_value_13_0= rulePropertyValue ) ) (otherlv_14= ',' ( (lv_value_15_0= rulePropertyValue ) ) )* otherlv_16= ')'
                            {
                            otherlv_12=(Token)match(input,27,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_12, grammarAccess.getLinkAccess().getLeftParenthesisKeyword_4_2_0());
                              				
                            }
                            // InternalSADL.g:1965:5: ( (lv_value_13_0= rulePropertyValue ) )
                            // InternalSADL.g:1966:6: (lv_value_13_0= rulePropertyValue )
                            {
                            // InternalSADL.g:1966:6: (lv_value_13_0= rulePropertyValue )
                            // InternalSADL.g:1967:7: lv_value_13_0= rulePropertyValue
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getLinkAccess().getValuePropertyValueParserRuleCall_4_2_1_0());
                              						
                            }
                            pushFollow(FOLLOW_43);
                            lv_value_13_0=rulePropertyValue();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getLinkRule());
                              							}
                              							add(
                              								current,
                              								"value",
                              								lv_value_13_0,
                              								"com.leonardo.lsaf.sadl.SADL.PropertyValue");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalSADL.g:1984:5: (otherlv_14= ',' ( (lv_value_15_0= rulePropertyValue ) ) )*
                            loop41:
                            do {
                                int alt41=2;
                                int LA41_0 = input.LA(1);

                                if ( (LA41_0==44) ) {
                                    alt41=1;
                                }


                                switch (alt41) {
                            	case 1 :
                            	    // InternalSADL.g:1985:6: otherlv_14= ',' ( (lv_value_15_0= rulePropertyValue ) )
                            	    {
                            	    otherlv_14=(Token)match(input,44,FOLLOW_4); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_14, grammarAccess.getLinkAccess().getCommaKeyword_4_2_2_0());
                            	      					
                            	    }
                            	    // InternalSADL.g:1989:6: ( (lv_value_15_0= rulePropertyValue ) )
                            	    // InternalSADL.g:1990:7: (lv_value_15_0= rulePropertyValue )
                            	    {
                            	    // InternalSADL.g:1990:7: (lv_value_15_0= rulePropertyValue )
                            	    // InternalSADL.g:1991:8: lv_value_15_0= rulePropertyValue
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getLinkAccess().getValuePropertyValueParserRuleCall_4_2_2_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_43);
                            	    lv_value_15_0=rulePropertyValue();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getLinkRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"value",
                            	      									lv_value_15_0,
                            	      									"com.leonardo.lsaf.sadl.SADL.PropertyValue");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop41;
                                }
                            } while (true);

                            otherlv_16=(Token)match(input,28,FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_16, grammarAccess.getLinkAccess().getRightParenthesisKeyword_4_2_3());
                              				
                            }

                            }
                            break;

                    }

                    otherlv_17=(Token)match(input,17,FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getLinkAccess().getSemicolonKeyword_4_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getLinkAccess().getEndKeyword_5());
              		
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
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleProperty"
    // InternalSADL.g:2027:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalSADL.g:2027:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalSADL.g:2028:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalSADL.g:2034:1: ruleProperty returns [EObject current=null] : (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) ( (lv_optional_2_0= '?' ) )? ( (lv_description_3_0= RULE_STRING ) )? otherlv_4= ';' ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_optional_2_0=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSADL.g:2040:2: ( (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) ( (lv_optional_2_0= '?' ) )? ( (lv_description_3_0= RULE_STRING ) )? otherlv_4= ';' ) )
            // InternalSADL.g:2041:2: (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) ( (lv_optional_2_0= '?' ) )? ( (lv_description_3_0= RULE_STRING ) )? otherlv_4= ';' )
            {
            // InternalSADL.g:2041:2: (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) ( (lv_optional_2_0= '?' ) )? ( (lv_description_3_0= RULE_STRING ) )? otherlv_4= ';' )
            // InternalSADL.g:2042:3: otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) ( (lv_optional_2_0= '?' ) )? ( (lv_description_3_0= RULE_STRING ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getPropertyKeyword_0());
              		
            }
            // InternalSADL.g:2046:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSADL.g:2047:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSADL.g:2047:4: (lv_name_1_0= RULE_ID )
            // InternalSADL.g:2048:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPropertyRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalSADL.g:2064:3: ( (lv_optional_2_0= '?' ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==47) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalSADL.g:2065:4: (lv_optional_2_0= '?' )
                    {
                    // InternalSADL.g:2065:4: (lv_optional_2_0= '?' )
                    // InternalSADL.g:2066:5: lv_optional_2_0= '?'
                    {
                    lv_optional_2_0=(Token)match(input,47,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_optional_2_0, grammarAccess.getPropertyAccess().getOptionalQuestionMarkKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPropertyRule());
                      					}
                      					setWithLastConsumed(current, "optional", lv_optional_2_0 != null, "?");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSADL.g:2078:3: ( (lv_description_3_0= RULE_STRING ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_STRING) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSADL.g:2079:4: (lv_description_3_0= RULE_STRING )
                    {
                    // InternalSADL.g:2079:4: (lv_description_3_0= RULE_STRING )
                    // InternalSADL.g:2080:5: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_description_3_0, grammarAccess.getPropertyAccess().getDescriptionSTRINGTerminalRuleCall_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPropertyRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"description",
                      						lv_description_3_0,
                      						"org.eclipse.xtext.common.Terminals.STRING");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getPropertyAccess().getSemicolonKeyword_4());
              		
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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRulePropertyValue"
    // InternalSADL.g:2104:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalSADL.g:2104:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalSADL.g:2105:2: iv_rulePropertyValue= rulePropertyValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePropertyValue=rulePropertyValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropertyValue"


    // $ANTLR start "rulePropertyValue"
    // InternalSADL.g:2111:1: rulePropertyValue returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalSADL.g:2117:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalSADL.g:2118:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalSADL.g:2118:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalSADL.g:2119:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalSADL.g:2119:3: ( (otherlv_0= RULE_ID ) )
            // InternalSADL.g:2120:4: (otherlv_0= RULE_ID )
            {
            // InternalSADL.g:2120:4: (otherlv_0= RULE_ID )
            // InternalSADL.g:2121:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPropertyValueRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getPropertyValueAccess().getPropertyPropertyCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPropertyValueAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalSADL.g:2136:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalSADL.g:2137:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalSADL.g:2137:4: (lv_value_2_0= RULE_STRING )
            // InternalSADL.g:2138:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_2_0, grammarAccess.getPropertyValueAccess().getValueSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPropertyValueRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


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
    // $ANTLR end "rulePropertyValue"


    // $ANTLR start "entryRuleTransport"
    // InternalSADL.g:2158:1: entryRuleTransport returns [EObject current=null] : iv_ruleTransport= ruleTransport EOF ;
    public final EObject entryRuleTransport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransport = null;


        try {
            // InternalSADL.g:2158:50: (iv_ruleTransport= ruleTransport EOF )
            // InternalSADL.g:2159:2: iv_ruleTransport= ruleTransport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTransport=ruleTransport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransport; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTransport"


    // $ANTLR start "ruleTransport"
    // InternalSADL.g:2165:1: ruleTransport returns [EObject current=null] : (otherlv_0= 'transport' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= 'end' ) ;
    public final EObject ruleTransport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_4=null;
        EObject lv_properties_3_0 = null;



        	enterRule();

        try {
            // InternalSADL.g:2171:2: ( (otherlv_0= 'transport' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= 'end' ) )
            // InternalSADL.g:2172:2: (otherlv_0= 'transport' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= 'end' )
            {
            // InternalSADL.g:2172:2: (otherlv_0= 'transport' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= 'end' )
            // InternalSADL.g:2173:3: otherlv_0= 'transport' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTransportAccess().getTransportKeyword_0());
              		
            }
            // InternalSADL.g:2177:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSADL.g:2178:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSADL.g:2178:4: (lv_name_1_0= RULE_ID )
            // InternalSADL.g:2179:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getTransportAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTransportRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalSADL.g:2195:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_STRING) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSADL.g:2196:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalSADL.g:2196:4: (lv_description_2_0= RULE_STRING )
                    // InternalSADL.g:2197:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_description_2_0, grammarAccess.getTransportAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getTransportRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"description",
                      						lv_description_2_0,
                      						"org.eclipse.xtext.common.Terminals.STRING");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSADL.g:2213:3: ( (lv_properties_3_0= ruleProperty ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==46) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalSADL.g:2214:4: (lv_properties_3_0= ruleProperty )
            	    {
            	    // InternalSADL.g:2214:4: (lv_properties_3_0= ruleProperty )
            	    // InternalSADL.g:2215:5: lv_properties_3_0= ruleProperty
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTransportAccess().getPropertiesPropertyParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_51);
            	    lv_properties_3_0=ruleProperty();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTransportRule());
            	      					}
            	      					add(
            	      						current,
            	      						"properties",
            	      						lv_properties_3_0,
            	      						"com.leonardo.lsaf.sadl.SADL.Property");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getTransportAccess().getEndKeyword_4());
              		
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
    // $ANTLR end "ruleTransport"


    // $ANTLR start "entryRuleApplication"
    // InternalSADL.g:2240:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // InternalSADL.g:2240:52: (iv_ruleApplication= ruleApplication EOF )
            // InternalSADL.g:2241:2: iv_ruleApplication= ruleApplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getApplicationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleApplication=ruleApplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleApplication; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // InternalSADL.g:2247:1: ruleApplication returns [EObject current=null] : (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_containerInstances_3_0= ruleContainerInstance ) )* otherlv_4= 'end' ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_4=null;
        EObject lv_containerInstances_3_0 = null;



        	enterRule();

        try {
            // InternalSADL.g:2253:2: ( (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_containerInstances_3_0= ruleContainerInstance ) )* otherlv_4= 'end' ) )
            // InternalSADL.g:2254:2: (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_containerInstances_3_0= ruleContainerInstance ) )* otherlv_4= 'end' )
            {
            // InternalSADL.g:2254:2: (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_containerInstances_3_0= ruleContainerInstance ) )* otherlv_4= 'end' )
            // InternalSADL.g:2255:3: otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_containerInstances_3_0= ruleContainerInstance ) )* otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getApplicationAccess().getApplicationKeyword_0());
              		
            }
            // InternalSADL.g:2259:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSADL.g:2260:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSADL.g:2260:4: (lv_name_1_0= RULE_ID )
            // InternalSADL.g:2261:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getApplicationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalSADL.g:2277:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_STRING) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalSADL.g:2278:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalSADL.g:2278:4: (lv_description_2_0= RULE_STRING )
                    // InternalSADL.g:2279:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_description_2_0, grammarAccess.getApplicationAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getApplicationRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"description",
                      						lv_description_2_0,
                      						"org.eclipse.xtext.common.Terminals.STRING");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSADL.g:2295:3: ( (lv_containerInstances_3_0= ruleContainerInstance ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==51) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalSADL.g:2296:4: (lv_containerInstances_3_0= ruleContainerInstance )
            	    {
            	    // InternalSADL.g:2296:4: (lv_containerInstances_3_0= ruleContainerInstance )
            	    // InternalSADL.g:2297:5: lv_containerInstances_3_0= ruleContainerInstance
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getApplicationAccess().getContainerInstancesContainerInstanceParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_53);
            	    lv_containerInstances_3_0=ruleContainerInstance();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getApplicationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"containerInstances",
            	      						lv_containerInstances_3_0,
            	      						"com.leonardo.lsaf.sadl.SADL.ContainerInstance");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getApplicationAccess().getEndKeyword_4());
              		
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
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleContainer"
    // InternalSADL.g:2322:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalSADL.g:2322:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalSADL.g:2323:2: iv_ruleContainer= ruleContainer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContainer=ruleContainer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainer; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalSADL.g:2329:1: ruleContainer returns [EObject current=null] : (otherlv_0= 'container' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( (lv_componentInstances_3_0= ruleComponentInstance ) ) | ( (lv_connections_4_0= ruleConnection ) ) | ( (lv_containerInstances_5_0= ruleContainerInstance ) ) )* otherlv_6= 'end' ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_6=null;
        EObject lv_componentInstances_3_0 = null;

        EObject lv_connections_4_0 = null;

        EObject lv_containerInstances_5_0 = null;



        	enterRule();

        try {
            // InternalSADL.g:2335:2: ( (otherlv_0= 'container' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( (lv_componentInstances_3_0= ruleComponentInstance ) ) | ( (lv_connections_4_0= ruleConnection ) ) | ( (lv_containerInstances_5_0= ruleContainerInstance ) ) )* otherlv_6= 'end' ) )
            // InternalSADL.g:2336:2: (otherlv_0= 'container' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( (lv_componentInstances_3_0= ruleComponentInstance ) ) | ( (lv_connections_4_0= ruleConnection ) ) | ( (lv_containerInstances_5_0= ruleContainerInstance ) ) )* otherlv_6= 'end' )
            {
            // InternalSADL.g:2336:2: (otherlv_0= 'container' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( (lv_componentInstances_3_0= ruleComponentInstance ) ) | ( (lv_connections_4_0= ruleConnection ) ) | ( (lv_containerInstances_5_0= ruleContainerInstance ) ) )* otherlv_6= 'end' )
            // InternalSADL.g:2337:3: otherlv_0= 'container' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( (lv_componentInstances_3_0= ruleComponentInstance ) ) | ( (lv_connections_4_0= ruleConnection ) ) | ( (lv_containerInstances_5_0= ruleContainerInstance ) ) )* otherlv_6= 'end'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getContainerAccess().getContainerKeyword_0());
              		
            }
            // InternalSADL.g:2341:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSADL.g:2342:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSADL.g:2342:4: (lv_name_1_0= RULE_ID )
            // InternalSADL.g:2343:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getContainerAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getContainerRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalSADL.g:2359:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_STRING) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalSADL.g:2360:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalSADL.g:2360:4: (lv_description_2_0= RULE_STRING )
                    // InternalSADL.g:2361:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_55); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_description_2_0, grammarAccess.getContainerAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getContainerRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"description",
                      						lv_description_2_0,
                      						"org.eclipse.xtext.common.Terminals.STRING");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSADL.g:2377:3: ( ( (lv_componentInstances_3_0= ruleComponentInstance ) ) | ( (lv_connections_4_0= ruleConnection ) ) | ( (lv_containerInstances_5_0= ruleContainerInstance ) ) )*
            loop51:
            do {
                int alt51=4;
                switch ( input.LA(1) ) {
                case 53:
                    {
                    alt51=1;
                    }
                    break;
                case 54:
                    {
                    alt51=2;
                    }
                    break;
                case 51:
                    {
                    alt51=3;
                    }
                    break;

                }

                switch (alt51) {
            	case 1 :
            	    // InternalSADL.g:2378:4: ( (lv_componentInstances_3_0= ruleComponentInstance ) )
            	    {
            	    // InternalSADL.g:2378:4: ( (lv_componentInstances_3_0= ruleComponentInstance ) )
            	    // InternalSADL.g:2379:5: (lv_componentInstances_3_0= ruleComponentInstance )
            	    {
            	    // InternalSADL.g:2379:5: (lv_componentInstances_3_0= ruleComponentInstance )
            	    // InternalSADL.g:2380:6: lv_componentInstances_3_0= ruleComponentInstance
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getContainerAccess().getComponentInstancesComponentInstanceParserRuleCall_3_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_55);
            	    lv_componentInstances_3_0=ruleComponentInstance();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getContainerRule());
            	      						}
            	      						add(
            	      							current,
            	      							"componentInstances",
            	      							lv_componentInstances_3_0,
            	      							"com.leonardo.lsaf.sadl.SADL.ComponentInstance");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSADL.g:2398:4: ( (lv_connections_4_0= ruleConnection ) )
            	    {
            	    // InternalSADL.g:2398:4: ( (lv_connections_4_0= ruleConnection ) )
            	    // InternalSADL.g:2399:5: (lv_connections_4_0= ruleConnection )
            	    {
            	    // InternalSADL.g:2399:5: (lv_connections_4_0= ruleConnection )
            	    // InternalSADL.g:2400:6: lv_connections_4_0= ruleConnection
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getContainerAccess().getConnectionsConnectionParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_55);
            	    lv_connections_4_0=ruleConnection();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getContainerRule());
            	      						}
            	      						add(
            	      							current,
            	      							"connections",
            	      							lv_connections_4_0,
            	      							"com.leonardo.lsaf.sadl.SADL.Connection");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalSADL.g:2418:4: ( (lv_containerInstances_5_0= ruleContainerInstance ) )
            	    {
            	    // InternalSADL.g:2418:4: ( (lv_containerInstances_5_0= ruleContainerInstance ) )
            	    // InternalSADL.g:2419:5: (lv_containerInstances_5_0= ruleContainerInstance )
            	    {
            	    // InternalSADL.g:2419:5: (lv_containerInstances_5_0= ruleContainerInstance )
            	    // InternalSADL.g:2420:6: lv_containerInstances_5_0= ruleContainerInstance
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getContainerAccess().getContainerInstancesContainerInstanceParserRuleCall_3_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_55);
            	    lv_containerInstances_5_0=ruleContainerInstance();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getContainerRule());
            	      						}
            	      						add(
            	      							current,
            	      							"containerInstances",
            	      							lv_containerInstances_5_0,
            	      							"com.leonardo.lsaf.sadl.SADL.ContainerInstance");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getContainerAccess().getEndKeyword_4());
              		
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
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleContainerInstance"
    // InternalSADL.g:2446:1: entryRuleContainerInstance returns [EObject current=null] : iv_ruleContainerInstance= ruleContainerInstance EOF ;
    public final EObject entryRuleContainerInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerInstance = null;


        try {
            // InternalSADL.g:2446:58: (iv_ruleContainerInstance= ruleContainerInstance EOF )
            // InternalSADL.g:2447:2: iv_ruleContainerInstance= ruleContainerInstance EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerInstanceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContainerInstance=ruleContainerInstance();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainerInstance; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleContainerInstance"


    // $ANTLR start "ruleContainerInstance"
    // InternalSADL.g:2453:1: ruleContainerInstance returns [EObject current=null] : (otherlv_0= 'container_instance' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) )? otherlv_4= ';' ) ;
    public final EObject ruleContainerInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSADL.g:2459:2: ( (otherlv_0= 'container_instance' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) )? otherlv_4= ';' ) )
            // InternalSADL.g:2460:2: (otherlv_0= 'container_instance' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) )? otherlv_4= ';' )
            {
            // InternalSADL.g:2460:2: (otherlv_0= 'container_instance' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) )? otherlv_4= ';' )
            // InternalSADL.g:2461:3: otherlv_0= 'container_instance' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getContainerInstanceAccess().getContainer_instanceKeyword_0());
              		
            }
            // InternalSADL.g:2465:3: ( ( ruleQualifiedName ) )
            // InternalSADL.g:2466:4: ( ruleQualifiedName )
            {
            // InternalSADL.g:2466:4: ( ruleQualifiedName )
            // InternalSADL.g:2467:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getContainerInstanceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContainerInstanceAccess().getTypeContainerCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSADL.g:2481:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSADL.g:2482:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSADL.g:2482:4: (lv_name_2_0= RULE_ID )
            // InternalSADL.g:2483:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getContainerInstanceAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getContainerInstanceRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalSADL.g:2499:3: ( (lv_description_3_0= RULE_STRING ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_STRING) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalSADL.g:2500:4: (lv_description_3_0= RULE_STRING )
                    {
                    // InternalSADL.g:2500:4: (lv_description_3_0= RULE_STRING )
                    // InternalSADL.g:2501:5: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_description_3_0, grammarAccess.getContainerInstanceAccess().getDescriptionSTRINGTerminalRuleCall_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getContainerInstanceRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"description",
                      						lv_description_3_0,
                      						"org.eclipse.xtext.common.Terminals.STRING");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getContainerInstanceAccess().getSemicolonKeyword_4());
              		
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
    // $ANTLR end "ruleContainerInstance"


    // $ANTLR start "entryRuleComponent"
    // InternalSADL.g:2525:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalSADL.g:2525:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalSADL.g:2526:2: iv_ruleComponent= ruleComponent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComponentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComponent; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalSADL.g:2532:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( (lv_parts_3_0= ruleComponentInstance ) ) | ( (lv_ports_4_0= rulePort ) ) )* otherlv_5= 'end' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_5=null;
        EObject lv_parts_3_0 = null;

        EObject lv_ports_4_0 = null;



        	enterRule();

        try {
            // InternalSADL.g:2538:2: ( (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( (lv_parts_3_0= ruleComponentInstance ) ) | ( (lv_ports_4_0= rulePort ) ) )* otherlv_5= 'end' ) )
            // InternalSADL.g:2539:2: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( (lv_parts_3_0= ruleComponentInstance ) ) | ( (lv_ports_4_0= rulePort ) ) )* otherlv_5= 'end' )
            {
            // InternalSADL.g:2539:2: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( (lv_parts_3_0= ruleComponentInstance ) ) | ( (lv_ports_4_0= rulePort ) ) )* otherlv_5= 'end' )
            // InternalSADL.g:2540:3: otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( (lv_parts_3_0= ruleComponentInstance ) ) | ( (lv_ports_4_0= rulePort ) ) )* otherlv_5= 'end'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
              		
            }
            // InternalSADL.g:2544:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSADL.g:2545:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSADL.g:2545:4: (lv_name_1_0= RULE_ID )
            // InternalSADL.g:2546:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getComponentRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalSADL.g:2562:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_STRING) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalSADL.g:2563:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalSADL.g:2563:4: (lv_description_2_0= RULE_STRING )
                    // InternalSADL.g:2564:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_57); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_description_2_0, grammarAccess.getComponentAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getComponentRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"description",
                      						lv_description_2_0,
                      						"org.eclipse.xtext.common.Terminals.STRING");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSADL.g:2580:3: ( ( (lv_parts_3_0= ruleComponentInstance ) ) | ( (lv_ports_4_0= rulePort ) ) )*
            loop54:
            do {
                int alt54=3;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==53) ) {
                    alt54=1;
                }
                else if ( (LA54_0==35) ) {
                    alt54=2;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalSADL.g:2581:4: ( (lv_parts_3_0= ruleComponentInstance ) )
            	    {
            	    // InternalSADL.g:2581:4: ( (lv_parts_3_0= ruleComponentInstance ) )
            	    // InternalSADL.g:2582:5: (lv_parts_3_0= ruleComponentInstance )
            	    {
            	    // InternalSADL.g:2582:5: (lv_parts_3_0= ruleComponentInstance )
            	    // InternalSADL.g:2583:6: lv_parts_3_0= ruleComponentInstance
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComponentAccess().getPartsComponentInstanceParserRuleCall_3_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_57);
            	    lv_parts_3_0=ruleComponentInstance();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getComponentRule());
            	      						}
            	      						add(
            	      							current,
            	      							"parts",
            	      							lv_parts_3_0,
            	      							"com.leonardo.lsaf.sadl.SADL.ComponentInstance");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSADL.g:2601:4: ( (lv_ports_4_0= rulePort ) )
            	    {
            	    // InternalSADL.g:2601:4: ( (lv_ports_4_0= rulePort ) )
            	    // InternalSADL.g:2602:5: (lv_ports_4_0= rulePort )
            	    {
            	    // InternalSADL.g:2602:5: (lv_ports_4_0= rulePort )
            	    // InternalSADL.g:2603:6: lv_ports_4_0= rulePort
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComponentAccess().getPortsPortParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_57);
            	    lv_ports_4_0=rulePort();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getComponentRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ports",
            	      							lv_ports_4_0,
            	      							"com.leonardo.lsaf.sadl.SADL.Port");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getEndKeyword_4());
              		
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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleComponentInstance"
    // InternalSADL.g:2629:1: entryRuleComponentInstance returns [EObject current=null] : iv_ruleComponentInstance= ruleComponentInstance EOF ;
    public final EObject entryRuleComponentInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentInstance = null;


        try {
            // InternalSADL.g:2629:58: (iv_ruleComponentInstance= ruleComponentInstance EOF )
            // InternalSADL.g:2630:2: iv_ruleComponentInstance= ruleComponentInstance EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComponentInstanceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComponentInstance=ruleComponentInstance();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComponentInstance; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComponentInstance"


    // $ANTLR start "ruleComponentInstance"
    // InternalSADL.g:2636:1: ruleComponentInstance returns [EObject current=null] : (otherlv_0= 'component_instance' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '[' ( ( (lv_unbounded_4_0= '*' ) ) | ( (lv_lowerBound_5_0= RULE_INT ) ) | ( ( (lv_lowerBound_6_0= RULE_INT ) ) otherlv_7= '..' ( ( (lv_unbounded_8_0= '*' ) ) | ( (lv_upperBound_9_0= RULE_INT ) ) ) ) ) otherlv_10= ']' )? ( (lv_description_11_0= RULE_STRING ) )? otherlv_12= ';' ) ;
    public final EObject ruleComponentInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_unbounded_4_0=null;
        Token lv_lowerBound_5_0=null;
        Token lv_lowerBound_6_0=null;
        Token otherlv_7=null;
        Token lv_unbounded_8_0=null;
        Token lv_upperBound_9_0=null;
        Token otherlv_10=null;
        Token lv_description_11_0=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalSADL.g:2642:2: ( (otherlv_0= 'component_instance' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '[' ( ( (lv_unbounded_4_0= '*' ) ) | ( (lv_lowerBound_5_0= RULE_INT ) ) | ( ( (lv_lowerBound_6_0= RULE_INT ) ) otherlv_7= '..' ( ( (lv_unbounded_8_0= '*' ) ) | ( (lv_upperBound_9_0= RULE_INT ) ) ) ) ) otherlv_10= ']' )? ( (lv_description_11_0= RULE_STRING ) )? otherlv_12= ';' ) )
            // InternalSADL.g:2643:2: (otherlv_0= 'component_instance' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '[' ( ( (lv_unbounded_4_0= '*' ) ) | ( (lv_lowerBound_5_0= RULE_INT ) ) | ( ( (lv_lowerBound_6_0= RULE_INT ) ) otherlv_7= '..' ( ( (lv_unbounded_8_0= '*' ) ) | ( (lv_upperBound_9_0= RULE_INT ) ) ) ) ) otherlv_10= ']' )? ( (lv_description_11_0= RULE_STRING ) )? otherlv_12= ';' )
            {
            // InternalSADL.g:2643:2: (otherlv_0= 'component_instance' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '[' ( ( (lv_unbounded_4_0= '*' ) ) | ( (lv_lowerBound_5_0= RULE_INT ) ) | ( ( (lv_lowerBound_6_0= RULE_INT ) ) otherlv_7= '..' ( ( (lv_unbounded_8_0= '*' ) ) | ( (lv_upperBound_9_0= RULE_INT ) ) ) ) ) otherlv_10= ']' )? ( (lv_description_11_0= RULE_STRING ) )? otherlv_12= ';' )
            // InternalSADL.g:2644:3: otherlv_0= 'component_instance' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '[' ( ( (lv_unbounded_4_0= '*' ) ) | ( (lv_lowerBound_5_0= RULE_INT ) ) | ( ( (lv_lowerBound_6_0= RULE_INT ) ) otherlv_7= '..' ( ( (lv_unbounded_8_0= '*' ) ) | ( (lv_upperBound_9_0= RULE_INT ) ) ) ) ) otherlv_10= ']' )? ( (lv_description_11_0= RULE_STRING ) )? otherlv_12= ';'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getComponentInstanceAccess().getComponent_instanceKeyword_0());
              		
            }
            // InternalSADL.g:2648:3: ( ( ruleQualifiedName ) )
            // InternalSADL.g:2649:4: ( ruleQualifiedName )
            {
            // InternalSADL.g:2649:4: ( ruleQualifiedName )
            // InternalSADL.g:2650:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getComponentInstanceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComponentInstanceAccess().getTypeComponentCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSADL.g:2664:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSADL.g:2665:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSADL.g:2665:4: (lv_name_2_0= RULE_ID )
            // InternalSADL.g:2666:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getComponentInstanceAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getComponentInstanceRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalSADL.g:2682:3: (otherlv_3= '[' ( ( (lv_unbounded_4_0= '*' ) ) | ( (lv_lowerBound_5_0= RULE_INT ) ) | ( ( (lv_lowerBound_6_0= RULE_INT ) ) otherlv_7= '..' ( ( (lv_unbounded_8_0= '*' ) ) | ( (lv_upperBound_9_0= RULE_INT ) ) ) ) ) otherlv_10= ']' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==24) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalSADL.g:2683:4: otherlv_3= '[' ( ( (lv_unbounded_4_0= '*' ) ) | ( (lv_lowerBound_5_0= RULE_INT ) ) | ( ( (lv_lowerBound_6_0= RULE_INT ) ) otherlv_7= '..' ( ( (lv_unbounded_8_0= '*' ) ) | ( (lv_upperBound_9_0= RULE_INT ) ) ) ) ) otherlv_10= ']'
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getComponentInstanceAccess().getLeftSquareBracketKeyword_3_0());
                      			
                    }
                    // InternalSADL.g:2687:4: ( ( (lv_unbounded_4_0= '*' ) ) | ( (lv_lowerBound_5_0= RULE_INT ) ) | ( ( (lv_lowerBound_6_0= RULE_INT ) ) otherlv_7= '..' ( ( (lv_unbounded_8_0= '*' ) ) | ( (lv_upperBound_9_0= RULE_INT ) ) ) ) )
                    int alt56=3;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==25) ) {
                        alt56=1;
                    }
                    else if ( (LA56_0==RULE_INT) ) {
                        int LA56_2 = input.LA(2);

                        if ( (LA56_2==26) ) {
                            alt56=2;
                        }
                        else if ( (LA56_2==34) ) {
                            alt56=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 56, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 0, input);

                        throw nvae;
                    }
                    switch (alt56) {
                        case 1 :
                            // InternalSADL.g:2688:5: ( (lv_unbounded_4_0= '*' ) )
                            {
                            // InternalSADL.g:2688:5: ( (lv_unbounded_4_0= '*' ) )
                            // InternalSADL.g:2689:6: (lv_unbounded_4_0= '*' )
                            {
                            // InternalSADL.g:2689:6: (lv_unbounded_4_0= '*' )
                            // InternalSADL.g:2690:7: lv_unbounded_4_0= '*'
                            {
                            lv_unbounded_4_0=(Token)match(input,25,FOLLOW_28); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_unbounded_4_0, grammarAccess.getComponentInstanceAccess().getUnboundedAsteriskKeyword_3_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getComponentInstanceRule());
                              							}
                              							setWithLastConsumed(current, "unbounded", lv_unbounded_4_0 != null, "*");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSADL.g:2703:5: ( (lv_lowerBound_5_0= RULE_INT ) )
                            {
                            // InternalSADL.g:2703:5: ( (lv_lowerBound_5_0= RULE_INT ) )
                            // InternalSADL.g:2704:6: (lv_lowerBound_5_0= RULE_INT )
                            {
                            // InternalSADL.g:2704:6: (lv_lowerBound_5_0= RULE_INT )
                            // InternalSADL.g:2705:7: lv_lowerBound_5_0= RULE_INT
                            {
                            lv_lowerBound_5_0=(Token)match(input,RULE_INT,FOLLOW_28); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_lowerBound_5_0, grammarAccess.getComponentInstanceAccess().getLowerBoundINTTerminalRuleCall_3_1_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getComponentInstanceRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"lowerBound",
                              								lv_lowerBound_5_0,
                              								"org.eclipse.xtext.common.Terminals.INT");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalSADL.g:2722:5: ( ( (lv_lowerBound_6_0= RULE_INT ) ) otherlv_7= '..' ( ( (lv_unbounded_8_0= '*' ) ) | ( (lv_upperBound_9_0= RULE_INT ) ) ) )
                            {
                            // InternalSADL.g:2722:5: ( ( (lv_lowerBound_6_0= RULE_INT ) ) otherlv_7= '..' ( ( (lv_unbounded_8_0= '*' ) ) | ( (lv_upperBound_9_0= RULE_INT ) ) ) )
                            // InternalSADL.g:2723:6: ( (lv_lowerBound_6_0= RULE_INT ) ) otherlv_7= '..' ( ( (lv_unbounded_8_0= '*' ) ) | ( (lv_upperBound_9_0= RULE_INT ) ) )
                            {
                            // InternalSADL.g:2723:6: ( (lv_lowerBound_6_0= RULE_INT ) )
                            // InternalSADL.g:2724:7: (lv_lowerBound_6_0= RULE_INT )
                            {
                            // InternalSADL.g:2724:7: (lv_lowerBound_6_0= RULE_INT )
                            // InternalSADL.g:2725:8: lv_lowerBound_6_0= RULE_INT
                            {
                            lv_lowerBound_6_0=(Token)match(input,RULE_INT,FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_lowerBound_6_0, grammarAccess.getComponentInstanceAccess().getLowerBoundINTTerminalRuleCall_3_1_2_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getComponentInstanceRule());
                              								}
                              								setWithLastConsumed(
                              									current,
                              									"lowerBound",
                              									lv_lowerBound_6_0,
                              									"org.eclipse.xtext.common.Terminals.INT");
                              							
                            }

                            }


                            }

                            otherlv_7=(Token)match(input,34,FOLLOW_35); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_7, grammarAccess.getComponentInstanceAccess().getFullStopFullStopKeyword_3_1_2_1());
                              					
                            }
                            // InternalSADL.g:2745:6: ( ( (lv_unbounded_8_0= '*' ) ) | ( (lv_upperBound_9_0= RULE_INT ) ) )
                            int alt55=2;
                            int LA55_0 = input.LA(1);

                            if ( (LA55_0==25) ) {
                                alt55=1;
                            }
                            else if ( (LA55_0==RULE_INT) ) {
                                alt55=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 55, 0, input);

                                throw nvae;
                            }
                            switch (alt55) {
                                case 1 :
                                    // InternalSADL.g:2746:7: ( (lv_unbounded_8_0= '*' ) )
                                    {
                                    // InternalSADL.g:2746:7: ( (lv_unbounded_8_0= '*' ) )
                                    // InternalSADL.g:2747:8: (lv_unbounded_8_0= '*' )
                                    {
                                    // InternalSADL.g:2747:8: (lv_unbounded_8_0= '*' )
                                    // InternalSADL.g:2748:9: lv_unbounded_8_0= '*'
                                    {
                                    lv_unbounded_8_0=(Token)match(input,25,FOLLOW_28); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(lv_unbounded_8_0, grammarAccess.getComponentInstanceAccess().getUnboundedAsteriskKeyword_3_1_2_2_0_0());
                                      								
                                    }
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElement(grammarAccess.getComponentInstanceRule());
                                      									}
                                      									setWithLastConsumed(current, "unbounded", lv_unbounded_8_0 != null, "*");
                                      								
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalSADL.g:2761:7: ( (lv_upperBound_9_0= RULE_INT ) )
                                    {
                                    // InternalSADL.g:2761:7: ( (lv_upperBound_9_0= RULE_INT ) )
                                    // InternalSADL.g:2762:8: (lv_upperBound_9_0= RULE_INT )
                                    {
                                    // InternalSADL.g:2762:8: (lv_upperBound_9_0= RULE_INT )
                                    // InternalSADL.g:2763:9: lv_upperBound_9_0= RULE_INT
                                    {
                                    lv_upperBound_9_0=(Token)match(input,RULE_INT,FOLLOW_28); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(lv_upperBound_9_0, grammarAccess.getComponentInstanceAccess().getUpperBoundINTTerminalRuleCall_3_1_2_2_1_0());
                                      								
                                    }
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElement(grammarAccess.getComponentInstanceRule());
                                      									}
                                      									setWithLastConsumed(
                                      										current,
                                      										"upperBound",
                                      										lv_upperBound_9_0,
                                      										"org.eclipse.xtext.common.Terminals.INT");
                                      								
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,26,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getComponentInstanceAccess().getRightSquareBracketKeyword_3_2());
                      			
                    }

                    }
                    break;

            }

            // InternalSADL.g:2787:3: ( (lv_description_11_0= RULE_STRING ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_STRING) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalSADL.g:2788:4: (lv_description_11_0= RULE_STRING )
                    {
                    // InternalSADL.g:2788:4: (lv_description_11_0= RULE_STRING )
                    // InternalSADL.g:2789:5: lv_description_11_0= RULE_STRING
                    {
                    lv_description_11_0=(Token)match(input,RULE_STRING,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_description_11_0, grammarAccess.getComponentInstanceAccess().getDescriptionSTRINGTerminalRuleCall_4_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getComponentInstanceRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"description",
                      						lv_description_11_0,
                      						"org.eclipse.xtext.common.Terminals.STRING");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getComponentInstanceAccess().getSemicolonKeyword_5());
              		
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
    // $ANTLR end "ruleComponentInstance"


    // $ANTLR start "entryRuleConnection"
    // InternalSADL.g:2813:1: entryRuleConnection returns [EObject current=null] : iv_ruleConnection= ruleConnection EOF ;
    public final EObject entryRuleConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnection = null;


        try {
            // InternalSADL.g:2813:51: (iv_ruleConnection= ruleConnection EOF )
            // InternalSADL.g:2814:2: iv_ruleConnection= ruleConnection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConnectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConnection=ruleConnection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConnection; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConnection"


    // $ANTLR start "ruleConnection"
    // InternalSADL.g:2820:1: ruleConnection returns [EObject current=null] : (otherlv_0= 'connect' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '(' (otherlv_3= 'self' | ( ( ruleQualifiedName ) ) ) otherlv_5= '::' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ',' (otherlv_10= 'self' | ( ( ruleQualifiedName ) ) ) otherlv_12= '::' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '.' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= ')' (otherlv_17= 'using' ( (otherlv_18= RULE_ID ) ) (otherlv_19= '(' ( (lv_value_20_0= rulePropertyValue ) ) (otherlv_21= ',' ( (lv_value_22_0= rulePropertyValue ) ) )* otherlv_23= ')' )? )? ( (lv_description_24_0= RULE_STRING ) )? otherlv_25= ';' ) ;
    public final EObject ruleConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token lv_description_24_0=null;
        Token otherlv_25=null;
        EObject lv_value_20_0 = null;

        EObject lv_value_22_0 = null;



        	enterRule();

        try {
            // InternalSADL.g:2826:2: ( (otherlv_0= 'connect' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '(' (otherlv_3= 'self' | ( ( ruleQualifiedName ) ) ) otherlv_5= '::' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ',' (otherlv_10= 'self' | ( ( ruleQualifiedName ) ) ) otherlv_12= '::' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '.' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= ')' (otherlv_17= 'using' ( (otherlv_18= RULE_ID ) ) (otherlv_19= '(' ( (lv_value_20_0= rulePropertyValue ) ) (otherlv_21= ',' ( (lv_value_22_0= rulePropertyValue ) ) )* otherlv_23= ')' )? )? ( (lv_description_24_0= RULE_STRING ) )? otherlv_25= ';' ) )
            // InternalSADL.g:2827:2: (otherlv_0= 'connect' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '(' (otherlv_3= 'self' | ( ( ruleQualifiedName ) ) ) otherlv_5= '::' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ',' (otherlv_10= 'self' | ( ( ruleQualifiedName ) ) ) otherlv_12= '::' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '.' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= ')' (otherlv_17= 'using' ( (otherlv_18= RULE_ID ) ) (otherlv_19= '(' ( (lv_value_20_0= rulePropertyValue ) ) (otherlv_21= ',' ( (lv_value_22_0= rulePropertyValue ) ) )* otherlv_23= ')' )? )? ( (lv_description_24_0= RULE_STRING ) )? otherlv_25= ';' )
            {
            // InternalSADL.g:2827:2: (otherlv_0= 'connect' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '(' (otherlv_3= 'self' | ( ( ruleQualifiedName ) ) ) otherlv_5= '::' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ',' (otherlv_10= 'self' | ( ( ruleQualifiedName ) ) ) otherlv_12= '::' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '.' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= ')' (otherlv_17= 'using' ( (otherlv_18= RULE_ID ) ) (otherlv_19= '(' ( (lv_value_20_0= rulePropertyValue ) ) (otherlv_21= ',' ( (lv_value_22_0= rulePropertyValue ) ) )* otherlv_23= ')' )? )? ( (lv_description_24_0= RULE_STRING ) )? otherlv_25= ';' )
            // InternalSADL.g:2828:3: otherlv_0= 'connect' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '(' (otherlv_3= 'self' | ( ( ruleQualifiedName ) ) ) otherlv_5= '::' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ',' (otherlv_10= 'self' | ( ( ruleQualifiedName ) ) ) otherlv_12= '::' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '.' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= ')' (otherlv_17= 'using' ( (otherlv_18= RULE_ID ) ) (otherlv_19= '(' ( (lv_value_20_0= rulePropertyValue ) ) (otherlv_21= ',' ( (lv_value_22_0= rulePropertyValue ) ) )* otherlv_23= ')' )? )? ( (lv_description_24_0= RULE_STRING ) )? otherlv_25= ';'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConnectionAccess().getConnectKeyword_0());
              		
            }
            // InternalSADL.g:2832:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalSADL.g:2833:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalSADL.g:2833:4: (lv_name_1_0= RULE_ID )
                    // InternalSADL.g:2834:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_1_0, grammarAccess.getConnectionAccess().getNameIDTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getConnectionRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_1_0,
                      						"org.eclipse.xtext.common.Terminals.ID");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,27,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getConnectionAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalSADL.g:2854:3: (otherlv_3= 'self' | ( ( ruleQualifiedName ) ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==55) ) {
                alt60=1;
            }
            else if ( (LA60_0==RULE_ID) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalSADL.g:2855:4: otherlv_3= 'self'
                    {
                    otherlv_3=(Token)match(input,55,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getConnectionAccess().getSelfKeyword_3_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSADL.g:2860:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalSADL.g:2860:4: ( ( ruleQualifiedName ) )
                    // InternalSADL.g:2861:5: ( ruleQualifiedName )
                    {
                    // InternalSADL.g:2861:5: ( ruleQualifiedName )
                    // InternalSADL.g:2862:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConnectionRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConnectionAccess().getFromComponentInstanceCrossReference_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_61);
                    ruleQualifiedName();

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

            otherlv_5=(Token)match(input,56,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getConnectionAccess().getColonColonKeyword_4());
              		
            }
            // InternalSADL.g:2881:3: ( (otherlv_6= RULE_ID ) )
            // InternalSADL.g:2882:4: (otherlv_6= RULE_ID )
            {
            // InternalSADL.g:2882:4: (otherlv_6= RULE_ID )
            // InternalSADL.g:2883:5: otherlv_6= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConnectionRule());
              					}
              				
            }
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_6, grammarAccess.getConnectionAccess().getSourcePortCrossReference_5_0());
              				
            }

            }


            }

            // InternalSADL.g:2894:3: (otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==14) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalSADL.g:2895:4: otherlv_7= '.' ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,14,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_7, grammarAccess.getConnectionAccess().getFullStopKeyword_6_0());
            	      			
            	    }
            	    // InternalSADL.g:2899:4: ( (otherlv_8= RULE_ID ) )
            	    // InternalSADL.g:2900:5: (otherlv_8= RULE_ID )
            	    {
            	    // InternalSADL.g:2900:5: (otherlv_8= RULE_ID )
            	    // InternalSADL.g:2901:6: otherlv_8= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getConnectionRule());
            	      						}
            	      					
            	    }
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_62); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_8, grammarAccess.getConnectionAccess().getSourcePortCrossReference_6_1_0());
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

            otherlv_9=(Token)match(input,44,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getConnectionAccess().getCommaKeyword_7());
              		
            }
            // InternalSADL.g:2917:3: (otherlv_10= 'self' | ( ( ruleQualifiedName ) ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==55) ) {
                alt62=1;
            }
            else if ( (LA62_0==RULE_ID) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalSADL.g:2918:4: otherlv_10= 'self'
                    {
                    otherlv_10=(Token)match(input,55,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getConnectionAccess().getSelfKeyword_8_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSADL.g:2923:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalSADL.g:2923:4: ( ( ruleQualifiedName ) )
                    // InternalSADL.g:2924:5: ( ruleQualifiedName )
                    {
                    // InternalSADL.g:2924:5: ( ruleQualifiedName )
                    // InternalSADL.g:2925:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConnectionRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConnectionAccess().getToComponentInstanceCrossReference_8_1_0());
                      					
                    }
                    pushFollow(FOLLOW_61);
                    ruleQualifiedName();

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

            otherlv_12=(Token)match(input,56,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getConnectionAccess().getColonColonKeyword_9());
              		
            }
            // InternalSADL.g:2944:3: ( (otherlv_13= RULE_ID ) )
            // InternalSADL.g:2945:4: (otherlv_13= RULE_ID )
            {
            // InternalSADL.g:2945:4: (otherlv_13= RULE_ID )
            // InternalSADL.g:2946:5: otherlv_13= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConnectionRule());
              					}
              				
            }
            otherlv_13=(Token)match(input,RULE_ID,FOLLOW_63); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_13, grammarAccess.getConnectionAccess().getDestinationPortCrossReference_10_0());
              				
            }

            }


            }

            // InternalSADL.g:2957:3: (otherlv_14= '.' ( (otherlv_15= RULE_ID ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==14) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalSADL.g:2958:4: otherlv_14= '.' ( (otherlv_15= RULE_ID ) )
            	    {
            	    otherlv_14=(Token)match(input,14,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_14, grammarAccess.getConnectionAccess().getFullStopKeyword_11_0());
            	      			
            	    }
            	    // InternalSADL.g:2962:4: ( (otherlv_15= RULE_ID ) )
            	    // InternalSADL.g:2963:5: (otherlv_15= RULE_ID )
            	    {
            	    // InternalSADL.g:2963:5: (otherlv_15= RULE_ID )
            	    // InternalSADL.g:2964:6: otherlv_15= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getConnectionRule());
            	      						}
            	      					
            	    }
            	    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_63); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_15, grammarAccess.getConnectionAccess().getDestinationPortCrossReference_11_1_0());
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            otherlv_16=(Token)match(input,28,FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_16, grammarAccess.getConnectionAccess().getRightParenthesisKeyword_12());
              		
            }
            // InternalSADL.g:2980:3: (otherlv_17= 'using' ( (otherlv_18= RULE_ID ) ) (otherlv_19= '(' ( (lv_value_20_0= rulePropertyValue ) ) (otherlv_21= ',' ( (lv_value_22_0= rulePropertyValue ) ) )* otherlv_23= ')' )? )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==57) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalSADL.g:2981:4: otherlv_17= 'using' ( (otherlv_18= RULE_ID ) ) (otherlv_19= '(' ( (lv_value_20_0= rulePropertyValue ) ) (otherlv_21= ',' ( (lv_value_22_0= rulePropertyValue ) ) )* otherlv_23= ')' )?
                    {
                    otherlv_17=(Token)match(input,57,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getConnectionAccess().getUsingKeyword_13_0());
                      			
                    }
                    // InternalSADL.g:2985:4: ( (otherlv_18= RULE_ID ) )
                    // InternalSADL.g:2986:5: (otherlv_18= RULE_ID )
                    {
                    // InternalSADL.g:2986:5: (otherlv_18= RULE_ID )
                    // InternalSADL.g:2987:6: otherlv_18= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConnectionRule());
                      						}
                      					
                    }
                    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_18, grammarAccess.getConnectionAccess().getStrategyStrategyCrossReference_13_1_0());
                      					
                    }

                    }


                    }

                    // InternalSADL.g:2998:4: (otherlv_19= '(' ( (lv_value_20_0= rulePropertyValue ) ) (otherlv_21= ',' ( (lv_value_22_0= rulePropertyValue ) ) )* otherlv_23= ')' )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==27) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // InternalSADL.g:2999:5: otherlv_19= '(' ( (lv_value_20_0= rulePropertyValue ) ) (otherlv_21= ',' ( (lv_value_22_0= rulePropertyValue ) ) )* otherlv_23= ')'
                            {
                            otherlv_19=(Token)match(input,27,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_19, grammarAccess.getConnectionAccess().getLeftParenthesisKeyword_13_2_0());
                              				
                            }
                            // InternalSADL.g:3003:5: ( (lv_value_20_0= rulePropertyValue ) )
                            // InternalSADL.g:3004:6: (lv_value_20_0= rulePropertyValue )
                            {
                            // InternalSADL.g:3004:6: (lv_value_20_0= rulePropertyValue )
                            // InternalSADL.g:3005:7: lv_value_20_0= rulePropertyValue
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getConnectionAccess().getValuePropertyValueParserRuleCall_13_2_1_0());
                              						
                            }
                            pushFollow(FOLLOW_43);
                            lv_value_20_0=rulePropertyValue();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getConnectionRule());
                              							}
                              							add(
                              								current,
                              								"value",
                              								lv_value_20_0,
                              								"com.leonardo.lsaf.sadl.SADL.PropertyValue");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalSADL.g:3022:5: (otherlv_21= ',' ( (lv_value_22_0= rulePropertyValue ) ) )*
                            loop64:
                            do {
                                int alt64=2;
                                int LA64_0 = input.LA(1);

                                if ( (LA64_0==44) ) {
                                    alt64=1;
                                }


                                switch (alt64) {
                            	case 1 :
                            	    // InternalSADL.g:3023:6: otherlv_21= ',' ( (lv_value_22_0= rulePropertyValue ) )
                            	    {
                            	    otherlv_21=(Token)match(input,44,FOLLOW_4); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_21, grammarAccess.getConnectionAccess().getCommaKeyword_13_2_2_0());
                            	      					
                            	    }
                            	    // InternalSADL.g:3027:6: ( (lv_value_22_0= rulePropertyValue ) )
                            	    // InternalSADL.g:3028:7: (lv_value_22_0= rulePropertyValue )
                            	    {
                            	    // InternalSADL.g:3028:7: (lv_value_22_0= rulePropertyValue )
                            	    // InternalSADL.g:3029:8: lv_value_22_0= rulePropertyValue
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getConnectionAccess().getValuePropertyValueParserRuleCall_13_2_2_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_43);
                            	    lv_value_22_0=rulePropertyValue();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getConnectionRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"value",
                            	      									lv_value_22_0,
                            	      									"com.leonardo.lsaf.sadl.SADL.PropertyValue");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop64;
                                }
                            } while (true);

                            otherlv_23=(Token)match(input,28,FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_23, grammarAccess.getConnectionAccess().getRightParenthesisKeyword_13_2_3());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalSADL.g:3053:3: ( (lv_description_24_0= RULE_STRING ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_STRING) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalSADL.g:3054:4: (lv_description_24_0= RULE_STRING )
                    {
                    // InternalSADL.g:3054:4: (lv_description_24_0= RULE_STRING )
                    // InternalSADL.g:3055:5: lv_description_24_0= RULE_STRING
                    {
                    lv_description_24_0=(Token)match(input,RULE_STRING,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_description_24_0, grammarAccess.getConnectionAccess().getDescriptionSTRINGTerminalRuleCall_14_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getConnectionRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"description",
                      						lv_description_24_0,
                      						"org.eclipse.xtext.common.Terminals.STRING");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_25=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getConnectionAccess().getSemicolonKeyword_15());
              		
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
    // $ANTLR end "ruleConnection"


    // $ANTLR start "entryRuleDeployment"
    // InternalSADL.g:3079:1: entryRuleDeployment returns [EObject current=null] : iv_ruleDeployment= ruleDeployment EOF ;
    public final EObject entryRuleDeployment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeployment = null;


        try {
            // InternalSADL.g:3079:51: (iv_ruleDeployment= ruleDeployment EOF )
            // InternalSADL.g:3080:2: iv_ruleDeployment= ruleDeployment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeploymentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDeployment=ruleDeployment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeployment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDeployment"


    // $ANTLR start "ruleDeployment"
    // InternalSADL.g:3086:1: ruleDeployment returns [EObject current=null] : (otherlv_0= 'deployment' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( (lv_containermapping_3_0= ruleContainerMapping ) ) | ( (lv_connectionmapping_4_0= ruleConnectionMapping ) ) )* otherlv_5= 'end' ) ;
    public final EObject ruleDeployment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_5=null;
        EObject lv_containermapping_3_0 = null;

        EObject lv_connectionmapping_4_0 = null;



        	enterRule();

        try {
            // InternalSADL.g:3092:2: ( (otherlv_0= 'deployment' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( (lv_containermapping_3_0= ruleContainerMapping ) ) | ( (lv_connectionmapping_4_0= ruleConnectionMapping ) ) )* otherlv_5= 'end' ) )
            // InternalSADL.g:3093:2: (otherlv_0= 'deployment' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( (lv_containermapping_3_0= ruleContainerMapping ) ) | ( (lv_connectionmapping_4_0= ruleConnectionMapping ) ) )* otherlv_5= 'end' )
            {
            // InternalSADL.g:3093:2: (otherlv_0= 'deployment' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( (lv_containermapping_3_0= ruleContainerMapping ) ) | ( (lv_connectionmapping_4_0= ruleConnectionMapping ) ) )* otherlv_5= 'end' )
            // InternalSADL.g:3094:3: otherlv_0= 'deployment' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( (lv_containermapping_3_0= ruleContainerMapping ) ) | ( (lv_connectionmapping_4_0= ruleConnectionMapping ) ) )* otherlv_5= 'end'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDeploymentAccess().getDeploymentKeyword_0());
              		
            }
            // InternalSADL.g:3098:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSADL.g:3099:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSADL.g:3099:4: (lv_name_1_0= RULE_ID )
            // InternalSADL.g:3100:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDeploymentAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDeploymentRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalSADL.g:3116:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_STRING) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalSADL.g:3117:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalSADL.g:3117:4: (lv_description_2_0= RULE_STRING )
                    // InternalSADL.g:3118:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_66); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_description_2_0, grammarAccess.getDeploymentAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDeploymentRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"description",
                      						lv_description_2_0,
                      						"org.eclipse.xtext.common.Terminals.STRING");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSADL.g:3134:3: ( ( (lv_containermapping_3_0= ruleContainerMapping ) ) | ( (lv_connectionmapping_4_0= ruleConnectionMapping ) ) )*
            loop69:
            do {
                int alt69=3;
                alt69 = dfa69.predict(input);
                switch (alt69) {
            	case 1 :
            	    // InternalSADL.g:3135:4: ( (lv_containermapping_3_0= ruleContainerMapping ) )
            	    {
            	    // InternalSADL.g:3135:4: ( (lv_containermapping_3_0= ruleContainerMapping ) )
            	    // InternalSADL.g:3136:5: (lv_containermapping_3_0= ruleContainerMapping )
            	    {
            	    // InternalSADL.g:3136:5: (lv_containermapping_3_0= ruleContainerMapping )
            	    // InternalSADL.g:3137:6: lv_containermapping_3_0= ruleContainerMapping
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDeploymentAccess().getContainermappingContainerMappingParserRuleCall_3_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_66);
            	    lv_containermapping_3_0=ruleContainerMapping();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDeploymentRule());
            	      						}
            	      						add(
            	      							current,
            	      							"containermapping",
            	      							lv_containermapping_3_0,
            	      							"com.leonardo.lsaf.sadl.SADL.ContainerMapping");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSADL.g:3155:4: ( (lv_connectionmapping_4_0= ruleConnectionMapping ) )
            	    {
            	    // InternalSADL.g:3155:4: ( (lv_connectionmapping_4_0= ruleConnectionMapping ) )
            	    // InternalSADL.g:3156:5: (lv_connectionmapping_4_0= ruleConnectionMapping )
            	    {
            	    // InternalSADL.g:3156:5: (lv_connectionmapping_4_0= ruleConnectionMapping )
            	    // InternalSADL.g:3157:6: lv_connectionmapping_4_0= ruleConnectionMapping
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDeploymentAccess().getConnectionmappingConnectionMappingParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_66);
            	    lv_connectionmapping_4_0=ruleConnectionMapping();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDeploymentRule());
            	      						}
            	      						add(
            	      							current,
            	      							"connectionmapping",
            	      							lv_connectionmapping_4_0,
            	      							"com.leonardo.lsaf.sadl.SADL.ConnectionMapping");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDeploymentAccess().getEndKeyword_4());
              		
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
    // $ANTLR end "ruleDeployment"


    // $ANTLR start "entryRuleContainerMapping"
    // InternalSADL.g:3183:1: entryRuleContainerMapping returns [EObject current=null] : iv_ruleContainerMapping= ruleContainerMapping EOF ;
    public final EObject entryRuleContainerMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerMapping = null;


        try {
            // InternalSADL.g:3183:57: (iv_ruleContainerMapping= ruleContainerMapping EOF )
            // InternalSADL.g:3184:2: iv_ruleContainerMapping= ruleContainerMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerMappingRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContainerMapping=ruleContainerMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainerMapping; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleContainerMapping"


    // $ANTLR start "ruleContainerMapping"
    // InternalSADL.g:3190:1: ruleContainerMapping returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= 'hosts' ( ( ruleQualifiedName ) ) otherlv_3= ';' ) ;
    public final EObject ruleContainerMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSADL.g:3196:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= 'hosts' ( ( ruleQualifiedName ) ) otherlv_3= ';' ) )
            // InternalSADL.g:3197:2: ( ( ( ruleQualifiedName ) ) otherlv_1= 'hosts' ( ( ruleQualifiedName ) ) otherlv_3= ';' )
            {
            // InternalSADL.g:3197:2: ( ( ( ruleQualifiedName ) ) otherlv_1= 'hosts' ( ( ruleQualifiedName ) ) otherlv_3= ';' )
            // InternalSADL.g:3198:3: ( ( ruleQualifiedName ) ) otherlv_1= 'hosts' ( ( ruleQualifiedName ) ) otherlv_3= ';'
            {
            // InternalSADL.g:3198:3: ( ( ruleQualifiedName ) )
            // InternalSADL.g:3199:4: ( ruleQualifiedName )
            {
            // InternalSADL.g:3199:4: ( ruleQualifiedName )
            // InternalSADL.g:3200:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getContainerMappingRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContainerMappingAccess().getProcessorProcessorCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_67);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,59,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getContainerMappingAccess().getHostsKeyword_1());
              		
            }
            // InternalSADL.g:3218:3: ( ( ruleQualifiedName ) )
            // InternalSADL.g:3219:4: ( ruleQualifiedName )
            {
            // InternalSADL.g:3219:4: ( ruleQualifiedName )
            // InternalSADL.g:3220:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getContainerMappingRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContainerMappingAccess().getContainerContainerCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_10);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getContainerMappingAccess().getSemicolonKeyword_3());
              		
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
    // $ANTLR end "ruleContainerMapping"


    // $ANTLR start "entryRuleConnectionMapping"
    // InternalSADL.g:3242:1: entryRuleConnectionMapping returns [EObject current=null] : iv_ruleConnectionMapping= ruleConnectionMapping EOF ;
    public final EObject entryRuleConnectionMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectionMapping = null;


        try {
            // InternalSADL.g:3242:58: (iv_ruleConnectionMapping= ruleConnectionMapping EOF )
            // InternalSADL.g:3243:2: iv_ruleConnectionMapping= ruleConnectionMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConnectionMappingRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConnectionMapping=ruleConnectionMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConnectionMapping; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConnectionMapping"


    // $ANTLR start "ruleConnectionMapping"
    // InternalSADL.g:3249:1: ruleConnectionMapping returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= 'carries' ( ( ruleQualifiedName ) ) otherlv_3= ';' ) ;
    public final EObject ruleConnectionMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSADL.g:3255:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= 'carries' ( ( ruleQualifiedName ) ) otherlv_3= ';' ) )
            // InternalSADL.g:3256:2: ( ( ( ruleQualifiedName ) ) otherlv_1= 'carries' ( ( ruleQualifiedName ) ) otherlv_3= ';' )
            {
            // InternalSADL.g:3256:2: ( ( ( ruleQualifiedName ) ) otherlv_1= 'carries' ( ( ruleQualifiedName ) ) otherlv_3= ';' )
            // InternalSADL.g:3257:3: ( ( ruleQualifiedName ) ) otherlv_1= 'carries' ( ( ruleQualifiedName ) ) otherlv_3= ';'
            {
            // InternalSADL.g:3257:3: ( ( ruleQualifiedName ) )
            // InternalSADL.g:3258:4: ( ruleQualifiedName )
            {
            // InternalSADL.g:3258:4: ( ruleQualifiedName )
            // InternalSADL.g:3259:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConnectionMappingRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConnectionMappingAccess().getLinkLinkCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_68);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,60,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConnectionMappingAccess().getCarriesKeyword_1());
              		
            }
            // InternalSADL.g:3277:3: ( ( ruleQualifiedName ) )
            // InternalSADL.g:3278:4: ( ruleQualifiedName )
            {
            // InternalSADL.g:3278:4: ( ruleQualifiedName )
            // InternalSADL.g:3279:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConnectionMappingRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConnectionMappingAccess().getConnectionConnectionCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_10);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getConnectionMappingAccess().getSemicolonKeyword_3());
              		
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
    // $ANTLR end "ruleConnectionMapping"


    // $ANTLR start "entryRuleStrategy"
    // InternalSADL.g:3301:1: entryRuleStrategy returns [EObject current=null] : iv_ruleStrategy= ruleStrategy EOF ;
    public final EObject entryRuleStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrategy = null;


        try {
            // InternalSADL.g:3301:49: (iv_ruleStrategy= ruleStrategy EOF )
            // InternalSADL.g:3302:2: iv_ruleStrategy= ruleStrategy EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStrategyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStrategy=ruleStrategy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStrategy; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStrategy"


    // $ANTLR start "ruleStrategy"
    // InternalSADL.g:3308:1: ruleStrategy returns [EObject current=null] : (otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= 'end' ) ;
    public final EObject ruleStrategy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_4=null;
        EObject lv_properties_3_0 = null;



        	enterRule();

        try {
            // InternalSADL.g:3314:2: ( (otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= 'end' ) )
            // InternalSADL.g:3315:2: (otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= 'end' )
            {
            // InternalSADL.g:3315:2: (otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= 'end' )
            // InternalSADL.g:3316:3: otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStrategyAccess().getStrategyKeyword_0());
              		
            }
            // InternalSADL.g:3320:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSADL.g:3321:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSADL.g:3321:4: (lv_name_1_0= RULE_ID )
            // InternalSADL.g:3322:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getStrategyAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getStrategyRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalSADL.g:3338:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_STRING) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalSADL.g:3339:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalSADL.g:3339:4: (lv_description_2_0= RULE_STRING )
                    // InternalSADL.g:3340:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_description_2_0, grammarAccess.getStrategyAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getStrategyRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"description",
                      						lv_description_2_0,
                      						"org.eclipse.xtext.common.Terminals.STRING");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSADL.g:3356:3: ( (lv_properties_3_0= ruleProperty ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==46) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalSADL.g:3357:4: (lv_properties_3_0= ruleProperty )
            	    {
            	    // InternalSADL.g:3357:4: (lv_properties_3_0= ruleProperty )
            	    // InternalSADL.g:3358:5: lv_properties_3_0= ruleProperty
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getStrategyAccess().getPropertiesPropertyParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_51);
            	    lv_properties_3_0=ruleProperty();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getStrategyRule());
            	      					}
            	      					add(
            	      						current,
            	      						"properties",
            	      						lv_properties_3_0,
            	      						"com.leonardo.lsaf.sadl.SADL.Property");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getStrategyAccess().getEndKeyword_4());
              		
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
    // $ANTLR end "ruleStrategy"

    // Delegated rules


    protected DFA69 dfa69 = new DFA69(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\1\5\1\uffff\1\16\1\5\2\uffff\1\16";
    static final String dfa_3s = "\1\15\1\uffff\1\74\1\5\2\uffff\1\74";
    static final String dfa_4s = "\1\uffff\1\3\2\uffff\1\1\1\2\1\uffff";
    static final String dfa_5s = "\7\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\7\uffff\1\1",
            "",
            "\1\3\54\uffff\1\4\1\5",
            "\1\6",
            "",
            "",
            "\1\3\54\uffff\1\4\1\5"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 3134:3: ( ( (lv_containermapping_3_0= ruleContainerMapping ) ) | ( (lv_connectionmapping_4_0= ruleConnectionMapping ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x2417010000F4A010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x2417010000F4A000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000A0040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800002010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800002000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000C0002010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000C0002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000280002010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000280002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000029080040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000029010040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000029000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100020010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000009020050L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000008020010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000060000002010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000060000002000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000280000002010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000280000002000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000100010000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000800000020010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000400000002010L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000400000002000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0008000000002010L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0008000000002000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0068000000002010L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0068000000002000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0020000800002010L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0020000800002000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000001020010L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0080000000000020L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000100000004000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000010004000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0200000000020010L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x1000000000000000L});

}