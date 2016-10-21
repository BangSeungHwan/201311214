class Dice {

  private int x = 0;

  public void roll() {
    x = (int) (Math.random() * 6 + 1);   
    System.out.println("Turns on " + x);
  }

  public int getNum() {
    return this.x;
  }

}