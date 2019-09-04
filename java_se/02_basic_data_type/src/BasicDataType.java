public class BasicDataType {

    public static void main(String[] args) {
        // 整型
        byte aByte = 1;                 // 占用一个字节，取值范围 [-128, 127]
        System.out.println(aByte);
        short aShort = 2;               // 两个字节
        System.out.println(aShort);
        int aInt = 3;                   // 四个字节
        System.out.println(aInt);
        long aLong = 4L;                // 八个字节
        System.out.println(aLong);
        // 浮点型
        float aFloat = 5.1F;            // 四个字节
        System.out.println(aFloat);
        double aDouble = 5.2;
        System.out.println(aDouble);    // 八个字节
        // 逻辑型
        boolean aBoolean = true;        // JVM规范中占用四个字节，取值范围{true, false}
        System.out.println(aBoolean);
        // 字符型
        char aChar = 'a';
        System.out.println(aChar);      // 两个字节，Java中使用Unicode编码
    }

}
