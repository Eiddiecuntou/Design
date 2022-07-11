package design.外观模式;

/**
 * @ClassName : Test  //类名
 * @Description :   //描述
 * @Author : 村头 //作者
 * @Date: 2022/7/11  19:32
 */

//对外统一接口
public class Test {
    public static void main(String[] args) {
        StartBtn startBtn = new StartBtn();
        startBtn.start();
    }

}
