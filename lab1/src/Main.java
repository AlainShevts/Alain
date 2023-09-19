import java.io.*;

class Room implements Serializable {
    private String roomName;
    private double area;

    public Room(String roomName, double area) {
        this.roomName = roomName;
        this.area = area;
    }

    public String getRoomName() {
        return roomName;
    }

    public double getArea() {
        return area;
    }
}

class Apartment implements Serializable {
    private String apartmentName;
    private Room[] rooms;

    public Apartment(String apartmentName, Room[] rooms) {
        this.apartmentName = apartmentName;
        this.rooms = rooms;
    }

    public String getApartmentName() {
        return apartmentName;
    }

    public Room[] getRooms() {
        return rooms;
    }
}

public class Main {
    public static void main(String[] args) {
        // Создание объектов комнат
        Room room1 = new Room("Комната 1", 15.5);
        Room room2 = new Room("Комната 2", 20.0);
        Room room3 = new Room("Комната 3", 12.3);

        // Создание объекта квартиры
        Room[] rooms = {room1, room2, room3};
        Apartment apartment = new Apartment("Моя квартира", rooms);

        // Сериализация объекта квартиры в файл
        try {
            FileOutputStream fileOut = new FileOutputStream("apartment.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(apartment);
            out.close();
            fileOut.close();
            System.out.println("Квартира сериализована в файл apartment.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Десериализация объекта квартиры из файла
        try {
            FileInputStream fileIn = new FileInputStream("apartment.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Apartment deserializedApartment = (Apartment) in.readObject();
            in.close();
            fileIn.close();

            System.out.println("Десериализованная квартира: " + deserializedApartment.getApartmentName());
            System.out.println("Комнаты в квартире:");
            for (Room room : deserializedApartment.getRooms()) {
                System.out.println(room.getRoomName() + ", площадь: " + room.getArea() + " кв.м");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}