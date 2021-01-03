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
public class Polypharmacy extends JFrame{
     
    public Polypharmacy()
    {
    this.setTitle("Risk Specific Intervention- Polypharmacy");
    this.setLayout(new GridLayout(6,1));
    //1 for each of the intervention reccomendations until we learn newline trick
    JTextField jtfPPRW1=new JTextField();
    JTextField jtfPPRW2=new JTextField();
    JTextField jtfPPRW3=new JTextField();
    JTextField jtfPPRW4=new JTextField();
    JTextField jtfPPRW5=new JTextField();
    JTextField jtfPPRW6=new JTextField();
    
    jtfPPRW1.setText("Medication specific education using Teach Back provided to patient and caregiver");
    jtfPPRW2.setText("Monitoring plan developed and communicated to patient and aftercare providers, where relevant (e.g. warfarin, digoxin and insulin)");
    jtfPPRW3.setText("Specific strategies for managing adverse drug events reviewed with patient/caregiver");
    jtfPPRW4.setText("Elimination of unnecessary medications");
    jtfPPRW5.setText("Simplification of medication scheduling to improve adherence");
    jtfPPRW6.setText("Follow-up phone call at 72 hours to assess adherence and complications");
    
    this.add(jtfPPRW1);
    this.add(jtfPPRW2);
    this.add(jtfPPRW3);
    this.add(jtfPPRW4);
    this.add(jtfPPRW5);
    this.add(jtfPPRW6);
    
    this.pack();
    this.setLocationRelativeTo(this.getParent());
 //   pprw.setVisible(true);
    
}
}
