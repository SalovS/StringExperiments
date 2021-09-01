
public class Loader
{
    public static void main(String[] args)
    {
        Letters letters = new Letters();
        letters.printLetters();

        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        System.out.println(text);

        Sumator sumator = new Sumator();
        System.out.println(sumator.count(text));

        SimpleParser parser = new SimpleParser();
        parser.start();

        String newText = "«Номер кредитной карты <4008 1234 5678> 8912»";
        System.out.println(newText);
        String safe = parser.searchAndReplaceDiamonds(newText, "<>");
        System.out.println(safe);
    }
}