package create.builder;

import create.builder.builder.WelcomeBuilder;

/**
 * Created by chy on 18/9/12.
 */
public class Test {

    public static void main(String[] args) {

        Builder builder = new WelcomeBuilder();
        Director director = new Director(builder);
        director.construct("toAddress@126.com", "fromAddress@126.com");

    }

}
