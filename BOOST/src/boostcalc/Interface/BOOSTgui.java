package boostcalc.Interface;

/**
 * This Class will create the GUI for the 8ps form
 * that will be a part of the larger 'care transitions' software project 
 * The 8 Ps: 
 * Problem Medications
 * Psychological 
 * Principal Diagnosis
 * Polypharmacy 
 * Poor health literacy
 * Patient support 
 * Prior Hospitalization
 * Pallative Care
 * 
 * 
 * Name and Identifier must be labeled in this window as well
 * 
 * .
 */

import boostcalc.the8Ps.PallativeCare;
import boostcalc.the8Ps.PatientSupport;
import boostcalc.the8Ps.PhysicalLimitations;
import boostcalc.the8Ps.Polypharmacy;
import boostcalc.the8Ps.PoorhealthLiteracy;
import boostcalc.the8Ps.PrincipalDiagnosis;
import boostcalc.the8Ps.PriorHospitalization;
import boostcalc.the8Ps.PsychologicalFactors;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Joseph Edward
 */
public class BOOSTgui extends JFrame  implements ActionListener
{
    //Dont need to be static for now because we are just counting them 
    private static boolean phyLim;
    private static boolean psych;
    private static boolean principalDiag;
    private static boolean polyPharm;
    private static boolean poorHealthLit; 
    private static boolean patSupport; 
    private static boolean priorHosp;
    private static boolean pallCare;
    private int BOOSTscore;
    private JTextField displayScore;
    private adviceWindow recAdviceWindow;
   
  public BOOSTgui()
    {
    this.setTitle("THe 8 P's Risk Assessment Checklist ");
    this.setLayout(new GridLayout(10,1));
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.phyLim();
    this.psych();
    this.principalDiag();
    this.polyPharm();
    this.poorHealthLit();
    this.patSupport();
    this.priorHosp();
    this.pallCare();
    this.calculateScore();
    this.outputBOOSTtotal();
    this.pack();
    this.setLocationRelativeTo(null);
    this.setVisible(true);
    }

    private void phyLim(){
        JPanel jplPhyLim = new JPanel();
        JLabel jlbPhyLim = new JLabel("Physical Limitations : ");
       JCheckBox jcbPhyLim =new JCheckBox();
        jcbPhyLim.addItemListener((ItemEvent e) -> {
            phyLim = e.getStateChange() == ItemEvent.SELECTED;  
        } //end itemStateChanged
        );
        jplPhyLim.setLayout(new GridLayout(1,2));
        jplPhyLim.add(jlbPhyLim);
        jplPhyLim.add(jcbPhyLim);//add textfield to panel 
        this.add(jplPhyLim);
    }
    
    private void psych()
    {
        JPanel jplPsych = new JPanel();
        JLabel jlbPsych = new JLabel("Psychological Factors  : ");
       JCheckBox jcbPsych =new JCheckBox();
        jcbPsych.addItemListener((ItemEvent e) -> {
            psych = e.getStateChange() == ItemEvent.SELECTED;
            
        } //end itemStateChanged
        );             
        jplPsych.setLayout(new GridLayout(1,2));
        jplPsych.add(jlbPsych);
        jplPsych.add(jcbPsych);//add textfield to panel 
        this.add(jplPsych);
    }
    
