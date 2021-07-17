
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MultiplyImpl extends UnicastRemoteObject implements Multiply{
    MultiplyImpl() throws RemoteException
    {
        super();
    }
    @Override
    public double multiply(double a,double b)
    {
        return a*b;
    }
}
