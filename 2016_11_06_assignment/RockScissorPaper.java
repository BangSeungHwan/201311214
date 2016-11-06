class RockScissorPaper{

	public void startGame(String user1, String user2) {
		
		if(user1.equals(user2)) {
			System.out.println("draw");

		}else if(user1.equals("scissor")){

			if(user2.equals("rock")){
				System.out.println("rock wins");
				System.out.println("user2 wins");
			}else if(user2.equals("paper")){
			 System.out.println("scissor wins");
			 System.out.println("user1 wins");
			}

		}else if(user1.equals("rock")){
		
			if(user2.equals("scissor")){
				System.out.println("rock wins");
				System.out.println("user1 wins");
			}else if(user2.equals("paper")){
				System.out.println("paper wins");
				System.out.println("user2 wins");
			}

		}else if(user1.equals("paper")){
		
			if(user2.equals("scissor")){
				System.out.println("scissor wins");
				System.out.println("user2 wins");
			}else if(user2.equals("rock")){
				System.out.println("paper wins");
				System.out.println("user1 wins");
			}
	
		}else {
			System.out.println("error");
		}

	}

	public static void main(String[] args){
		
		RockScissorPaper r = new RockScissorPaper();
		r.startGame("rock","paper");
	}

}