package main.java.com.lkk.builder.type;

/**
 * @ClassName combo 套餐类型
 * @Description //TODO
 * @Author lkk
 * Date 2022/05/19/14:35
 * @Version 1.0
 **/
public class Combo {

    /**
     * 水果
     */
    private String food;
    /**
     * 饮料
     */
    private String drink;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "Combo{" +
                "food='" + food + '\'' +
                ", drink='" + drink + '\'' +
                '}';
    }
}
