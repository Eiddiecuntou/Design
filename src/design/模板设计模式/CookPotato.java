package design.模板设计模式;

import design.工厂模式.CarFactory;

/**
 * @ClassName : CookPotato  //类名
 * @Description :   //描述
 * @Author : 村头 //作者
 * @Date: 2022/7/11  19:44
 */

public class CookPotato extends Cook {

    @Override
    public void doCook() {
        System.out.println("炒土豆丝");
    }
}
