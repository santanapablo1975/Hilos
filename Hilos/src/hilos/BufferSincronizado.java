/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author Sheppard
 */
public class BufferSincronizado {
  private char contenido;
  private boolean disponible=false;
  public BufferSincronizado() {
  }

  public synchronized char recoger(){
    while(!disponible){
        try{
            wait();
        }catch(InterruptedException ex){}
    }
    disponible=false;
    notify();
    return contenido;
  }

  public synchronized void poner(char valor){
     while(disponible){
        try{
            wait();
        }catch(InterruptedException ex){}
    }
    contenido=valor;
    disponible=true;
    notify();
  }
}