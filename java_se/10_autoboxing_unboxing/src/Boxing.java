/**
 * Every Thing is object
 * 自动装箱拆箱：指编译器可以自动在基本类型和它对应的类之间转换
 *  * 基本类型对应的类
 * byte     Byte
 * short    Short
 * int      Int
 * long     Long
 * float    Float
 * double   Double
 * char     Character
 * boolean  Boolean
 * 作用
 *      1. 为基本类型提供更多的操作
 *      2. Java是一门面向对象的语言，Every thing is object
 *      3. 让基本类型也能使用泛型
 */
public class Boxing {

    public static Integer testInt(Integer i) {
        return i.intValue();  // i.intValue()返回的是int,会自动装箱成Integer
    }

    public static void testChar(char c) {
        System.out.println("char");
        System.out.println(c);
    }

    public static void testChar(Character c) {
        System.out.println("Character");
        System.out.println(c);
    }

    public static void main(String[] args) {
        int i = 10;
        i = testInt(10);    // 传值时装箱，返回值时拆箱

        char c = 'a';
        testChar(c);           // 不会自动装箱
        testChar(Character.valueOf(c));     // 不会自动拆箱

        testMagic();
    }

    public static void testMagic() {
        int a = 10;
        Integer b = new Integer(a);
        Integer c = Integer.valueOf(a);
        Integer d = Integer.valueOf(a);
        System.out.println(a == b);     // true 自动装箱拆箱，比较值
        System.out.println(b == c);     // false 两个都是对象，比较的是地址
        System.out.println(a == c);     // true 自动装箱拆箱，比较值
        System.out.println(d == c);     // true 两个都是对象，阅读Integer.valueOf(a)可以知，
                                        // 调用该方法会看先缓存中是否有该值的对象，如果没有就创建并缓存，如果有直接取出
                                        // 所以两次调用Integer.valueOf(a);返回的是同一个对象
    }

}
