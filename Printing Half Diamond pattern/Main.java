import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for (int i=1;i<=n;i++)
      {
        for (int space=1;space<=(n-i);space++)
        {
          System.out.print(" ");
        }
        for(int j=n-(i-1);j<=n+(i-1);j++)
        {
          System.out.print("*");
        }
        System.out.println("");
      }
	}
}