/**
 * 数组：使用一块连续的，固定大小的内存来存储数据
 */
public class Array {

    // 1. 创建数组
    public static void createArray() {
        int[] arrA = {1, 2, 3};
        int[] arrB = new int[]{4, 5, 6};
        int[] arrC = new int[3];
    }

    // 2. 访问数组中的元素
    public static void accessArray() {
        System.out.println("accessArray");
        int[] arr = {1, 2, 3};
        System.out.println(arr);
        // 从0开始
        System.out.println("arr[0]: " + arr[0]);
        System.out.println("arr[1]: " + arr[1]);
        System.out.println("arr[2]: " + arr[2]);
        // 赋值
        arr[1] = 4;
        System.out.println("arr[1]: " + arr[1]);
    }

    // 3. 获得数组长度
    public static void testArrayLen(int arr[]) {
        System.out.println("testArrayLen");
        System.out.println("len = " + arr.length);
    }

    // 4. 遍历数组
    public static void traversingArray(int arr[]) {
        System.out.println("traversingArray");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        accessArray();
        int[] arr = {1, 2, 3};
        testArrayLen(arr);
        traversingArray(arr);
    }

}
