
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main{
    
    //static int n = 0 ;
    
    static void name(int i,int n){
        
        if(i>n){
            
            return;
            
        }
        else{
            System.out.println("raj");
           
            name(i+1,n);
        }
        
        
    }
    
    public static void main(String[] args){
        
        int name = 3;
        
        name(1, name);
    }
}