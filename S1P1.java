import java.util.ArrayList;

public class S1P1 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Amit");
        names.add("Aman");
        names.add("Ankit");
        names.add("Priya");
        names.add("Riya");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}