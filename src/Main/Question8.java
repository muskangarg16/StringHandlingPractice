package Main;
import java.util.Scanner;
public class Question8 {
    public static void main(String[] args) {

    }
}
class Ques8 {
    private String str;
    private char chr;

    public Ques8(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public char getChr() {
        return chr;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void setChr() {
        this.chr = chr;
    }

    public int UpperWeight() {
        int s = 0;
        for (int i = 0; i < getStr().length(); i++) {
            if (getStr().charAt(i) >= 'A' && getStr().charAt(i) <= 'Z') {
                s = s + (int) getStr().charAt(i);
            }
        }
        return s;
    }
}


