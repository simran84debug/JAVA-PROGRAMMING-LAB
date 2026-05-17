
class Message {
    String text;

    Message(String text) {
        this.text = text;
    }

    void displayLength() {
        System.out.println("Message: " + text);
        System.out.println("Length of string: " + text.length());
    }

    void displayUppercase() {
        System.out.println("Uppercase: " + text.toUpperCase());
    }
}

public class S2P7 {
    public static void main(String[] args) {
        Message msg = new Message("Hello Java!");
        
        msg.displayLength();
        msg.displayUppercase();
    }
}