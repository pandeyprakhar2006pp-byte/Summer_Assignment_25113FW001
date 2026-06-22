//WAP to remove spaces freom string

public class Removespaces {
    public static void main(String[] args) {
        String str = "Mridul is a hardworking student";  
        String result = "";
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {             // skip spaces
                result = result + str.charAt(i);
            }
        }
        
        System.out.println("Original: " + str);
        System.out.println("Without spaces: " + result);
    }
}
