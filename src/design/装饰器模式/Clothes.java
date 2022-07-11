package design.装饰器模式;

/**
 * @ClassName : Clothes  //类名
 * @Description :   //描述
 * @Author : 村头 //作者
 * @Date: 2022/7/11  19:50
 */

public  abstract class Clothes implements Cloth {
    protected Cloth cloth;

    public Clothes(Cloth cloth) {
        this.cloth = cloth;
    }
}
