public class Letters {
    public void printLetters(){
        for(int i = 65; i < 91; i++){
            System.out.println("Код символа : " + i + "\tСимвол : " + (char)i);
        }
        for(int i = 97; i < 123; i++){
            System.out.println("Код символа : " + i + "\tСимвол : " + (char)i);
        }
    }
}
