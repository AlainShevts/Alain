import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AppartsB extends Remote {
    void display() throws RemoteException;
}
