public class Operator {

    public static void main(String[] args) {
        int a = 1, b = 2;
        // 算术运算符
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);  // 取余
        System.out.println("before a++ a = " + a);
        System.out.println("execute a++ a = " + a++);
        System.out.println("after a++ a = " + a);
        System.out.println("before a-- a = " + a);
        System.out.println("execute a-- a = " + a--);
        System.out.println("after a--  a = " + a);
        System.out.println("before ++a a = " + a);
        System.out.println("execute ++a a = " + ++a);
        System.out.println("after ++a a = " + a);
        System.out.println("before --a a = " + a);
        System.out.println("execute --a a = " + --a);
        System.out.println("after --a a = " + a);
        // 赋值运算符
        System.out.println("=========================");
        a += b;         // a = a + b;
        System.out.println("a = " + a + ", b = " + b);
        a *= b;         // a = a * b;
        System.out.println("a = " + a + ", b = " + b);
        a /= b;         // a = a / b;
        System.out.println("a = " + a + ", b = " + b);
        a %= b;         // a = a % b;
        System.out.println("a = " + a + ", b = " + b);
        // 比较运算符
        System.out.println("=========================");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a == b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a != b);
        // 逻辑运算符
        System.out.println("=========================");
        boolean ba = true;
        boolean bb = false;
        System.out.println(ba && bb); // true && true = true, true && false = false, false && false = false
        System.out.println(ba || bb); // true || true = true, true || false = true, false || false = false
        System.out.println(!ba);      // !true = false, !false = true
        // 三元运算符
        System.out.println("=========================");
        System.out.println(true ? "true" : "false");
        System.out.println(false ? "true" : "false");
    }

}
