class CompareScore{

  char grade1 = 'A';
  char grade2 = 'B';
  char grade3 = 'C';  

  public void compareSco(double marks){  

  if(70<=marks && marks<=100){
    System.out.println("grade is " + grade1);
  } else if(40<=marks && marks<70){
    System.out.println("grade is " + grade2);
  } else if(0<marks && marks<40){
    System.out.println("grade is " + grade3);
  } else {
    System.out.println("error");
  }

  }

}

CompareScore c = new CompareScore();
c.compareSco(75.5);
c.compareSco(60.7);
c.compareSco(28.9);
c.compareSco(150);