/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio05;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;

/**
 *
 */
public class Cliente_NadadorIdade {

    /**
     * @param args the command line arguments
     * @throws java.rmi.NotBoundException
     * @throws java.net.MalformedURLException
     * @throws java.rmi.RemoteException
     */
    public static void main(String[] args) throws NotBoundException,MalformedURLException,RemoteException {
        try {
            int menu; 
            NadadorIdade_Interface ni = (NadadorIdade_Interface)Naming.lookup("rmi://localhost:1099/NadadorIdade");
            JOptionPane.showMessageDialog(null, "Cliente conectado com servidor");
          
            do{
               menu = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do nadador ou 2 para sair: "));
               
               if(menu >= 5 && menu <= 7)
                    JOptionPane.showMessageDialog(null,"A categoria do nadador é: " + ni.categoria(menu));
               if(menu >= 8 && menu <= 10)
                    JOptionPane.showMessageDialog(null,"A categoria do nadador é: " + ni.categoria(menu));
               if(menu >= 11 && menu <= 13)
                    JOptionPane.showMessageDialog(null,"A categoria do nadador é: " + ni.categoria(menu));
               if(menu >= 14 && menu <= 17)
                    JOptionPane.showMessageDialog(null,"A categoria do nadador é: " + ni.categoria(menu));
               else if (menu >= 18)
                 JOptionPane.showMessageDialog(null,"A categoria do nadador é: " + ni.categoria(menu));
               
            } while(menu != 2);
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Servidor não Conectado.","Falha", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
