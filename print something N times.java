
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main{
    
    static int n = 0 ;
    
    static void name(){
        
        if(n==3){
            
            return;
            
        }
        else{
            System.out.println("raj");
            n++;
            name();
        }
        
        
    }
    
    public static void main(String[] args){
        
        name();
    }
}