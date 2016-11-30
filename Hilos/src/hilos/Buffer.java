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
public class Buffer {
  private char contenido;
  private boolean disponible=false;
  public Buffer() {
  }
  public char recoger(){
    if(disponible){
        disponible=false;
        return contenido;
    }
    return ('\t');
  }
  public void poner(char c){
    contenido=c;
    disponible=true;
  }        
}
