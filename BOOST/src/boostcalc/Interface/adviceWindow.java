/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boostcalc.Interface;

import boostcalc.the8Ps.PallativeCare;
import boostcalc.the8Ps.PatientSupport;
import boostcalc.the8Ps.PhysicalLimitations;
import boostcalc.the8Ps.Polypharmacy;
import boostcalc.the8Ps.PoorhealthLiteracy;
import boostcalc.the8Ps.PrincipalDiagnosis;
import boostcalc.the8Ps.PriorHospitalization;
import boostcalc.the8Ps.PsychologicalFactors;
import boostcalc.Interface.BOOSTgui;
import java.awt.GridLayout;
import javax.swing.JFrame;

/**
 *
 * @author joev
 */
public class adviceWindow extends JFrame{
    
    
   public adviceWindow(String title, int numAdvicePanels)
   {
   super(title);
   this.setLayout(new GridLayout(numAdvicePanels,1));
   
   this.pack();

   
   }
    
    
    
}