/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBase;

import System.Doctor;
import java.util.ArrayList;

/**
 *
 * @author Zaniar
 */
public class DoctorDirectory {
    ArrayList<Doctor> allDoctors;
    
    public DoctorDirectory(){
            this.allDoctors = new ArrayList<>();
    }

    public ArrayList<Doctor> getAllusers() {
        return allDoctors;
    }

    public void setAllusers(ArrayList<Doctor> allusers) {
        this.allDoctors = allusers;
    }
    public void addUser(Doctor newUser){
        this.allDoctors.add(newUser);
    }
    public void removeUser(Doctor user){
        this.allDoctors.remove(user);
    }
    
}
