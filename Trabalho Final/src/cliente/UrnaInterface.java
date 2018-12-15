package cliente;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface UrnaInterface extends Remote{
    
    public void cadastrarCandidato() throws RemoteException;
    
    public String getCandidato() throws RemoteException;
    
    public void exibirCandidatos(List<UrnaInterface> candidatos) throws RemoteException;
    
    public void cadastrarEleitor(Eleitor eleitor) throws RemoteException;
    
    public String getTitulo() throws RemoteException; 
    
    public void votarCandidato(String voto) throws RemoteException;
    
    public String getVoto() throws RemoteException;
    
    public void exibirVotos(List<UrnaInterface> votos) throws RemoteException;
}