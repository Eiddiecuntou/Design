package design.装饰器模式;

/**
 * @ClassName : Hat  //类名
 * @Description :   //描述
 * @Author : 村头 //作者
 * @Date: 2022/7/11  19:51
 */

public class Hat extends Clothes {
    public Hat(Cloth cloth) {
        super(cloth);
    }

    @Override
    public Double cost() {
        return this.cloth.cost() + 100;
    }

    @Override
    public void show() {
        this.cloth.show();
        System.out.println("戴上帽子，累计消费" + this.cost());
    }
}
