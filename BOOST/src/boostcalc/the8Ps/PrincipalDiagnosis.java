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
public class PrincipalDiagnosis extends JFrame{
       public PrincipalDiagnosis()
    {
    this.setTitle("Risk Specific Intervention- Principal Diagnosis");
    this.setLayout(new GridLayout(4,1));
    //1 for each of the intervention reccomendations until we learn newline trick
    JTextField jtfPDRW1=new JTextField();
    JTextField jtfPDRW2=new JTextField();
    JTextField jtfPDRW3=new JTextField();
    JTextField jtfPDRW4=new JTextField();
    
    jtfPDRW1.setText("Review of national discharge guidelines, where available");
    jtfPDRW2.setText("Disease specific education using Teach Back with patient/caregiver");
    jtfPDRW3.setText("Action plan reviewed with patient/caregivers regarding what to do and who to contact in the event of worsening or new symptoms");
    jtfPDRW4.setText("Discuss goals of care and chronic illness model discussed with patient/caregiver");
    
    this.add(jtfPDRW1);
    this.add(jtfPDRW2);
    this.add(jtfPDRW3);
    this.add(jtfPDRW4);
    
    this.pack();
    this.setLocationRelativeTo(this.getParent());
  //  pdrw.setVisible(true);
    
}
}