package design.装饰器模式;

/**
 * @ClassName : Person  //类名
 * @Description :   //描述
 * @Author : 村头 //作者
 * @Date: 2022/7/11  19:54
 */

public class Person implements Cloth {
    @Override
    public Double cost() {
        return 0.0;
    }

    @Override
    public void show() {
        System.out.println("什么都没有买");

    }
}
