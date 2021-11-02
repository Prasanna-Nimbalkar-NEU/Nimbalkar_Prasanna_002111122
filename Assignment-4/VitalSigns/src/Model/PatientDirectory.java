/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author prasannanimbalkar
 */
public class PatientDirectory extends VitalsHistory{
    
    
    
    public List<Patient> patientDirectorylist;
    
    public PatientDirectory(){
    patientDirectorylist= new ArrayList<>();
    }
    
    public List<Patient> getList(){
        return this.patientDirectorylist;
    }
    
    public void add(Patient p){
    this.patientDirectorylist.add(p);
    }

//    public Patient addPatient() {
//        Patient newPatient = new Patient();
//        patientDirectorylist.add(newPatient);
//        return newPatient; 
//    }
    
    
    
    
}
