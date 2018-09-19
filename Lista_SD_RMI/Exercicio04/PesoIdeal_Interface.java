/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio04;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Alexa
 */
public interface PesoIdeal_Interface extends Remote {
    public String pesoIdeal(double altura, String sexo)throws RemoteException;
}
