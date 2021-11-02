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
public class EncounterHistory{
    
    
   
    
    private ArrayList<Encounter> encounterHistoryList;

    public EncounterHistory() {
        encounterHistoryList= new ArrayList<Encounter>();
        
    }
    
    public Encounter addEncounter(){
     Encounter e = new Encounter();
     encounterHistoryList.add(e);
     return e;
    }
    
    public void deleteEncounter(Encounter cd){
        encounterHistoryList.remove(cd);
    }
    
    public Encounter updateEncounter(int index){
        Encounter modifyCar = new Encounter();
        encounterHistoryList.set(index, modifyCar);
        return modifyCar;
    }

    public ArrayList<Encounter> getEncounterHistoryList() {
        return this.encounterHistoryList;
    }

    public void setEncounterHistoryList(ArrayList<Encounter> encounterHistoryList) {
        this.encounterHistoryList = encounterHistoryList;
    }
    
    
}
