package design.观察者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName : NewsOffice  //类名
 * @Description :   //描述
 * @Author : 村头 //作者
 * @Date: 2022/7/11  14:55
 */

public class NewsOffice {

    private List<Customer> customers = new ArrayList<>();

    public void addCustomer (Customer customer) {
        this.customers.add(customer);
    }

    public void newspaper () {
        notifyAllCustomers();
    }

    public void notifyAllCustomers() {
        for (Customer customer : customers) {
            customer.update();
        }
    }
}
