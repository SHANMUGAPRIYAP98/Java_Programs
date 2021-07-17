
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Multiply extends Remote {
    double multiply(double a,double b) throws RemoteException ;
}
