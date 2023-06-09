import java.util.Scanner;

public class q811 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); 
    
    try {
      System.out.print("Enter c value : ");
      int c = scan.nextInt();
      
      System.out.print("Enter m value : ");
      int m = scan.nextInt();
      
    System.out.print("Enter the total numbers of Y:");
    int y=scan.nextInt();
    int[] arr=new int[23];
      int Y=20;
    System.out.print ("The result of X value = ");
   for(int i=0;i<y;i++){
     arr[i] = (Y-c)/m;
     System.out.print ((float)arr[i]+" ");
     Y++;
}
}
    catch(ArithmeticException e1) {
      System.out.print("Program has some problem with :" + e1);
    }
   
    catch(ArrayIndexOutOfBoundsException e3) {
      System.out.print("Program has some problem with :" + e3);
    }
     catch(Exception e2) {
      System.out.print("Program has some problem with :" + e2);
    }
    
  }
}
