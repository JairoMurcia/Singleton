/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author jairo
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      C ob1= C.getObjeto(4);
      C ob2= C.getObjeto(7);
      
      System.out.println("El dato del objeto 1 es "+ob1.getN());
      System.out.println("El dato del objeto 2 es "+ob2.getN());
      
      ob2.setN(7);
      System.out.println("El nuevo dato del objeto 2 es "+ob2.getN());
      System.out.println("El nuevo dato del objeto 1 es "+ob1.getN());
      
    }
    
}
