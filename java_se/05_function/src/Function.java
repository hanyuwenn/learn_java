public class Function {

    /**
     * 这就是一个方法, 方法的作用是把一组操作放在一起，当我们需要用这组操作完成一件事情时，只要调用这个方法就行了，而不是把方法里的操作再写一遍
     * 定义方法的格式：
     * 修饰符 返回值类型 方法名(参数){
     *     一组操作...
     *     如果返回类型 != void
     *     return 返回值;
     *     否则
     *     return;
     * }
     * <p>
     * 方法的唯一标识：方法名(main)，参数个数(1个)，参数类型(String[])
     */
    public static void main(String[] args) {
        int aInt = 1, bInt = 2;
        print(plus(aInt, bInt));
        Short aShort = 3, bShort = 4;
        print(plus(aShort, bShort));
    }

    static int plus(int a, int b) {
        System.out.println("plus int");
        return a + b;
    }

    static short plus(short a, short b) {
        System.out.println("plus short");
        return (short) (a + b); // 计算a + b返回的结果是int类型，所以要转成short
    }

    static void print(int a) {
        System.out.println(a);
    }

    static void print(short a) {
        System.out.println(a);
    }

}
