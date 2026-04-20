public class HelloAppUC4 {
    public static void main(String[] args) {

        if (args.length > 0) {
            // Join all arguments into one string
            String names = String.join(", ", args);
            System.out.println("Hello " + names);
        } else {
            System.out.println("Hello World");
        }
    }
}