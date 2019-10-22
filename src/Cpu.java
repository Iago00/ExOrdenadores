/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ipampillonvieitez
 */
public class Cpu {
    public int velocidade;
    public int memoria;
    public Cpu(){
        
    }
    public Cpu(int velocidade, int memoria){
        this.velocidade=velocidade;
        this.memoria=memoria;
    }
    public void setVelocidade(int velocidade){
        this.velocidade=velocidade;
    }
    public int getVelocidade(){
        return velocidade;
    }
    public void setMemoria(int memoria){
        this.memoria=memoria;
    }
    public int getMemoria(){
        return memoria;
    }
    
    
    
    
    
    
    
    
}
