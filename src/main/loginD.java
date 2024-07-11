/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;


/**
 *
 * @author default
 */
public class loginD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
       
        login loginFrame = new login();
         loginFrame.setVisible(true);
         loginFrame.pack();
         loginFrame.setLocationRelativeTo(null);
      
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new login().setVisible(true);
//            }
//        });
    }

}
