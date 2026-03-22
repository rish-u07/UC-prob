public class HelloApp {

    public static void main(String[] args) {

        String result;

        // Check if no arguments are provided
        if (args.length == 0) {
            result = "Hello World!";
        } else {

            StringBuilder names = new StringBuilder();

            // Enhanced for loop to iterate through args
            for (String name : args) {
                if (names.length() > 0) {
                    names.append(", "); // add comma before next name
                }
                names.append(name);
            }

            result = "Hello " + names.toString() + "!";
        }

        // Print final greeting
        System.out.println(result);
    }
}
