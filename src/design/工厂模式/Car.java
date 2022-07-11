package design.工厂模式;

/**
 * @ClassName : Car  //类名
 * @Description :   //描述
 * @Author : 村头 //作者
 * @Date: 2022/7/11  16:11
 */

public class Car {
    private Integer id;
    private String brand;

    public Car(Integer id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                '}';
    }
}
