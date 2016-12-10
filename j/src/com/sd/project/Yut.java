package com.sd.project;

public class Yut {

  private int x = 0;

  public void roll() {
    x = (int) (Math.random() * 5 + 1);
  }

  public int getNum() {
    return this.x;
  }

}