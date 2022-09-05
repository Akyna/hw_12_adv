package com.amboiko;

import com.amboiko.annotation.ContainsBones;
import com.amboiko.annotation.Expired;
import com.amboiko.annotation.Frozen;
import com.amboiko.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> productionRestrictInterfaceList = new ArrayList<>() {{
            add(Expired.class.getSimpleName());
            add(Frozen.class.getSimpleName());
            add(ContainsBones.class.getSimpleName());
        }};

        MincedMeatFactory factory = new MincedMeatFactory(productionRestrictInterfaceList);

        Meat[] data = new Meat[]{
                new ChickenMeat(),
                new CowMeat(),
                new DuckMeat(),
                new GooseMeat(),
                new HorseMeat(),
                new PorkMeat(),
                new SalmonMeat(),
                new TunaMeat(),
                new VealMeat(),
                new WildfowlMeat()
        };

        factory.prepareMinced(data);
        factory.doMinced();
    }
}
