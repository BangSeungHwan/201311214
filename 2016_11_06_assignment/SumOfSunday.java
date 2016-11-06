import java.util.Calendar;

class SumOfSunday{

	public static void sum() {

		Calendar c = Calendar.getInstance();

		int sunday = 0;
		
		for(int i=1901; i<2001; i++){
			for(int j=0; j<12; j++){
				c.set(i,j,1);
			
				if(c.get(Calendar.DAY_OF_WEEK)==1){
					sunday++;
				}
			}
		}
		
		System.out.println("Sum Of Sunday during the twentieth century : " + sunday);
	}

	public static void main(String[] args){
		sum();
	}
}