class RotateImage49{
    public void rotate(int[][] a) {
        int[][] b = new int[a.length][a[0].length];

        // Transpose the matrix
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                b[j][i] = a[i][j];
            }
        }

        // Reverse each row
        for (int i = 0; i < a.length; i++) {
            int left = 0;
            int right = a[0].length - 1;
            while (left <= right) {
                int temp = b[i][left];
                b[i][left] = b[i][right];
                b[i][right] = temp;
                left++;
                right--;
            }
        }

        // Copy the rotated matrix back to the original matrix 'a'
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = b[i][j];
            }
        }
    }
    public static void main(String[] args) {
        RotateImage49 rotateImage49 = new RotateImage49();

        // Example input matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Rotate the matrix
        rotateImage49.rotate(matrix);

        System.out.println("\nRotated Matrix:");
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}