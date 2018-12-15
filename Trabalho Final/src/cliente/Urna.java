package cliente;

import util.Armazenamento;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Urna extends UnicastRemoteObject implements UrnaInterface{
    
   // private final Armazenamento dados;
    private Eleitor eleitor;
    public Candidato c1, c2, c3, c4, c5;
    public int branco;
    private int nulo;
    
    public Urna() throws RemoteException {
        super();
        //dados = new Armazenamento();
    }

    @Override
    public void cadastrarCandidato() throws RemoteException {
        ArrayList candidatos = new ArrayList();
        c1 = new Candidato("12", "Ciro Gomes", 0);
        candidatos.add(c1);
        c2 = new Candidato("13", "Fernando Haddad", 0);
        candidatos.add(c2);
        c3 = new Candidato("17", "Jair Bolsonaro", 0);
        candidatos.add(c3);
        c4 = new Candidato("18", "Marina Silva", 0);
        candidatos.add(c4);
        c5 = new Candidato("45", "Geraldo Alckmin", 0);
        candidatos.add(c5);
        //dados.salvarDadosCandidato(candidatos);
    }

    @Override
    public String getCandidato() throws RemoteException {
        return   "Número: " + c1.getNumero() + "     |     Nome: " + c1.getNome() + "\n" 
               + "Número: " + c2.getNumero() + "     |     Nome: " + c2.getNome() + "\n"
               + "Número: " + c3.getNumero() + "     |     Nome: " + c3.getNome() + "\n" 
               + "Número: " + c4.getNumero() + "     |     Nome: " + c4.getNome() + "\n"
               + "Número: " + c5.getNumero() + "     |     Nome: " + c5.getNome();
    }
    
    @Override
    public void exibirCandidatos(List<UrnaInterface> candidatos) throws RemoteException {
        for (UrnaInterface candidato : candidatos) {
            System.out.println(candidato.getCandidato());
        }
    }

    @Override
    public void cadastrarEleitor(Eleitor eleitor) throws RemoteException {
        //ArrayList eleitores = new ArrayList();
      //  eleitor.getTitulo();
       // eleitores.add(eleitor);
       // dados.salvarDadosEleitor(eleitores);
    }
    
    @Override
    public String getTitulo() throws RemoteException {
        return eleitor.getTitulo();
    }

    @Override
    public void votarCandidato(String voto) throws RemoteException {
        Scanner ler = new Scanner(System.in);
        String opcao;
     
        switch(voto) {
            
            case "12":
                System.out.println("Você deseja votar no candidato(a) " + c1.getNome() + "? c (confirmar)");
                opcao = ler.nextLine();
                if(opcao.equals("c")) {
                    c1.setVoto( c1.getVoto() + 1);       
                    System.out.print("FIM\n");
                } else {
                    votarCandidato(voto);
                }
                break;
            case "13":
                System.out.println("Você deseja votar no candidato(a) " + c2.getNome() + "? c (confirmar)");
                opcao = ler.nextLine();
                if(opcao.equals("c")) {
                    c2.setVoto( c2.getVoto() + 1);
                    System.out.print("FIM\n");
                } else {
                    votarCandidato(voto);
                }
                break;
            case "17":
                System.out.println("Você deseja votar no candidato(a) " + c3.getNome() + "? c (confirmar)");
                opcao = ler.nextLine();
                if(opcao.equals("c")) {
                    c3.setVoto( c3.getVoto() + 1);
                    System.out.print("FIM\n");
                } else {
                    votarCandidato(voto);
                }
                break;
            case "18":
                System.out.println("Você deseja votar no candidato(a) " + c4.getNome() + "? c (confirmar)");
                opcao = ler.nextLine();
                if(opcao.equals("c")) {
                    c4.setVoto( c4.getVoto() + 1);
                    System.out.print("FIM\n");
                } else {
                    votarCandidato(voto);
                }
                break;
            case "45":
                System.out.println("Você deseja votar no candidato(a) " + c5.getNome() + "? c (confirmar)");
                opcao = ler.nextLine();
                if(opcao.equals("c")) {
                    c5.setVoto( c5.getVoto() + 1);
                    System.out.print("FIM\n");
                } else {
                    votarCandidato(voto);
                }
                break;
            case "b":
                branco += 1;
                System.out.print("FIM\n");
                break;
            case "n":
                nulo += 1;
                System.out.print("FIM\n");
                break;
            default:
                break;
        }
    }

    @Override
    public String getVoto() throws RemoteException {
        return   "Número: " + c1.getNumero() + "     |     Nome: " + c1.getNome() +  "       |     Votos: " + c1.getVoto() + "\n" 
               + "Número: " + c2.getNumero() + "     |     Nome: " + c2.getNome() +  "       |     Votos: " + c2.getVoto() + "\n"
               + "Número: " + c3.getNumero() + "     |     Nome: " + c3.getNome() +  "       |     Votos: " + c3.getVoto() + "\n" 
               + "Número: " + c4.getNumero() + "     |     Nome: " + c4.getNome() +  "       |     Votos: " + c4.getVoto() + "\n"
               + "Número: " + c5.getNumero() + "     |     Nome: " + c5.getNome() +  "       |     Votos: " + c5.getVoto() + "\n"
               + "Branco: " + branco + "\n"
               + "Nulo: " + nulo;
    }
    
    @Override
    public void exibirVotos(List<UrnaInterface> votos) throws RemoteException {
        for (UrnaInterface candidato : votos) {
            System.out.println(candidato.getVoto());
        }
    }

}
