import java.util.ArrayList;
import java.util.Scanner;

public class SimpleParser {
    public void start(){
        ArrayList<String> initials = enteringText();
        System.out.println("Фамилия : " + initials.get(0));
        System.out.println("Имя : "  + initials.get(1));
        System.out.println("Отчество : "  + initials.get(2));
    }
    private ArrayList<String> enteringText(){
        Sumator sumator = new Sumator();
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        boolean inputError = true;
        while(inputError) {
            System.out.println("Введите Фамилию, Имя и Отчество через пробел в одной строкой");
            String text = scanner.nextLine();
            words = sumator.wordDivider(text);
            if(words.size() == 3){
                inputError = false;
            }
        }
        return words;
    }
}
