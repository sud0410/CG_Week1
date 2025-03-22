class NullPointer{
    public static void Crash(){
        String str = null;
        System.out.println("The length of string is: "+str.length());
    }
    public static void handle(){
        String str = null;
        try{
            System.out.println("The length of string is: "+str.length());
        }
        catch(NullPointerException e){
            System.out.println("it's a Null pointer Exception "+e.getMessage());
        }
    }
    public static void main(String args[]){
        //NullPointer.Crash();
        NullPointer.handle();
    }
}


