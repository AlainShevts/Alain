import java.io.Serializable;

class Bedroom extends Room implements Serializable {

    private int beds;
    

    public Bedroom(String type, int square, int beds) {
        super(type, square);
        this.beds = beds;
    }

    public int getBeds() {
        return beds;
    }

    @Override
    public void display(){
        System.out.printf("%s, %d m^2, %d кроватей \n", getType(), getSquare(), getBeds());
    }

}