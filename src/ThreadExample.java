
public class ThreadExample extends Thread {
	public static void main(String args[]){
	      int[] array = {10, 20, 30, 40, 50, 10};
	      int sum = 0;
	      ThreadExample obj = new ThreadExample ();
	      obj.start();
	      
	      //Advanced for loop
	      for( int num : array) {
	          sum = sum+num;
	      }
	      System.out.println("The sum of the numbers is:"+sum);
	   }

}
