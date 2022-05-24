package com.client;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Main {

   /* public static void main(String[] args) throws  Exception {



        //parti 1

       System.out.println("je me connecte au serveur");
        Socket socket = new Socket("localhost",1234);

        //stream de communication
        InputStream is = socket.getInputStream();
        OutputStream os =socket.getOutputStream();


        Scanner scanner = new Scanner(System.in);
        System.out.println("donner un nombre: ");

        int nb = scanner.nextInt();

        System.out.println(" j envoie le nombre "+nb+" au serveur");
        os.write(nb);
        System.out.println("j attend la reponse du serveur est ");
        int resp = is.read(); //lire un octet
        System.out.println("la reponse du serveur est "+resp);


    }*/

    public static void main(String[] args) throws  Exception {



        //parti 2

        System.out.println("je me connecte au serveur");
        Socket socket = new Socket("localhost",1234);

        //stream de communication
        InputStream is = socket.getInputStream();
        OutputStream os =socket.getOutputStream();


        Scanner scanner = new Scanner(System.in);
        System.out.println("donner un nombre: ");

        int nb = scanner.nextInt();

        System.out.println(" j envoie le nombre "+nb+" au serveur");
        os.write(nb);
        System.out.println("j attend la reponse du serveur est ");
        int resp = is.read(); //lire un octet
        System.out.println("la reponse du serveur est "+resp);
    }




}
