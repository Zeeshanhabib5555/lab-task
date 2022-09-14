public class SingletonClass 
{
    
private static SingletonClass object=new SingletonClass();
static int counter=0;
private SingletonClass()
{
    counter++;
}
public static SingletonClass showmessage()
{
    System.out.println("Object Counter NO :"+counter);
    return object;
}
   
    public static void main(String[] args) {
        
        SingletonClass object=new SingletonClass();
        SingletonClass.showmessage();
        object=new SingletonClass();
        SingletonClass.showmessage();
    }
    
}