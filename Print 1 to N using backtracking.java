
// print 1 to n using recursion but use backtracking 
// backtracking is aschived by writig the print statement after the recusion function call line
// 🔑 Interview One-Liner (remember this) 0 ----Backtracking happens when the work is done after the recursive call, during the return phase of recursion.
// lets see an example

public class Main{
    static void number(int i){
        // here we are passing the n value as i
        if(i<1){
            return;
        }
        else{
            number(i-1);  // recursive call
            System.out.println(i);  // backtracking step
            
        }
    }
    public static void main(String[] args){
        int n = 3;
        number(n);
    }
}