package main.java.com.lkk.mode;

/**
 * @ClassName YelloCat
 * @Description //TODO
 * @Author lkk
 * Date 2022/05/18/15:04
 * @Version 1.0
 **/
public class YelloCat extends Cat{

    public  Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public YelloCat(){};
    public YelloCat(String name,Integer age){
        this.age=age;
        this.name=name;
    };
    @Override
    public String toString() {
        return "YelloCat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
