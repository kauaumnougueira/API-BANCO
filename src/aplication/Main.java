package aplication;

import java.util.Scanner;

import entities.Client;
import entities.Conta;

public class Main{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String name = inp.next();
        Client cliente = new Client(name);


        //saques e depositos 
        
        Conta conta = new Conta(cliente);

        System.out.println("qual operação voce deseja fazer em sua conta? (depoisto/saque/transferencia): ");
        String escolha = inp.next();
        if(escolha.equals("deposito")){
            System.out.println("Quanto deseja depositar? ");
            Double valor = inp.nextDouble();
            conta.depositar(valor);
        }else if(escolha.equals("saque")){
            System.out.println("Quanto deseja sacar? ");
            Double valor = inp.nextDouble();
            conta.sacar(valor);
        }else{
            System.out.println("Quanto deseja transferir? ");
            Double valor = inp.nextDouble();
            Client contaDestino = new Client("Random");
            Conta contaDestinoConta = new Conta(contaDestino);
            conta.transferir(valor, contaDestinoConta);
        }
        conta.imprimirExtrato(cliente);

        inp.close();
    }
}