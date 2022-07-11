package design.代理模式;

import java.sql.SQLOutput;

/**
 * @ClassName : PhoneProxy  //类名
 * @Description :   //描述
 * @Author : 村头 //作者
 * @Date: 2022/7/11  16:50
 */

public class PhoneProxy {
    private Phone phone;

    public PhoneProxy (Phone phone) {
        this.phone = phone;
    }

    public void sale() {
        System.out.println("代理模式");
        this.phone.sale();
    }
}
