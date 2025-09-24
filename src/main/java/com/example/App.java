package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
          * @throws InterruptedException 
          */
         public static void main(String[] args) throws InterruptedException {
        myThread varanne = new myThread("varanne");
        myThread dario = new myThread("dario");
        myThread bomber = new myThread("bomber");
        myThread tappo = new myThread("tappo");

        ArrayList<myThread> cavalli = new ArrayList<>(Arrays.asList(varanne,dario,bomber,tappo));
        varanne.start();
        dario.start();
        bomber.start();
        tappo.start();

        varanne.join();
        dario.join();
        bomber.join();
        tappo.join();

        cavalli.sort(Comparator.comparingInt(myThread::getTempo));
        System.out.println("Classifica: ");
        for(myThread cavallo : cavalli)
        {
            System.out.println(cavallo.getName() + " " + "=> " + "tempo: " + cavallo.tempo);
        }
    }
}