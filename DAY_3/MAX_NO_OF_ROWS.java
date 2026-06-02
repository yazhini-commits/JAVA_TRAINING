import java.util.*;

public class MAX_NO_OF_ROWS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row: ");
        int r = sc.nextInt();
        System.out.print("Enter Column: ");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter Elements: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int row = -1;
        int maxCount = -1;
        for (int i = 0; i < r; i++) {
            int count = 0;
            for (int j = 0; j < c; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
            System.out.println("count" + i + ":" + count);
            if (count > maxCount) {
                maxCount = count;
                row = i;
            }
        }

        if (row >= 0) {
            System.out.println("The row " + row + " has maximum ones ");
        } else {
            System.out.println("No rows found.");
        }

        sc.close();
    }
}
