/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-08-03 09:40
 */
/**、
 * 可变个数的形参的方法
 *
 *  1.jdk 5.0新增的内容
 *  2.具体使用：
 *      2.1 可变个数形参的格式：数据类型 ...变量名
 *      2.2 当带哦用可变个数形参的方法是，传入的参数个数，可以是0个 1个 或者是多个
 *      2.3 可变个数形参的方法与本类中方法名相同，形参不同的方法之间构成重载
 *      2.4 可变个数形参的方法与本类中方法名相同，形参类型也相同的数组之间不构成充重载 换句话说。两者不能共存
 *      3.5 可变个数形参在方法的形参中 必须声明在末尾
 *      2.6 柯柏年个数形参在方法的形参中，做好只能声明一次
**/
public class MathodArgsTest {

    public static void main(String[] args) {



        char[] arr1 = new char[10];
        System.out.println(arr1);
        System.out.println(arr1[1]);


        MathodArgsTest test = new MathodArgsTest();
        test.show(12);
        test.show("sdsda");
        test.show("dsafs","saaf");

    }
    public void show(int i) {

    }

    public void show(String i) {

    }

    public void show(String ... i) {

    }
//    public void show(String ... aee,int i){
//
//    }
}
