package action.chain;

/**
 * Created by chy on 18/9/16.
 * 责任链 模式
 *http://www.cnblogs.com/java-my-life/archive/2012/05/28/2516865.html
 *
 */
public class Test {

    public static void main(String[] args) {

        AbstractHandler handler1 = new Handler1();
        AbstractHandler handler2 = new Handler2();
        //先设置好 处理顺序
        handler1.setNextHandler(handler2);
        // 统一由第一个处理这作为入口 具体有哪个handler 处理 要看 每个handler 处理的条件
        handler1.handleRequest(33);
        handler1.handleRequest(100);
        handler1.handleRequest(111);

    }


}
