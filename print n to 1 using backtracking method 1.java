

// lets print n to 1 using backtracking

public class Main {
    
    static void number(int i ,int n){
        
        if(i>n){
            
            return;
        }
        else{
            number(i+1,n);
            System.out.println(i);
        }
    }
    
    
    public static void main(String[] args) {
        int n = 3;
        // output 3 2 1
        number(1,n);
    }
}