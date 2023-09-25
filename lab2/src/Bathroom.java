import java.io.Serializable;

class Bathroom extends Room implements Serializable {

    private String shampoo;

    public Bathroom(String type, int square, String shampoo) {
        super(type, square);
        this.shampoo = shampoo;
    }

    public String getShampoo() {
        return shampoo;
    }

    @Override
    public void display(){
        System.out.printf("%s, %s, %d m^2 \n", getType(), getShampoo(), getSquare());
    }
}
