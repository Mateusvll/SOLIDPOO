/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.uern.di.pa.abb.lopes.mateus;

/**
 *
 * @author mateus.v.lopes
 */
public class Papagaio extends Passaro {
    public int distmaxvoo=120;
    
    public Papagaio(int distmaxvoo){
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
        System.out.println("Papagaio legal");
    }
    
    @Override
    public int voar(int valor){
        if(valor<distmaxvoo) return valor;
        return distmaxvoo;
    }
}
