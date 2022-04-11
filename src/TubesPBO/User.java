/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TubesPBO;

import java.util.Date;

/**
 *
 * @author Sabre
 */
public class User extends Base{
    private int id_user;
    private int profil_user;
    private int role;
    private String username;
    private String email;
    private String password;

    public User(int id_user, int profil_user, int role, String username, String email, String password) {
        this.id_user = id_user;
        this.profil_user = profil_user;
        this.role = role;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getProfil_user() {
        return profil_user;
    }

    public void setProfil_user(int profil_user) {
        this.profil_user = profil_user;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    void addData() {

    }

    @Override
    void updateData() {

    }

    @Override
    void deleteData() {

    }
    
}
