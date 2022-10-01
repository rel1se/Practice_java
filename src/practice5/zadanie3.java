package practice5;
import java.lang.*;
/* Даны два целых числа A и В (каждое в отдельной строке).
Выведите все числа от A до B включительно, в порядке возрастания,
если A < B, или в порядке убывания в противном случае.
*/
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
