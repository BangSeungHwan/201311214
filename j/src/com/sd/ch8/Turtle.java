package com.sd.ch8;

public class Turtle {
  protected int nLimbs = 4;
  protected String food;
  public void setFood(String f){
    this.food = f;
  }
  public void eat() {
  System.out.print("Turtle eats " + food);
  }

  public void setnLimbs(int limbs){
    this.nLimbs = limbs;
  }
  public void getnLimbs(){
    System.out.println("nLimbs : " + nLimbs);
  }

  public static void main(String[] args){
    Turtle = new Turtle();
    SeaTurtle st = new SeaTurtle();
    LandTurtle lt = new LandTurtle();

    st.setnLimbs(4);
    lt.setnLimbs(4);
    
    st.getnLimbs();
    lt.getnLimbs();
}