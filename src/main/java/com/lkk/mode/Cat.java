package main.java.com.lkk.mode;

/**
 * @ClassName Cat
 * @Description //TODO
 * @Author lkk
 * Date 2022/05/18/15:02
 * @Version 1.0
 **/
public class Cat {

    public Cat(){};

    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Cat(String name){
        this.name=name;
    };
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
