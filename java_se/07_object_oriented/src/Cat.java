/**
 * 1. 类(class)的概念：描述某一类事物应该有哪些属性和行为。
 * 例如猫有性别，年龄等属性; 猫的行为有吃饭，玩耍，我们就可以把猫抽象成下面这个类
 */
public class Cat {

    // 猫的性别
    char sex;
    // 猫的年龄
    int age;

    /**
     * 构造函数：创建对象，方法名要和类名相同
     */
    Cat(char sex, int age) {
        this.sex = sex;         // this 代表创建出来的对象，例如如果创建的对象是tom，那么this.age就相当于tom.age
        this.age = age;
    }

    // 玩耍
    void play() {
        if (this.sex == '男') {
            System.out.println("play game");
        }
        else {
            System.out.println("watch TV");
        }
    }

    // 吃饭
    void eat() {
        System.out.println("eat");
    }

    public static void main(String[] args) {
        /**
         * 2. 对象的概念：将类中的属性的值确定下来，来更加具体的描述某一事物。
         * 假如有两只猫Tom(sex='公', age=2)和Mary(sex='母', age=1)，我们该如何描述这两只猫呢？
         * 在Cat类中，我们定义了猫类应该有的属性：sex和age, 只要我们赋给属性对应的值，就可以描述Tom和Mary
         * 给属性赋值的过程，就是创建对象的过程。
         * 语法
         * 类名 对象 = new 类名(参数列表)    // 这个过程中完成了内存的申请和给属性赋值的操作
         */
        Cat tom = new Cat('男', 2);
        tom.play();                        // 用对象调用方法
        Cat mary = new Cat('女', 1);
        mary.play();
    }

}
