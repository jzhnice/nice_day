/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-08-05 15:54
 */

/**
 *
 * 方法的形参的传递机制：值传递
 *
 * 1.形参：方法定义时，声明的小括号内的参数
 *   实参：方法调用时，实际传递给形参的数据
 *
 * 2.值传递机制：
 *   如果变量时基本数据类型，此时实参赋给形参的时实参真是存储的数据值
 *
 *   如果变量是引用数据类型，此时实参赋给形参的是实参存储数据的地址值
 * */
public class ValueTransferTest1 {

    public static void main(String[] args) {

        int m = 10;
        int n = 20;
        System.out.println("m=" + m+",n=" +n);

        // 交换两个变量的值的操作
//        int temp = m;
//        m = n;
//        n = temp;
        ValueTransferTest1 test = new ValueTransferTest1();
        test.msd(m,n);

        System.out.println("m=" + m+",n=" +n);

    }
    public void msd(int m,int n){
        int temp = m;
        m = n;
        n = temp;
        System.out.println("m=" + m+",n=" +n);

    }
}
