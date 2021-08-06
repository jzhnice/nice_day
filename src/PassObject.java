/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-08-06 16:05
 */
/**
 *
 * 定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义如下：
 *  public void printAreas(Circle c, int time)
 * 在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。
 * 例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。
 *
 * 在main方法中调用printAreas()方法，调
 * 用完毕后输出当前半径值。程序运行结果如图
 * 所示。
 * */
public class PassObject {

    public static void main(String[] args) {
        PassObject test = new PassObject();
        Circle c = new Circle();
        test.printAreas(c,5);
        System.out.println("now radius is " + c.radius);
    }

    public void printAreas(Circle c,int time){
        System.out.println("Radius\t\tArea");

        for (int i = 1; i <= time; i++) {
            c.radius = i;

            System.out.println(c.radius + "\t\t" +c.findArea());
        }
        c.radius = time+1;
    }
}
