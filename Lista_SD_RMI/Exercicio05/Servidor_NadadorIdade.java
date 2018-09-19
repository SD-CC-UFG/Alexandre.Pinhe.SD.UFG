/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio05;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

/**
 *
 * @author alexandrepinheiro
 */
public class Servidor_NadadorIdade {
    public static void main(String[] args) throws RemoteException,NotBoundException{
          Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
            r.rebind("NadadorIdade", new NadadorIdadeRMI());
            JOptionPane.showMessageDialog(null,"Servidor está funcioando !!");
    
    }
}
