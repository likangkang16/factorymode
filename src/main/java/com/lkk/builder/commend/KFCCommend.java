package main.java.com.lkk.builder.commend;

import main.java.com.lkk.builder.abstracts.MealBuilder;
import main.java.com.lkk.builder.type.Combo;

/**
 * @ClassName KFCCommend
 * @Description //TODO
 * @Author lkk
 * Date 2022/05/19/14:53
 * @Version 1.0
 **/
public class KFCCommend {

    /**
     * 定义一个套餐构造器
     */
    private MealBuilder mealBuilder;

    public void setMealBuilder(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    /**
     * 获取套餐内容
     * @return
     */
    public Combo getComboType(String a,String b){
        mealBuilder.foodBuilder(a);
        mealBuilder.drinkBuilder(b);
        Combo combo = mealBuilder.getCombo();
        return combo;
    }
}
