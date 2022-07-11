package design.工厂模式;

import design.策略模式.Calculator;

/**
 * @ClassName : Tets  //类名
 * @Description :   //描述
 * @Author : 村头 //作者
 * @Date: 2022/7/11  16:25
 */

public class Test {
    public static void main(String[] args) {
        Car car = CarFactory.getCar(1);
        System.out.println(car);
    }
}
