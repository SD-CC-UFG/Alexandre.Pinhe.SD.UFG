/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio03;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexa
 */
public class MediaAritmetica_Client {

    /**
     * @param args the command line arguments
     * @throws java.rmi.NotBoundException
     * @throws java.net.MalformedURLException
     * @throws java.rmi.RemoteException
     */
    public static void main(String[] args) throws NotBoundException,MalformedURLException,RemoteException {
        try{
            int menu;
            double n1, n2;
            MediaAritmetica_Interface ma = (MediaAritmetica_Interface) Naming.lookup("rmi://localhost:1099/mediaAritmetica");
            JOptionPane.showMessageDialog(null, "Cliente está conectado com servidor");
            do{
                n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota N1:"));
                n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota N2:"));
                
                JOptionPane.showMessageDialog(null, ma.mediaAritmetica(n1, n2));
                
                menu = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar \n"
                       + "1 = Sim \n"
                       + "2 = Não"));
            }while (menu != 2);
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Servidor não Conectado.","Falha", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
