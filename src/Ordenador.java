/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ipampillonvieitez
 */
public class Ordenador {
    private Rato rato;
    private Pantalla pant;
    private Cpu proces;
    
    public Ordenador(){
        rato= new Rato();
        pant= new Pantalla();
        proces= new Cpu();       
    }
    public Ordenador(Rato rato, Pantalla pant, Cpu proces){
        this.rato=rato;
        this.pant=pant;
        this.proces=proces;
    }
    public void setRato(Rato rato){
        this.rato=rato;
    }
    public Rato getRato(){
        return rato;
    }
    public void setPant(Pantalla pant){
        this.pant=pant;
    }
    public Pantalla getPant(){
        return pant;
    }
    public void setCpu(Cpu cpu){
        this.proces=cpu;
    }
    public Cpu getCpu(){
        return proces;
    }
    
    
    
    
    
    
    
}
