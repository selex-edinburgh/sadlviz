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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_EXP", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'end'", "'.'", "'unit'", "':'", "';'", "'component'", "'primitive'", "'-'", "'interface'", "'enum'", "'topic'", "'alias'", "'['", "'*'", "']'", "'('", "')'", "'as'", "'value'", "'deprecated'", "'='", "'attribute'", "'..'", "'port'", "'receives'", "'sends'", "'requires'", "'provides'", "'platform'", "'processor'", "'link'", "'connects'", "','", "'over'", "'property'", "'?'", "'transport'", "'application'", "'container'", "'instance'", "'connect'", "'self'", "'::'", "'to'", "'using'", "'deployment'", "'hosts'", "'carries'", "'strategy'"
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

                if ( (LA3_0==15||(LA3_0>=18 && LA3_0<=19)||(LA3_0>=21 && LA3_0<=24)||LA3_0==41||(LA3_0>=49 && LA3_0<=50)||LA3_0==58||LA3_0==61) ) {
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
    // InternalSADL.g:248:1: rulePackageableElement returns [EObject current=null] : (this_Unit_0= ruleUnit | this_Type_1= ruleType | this_Component_2= ruleComponent | this_Interface_3= ruleInterface | this_Platform_4= rulePlatform | this_Application_5= ruleApplication | this_Transport_6= ruleTransport | this_Strategy_7= ruleStrategy | this_Deployment_8= ruleDeployment ) ;
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



        	enterRule();

        try {
            // InternalSADL.g:254:2: ( (this_Unit_0= ruleUnit | this_Type_1= ruleType | this_Component_2= ruleComponent | this_Interface_3= ruleInterface | this_Platform_4= rulePlatform | this_Application_5= ruleApplication | this_Transport_6= ruleTransport | this_Strategy_7= ruleStrategy | this_Deployment_8= ruleDeployment ) )
            // InternalSADL.g:255:2: (this_Unit_0= ruleUnit | this_Type_1= ruleType | this_Component_2= ruleComponent | this_Interface_3= ruleInterface | this_Platform_4= rulePlatform | this_Application_5= ruleApplication | this_Transport_6= ruleTransport | this_Strategy_7= ruleStrategy | this_Deployment_8= ruleDeployment )
            {
            // InternalSADL.g:255:2: (this_Unit_0= ruleUnit | this_Type_1= ruleType | this_Component_2= ruleComponent | this_Interface_3= ruleInterface | this_Platform_4= rulePlatform | this_Application_5= ruleApplication | this_Transport_6= ruleTransport | this_Strategy_7= ruleStrategy | this_Deployment_8= ruleDeployment )
            int alt5=9;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt5=1;
                }
                break;
            case 19:
            case 22:
            case 23:
            case 24:
                {
                alt5=2;
                }
                break;
            case 18:
                {
                alt5=3;
                }
                break;
            case 21:
                {
                alt5=4;
                }
                break;
            case 41:
                {
                alt5=5;
                }
                break;
            case 50:
                {
                alt5=6;
                }
                break;
            case 49:
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
    // InternalSADL.g:340:1: entryRuleUnit returns [EObject current=null] : iv_ruleUnit= ruleUnit EOF ;
    public final EObject entryRuleUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnit = null;


        try {
            // InternalSADL.g:340:45: (iv_ruleUnit= ruleUnit EOF )
            // InternalSADL.g:341:2: iv_ruleUnit= ruleUnit EOF
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
    // InternalSADL.g:347:1: ruleUnit returns [EObject current=null] : (otherlv_0= 'unit' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) )? ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= ';' ) ;
    public final EObject ruleUnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalSADL.g:353:2: ( (otherlv_0= 'unit' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) )? ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= ';' ) )
            // InternalSADL.g:354:2: (otherlv_0= 'unit' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) )? ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= ';' )
            {
            // InternalSADL.g:354:2: (otherlv_0= 'unit' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) )? ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= ';' )
            // InternalSADL.g:355:3: otherlv_0= 'unit' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) )? ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getUnitAccess().getUnitKeyword_0());
              		
            }
            // InternalSADL.g:359:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSADL.g:360:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSADL.g:360:4: (lv_name_1_0= RULE_ID )
            // InternalSADL.g:361:5: lv_name_1_0= RULE_ID
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

            // InternalSADL.g:377:3: (otherlv_2= ':' ( ( ruleQualifiedName ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSADL.g:378:4: otherlv_2= ':' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getUnitAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalSADL.g:382:4: ( ( ruleQualifiedName ) )
                    // InternalSADL.g:383:5: ( ruleQualifiedName )
                    {
                    // InternalSADL.g:383:5: ( ruleQualifiedName )
                    // InternalSADL.g:384:6: ruleQualifiedName
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

            // InternalSADL.g:399:3: ( (lv_description_4_0= RULE_STRING ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSADL.g:400:4: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalSADL.g:400:4: (lv_description_4_0= RULE_STRING )
                    // InternalSADL.g:401:5: lv_description_4_0= RULE_STRING
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
    // InternalSADL.g:425:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalSADL.g:425:45: (iv_ruleType= ruleType EOF )
            // InternalSADL.g:426:2: iv_ruleType= ruleType EOF
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
    // InternalSADL.g:432:1: ruleType returns [EObject current=null] : (this_Primitive_0= rulePrimitive | this_Enumeration_1= ruleEnumeration | this_Topic_2= ruleTopic | this_Alias_3= ruleAlias ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Primitive_0 = null;

        EObject this_Enumeration_1 = null;

        EObject this_Topic_2 = null;

        EObject this_Alias_3 = null;



        	enterRule();

        try {
            // InternalSADL.g:438:2: ( (this_Primitive_0= rulePrimitive | this_Enumeration_1= ruleEnumeration | this_Topic_2= ruleTopic | this_Alias_3= ruleAlias ) )
            // InternalSADL.g:439:2: (this_Primitive_0= rulePrimitive | this_Enumeration_1= ruleEnumeration | this_Topic_2= ruleTopic | this_Alias_3= ruleAlias )
            {
            // InternalSADL.g:439:2: (this_Primitive_0= rulePrimitive | this_Enumeration_1= ruleEnumeration | this_Topic_2= ruleTopic | this_Alias_3= ruleAlias )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt8=1;
                }
                break;
            case 22:
                {
                alt8=2;
                }
                break;
            case 23:
                {
                alt8=3;
                }
                break;
            case 24:
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
                    // InternalSADL.g:440:3: this_Primitive_0= rulePrimitive
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
                    // InternalSADL.g:449:3: this_Enumeration_1= ruleEnumeration
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
                    // InternalSADL.g:458:3: this_Topic_2= ruleTopic
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
                    // InternalSADL.g:467:3: this_Alias_3= ruleAlias
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


    // $ANTLR start "entryRuleComponent"
    // InternalSADL.g:479:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalSADL.g:479:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalSADL.g:480:2: iv_ruleComponent= ruleComponent EOF
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
    // InternalSADL.g:486:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_ports_3_0= rulePort ) )* otherlv_4= 'end' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_4=null;
        EObject lv_ports_3_0 = null;



        	enterRule();

        try {
            // InternalSADL.g:492:2: ( (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_ports_3_0= rulePort ) )* otherlv_4= 'end' ) )
            // InternalSADL.g:493:2: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_ports_3_0= rulePort ) )* otherlv_4= 'end' )
            {
            // InternalSADL.g:493:2: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_ports_3_0= rulePort ) )* otherlv_4= 'end' )
            // InternalSADL.g:494:3: otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_ports_3_0= rulePort ) )* otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
              		
            }
            // InternalSADL.g:498:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSADL.g:499:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSADL.g:499:4: (lv_name_1_0= RULE_ID )
            // InternalSADL.g:500:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
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

            // InternalSADL.g:516:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSADL.g:517:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalSADL.g:517:4: (lv_description_2_0= RULE_STRING )
                    // InternalSADL.g:518:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_12); if (state.failed) return current;
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

            // InternalSADL.g:534:3: ( (lv_ports_3_0= rulePort ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==36) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSADL.g:535:4: (lv_ports_3_0= rulePort )
            	    {
            	    // InternalSADL.g:535:4: (lv_ports_3_0= rulePort )
            	    // InternalSADL.g:536:5: lv_ports_3_0= rulePort
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getComponentAccess().getPortsPortParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_ports_3_0=rulePort();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getComponentRule());
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
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getEndKeyword_4());
              		
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


    // $ANTLR start "entryRulePrimitive"
    // InternalSADL.g:561:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // InternalSADL.g:561:50: (iv_rulePrimitive= rulePrimitive EOF )
            // InternalSADL.g:562:2: iv_rulePrimitive= rulePrimitive EOF
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
    // InternalSADL.g:568:1: rulePrimitive returns [EObject current=null] : (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_min_2_0= ruleReal ) ) ( ( '-' | RULE_INT )=> (lv_max_3_0= ruleReal ) ) (otherlv_4= ':' ( (lv_res_5_0= ruleReal ) ) )? )? otherlv_6= ';' ) ;
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
            // InternalSADL.g:574:2: ( (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_min_2_0= ruleReal ) ) ( ( '-' | RULE_INT )=> (lv_max_3_0= ruleReal ) ) (otherlv_4= ':' ( (lv_res_5_0= ruleReal ) ) )? )? otherlv_6= ';' ) )
            // InternalSADL.g:575:2: (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_min_2_0= ruleReal ) ) ( ( '-' | RULE_INT )=> (lv_max_3_0= ruleReal ) ) (otherlv_4= ':' ( (lv_res_5_0= ruleReal ) ) )? )? otherlv_6= ';' )
            {
            // InternalSADL.g:575:2: (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_min_2_0= ruleReal ) ) ( ( '-' | RULE_INT )=> (lv_max_3_0= ruleReal ) ) (otherlv_4= ':' ( (lv_res_5_0= ruleReal ) ) )? )? otherlv_6= ';' )
            // InternalSADL.g:576:3: otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_min_2_0= ruleReal ) ) ( ( '-' | RULE_INT )=> (lv_max_3_0= ruleReal ) ) (otherlv_4= ':' ( (lv_res_5_0= ruleReal ) ) )? )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPrimitiveAccess().getPrimitiveKeyword_0());
              		
            }
            // InternalSADL.g:580:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSADL.g:581:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSADL.g:581:4: (lv_name_1_0= RULE_ID )
            // InternalSADL.g:582:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
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

            // InternalSADL.g:598:3: ( ( (lv_min_2_0= ruleReal ) ) ( ( '-' | RULE_INT )=> (lv_max_3_0= ruleReal ) ) (otherlv_4= ':' ( (lv_res_5_0= ruleReal ) ) )? )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT||LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSADL.g:599:4: ( (lv_min_2_0= ruleReal ) ) ( ( '-' | RULE_INT )=> (lv_max_3_0= ruleReal ) ) (otherlv_4= ':' ( (lv_res_5_0= ruleReal ) ) )?
                    {
                    // InternalSADL.g:599:4: ( (lv_min_2_0= ruleReal ) )
                    // InternalSADL.g:600:5: (lv_min_2_0= ruleReal )
                    {
                    // InternalSADL.g:600:5: (lv_min_2_0= ruleReal )
                    // InternalSADL.g:601:6: lv_min_2_0= ruleReal
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimitiveAccess().getMinRealParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
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

                    // InternalSADL.g:618:4: ( ( '-' | RULE_INT )=> (lv_max_3_0= ruleReal ) )
                    // InternalSADL.g:619:5: ( '-' | RULE_INT )=> (lv_max_3_0= ruleReal )
                    {
                    // InternalSADL.g:620:5: (lv_max_3_0= ruleReal )
                    // InternalSADL.g:621:6: lv_max_3_0= ruleReal
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimitiveAccess().getMaxRealParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_15);
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

                    // InternalSADL.g:638:4: (otherlv_4= ':' ( (lv_res_5_0= ruleReal ) ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==16) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalSADL.g:639:5: otherlv_4= ':' ( (lv_res_5_0= ruleReal ) )
                            {
                            otherlv_4=(Token)match(input,16,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getPrimitiveAccess().getColonKeyword_2_2_0());
                              				
                            }
                            // InternalSADL.g:643:5: ( (lv_res_5_0= ruleReal ) )
                            // InternalSADL.g:644:6: (lv_res_5_0= ruleReal )
                            {
                            // InternalSADL.g:644:6: (lv_res_5_0= ruleReal )
                            // InternalSADL.g:645:7: lv_res_5_0= ruleReal
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
    // InternalSADL.g:672:1: entryRuleReal returns [String current=null] : iv_ruleReal= ruleReal EOF ;
    public final String entryRuleReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReal = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSADL.g:674:2: (iv_ruleReal= ruleReal EOF )
            // InternalSADL.g:675:2: iv_ruleReal= ruleReal EOF
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
    // InternalSADL.g:684:1: ruleReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' (this_EXP_3= RULE_EXP | this_INT_4= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_EXP_3=null;
        Token this_INT_4=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSADL.g:691:2: ( ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' (this_EXP_3= RULE_EXP | this_INT_4= RULE_INT ) ) )
            // InternalSADL.g:692:2: ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' (this_EXP_3= RULE_EXP | this_INT_4= RULE_INT ) )
            {
            // InternalSADL.g:692:2: ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' (this_EXP_3= RULE_EXP | this_INT_4= RULE_INT ) )
            // InternalSADL.g:693:3: (kw= '-' )? this_INT_1= RULE_INT kw= '.' (this_EXP_3= RULE_EXP | this_INT_4= RULE_INT )
            {
            // InternalSADL.g:693:3: (kw= '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSADL.g:694:4: kw= '-'
                    {
                    kw=(Token)match(input,20,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getRealAccess().getHyphenMinusKeyword_0());
                      			
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_1, grammarAccess.getRealAccess().getINTTerminalRuleCall_1());
              		
            }
            kw=(Token)match(input,14,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRealAccess().getFullStopKeyword_2());
              		
            }
            // InternalSADL.g:712:3: (this_EXP_3= RULE_EXP | this_INT_4= RULE_INT )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_EXP) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_INT) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalSADL.g:713:4: this_EXP_3= RULE_EXP
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
                    // InternalSADL.g:721:4: this_INT_4= RULE_INT
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
    // InternalSADL.g:736:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalSADL.g:736:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalSADL.g:737:2: iv_ruleInterface= ruleInterface EOF
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
    // InternalSADL.g:743:1: ruleInterface returns [EObject current=null] : (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_ports_3_0= rulePort ) )* otherlv_4= 'end' ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_4=null;
        EObject lv_ports_3_0 = null;



        	enterRule();

        try {
            // InternalSADL.g:749:2: ( (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_ports_3_0= rulePort ) )* otherlv_4= 'end' ) )
            // InternalSADL.g:750:2: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_ports_3_0= rulePort ) )* otherlv_4= 'end' )
            {
            // InternalSADL.g:750:2: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_ports_3_0= rulePort ) )* otherlv_4= 'end' )
            // InternalSADL.g:751:3: otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_ports_3_0= rulePort ) )* otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInterfaceAccess().getInterfaceKeyword_0());
              		
            }
            // InternalSADL.g:755:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSADL.g:756:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSADL.g:756:4: (lv_name_1_0= RULE_ID )
            // InternalSADL.g:757:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
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

            // InternalSADL.g:773:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSADL.g:774:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalSADL.g:774:4: (lv_description_2_0= RULE_STRING )
                    // InternalSADL.g:775:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_12); if (state.failed) return current;
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

            // InternalSADL.g:791:3: ( (lv_ports_3_0= rulePort ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==36) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSADL.g:792:4: (lv_ports_3_0= rulePort )
            	    {
            	    // InternalSADL.g:792:4: (lv_ports_3_0= rulePort )
            	    // InternalSADL.g:793:5: lv_ports_3_0= rulePort
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getInterfaceAccess().getPortsPortParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_12);
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
            	    break loop16;
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
    // InternalSADL.g:818:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalSADL.g:818:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalSADL.g:819:2: iv_ruleEnumeration= ruleEnumeration EOF
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
    // InternalSADL.g:825:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_enumerators_3_0= ruleEnumerator ) )* otherlv_4= 'end' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_4=null;
        EObject lv_enumerators_3_0 = null;



        	enterRule();

        try {
            // InternalSADL.g:831:2: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_enumerators_3_0= ruleEnumerator ) )* otherlv_4= 'end' ) )
            // InternalSADL.g:832:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_enumerators_3_0= ruleEnumerator ) )* otherlv_4= 'end' )
            {
            // InternalSADL.g:832:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_enumerators_3_0= ruleEnumerator ) )* otherlv_4= 'end' )
            // InternalSADL.g:833:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_enumerators_3_0= ruleEnumerator ) )* otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getEnumKeyword_0());
              		
            }
            // InternalSADL.g:837:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSADL.g:838:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSADL.g:838:4: (lv_name_1_0= RULE_ID )
            // InternalSADL.g:839:5: lv_name_1_0= RULE_ID
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

            // InternalSADL.g:855:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSADL.g:856:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalSADL.g:856:4: (lv_description_2_0= RULE_STRING )
                    // InternalSADL.g:857:5: lv_description_2_0= RULE_STRING
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

            // InternalSADL.g:873:3: ( (lv_enumerators_3_0= ruleEnumerator ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=31 && LA18_0<=32)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSADL.g:874:4: (lv_enumerators_3_0= ruleEnumerator )
            	    {
            	    // InternalSADL.g:874:4: (lv_enumerators_3_0= ruleEnumerator )
            	    // InternalSADL.g:875:5: lv_enumerators_3_0= ruleEnumerator
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
            	    break loop18;
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
    // InternalSADL.g:900:1: entryRuleTopic returns [EObject current=null] : iv_ruleTopic= ruleTopic EOF ;
    public final EObject entryRuleTopic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopic = null;


        try {
            // InternalSADL.g:900:46: (iv_ruleTopic= ruleTopic EOF )
            // InternalSADL.g:901:2: iv_ruleTopic= ruleTopic EOF
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
    // InternalSADL.g:907:1: ruleTopic returns [EObject current=null] : (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= 'end' ) ;
    public final EObject ruleTopic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalSADL.g:913:2: ( (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= 'end' ) )
            // InternalSADL.g:914:2: (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= 'end' )
            {
            // InternalSADL.g:914:2: (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= 'end' )
            // InternalSADL.g:915:3: otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTopicAccess().getTopicKeyword_0());
              		
            }
            // InternalSADL.g:919:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSADL.g:920:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSADL.g:920:4: (lv_name_1_0= RULE_ID )
            // InternalSADL.g:921:5: lv_name_1_0= RULE_ID
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

            // InternalSADL.g:937:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSADL.g:938:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalSADL.g:938:4: (lv_description_2_0= RULE_STRING )
                    // InternalSADL.g:939:5: lv_description_2_0= RULE_STRING
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

            // InternalSADL.g:955:3: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==32||LA20_0==34) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSADL.g:956:4: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // InternalSADL.g:956:4: (lv_attributes_3_0= ruleAttribute )
            	    // InternalSADL.g:957:5: lv_attributes_3_0= ruleAttribute
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
            	    break loop20;
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
    // InternalSADL.g:982:1: entryRuleAlias returns [EObject current=null] : iv_ruleAlias= ruleAlias EOF ;
    public final EObject entryRuleAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlias = null;


        try {
            // InternalSADL.g:982:46: (iv_ruleAlias= ruleAlias EOF )
            // InternalSADL.g:983:2: iv_ruleAlias= ruleAlias EOF
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
    // InternalSADL.g:989:1: ruleAlias returns [EObject current=null] : (otherlv_0= 'alias' ( ( ruleQualifiedName ) ) ( ( (lv_min_2_0= ruleReal ) ) ( ( '-' | RULE_INT )=> (lv_max_3_0= ruleReal ) ) (otherlv_4= ':' ( (lv_res_5_0= ruleReal ) ) )? )? ( (otherlv_6= '[' ( (lv_unbounded_7_0= '*' ) ) ) | ( ( (lv_upperbound_8_0= RULE_INT ) ) otherlv_9= ']' ) )? (otherlv_10= '(' ( ( ruleQualifiedName ) ) otherlv_12= ')' )? otherlv_13= 'as' ( (lv_name_14_0= RULE_ID ) ) ( (lv_description_15_0= RULE_STRING ) )? otherlv_16= ';' ) ;
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
            // InternalSADL.g:995:2: ( (otherlv_0= 'alias' ( ( ruleQualifiedName ) ) ( ( (lv_min_2_0= ruleReal ) ) ( ( '-' | RULE_INT )=> (lv_max_3_0= ruleReal ) ) (otherlv_4= ':' ( (lv_res_5_0= ruleReal ) ) )? )? ( (otherlv_6= '[' ( (lv_unbounded_7_0= '*' ) ) ) | ( ( (lv_upperbound_8_0= RULE_INT ) ) otherlv_9= ']' ) )? (otherlv_10= '(' ( ( ruleQualifiedName ) ) otherlv_12= ')' )? otherlv_13= 'as' ( (lv_name_14_0= RULE_ID ) ) ( (lv_description_15_0= RULE_STRING ) )? otherlv_16= ';' ) )
            // InternalSADL.g:996:2: (otherlv_0= 'alias' ( ( ruleQualifiedName ) ) ( ( (lv_min_2_0= ruleReal ) ) ( ( '-' | RULE_INT )=> (lv_max_3_0= ruleReal ) ) (otherlv_4= ':' ( (lv_res_5_0= ruleReal ) ) )? )? ( (otherlv_6= '[' ( (lv_unbounded_7_0= '*' ) ) ) | ( ( (lv_upperbound_8_0= RULE_INT ) ) otherlv_9= ']' ) )? (otherlv_10= '(' ( ( ruleQualifiedName ) ) otherlv_12= ')' )? otherlv_13= 'as' ( (lv_name_14_0= RULE_ID ) ) ( (lv_description_15_0= RULE_STRING ) )? otherlv_16= ';' )
            {
            // InternalSADL.g:996:2: (otherlv_0= 'alias' ( ( ruleQualifiedName ) ) ( ( (lv_min_2_0= ruleReal ) ) ( ( '-' | RULE_INT )=> (lv_max_3_0= ruleReal ) ) (otherlv_4= ':' ( (lv_res_5_0= ruleReal ) ) )? )? ( (otherlv_6= '[' ( (lv_unbounded_7_0= '*' ) ) ) | ( ( (lv_upperbound_8_0= RULE_INT ) ) otherlv_9= ']' ) )? (otherlv_10= '(' ( ( ruleQualifiedName ) ) otherlv_12= ')' )? otherlv_13= 'as' ( (lv_name_14_0= RULE_ID ) ) ( (lv_description_15_0= RULE_STRING ) )? otherlv_16= ';' )
            // InternalSADL.g:997:3: otherlv_0= 'alias' ( ( ruleQualifiedName ) ) ( ( (lv_min_2_0= ruleReal ) ) ( ( '-' | RULE_INT )=> (lv_max_3_0= ruleReal ) ) (otherlv_4= ':' ( (lv_res_5_0= ruleReal ) ) )? )? ( (otherlv_6= '[' ( (lv_unbounded_7_0= '*' ) ) ) | ( ( (lv_upperbound_8_0= RULE_INT ) ) otherlv_9= ']' ) )? (otherlv_10= '(' ( ( ruleQualifiedName ) ) otherlv_12= ')' )? otherlv_13= 'as' ( (lv_name_14_0= RULE_ID ) ) ( (lv_description_15_0= RULE_STRING ) )? otherlv_16= ';'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAliasAccess().getAliasKeyword_0());
              		
            }
            // InternalSADL.g:1001:3: ( ( ruleQualifiedName ) )
            // InternalSADL.g:1002:4: ( ruleQualifiedName )
            {
            // InternalSADL.g:1002:4: ( ruleQualifiedName )
            // InternalSADL.g:1003:5: ruleQualifiedName
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

            // InternalSADL.g:1017:3: ( ( (lv_min_2_0= ruleReal ) ) ( ( '-' | RULE_INT )=> (lv_max_3_0= ruleReal ) ) (otherlv_4= ':' ( (lv_res_5_0= ruleReal ) ) )? )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==20) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_INT) ) {
                int LA22_2 = input.LA(2);

                if ( (LA22_2==14) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // InternalSADL.g:1018:4: ( (lv_min_2_0= ruleReal ) ) ( ( '-' | RULE_INT )=> (lv_max_3_0= ruleReal ) ) (otherlv_4= ':' ( (lv_res_5_0= ruleReal ) ) )?
                    {
                    // InternalSADL.g:1018:4: ( (lv_min_2_0= ruleReal ) )
                    // InternalSADL.g:1019:5: (lv_min_2_0= ruleReal )
                    {
                    // InternalSADL.g:1019:5: (lv_min_2_0= ruleReal )
                    // InternalSADL.g:1020:6: lv_min_2_0= ruleReal
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAliasAccess().getMinRealParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
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

                    // InternalSADL.g:1037:4: ( ( '-' | RULE_INT )=> (lv_max_3_0= ruleReal ) )
                    // InternalSADL.g:1038:5: ( '-' | RULE_INT )=> (lv_max_3_0= ruleReal )
                    {
                    // InternalSADL.g:1039:5: (lv_max_3_0= ruleReal )
                    // InternalSADL.g:1040:6: lv_max_3_0= ruleReal
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

                    // InternalSADL.g:1057:4: (otherlv_4= ':' ( (lv_res_5_0= ruleReal ) ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==16) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalSADL.g:1058:5: otherlv_4= ':' ( (lv_res_5_0= ruleReal ) )
                            {
                            otherlv_4=(Token)match(input,16,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getAliasAccess().getColonKeyword_2_2_0());
                              				
                            }
                            // InternalSADL.g:1062:5: ( (lv_res_5_0= ruleReal ) )
                            // InternalSADL.g:1063:6: (lv_res_5_0= ruleReal )
                            {
                            // InternalSADL.g:1063:6: (lv_res_5_0= ruleReal )
                            // InternalSADL.g:1064:7: lv_res_5_0= ruleReal
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

            // InternalSADL.g:1083:3: ( (otherlv_6= '[' ( (lv_unbounded_7_0= '*' ) ) ) | ( ( (lv_upperbound_8_0= RULE_INT ) ) otherlv_9= ']' ) )?
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==25) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_INT) ) {
                alt23=2;
            }
            switch (alt23) {
                case 1 :
                    // InternalSADL.g:1084:4: (otherlv_6= '[' ( (lv_unbounded_7_0= '*' ) ) )
                    {
                    // InternalSADL.g:1084:4: (otherlv_6= '[' ( (lv_unbounded_7_0= '*' ) ) )
                    // InternalSADL.g:1085:5: otherlv_6= '[' ( (lv_unbounded_7_0= '*' ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getAliasAccess().getLeftSquareBracketKeyword_3_0_0());
                      				
                    }
                    // InternalSADL.g:1089:5: ( (lv_unbounded_7_0= '*' ) )
                    // InternalSADL.g:1090:6: (lv_unbounded_7_0= '*' )
                    {
                    // InternalSADL.g:1090:6: (lv_unbounded_7_0= '*' )
                    // InternalSADL.g:1091:7: lv_unbounded_7_0= '*'
                    {
                    lv_unbounded_7_0=(Token)match(input,26,FOLLOW_27); if (state.failed) return current;
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
                    // InternalSADL.g:1105:4: ( ( (lv_upperbound_8_0= RULE_INT ) ) otherlv_9= ']' )
                    {
                    // InternalSADL.g:1105:4: ( ( (lv_upperbound_8_0= RULE_INT ) ) otherlv_9= ']' )
                    // InternalSADL.g:1106:5: ( (lv_upperbound_8_0= RULE_INT ) ) otherlv_9= ']'
                    {
                    // InternalSADL.g:1106:5: ( (lv_upperbound_8_0= RULE_INT ) )
                    // InternalSADL.g:1107:6: (lv_upperbound_8_0= RULE_INT )
                    {
                    // InternalSADL.g:1107:6: (lv_upperbound_8_0= RULE_INT )
                    // InternalSADL.g:1108:7: lv_upperbound_8_0= RULE_INT
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

                    otherlv_9=(Token)match(input,27,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getAliasAccess().getRightSquareBracketKeyword_3_1_1());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSADL.g:1130:3: (otherlv_10= '(' ( ( ruleQualifiedName ) ) otherlv_12= ')' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==28) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSADL.g:1131:4: otherlv_10= '(' ( ( ruleQualifiedName ) ) otherlv_12= ')'
                    {
                    otherlv_10=(Token)match(input,28,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getAliasAccess().getLeftParenthesisKeyword_4_0());
                      			
                    }
                    // InternalSADL.g:1135:4: ( ( ruleQualifiedName ) )
                    // InternalSADL.g:1136:5: ( ruleQualifiedName )
                    {
                    // InternalSADL.g:1136:5: ( ruleQualifiedName )
                    // InternalSADL.g:1137:6: ruleQualifiedName
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

                    otherlv_12=(Token)match(input,29,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getAliasAccess().getRightParenthesisKeyword_4_2());
                      			
                    }

                    }
                    break;

            }

            otherlv_13=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getAliasAccess().getAsKeyword_5());
              		
            }
            // InternalSADL.g:1160:3: ( (lv_name_14_0= RULE_ID ) )
            // InternalSADL.g:1161:4: (lv_name_14_0= RULE_ID )
            {
            // InternalSADL.g:1161:4: (lv_name_14_0= RULE_ID )
            // InternalSADL.g:1162:5: lv_name_14_0= RULE_ID
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

            // InternalSADL.g:1178:3: ( (lv_description_15_0= RULE_STRING ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSADL.g:1179:4: (lv_description_15_0= RULE_STRING )
                    {
                    // InternalSADL.g:1179:4: (lv_description_15_0= RULE_STRING )
                    // InternalSADL.g:1180:5: lv_description_15_0= RULE_STRING
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
    // InternalSADL.g:1204:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalSADL.g:1204:45: (iv_rulePort= rulePort EOF )
            // InternalSADL.g:1205:2: iv_rulePort= rulePort EOF
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
    // InternalSADL.g:1211:1: rulePort returns [EObject current=null] : (this_TopicPort_0= ruleTopicPort | this_InterfacePort_1= ruleInterfacePort ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        EObject this_TopicPort_0 = null;

        EObject this_InterfacePort_1 = null;



        	enterRule();

        try {
            // InternalSADL.g:1217:2: ( (this_TopicPort_0= ruleTopicPort | this_InterfacePort_1= ruleInterfacePort ) )
            // InternalSADL.g:1218:2: (this_TopicPort_0= ruleTopicPort | this_InterfacePort_1= ruleInterfacePort )
            {
            // InternalSADL.g:1218:2: (this_TopicPort_0= ruleTopicPort | this_InterfacePort_1= ruleInterfacePort )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==RULE_ID) ) {
                    int LA26_2 = input.LA(3);

                    if ( ((LA26_2>=39 && LA26_2<=40)) ) {
                        alt26=2;
                    }
                    else if ( ((LA26_2>=37 && LA26_2<=38)) ) {
                        alt26=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalSADL.g:1219:3: this_TopicPort_0= ruleTopicPort
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
                    // InternalSADL.g:1228:3: this_InterfacePort_1= ruleInterfacePort
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
    // InternalSADL.g:1240:1: entryRuleEnumerator returns [EObject current=null] : iv_ruleEnumerator= ruleEnumerator EOF ;
    public final EObject entryRuleEnumerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerator = null;


        try {
            // InternalSADL.g:1240:51: (iv_ruleEnumerator= ruleEnumerator EOF )
            // InternalSADL.g:1241:2: iv_ruleEnumerator= ruleEnumerator EOF
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
    // InternalSADL.g:1247:1: ruleEnumerator returns [EObject current=null] : ( (otherlv_0= 'value' | ( (lv_deprecated_1_0= 'deprecated' ) ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= RULE_INT ) ) )? ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= ';' ) ;
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
            // InternalSADL.g:1253:2: ( ( (otherlv_0= 'value' | ( (lv_deprecated_1_0= 'deprecated' ) ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= RULE_INT ) ) )? ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= ';' ) )
            // InternalSADL.g:1254:2: ( (otherlv_0= 'value' | ( (lv_deprecated_1_0= 'deprecated' ) ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= RULE_INT ) ) )? ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= ';' )
            {
            // InternalSADL.g:1254:2: ( (otherlv_0= 'value' | ( (lv_deprecated_1_0= 'deprecated' ) ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= RULE_INT ) ) )? ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= ';' )
            // InternalSADL.g:1255:3: (otherlv_0= 'value' | ( (lv_deprecated_1_0= 'deprecated' ) ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= RULE_INT ) ) )? ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= ';'
            {
            // InternalSADL.g:1255:3: (otherlv_0= 'value' | ( (lv_deprecated_1_0= 'deprecated' ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==31) ) {
                alt27=1;
            }
            else if ( (LA27_0==32) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalSADL.g:1256:4: otherlv_0= 'value'
                    {
                    otherlv_0=(Token)match(input,31,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getEnumeratorAccess().getValueKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSADL.g:1261:4: ( (lv_deprecated_1_0= 'deprecated' ) )
                    {
                    // InternalSADL.g:1261:4: ( (lv_deprecated_1_0= 'deprecated' ) )
                    // InternalSADL.g:1262:5: (lv_deprecated_1_0= 'deprecated' )
                    {
                    // InternalSADL.g:1262:5: (lv_deprecated_1_0= 'deprecated' )
                    // InternalSADL.g:1263:6: lv_deprecated_1_0= 'deprecated'
                    {
                    lv_deprecated_1_0=(Token)match(input,32,FOLLOW_4); if (state.failed) return current;
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

            // InternalSADL.g:1276:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSADL.g:1277:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSADL.g:1277:4: (lv_name_2_0= RULE_ID )
            // InternalSADL.g:1278:5: lv_name_2_0= RULE_ID
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

            // InternalSADL.g:1294:3: (otherlv_3= '=' ( (lv_value_4_0= RULE_INT ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==33) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSADL.g:1295:4: otherlv_3= '=' ( (lv_value_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getEnumeratorAccess().getEqualsSignKeyword_2_0());
                      			
                    }
                    // InternalSADL.g:1299:4: ( (lv_value_4_0= RULE_INT ) )
                    // InternalSADL.g:1300:5: (lv_value_4_0= RULE_INT )
                    {
                    // InternalSADL.g:1300:5: (lv_value_4_0= RULE_INT )
                    // InternalSADL.g:1301:6: lv_value_4_0= RULE_INT
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

            // InternalSADL.g:1318:3: ( (lv_description_5_0= RULE_STRING ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSADL.g:1319:4: (lv_description_5_0= RULE_STRING )
                    {
                    // InternalSADL.g:1319:4: (lv_description_5_0= RULE_STRING )
                    // InternalSADL.g:1320:5: lv_description_5_0= RULE_STRING
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
    // InternalSADL.g:1344:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalSADL.g:1344:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalSADL.g:1345:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalSADL.g:1351:1: ruleAttribute returns [EObject current=null] : ( (otherlv_0= 'attribute' | ( (lv_deprecated_1_0= 'deprecated' ) ) ) ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= '[' ( (lv_unbounded_5_0= '*' ) ) ) | ( (lv_lowerbound_6_0= RULE_INT ) ) | ( ( ( (lv_lowerbound_7_0= RULE_INT ) ) otherlv_8= '..' ( ( (lv_unbounded_9_0= '*' ) ) | ( (lv_upperbound_10_0= RULE_INT ) ) ) ) otherlv_11= ']' ) )? (otherlv_12= '(' ( ( ruleQualifiedName ) ) otherlv_14= ')' )? ( (lv_description_15_0= RULE_STRING ) )? otherlv_16= ';' ) ;
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
            // InternalSADL.g:1357:2: ( ( (otherlv_0= 'attribute' | ( (lv_deprecated_1_0= 'deprecated' ) ) ) ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= '[' ( (lv_unbounded_5_0= '*' ) ) ) | ( (lv_lowerbound_6_0= RULE_INT ) ) | ( ( ( (lv_lowerbound_7_0= RULE_INT ) ) otherlv_8= '..' ( ( (lv_unbounded_9_0= '*' ) ) | ( (lv_upperbound_10_0= RULE_INT ) ) ) ) otherlv_11= ']' ) )? (otherlv_12= '(' ( ( ruleQualifiedName ) ) otherlv_14= ')' )? ( (lv_description_15_0= RULE_STRING ) )? otherlv_16= ';' ) )
            // InternalSADL.g:1358:2: ( (otherlv_0= 'attribute' | ( (lv_deprecated_1_0= 'deprecated' ) ) ) ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= '[' ( (lv_unbounded_5_0= '*' ) ) ) | ( (lv_lowerbound_6_0= RULE_INT ) ) | ( ( ( (lv_lowerbound_7_0= RULE_INT ) ) otherlv_8= '..' ( ( (lv_unbounded_9_0= '*' ) ) | ( (lv_upperbound_10_0= RULE_INT ) ) ) ) otherlv_11= ']' ) )? (otherlv_12= '(' ( ( ruleQualifiedName ) ) otherlv_14= ')' )? ( (lv_description_15_0= RULE_STRING ) )? otherlv_16= ';' )
            {
            // InternalSADL.g:1358:2: ( (otherlv_0= 'attribute' | ( (lv_deprecated_1_0= 'deprecated' ) ) ) ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= '[' ( (lv_unbounded_5_0= '*' ) ) ) | ( (lv_lowerbound_6_0= RULE_INT ) ) | ( ( ( (lv_lowerbound_7_0= RULE_INT ) ) otherlv_8= '..' ( ( (lv_unbounded_9_0= '*' ) ) | ( (lv_upperbound_10_0= RULE_INT ) ) ) ) otherlv_11= ']' ) )? (otherlv_12= '(' ( ( ruleQualifiedName ) ) otherlv_14= ')' )? ( (lv_description_15_0= RULE_STRING ) )? otherlv_16= ';' )
            // InternalSADL.g:1359:3: (otherlv_0= 'attribute' | ( (lv_deprecated_1_0= 'deprecated' ) ) ) ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= '[' ( (lv_unbounded_5_0= '*' ) ) ) | ( (lv_lowerbound_6_0= RULE_INT ) ) | ( ( ( (lv_lowerbound_7_0= RULE_INT ) ) otherlv_8= '..' ( ( (lv_unbounded_9_0= '*' ) ) | ( (lv_upperbound_10_0= RULE_INT ) ) ) ) otherlv_11= ']' ) )? (otherlv_12= '(' ( ( ruleQualifiedName ) ) otherlv_14= ')' )? ( (lv_description_15_0= RULE_STRING ) )? otherlv_16= ';'
            {
            // InternalSADL.g:1359:3: (otherlv_0= 'attribute' | ( (lv_deprecated_1_0= 'deprecated' ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==34) ) {
                alt30=1;
            }
            else if ( (LA30_0==32) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalSADL.g:1360:4: otherlv_0= 'attribute'
                    {
                    otherlv_0=(Token)match(input,34,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSADL.g:1365:4: ( (lv_deprecated_1_0= 'deprecated' ) )
                    {
                    // InternalSADL.g:1365:4: ( (lv_deprecated_1_0= 'deprecated' ) )
                    // InternalSADL.g:1366:5: (lv_deprecated_1_0= 'deprecated' )
                    {
                    // InternalSADL.g:1366:5: (lv_deprecated_1_0= 'deprecated' )
                    // InternalSADL.g:1367:6: lv_deprecated_1_0= 'deprecated'
                    {
                    lv_deprecated_1_0=(Token)match(input,32,FOLLOW_4); if (state.failed) return current;
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

            // InternalSADL.g:1380:3: ( ( ruleQualifiedName ) )
            // InternalSADL.g:1381:4: ( ruleQualifiedName )
            {
            // InternalSADL.g:1381:4: ( ruleQualifiedName )
            // InternalSADL.g:1382:5: ruleQualifiedName
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

            // InternalSADL.g:1396:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalSADL.g:1397:4: (lv_name_3_0= RULE_ID )
            {
            // InternalSADL.g:1397:4: (lv_name_3_0= RULE_ID )
            // InternalSADL.g:1398:5: lv_name_3_0= RULE_ID
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

            // InternalSADL.g:1414:3: ( (otherlv_4= '[' ( (lv_unbounded_5_0= '*' ) ) ) | ( (lv_lowerbound_6_0= RULE_INT ) ) | ( ( ( (lv_lowerbound_7_0= RULE_INT ) ) otherlv_8= '..' ( ( (lv_unbounded_9_0= '*' ) ) | ( (lv_upperbound_10_0= RULE_INT ) ) ) ) otherlv_11= ']' ) )?
            int alt32=4;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==25) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_INT) ) {
                int LA32_2 = input.LA(2);

                if ( (LA32_2==RULE_STRING||LA32_2==17||LA32_2==28) ) {
                    alt32=2;
                }
                else if ( (LA32_2==35) ) {
                    alt32=3;
                }
            }
            switch (alt32) {
                case 1 :
                    // InternalSADL.g:1415:4: (otherlv_4= '[' ( (lv_unbounded_5_0= '*' ) ) )
                    {
                    // InternalSADL.g:1415:4: (otherlv_4= '[' ( (lv_unbounded_5_0= '*' ) ) )
                    // InternalSADL.g:1416:5: otherlv_4= '[' ( (lv_unbounded_5_0= '*' ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_3_0_0());
                      				
                    }
                    // InternalSADL.g:1420:5: ( (lv_unbounded_5_0= '*' ) )
                    // InternalSADL.g:1421:6: (lv_unbounded_5_0= '*' )
                    {
                    // InternalSADL.g:1421:6: (lv_unbounded_5_0= '*' )
                    // InternalSADL.g:1422:7: lv_unbounded_5_0= '*'
                    {
                    lv_unbounded_5_0=(Token)match(input,26,FOLLOW_33); if (state.failed) return current;
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
                    // InternalSADL.g:1436:4: ( (lv_lowerbound_6_0= RULE_INT ) )
                    {
                    // InternalSADL.g:1436:4: ( (lv_lowerbound_6_0= RULE_INT ) )
                    // InternalSADL.g:1437:5: (lv_lowerbound_6_0= RULE_INT )
                    {
                    // InternalSADL.g:1437:5: (lv_lowerbound_6_0= RULE_INT )
                    // InternalSADL.g:1438:6: lv_lowerbound_6_0= RULE_INT
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
                    // InternalSADL.g:1455:4: ( ( ( (lv_lowerbound_7_0= RULE_INT ) ) otherlv_8= '..' ( ( (lv_unbounded_9_0= '*' ) ) | ( (lv_upperbound_10_0= RULE_INT ) ) ) ) otherlv_11= ']' )
                    {
                    // InternalSADL.g:1455:4: ( ( ( (lv_lowerbound_7_0= RULE_INT ) ) otherlv_8= '..' ( ( (lv_unbounded_9_0= '*' ) ) | ( (lv_upperbound_10_0= RULE_INT ) ) ) ) otherlv_11= ']' )
                    // InternalSADL.g:1456:5: ( ( (lv_lowerbound_7_0= RULE_INT ) ) otherlv_8= '..' ( ( (lv_unbounded_9_0= '*' ) ) | ( (lv_upperbound_10_0= RULE_INT ) ) ) ) otherlv_11= ']'
                    {
                    // InternalSADL.g:1456:5: ( ( (lv_lowerbound_7_0= RULE_INT ) ) otherlv_8= '..' ( ( (lv_unbounded_9_0= '*' ) ) | ( (lv_upperbound_10_0= RULE_INT ) ) ) )
                    // InternalSADL.g:1457:6: ( (lv_lowerbound_7_0= RULE_INT ) ) otherlv_8= '..' ( ( (lv_unbounded_9_0= '*' ) ) | ( (lv_upperbound_10_0= RULE_INT ) ) )
                    {
                    // InternalSADL.g:1457:6: ( (lv_lowerbound_7_0= RULE_INT ) )
                    // InternalSADL.g:1458:7: (lv_lowerbound_7_0= RULE_INT )
                    {
                    // InternalSADL.g:1458:7: (lv_lowerbound_7_0= RULE_INT )
                    // InternalSADL.g:1459:8: lv_lowerbound_7_0= RULE_INT
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

                    otherlv_8=(Token)match(input,35,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getFullStopFullStopKeyword_3_2_0_1());
                      					
                    }
                    // InternalSADL.g:1479:6: ( ( (lv_unbounded_9_0= '*' ) ) | ( (lv_upperbound_10_0= RULE_INT ) ) )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==26) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==RULE_INT) ) {
                        alt31=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalSADL.g:1480:7: ( (lv_unbounded_9_0= '*' ) )
                            {
                            // InternalSADL.g:1480:7: ( (lv_unbounded_9_0= '*' ) )
                            // InternalSADL.g:1481:8: (lv_unbounded_9_0= '*' )
                            {
                            // InternalSADL.g:1481:8: (lv_unbounded_9_0= '*' )
                            // InternalSADL.g:1482:9: lv_unbounded_9_0= '*'
                            {
                            lv_unbounded_9_0=(Token)match(input,26,FOLLOW_28); if (state.failed) return current;
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
                            // InternalSADL.g:1495:7: ( (lv_upperbound_10_0= RULE_INT ) )
                            {
                            // InternalSADL.g:1495:7: ( (lv_upperbound_10_0= RULE_INT ) )
                            // InternalSADL.g:1496:8: (lv_upperbound_10_0= RULE_INT )
                            {
                            // InternalSADL.g:1496:8: (lv_upperbound_10_0= RULE_INT )
                            // InternalSADL.g:1497:9: lv_upperbound_10_0= RULE_INT
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

                    otherlv_11=(Token)match(input,27,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_3_2_1());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSADL.g:1521:3: (otherlv_12= '(' ( ( ruleQualifiedName ) ) otherlv_14= ')' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==28) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSADL.g:1522:4: otherlv_12= '(' ( ( ruleQualifiedName ) ) otherlv_14= ')'
                    {
                    otherlv_12=(Token)match(input,28,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_4_0());
                      			
                    }
                    // InternalSADL.g:1526:4: ( ( ruleQualifiedName ) )
                    // InternalSADL.g:1527:5: ( ruleQualifiedName )
                    {
                    // InternalSADL.g:1527:5: ( ruleQualifiedName )
                    // InternalSADL.g:1528:6: ruleQualifiedName
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

                    otherlv_14=(Token)match(input,29,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getAttributeAccess().getRightParenthesisKeyword_4_2());
                      			
                    }

                    }
                    break;

            }

            // InternalSADL.g:1547:3: ( (lv_description_15_0= RULE_STRING ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_STRING) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSADL.g:1548:4: (lv_description_15_0= RULE_STRING )
                    {
                    // InternalSADL.g:1548:4: (lv_description_15_0= RULE_STRING )
                    // InternalSADL.g:1549:5: lv_description_15_0= RULE_STRING
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
    // InternalSADL.g:1573:1: entryRuleTopicPort returns [EObject current=null] : iv_ruleTopicPort= ruleTopicPort EOF ;
    public final EObject entryRuleTopicPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopicPort = null;


        try {
            // InternalSADL.g:1573:50: (iv_ruleTopicPort= ruleTopicPort EOF )
            // InternalSADL.g:1574:2: iv_ruleTopicPort= ruleTopicPort EOF
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
    // InternalSADL.g:1580:1: ruleTopicPort returns [EObject current=null] : (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_conjugated_2_0= 'receives' ) ) | otherlv_3= 'sends' ) ( ( ruleQualifiedName ) ) otherlv_5= ';' ) ;
    public final EObject ruleTopicPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_conjugated_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalSADL.g:1586:2: ( (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_conjugated_2_0= 'receives' ) ) | otherlv_3= 'sends' ) ( ( ruleQualifiedName ) ) otherlv_5= ';' ) )
            // InternalSADL.g:1587:2: (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_conjugated_2_0= 'receives' ) ) | otherlv_3= 'sends' ) ( ( ruleQualifiedName ) ) otherlv_5= ';' )
            {
            // InternalSADL.g:1587:2: (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_conjugated_2_0= 'receives' ) ) | otherlv_3= 'sends' ) ( ( ruleQualifiedName ) ) otherlv_5= ';' )
            // InternalSADL.g:1588:3: otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_conjugated_2_0= 'receives' ) ) | otherlv_3= 'sends' ) ( ( ruleQualifiedName ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTopicPortAccess().getPortKeyword_0());
              		
            }
            // InternalSADL.g:1592:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSADL.g:1593:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSADL.g:1593:4: (lv_name_1_0= RULE_ID )
            // InternalSADL.g:1594:5: lv_name_1_0= RULE_ID
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

            // InternalSADL.g:1610:3: ( ( (lv_conjugated_2_0= 'receives' ) ) | otherlv_3= 'sends' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==37) ) {
                alt35=1;
            }
            else if ( (LA35_0==38) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalSADL.g:1611:4: ( (lv_conjugated_2_0= 'receives' ) )
                    {
                    // InternalSADL.g:1611:4: ( (lv_conjugated_2_0= 'receives' ) )
                    // InternalSADL.g:1612:5: (lv_conjugated_2_0= 'receives' )
                    {
                    // InternalSADL.g:1612:5: (lv_conjugated_2_0= 'receives' )
                    // InternalSADL.g:1613:6: lv_conjugated_2_0= 'receives'
                    {
                    lv_conjugated_2_0=(Token)match(input,37,FOLLOW_4); if (state.failed) return current;
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
                    // InternalSADL.g:1626:4: otherlv_3= 'sends'
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getTopicPortAccess().getSendsKeyword_2_1());
                      			
                    }

                    }
                    break;

            }

            // InternalSADL.g:1631:3: ( ( ruleQualifiedName ) )
            // InternalSADL.g:1632:4: ( ruleQualifiedName )
            {
            // InternalSADL.g:1632:4: ( ruleQualifiedName )
            // InternalSADL.g:1633:5: ruleQualifiedName
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
    // InternalSADL.g:1655:1: entryRuleInterfacePort returns [EObject current=null] : iv_ruleInterfacePort= ruleInterfacePort EOF ;
    public final EObject entryRuleInterfacePort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfacePort = null;


        try {
            // InternalSADL.g:1655:54: (iv_ruleInterfacePort= ruleInterfacePort EOF )
            // InternalSADL.g:1656:2: iv_ruleInterfacePort= ruleInterfacePort EOF
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
    // InternalSADL.g:1662:1: ruleInterfacePort returns [EObject current=null] : (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_conjugated_2_0= 'requires' ) ) | otherlv_3= 'provides' ) ( ( ruleQualifiedName ) ) otherlv_5= ';' ) ;
    public final EObject ruleInterfacePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_conjugated_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalSADL.g:1668:2: ( (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_conjugated_2_0= 'requires' ) ) | otherlv_3= 'provides' ) ( ( ruleQualifiedName ) ) otherlv_5= ';' ) )
            // InternalSADL.g:1669:2: (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_conjugated_2_0= 'requires' ) ) | otherlv_3= 'provides' ) ( ( ruleQualifiedName ) ) otherlv_5= ';' )
            {
            // InternalSADL.g:1669:2: (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_conjugated_2_0= 'requires' ) ) | otherlv_3= 'provides' ) ( ( ruleQualifiedName ) ) otherlv_5= ';' )
            // InternalSADL.g:1670:3: otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_conjugated_2_0= 'requires' ) ) | otherlv_3= 'provides' ) ( ( ruleQualifiedName ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInterfacePortAccess().getPortKeyword_0());
              		
            }
            // InternalSADL.g:1674:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSADL.g:1675:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSADL.g:1675:4: (lv_name_1_0= RULE_ID )
            // InternalSADL.g:1676:5: lv_name_1_0= RULE_ID
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

            // InternalSADL.g:1692:3: ( ( (lv_conjugated_2_0= 'requires' ) ) | otherlv_3= 'provides' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==39) ) {
                alt36=1;
            }
            else if ( (LA36_0==40) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalSADL.g:1693:4: ( (lv_conjugated_2_0= 'requires' ) )
                    {
                    // InternalSADL.g:1693:4: ( (lv_conjugated_2_0= 'requires' ) )
                    // InternalSADL.g:1694:5: (lv_conjugated_2_0= 'requires' )
                    {
                    // InternalSADL.g:1694:5: (lv_conjugated_2_0= 'requires' )
                    // InternalSADL.g:1695:6: lv_conjugated_2_0= 'requires'
                    {
                    lv_conjugated_2_0=(Token)match(input,39,FOLLOW_4); if (state.failed) return current;
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
                    // InternalSADL.g:1708:4: otherlv_3= 'provides'
                    {
                    otherlv_3=(Token)match(input,40,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getInterfacePortAccess().getProvidesKeyword_2_1());
                      			
                    }

                    }
                    break;

            }

            // InternalSADL.g:1713:3: ( ( ruleQualifiedName ) )
            // InternalSADL.g:1714:4: ( ruleQualifiedName )
            {
            // InternalSADL.g:1714:4: ( ruleQualifiedName )
            // InternalSADL.g:1715:5: ruleQualifiedName
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
    // InternalSADL.g:1737:1: entryRulePlatform returns [EObject current=null] : iv_rulePlatform= rulePlatform EOF ;
    public final EObject entryRulePlatform() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatform = null;


        try {
            // InternalSADL.g:1737:49: (iv_rulePlatform= rulePlatform EOF )
            // InternalSADL.g:1738:2: iv_rulePlatform= rulePlatform EOF
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
    // InternalSADL.g:1744:1: rulePlatform returns [EObject current=null] : (otherlv_0= 'platform' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( (lv_processors_3_0= ruleProcessor ) ) | ( (lv_links_4_0= ruleLink ) ) )* otherlv_5= 'end' ) ;
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
            // InternalSADL.g:1750:2: ( (otherlv_0= 'platform' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( (lv_processors_3_0= ruleProcessor ) ) | ( (lv_links_4_0= ruleLink ) ) )* otherlv_5= 'end' ) )
            // InternalSADL.g:1751:2: (otherlv_0= 'platform' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( (lv_processors_3_0= ruleProcessor ) ) | ( (lv_links_4_0= ruleLink ) ) )* otherlv_5= 'end' )
            {
            // InternalSADL.g:1751:2: (otherlv_0= 'platform' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( (lv_processors_3_0= ruleProcessor ) ) | ( (lv_links_4_0= ruleLink ) ) )* otherlv_5= 'end' )
            // InternalSADL.g:1752:3: otherlv_0= 'platform' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( (lv_processors_3_0= ruleProcessor ) ) | ( (lv_links_4_0= ruleLink ) ) )* otherlv_5= 'end'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPlatformAccess().getPlatformKeyword_0());
              		
            }
            // InternalSADL.g:1756:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSADL.g:1757:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSADL.g:1757:4: (lv_name_1_0= RULE_ID )
            // InternalSADL.g:1758:5: lv_name_1_0= RULE_ID
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

            // InternalSADL.g:1774:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_STRING) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSADL.g:1775:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalSADL.g:1775:4: (lv_description_2_0= RULE_STRING )
                    // InternalSADL.g:1776:5: lv_description_2_0= RULE_STRING
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

            // InternalSADL.g:1792:3: ( ( (lv_processors_3_0= ruleProcessor ) ) | ( (lv_links_4_0= ruleLink ) ) )*
            loop38:
            do {
                int alt38=3;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==42) ) {
                    alt38=1;
                }
                else if ( (LA38_0==43) ) {
                    alt38=2;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalSADL.g:1793:4: ( (lv_processors_3_0= ruleProcessor ) )
            	    {
            	    // InternalSADL.g:1793:4: ( (lv_processors_3_0= ruleProcessor ) )
            	    // InternalSADL.g:1794:5: (lv_processors_3_0= ruleProcessor )
            	    {
            	    // InternalSADL.g:1794:5: (lv_processors_3_0= ruleProcessor )
            	    // InternalSADL.g:1795:6: lv_processors_3_0= ruleProcessor
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
            	    // InternalSADL.g:1813:4: ( (lv_links_4_0= ruleLink ) )
            	    {
            	    // InternalSADL.g:1813:4: ( (lv_links_4_0= ruleLink ) )
            	    // InternalSADL.g:1814:5: (lv_links_4_0= ruleLink )
            	    {
            	    // InternalSADL.g:1814:5: (lv_links_4_0= ruleLink )
            	    // InternalSADL.g:1815:6: lv_links_4_0= ruleLink
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
            	    break loop38;
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
    // InternalSADL.g:1841:1: entryRuleProcessor returns [EObject current=null] : iv_ruleProcessor= ruleProcessor EOF ;
    public final EObject entryRuleProcessor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessor = null;


        try {
            // InternalSADL.g:1841:50: (iv_ruleProcessor= ruleProcessor EOF )
            // InternalSADL.g:1842:2: iv_ruleProcessor= ruleProcessor EOF
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
    // InternalSADL.g:1848:1: ruleProcessor returns [EObject current=null] : (otherlv_0= 'processor' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) ;
    public final EObject ruleProcessor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSADL.g:1854:2: ( (otherlv_0= 'processor' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) )
            // InternalSADL.g:1855:2: (otherlv_0= 'processor' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            {
            // InternalSADL.g:1855:2: (otherlv_0= 'processor' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            // InternalSADL.g:1856:3: otherlv_0= 'processor' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getProcessorAccess().getProcessorKeyword_0());
              		
            }
            // InternalSADL.g:1860:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSADL.g:1861:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSADL.g:1861:4: (lv_name_1_0= RULE_ID )
            // InternalSADL.g:1862:5: lv_name_1_0= RULE_ID
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

            // InternalSADL.g:1878:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_STRING) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSADL.g:1879:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalSADL.g:1879:4: (lv_description_2_0= RULE_STRING )
                    // InternalSADL.g:1880:5: lv_description_2_0= RULE_STRING
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
    // InternalSADL.g:1904:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalSADL.g:1904:45: (iv_ruleLink= ruleLink EOF )
            // InternalSADL.g:1905:2: iv_ruleLink= ruleLink EOF
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
    // InternalSADL.g:1911:1: ruleLink returns [EObject current=null] : (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'connects' otherlv_4= '(' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= ')' otherlv_9= ';' )? (otherlv_10= 'over' ( (otherlv_11= RULE_ID ) ) (otherlv_12= '(' ( (lv_value_13_0= rulePropertyValue ) ) (otherlv_14= ',' ( (lv_value_15_0= rulePropertyValue ) ) )* otherlv_16= ')' )? otherlv_17= ';' )? otherlv_18= 'end' ) ;
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
            // InternalSADL.g:1917:2: ( (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'connects' otherlv_4= '(' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= ')' otherlv_9= ';' )? (otherlv_10= 'over' ( (otherlv_11= RULE_ID ) ) (otherlv_12= '(' ( (lv_value_13_0= rulePropertyValue ) ) (otherlv_14= ',' ( (lv_value_15_0= rulePropertyValue ) ) )* otherlv_16= ')' )? otherlv_17= ';' )? otherlv_18= 'end' ) )
            // InternalSADL.g:1918:2: (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'connects' otherlv_4= '(' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= ')' otherlv_9= ';' )? (otherlv_10= 'over' ( (otherlv_11= RULE_ID ) ) (otherlv_12= '(' ( (lv_value_13_0= rulePropertyValue ) ) (otherlv_14= ',' ( (lv_value_15_0= rulePropertyValue ) ) )* otherlv_16= ')' )? otherlv_17= ';' )? otherlv_18= 'end' )
            {
            // InternalSADL.g:1918:2: (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'connects' otherlv_4= '(' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= ')' otherlv_9= ';' )? (otherlv_10= 'over' ( (otherlv_11= RULE_ID ) ) (otherlv_12= '(' ( (lv_value_13_0= rulePropertyValue ) ) (otherlv_14= ',' ( (lv_value_15_0= rulePropertyValue ) ) )* otherlv_16= ')' )? otherlv_17= ';' )? otherlv_18= 'end' )
            // InternalSADL.g:1919:3: otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'connects' otherlv_4= '(' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= ')' otherlv_9= ';' )? (otherlv_10= 'over' ( (otherlv_11= RULE_ID ) ) (otherlv_12= '(' ( (lv_value_13_0= rulePropertyValue ) ) (otherlv_14= ',' ( (lv_value_15_0= rulePropertyValue ) ) )* otherlv_16= ')' )? otherlv_17= ';' )? otherlv_18= 'end'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
              		
            }
            // InternalSADL.g:1923:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSADL.g:1924:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSADL.g:1924:4: (lv_name_1_0= RULE_ID )
            // InternalSADL.g:1925:5: lv_name_1_0= RULE_ID
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

            // InternalSADL.g:1941:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_STRING) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSADL.g:1942:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalSADL.g:1942:4: (lv_description_2_0= RULE_STRING )
                    // InternalSADL.g:1943:5: lv_description_2_0= RULE_STRING
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

            // InternalSADL.g:1959:3: (otherlv_3= 'connects' otherlv_4= '(' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= ')' otherlv_9= ';' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==44) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSADL.g:1960:4: otherlv_3= 'connects' otherlv_4= '(' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= ')' otherlv_9= ';'
                    {
                    otherlv_3=(Token)match(input,44,FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getConnectsKeyword_3_0());
                      			
                    }
                    otherlv_4=(Token)match(input,28,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getLeftParenthesisKeyword_3_1());
                      			
                    }
                    // InternalSADL.g:1968:4: ( ( ruleQualifiedName ) )
                    // InternalSADL.g:1969:5: ( ruleQualifiedName )
                    {
                    // InternalSADL.g:1969:5: ( ruleQualifiedName )
                    // InternalSADL.g:1970:6: ruleQualifiedName
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

                    // InternalSADL.g:1984:4: (otherlv_6= ',' ( ( ruleQualifiedName ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==45) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalSADL.g:1985:5: otherlv_6= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,45,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getCommaKeyword_3_3_0());
                    	      				
                    	    }
                    	    // InternalSADL.g:1989:5: ( ( ruleQualifiedName ) )
                    	    // InternalSADL.g:1990:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalSADL.g:1990:6: ( ruleQualifiedName )
                    	    // InternalSADL.g:1991:7: ruleQualifiedName
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
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,29,FOLLOW_10); if (state.failed) return current;
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

            // InternalSADL.g:2015:3: (otherlv_10= 'over' ( (otherlv_11= RULE_ID ) ) (otherlv_12= '(' ( (lv_value_13_0= rulePropertyValue ) ) (otherlv_14= ',' ( (lv_value_15_0= rulePropertyValue ) ) )* otherlv_16= ')' )? otherlv_17= ';' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==46) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSADL.g:2016:4: otherlv_10= 'over' ( (otherlv_11= RULE_ID ) ) (otherlv_12= '(' ( (lv_value_13_0= rulePropertyValue ) ) (otherlv_14= ',' ( (lv_value_15_0= rulePropertyValue ) ) )* otherlv_16= ')' )? otherlv_17= ';'
                    {
                    otherlv_10=(Token)match(input,46,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getLinkAccess().getOverKeyword_4_0());
                      			
                    }
                    // InternalSADL.g:2020:4: ( (otherlv_11= RULE_ID ) )
                    // InternalSADL.g:2021:5: (otherlv_11= RULE_ID )
                    {
                    // InternalSADL.g:2021:5: (otherlv_11= RULE_ID )
                    // InternalSADL.g:2022:6: otherlv_11= RULE_ID
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

                    // InternalSADL.g:2033:4: (otherlv_12= '(' ( (lv_value_13_0= rulePropertyValue ) ) (otherlv_14= ',' ( (lv_value_15_0= rulePropertyValue ) ) )* otherlv_16= ')' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==28) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalSADL.g:2034:5: otherlv_12= '(' ( (lv_value_13_0= rulePropertyValue ) ) (otherlv_14= ',' ( (lv_value_15_0= rulePropertyValue ) ) )* otherlv_16= ')'
                            {
                            otherlv_12=(Token)match(input,28,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_12, grammarAccess.getLinkAccess().getLeftParenthesisKeyword_4_2_0());
                              				
                            }
                            // InternalSADL.g:2038:5: ( (lv_value_13_0= rulePropertyValue ) )
                            // InternalSADL.g:2039:6: (lv_value_13_0= rulePropertyValue )
                            {
                            // InternalSADL.g:2039:6: (lv_value_13_0= rulePropertyValue )
                            // InternalSADL.g:2040:7: lv_value_13_0= rulePropertyValue
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

                            // InternalSADL.g:2057:5: (otherlv_14= ',' ( (lv_value_15_0= rulePropertyValue ) ) )*
                            loop43:
                            do {
                                int alt43=2;
                                int LA43_0 = input.LA(1);

                                if ( (LA43_0==45) ) {
                                    alt43=1;
                                }


                                switch (alt43) {
                            	case 1 :
                            	    // InternalSADL.g:2058:6: otherlv_14= ',' ( (lv_value_15_0= rulePropertyValue ) )
                            	    {
                            	    otherlv_14=(Token)match(input,45,FOLLOW_4); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_14, grammarAccess.getLinkAccess().getCommaKeyword_4_2_2_0());
                            	      					
                            	    }
                            	    // InternalSADL.g:2062:6: ( (lv_value_15_0= rulePropertyValue ) )
                            	    // InternalSADL.g:2063:7: (lv_value_15_0= rulePropertyValue )
                            	    {
                            	    // InternalSADL.g:2063:7: (lv_value_15_0= rulePropertyValue )
                            	    // InternalSADL.g:2064:8: lv_value_15_0= rulePropertyValue
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
                            	    break loop43;
                                }
                            } while (true);

                            otherlv_16=(Token)match(input,29,FOLLOW_10); if (state.failed) return current;
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
    // InternalSADL.g:2100:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalSADL.g:2100:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalSADL.g:2101:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalSADL.g:2107:1: ruleProperty returns [EObject current=null] : (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) ( (lv_optional_2_0= '?' ) )? ( (lv_description_3_0= RULE_STRING ) )? otherlv_4= ';' ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_optional_2_0=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSADL.g:2113:2: ( (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) ( (lv_optional_2_0= '?' ) )? ( (lv_description_3_0= RULE_STRING ) )? otherlv_4= ';' ) )
            // InternalSADL.g:2114:2: (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) ( (lv_optional_2_0= '?' ) )? ( (lv_description_3_0= RULE_STRING ) )? otherlv_4= ';' )
            {
            // InternalSADL.g:2114:2: (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) ( (lv_optional_2_0= '?' ) )? ( (lv_description_3_0= RULE_STRING ) )? otherlv_4= ';' )
            // InternalSADL.g:2115:3: otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) ( (lv_optional_2_0= '?' ) )? ( (lv_description_3_0= RULE_STRING ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getPropertyKeyword_0());
              		
            }
            // InternalSADL.g:2119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSADL.g:2120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSADL.g:2120:4: (lv_name_1_0= RULE_ID )
            // InternalSADL.g:2121:5: lv_name_1_0= RULE_ID
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

            // InternalSADL.g:2137:3: ( (lv_optional_2_0= '?' ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==48) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSADL.g:2138:4: (lv_optional_2_0= '?' )
                    {
                    // InternalSADL.g:2138:4: (lv_optional_2_0= '?' )
                    // InternalSADL.g:2139:5: lv_optional_2_0= '?'
                    {
                    lv_optional_2_0=(Token)match(input,48,FOLLOW_9); if (state.failed) return current;
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

            // InternalSADL.g:2151:3: ( (lv_description_3_0= RULE_STRING ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_STRING) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalSADL.g:2152:4: (lv_description_3_0= RULE_STRING )
                    {
                    // InternalSADL.g:2152:4: (lv_description_3_0= RULE_STRING )
                    // InternalSADL.g:2153:5: lv_description_3_0= RULE_STRING
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
    // InternalSADL.g:2177:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalSADL.g:2177:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalSADL.g:2178:2: iv_rulePropertyValue= rulePropertyValue EOF
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
    // InternalSADL.g:2184:1: rulePropertyValue returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalSADL.g:2190:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalSADL.g:2191:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalSADL.g:2191:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalSADL.g:2192:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalSADL.g:2192:3: ( (otherlv_0= RULE_ID ) )
            // InternalSADL.g:2193:4: (otherlv_0= RULE_ID )
            {
            // InternalSADL.g:2193:4: (otherlv_0= RULE_ID )
            // InternalSADL.g:2194:5: otherlv_0= RULE_ID
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

            otherlv_1=(Token)match(input,33,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPropertyValueAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalSADL.g:2209:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalSADL.g:2210:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalSADL.g:2210:4: (lv_value_2_0= RULE_STRING )
            // InternalSADL.g:2211:5: lv_value_2_0= RULE_STRING
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
    // InternalSADL.g:2231:1: entryRuleTransport returns [EObject current=null] : iv_ruleTransport= ruleTransport EOF ;
    public final EObject entryRuleTransport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransport = null;


        try {
            // InternalSADL.g:2231:50: (iv_ruleTransport= ruleTransport EOF )
            // InternalSADL.g:2232:2: iv_ruleTransport= ruleTransport EOF
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
    // InternalSADL.g:2238:1: ruleTransport returns [EObject current=null] : (otherlv_0= 'transport' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= 'end' ) ;
    public final EObject ruleTransport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_4=null;
        EObject lv_properties_3_0 = null;



        	enterRule();

        try {
            // InternalSADL.g:2244:2: ( (otherlv_0= 'transport' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= 'end' ) )
            // InternalSADL.g:2245:2: (otherlv_0= 'transport' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= 'end' )
            {
            // InternalSADL.g:2245:2: (otherlv_0= 'transport' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= 'end' )
            // InternalSADL.g:2246:3: otherlv_0= 'transport' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTransportAccess().getTransportKeyword_0());
              		
            }
            // InternalSADL.g:2250:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSADL.g:2251:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSADL.g:2251:4: (lv_name_1_0= RULE_ID )
            // InternalSADL.g:2252:5: lv_name_1_0= RULE_ID
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

            // InternalSADL.g:2268:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_STRING) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalSADL.g:2269:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalSADL.g:2269:4: (lv_description_2_0= RULE_STRING )
                    // InternalSADL.g:2270:5: lv_description_2_0= RULE_STRING
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

            // InternalSADL.g:2286:3: ( (lv_properties_3_0= ruleProperty ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==47) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalSADL.g:2287:4: (lv_properties_3_0= ruleProperty )
            	    {
            	    // InternalSADL.g:2287:4: (lv_properties_3_0= ruleProperty )
            	    // InternalSADL.g:2288:5: lv_properties_3_0= ruleProperty
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
            	    break loop49;
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
    // InternalSADL.g:2313:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // InternalSADL.g:2313:52: (iv_ruleApplication= ruleApplication EOF )
            // InternalSADL.g:2314:2: iv_ruleApplication= ruleApplication EOF
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
    // InternalSADL.g:2320:1: ruleApplication returns [EObject current=null] : (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_containers_3_0= ruleContainer ) )* otherlv_4= 'end' ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_4=null;
        EObject lv_containers_3_0 = null;



        	enterRule();

        try {
            // InternalSADL.g:2326:2: ( (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_containers_3_0= ruleContainer ) )* otherlv_4= 'end' ) )
            // InternalSADL.g:2327:2: (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_containers_3_0= ruleContainer ) )* otherlv_4= 'end' )
            {
            // InternalSADL.g:2327:2: (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_containers_3_0= ruleContainer ) )* otherlv_4= 'end' )
            // InternalSADL.g:2328:3: otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_containers_3_0= ruleContainer ) )* otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getApplicationAccess().getApplicationKeyword_0());
              		
            }
            // InternalSADL.g:2332:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSADL.g:2333:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSADL.g:2333:4: (lv_name_1_0= RULE_ID )
            // InternalSADL.g:2334:5: lv_name_1_0= RULE_ID
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

            // InternalSADL.g:2350:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_STRING) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalSADL.g:2351:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalSADL.g:2351:4: (lv_description_2_0= RULE_STRING )
                    // InternalSADL.g:2352:5: lv_description_2_0= RULE_STRING
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

            // InternalSADL.g:2368:3: ( (lv_containers_3_0= ruleContainer ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==51) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalSADL.g:2369:4: (lv_containers_3_0= ruleContainer )
            	    {
            	    // InternalSADL.g:2369:4: (lv_containers_3_0= ruleContainer )
            	    // InternalSADL.g:2370:5: lv_containers_3_0= ruleContainer
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getApplicationAccess().getContainersContainerParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_53);
            	    lv_containers_3_0=ruleContainer();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getApplicationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"containers",
            	      						lv_containers_3_0,
            	      						"com.leonardo.lsaf.sadl.SADL.Container");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
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
    // InternalSADL.g:2395:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalSADL.g:2395:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalSADL.g:2396:2: iv_ruleContainer= ruleContainer EOF
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
    // InternalSADL.g:2402:1: ruleContainer returns [EObject current=null] : (otherlv_0= 'container' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( (lv_instances_3_0= ruleInstance ) ) | ( (lv_connections_4_0= ruleConnection ) ) | ( (lv_children_5_0= ruleContainer ) ) )* otherlv_6= 'end' ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_6=null;
        EObject lv_instances_3_0 = null;

        EObject lv_connections_4_0 = null;

        EObject lv_children_5_0 = null;



        	enterRule();

        try {
            // InternalSADL.g:2408:2: ( (otherlv_0= 'container' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( (lv_instances_3_0= ruleInstance ) ) | ( (lv_connections_4_0= ruleConnection ) ) | ( (lv_children_5_0= ruleContainer ) ) )* otherlv_6= 'end' ) )
            // InternalSADL.g:2409:2: (otherlv_0= 'container' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( (lv_instances_3_0= ruleInstance ) ) | ( (lv_connections_4_0= ruleConnection ) ) | ( (lv_children_5_0= ruleContainer ) ) )* otherlv_6= 'end' )
            {
            // InternalSADL.g:2409:2: (otherlv_0= 'container' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( (lv_instances_3_0= ruleInstance ) ) | ( (lv_connections_4_0= ruleConnection ) ) | ( (lv_children_5_0= ruleContainer ) ) )* otherlv_6= 'end' )
            // InternalSADL.g:2410:3: otherlv_0= 'container' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( (lv_instances_3_0= ruleInstance ) ) | ( (lv_connections_4_0= ruleConnection ) ) | ( (lv_children_5_0= ruleContainer ) ) )* otherlv_6= 'end'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getContainerAccess().getContainerKeyword_0());
              		
            }
            // InternalSADL.g:2414:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSADL.g:2415:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSADL.g:2415:4: (lv_name_1_0= RULE_ID )
            // InternalSADL.g:2416:5: lv_name_1_0= RULE_ID
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

            // InternalSADL.g:2432:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_STRING) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalSADL.g:2433:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalSADL.g:2433:4: (lv_description_2_0= RULE_STRING )
                    // InternalSADL.g:2434:5: lv_description_2_0= RULE_STRING
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

            // InternalSADL.g:2450:3: ( ( (lv_instances_3_0= ruleInstance ) ) | ( (lv_connections_4_0= ruleConnection ) ) | ( (lv_children_5_0= ruleContainer ) ) )*
            loop53:
            do {
                int alt53=4;
                switch ( input.LA(1) ) {
                case 52:
                    {
                    alt53=1;
                    }
                    break;
                case 53:
                    {
                    alt53=2;
                    }
                    break;
                case 51:
                    {
                    alt53=3;
                    }
                    break;

                }

                switch (alt53) {
            	case 1 :
            	    // InternalSADL.g:2451:4: ( (lv_instances_3_0= ruleInstance ) )
            	    {
            	    // InternalSADL.g:2451:4: ( (lv_instances_3_0= ruleInstance ) )
            	    // InternalSADL.g:2452:5: (lv_instances_3_0= ruleInstance )
            	    {
            	    // InternalSADL.g:2452:5: (lv_instances_3_0= ruleInstance )
            	    // InternalSADL.g:2453:6: lv_instances_3_0= ruleInstance
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getContainerAccess().getInstancesInstanceParserRuleCall_3_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_55);
            	    lv_instances_3_0=ruleInstance();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getContainerRule());
            	      						}
            	      						add(
            	      							current,
            	      							"instances",
            	      							lv_instances_3_0,
            	      							"com.leonardo.lsaf.sadl.SADL.Instance");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSADL.g:2471:4: ( (lv_connections_4_0= ruleConnection ) )
            	    {
            	    // InternalSADL.g:2471:4: ( (lv_connections_4_0= ruleConnection ) )
            	    // InternalSADL.g:2472:5: (lv_connections_4_0= ruleConnection )
            	    {
            	    // InternalSADL.g:2472:5: (lv_connections_4_0= ruleConnection )
            	    // InternalSADL.g:2473:6: lv_connections_4_0= ruleConnection
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
            	    // InternalSADL.g:2491:4: ( (lv_children_5_0= ruleContainer ) )
            	    {
            	    // InternalSADL.g:2491:4: ( (lv_children_5_0= ruleContainer ) )
            	    // InternalSADL.g:2492:5: (lv_children_5_0= ruleContainer )
            	    {
            	    // InternalSADL.g:2492:5: (lv_children_5_0= ruleContainer )
            	    // InternalSADL.g:2493:6: lv_children_5_0= ruleContainer
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getContainerAccess().getChildrenContainerParserRuleCall_3_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_55);
            	    lv_children_5_0=ruleContainer();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getContainerRule());
            	      						}
            	      						add(
            	      							current,
            	      							"children",
            	      							lv_children_5_0,
            	      							"com.leonardo.lsaf.sadl.SADL.Container");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
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


    // $ANTLR start "entryRuleInstance"
    // InternalSADL.g:2519:1: entryRuleInstance returns [EObject current=null] : iv_ruleInstance= ruleInstance EOF ;
    public final EObject entryRuleInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstance = null;


        try {
            // InternalSADL.g:2519:49: (iv_ruleInstance= ruleInstance EOF )
            // InternalSADL.g:2520:2: iv_ruleInstance= ruleInstance EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstanceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInstance=ruleInstance();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstance; 
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
    // $ANTLR end "entryRuleInstance"


    // $ANTLR start "ruleInstance"
    // InternalSADL.g:2526:1: ruleInstance returns [EObject current=null] : (otherlv_0= 'instance' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '[' ( ( (lv_unbounded_4_0= '*' ) ) | ( (lv_lowerBound_5_0= RULE_INT ) ) | ( ( (lv_lowerBound_6_0= RULE_INT ) ) otherlv_7= '..' ( ( (lv_unbounded_8_0= '*' ) ) | ( (lv_upperBound_9_0= RULE_INT ) ) ) ) ) otherlv_10= ']' )? ( (lv_description_11_0= RULE_STRING ) )? otherlv_12= ';' ) ;
    public final EObject ruleInstance() throws RecognitionException {
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
            // InternalSADL.g:2532:2: ( (otherlv_0= 'instance' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '[' ( ( (lv_unbounded_4_0= '*' ) ) | ( (lv_lowerBound_5_0= RULE_INT ) ) | ( ( (lv_lowerBound_6_0= RULE_INT ) ) otherlv_7= '..' ( ( (lv_unbounded_8_0= '*' ) ) | ( (lv_upperBound_9_0= RULE_INT ) ) ) ) ) otherlv_10= ']' )? ( (lv_description_11_0= RULE_STRING ) )? otherlv_12= ';' ) )
            // InternalSADL.g:2533:2: (otherlv_0= 'instance' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '[' ( ( (lv_unbounded_4_0= '*' ) ) | ( (lv_lowerBound_5_0= RULE_INT ) ) | ( ( (lv_lowerBound_6_0= RULE_INT ) ) otherlv_7= '..' ( ( (lv_unbounded_8_0= '*' ) ) | ( (lv_upperBound_9_0= RULE_INT ) ) ) ) ) otherlv_10= ']' )? ( (lv_description_11_0= RULE_STRING ) )? otherlv_12= ';' )
            {
            // InternalSADL.g:2533:2: (otherlv_0= 'instance' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '[' ( ( (lv_unbounded_4_0= '*' ) ) | ( (lv_lowerBound_5_0= RULE_INT ) ) | ( ( (lv_lowerBound_6_0= RULE_INT ) ) otherlv_7= '..' ( ( (lv_unbounded_8_0= '*' ) ) | ( (lv_upperBound_9_0= RULE_INT ) ) ) ) ) otherlv_10= ']' )? ( (lv_description_11_0= RULE_STRING ) )? otherlv_12= ';' )
            // InternalSADL.g:2534:3: otherlv_0= 'instance' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '[' ( ( (lv_unbounded_4_0= '*' ) ) | ( (lv_lowerBound_5_0= RULE_INT ) ) | ( ( (lv_lowerBound_6_0= RULE_INT ) ) otherlv_7= '..' ( ( (lv_unbounded_8_0= '*' ) ) | ( (lv_upperBound_9_0= RULE_INT ) ) ) ) ) otherlv_10= ']' )? ( (lv_description_11_0= RULE_STRING ) )? otherlv_12= ';'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInstanceAccess().getInstanceKeyword_0());
              		
            }
            // InternalSADL.g:2538:3: ( ( ruleQualifiedName ) )
            // InternalSADL.g:2539:4: ( ruleQualifiedName )
            {
            // InternalSADL.g:2539:4: ( ruleQualifiedName )
            // InternalSADL.g:2540:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInstanceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInstanceAccess().getTypeComponentCrossReference_1_0());
              				
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

            // InternalSADL.g:2554:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSADL.g:2555:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSADL.g:2555:4: (lv_name_2_0= RULE_ID )
            // InternalSADL.g:2556:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInstanceRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalSADL.g:2572:3: (otherlv_3= '[' ( ( (lv_unbounded_4_0= '*' ) ) | ( (lv_lowerBound_5_0= RULE_INT ) ) | ( ( (lv_lowerBound_6_0= RULE_INT ) ) otherlv_7= '..' ( ( (lv_unbounded_8_0= '*' ) ) | ( (lv_upperBound_9_0= RULE_INT ) ) ) ) ) otherlv_10= ']' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==25) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalSADL.g:2573:4: otherlv_3= '[' ( ( (lv_unbounded_4_0= '*' ) ) | ( (lv_lowerBound_5_0= RULE_INT ) ) | ( ( (lv_lowerBound_6_0= RULE_INT ) ) otherlv_7= '..' ( ( (lv_unbounded_8_0= '*' ) ) | ( (lv_upperBound_9_0= RULE_INT ) ) ) ) ) otherlv_10= ']'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getInstanceAccess().getLeftSquareBracketKeyword_3_0());
                      			
                    }
                    // InternalSADL.g:2577:4: ( ( (lv_unbounded_4_0= '*' ) ) | ( (lv_lowerBound_5_0= RULE_INT ) ) | ( ( (lv_lowerBound_6_0= RULE_INT ) ) otherlv_7= '..' ( ( (lv_unbounded_8_0= '*' ) ) | ( (lv_upperBound_9_0= RULE_INT ) ) ) ) )
                    int alt55=3;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==26) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==RULE_INT) ) {
                        int LA55_2 = input.LA(2);

                        if ( (LA55_2==35) ) {
                            alt55=3;
                        }
                        else if ( (LA55_2==27) ) {
                            alt55=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 55, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalSADL.g:2578:5: ( (lv_unbounded_4_0= '*' ) )
                            {
                            // InternalSADL.g:2578:5: ( (lv_unbounded_4_0= '*' ) )
                            // InternalSADL.g:2579:6: (lv_unbounded_4_0= '*' )
                            {
                            // InternalSADL.g:2579:6: (lv_unbounded_4_0= '*' )
                            // InternalSADL.g:2580:7: lv_unbounded_4_0= '*'
                            {
                            lv_unbounded_4_0=(Token)match(input,26,FOLLOW_28); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_unbounded_4_0, grammarAccess.getInstanceAccess().getUnboundedAsteriskKeyword_3_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getInstanceRule());
                              							}
                              							setWithLastConsumed(current, "unbounded", lv_unbounded_4_0 != null, "*");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSADL.g:2593:5: ( (lv_lowerBound_5_0= RULE_INT ) )
                            {
                            // InternalSADL.g:2593:5: ( (lv_lowerBound_5_0= RULE_INT ) )
                            // InternalSADL.g:2594:6: (lv_lowerBound_5_0= RULE_INT )
                            {
                            // InternalSADL.g:2594:6: (lv_lowerBound_5_0= RULE_INT )
                            // InternalSADL.g:2595:7: lv_lowerBound_5_0= RULE_INT
                            {
                            lv_lowerBound_5_0=(Token)match(input,RULE_INT,FOLLOW_28); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_lowerBound_5_0, grammarAccess.getInstanceAccess().getLowerBoundINTTerminalRuleCall_3_1_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getInstanceRule());
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
                            // InternalSADL.g:2612:5: ( ( (lv_lowerBound_6_0= RULE_INT ) ) otherlv_7= '..' ( ( (lv_unbounded_8_0= '*' ) ) | ( (lv_upperBound_9_0= RULE_INT ) ) ) )
                            {
                            // InternalSADL.g:2612:5: ( ( (lv_lowerBound_6_0= RULE_INT ) ) otherlv_7= '..' ( ( (lv_unbounded_8_0= '*' ) ) | ( (lv_upperBound_9_0= RULE_INT ) ) ) )
                            // InternalSADL.g:2613:6: ( (lv_lowerBound_6_0= RULE_INT ) ) otherlv_7= '..' ( ( (lv_unbounded_8_0= '*' ) ) | ( (lv_upperBound_9_0= RULE_INT ) ) )
                            {
                            // InternalSADL.g:2613:6: ( (lv_lowerBound_6_0= RULE_INT ) )
                            // InternalSADL.g:2614:7: (lv_lowerBound_6_0= RULE_INT )
                            {
                            // InternalSADL.g:2614:7: (lv_lowerBound_6_0= RULE_INT )
                            // InternalSADL.g:2615:8: lv_lowerBound_6_0= RULE_INT
                            {
                            lv_lowerBound_6_0=(Token)match(input,RULE_INT,FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_lowerBound_6_0, grammarAccess.getInstanceAccess().getLowerBoundINTTerminalRuleCall_3_1_2_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getInstanceRule());
                              								}
                              								setWithLastConsumed(
                              									current,
                              									"lowerBound",
                              									lv_lowerBound_6_0,
                              									"org.eclipse.xtext.common.Terminals.INT");
                              							
                            }

                            }


                            }

                            otherlv_7=(Token)match(input,35,FOLLOW_35); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_7, grammarAccess.getInstanceAccess().getFullStopFullStopKeyword_3_1_2_1());
                              					
                            }
                            // InternalSADL.g:2635:6: ( ( (lv_unbounded_8_0= '*' ) ) | ( (lv_upperBound_9_0= RULE_INT ) ) )
                            int alt54=2;
                            int LA54_0 = input.LA(1);

                            if ( (LA54_0==26) ) {
                                alt54=1;
                            }
                            else if ( (LA54_0==RULE_INT) ) {
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
                                    // InternalSADL.g:2636:7: ( (lv_unbounded_8_0= '*' ) )
                                    {
                                    // InternalSADL.g:2636:7: ( (lv_unbounded_8_0= '*' ) )
                                    // InternalSADL.g:2637:8: (lv_unbounded_8_0= '*' )
                                    {
                                    // InternalSADL.g:2637:8: (lv_unbounded_8_0= '*' )
                                    // InternalSADL.g:2638:9: lv_unbounded_8_0= '*'
                                    {
                                    lv_unbounded_8_0=(Token)match(input,26,FOLLOW_28); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(lv_unbounded_8_0, grammarAccess.getInstanceAccess().getUnboundedAsteriskKeyword_3_1_2_2_0_0());
                                      								
                                    }
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElement(grammarAccess.getInstanceRule());
                                      									}
                                      									setWithLastConsumed(current, "unbounded", lv_unbounded_8_0 != null, "*");
                                      								
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalSADL.g:2651:7: ( (lv_upperBound_9_0= RULE_INT ) )
                                    {
                                    // InternalSADL.g:2651:7: ( (lv_upperBound_9_0= RULE_INT ) )
                                    // InternalSADL.g:2652:8: (lv_upperBound_9_0= RULE_INT )
                                    {
                                    // InternalSADL.g:2652:8: (lv_upperBound_9_0= RULE_INT )
                                    // InternalSADL.g:2653:9: lv_upperBound_9_0= RULE_INT
                                    {
                                    lv_upperBound_9_0=(Token)match(input,RULE_INT,FOLLOW_28); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(lv_upperBound_9_0, grammarAccess.getInstanceAccess().getUpperBoundINTTerminalRuleCall_3_1_2_2_1_0());
                                      								
                                    }
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElement(grammarAccess.getInstanceRule());
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

                    otherlv_10=(Token)match(input,27,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getInstanceAccess().getRightSquareBracketKeyword_3_2());
                      			
                    }

                    }
                    break;

            }

            // InternalSADL.g:2677:3: ( (lv_description_11_0= RULE_STRING ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_STRING) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalSADL.g:2678:4: (lv_description_11_0= RULE_STRING )
                    {
                    // InternalSADL.g:2678:4: (lv_description_11_0= RULE_STRING )
                    // InternalSADL.g:2679:5: lv_description_11_0= RULE_STRING
                    {
                    lv_description_11_0=(Token)match(input,RULE_STRING,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_description_11_0, grammarAccess.getInstanceAccess().getDescriptionSTRINGTerminalRuleCall_4_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getInstanceRule());
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

              			newLeafNode(otherlv_12, grammarAccess.getInstanceAccess().getSemicolonKeyword_5());
              		
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
    // $ANTLR end "ruleInstance"


    // $ANTLR start "entryRuleConnection"
    // InternalSADL.g:2703:1: entryRuleConnection returns [EObject current=null] : iv_ruleConnection= ruleConnection EOF ;
    public final EObject entryRuleConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnection = null;


        try {
            // InternalSADL.g:2703:51: (iv_ruleConnection= ruleConnection EOF )
            // InternalSADL.g:2704:2: iv_ruleConnection= ruleConnection EOF
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
    // InternalSADL.g:2710:1: ruleConnection returns [EObject current=null] : (otherlv_0= 'connect' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '(' (otherlv_3= 'self' | ( ( ruleQualifiedName ) ) ) otherlv_5= '::' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* otherlv_9= 'to' (otherlv_10= 'self' | ( ( ruleQualifiedName ) ) ) otherlv_12= '::' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* otherlv_16= ')' (otherlv_17= 'using' ( (otherlv_18= RULE_ID ) ) (otherlv_19= '(' ( (lv_value_20_0= rulePropertyValue ) ) (otherlv_21= ',' ( (lv_value_22_0= rulePropertyValue ) ) )* otherlv_23= ')' )? )? ( (lv_description_24_0= RULE_STRING ) )? otherlv_25= ';' ) ;
    public final EObject ruleConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
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
            // InternalSADL.g:2716:2: ( (otherlv_0= 'connect' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '(' (otherlv_3= 'self' | ( ( ruleQualifiedName ) ) ) otherlv_5= '::' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* otherlv_9= 'to' (otherlv_10= 'self' | ( ( ruleQualifiedName ) ) ) otherlv_12= '::' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* otherlv_16= ')' (otherlv_17= 'using' ( (otherlv_18= RULE_ID ) ) (otherlv_19= '(' ( (lv_value_20_0= rulePropertyValue ) ) (otherlv_21= ',' ( (lv_value_22_0= rulePropertyValue ) ) )* otherlv_23= ')' )? )? ( (lv_description_24_0= RULE_STRING ) )? otherlv_25= ';' ) )
            // InternalSADL.g:2717:2: (otherlv_0= 'connect' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '(' (otherlv_3= 'self' | ( ( ruleQualifiedName ) ) ) otherlv_5= '::' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* otherlv_9= 'to' (otherlv_10= 'self' | ( ( ruleQualifiedName ) ) ) otherlv_12= '::' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* otherlv_16= ')' (otherlv_17= 'using' ( (otherlv_18= RULE_ID ) ) (otherlv_19= '(' ( (lv_value_20_0= rulePropertyValue ) ) (otherlv_21= ',' ( (lv_value_22_0= rulePropertyValue ) ) )* otherlv_23= ')' )? )? ( (lv_description_24_0= RULE_STRING ) )? otherlv_25= ';' )
            {
            // InternalSADL.g:2717:2: (otherlv_0= 'connect' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '(' (otherlv_3= 'self' | ( ( ruleQualifiedName ) ) ) otherlv_5= '::' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* otherlv_9= 'to' (otherlv_10= 'self' | ( ( ruleQualifiedName ) ) ) otherlv_12= '::' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* otherlv_16= ')' (otherlv_17= 'using' ( (otherlv_18= RULE_ID ) ) (otherlv_19= '(' ( (lv_value_20_0= rulePropertyValue ) ) (otherlv_21= ',' ( (lv_value_22_0= rulePropertyValue ) ) )* otherlv_23= ')' )? )? ( (lv_description_24_0= RULE_STRING ) )? otherlv_25= ';' )
            // InternalSADL.g:2718:3: otherlv_0= 'connect' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '(' (otherlv_3= 'self' | ( ( ruleQualifiedName ) ) ) otherlv_5= '::' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* otherlv_9= 'to' (otherlv_10= 'self' | ( ( ruleQualifiedName ) ) ) otherlv_12= '::' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* otherlv_16= ')' (otherlv_17= 'using' ( (otherlv_18= RULE_ID ) ) (otherlv_19= '(' ( (lv_value_20_0= rulePropertyValue ) ) (otherlv_21= ',' ( (lv_value_22_0= rulePropertyValue ) ) )* otherlv_23= ')' )? )? ( (lv_description_24_0= RULE_STRING ) )? otherlv_25= ';'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConnectionAccess().getConnectKeyword_0());
              		
            }
            // InternalSADL.g:2722:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalSADL.g:2723:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalSADL.g:2723:4: (lv_name_1_0= RULE_ID )
                    // InternalSADL.g:2724:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,28,FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getConnectionAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalSADL.g:2744:3: (otherlv_3= 'self' | ( ( ruleQualifiedName ) ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==54) ) {
                alt59=1;
            }
            else if ( (LA59_0==RULE_ID) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalSADL.g:2745:4: otherlv_3= 'self'
                    {
                    otherlv_3=(Token)match(input,54,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getConnectionAccess().getSelfKeyword_3_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSADL.g:2750:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalSADL.g:2750:4: ( ( ruleQualifiedName ) )
                    // InternalSADL.g:2751:5: ( ruleQualifiedName )
                    {
                    // InternalSADL.g:2751:5: ( ruleQualifiedName )
                    // InternalSADL.g:2752:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConnectionRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConnectionAccess().getFromInstanceCrossReference_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_59);
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

            otherlv_5=(Token)match(input,55,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getConnectionAccess().getColonColonKeyword_4());
              		
            }
            // InternalSADL.g:2771:3: ( ( ruleQualifiedName ) )
            // InternalSADL.g:2772:4: ( ruleQualifiedName )
            {
            // InternalSADL.g:2772:4: ( ruleQualifiedName )
            // InternalSADL.g:2773:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConnectionRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConnectionAccess().getSourcePortCrossReference_5_0());
              				
            }
            pushFollow(FOLLOW_60);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSADL.g:2787:3: (otherlv_7= ',' ( ( ruleQualifiedName ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==45) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalSADL.g:2788:4: otherlv_7= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_7=(Token)match(input,45,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_7, grammarAccess.getConnectionAccess().getCommaKeyword_6_0());
            	      			
            	    }
            	    // InternalSADL.g:2792:4: ( ( ruleQualifiedName ) )
            	    // InternalSADL.g:2793:5: ( ruleQualifiedName )
            	    {
            	    // InternalSADL.g:2793:5: ( ruleQualifiedName )
            	    // InternalSADL.g:2794:6: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getConnectionRule());
            	      						}
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConnectionAccess().getSourcePortCrossReference_6_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_60);
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
            	    break loop60;
                }
            } while (true);

            otherlv_9=(Token)match(input,56,FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getConnectionAccess().getToKeyword_7());
              		
            }
            // InternalSADL.g:2813:3: (otherlv_10= 'self' | ( ( ruleQualifiedName ) ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==54) ) {
                alt61=1;
            }
            else if ( (LA61_0==RULE_ID) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalSADL.g:2814:4: otherlv_10= 'self'
                    {
                    otherlv_10=(Token)match(input,54,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getConnectionAccess().getSelfKeyword_8_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSADL.g:2819:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalSADL.g:2819:4: ( ( ruleQualifiedName ) )
                    // InternalSADL.g:2820:5: ( ruleQualifiedName )
                    {
                    // InternalSADL.g:2820:5: ( ruleQualifiedName )
                    // InternalSADL.g:2821:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConnectionRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConnectionAccess().getToInstanceCrossReference_8_1_0());
                      					
                    }
                    pushFollow(FOLLOW_59);
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

            otherlv_12=(Token)match(input,55,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getConnectionAccess().getColonColonKeyword_9());
              		
            }
            // InternalSADL.g:2840:3: ( ( ruleQualifiedName ) )
            // InternalSADL.g:2841:4: ( ruleQualifiedName )
            {
            // InternalSADL.g:2841:4: ( ruleQualifiedName )
            // InternalSADL.g:2842:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConnectionRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConnectionAccess().getDestinationPortCrossReference_10_0());
              				
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

            // InternalSADL.g:2856:3: (otherlv_14= ',' ( ( ruleQualifiedName ) ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==45) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalSADL.g:2857:4: otherlv_14= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_14=(Token)match(input,45,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_14, grammarAccess.getConnectionAccess().getCommaKeyword_11_0());
            	      			
            	    }
            	    // InternalSADL.g:2861:4: ( ( ruleQualifiedName ) )
            	    // InternalSADL.g:2862:5: ( ruleQualifiedName )
            	    {
            	    // InternalSADL.g:2862:5: ( ruleQualifiedName )
            	    // InternalSADL.g:2863:6: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getConnectionRule());
            	      						}
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConnectionAccess().getDestinationPortCrossReference_11_1_0());
            	      					
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
            	    break loop62;
                }
            } while (true);

            otherlv_16=(Token)match(input,29,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_16, grammarAccess.getConnectionAccess().getRightParenthesisKeyword_12());
              		
            }
            // InternalSADL.g:2882:3: (otherlv_17= 'using' ( (otherlv_18= RULE_ID ) ) (otherlv_19= '(' ( (lv_value_20_0= rulePropertyValue ) ) (otherlv_21= ',' ( (lv_value_22_0= rulePropertyValue ) ) )* otherlv_23= ')' )? )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==57) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalSADL.g:2883:4: otherlv_17= 'using' ( (otherlv_18= RULE_ID ) ) (otherlv_19= '(' ( (lv_value_20_0= rulePropertyValue ) ) (otherlv_21= ',' ( (lv_value_22_0= rulePropertyValue ) ) )* otherlv_23= ')' )?
                    {
                    otherlv_17=(Token)match(input,57,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getConnectionAccess().getUsingKeyword_13_0());
                      			
                    }
                    // InternalSADL.g:2887:4: ( (otherlv_18= RULE_ID ) )
                    // InternalSADL.g:2888:5: (otherlv_18= RULE_ID )
                    {
                    // InternalSADL.g:2888:5: (otherlv_18= RULE_ID )
                    // InternalSADL.g:2889:6: otherlv_18= RULE_ID
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

                    // InternalSADL.g:2900:4: (otherlv_19= '(' ( (lv_value_20_0= rulePropertyValue ) ) (otherlv_21= ',' ( (lv_value_22_0= rulePropertyValue ) ) )* otherlv_23= ')' )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==28) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // InternalSADL.g:2901:5: otherlv_19= '(' ( (lv_value_20_0= rulePropertyValue ) ) (otherlv_21= ',' ( (lv_value_22_0= rulePropertyValue ) ) )* otherlv_23= ')'
                            {
                            otherlv_19=(Token)match(input,28,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_19, grammarAccess.getConnectionAccess().getLeftParenthesisKeyword_13_2_0());
                              				
                            }
                            // InternalSADL.g:2905:5: ( (lv_value_20_0= rulePropertyValue ) )
                            // InternalSADL.g:2906:6: (lv_value_20_0= rulePropertyValue )
                            {
                            // InternalSADL.g:2906:6: (lv_value_20_0= rulePropertyValue )
                            // InternalSADL.g:2907:7: lv_value_20_0= rulePropertyValue
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

                            // InternalSADL.g:2924:5: (otherlv_21= ',' ( (lv_value_22_0= rulePropertyValue ) ) )*
                            loop63:
                            do {
                                int alt63=2;
                                int LA63_0 = input.LA(1);

                                if ( (LA63_0==45) ) {
                                    alt63=1;
                                }


                                switch (alt63) {
                            	case 1 :
                            	    // InternalSADL.g:2925:6: otherlv_21= ',' ( (lv_value_22_0= rulePropertyValue ) )
                            	    {
                            	    otherlv_21=(Token)match(input,45,FOLLOW_4); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_21, grammarAccess.getConnectionAccess().getCommaKeyword_13_2_2_0());
                            	      					
                            	    }
                            	    // InternalSADL.g:2929:6: ( (lv_value_22_0= rulePropertyValue ) )
                            	    // InternalSADL.g:2930:7: (lv_value_22_0= rulePropertyValue )
                            	    {
                            	    // InternalSADL.g:2930:7: (lv_value_22_0= rulePropertyValue )
                            	    // InternalSADL.g:2931:8: lv_value_22_0= rulePropertyValue
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
                            	    break loop63;
                                }
                            } while (true);

                            otherlv_23=(Token)match(input,29,FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_23, grammarAccess.getConnectionAccess().getRightParenthesisKeyword_13_2_3());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalSADL.g:2955:3: ( (lv_description_24_0= RULE_STRING ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_STRING) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalSADL.g:2956:4: (lv_description_24_0= RULE_STRING )
                    {
                    // InternalSADL.g:2956:4: (lv_description_24_0= RULE_STRING )
                    // InternalSADL.g:2957:5: lv_description_24_0= RULE_STRING
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
    // InternalSADL.g:2981:1: entryRuleDeployment returns [EObject current=null] : iv_ruleDeployment= ruleDeployment EOF ;
    public final EObject entryRuleDeployment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeployment = null;


        try {
            // InternalSADL.g:2981:51: (iv_ruleDeployment= ruleDeployment EOF )
            // InternalSADL.g:2982:2: iv_ruleDeployment= ruleDeployment EOF
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
    // InternalSADL.g:2988:1: ruleDeployment returns [EObject current=null] : (otherlv_0= 'deployment' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( (lv_containermapping_3_0= ruleContainerMapping ) ) | ( (lv_connectionmapping_4_0= ruleConnectionMapping ) ) )* otherlv_5= 'end' ) ;
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
            // InternalSADL.g:2994:2: ( (otherlv_0= 'deployment' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( (lv_containermapping_3_0= ruleContainerMapping ) ) | ( (lv_connectionmapping_4_0= ruleConnectionMapping ) ) )* otherlv_5= 'end' ) )
            // InternalSADL.g:2995:2: (otherlv_0= 'deployment' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( (lv_containermapping_3_0= ruleContainerMapping ) ) | ( (lv_connectionmapping_4_0= ruleConnectionMapping ) ) )* otherlv_5= 'end' )
            {
            // InternalSADL.g:2995:2: (otherlv_0= 'deployment' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( (lv_containermapping_3_0= ruleContainerMapping ) ) | ( (lv_connectionmapping_4_0= ruleConnectionMapping ) ) )* otherlv_5= 'end' )
            // InternalSADL.g:2996:3: otherlv_0= 'deployment' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( ( (lv_containermapping_3_0= ruleContainerMapping ) ) | ( (lv_connectionmapping_4_0= ruleConnectionMapping ) ) )* otherlv_5= 'end'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDeploymentAccess().getDeploymentKeyword_0());
              		
            }
            // InternalSADL.g:3000:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSADL.g:3001:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSADL.g:3001:4: (lv_name_1_0= RULE_ID )
            // InternalSADL.g:3002:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_62); if (state.failed) return current;
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

            // InternalSADL.g:3018:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_STRING) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalSADL.g:3019:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalSADL.g:3019:4: (lv_description_2_0= RULE_STRING )
                    // InternalSADL.g:3020:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_63); if (state.failed) return current;
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

            // InternalSADL.g:3036:3: ( ( (lv_containermapping_3_0= ruleContainerMapping ) ) | ( (lv_connectionmapping_4_0= ruleConnectionMapping ) ) )*
            loop68:
            do {
                int alt68=3;
                alt68 = dfa68.predict(input);
                switch (alt68) {
            	case 1 :
            	    // InternalSADL.g:3037:4: ( (lv_containermapping_3_0= ruleContainerMapping ) )
            	    {
            	    // InternalSADL.g:3037:4: ( (lv_containermapping_3_0= ruleContainerMapping ) )
            	    // InternalSADL.g:3038:5: (lv_containermapping_3_0= ruleContainerMapping )
            	    {
            	    // InternalSADL.g:3038:5: (lv_containermapping_3_0= ruleContainerMapping )
            	    // InternalSADL.g:3039:6: lv_containermapping_3_0= ruleContainerMapping
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDeploymentAccess().getContainermappingContainerMappingParserRuleCall_3_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_63);
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
            	    // InternalSADL.g:3057:4: ( (lv_connectionmapping_4_0= ruleConnectionMapping ) )
            	    {
            	    // InternalSADL.g:3057:4: ( (lv_connectionmapping_4_0= ruleConnectionMapping ) )
            	    // InternalSADL.g:3058:5: (lv_connectionmapping_4_0= ruleConnectionMapping )
            	    {
            	    // InternalSADL.g:3058:5: (lv_connectionmapping_4_0= ruleConnectionMapping )
            	    // InternalSADL.g:3059:6: lv_connectionmapping_4_0= ruleConnectionMapping
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDeploymentAccess().getConnectionmappingConnectionMappingParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_63);
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
            	    break loop68;
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
    // InternalSADL.g:3085:1: entryRuleContainerMapping returns [EObject current=null] : iv_ruleContainerMapping= ruleContainerMapping EOF ;
    public final EObject entryRuleContainerMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerMapping = null;


        try {
            // InternalSADL.g:3085:57: (iv_ruleContainerMapping= ruleContainerMapping EOF )
            // InternalSADL.g:3086:2: iv_ruleContainerMapping= ruleContainerMapping EOF
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
    // InternalSADL.g:3092:1: ruleContainerMapping returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= 'hosts' ( ( ruleQualifiedName ) ) otherlv_3= ';' ) ;
    public final EObject ruleContainerMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSADL.g:3098:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= 'hosts' ( ( ruleQualifiedName ) ) otherlv_3= ';' ) )
            // InternalSADL.g:3099:2: ( ( ( ruleQualifiedName ) ) otherlv_1= 'hosts' ( ( ruleQualifiedName ) ) otherlv_3= ';' )
            {
            // InternalSADL.g:3099:2: ( ( ( ruleQualifiedName ) ) otherlv_1= 'hosts' ( ( ruleQualifiedName ) ) otherlv_3= ';' )
            // InternalSADL.g:3100:3: ( ( ruleQualifiedName ) ) otherlv_1= 'hosts' ( ( ruleQualifiedName ) ) otherlv_3= ';'
            {
            // InternalSADL.g:3100:3: ( ( ruleQualifiedName ) )
            // InternalSADL.g:3101:4: ( ruleQualifiedName )
            {
            // InternalSADL.g:3101:4: ( ruleQualifiedName )
            // InternalSADL.g:3102:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getContainerMappingRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContainerMappingAccess().getProcessorProcessorCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_64);
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
            // InternalSADL.g:3120:3: ( ( ruleQualifiedName ) )
            // InternalSADL.g:3121:4: ( ruleQualifiedName )
            {
            // InternalSADL.g:3121:4: ( ruleQualifiedName )
            // InternalSADL.g:3122:5: ruleQualifiedName
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
    // InternalSADL.g:3144:1: entryRuleConnectionMapping returns [EObject current=null] : iv_ruleConnectionMapping= ruleConnectionMapping EOF ;
    public final EObject entryRuleConnectionMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectionMapping = null;


        try {
            // InternalSADL.g:3144:58: (iv_ruleConnectionMapping= ruleConnectionMapping EOF )
            // InternalSADL.g:3145:2: iv_ruleConnectionMapping= ruleConnectionMapping EOF
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
    // InternalSADL.g:3151:1: ruleConnectionMapping returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= 'carries' ( ( ruleQualifiedName ) ) otherlv_3= ';' ) ;
    public final EObject ruleConnectionMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSADL.g:3157:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= 'carries' ( ( ruleQualifiedName ) ) otherlv_3= ';' ) )
            // InternalSADL.g:3158:2: ( ( ( ruleQualifiedName ) ) otherlv_1= 'carries' ( ( ruleQualifiedName ) ) otherlv_3= ';' )
            {
            // InternalSADL.g:3158:2: ( ( ( ruleQualifiedName ) ) otherlv_1= 'carries' ( ( ruleQualifiedName ) ) otherlv_3= ';' )
            // InternalSADL.g:3159:3: ( ( ruleQualifiedName ) ) otherlv_1= 'carries' ( ( ruleQualifiedName ) ) otherlv_3= ';'
            {
            // InternalSADL.g:3159:3: ( ( ruleQualifiedName ) )
            // InternalSADL.g:3160:4: ( ruleQualifiedName )
            {
            // InternalSADL.g:3160:4: ( ruleQualifiedName )
            // InternalSADL.g:3161:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConnectionMappingRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConnectionMappingAccess().getLinkLinkCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_65);
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
            // InternalSADL.g:3179:3: ( ( ruleQualifiedName ) )
            // InternalSADL.g:3180:4: ( ruleQualifiedName )
            {
            // InternalSADL.g:3180:4: ( ruleQualifiedName )
            // InternalSADL.g:3181:5: ruleQualifiedName
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
    // InternalSADL.g:3203:1: entryRuleStrategy returns [EObject current=null] : iv_ruleStrategy= ruleStrategy EOF ;
    public final EObject entryRuleStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrategy = null;


        try {
            // InternalSADL.g:3203:49: (iv_ruleStrategy= ruleStrategy EOF )
            // InternalSADL.g:3204:2: iv_ruleStrategy= ruleStrategy EOF
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
    // InternalSADL.g:3210:1: ruleStrategy returns [EObject current=null] : (otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= 'end' ) ;
    public final EObject ruleStrategy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_4=null;
        EObject lv_properties_3_0 = null;



        	enterRule();

        try {
            // InternalSADL.g:3216:2: ( (otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= 'end' ) )
            // InternalSADL.g:3217:2: (otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= 'end' )
            {
            // InternalSADL.g:3217:2: (otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= 'end' )
            // InternalSADL.g:3218:3: otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStrategyAccess().getStrategyKeyword_0());
              		
            }
            // InternalSADL.g:3222:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSADL.g:3223:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSADL.g:3223:4: (lv_name_1_0= RULE_ID )
            // InternalSADL.g:3224:5: lv_name_1_0= RULE_ID
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

            // InternalSADL.g:3240:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_STRING) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalSADL.g:3241:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalSADL.g:3241:4: (lv_description_2_0= RULE_STRING )
                    // InternalSADL.g:3242:5: lv_description_2_0= RULE_STRING
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

            // InternalSADL.g:3258:3: ( (lv_properties_3_0= ruleProperty ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==47) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // InternalSADL.g:3259:4: (lv_properties_3_0= ruleProperty )
            	    {
            	    // InternalSADL.g:3259:4: (lv_properties_3_0= ruleProperty )
            	    // InternalSADL.g:3260:5: lv_properties_3_0= ruleProperty
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
            	    break loop70;
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


    protected DFA68 dfa68 = new DFA68(this);
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

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 3036:3: ( ( (lv_containermapping_3_0= ruleContainerMapping ) ) | ( (lv_connectionmapping_4_0= ruleConnectionMapping ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x2406020001ECA010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x2406020001ECA000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001000002010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000120040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000180002010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000180002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000500002010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000500002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000052100040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000052010040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000052000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200020010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000012020050L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000010020010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000C0000002010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00000C0000002000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000500000002010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000500000002000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000200020000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000400000002000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0001000000020010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000800000002010L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000800000002000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0008000000002010L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0008000000002000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0038000000002010L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0038000000002000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000002020010L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0040000000000020L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0100200000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0200000000020010L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x1000000000000000L});

}