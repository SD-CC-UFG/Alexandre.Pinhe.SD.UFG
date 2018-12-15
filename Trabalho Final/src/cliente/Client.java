package cliente;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import servidor.SistemaInterface;
import java.awt.HeadlessException;
import java.util.Scanner;

public class Client{  
    public static void main(String[] args) throws NotBoundException,MalformedURLException,RemoteException {
        
        try {
            SistemaInterface sistema  = (SistemaInterface) Naming.lookup("urna");           
            Urna urna = new Urna();
            sistema.addUrna(urna);         
            urna.cadastrarCandidato();
            Scanner scan = new Scanner(System.in);
            
            int opcao;
            do {    
                System.out.println("\n 1 - Visualizar Candidatos(as)\n "
                        + "2 - Votar\n "
                        + "3 - Apuração da Urna\n "
                        + "4 - Sair");
                
                opcao = Integer.parseInt(scan.nextLine());
                switch(opcao) {
                    
                    case 1:
                        sistema.getCandidato();
                        break;
                    case 2:
                        String voto;
                        System.out.println("Digite o número do seu candidato:");
                        voto = scan.nextLine();
                        urna.votarCandidato(voto);
                        break;
                    case 3:
                        sistema.getVoto();
                        break;
                    default:
                        System.exit(0);
                        break;
                }
            } while (true);
              
        } catch (HeadlessException | MalformedURLException | NotBoundException | RemoteException e) {
            System.err.print("Serviço está indisponível:");
        }
    }
}
