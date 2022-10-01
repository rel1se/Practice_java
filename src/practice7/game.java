package practice7;
import java.util.Stack;
public class game {
    Stack<Integer> firstP, secondP;
    public game(String firstP, String secondP) {
        this.firstP = new Stack<>();
        this.secondP = new Stack<>();
        for(int i = 4; i >= 0; i--){
            this.firstP.push(Integer.parseInt(firstP.substring(i, i+1)));
            this.secondP.push(Integer.parseInt(secondP.substring(i, i+1)));
        }
    }
    private void pushBack(Stack<Integer> s, Integer item){
        Stack<Integer> news = new Stack<>();
        while (!s.isEmpty())
            news.push(s.pop());
        s.push(item);
        while (!news.isEmpty())
            s.push(news.pop());
    }
    public String play(){
        int count = 0;
        while(!firstP.isEmpty() && !secondP.isEmpty() && count <= 106){
            if(firstP.peek() > secondP.peek() && secondP.peek() != 0){
                pushBack(firstP, firstP.pop());
                pushBack(firstP, secondP.pop());
            }else{
                pushBack(secondP, firstP.pop());
                pushBack(secondP, secondP.pop());
            }
            count++;
        }
        String res = "";
        if(firstP.isEmpty()) res += "second ";
        else res += "first ";
        res += count;
        if(count >= 106) res += " botva";
        return res;
    }
    public static void main(String[] args) {
        System.out.println(new game("13579", "24680").play());
        System.out.println(new game("12345", "67890").play());
    }
}
