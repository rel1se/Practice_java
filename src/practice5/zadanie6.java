package practice5;
import java.lang.*;
/*
Дано натуральное число n>1.
Проверьте, является ли оно простым.
Программа должна вывести слово YES, если число простое и NO, если число составное.
Алгоритм должен иметь сложность O(logn).
*/
public class zadanie6 {
    public static int recur(int n,int i){
        if (n == 2) {
            return 1;
        }
        else if (n % i == 0) {
            return 0;
        }
        else if (i < n / 2) {
            return recur(n, i + 1);
        }
        else {
            return 1;
        }
    }
    public static void main(String[] args){
        if (recur(17,2) == 1){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
