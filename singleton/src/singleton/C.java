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
public  class C {
    private static C obj =null;
    private int n;
    private C(int n){
        this.n=n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public static C getObjeto(int n){
        if(obj==null){
            obj=new C(n);
        }
        
        return obj;
    }
    
}
