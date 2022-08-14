/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.uern.di.pa.abb.lopes.mateus;

/**
 *
 * @author mateus.v.lopes
 */
public class Main{
    public static void main(String[] args){
        Papagaio p = new Papagaio(20);
        Currupio c = new Currupio(15);
        p.cantar();
        c.cantar();
        
        System.out.println("Papagaio voa: " + p.getdistmaxvoo());
        System.out.println("Currupio voa: " + c.getdistmaxvoo());
    }
}
