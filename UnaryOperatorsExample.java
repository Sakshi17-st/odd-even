 class UnaryOperatorsExample {
    public static void main(String[] args) {
        // Declare a variable
        int num = 10;

        // Print the initial value of num
        System.out.println("Initial value of num: " + num);

        // Using the post-increment operator (num++)
        System.out.println("Post-increment (num++): " + num++);  // Prints num first, then increments
        System.out.println("Value of num after post-increment: " + num);

        // Using the pre-increment operator (++num)
        System.out.println("Pre-increment (++num): " + ++num);  // Increments num first, then prints
        System.out.println("Value of num after pre-increment: " + num);

        // Using the post-decrement operator (num--)
        System.out.println("Post-decrement (num--): " + num--);  // Prints num first, then decrements
        System.out.println("Value of num after post-decrement: " + num);

        // Using the pre-decrement operator (--num)
        System.out.println("Pre-decrement (--num): " + --num);  // Decrements num first, then prints
        System.out.println("Value of num after pre-decrement: " + num);
    }
}
