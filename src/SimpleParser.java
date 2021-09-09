import java.util.ArrayList;
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
        ArrayList<String> words = new ArrayList<>();
        Pattern pattern = Pattern.compile("[A-ZА-Я][a-zа-я]+");
        boolean inputError = true;
        while(inputError) {
            System.out.println("Введите Фамилию, Имя и Отчество через пробел в одной строкой");
            String text = scanner.nextLine();
            Matcher matcher = pattern.matcher(text);
            while(matcher.find()) {
                words.add(matcher.group());
            }
            if(words.size() == 3){
                inputError = false;
            }
        }
        //scanner.close();
        return words.toArray(new String[3]);
    }

    public String[] wordDivider(String text){
        ArrayList<String> words = new ArrayList<>();
        Pattern pattern = Pattern.compile("[A-ZА-Яa-zа-я]+");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            words.add(matcher.group());
        }
        return words.toArray(new String[words.size()]);
    }

    public String searchAndReplaceDiamonds(String text, String placeholder){
        Pattern pattern = Pattern.compile("<.+>");
        Matcher matcher = pattern.matcher(text);
        return matcher.replaceAll(placeholder);
    }
}
