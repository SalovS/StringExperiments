import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sumator {
    public void count(String text){
        int summ = 0;
        Integer[] numbers = findNumbers(text);
        for(int i = 0; i < numbers.length; i++){
            summ += numbers[i];
            System.out.println(numbers[i]);
        }
        System.out.println(summ);
    }

    public Integer[] findNumbers(String text){
        ArrayList<Integer> numbers = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            String str = matcher.group();
            try{
                numbers.add(Integer.parseInt(str));
            }catch (NumberFormatException e){}
        }
        return numbers.toArray(new Integer[numbers.size()]);
    }
}
