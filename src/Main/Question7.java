package Main;

public class Question7 {
}
class Ques7{
    private String str;
    Ques7(String str){
    this.str=str;
    }
    public String getStr() {
        return str;
    }
    public void setStr(String str) {
        this.str = str;
    }
    public int totweight(){
        int a=0;
        for(int i=0;i<getStr().length();i++){
            a=a+(int)s.charAt(i);
        }
        return a;
    }
}