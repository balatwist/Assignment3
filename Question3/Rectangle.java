package Question3;

public final class Rectangle {
    private final double width;
    private  final double length;

    public Rectangle(double length, double width) {
        this.width = width;
        this.length = length;
    }

    public double computeArea(){
return  length*width;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
}
