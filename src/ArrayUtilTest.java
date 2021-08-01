import java.util.ArrayList;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-08-01 22:06
 */
public class ArrayUtilTest {
    public static void main(String[] args) {

        ArrayUtil ut = new ArrayUtil();
        int [] arr = new int[] {32,34,32,5,3,54,654,-98,0,-53,5};
        int max =  ut.getMax(arr);
        System.out.println("最大值为：" +max);

        System.out.println("排序前");
        ut.print(arr);
        ut.sort(arr);
        System.out.println();
        System.out.println("排序后");
        ut.print(arr);

        System.out.println("查找");
        int some =ut.getIndex(arr,5);
        if (some > 0){
            System.out.println("找到了");
        }else {
            System.out.println("没有找到");
        }

    }
}
