/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author prasannanimbalkar
 */
public class AbnormalHistory{
    
    private ArrayList<Abnormal> abnormalHistoryList;

    public AbnormalHistory() {
        abnormalHistoryList= new ArrayList<Encounter>();
        
    }

    public ArrayList<Abnormal> getAbnormalHistoryList() {
        return abnormalHistoryList;
    }

    public void setAbnormalHistoryList(ArrayList<Abnormal> AbnormalHistoryList) {
        this.abnormalHistoryList = AbnormalHistoryList;
    }
    
    
}
