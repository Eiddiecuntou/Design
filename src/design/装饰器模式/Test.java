package design.装饰器模式;

/**
 * @ClassName : Test  //类名
 * @Description :   //描述
 * @Author : 村头 //作者
 * @Date: 2022/7/11  19:55
 */

public class Test {
    public static void main(String[] args) {
        Cloth person = new Person();
        person = new Jacket(person);
        person = new Hat(person);
        person.show();
        System.out.println("总消费：" + person.cost());
    }
}
