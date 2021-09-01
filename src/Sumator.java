import java.util.ArrayList;

public class Sumator {
    public int count(String text){
        int summ = 0;
        ArrayList<String> words = wordDivider(text);
        for(int i = 0; i < words.size() ; i++){
            try{
                summ += Integer.parseInt(words.get(i));
            }catch (NumberFormatException e){}
        }
        return summ;
    }

    public ArrayList<String> wordDivider(String text){
        text = text.trim();
        ArrayList<Integer> positions = getArrayOfSpaces(text);
        ArrayList<String> words = new ArrayList<>();
        for(int i = 1; i < positions.size() ; i++){
            String str = text.substring(positions.get(i-1),positions.get(i)).trim();
            if(str.length() > 0)
                words.add(str);
        }
        return words;
    }

    private ArrayList<Integer> getArrayOfSpaces(String text){
        ArrayList<Integer> positions = new ArrayList<>();
        int simbol = 0;
        int nextSimbol  = text.indexOf(' ');
        int lastSimbol = text.lastIndexOf(' ');
        positions.add(simbol);
        positions.add(nextSimbol);
        while(nextSimbol < lastSimbol){
            nextSimbol = text.indexOf(' ',++simbol);
            simbol = nextSimbol;
            positions.add(nextSimbol);
        }
        positions.add(text.length());
        return positions;
    }
}
