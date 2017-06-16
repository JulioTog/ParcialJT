/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escritorio;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import negocio.ControladorPasaje;

/**
 *
 * @author Julio
 */
public class NewJApplet extends JApplet implements  ActionListener {

   private ControladorPasaje contP = new ControladorPasaje(); 
   JLabel usuario,pass;
   JTextField campoUsuario, campoPass;
   JButton botonLogin, botonCancel;
    public void init() {
       Container contenedor = getContentPane();
       contenedor.setLayout(new FlowLayout());
       usuario = new JLabel("Usuario: ");
       contenedor.add(usuario);
       pass = new JLabel("Password: ");
       contenedor.add(pass);
       campoUsuario = new JTextField(20);
       contenedor.add(campoUsuario);
       campoPass = new JTextField(20);
       contenedor.add(campoPass);
       botonLogin = new JButton("Login");
       contenedor.add(botonLogin);
       botonCancel = new JButton("Cancel");
       contenedor.add(botonCancel);
       
       //Listeners
       botonLogin.addActionListener(this);
       botonCancel.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent actionEvent){
        if(actionEvent.getSource()== botonLogin){
        if(contP.logIn(campoUsuario.getText(), campoPass.getText())){
            JOptionPane.showMessageDialog(this,"aseaseaseaseas");//Succes
        }else{
            JOptionPane.showMessageDialog(this,"jajajajajaj");//error
        }
    }else{
            JOptionPane.showMessageDialog(this,"aseaseaseaseas");//quit
            }
        
    }

    // TODO overwrite start(), stop() and destroy() methods
}
