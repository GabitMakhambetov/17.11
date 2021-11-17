package com.company;

public class List {
    public void snowed(String name){
        System.out.println(name + ": Листья покрылись инеем");
    }

    public void yell(String name){
        if (name.equals("Ель"))
            System.out.println(name + ": Листья Ели не желтеют");
        else
            System.out.println(name + ": Листья пожелтели");
    }
}