/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementsystem;

import java.util.ArrayList;

/**
 *
 * @author jacq
 */

public class Patient {
    
    private int pidNumber;
    private int pidInitiator = 100;
    private int ppsNumber;
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String email;    
    private String city;
    //private ArrayList<Patient> patientList;
    
    
    public Patient(){
        
    }
    /**
     * 
     * @param pidNumber
     * @param ppsNumber
     * @param firstName
     * @param lastName
     * @param mobileNumber
     * @param email
     * @param city 
     */
    public Patient(int pidNumber, int ppsNumber, String firstName, String lastName, String mobileNumber, String email, String city){
        
        this.pidNumber = pidInitiator++;
        this.ppsNumber = ppsNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.city = city;
        //this.patientList = new ArrayList<>();
    }
    /**
     * 
     * @return 
     */
    public int getPidNumber() {
        return pidNumber;
    }
    
    /**
     * 
     * @param pidNumber 
     */
    public void setPidNumber(int pidNumber) {
        this.pidNumber = pidNumber;
    }

    /**
     * 
     * @return 
     */
    public int getPidInitiator() {
        return pidInitiator;
    }

    /**
     * 
     * @param pidInitiator 
     */
    public void setPidInitiator(int pidInitiator) {
        this.pidInitiator = pidInitiator;
    }

    /**
     * 
     * @return 
     */
    public int getPpsNumber() {
        return ppsNumber;
    }

    /**
     * 
     * @param ppsNumber 
     */
    public void setPpsNumber(int ppsNumber) {
        this.ppsNumber = ppsNumber;
    }

    /**
     * 
     * @return 
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * 
     * @param firstName 
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 
     * @return 
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * 
     * @param lastName 
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 
     * @return 
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * 
     * @param mobileNumber 
     */
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    /**
     * 
     * @return 
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 
     * @return 
     */
    public String getCity() {
        return city;
    }

    /**
     * 
     * @param city 
     */
    public void setCity(String city) {
        this.city = city;
    }  
    
    /**
     * 
     * @return 
     
    public ArrayList<Patient> getPatientList() {
        return patientList;
    }*/

    /**
     * 
     * @param patientList 
     
    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }*/


    /**
     * 
     * @return 
     */

    @Override
    public String toString() {
        return "================================================================" +
                "\nPatient Information: " + 
                "\nPID number: " + pidNumber + 
                "\nFirst Name: "  + firstName + 
                "\nLast Name: " + lastName + 
                "\nMobile Number: " + mobileNumber + 
                "\nEmail: " + email + 
                "\nCity: " + city + 
                "\nPPS number: " + ppsNumber;
    }
    
    
}

