public class S5P10 {
    public static void main(String[] args) {
        int[] marks = {85, 92, 78, 88, 95}; // Example marks for 5 subjects
        try {
            double average = calculateAverage(marks);
            System.out.println("Average marks: " + average);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double calculateAverage(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            if (mark < 0 || mark > 100) {
                throw new IllegalArgumentException("Marks must be between 0 and 100.");
            }
            sum += mark;
        }
        return (double) sum / marks.length;
    }
    
}