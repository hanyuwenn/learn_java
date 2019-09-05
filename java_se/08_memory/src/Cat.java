/**
 * 在Java程序运行时，JVM会为其分配一块内存，这块内存分为：方法区，堆，栈，三部分
 * 方法区用来保存类信息。堆用来保存Java程序创建的对象，栈保存程序执行的的信息
 * 以运行下面这个程序为例
 */
/**
 * 1. JVM加载Cat.class并将类中的方法，属性信息保存到方法区
 */
public class Cat {


    char sex;

    int age;

    /**
     * 4. JVM在堆中对象分配内存并为属性赋值，最后把内存地址返回
     */
    Cat(char sex, int age) {
        this.sex = sex;
        this.age = age;
    }

    void play() {
        /**
         * 6. 根据tom提供的地址找到tom的属性值
         * 这样就可以根据tom的属性值执行下面的操作
         */
        if (this.sex == '男') {
            System.out.println("play game");
        }
        else {
            System.out.println("watch TV");
        }
    }

    void eat() {
        System.out.println("eat");
    }

    // 2. JVM找到main方法并将main方法，并按照顺序把语句压入栈中以执行
    public static void main(String[] args) {
        /**
         * 3. 从方法区中拿到new Cat();方法，把方法的操作按照执行顺序压入栈中
         */
        Cat tom = new Cat('男', 2);
        /**
         * 5. 从方法区中拿到play方法
         * play();入栈
         */
        tom.play();
    }

}
