package Main;

public class Question11 {
    public static void main(String[] args) {

    }
}
class Ques11{
private String str;
private char chr;
    public String getStr(){
    return str;
}
    public char getChr(){
    return chr;
    }
    public void setStr(String str){
    this.str=str;
    }
    public void setChr(){
    this.chr=chr;
    }
    public String ind(){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<=getStr().length();i++){
            if(getStr().charAt(i)==getChr()){
                sb.append(i+"\n");
            }
        }
        return sb.toString();
    }
}