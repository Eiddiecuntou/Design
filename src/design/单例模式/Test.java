package design.单例模式;

/**
 * @ClassName : Test  //类名
 * @Description :   //描述
 * @Author : 村头 //作者
 * @Date: 2022/7/11  14:29
 */

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                Single single = Single.getInstance();
            }).start();
        }
    }
}
