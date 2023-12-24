public class Vector {

    private final double x;
    private final double y;
    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getLength() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public double getDirection() {
        return Math.atan2(y, x);
    }

    public double dot(Vector v) {
        return (this.x * v.x) + (this.y * v.y);
    }

    public Vector getUnitVector() {
        return new Vector(this.x/getLength(), this.y/getLength());
    }

    public void print() {
        System.out.println("Vector: "+this.x+"i + "+this.y+"j");
    }

    public PolarVector toPolarVector() {
        return new PolarVector(getLength(), getDirection());
    }
}
