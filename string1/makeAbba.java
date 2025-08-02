public class makeAbba {
    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    //makeAbba("Hi", "Bye") → "HiByeByeHi"
    //makeAbba("Yo", "Alice") → "YoAliceAliceYo"
    //makeAbba("What", "Up") → "WhatUpUpWhat"
    public static void main(String[]args){
        makeAbba AB = new makeAbba();
        System.out.println(AB.makeAbba("Hi", "Bye"));
        System.out.println(AB.makeAbba("Yo", "Alice"));
        System.out.println(AB.makeAbba("What", "Up"));
    }
}
