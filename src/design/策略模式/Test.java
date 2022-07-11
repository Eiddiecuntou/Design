package design.策略模式;

/**
 * @ClassName : Test  //类名
 * @Description :   //描述
 * @Author : 村头 //作者
 * @Date: 2022/7/11  14:43
 */

public class Test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setOperation(new OperationAdd());
        int result = calculator.doOperation(1, 2);
        System.out.println(result);
        calculator.setOperation(new OperationSub());
        System.out.println(calculator.doOperation(1,2));

    }
}
