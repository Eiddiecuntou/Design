package design.工厂模式;

import sun.usagetracker.UsageTrackerClient;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName : CarFactory  //类名
 * @Description :   //描述
 * @Author : 村头 //作者
 * @Date: 2022/7/11  16:17
 */

public class CarFactory {
    private static Map<Integer,Car> carMap;

    static {
        carMap = new HashMap<>();
        carMap.put(1,new Car(1,"宝马"));
        carMap.put(2,new Car(2,"奔驰"));
    }

    public static Car getCar (Integer id) {
        return carMap.get(id);
    }

}
