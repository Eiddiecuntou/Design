package design.策略模式;

/**
 * @ClassName : Calculator  //类名
 * @Description :   //描述
 * @Author : 村头 //作者
 * @Date: 2022/7/11  14:40
 */

public class Calculator {
    private Operation operation;

    public Operation getOperation(OperationAdd operationAdd) {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    int doOperation(int num1, int num2) {
        return this.operation.doOperation(num1,num2);
    }

}
