/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBase;

import System.Admin;
import System.Doctor;
import System.Patient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Zaniar
 */



public class LoginDirectory{
    AdminDirectory Ausers;
    PatientDirectory Pusers;
    DoctorDirectory Dusers;
    HashMap<String, List<String>> userPass = new HashMap<>();
    
    public LoginDirectory(AdminDirectory Ausers,DoctorDirectory Dusers,PatientDirectory Pusers){
        this.Ausers = Ausers;
        this.Pusers = Pusers;
        this.Dusers = Dusers;
        userPass = getDirectoryData();
        
    }
   
    

    public HashMap<String, List<String>> getUserPass() {
        return userPass;
    }

    public void setUserPass(HashMap<String, List<String>> userPass) {
        this.userPass = userPass;
    }
    
    
    public HashMap<String, List<String>> getDirectoryData() {
        HashMap<String, List<String>> directoryData = new HashMap<>();
        if(Dusers.getAllusers() != null){
        for (Doctor obj: Dusers.getAllusers()){
            ArrayList<String> temp = new ArrayList();
            temp.add(obj.getPass());
            temp.add(obj.getRole());
            String user = null;
            user = obj.getUser();
            directoryData.put(user, temp);
        }
        }
        if(Pusers.getAllusers() != null){
        for (Patient obj: Pusers.getAllusers()){
            ArrayList<String> temp = new ArrayList();
            temp.add(obj.getPass());
            temp.add(obj.getRole());
            String user = null;
            user = obj.getUser();
            directoryData.put(user, temp);
        }}
        if(Ausers.getAllusers() != null){
        for (Admin obj: Ausers.getAllusers()){
            ArrayList<String> temp = new ArrayList();
            temp.add(obj.getPass());
            temp.add(obj.getRole());
            String user = null;
            user = obj.getUser();
            directoryData.put(user, temp);
        }}
        
        
        
        
        return directoryData;
    }
}
    

