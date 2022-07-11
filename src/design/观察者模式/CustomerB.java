package design.观察者模式;

/**
 * @ClassName : CustomerB  //类名
 * @Description :   //描述
 * @Author : 村头 //作者
 * @Date: 2022/7/11  14:54
 */

public class CustomerB extends Customer{
    @Override
    public void update() {
        System.out.println("客户B,收到了报纸");
    }
}
