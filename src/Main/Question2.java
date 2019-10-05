package Main;

public class Question2 {

}
class Ques2{
private String str;
private int index;
    public Ques2(String str) {
        this.str = str;
    }
    public String getStr() {
        return str;
    }
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public void setStr(String str) {
        this.str = str;
    }
    public String stringSubstring(){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<getStr().length();i++){
            sb.append(getStr().substring(getIndex()));
        }
        return sb.toString();
    }
}