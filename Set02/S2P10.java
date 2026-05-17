
class Sentence {
    String text;

    Sentence(String text) {
        this.text = text;
    }

    void countWords() {
        if (text == null || text.trim().isEmpty()) {
            System.out.println("Total word count: 0");
            return;
        }

        // split("\\s+") handles multiple spaces between words
        String[] words = text.trim().split("\\s+");
        
        System.out.println("Sentence: \"" + text + "\"");
        System.out.println("Total word count: " + words.length);
    }
}

public class S2P10 {
    public static void main(String[] args) {
        Sentence mySentence = new Sentence("Java programming is fun and powerful");
        
        mySentence.countWords();
    }
}