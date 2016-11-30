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
public class Hilo1 extends Thread{

    @Override
    public void run() {
        try {
              for (int i = 0; i < 10; i++) {
            System.out.println("hola "+i);
            Hilo1.sleep(1000);
              }
        } catch (Exception e) {
                e.printStackTrace();
        }
     
            
        }
    }
    

