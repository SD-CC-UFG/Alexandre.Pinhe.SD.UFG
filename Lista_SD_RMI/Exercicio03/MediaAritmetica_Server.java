/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio03;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;

/**
 *
 * @author Alexa
 */
public class MediaAritmetica_Server {
    /**
     * @param args the command line arguments
     * @throws java.rmi.RemoteException
     * @throws java.rmi.NotBoundException
     */
    public static void main(String[] args) throws RemoteException,NotBoundException {
            
        Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
        r.rebind("mediaAritmetica", new MediaAritmetica_RMI());
        System.out.println("Servidor funcionando");
    }
}
