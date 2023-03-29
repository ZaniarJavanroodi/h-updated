/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System;
import DataBase.EncounterHistory;
/**
 *
 * @author Zaniar
 */

public class Patient extends Persons {
    EncounterHistory History;

    public EncounterHistory getHistory() {
        return History;
    }

    public void setHistory(EncounterHistory History) {
        this.History = History;
    }
    
}


