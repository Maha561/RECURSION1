

class Main{
    
    static int count =0;
    
    static void f(){
        
        if(count == 3){
            
            return;
        }
        else{
        System.out.println("1");
        count++;

        f();
        }
        
        
    }
    public static void main(String[] args){
        
        f();
        
    }
}
