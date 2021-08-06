/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-08-06 16:02
 */
/**
 * 定义一个Circle类，包含一个daouble型的radius属性代表圆的面积
 * 一个findArea()方法返回元的面积
 * */
public class Circle {
    double radius;
    public double findArea(){
        return  Math.PI*radius*radius;
    }
}
