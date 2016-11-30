package hilos;


import hilos.Buffer;
import static java.lang.Thread.sleep;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sheppard
 */
public class ProductorSincronizado extends Thread {
  private BufferSincronizado buffer;
  private final String letras="abcdefghijklmnopqrstuvxyz";
  public ProductorSincronizado(BufferSincronizado buffer) {
    this.buffer=buffer;
  }
    public void run() {
        for(int i=0; i<10; i++){
            char c=letras.charAt((int)(Math.random()*letras.length()));
            buffer.poner(c);
            System.out.println(i+" Productor: " +c);
            try {
                sleep(400);
            } catch (InterruptedException e) { }
        }
    }
}