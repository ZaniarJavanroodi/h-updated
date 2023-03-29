/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System;

/**
 *
 * @author Zaniar
 */
public class Doctor extends Persons {
    private String Degree;
    private String MedicalNumber;
    private String Hospital;

    public String getDegree() {
        return Degree;
    }

    public void setDegree(String Degree) {
        this.Degree = Degree;
    }

    public String getMedicalNumber() {
        return MedicalNumber;
    }

    public void setMedicalNumber(String MedicalNumber) {
        this.MedicalNumber = MedicalNumber;
    }

    public String getHospital() {
        return Hospital;
    }

    public void setHospital(String Hospital) {
        this.Hospital = Hospital;
    }
}
