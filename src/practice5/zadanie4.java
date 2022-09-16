package practice5;
import java.lang.*;
/*
Даны натуральные числа k и s.
Определите, сколько существует k-значных натуральных чисел, сумма цифр которых равна d.
Запись натурального числа не может начинаться с цифры 0.
*/

public class zadanie4 {
    public static int recur(int len, int sum, int k, int s) {
        if (len == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c = (len == 0 ? 1 : 0);
        int res = 0;
        for (int i = c; i < 10; i++) {
            res += recur(len + 1, sum + i, k, s);
        }
        return res;
    }
    public static void main(String[] args){
        System.out.println(recur(0,0,3,3));
    }
}
