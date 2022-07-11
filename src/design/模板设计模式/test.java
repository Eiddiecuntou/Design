package design.模板设计模式;

/**
 * @ClassName : test  //类名
 * @Description :   //描述
 * @Author : 村头 //作者
 * @Date: 2022/7/11  19:46
 */

public class test {
    public static void main(String[] args) {
        Cook cook = new CookTomatoes();
        cook.doCook();
        Cook cook1 = new CookPotato();
        cook1.doCook();
    }
}
