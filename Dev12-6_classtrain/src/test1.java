import java.util.Scanner;
public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 输入数组大小
        System.out.print("请输入数组大小n: ");
        int n = scanner.nextInt();

        // 定义数组
        int[] arr = new int[n];

        // 循环输入数组元素
        System.out.println("请输入数组元素:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // 寻找最小值及其索引
        int min = arr[0];
        int k = 0;
        for (int i = 1; i < n; i++) {
            if (min < arr[i]) {
                min = arr[i];
                k = i;
            }
        }

        // 交换元素和最小值
        if(k!=0)
        {
            int temp = arr[0];
            arr[0] = arr[k];
            arr[k] = temp;
        }


        // 遍历输出数组
        System.out.println("交换后的数组:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
