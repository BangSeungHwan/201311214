class ChangeTemperature {

  public void changeTemp(double temperature) {

  if ( temperature < 40 ) {
    double fahrenheit = (temperature+40)*1.8 - 40;
    System.out.printf("convert celsius to fahrenheit : %f", fahrenheit);
    System.out.println();
  }else if( temperature > 40 ) {
   double celsius = (temperature+40)/1.8 - 40;
   System.out.printf("convert fahrenheit to celsius : %f", celsius);
   System.out.println();  
  }else {
   System.out.println("user input error");
  }

  } 
      
}

ChangeTemperature c = new ChangeTemperature();
c.changeTemp(35);
c.changeTemp(60);

