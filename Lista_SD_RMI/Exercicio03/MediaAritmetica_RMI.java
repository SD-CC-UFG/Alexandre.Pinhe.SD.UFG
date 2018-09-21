/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio03;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexa
 */
public class MediaAritmetica_RMI extends UnicastRemoteObject implements MediaAritmetica_Interface{

    public MediaAritmetica_RMI() throws RemoteException 
    {
        
    }
    @Override
    public String mediaAritmetica(double n1, double n2) throws RemoteException {
       double media, n3, m_media_n3;
       media = (n1+n2)/2;
       
       if(media >= 7.0){
           String resultado = String.format("%.2f", media);
           return "Aluno não precisa fazer N3 pois já está aprovado \n"
                   + "média do aluno: " + resultado;
       }
       if(media >3.0 && media < 7.0){
           n3 = Double.parseDouble(JOptionPane.showInputDialog("sua média foi: " + media + ", \n"
                   + " é preciso informa a Nota N3:"));
           m_media_n3 = (media+n3)/2;
           if(m_media_n3 >= 5.0){
                String resultado = String.format("%.2f", m_media_n3);
               return "Aluno está aprovado!! \n"
                       + "sua média: " + resultado;
            }
           else{
               String resultado = String.format("%.2f", m_media_n3);
               return "Aluno está reprovado! \n"
                       + "sua média: " + resultado;
           }
       }
       
        String resultado = String.format("%.2f", media);
       return "Aluno reprovado!!! \n média: "+resultado;       
    }
    
}
