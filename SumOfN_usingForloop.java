// sum of n numbers
// for example lets say n = 3 , so 1+2+3 =6 which is called sum of n numbers.
// using normal for loop

public class SumOfN_usingForloop {

     public static void main(String[] args) {

        int sum = 0;
        int n = 3;
        for(int i =1;i<=n;i++){

            sum = sum+i;
        }

        System.out.println(sum);


    }
    
}
