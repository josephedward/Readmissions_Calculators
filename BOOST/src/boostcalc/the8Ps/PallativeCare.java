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
public class PallativeCare extends JFrame{
        
    public PallativeCare()
    {
    
    this.setTitle("Risk Specific Intervention- Pallative Care");
    
    this.setLayout(new GridLayout(6,1));
    //1 for each of the intervention reccomendations until we learn newline trick
    JTextField jtfPCRW1=new JTextField();
    JTextField jtfPCRW2=new JTextField();
    JTextField jtfPCRW3=new JTextField();
    JTextField jtfPCRW4=new JTextField();
    JTextField jtfPCRW5=new JTextField();
    JTextField jtfPCRW6=new JTextField();
    
    jtfPCRW1.setText("Assess need for palliative care services");
    jtfPCRW2.setText("Identify goals of care and therapeutic options");
    jtfPCRW3.setText("Communicate prognosis with patient/family/caregiver");
    jtfPCRW4.setText("Assess and address concerning symptoms");
    jtfPCRW5.setText("Identify services or benefits available to patients based on advanced disease status");
    jtfPCRW6.setText("Discuss with patient/caregiver role of palliative care services and the benefits and services available to the patient");
    
    this.add(jtfPCRW1);
    this.add(jtfPCRW2);
    this.add(jtfPCRW3);
    this.add(jtfPCRW4);
    this.add(jtfPCRW5);
    this.add(jtfPCRW6);
    
    this.pack();
    this.setLocationRelativeTo(this.getParent());
//    pcrw.setVisible(true);
    
    
}
}