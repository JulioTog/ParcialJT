/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Julio
 */
public class Users {
    private String idUser;
    private String pass;
    private boolean isAdmin;
    
    public Users (String idUser, String pass, boolean isAdmin){
        this.idUser = idUser;
        this.pass = pass;
        this.isAdmin = isAdmin;
    }
    public String getIdUser (){
        return idUser;
    }
    public String getPass (){
        return pass;
    }
}
