public class rectangle {
    private double length = 1.0;
    private double width = 1.0;

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width >= 1.0 && width <= 20.0) {
            this.width = width;
        } else if (width < 1.0) {
            this.width = 1.0;
        } else {
            this.width = 20.0;
        }
    }

    public void setLength(double length) {
        if (length >= 1.0 && length <= 20.0) {
            this.length = length;
        } else if (length < 1.0) {
            this.length = 1.0;
        } else {
            this.length = 20.0;
        }
    }

    public double scope() {
        return 2 * (length + width);
    }

    public double surface_area() {
        return length * width;
    }

}