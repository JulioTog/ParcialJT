/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escritorio;

import java.applet.Applet;
import java.awt.*;
/**
 *
 * @author Julio
 */
public class NewApplet extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    TextField name,pass;
    Button b1,b2;
    public void init() {
        Label n=new Label("Name:",Label.CENTER);
        Label p=new Label("password:",Label.CENTER);
        name=new TextField(20);
        pass=new TextField(20);
        pass.setEchoChar('$');
        b1=new Button("submit");
        b2=new Button("cancel");
        add(n);
        add(name);
        add(p);
        add(pass);
        add(b1);
        add(b2);
        n.setBounds(70,90,90,60);
        p.setBounds(70,130,90,60);
        name.setBounds(280,100,90,20);
        pass.setBounds(200,140,90,20);
        b1.setBounds(100,260,70,40);
        b2.setBounds(180,260,70,40);
    }

     public void paint(Graphics g)
    {
        repaint();
    }
}
