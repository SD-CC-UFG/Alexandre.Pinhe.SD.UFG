package servidor;

import cliente.UrnaInterface;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SistemaInterface extends Remote{
    
    public void addUrna(UrnaInterface urna) throws RemoteException;
    
    public void removeUrna(UrnaInterface urna) throws RemoteException;
    
    public void getCandidato() throws RemoteException;
    
    public void getVoto() throws RemoteException;        
}
