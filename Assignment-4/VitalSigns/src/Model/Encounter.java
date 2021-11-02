/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author prasannanimbalkar
 */
public class Encounter {
   
   private Vitals vitalSigns;
   private Patient vitalPatientInformation;
   
   
//    public Encounter(Vitals vitalSigns) {
//        this.vitalSigns = vitalSigns;
//    }

    public Patient getVitalPatientInformation() {
        return vitalPatientInformation;
    }

    public void setVitalPatientInformation(Patient vitalPatientInformation) {
        this.vitalPatientInformation = vitalPatientInformation;
    }

    public Vitals getVitals() {
        return vitalSigns;
    }

    public void setVitals(Vitals vitalSigns) {
        this.vitalSigns = vitalSigns;
    }
    
    @Override
    public String toString() {
        return vitalPatientInformation.getName();
    }
   
    
   
}