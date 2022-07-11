package design.外观模式;

/**
 * @ClassName : StartBtn  //类名
 * @Description :   //描述
 * @Author : 村头 //作者
 * @Date: 2022/7/11  19:29
 */

public class StartBtn {
    public void start() {
        new CPU().start();
        new Disk().start();
        new Memory().start();
    }
}
