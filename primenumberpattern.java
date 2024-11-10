import java.util.Scanner;
public class primenumberpattern {
  public static void main(String[] args) {
        int number=2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int rows=sc.nextInt();
        System.out.printf("prime number pattern of %d rows is:\n",rows);
        for(int i=1;i<=rows;i++){
                int primnerows=0;
                while(primnerows<i){
                    if(isprime(number)){
                    System.out.print(number+" ");
                    primnerows++;
                    }
               number++;
                }
            System.out.println();
        }
    }
public static boolean isprime(int n){
            if(n<=1)
            return false;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0)
                return false;
    }
    return true;  
}
}


    

