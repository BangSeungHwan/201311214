import java.util.*;

class Numbers{

	static ArrayList<Integer> myList = new ArrayList<Integer>();

	public static void setNumbers(){

		for(int i=0; i<1000; i++) {
			if(i%4==0 && i%5!=0) {
				myList.add(i);
			}
		}
	}

	public static int sumList(ArrayList<Integer> aList){

		int sum = 0;
				
		for(int i=0; i<aList.size(); i++){
			sum += aList.get(i);
		}

		return sum;
	}

	public static void main(String[] args){

		Numbers n = new Numbers();
		n.setNumbers();
		System.out.println(n.sumList(myList));
	}
	
}