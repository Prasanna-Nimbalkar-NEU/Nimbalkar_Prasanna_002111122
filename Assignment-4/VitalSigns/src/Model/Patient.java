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
public class Patient extends Person {
    
        
        public Vitals vitalPatientInformation;

        public Patient(String name, int age, String house, String community, String city) {
            super(name, age, house, community, city);
        }

        public Vitals getVitals() {
            return vitalPatientInformation;
        }

        public void setVitals(Vitals vitalSigns) {
            this.vitalPatientInformation = vitalSigns;
        }
 
    
}