    private void principalDiag()
    {
        JPanel jplPrincipalDiag = new JPanel();
        JLabel jlbPrincipalDiag = new JLabel("Principal Diagnosis: ");
       JCheckBox jcbPrincipalDiag =new JCheckBox();
        jcbPrincipalDiag.addItemListener((ItemEvent e) -> {
            principalDiag = e.getStateChange() == ItemEvent.SELECTED;  
        } //end itemStateChanged
        );              
        jplPrincipalDiag.setLayout(new GridLayout(1,2));
        jplPrincipalDiag.add(jlbPrincipalDiag);
        jplPrincipalDiag.add(jcbPrincipalDiag);//add textfield to panel 
        this.add(jplPrincipalDiag);
    }
    
    
    private void polyPharm()
    {
        JPanel jplPolyPharm = new JPanel();
        JLabel jlbPolyPharm = new JLabel("Polypharmacy : ");
       JCheckBox jcbPolyPharm =new JCheckBox();
        jcbPolyPharm.addItemListener((ItemEvent e) -> {
            polyPharm = e.getStateChange() == ItemEvent.SELECTED;
            
        } //end itemStateChanged
        );
                  
        jplPolyPharm.setLayout(new GridLayout(1,2));
        jplPolyPharm.add(jlbPolyPharm);
        jplPolyPharm.add(jcbPolyPharm);//add textfield to panel 
        this.add(jplPolyPharm);
    }
    
    
    private void poorHealthLit()
    {
        JPanel jplPoorHealth = new JPanel();
        JLabel jlbPoorHealth = new JLabel("Poor Health Literacy : ");
       JCheckBox jcbPoorHealth =new JCheckBox();
        jcbPoorHealth.addItemListener((ItemEvent e) -> {
            poorHealthLit = e.getStateChange() == ItemEvent.SELECTED;
            
        } //end itemStateChanged
        );
                  
        jplPoorHealth.setLayout(new GridLayout(1,2));
        jplPoorHealth.add(jlbPoorHealth);
        jplPoorHealth.add(jcbPoorHealth);//add textfield to panel 
        this.add(jplPoorHealth);
    }
    
    private void patSupport()
    {
        JPanel jplPatSupport = new JPanel();
        JLabel jlbPatSupport = new JLabel("Patient Support  : ");
       JCheckBox jcbPatSupport =new JCheckBox();
        jcbPatSupport.addItemListener((ItemEvent e) -> {
            patSupport = e.getStateChange() == ItemEvent.SELECTED;
        } //end itemStateChanged
        );
               
        jplPatSupport.setLayout(new GridLayout(1,2));
        jplPatSupport.add(jlbPatSupport);
        jplPatSupport.add(jcbPatSupport);//add textfield to panel 
        this.add(jplPatSupport);
    }
    
    private void priorHosp()
    {

        JPanel jplPriorHosp = new JPanel();
        JLabel jlbPriorHosp = new JLabel("Prior Hospitalization  : ");
       JCheckBox jcbPriorHosp =new JCheckBox();
        jcbPriorHosp.addItemListener((ItemEvent e) -> {
            priorHosp = e.getStateChange() == ItemEvent.SELECTED;
        } //end itemStateChanged
        );
               
        jplPriorHosp.setLayout(new GridLayout(1,2));
        jplPriorHosp.add(jlbPriorHosp);
        jplPriorHosp.add(jcbPriorHosp);//add textfield to panel 
        this.add(jplPriorHosp);
    
        
    }
    
    private void pallCare()
    {
        
        JPanel jplPallCare = new JPanel();
        JLabel jlbPallCare = new JLabel("Pallative Care  : ");
       JCheckBox jcbPallCare =new JCheckBox();
        jcbPallCare.addItemListener((ItemEvent e) -> {
            pallCare = e.getStateChange() == ItemEvent.SELECTED;
        } //end itemStateChanged
        );
               
        jplPallCare.setLayout(new GridLayout(1,2));
        jplPallCare.add(jlbPallCare);
        jplPallCare.add(jcbPallCare);//add textfield to panel 
        this.add(jplPallCare);
       
       
    }
    
    private void calculateScore()
    {
     JPanel jplCalcButton=new JPanel();    
     JButton jbCalcButton=new JButton();
     jbCalcButton.setText("Record BOOST Total");
     jbCalcButton.addActionListener(this);
     jplCalcButton.add(jbCalcButton);
     this.add(jplCalcButton);
    }
    
    
    
    
    private ArrayList getBOOSTentries()
    {
    ArrayList theEntries= new ArrayList();
    
    theEntries.add(phyLim);
    theEntries.add(psych);
    theEntries.add(principalDiag);
    theEntries.add(polyPharm);
    theEntries.add(poorHealthLit);
    theEntries.add(patSupport);
    theEntries.add(priorHosp);
    theEntries.add(pallCare);
    
    return theEntries;
    }
    
    
    
