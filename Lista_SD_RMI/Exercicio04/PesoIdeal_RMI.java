/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio04;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Alexa
 */
public class PesoIdeal_RMI extends UnicastRemoteObject implements PesoIdeal_Interface {
     public PesoIdeal_RMI() throws RemoteException 
    {
        
    }

    @Override
    public String pesoIdeal(double altura, String sexo) throws RemoteException {
       double calculo;
        if("masculino".equals(sexo)){
             calculo =  ((72.7 * altura) - 52); 
             String resultado = String.format("%.2f", calculo);
             return "Peso Ideal: " + resultado;
        }
        if("feminino".equals(sexo)){
              calculo =  ((62.1 * altura) - 44.7); 
              String resultado = String.format("%.2f", calculo);
             return "Peso Ideal: " + resultado;       
        }
        else
            return "Dados informados incorretos";
    }
}
