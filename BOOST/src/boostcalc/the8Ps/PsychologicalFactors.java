/**
 * 
 */
package boostcalc.the8Ps;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author joev
 */
public class PsychologicalFactors extends JFrame{
    
    
    public PsychologicalFactors()
    {
    this.setTitle("Risk Specific Intervention- Psychological Factors");
    this.setLayout(new GridLayout(3,1));
    //1 for each of the intervention reccomendations until we learn newline trick
    JTextField jtfPFRW1=new JTextField();
    JTextField jtfPFRW2=new JTextField();
    JTextField jtfPFRW3=new JTextField();
    
    
    jtfPFRW1.setText("Assessment of need for psychiatric care if not in place");
    jtfPFRW2.setText("Communication with primary care provider, highlighting this issue if new");
    jtfPFRW3.setText("Involvement/awareness of support network insured");
    
    
    this.add(jtfPFRW1);
    this.add(jtfPFRW2);
    this.add(jtfPFRW3);
    
    this.pack();
    this.setLocationRelativeTo(this.getParent());
   // pfrw.setVisible(true);
   
    }
    
}
