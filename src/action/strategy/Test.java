package action.strategy;

/**
 * Created by chy on 18/9/21.
 * 策略模式
 * 每种策略是平等 在做平台服务的时候会经常用到
 * 在 context 中做 相同的操作 而在 action.strategy 中 做各自的处理
 * 和状态模式 类似？
 */
public class Test {

    public static void main(String[] args) {

        Context context = new Context(new StrategyA());
        context.execute();

    }


}
