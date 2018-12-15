/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Alexa
 */
public class Server_Multiplo {
    public static void main (String args[]) throws RemoteException {
        LocateRegistry.createRegistry(1099);
        Registry registry = LocateRegistry.getRegistry();
        int port =2000;
        SistemaInterface sistema = new Sistema();
        
        try {
            registry.bind("urna", sistema);
        }catch (AlreadyBoundException ae) {
            registry.rebind("urna", sistema);
        }
        System.out.println("Servidor ativo!\n");
        
       
       String serverConnection = "Conectando aos  outros Servers. Aguardando...";
       for (int i = 0; i<3 ; i++) {
         try {
              registry = LocateRegistry.createRegistry(port);
              try {
                 registry.bind("urna", sistema);
              }catch (AlreadyBoundException ae) {
                 registry.rebind("urna", sistema);
              }
              serverConnection = serverConnection + "\nAtivação do server sucedida para porta: " + port; 
        }catch (RemoteException ex) {
              serverConnection = serverConnection + "\nFalha ao ativar a porta: " + port;
        }
    port += 1;
        }
         System.out.println(serverConnection);
    }
}
