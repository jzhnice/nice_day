/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-08-06 16:21
 */
/**
 * 递归方法
 * 递归方法：一个方法体内调用它自身。
 * 方法递归包含了一种隐式的循环，它会重复执行某段代码，但这种重复执
 * 行无须循环控制。
 * 递归一定要向已知方向递归，否则这种递归就变成了无穷递归，类似于死
 * 循环。
 * */
public class recursionTest {

    public static void main(String[] args) {
        //计算1-100之间所有自然数的和
        // 方式一
        int sum=0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
        //方式二
        recursionTest test = new recursionTest();
        int asdf=test.sum(100);
        System.out.println(asdf);

        System.out.println(test.f(10));

    }
    public int sum( int sum) {  // 也是sum的阶乘 sum!
        if (sum == 1) {
            return 1;
        }else {
            return sum+sum(sum-1);
        }

    }

    // 练习7.3：已知一个数列：f(20) = 1,f(21) = 4,f(n+2) = 2*f(n+1)+f(n),
    //其中n是大于0的整数，求f(10)的值。

    public int f(int n){
        if (n == 0) {
            return 1;
        }else if (n == 1) {
            return 4;
        }else {
            return 2*f(n-1)+ f(n-2);
        }
    }

}
