/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBase;

import System.Admin;
import java.util.ArrayList;

/**
 *
 * @author Zaniar
 */
public class AdminDirectory {
    ArrayList<Admin> allAdmins;
    
    public AdminDirectory(){
            this.allAdmins = new ArrayList<>();
            initialState();
    }

    public ArrayList<Admin> getAllusers() {
        return allAdmins;
    }

    public void setAllusers(ArrayList<Admin> allusers) {
        this.allAdmins = allusers;
    }
    public void addUser(Admin newUser){
        this.allAdmins.add(newUser);
    }
    public void removeUser(Admin user){
        this.allAdmins.remove(user);
    }
    public final void initialState(){
    Admin firstUser = new Admin();
    firstUser.setPass("admin");
    firstUser.setUser("admin");
    firstUser.setRole("Admin");
    this.allAdmins.add(firstUser);
    }

    
}
