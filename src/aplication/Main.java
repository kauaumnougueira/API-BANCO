package aplication;

import java.util.Scanner;

import entities.Client;

public class Main{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        String name = inp.next();
        Client cliente = new Client(name);

        inp.close();
    }
}