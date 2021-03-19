
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter UpperBound : ");
        int number = scan.nextInt();
        int sum1 = 0;
        int sum2 = 0;     
        
        ArrayList<Integer> numberList = new ArrayList<>();
        
        for(int i = 0; i<=number;i++){
           numberList.add(i);
           
        }
      
        Object numberArray [] = numberList.toArray();
  
        for(Object i: numberArray){
              if((int)i%2==1){
                  sum1+=(int)i;
              }else
                  sum2+=(int)i;
     
        }
          System.out.println("Subtraction is : "+(sum1-sum2));
    }
    
    
}
