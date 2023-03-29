/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBase;

import System.Patient;
import java.util.ArrayList;

/**
 *
 * @author Zaniar
 */
public class PatientDirectory {
    ArrayList<Patient> allPatients;
    
    
    public PatientDirectory(){
            this.allPatients = new ArrayList<>();
            initialState();
    }

    public ArrayList<Patient> getAllusers() {
        return allPatients;
    }

    public void setAllusers(ArrayList<Patient> allusers) {
        this.allPatients = allusers;
    }
    public void addUser(Patient newUser){
        this.allPatients.add(newUser);
    }
    public void removeUser(Patient user){
        this.allPatients.remove(user);
    }
    public final void initialState(){
    Patient firstUser = new Patient();
    firstUser.setPass("p1");
    firstUser.setUser("p1");
    firstUser.setRole("Patient");
    this.allPatients.add(firstUser);
    }
    
}
