/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import static java.lang.Thread.sleep;

/**
 *
 * @author Sheppard
 */
public class ConsumidorSincronizado extends Thread {
  private BufferSincronizado buffer;
  public ConsumidorSincronizado(BufferSincronizado buffer) {
    this.buffer=buffer;
  }
  public void run(){
    char valor;
    for(int i=0; i<10; i++){
        valor=buffer.recoger();
        System.out.println(i+ " Consumidor: "+valor);
        try{
            sleep(100);
        }catch (InterruptedException e) { }
    }
  }
}
