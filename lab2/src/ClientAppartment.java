import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientAppartment {

    public static final String HOST = "Appartment";
    public static final int PORT = 1099;

    public static void main(String[] args) throws RemoteException, NotBoundException {

        final Registry registry = LocateRegistry.getRegistry(PORT);

        AppartsB appartment = (AppartsB) registry.lookup(HOST);
        appartment.display();
    }
}
