package practice5;
import java.lang.*;
public class zadanie5 {
    public static int recur(int n) {
        if (n < 10) return n;
        else return n % 10 + recur(n / 10);
    }
    public static void main(String[] args) {
        System.out.println(recur(999)); // вызов рекурсивной функции
    }
}
