package holamundo;

import java.util.Scanner;

public class Holamundo {

  

   // public int getA() {
     //   return a;
    //}

   // public int getB() {
     //   return b;
    //}
    
    public static void main(String[] args) {
        int i,num;
        int fact=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Di un numero natural");
        num=sc.nextInt();
        for(i=num;i>=1;i--){
            fact=fact*i;
            
        }
       System.out.println("El factorial es " + fact);
    }

    

   
    
}
