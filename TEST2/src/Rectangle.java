public class Rectangle {
    // Attributes with default values
    private double length = 1.0;
    private double width = 1.0;

    // Getter for length
    public double getLength() {
        return length;
    }

    // Setter for length (with validation)
    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Invalid length. Length must be greater than 0.");
        }
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Setter for width (with validation)
    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Invalid width. Width must be greater than 0.");
        }
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * width;
    }

    // Main method to demonstrate the class
    public static void main(String[] args) {
        // Create an instance of Rectangle
        Rectangle rectangle = new Rectangle();

        // Display default values
        System.out.println("Default Length: " + rectangle.getLength());
        System.out.println("Default Width: " + rectangle.getWidth());
        System.out.println("Default Area: " + rectangle.calculateArea());

        // Set new values
        rectangle.setLength(5.0);
        rectangle.setWidth(3.0);

        // Display updated values
        System.out.println("Updated Length: " + rectangle.getLength());
        System.out.println("Updated Width: " + rectangle.getWidth());
        System.out.println("Updated Area: " + rectangle.calculateArea());

        // Test invalid values
        rectangle.setLength(-2.0); // This will trigger the validation message
        rectangle.setWidth(0);    // This will trigger the validation message
    }
}