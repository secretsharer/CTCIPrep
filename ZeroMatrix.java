// class Solution {
//     public static void main(String[] args) {
//         int matrix1[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

//         Solution result = new Solution();
//         result.setZeros(matrix1);
//         System.out.print("Great job, you zeroed");
//     }

//     void setZeros(int[][] matrix) {
//         boolean[] row = new boolean[matrix.length];
//         boolean[] column = new boolean[matrix[0].length];
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[0].length; j++) {
//                 if (matrix[i][j] == 0) {
//                     row[i] = true;
//                     column[j] = true;
//                 }
//             }
//         }

//         for (int i = 0; i < row.length; i++) {
//             if (row[i]) {
//                 nullifyRow(matrix, i);
//             }
//         }

//         for (int j = 0; j < column.length; j++) {
//             if (column[j]) {
//                 nullifyRow(matrix, j);
//             }
//         }
//     }

//     void nullifyRow(int[][] matrix, int row) {
//         for (int j = 0; j < matrix[0].length; j++) {
//             matrix[row][j] = 0;
//         }
//     }

//     void nullifyColumn(int[][] matrix, int column) {
//         for (int i = 0; i < matrix.length; i++) {
//             matrix[i][column] = 0;
//         }
//     }

// }

