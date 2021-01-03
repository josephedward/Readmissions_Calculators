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
public class PatientSupport extends JFrame{
         public PatientSupport()
    {
       
    this.setTitle("Risk Specific Intervention- Patient Support");
    this.setLayout(new GridLayout(4,1));
    //1 for each of the intervention reccomendations until we learn newline trick
    JTextField jtfPSRW1=new JTextField();
    JTextField jtfPSRW2=new JTextField();
    JTextField jtfPSRW3=new JTextField();
    JTextField jtfPSRW4=new JTextField();
    
    jtfPSRW1.setText("Follow-up phone call at 72 hours to assess condition, adherence and complications");
    jtfPSRW2.setText("Follow-up appointment with appropriate medical provider within 7 days after hospitalization");
    jtfPSRW3.setText("Involvement of home care providers of services with clear communications of discharge plan to those providers");
    jtfPSRW4.setText("Engage a transition coach");
    
    this.add(jtfPSRW1);
    this.add(jtfPSRW2);
    this.add(jtfPSRW3);
    this.add(jtfPSRW4);
    
    this.pack();
    this.setLocationRelativeTo(this.getParent());
 //   psrw.setVisible(true);
    
   
}
}