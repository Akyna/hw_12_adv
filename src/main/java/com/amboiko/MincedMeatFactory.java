package com.amboiko;

import com.amboiko.annotation.MeatSort;
import com.amboiko.common.Logger;
import com.amboiko.model.Meat;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

public class MincedMeatFactory {
    private final List<Meat> forMinced = new ArrayList<>();
    private final List<String> productionRestrictInterfaceList;

    public MincedMeatFactory(List<String> productionRestrictInterfaceList) {
        this.productionRestrictInterfaceList = productionRestrictInterfaceList;
    }

    public void prepareMinced(final Meat[] data) {
        Logger.coloredInfo("-----------------");
        Logger.coloredInfo("Start the process");
        Logger.coloredInfo("-----------------");

        for (Meat meat : data) {
            Logger.info("Received meat: " + meat.getClass().getSimpleName());
        }

        for (Meat meat : data) {
            if (isNotMeetProductionRequirements(meat) || isNotASuitableSort(meat) || isHasAdditionalMethods(meat)) {
                continue;
            }

            forMinced.add(meat);
        }
    }

    private boolean isNotMeetProductionRequirements(final Meat meat) {
        Annotation[] list = meat.getClass().getDeclaredAnnotations();
        for (Annotation annotation : list) {
            if (productionRestrictInterfaceList.contains(annotation.annotationType().getSimpleName())) {
                return true;
            }
        }
        return false;
    }

    private boolean isNotASuitableSort(final Meat meat) {
        MeatSort meatSort;
        if ((meatSort = meat.getClass().getAnnotation(MeatSort.class)) != null) {
            switch (meatSort.sort()) {
                case PREMIUM:
                    return true;
                case REGULAR:
                case LOW:
                    return false;
            }
        }
        return false;
    }

    private boolean isHasAdditionalMethods(final Meat meat) {
        return meat.getClass().getDeclaredMethods().length > 3;
    }

    public void doMinced() {
        Logger.coloredInfo("--------------------------------");
        Logger.coloredInfo("Total list for minced production");
        Logger.coloredInfo("--------------------------------");

        for (Meat meat : forMinced) {
            Logger.info("Meat: " + meat.getClass().getSimpleName());
        }
    }
}
