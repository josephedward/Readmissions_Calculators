package lacecalc.Interface;

/**
 * This class will create the graphical interface for the program 
 * 
 * NEED to Refactor so that NAME and INDENTIFIER 
 * are entered in the coordinating frame
 * (and are attributes of the PATIENT class)
 * BUT Name and Identifier must be labeled in this window as well
 * figure out how to close windows as new ones open
 * bring up old windows
 * 
 * Also need to add a 'record LACE score' button at the bottom
 * . 
 */
import lacecalc.Scoring.theAttributes;
import java.awt.BorderLayout;
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
import javax.swing.SwingConstants;
/**
 *
 * @author Joseph Edward 
 */
public class LACEgui extends JFrame implements ActionListener {
    
    
   private static JTextField jtfLOS;
   private static JCheckBox jcbAA; 
   private static boolean boolAA;
   private static JTextField jtfCCMBS;
   private static JTextField jtfEDV;
   private static JTextField jtfLACEscore;
   private static JTextField jtfRISK;
   private static int LACEscore; 
   
    
    
    public LACEgui()
    {
        this.setTitle("LACE Graphical User Interface");
        this.setLayout(new GridLayout(7,1));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//because this is the root panel the program must stop when the window is close
        //Set up different panels 
        this.LOSpanel();
        this.AApanel();
        this.CCMBSpanel();
        this.EDVpanel();
        //Call method to create button to calculate? 
       this.calculateLACEtotalPanel();
       //For showing it 
       this.displayLACEtotalPanel();
       //For Risk Determination 
       this.displayRISKpanel();  
        //Get it tight
        this.pack();  
        this.setVisible(true);
      }
    
    
    
    private void LOSpanel()
    {
        //Length of Stay 
        JPanel jplLOS = new JPanel();//create a panel
        JLabel jlbLOS=new JLabel("Length of Last Hospitalization :");//Create lable for it 
        jtfLOS=new JTextField(10);
        jplLOS.setLayout(new GridLayout(1,2));
        jplLOS.add(jlbLOS);//add label to panel
        jplLOS.add(jtfLOS);//add textfield to panel
        this.add(jplLOS);//add panel to frame 
        
    }
    
            
    private void AApanel()
    {
        //Acute Admission 
        JPanel jplAA = new JPanel();
        JLabel jlbAA = new JLabel("Acute Admission (true/false) : ");
        jcbAA=new JCheckBox();
        jcbAA.addItemListener((ItemEvent e) -> {
            boolAA = e.getStateChange() == ItemEvent.SELECTED;
        } //end itemStateChanged
        );
                  
        jplAA.setLayout(new GridLayout(1,2));
        jplAA.add(jlbAA);
        jplAA.add(jcbAA);//add textfield to panel 
        this.add(jplAA);
               
     }
                    
     private void CCMBSpanel()//WILL EXPAND INTO CHECKLIST FOR COMORBIDITIES
     {
       //Charlson Comorbidity Score 
        JPanel jplCCMBS=new JPanel();
        JLabel jlbCCMBS = new JLabel("Charlson Comorbidity Score :");
        jtfCCMBS=new JTextField(10);
        jplCCMBS.setLayout(new GridLayout(1,2));
        jplCCMBS.add(jlbCCMBS);
        jplCCMBS.add(jtfCCMBS);//add textfield to panel
        this.add(jplCCMBS);
     }
     
     private void EDVpanel()
     {
        //ED visits per year
        JPanel jplEDV=new JPanel();
        JLabel jlbEDV = new JLabel("Number of ED visits in past year:");
        jtfEDV=new JTextField(10);
        jplEDV.setLayout(new GridLayout(1,2));
        jplEDV.add(jlbEDV);
        jplEDV.add(jtfEDV);//add textfield to panel
        this.add(jplEDV);
     }
  
     private void calculateLACEtotalPanel()
     {   
     JPanel jplCalcButton=new JPanel();    
     JButton jbCalcButton=new JButton();
     jbCalcButton.setText("Calculate LACE Total");
     jbCalcButton.addActionListener(this);
     jplCalcButton.add(jbCalcButton);
     
     this.add(jplCalcButton);
     } 

     
     private void displayLACEtotalPanel()
     {
     JPanel jplLACEscore=new JPanel();
     JLabel jlbLACEscore=new JLabel("Patient's LACE total: ");
     jtfLACEscore=new JTextField(10);
     jplLACEscore.setLayout(new GridLayout(1,2));
     jplLACEscore.add(jlbLACEscore);
     jplLACEscore.add(jtfLACEscore);
     this.add(jplLACEscore);
     }
     
    
     private void displayRISKpanel()
     {
     JPanel jplRISK=new JPanel();
     JLabel jlbRISK=new JLabel("Risk Classification: ");
     jtfRISK= new JTextField(10);
     jplRISK.setLayout(new GridLayout(1,2));
     jplRISK.add(jlbRISK);
     jplRISK.add(jtfRISK);
     this.add(jplRISK);
     
         
     
     }
     
     
     /**
      * Generates Attribute class, which in turn generates value and points classes
      * Provides values from text field to attribute methods (one method per attribute )
      * (unless we need individual listeners for each method, will take experimentation)
      * Feeds the final score back to the LACE total panel 
      * (hopefully without needing a listener for that class ).
      *
      * 
     * @param e
      */
   @Override
    public void actionPerformed(ActionEvent e) 
    {
        
        //Need to put text items in arraylist
        //then use attribute constructor (need to code) to call private methods
        //dont directly access them from other classes- insecure
       
        try{
        ArrayList attList=new ArrayList();
      attList.add(jtfLOS.getText());//LOS==index of 0 in arraylist
      attList.add(String.valueOf(boolAA));//i=1
      attList.add(jtfCCMBS.getText());//i=2
      attList.add(jtfEDV.getText());//i=3
       theAttributes theATTs=new theAttributes();//had taken arrayLIst as argument to constructor
       theATTs.getTextAttributes(attList);
        jtfLACEscore.setText(String.valueOf(theATTs.getPoints()));//Allowed to print an int? 
        LACEscore=Integer.parseInt(jtfLACEscore.getText());
        jtfRISK.setText(theATTs.getRisk());    
        }
        catch(NumberFormatException Ex)//USE THIS AN AN ERROR WINDOW TEMPLATE
        {
        JFrame errorWindow=new JFrame();
        errorWindow.setSize(200, 100);
        JLabel errWinLBL=new JLabel("Error: Invalid Input Occured! ", SwingConstants.CENTER );
        errorWindow.add(BorderLayout.CENTER,errWinLBL);
        errorWindow.setVisible(true);
        }
            
    
    }
     
   
    public static ArrayList getLACEentries()
    {
    ArrayList theEntries= new ArrayList();
        
     try{   
  //theEntries.add(jtfNAME.getText());
  //theEntries.add(jtfID.getText());
    theEntries.add(jtfLOS.getText());
    theEntries.add(boolAA);
    theEntries.add(jtfCCMBS.getText());
    theEntries.add(jtfEDV.getText());
    theEntries.add(jtfLACEscore.getText());
    theEntries.add(jtfRISK.getText());
    }
    catch(NullPointerException e)
    {
    System.out.println("Null Pointer Exception: LACE Values have not been provided.");
    
    }
    return theEntries;
     
    }

    //Accessor method 
    public static int getLACEscore()
    {
    return(LACEscore);
    }
    
    
    
    
    
}
    
     
    


