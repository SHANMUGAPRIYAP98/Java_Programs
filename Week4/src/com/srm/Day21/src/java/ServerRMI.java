
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ServerRMI {
    public static void main(String args[]) throws RemoteException, MalformedURLException
    {
        Multiply mul=new MultiplyImpl();
        LocateRegistry.createRegistry(1900);
        Naming.rebind("rmi://localhost:1900/remoteData",mul);  
    }
}
