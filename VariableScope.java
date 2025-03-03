public class VariableScope {

    // Global variable accessible to all methods
    static int globalCount = 100;

    public static void main(String[] args) {
        // Accessing globalCount from the main method
        System.out.println("Global Count (from main): " + globalCount);

        // Calling showScope method
        showScope();
    }

    // Method that demonstrates local and global scope
    public static void showScope() {
        // Local variable, only accessible inside this method
        int localCount = 50;

        // Accessing globalCount (global scope)
        System.out.println("Global Count (from showScope): " + globalCount);
        
        // Accessing localCount (local scope)
        System.out.println("Local Count (from showScope): " + localCount);
    }
}
