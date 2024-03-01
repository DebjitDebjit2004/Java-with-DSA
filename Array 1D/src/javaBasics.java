import java.util.Scanner;

public class javaBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = {2, 9, 11, 6, 5};

        System.out.print("Enter The Size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter "+size+" Elements: ");
        int[] array_1 = new int[size];
        for (int i = 0; i < size; i++) {
            array_1[i] = sc.nextInt();
        }

        int[] array_2;
        array_2 = new int[3];
        array_2[0] = 12;
        array_2[1] = 21;
        array_2[2] = 34;

        System.out.print("Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();

        System.out.print("Array_1: ");
        int i = 0;
        while (i < size){
            System.out.print(array_1[i]+" ");
            i += 1;
        }
        System.out.println();

        System.out.print("Array_2: ");
        for (int ele: array_2){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
