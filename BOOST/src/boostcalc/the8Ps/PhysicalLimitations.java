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
public class PhysicalLimitations extends JFrame {
    
    public PhysicalLimitations()
    {
    this.setTitle("Risk Specific Intervention- Physical Limitations");
    this.setLayout(new GridLayout(3,1));
    //1 for each of the intervention reccomendations until we learn newline trick
    JTextField jtfPLRW1=new JTextField();
    JTextField jtfPLRW2=new JTextField();
    JTextField jtfPLRW3=new JTextField();
    
    
    jtfPLRW1.setText("Engage family/caregivers to ensure ability to assist with post-discharge care assistance");
    jtfPLRW2.setText("Assessment of home services to address limitations and care needs");
    jtfPLRW3.setText("Follow-up phone call at 72 hours to assess ability to adhere to the care plan with services and support in place.");
    
    
    this.add(jtfPLRW1);
    this.add(jtfPLRW2);
    this.add(jtfPLRW3);
    
    this.pack();
    this.setLocationRelativeTo(this.getParent());
  //  plrw.setVisible(true);
    
    }
    
    
}
