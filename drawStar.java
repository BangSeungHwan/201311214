import ch.aplu.turtle.*;

Turtle t1 = new Turtle();

void drawStar(int size){
   
  for(int i=0; i<5; i++){
    
    t1.forward(size);
    t1.right(144);  

  }

}

drawStar(200);