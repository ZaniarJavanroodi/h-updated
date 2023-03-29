/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBase;

import System.Encounter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Zaniar
 */
public class EncounterHistory {
     ArrayList<Encounter> allEncounters;
    
    public EncounterHistory(){
            this.allEncounters = new ArrayList<>();
    }

    public ArrayList<Encounter> getAllenc() {
        return allEncounters;
    }

    public void setAllenc(ArrayList<Encounter> allenc) {
        this.allEncounters = allenc;
    }
    public void addenc(Encounter newenc){
        this.allEncounters.add(newenc);
    }
    public void removeenc(Encounter enc){
        this.allEncounters.remove(enc);
    }
}
