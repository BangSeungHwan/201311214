package com.sd.project;

public class Dice {

  private int x = 0;

  public void roll() {
    x = (int) (Math.random() * 6 + 1);   
  }

  public int getNum() {
    return this.x;
  }

}