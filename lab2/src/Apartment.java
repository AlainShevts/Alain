import java.io.Serializable;
import java.rmi.RemoteException;

public class Apartment implements AppartsB, Serializable {

    private String name;
    private String type;
    private Room[] composition;

    public Apartment(String name, String type, Room[] composition) {
        this.name = name;
        this.type = type;
        this.composition = composition;
    }

    public Apartment() {

    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Room[] getComposition() {
        return composition;
    }

    @Override
    public void display() throws RemoteException {
        System.out.printf("%s \"%s\" \n", getType(), getName());
        System.out.printf("Квартира:\n");
        for (int i = 0; i < getComposition().length; i++) {
            System.out.println(getComposition()[i].getType());
        }
    }
}
