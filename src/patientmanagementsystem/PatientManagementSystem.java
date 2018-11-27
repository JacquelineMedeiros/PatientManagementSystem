/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementsystem;

import static patientmanagementsystem.MainMenu.landingScreen;


/**
 *
 * @author jacqu
 */
public class PatientManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Patient p1 = new Patient(100, 23, "Jacqueline", "Medeiros", "000000", "jac@fas.com", "Dublin");
        Patient p2 = new Patient(100, 23, "Jacqueline", "Medeiros", "000000", "jac@fas.com", "Dublin");
        System.out.println(p1);
        System.out.println(p2);
        landingScreen();
        
    }
    
    
    
}
