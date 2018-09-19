/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio05;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author alexandrepinheiro
 */
public interface NadadorIdade_Interface extends Remote {
    
    public String categoria (int idade) throws RemoteException;
    
}
