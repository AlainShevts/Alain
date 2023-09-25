import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServerAppartment {

    public static final String HOST = "Appartment";
    public static final int PORT = 1099;

    public static void main(String[] args) throws RemoteException, AlreadyBoundException, InterruptedException {

        Room room = new Room("Комната", 30);
        Bedroom bedr = new Bedroom("Спальня", 50, 4);
        Bathroom bath = new Bathroom("Ванная", 20, "Шампунь");
        Room holl = new Holl("Холл", 15);


        Room[] rooms = {room, bedr, bath, holl};
        Appartment appartment = new Appartment("Квартира", "Котедж", rooms);

        final Registry registry = LocateRegistry.createRegistry(PORT);

        Remote stub = UnicastRemoteObject.exportObject(appartment, 0);
        registry.bind(HOST, stub);

        Thread.sleep(Integer.MAX_VALUE);
    }
}
