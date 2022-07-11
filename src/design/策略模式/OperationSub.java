package design.策略模式;

/**
 * @ClassName : OperationSub  //类名
 * @Description :   //描述
 * @Author : 村头 //作者
 * @Date: 2022/7/11  14:39
 */

public class OperationSub implements Operation {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
