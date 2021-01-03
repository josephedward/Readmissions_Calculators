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
public class PriorHospitalization extends JFrame {
    public PriorHospitalization()
    {
    this.setTitle("Risk Specific Intervention- Prior Hospitalization");
    this.setLayout(new GridLayout(4,1));
    //1 for each of the intervention reccomendations until we learn newline trick
    JTextField jtfPHRW1=new JTextField();
    JTextField jtfPHRW2=new JTextField();
    JTextField jtfPHRW3=new JTextField();
    JTextField jtfPHRW4=new JTextField();
    
    jtfPHRW1.setText("Review reasons for re-hospitalization in context of prior hospitalization");
    jtfPHRW2.setText("Follow-up phone call at 72 hours to assess condition, adherence and complications");
    jtfPHRW3.setText("Follow-up appointment with medical provider within 7 days of hospital discharge");
    jtfPHRW4.setText("Engage a transition coach");
    
    this.add(jtfPHRW1);
    this.add(jtfPHRW2);
    this.add(jtfPHRW3);
    this.add(jtfPHRW4);
    
    this.pack();
    this.setLocationRelativeTo(this.getParent());
   // phrw.setVisible(true);
    
}
}
