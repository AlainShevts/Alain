import java.io.*;

public class Main {
    public static void main(String[] args) {
        //создание кают
        Berth berth = new Berth("Каюта", 25);
        LivingBerth liv_berth = new LivingBerth("Жилая каюта", 30, 50);
        StorageBerth storage = new StorageBerth("Трюм", 20, "провизия");
        Berth cap_berth = new Berth("Каюта капитана", 15);

        //создание корабля
        Berth[] berths = {berth, liv_berth, storage, cap_berth};
        Ship ship = new Ship("Морриган", "Фрегат", berths);
        //ship.display();

        //сериализация
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("ship.bin");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(ship);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Объект сохранен в файл ship.bin \n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //десериализация
        try {
            FileInputStream fileInputStream = new FileInputStream("ship.bin");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Ship deser_ship = (Ship) objectInputStream.readObject();
            objectInputStream.close();;
            fileInputStream.close();
            System.out.println("Загруженный корабль:");
            deser_ship.display();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}