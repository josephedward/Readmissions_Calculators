/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boostcalc.the8Ps;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author joev
 */
public class PoorhealthLiteracy extends JFrame {
     public PoorhealthLiteracy()
    {
    this.setTitle("Risk Specific Intervention- Poor Health Literacy");
    this.setLayout(new GridLayout(4,1));
    //1 for each of the intervention reccomendations until we learn newline trick
    JTextField jtfPHLRW1=new JTextField();
    JTextField jtfPHLRW2=new JTextField();
    JTextField jtfPHLRW3=new JTextField();
    JTextField jtfPHLRW4=new JTextField();
    
    jtfPHLRW1.setText("Committed caregiver involved in planning/administration of all discharge planning and general and risk specific interventions");
    jtfPHLRW2.setText("Post-hospital care plan education using Teach Back provided to patient and caregiver");
    jtfPHLRW3.setText("Link to community resources for additional patient/caregiver support");
    jtfPHLRW4.setText("Follow-up phone call at 72 hours to assess adherence and complications");
    
    this.add(jtfPHLRW1);
    this.add(jtfPHLRW2);
    this.add(jtfPHLRW3);
    this.add(jtfPHLRW4);
    
    this.pack();
    this.setLocationRelativeTo(this.getParent());
   // phlrw.setVisible(true);
    
}
}
