import java.util.*;

class MakeArray {
	
	public static void InputNum() {
		
		ArrayList<Integer> myList = new ArrayList<Integer>();

			for(int i=0; i<1000; i++) {
				if(i%4==0 && i%5!=0) {
					myList.add(i);
				}
			}
		System.out.println(myList);
	}

	public static void main(String[] args){
		InputNum();
	}

}