
public class Loader
{
    public static void main(String[] args)
    {
        Letters letters = new Letters();
        letters.printLetters();

        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        System.out.println(text);
        Sumator sumator = new Sumator(); // задание 1
        sumator.count(text);

        SimpleParser parser = new SimpleParser(); // задание 3
        parser.start();

        String newText = "«Номер кредитной карты <4008 1234 5678> 8912»";
        System.out.println(newText);
        String safe = parser.searchAndReplaceDiamonds(newText, "***");// дополнительное задание
        System.out.println(safe);

        String alotOfText = "New York (CNN Business)Microsoft is rolling out its newest operating system, Windows 11, earlier than expected for some PC users.\n" +
                "Starting October 5, the company will begin a \"phased and measured\" approach to the free upgrades, in which newer devices will be given priority over older equipment. Microsoft had previously said it expected to release Windows 11 next year.\n" +
                "All eligible users will receive the free upgrade by mid-2022.\n" +
                "\n" +
                "The new software features visual improvements, Microsoft Teams integration and a new Microsoft store, among other changes that were announced in June.\n" +
                "\n" +
                "Perhaps one of the biggest changes Windows 11 will bring is a Start menu and new Start button that's centered on the taskbar. The menu opens a window with pinned apps, \"recommended\" recently opened documents and a search bar.\n" +
                "Microsoft (MSFT) Teams will also be directly integrated into Windows 11 and will have its own icon on the taskbar. For gamers, the new operating system will bring an \"Auto HDR\" feature that will automatically improve the color and lighting of game displays, technology first introduced in Microsoft's Xbox consoles.\n" +
                "The Windows 11 launch comes six years after Microsoft last overhauled its operating system with Windows 10, a major upgrade that's now running on roughly 1.3 billion devices worldwide, according to CCS Insight. Compared to the substantial change from Windows 8 to Windows 10, Windows 11 isn't a \"revolutionary step,\" CCS CEO Geoff Blaber said.\n" +
                "\n" +
                "\"Windows 11 is an iterative release,\" Blaber said. \"Microsoft is making adjustments to areas that have potential to move the needle on user experience, engagement and the ever-expanding reach of Office 365 apps.\"\n" +
                "--CNN Business' Clare Duffy contributed to this report.";
        WorkingWithText task2 = new WorkingWithText(); // задание 2
        task2.start(alotOfText);

        CheckingTheNumber checkingTheNumber = new CheckingTheNumber();// задание 4
        checkingTheNumber.start();
    }
}