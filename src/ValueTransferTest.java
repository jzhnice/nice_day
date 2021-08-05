/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-08-05 15:35
 */
/**
 *
 * 关于变量的赋值
 *
 *  如果变量是基本数据类型，此时赋值的是变量所保存的数据值
 *  如果变量是引用数据类型，此时赋值的是变量所保存的数据的地址值
 * */
public class ValueTransferTest {

    public static  void main(String[] args) {

        System.out.println("**********基本数据类型*********");
        int m = 10;
        int n = m;
        System.out.println("m=" + m+",n="+n);

        n = 20;
        System.out.println("m=" + m+",n="+n);


        System.out.println("****************引用数据类型***********");


        Asdf sd = new Asdf();
            sd.sds = 1001;

        Asdf   sd1 = sd;// 赋值之后，sd1和sds的地址值相同都指向了对空间中同一个对象实体
        System.out.println("sds="+sd.sds+"sd1="+sd1.sds);

        sd1.sds = 2000;
        System.out.println("sds="+sd.sds+"sd1="+sd1.sds);


    }

}
class Asdf {
    int sds;
}

