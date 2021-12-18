/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyPatternDuck;

/**
 *
 * @author ducth
 */
public class ModelDuck extends Duck{

    public ModelDuck() {
        quackbehavior = new Quack();
        flybehavior = new FlyNoWay();
    }
     public void display(){
        System.out.println("Im a real model duck");
    }
    
    
}
