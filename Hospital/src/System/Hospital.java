/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package System;

import DataBase.DoctorDirectory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Zaniar
 */
public class Hospital {

    String name;
    String Adress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    public ArrayList<Doctor> getDocList() {
        return docList;
    }

    public void setDocList(ArrayList<Doctor> docList) {
        this.docList = docList;
    }
    ArrayList<Doctor> docList;
    DoctorDirectory doctordirectory;

    public Hospital(DoctorDirectory doctordirectory) {
        this.docList = new ArrayList();
        this.doctordirectory = doctordirectory;
        for (Doctor d: doctordirectory.getAllusers()){
            if (d.getHospital().equals(name)){
              docList.add(d);
        
        }
        
    }
        
         

    }
    @Override
    public String toString() {
        return name;
    }
}

    
    

