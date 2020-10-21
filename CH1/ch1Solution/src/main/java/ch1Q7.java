public class ch1Q7 {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,3,4},{0,1,3,4},{0,1,3,4},{0,1,3,4}};

        print2DArray(matrix);

        System.out.println(rotateMatrix(matrix));

        print2DArray(matrix);
    }

    private static void print2DArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean rotateMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length)
            return false;

        int n = matrix.length;
        for (int layer = 0; layer < n / 2; layer += 1) {

            int first = layer;
            int last = n - 1 - layer;

            for(int i =first; i< last; i+=1){

                int offset= i - first;

                // save top
                int top = matrix[first][i];

                // left -> top
                matrix[first][i] = matrix[last - offset][first];

                // bottom -> left
                matrix[last - offset][first] = matrix[last][last - offset];

                // right -> bottom
                matrix[last][last - offset] = matrix[i][last];

                // top -> right
                matrix[i][last] = top;
            }
        }
        return true;
    }
}

// Complexity : O(n^2) the best base since it have to touch all elements