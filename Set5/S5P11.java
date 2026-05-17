public class S5P11 {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block starts");

            try {
                System.out.println("Inner try block starts");

                int arr[] = {1, 2, 3};

                System.out.println(arr[5]);

                System.out.println("Inner try block ends");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: " + e);
            }


            int result = 10 / 0;

            System.out.println("Outer try block ends");

        } catch (ArithmeticException e) {
            System.out.println("Outer catch: " + e);
        }

        System.out.println("Program continues after nested try-catch");
    }
}
