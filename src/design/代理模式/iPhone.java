package design.代理模式;

import java.util.regex.Pattern;

/**
 * @ClassName : iPhone  //类名
 * @Description :   //描述
 * @Author : 村头 //作者
 * @Date: 2022/7/11  16:48
 */

public class iPhone implements Phone {

    @Override
    public void sale() {
        System.out.println("卖iphone手机");
    }
}
