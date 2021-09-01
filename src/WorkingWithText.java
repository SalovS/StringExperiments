public class WorkingWithText {
    public void start(String text){
        SimpleParser parser = new SimpleParser();
        String[] words = parser.wordDivider(text);
        System.out.print(words[0] + " ");
        for(int i = 1; i < words.length; i++){
            if(i % 14 == 0)
                System.out.println(words[i]);
            else
                System.out.print(words[i] + " ");
        }
    }
}
