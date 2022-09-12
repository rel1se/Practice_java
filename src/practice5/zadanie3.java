package practice5;
import java.lang.*;

public class zadanie3 {
    public static String recur(int a, int b){
        if (a<b) {
            if (a == b) {
                return Integer.toString(a);
            }

            return a + " " + recur((a + 1), b);
        }
        else{

            if (a > b) {
                if (a == b) {
                    return Integer.toString(a);
                }
                return a + " " + recur(a - 1, b);
            }
        }
        return Integer.toString(a);
    }
    public static void main(String[] args){
        System.out.println(recur(1,8));
        System.out.println(recur(8,1));
    }
}
