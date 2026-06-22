//WAP to count words in a entence.
public class CountWords {
    public static void main(String[] args) {
        String sentence = "Mridul is a hardworking student";
        
        int count = 1;  
        
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                count++;
            }
        }
        
        System.out.println("Sentence: " + sentence);
        System.out.println("Word count: " + count);
    }
}
