package main.java.com.lkk.mode;

/**
 * @ClassName RedCat
 * @Description //TODO
 * @Author lkk
 * Date 2022/05/18/15:03
 * @Version 1.0
 **/
public class RedCat extends Cat{
    public Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public RedCat(){};
    public RedCat(String name,Integer age){
        this.name=name;
        this.age=age;
    };

    @Override
    public String toString() {
        return "RedCat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
