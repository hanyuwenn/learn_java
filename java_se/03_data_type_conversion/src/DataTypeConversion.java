public class DataTypeConversion {

    public static void main(String[] args) {
        // 1. 整型和浮点型
        // 1.1 取值范围小的向取值范围大的转换
        byte aByte = 1;
        short aShort = aByte;
        int aInt = aShort;
        float aFloat = aInt;
        double aDouble = aFloat;
        System.out.println("aByte: " + aByte + ", aShort: " + aShort + ", aInt: " + aInt + ", aFloat: " + aFloat + ", aDouble: " + aDouble);
        // 1.2 取值范围大的向取值范围小的转换, 会有精度丢失的现象
        aDouble = 0x1.fffffeP+127f + 1;
        aFloat = (float) aDouble;
        aInt = (int) aFloat;
        aShort = (short) aInt;
        aByte = (byte) aShort;
        System.out.println("aByte: " + aByte + ", aShort: " + aShort + ", aInt: " + aInt + ", aFloat: " + aFloat + ", aDouble: " + aDouble);
        // 2. 整型, 浮点型和字符型
        char aChar = 'a';
        aByte = (byte) aChar;
        aShort = (short) aChar;
        aInt = aChar;
        aFloat = aChar;
        aDouble = aChar;
        System.out.println("aChar: " + aChar + ", aByte: " + aByte + ", aShort: " + aShort + ", aInt: " + aInt + ", aFloat: " + aFloat + ", aDouble: " + aDouble);
        aChar = (char) aByte;
        aChar = (char) aShort;
        aChar = (char) aInt;
        aChar = (char) aFloat;
        aChar = (char) aDouble;
        System.out.println("aChar: " + aChar + ", aByte: " + aByte + ", aShort: " + aShort + ", aInt: " + aInt + ", aFloat: " + aFloat + ", aDouble: " + aDouble);
        // 3. 逻辑型不能和其他类型相互转换
    }

}