    /**
     * This method counts the check boxs and sets the int value of the BOOST score 
     */
    private void calcBOOSTscore()
    {
    int counter=0;
    
    ArrayList theEntries=this.getBOOSTentries();
    
    for(int i=0;i<theEntries.size();i++)
    {
    if((Boolean)theEntries.get(i)==true)
    {
    counter++;
    }
    }
        
    BOOSTscore=counter;    
    displayScore.setText(String.valueOf(BOOSTscore));//Set the score in the text field? 
  
   this.createAdviceWindow(counter);
    }
    
    
    
    
    private void outputBOOSTtotal()
    {
    JPanel outputTotal=new JPanel();
    JLabel jlbBOOST= new JLabel("BOOST Total: ");
    displayScore= new JTextField(10);
    outputTotal.setLayout(new GridLayout(1,2));
    outputTotal.add(jlbBOOST);
    outputTotal.add(displayScore);
     this.add(outputTotal);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.calcBOOSTscore();
    }
    
    
    
    //Accessor Method 
    public int getBOOSTscore()
    {
    return(BOOSTscore);
    
    }
    
   
    //accessor method
    public static boolean getRFstate(boolean riskFactor)
    {
    return riskFactor;
    
    }

     //Creates instances of the specific classes
    //At this stage will only be used for outputting reccomendations about health factors
    //but is structured so that we could ask for specific information related to the risk factor
   
    private void createAdviceWindow(int numAdvicePanels)
    {
        String title="Risk Specific Intervention: ";
        
        if(phyLim==true){title+=" Physical Limitations";}
        if(title.contains(" Physical Limitations")){title+=",";}
        
        if(psych==true){title+=" Psychological Factors";}
        if(title.contains(" Psychological Factors")){title+=",";}
        
        if(principalDiag==true){title+=" Principal Diagnosis";}
        if(title.contains(" Principal Diagnosis")){title+=",";}
        
        if(polyPharm==true){title+=" Polypharmacy Problems";}
        if(title.contains(" Polypharmacy Problems")){title+=",";}
        
        if(poorHealthLit==true){title+=" Poor Health Literacy";}
        if(title.contains(" Poor Health Literacy")){title+=",";}
        
        if(patSupport==true){title+=" Patient Support Issues";}
        if(title.contains(" Patient Support Issues")){title+=",";}
        
        if(priorHosp==true){title+=" Prior Hospitalization";}
        if(title.contains(" Prior Hospitalization")){title+=",";}
                
        if(pallCare==true){title+=" Pallative Care";}
  
                    
    recAdviceWindow=new adviceWindow(title,numAdvicePanels);
    
        if(phyLim==true){PhysicalLimitations phyLimWin=new PhysicalLimitations();
        recAdviceWindow.add(phyLimWin.getContentPane());
        }   
        
        if(psych==true){PsychologicalFactors psychFacWin=new PsychologicalFactors();
        recAdviceWindow.add(psychFacWin.getContentPane());
        }
        
        if(principalDiag==true){PrincipalDiagnosis prinDiagWin=new PrincipalDiagnosis();
        recAdviceWindow.add(prinDiagWin.getContentPane());
        }        
        
        if(polyPharm==true){Polypharmacy polyPharmWin=new Polypharmacy();
        recAdviceWindow.add(polyPharmWin.getContentPane());
        }       
        
        if(poorHealthLit==true){PoorhealthLiteracy poorHealthLitWin=new PoorhealthLiteracy();
        recAdviceWindow.add(poorHealthLitWin.getContentPane());
        }        
        
        if(patSupport==true){PatientSupport patSupWin=new PatientSupport();
        recAdviceWindow.add(patSupWin.getContentPane());
        }
        
        if(priorHosp==true){PriorHospitalization priorHospWin= new PriorHospitalization();
        recAdviceWindow.add(priorHospWin.getContentPane());
        }
        
        if(pallCare==true){PallativeCare pallCareWin= new PallativeCare();
        recAdviceWindow.add(pallCareWin.getContentPane());
        } 
 
        recAdviceWindow.pack();
    recAdviceWindow.setVisible(true);
    }
    
    
    
}

