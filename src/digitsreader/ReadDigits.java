package digitsreader;

public class ReadDigits {
    final static int ArrayHeight = 2000;
    final static int ArrayLenght = 27;

    public static void main(String[] args) {

        char[][] CharArrayToRead;
        CharArrayToRead = new char[ArrayLenght][ArrayHeight];

        GraphicDigits accountList = new GraphicDigits(CharArrayToRead, ArrayLenght, ArrayHeight);
        accountList.readFromFile();
        accountList.searchForDigits();
        accountList.printReport();
    }
}