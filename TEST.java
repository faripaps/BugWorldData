import java.util.Scanner;
import java.io.*;

public class TEST {


    public static void main(String[] args) {
        try {
            java.io.File test2 = new java.io.File("tiny.txt");
            Scanner input = new Scanner(test2);
            int iRows = 10;
            int iCols = 10;
            String arr[][] = new String[iRows][iRows];
            int i = 0, j = 0;
            while (input.hasNext()) {
                String val = input.nextLine();
                System.out.println(val);
                j = 0;
                if (val.contains(" ")) {
                    String str[] = val.split(" ");
                    int cn = str.length -1;
                    System.out.println(val);
                    System.out.println(cn);
                    while (cn > 0) {
                        arr[i][j] = str[j];
                        cn--;
                        j++;
                    }
                } else
                    arr[i][j] = val;
                i++;
            }

            for (int i1 = 0; i1 < iRows; i1++) {
                for (int j1 = 0; j1 < iCols; j1++)
                    if (arr[i1][j1] != null)
                        System.out.print(arr[i1][j1]);
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}



