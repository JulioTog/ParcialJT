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
import java.util.*;

/**
 *
 * @author Julio
 */
public class NewJApplet extends JApplet implements  ActionListener {
<<<<<<< HEAD

    
    private ControladorPasaje contP = new ControladorPasaje(); 
   
   JLabel usuario,pass;
   JTextField campoUsuario, campoPass;
   JButton botonLogin, botonCancel;
    
    
    public static void main(String[] args) {
        
        NewJApplet parcial =new NewJApplet();
        JFrame myFrame=new JFrame("pasajes");
        myFrame.add(parcial);
        myFrame.pack();
        myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); 
        myFrame.setSize( 1080, 800 ); 
        myFrame.setVisible(true);
        parcial.init();


    }
  
       
    public void init() {
=======
 
   private final ControladorPasaje contP = new ControladorPasaje(); 
   JLabel usuario,pass;
   JTextField campoUsuario, campoPass;
   JButton botonLogin, botonCancel;
   
    
       public void init() {
>>>>>>> origin/master
       Container contenedor = getContentPane();
       contenedor.setLayout(new FlowLayout());
       usuario = new JLabel("Usuario: ");
       contenedor.add(usuario);
       campoUsuario = new JTextField(20);
       contenedor.add(campoUsuario);
       pass = new JLabel("Password: ");
       contenedor.add(pass);
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
            JOptionPane.showMessageDialog(this,"login");//Succes
        }else{
            JOptionPane.showMessageDialog(this,"no");//error
        }
    }else{
<<<<<<< HEAD
            JOptionPane.showMessageDialog(this,"1111111111");//quit
=======
            //quit
>>>>>>> origin/master
            }
        
    }

} // TODO overwrite start(), stop() and destroy() methods

