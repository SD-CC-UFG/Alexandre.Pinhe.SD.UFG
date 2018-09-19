/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio05;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author alexandrepinheiro
 */
public class NadadorIdadeRMI extends UnicastRemoteObject implements NadadorIdade_Interface{
     public NadadorIdadeRMI() throws RemoteException 
    {
        int idade;
    }
    @Override
    public String categoria(int idade) throws RemoteException {
        if(idade >= 5 && idade <= 7){
           return "infantil A";       
        }
        if(idade >= 8 && idade <= 10){
           return "infantil B";       
        }
        if(idade >= 11 && idade <= 13){
           return "juvenil A";       
        }
        if(idade >= 14 && idade <= 17){
           return "juvenil B";       
        }
        else
            return "adulto";
    }
    
}
