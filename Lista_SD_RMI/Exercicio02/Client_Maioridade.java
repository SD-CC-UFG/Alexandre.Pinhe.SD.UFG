/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexa
 */
public class Client_Maioridade {

    /**
     * @param args the command line arguments
     * @throws java.rmi.NotBoundException
     * @throws java.net.MalformedURLException
     * @throws java.rmi.RemoteException
     */
    public static void main(String[] args)throws NotBoundException,MalformedURLException,RemoteException{
       try{
           int menu;
           String nome,sexo;
           int idade;
           Maioridade_Interface m = (Maioridade_Interface) Naming.lookup("rmi://localhost:1099/maioridade");
           JOptionPane.showMessageDialog(null, "Cliente está conectado com servidor");
           
           do{
               nome = JOptionPane.showInputDialog("Digite o nome: ");
               sexo = JOptionPane.showInputDialog("Digite o Sexo:");
               idade= Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
               
               if(idade>=18 && "masculino".equals(sexo)){
                   JOptionPane.showMessageDialog(null, m.MaiorIdade(idade, nome, sexo));
               }
               if(idade>= 21 && "feminino".equals(sexo)){
                   JOptionPane.showMessageDialog(null, m.MaiorIdade(idade, nome, sexo));
               }
               else
                   JOptionPane.showMessageDialog(null, m.MaiorIdade(idade, nome, sexo));
               
               menu = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar \n"
                       + "1 = Sim \n"
                       + "2 = Não"));
               
           }while(menu != 2);
       }catch(Exception e){
           JOptionPane.showMessageDialog(null,"Servidor não Conectado.","Falha", JOptionPane.ERROR_MESSAGE);
       }
    }
    
}