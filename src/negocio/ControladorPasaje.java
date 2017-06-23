/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entidades.Users;
/**
 *
 * @author Julio
 */
public class ControladorPasaje {
    
    Users usuarios[] = new Users[3];
    
   public ControladorPasaje(){
    usuarios[0] = new Users("admin", "admin", true);
    usuarios[1] = new Users("julio1", "123", false);
    usuarios[2] = new Users("julio2", "123", false);
}
    public boolean logIn(String usu, String pass){
        for (Users us : usuarios){
             if (us.getIdUser() == usu && us.getPass()== pass){
                return true;
            }
        }
        return false;
    }
}
