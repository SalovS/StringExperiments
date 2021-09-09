import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckingTheNumber {
    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер телефона, для выхода введите Q");
            String text = scanner.nextLine();
            if (text.toUpperCase().contains("Q")) {
                scanner.close();
                return;
            }
            String number = parsNumber(text);
            checkNumber(number);
        }
    }

    private String parsNumber(String text) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);
        String number = "";
        while (matcher.find()) {
            number += matcher.group();
        }
        return number;
    }

    private void checkNumber(String number){
        if(number.length() > 11 || number.length() < 10){
            System.out.println("Неверный формат номера");
            return;
        }
        if(number.length() == 10){
            System.out.println("7"+number);
            return;
        }
        if(number.charAt(0) == '8'){
            char[] charArray = number.toCharArray();
            charArray[0] = '7';
            System.out.println(String.valueOf(charArray));
            return;
        }
        if(number.charAt(0) == '7'){
            System.out.println(number);
            return;
        }
        System.out.println("Неверный формат номера");
    }
}


