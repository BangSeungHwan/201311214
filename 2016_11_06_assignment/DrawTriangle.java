class DrawTriangle {
	
	public static void drawTriangleWithChar(int height, String symbol) {

		String white = " ";		

		StringBuffer sbuf = new StringBuffer();

		for(int i=0; i<height; i++) {
			for(int j=0; j<height-i; j++){
				sbuf.append(white);
			}
			System.out.printf("%s",sbuf.toString());
			sbuf.delete(0, sbuf.length());
			
			for(int k=0; k<i*2+1; k++){
				sbuf.append(symbol);
			}
			System.out.printf("%s",sbuf.toString());
			sbuf.delete(0, sbuf.length());
			System.out.println();
		}		
	}
	
	public static void main(String[] args){
		drawTriangleWithChar(12, "*");
	}
}
