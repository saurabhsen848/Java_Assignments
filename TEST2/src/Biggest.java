public class Biggest {
    private int[] numbers; // Single-dimensional array data member

    // Constructor to initialize the array
    public Biggest(int[] arr) {
        this.numbers = arr;
    }

    // Method to find and display the largest element
    public void display() {
        if (numbers == null || numbers.length == 0) {
            System.out.println("Array is empty!");
            return;
        }

        int max = numbers[0]; // Start with first element as largest

        // Loop through array to find largest
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Largest element: " + max);
    }

    // Optional main method to test the class
    public static void main(String[] args) {
        int[] testArray = {45, 23, 67, 12, 89, 34};
        Biggest finder = new Biggest(testArray);
        finder.display();
    }
}