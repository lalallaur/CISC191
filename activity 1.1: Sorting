import java.util.Scanner;

    public class Main {

        public static void sortArray(int[] myArr, int arrSize) {
            for (int i = 0; i < arrSize - 1; i++) {
                for (int j = 0; j < arrSize - 1 - i; j++) {
                    if (myArr[j] < myArr[j + 1]) {
                        int temp = myArr[j];
                        myArr[j] = myArr[j + 1];
                        myArr[j + 1] = temp;
                    }
                }
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int numElements = sc.nextInt();
            int[] arr = new int[numElements];

            for (int i = 0; i < numElements; i++) {
                arr[i] = sc.nextInt();
            }

            sortArray(arr, numElements);

            for (int i = 0; i < numElements; i++) {
                if (i > 0) {
                    System.out.print(",");
                }
                System.out.print(arr[i]);
            }
            System.out.println();

            sc.close();
        }
    }
