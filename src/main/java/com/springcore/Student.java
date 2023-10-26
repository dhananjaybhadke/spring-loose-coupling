package com.springcore;

public class Student {

    private int id;
    private Cheat cheat;

    public void setId(int id) {
        this.id = id;
    }

    public void setCheat(Cheat cheat) {
        this.cheat = cheat;
    }

    public void startCheating(){
        cheat.cheat();
        System.out.println("Student.startCheating is cheating with ID " +this.id);
    }

}
