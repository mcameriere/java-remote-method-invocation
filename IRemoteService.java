import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IRemoteService extends Remote {
    public String sayHello() throws RemoteException;
}
