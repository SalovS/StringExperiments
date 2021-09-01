import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleParser {
    public void start(){
        String[] initials = enteringText();
        System.out.println("Фамилия : " + initials[0]);
        System.out.println("Имя : "  + initials[1]);
        System.out.println("Отчество : "  + initials[2]);
    }

    private String[] enteringText(){
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[3];
        boolean inputError = true;
        while(inputError) {
            System.out.println("Введите Фамилию, Имя и Отчество через пробел в одной строкой");
            String text = scanner.nextLine();
            words = wordDivider(text);
            if(words.length == 3){
                inputError = false;
            }
        }
        return words;
    }

    public String[] wordDivider(String text){
        String[] parts = text.split("\\W+");
        return parts;
    }

    public String searchAndReplaceDiamonds(String text, String placeholder){
        Pattern pattern = Pattern.compile("<.+>");
        Matcher matcher = pattern.matcher(text);
        return matcher.replaceAll(placeholder);
    }
}
