package struct.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chy on 18/9/24.
 */
public class FlyWeightFactory {

    public static final FlyWeightFactory instance = new FlyWeightFactory();

    Map<String, IFlyWeight> map = new HashMap<>();

    public IFlyWeight flyWeight(String state){
        if(!map.containsKey(state)){
            IFlyWeight flyWeight = new FlyWeight(state);
            map.put(state, flyWeight);
        }
        return map.get(state);
    }

}
