package design.观察者模式;

/**
 * @ClassName : Test  //类名
 * @Description :   //描述
 * @Author : 村头 //作者
 * @Date: 2022/7/11  15:08
 */

public class Test {
    public static void main(String[] args) {
        NewsOffice newsOffice = new NewsOffice();
        Customer customerA = new CustomerA();
        Customer customerB = new CustomerB();
        newsOffice.addCustomer(customerA);
        newsOffice.addCustomer(customerB);
        newsOffice.newspaper();
    }
}
