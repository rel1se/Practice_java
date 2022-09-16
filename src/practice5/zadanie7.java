package practice5;
/*Дано натуральное число n>1.
Выведите все простые множители этого числа в порядке не убывания с учетом кратности.
Алгоритм должен иметь сложность O(logn)
 */
public class zadanie7 {
    public static void recur(int n, int k) {
        if (k > n / 2) {
            System.out.println(n);
            return;
        }
        if (n % k == 0) {
            System.out.println(k);
            recur(n / k, k);
        }
        else {
            recur(n, ++k);
        }
    }
    public static void main(String[] args){
        recur(30,2);
    }
}
