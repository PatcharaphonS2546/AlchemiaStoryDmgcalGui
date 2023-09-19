package com.mycompany.alchemiagui;
public class Dmgcal implements Function {

    @Override
    public double TwillightEffect(int percent) {
        return (percent/100);
    }

    @Override
    public double LunarticEffect(int percent) {
        return (percent/100);
    }

    @Override
    public double Cridmg(int Base, int idea) {
        return (120+Base+idea)/100;
    }

    @Override
    public double Dmgfactor(int value) {
        return (100+value)/100;
    }
    
    }
