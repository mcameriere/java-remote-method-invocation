import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.Naming;

public class RemoteService extends UnicastRemoteObject implements IRemoteService {
    private static final long serialVersionUID = 1L;

    public RemoteService() throws RemoteException {}

    public String sayHello() throws RemoteException {
        return "Hello world!";
    }

    public static void main(String[] args) throws Exception {
        try {
            IRemoteService service = new RemoteService();
            Naming.rebind("RemoteHello", service);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

}
