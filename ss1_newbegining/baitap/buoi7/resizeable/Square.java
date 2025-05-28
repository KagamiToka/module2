package baitap.buoi7.resizeable;

public class Square implements Resizeable {
    private double size;

    public Square() {
    }

    public Square(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double area() {
        return size * size;
    }

    @Override
    public void resize(double percent) {
        size += size * percent/100;
    }

    @Override
    public String toString() {
        return "Square{" +
                "size=" + size +
                '}';
    }
}
