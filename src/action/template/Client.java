package action.template;

/**
 * Created by chy on 18/9/22.
 *  模板方法模式
 *
 *  多件事情遵循相同的流程 同时在某些节点又有不同时使用
 *
 *
 */
public class Client {

    public static void main(String[] args) {

        AbstractTemplate template = new TemplateA();

        template.entry();

    }


}
