package practice;

public class Pattern7 {

//    *     
//    *     
//* * * * * 
//    *     
//    *   
	
	public static void main(String[] args) {
		int n=5;
		 for(int i=0; i<n; i++) {
			 for(int j=0; j<n; j++) {
				 if(j==2 || i==2) {
					 System.out.print("* ");
				 }else {
					 System.out.print("  ");
				 }
			 }
			 System.out.print("\n");
		 }
	}

}
