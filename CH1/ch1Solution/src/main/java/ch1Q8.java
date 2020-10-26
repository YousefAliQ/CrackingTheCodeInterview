public class ch1Q8 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,9},{3,9,4},{0,5,6}};
        setZero(matrix);

        for(int i=0; i<matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static void setZero(int[][] matrix) {
        // Assume that you can change the first row & column to store 0s.
        Boolean rowHasZero = false;
        Boolean colHasZero = false;

        //Check if first row contains 0s
        for(int m=0; m<matrix.length; m+=1){
            if (matrix[0][m] == 0){
                rowHasZero = true;
                break;
            }
        }

        //Check if first column contains 0s
        for(int n=0; n<matrix[0].length; n+=1){
            if (matrix[n][0] == 0){
                colHasZero = true;
                break;
            }
        }

        //Check for zeros in the rest of the array
        for(int i=1; i<matrix.length;i++){
            for(int j=1; j<matrix[0].length;j++){
                if (matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        //Nullify Rows
        for(int i=1; i<matrix.length; i++){
            if(matrix[i][0] == 0)
                nullifyRow(matrix, i);
        }

        //Nullify Columns
        for(int i=1; i<matrix[0].length; i++){
            if(matrix[0][i] == 0)
                nullifyColumn(matrix, i);
        }

        //Nullify First Row
        if(rowHasZero)
            nullifyRow(matrix, 0);

        //Nullify Second Row
        if(colHasZero)
            nullifyColumn(matrix, 0);

    }

    private static void nullifyRow(int[][] matrix, int i) {
        for(int n=0; n<matrix.length; n+=1){
            matrix[i][n]=0;
        }
    }

    private static void nullifyColumn(int[][] matrix, int i) {
        for(int n=0; n<matrix[0].length; n+=1){
            matrix[n][i]=0;
        }
    }


}
