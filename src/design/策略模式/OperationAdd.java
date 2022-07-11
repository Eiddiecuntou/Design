package design.策略模式;

import java.util.Objects;

/**
 * @ClassName : OperationAdd  //类名
 * @Description :   //描述
 * @Author : 村头 //作者
 * @Date: 2022/7/11  14:38
 */

public class OperationAdd  implements Operation {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
