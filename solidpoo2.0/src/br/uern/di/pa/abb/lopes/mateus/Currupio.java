/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.uern.di.pa.abb.lopes.mateus;

/**
 *
 * @author mateus.v.lopes
 */
public class Currupio extends Passaro{

    /**
     *
     */
    public int distmaxvoo;
    
    public Currupio (int distmaxvoo){
        this.distmaxvoo = 100;
        this.distmaxvoo = distmaxvoo;
    }
    
    public int getdistmaxvoo(){
        return distmaxvoo;
    }
    
    public void setdistmaxvoo(int distmaxvoo){
        this.distmaxvoo = distmaxvoo;
    }
    
    @Override
    public void cantar(){
        System.out.println("Pio friu fru  fri Pió");
    }
    
    @Override
    public int voar(int valor){
        if(valor<distmaxvoo) return valor;
        return distmaxvoo;
    }

}
