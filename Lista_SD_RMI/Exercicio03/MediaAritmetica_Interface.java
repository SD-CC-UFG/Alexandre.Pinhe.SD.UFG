/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio03;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Alexa
 */
public interface MediaAritmetica_Interface extends Remote{
    public String mediaAritmetica(double n1, double n2) throws RemoteException;
}
