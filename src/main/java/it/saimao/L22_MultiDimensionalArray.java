package it.saimao;

public class L22_MultiDimensionalArray {
    public static void main(String[] args) {

        char[][] table = {
                {4097, 0x1001, 'ဂ'},
                {'a', 'b', 'c'},
                {'A', 'B', 'C'}
        };

        // Method 1
        char[] row1 = table[0];
        char kha = row1[1];
        System.out.println(kha);

        // Method 2
        // First index is for ROW
        // Second index if for Column
        char bigC = table[2][2];
        System.out.println(bigC);
        char smallB = table[1][1];
        System.out.println(smallB);
        table[2][0] = '@';
        System.out.println(table[2][0]);
    }
}
