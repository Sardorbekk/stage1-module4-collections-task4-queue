package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> integerList=new LinkedList<>();

        for (int i=1;i<=numberOfDishes;i++){
            if (i==everyDishNumberToEat){
             integerList.add(0,i);
            }
            else integerList.add(i);

        }

        System.out.println(numberOfDishes+"   "+everyDishNumberToEat);

        return integerList;

    }
}
