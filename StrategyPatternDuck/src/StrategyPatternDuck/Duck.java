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
public  class Duck {
    FlyBehavior flybehavior;
    QuackBehavior quackbehavior;
    public Duck() {
    }
    public void display(){};
    public void performFly(){
        flybehavior.fly();      
    }
    public void performQuack(){
        quackbehavior.quack();
    }
    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }
    public void setFlyBehavior(FlyBehavior fb){
        flybehavior =fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
        quackbehavior =qb;
    }
    
}
