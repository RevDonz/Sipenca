/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TubesPBO;

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
