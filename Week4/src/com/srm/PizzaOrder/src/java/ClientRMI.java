
import java.rmi.Naming;


public class ClientRMI {
   public static void main(String args[]){  
try{  
Multiply mul=(Multiply)Naming.lookup("rmi://localhost:1900/remoteData");  
System.out.println("Multiply Result : "+mul.multiply(25.5,8.7));  
}catch(Exception e){}  
}   
}
