/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university.management.system;

/**
 *
 * @author balij
 */
import javax.swing.*;
import java.awt.*;
public class Splash extends JFrame implements Runnable{
    Thread t;
    Splash(){
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/img1.jpg"));
    Image i2 = i1.getImage().getScaledInstance(700,400,Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image=new JLabel(i3);
    add(image);
    
    t= new Thread(this);
    t.start();
    setVisible(true);
    setLocation(300,200);
    for(int i=1;i<=500;i++){
        setSize(2*i,i);
        try{
            Thread.sleep(1);
        
        }catch(Exception e){}
        
    }
    }
    public void run(){
        try{
        Thread.sleep(3000);
        setVisible(false);
        new Login();
        }catch(Exception e){}
    }

    public static void main(String[] args){
        new Splash();
    
    }
}