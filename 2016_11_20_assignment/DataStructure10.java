class DataStructure10 {

	public static void calcPeople() {
	
		int[][] data={
    				{74425, 76326},
    				{61164, 61636},
    				{109688, 115744},
    				{144796, 146776},
    				{174996, 181676},
    				{177841, 177434},
    				{204630, 205980},
    				{223373, 232245},
    				{161055, 166130},
    				{171576, 176735},
    				{279169, 293772},
    				{239450, 251066},
    				{148690, 156510},
    				{182977, 196992},
    				{237792, 242641},
    				{283869, 296762},
    				{209344, 210282},
    				{118965, 114441},
    				{186503, 186856},
    				{195734, 203014},
    				{254381, 249472},
    				{212401, 229111},
    				{271654, 295354},
    				{319197, 335045},
    				{229829, 231671}
			     };

		float sum = 0;
		float avg = 0;
		
		for(int i=0; i<data.length; i++){
			System.out.print(i+1 + " City -> ");
			for(int j=0; j<data[i].length; j++){
				sum += data[i][j];
			}
			System.out.print("sum : " + sum + " / ");
			System.out.println("avg : " + sum / 2);
		}

		float tmsum = 0;
		float twsum = 0;

		for(int i=0; i<data.length; i++){
			tmsum += data[i][0];
		}
		System.out.println("Total Men's sum : " + tmsum);
		System.out.println("Total Men's average : " + tmsum/data.length);
		
		for(int i=0; i<data.length; i++){
			twsum += data[i][1];
		}
		System.out.println("Total Women's sum : " + twsum);
		System.out.println("Total Women's average : " + twsum/data.length);		
	}

	public static void main(String[] args) {
		calcPeople();
	}
}