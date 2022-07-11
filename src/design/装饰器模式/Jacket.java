package design.装饰器模式;

/**
 * @ClassName : Jacket  //类名
 * @Description :   //描述
 * @Author : 村头 //作者
 * @Date: 2022/7/11  19:53
 */

public class Jacket extends Clothes {
    public Jacket(Cloth cloth) {
        super(cloth);
    }

    @Override
    public Double cost() {
        return this.cloth.cost() + 200;
    }

    @Override
    public void show() {
        this.cloth.show();
        System.out.println("穿上衣服，累计消费" + this.cost());
    }
}
