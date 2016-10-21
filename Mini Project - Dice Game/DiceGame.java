class DiceGame {

  Date time = new Date();
 
  Player p1 = new Player("BSH");
  Player p2 = new Player("JOY");

  public void startGame() {

    p1.play();
    p2.play();

    if(p1.getNum() > p2.getNum()) {
      p1.score+=1;
      System.out.println(p1.getName() + " win");
    } 
    else if (p1.getNum() == p2.getNum()) {
      System.out.println("draw");
    }
    else {
      p2.score+=1;
      System.out.println(p2.getName() + " win");     
    }

    System.out.println("경기 시간 : " + time);
    System.out.println("player : " + p1.getName() + " ," + p2.getName());

    System.out.println(p1.getName() + " score : " + p1.score);
    System.out.println(p2.getName() + " score : " + p2.score);
      
  }

}