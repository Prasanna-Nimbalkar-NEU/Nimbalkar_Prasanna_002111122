/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author prasannanimbalkar
 */
public class Vitals {
    
    private int respiratoryRate;
    public int pulse;
    private int bloodPressure;
    private int weightInKilos;
    private int temperature;
    private Date date;

    public Vitals(int respiratoryRate, int pulse, int bloodPressure, int weightInKilos, int temperature) {
        this.respiratoryRate = respiratoryRate;
        this.pulse = pulse;
        this.bloodPressure = bloodPressure;
        this.weightInKilos = weightInKilos;
        this.temperature = temperature;
    }

    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getWeightInKilos() {
        return weightInKilos;
    }

    public void setWeightInKilos(int weightInKilos) {
        this.weightInKilos = weightInKilos;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    
    public String getDate() {
//        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");   
//        return formatter.format(this.date).toString();
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern ( "yyyy/MM/dd HH:mm:ss") ;
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now).toString();
    }



    
}
