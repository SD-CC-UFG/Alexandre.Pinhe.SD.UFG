/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Alexa
 */
public class MaioridadeRMI extends UnicastRemoteObject implements Maioridade_Interface {

    public MaioridadeRMI() throws RemoteException 
    {
        int idade;
        String nome, sexo;
    }
    @Override
    public String MaiorIdade(int idade, String nome, String sexo) throws RemoteException {
        if(idade >=18 && "masculino".equals(sexo)){
            return "Nome: " + nome + "\n" + 
                    "Sexo: " + sexo + "\n" + 
                    "Idade: " + idade + "\n" + 
                    "Atingiu a maioridade"; 
        }
        if(idade >= 21 && "feminino".equals(sexo)){
            return "Nome: " + nome + "\n" + 
                    "Sexo: " + sexo + "\n" + 
                    "Idade: " + idade + "\n" + 
                    "Atingiu a maioridade"; 
        }
        else
            return "Nome: " + nome + "\n" + 
                    "Sexo: " + sexo + "\n" + 
                    "Idade: " + idade + "\n" + 
                    "não atingiu a maioridade"; 
    }
    
}