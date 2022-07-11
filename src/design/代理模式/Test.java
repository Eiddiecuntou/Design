package design.代理模式;

/**
 * @ClassName : Test  //类名
 * @Description :   //描述
 * @Author : 村头 //作者
 * @Date: 2022/7/11  18:46
 */

public class Test {
    public static void main(String[] args) {
        Phone phone = new iPhone();
        PhoneProxy proxy = new PhoneProxy(phone);
        proxy.sale();
    }
}
