package design.单例模式;

/**
 * @ClassName : Single  //类名
 * @Description :   //描述
 * @Author : 村头 //作者
 * @Date: 2022/7/11  14:23
 */

public class Single {
    private Single() {
        System.out.println("创建一个single对象");
    }

    //唯一的可以获取实例的地方
    private volatile static Single instance;

    public static Single getInstance() {
        if(instance == null) {
            synchronized (Single.class) {
                if (instance == null) {
                    instance = new Single();
                }
            }
        }
        return instance;
    }

}
