 package servidor;

import cliente.UrnaInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class Sistema extends UnicastRemoteObject implements SistemaInterface{

    private final List<UrnaInterface> urnas = new ArrayList<>();
    private UrnaInterface urna;
    private int urnaNumero;
    
    public Sistema() throws RemoteException {
        super();
    }

    @Override
    public void addUrna(UrnaInterface urna) throws RemoteException {
        urnas.add(urna);
    }

    @Override
    public void removeUrna(UrnaInterface urna) throws RemoteException {
        urnas.remove(urna);                
    }

    @Override
    public void getCandidato() throws RemoteException {
        for (UrnaInterface urna : urnas) {
            try {
                urna.exibirCandidatos(urnas);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void getVoto() throws RemoteException {
        for (UrnaInterface urna : urnas) {
            try {
                urna.exibirVotos(urnas);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    
}
