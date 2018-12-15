package util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.rmi.RemoteException;
import java.util.ArrayList;

public class Armazenamento {
    
    public void salvarDadosCandidato(ArrayList dados) throws RemoteException {
        try {
            FileOutputStream file = new FileOutputStream("candidato.txt");
            try (ObjectOutputStream object = new ObjectOutputStream(file)) {
                object.writeObject(dados);
            }
        } catch(IOException e) {
            System.err.println(e);
        }
    }
        
    public void salvarDadosEleitor(ArrayList dados) throws RemoteException {
        try {
            FileOutputStream file = new FileOutputStream("eleitor.txt");
            try (ObjectOutputStream object = new ObjectOutputStream(file)) {
                object.writeObject(dados);
            }
        } catch(IOException e) {
            System.err.println(e);
        }
    }
    
    public Object lerDadosCandidato() throws RemoteException {
        Object resultado = null;
        try {
            FileInputStream file = new FileInputStream("candidato.txt");
            ObjectInputStream object = new ObjectInputStream(file);
            resultado = object.readObject();
        } catch (IOException | ClassNotFoundException e) {
        }
        return resultado;
    }
}
