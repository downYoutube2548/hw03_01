public class PolarVector {

    private final double length;
    private final double direction;
    public PolarVector(double length, double direction) {
        this.length = length;
        this.direction = direction;
    }

    public double getProjectionX() {
        return length * Math.cos(direction);
    }

    public double getProjectionY() {
        return length * Math.sin(direction);
    }

    public Vector toVector() {
        return new Vector(getProjectionX(), getProjectionY());
    }

    public void print() {
        System.out.println("PolarVector: "+length+"<"+direction);
    }
}
