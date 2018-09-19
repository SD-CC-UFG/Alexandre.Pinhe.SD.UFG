/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio04;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexa
 */
public class Client_PesoIdeal {

    /**
     * @param args the command line arguments
     * @throws java.rmi.NotBoundException
     * @throws java.net.MalformedURLException
     * @throws java.rmi.RemoteException
     */
    public static void main(String[] args) throws NotBoundException,MalformedURLException,RemoteException {
         try{
             int menu;
             double altura;
             String sexo;
             PesoIdeal_Interface pi = (PesoIdeal_Interface) Naming.lookup("rmi://localhost:1099/pesoIdeal");
             JOptionPane.showMessageDialog(null, "Cliente está conectado com servidor");
             do{
                 altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura:"));
                 sexo = JOptionPane.showInputDialog("Digite o sexo:");
                 
                 if("masculino".equals(sexo))
                     JOptionPane.showMessageDialog(null, pi.pesoIdeal(altura, sexo));
                 if("feminino".equals(sexo))
                     JOptionPane.showMessageDialog(null, pi.pesoIdeal(altura, sexo));
                 else
                     JOptionPane.showMessageDialog(null, pi.pesoIdeal(altura, sexo));
                 
                 menu = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar \n"
                       + "1 = Sim \n"
                       + "2 = Não")); 
             }while(menu != 2);
             
         }catch (Exception e){
             JOptionPane.showMessageDialog(null,"Servidor não Conectado.","Falha", JOptionPane.ERROR_MESSAGE);
         }
    }
    
}
