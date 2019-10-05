package Main;

public class Question10 {

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