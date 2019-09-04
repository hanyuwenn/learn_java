import javax.xml.crypto.Data;
import java.util.Date;

public class ProcessControl {

    public static void main(String[] args) {
        System.out.println(testIfElseA(1));
        System.out.println(testIfElseB(2));
        System.out.println(testIfElseC(2));
        System.out.println("===============");
        testSwitch(1);
        testSwitch(2);
        testSwitch(3);
        testSwitch(4);
        testFor();
        testWhile();
        testDoWhile();
        testBreak();
        testContinue();
    }

    static char testIfElseA(int i) {
        if (i == 1) {
            return 'a';
        }
        return 'z';
    }

    static char testIfElseB(int i) {
        if (i == 1) {
            return 'a';
        }
        else {
            return 'z';
        }
    }

    /**
     * 语法
     * if (条件1) {操作1}
     * else if (条件2) {操作2}
     * else {操作3}
     * 执行顺序：
     *      满足条件1->执行操作1->结束if-else
     *      不满足条件1->满足条件2->执行操作2->结束if-else
     *      不满足条件1->不满足条件2->执行操作3->结束if-else
     */
    static char testIfElseC(int i) {
        if (i == 1) {
            return 'a';
        }
        else if (i == 2) {
            return 'b';
        }
        else if (i == 3) {
            return 'c';
        }
        else {
            return 'z';
        }
    }

    static void testSwitch(int i) {
        System.out.println("testSwitch case = " + i);
        switch (i) {
            case 1:         // 当i==1时执行下面的语句
                System.out.println("switch case 1");
                break;      // 跳出switch
            case 2:
                System.out.println("switch case 2");  // 当i==2时执行下面的语句
            case 3:
                System.out.println("switch case 3");  // 当i==3时执行下面的语句
                break;      // 跳出switch
            default:        // 默认需要执行下面的语句
                System.out.println("switch case default");
        }
    }

    /**
     * 语法
     * for (初始化; 判断条件; 后续操作) {
     *     一组操作..
     * }
     * 执行顺序：初始化->判断条件为true->一组操作->后续操作->判断条件为true->...->直到判断条件为false->for循环结束
     */
    static void testFor() {
        System.out.println("testFor");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();   // 换行
    }

    /**
     * 语法
     * while(判断条件) {
     *     一组操作...
     * }
     * 执行顺序：判断条件为true->执行一组操作->判断条件为true->执行一组操作->...->判断条件为false->while循环结束
     */
    static void testWhile() {
        System.out.println("testWhile");
        int i = 0;
        while (i < 10) {
            System.out.print(i + ", ");
            i++;
        }
        System.out.println();
    }

    /**
     * 语法
     * do {
     *     一组操作...
     * } while(判断条件);
     * 执行顺序：一组操作->判断条件为true->执行一组操作->...->判断条件为false->do-while循环结束
     */
    static void testDoWhile() {
        System.out.println("testDoWhile");
        int i = 0;
        do {
            System.out.print(i + ", ");
            i++;
        } while (i < 10);
        System.out.println();
    }

    /**
     * 语法
     * break; 跳出循环
     */
    static void testBreak() {
        System.out.println("testBreak");
        for (int i = 0; i < 10; i++) {
            if (i == 5) break;      // 跳出循环
            System.out.print(i + ", ");
        }
        System.out.println();   // 换行
    }

    /**
     * 语法
     * continue; 跳过本次循环，进入下一次循环
     */
    static void testContinue() {
        System.out.println("testContinue");
        for (int i = 0; i < 10; i++) {
            if (i == 5) continue;      // 跳过本次循环，进入下一次循环
            System.out.print(i + ", ");
        }
        System.out.println();   // 换行
    }

}
