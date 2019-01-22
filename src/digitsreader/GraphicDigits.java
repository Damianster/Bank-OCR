package digitsreader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GraphicDigits {
    public char[][] charArray;
    public int lenght;
    public int height;
    public String[] foundDigits;
    public int lineCounter;


    public GraphicDigits(char[][] _charArray, int _lenght, int _height) {
        this.charArray = _charArray;
        this.lenght = _lenght;
        this.height = _height;
        this.foundDigits = new String[height/4];
        this.lineCounter = 0;
    }

    public void readFromFile(){
        int y = 0;
        try {
            Scanner scanner = new Scanner(new File("/Users/bieły/IdeaProjects/Digits_1/sample.txt"));
            while (scanner.hasNextLine()) {
                String temp = scanner.nextLine();
                for (int x = 0; x < temp.length(); x++){
                    charArray[x][y] = temp.charAt(x);
                }
                y++;
            }
            height = y;
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void searchForDigits() {
        for (int h = 0; h < height; h += 4) {
            String inLineDigit;
            inLineDigit = new String();
            for (int l = 0; l < 25; l += 3) {
                if ((charArray[l][h] == ' ') && (charArray[l + 1][h] == '_') && (charArray[l + 2][h] == ' ') &&
                        (charArray[l][h + 1] == '|') && (charArray[l + 1][h + 1] == ' ') && (charArray[l + 2][h + 1] == '|') &&
                        (charArray[l][h + 2] == '|') && (charArray[l + 1][h + 2] == '_') && (charArray[l + 2][h + 2] == '|'))
                    inLineDigit += "0";
                else if ((charArray[l][h] == ' ') && (charArray[l + 1][h] == ' ') && (charArray[l + 2][h] == ' ') &&
                        (charArray[l][h + 1] == ' ') && (charArray[l + 1][h + 1] == ' ') && (charArray[l + 2][h + 1] == '|') &&
                        (charArray[l][h + 2] == ' ') && (charArray[l + 1][h + 2] == ' ') && (charArray[l + 2][h + 2] == '|'))
                    inLineDigit += "1";
                else if ((charArray[l][h] == ' ') && (charArray[l + 1][h] == '_') && (charArray[l + 2][h] == ' ') &&
                        (charArray[l][h + 1] == ' ') && (charArray[l + 1][h + 1] == '_') && (charArray[l + 2][h + 1] == '|') &&
                        (charArray[l][h + 2] == '|') && (charArray[l + 1][h + 2] == '_') && (charArray[l + 2][h + 2] == ' '))
                    inLineDigit += "2";
                else if ((charArray[l][h] == ' ') && (charArray[l + 1][h] == '_') && (charArray[l + 2][h] == ' ') &&
                        (charArray[l][h + 1] == ' ') && (charArray[l + 1][h + 1] == '_') && (charArray[l + 2][h + 1] == '|') &&
                        (charArray[l][h + 2] == ' ') && (charArray[l + 1][h + 2] == '_') && (charArray[l + 2][h + 2] == '|'))
                    inLineDigit += "3";
                else if ((charArray[l][h] == ' ') && (charArray[l + 1][h] == ' ') && (charArray[l + 2][h] == ' ') &&
                        (charArray[l][h + 1] == '|') && (charArray[l + 1][h + 1] == '_') && (charArray[l + 2][h + 1] == '|') &&
                        (charArray[l][h + 2] == ' ') && (charArray[l + 1][h + 2] == ' ') && (charArray[l + 2][h + 2] == '|'))
                    inLineDigit += "4";
                else if ((charArray[l][h] == ' ') && (charArray[l + 1][h] == '_') && (charArray[l + 2][h] == ' ') &&
                        (charArray[l][h + 1] == '|') && (charArray[l + 1][h + 1] == '_') && (charArray[l + 2][h + 1] == ' ') &&
                        (charArray[l][h + 2] == ' ') && (charArray[l + 1][h + 2] == '_') && (charArray[l + 2][h + 2] == '|'))
                    inLineDigit += "5";
                else if ((charArray[l][h] == ' ') && (charArray[l + 1][h] == '_') && (charArray[l + 2][h] == ' ') &&
                        (charArray[l][h + 1] == '|') && (charArray[l + 1][h + 1] == '_') && (charArray[l + 2][h + 1] == ' ') &&
                        (charArray[l][h + 2] == '|') && (charArray[l + 1][h + 2] == '_') && (charArray[l + 2][h + 2] == '|'))
                    inLineDigit += "6";
                else if ((charArray[l][h] == ' ') && (charArray[l + 1][h] == '_') && (charArray[l + 2][h] == ' ') &&
                        (charArray[l][h + 1] == ' ') && (charArray[l + 1][h + 1] == ' ') && (charArray[l + 2][h + 1] == '|') &&
                        (charArray[l][h + 2] == ' ') && (charArray[l + 1][h + 2] == ' ') && (charArray[l + 2][h + 2] == '|'))
                    inLineDigit += "7";
                else if ((charArray[l][h] == ' ') && (charArray[l + 1][h] == '_') && (charArray[l + 2][h] == ' ') &&
                        (charArray[l][h + 1] == '|') && (charArray[l + 1][h + 1] == '_') && (charArray[l + 2][h + 1] == '|') &&
                        (charArray[l][h + 2] == '|') && (charArray[l + 1][h + 2] == '_') && (charArray[l + 2][h + 2] == '|'))
                    inLineDigit += "8";
                else if ((charArray[l][h] == ' ') && (charArray[l + 1][h] == '_') && (charArray[l + 2][h] == ' ') &&
                        (charArray[l][h + 1] == '|') && (charArray[l + 1][h + 1] == '_') && (charArray[l + 2][h + 1] == '|') &&
                        (charArray[l][h + 2] == ' ') && (charArray[l + 1][h + 2] == '_') && (charArray[l + 2][h + 2] == '|'))
                    inLineDigit += "9";
                else inLineDigit += "?";
            }
            if(inLineDigit != null)
                foundDigits[h/4] = inLineDigit;

            lineCounter++;
        }
    }

    public void printReport(){

        File file = new File("/Users/bieły/IdeaProjects/Digits_1/sample_out.txt");
        try  {
            FileWriter fr = new FileWriter(file,false);
            fr.write("");
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < lineCounter; i++) {
            System.out.println(foundDigits[i]);
            try {
                FileWriter fr = new FileWriter(file, true);
                fr.write(foundDigits[i]);
                if (foundDigits[i].contains("?")) {
                    fr.write("\tILL");
                    System.out.print("\tILL");
                }
                else if (!checkSum(foundDigits[i])){
                    fr.write("\tERR");
                    System.out.print("\tERR");
                }
                fr.write("\n");
                System.out.println();
                fr.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
     }

    public boolean checkSum(String string){
        int suma = 0;
        for (int i = 1; i <= string.length(); i++){
            suma+= ((int) (string.charAt(string.length() - i)) - 48 ) * i;
        }
        if (suma % 11 == 0) return true;
        else return false;
    }
}