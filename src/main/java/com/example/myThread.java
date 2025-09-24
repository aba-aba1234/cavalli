package com.example;

public class myThread extends Thread{
    public myThread(String nome)
    {
        super(nome);
    }

    public int getTempo() {
        return tempo;
    }
    
    public int tempo;
    public String nome;
    public void run(){
        tempo = (int)(Math.random()*101);
    }
}
