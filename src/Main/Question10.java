package Main;
import java.util.*;
public class Question10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char ch=in.next().charAt(0);
        Ques10 obj = new Ques10(str);
        System.out.println(obj.stringInd(ch));
    }

}
class Ques10{
    private String str;
    public Ques10(String str){
        this.str=str;
    }
    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
public int stringInd(char ch){
        int j=0;
        for(int i=0;i<getStr().length();i++){
            if(getStr().charAt(i)==ch){
                j=i;
                break;
            }
        }
        return j;
}
}