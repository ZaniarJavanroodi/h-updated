/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBase;

import System.Hospital;
import java.util.ArrayList;

/**
 *
 * @author Zaniar
 */
public class HospitalDirectory {
    
    ArrayList<Hospital> allHospitals;
    public HospitalDirectory(DoctorDirectory doctordirectory) {
        Hospital newhospital= new Hospital(doctordirectory);
        
        
        
    }
    public ArrayList<Hospital> getAllusers() {
        return allHospitals;
    }

    public void setAllusers(ArrayList<Hospital> allusers) {
        this.allHospitals = allusers;
    }
    public void addUser(Hospital newUser){
        this.allHospitals.add(newUser);
    }
    public void removeUser(Hospital user){
        this.allHospitals.remove(user);
    }
    
}
