import java.util.Scanner;

public class Swapped {

	public static void main(String[] args) {
		
		int x,y,temp;
		
		System.out.println("Enter the Value of X");
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		System.out.println("Enter the value of Y");
		y=sc.nextInt();
		
		System.out.println("Value of Numbers Before Swapping :" + "X :" + x + " Y :" + y) ;
	
		
		x=x^y;
		y=x^y;
		x=x^y;
		
		
		
	//	y=y-x;  // 6-8 =-2
	//	x=y+x;  // -2+8 =6
	//	y=(x-y);
		
		
		
		//temp=x;
		// x=y;
		// y=temp;
		
		System.out.println("Value of Numbers After Swapping :" + "X :" + x + " Y :" + y) ;
		
	}

}
