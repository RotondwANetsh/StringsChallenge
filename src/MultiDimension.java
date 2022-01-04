public class MultiDimension {
    public static void main(String[] args) {
        String line = "1,4,3,2,3,7,5,6,9\n" + "8,6,3,7,3,7,5,6,9\n";
        String[] rows = line.split("\n");
        String[][] strArray = new String[rows.length][];
        int x  = 0;

        for (String row : rows){
            strArray[x++] = row.split(",");
        }

        int[][] strNumbers = new int[strArray.length][strArray[0].length];

        System.out.println("Original Array Values:");
        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray[i].length; j++) {
                strNumbers[i][j] = Integer.parseInt(strArray[i][j]);
                System.out.print(strNumbers[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Sorted Array in Ascending Order:");
        for (int i = 0; i < strNumbers.length; i++) {
            for (int j = 0; j < strNumbers[i].length; j++) {
                for (int k = 0; k < strNumbers[i].length - j - 1; k++) {
                    if (strNumbers[i][k] > strNumbers[i][k + 1]){
                        int temp = 0;
                        temp = strNumbers[i][k];
                        strNumbers[i][k] = strNumbers[i][k + 1];
                        strNumbers[i][k + 1] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < strNumbers.length; i++) {
            for (int j = 0; j < strNumbers[i].length; j++) {
                System.out.print(strNumbers[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Sorted Array in Descending Order:");
        for (int i = 0; i < strNumbers.length; i++) {
            for (int j = 0; j < strNumbers[i].length; j++) {
                for (int k = 0; k < strNumbers[i].length - j - 1; k++) {
                    if (strNumbers[i][k] < strNumbers[i][k + 1]){
                        int temp = 0;
                        temp = strNumbers[i][k];
                        strNumbers[i][k] = strNumbers[i][k + 1];
                        strNumbers[i][k + 1] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < strNumbers.length; i++) {
            for (int j = 0; j < strNumbers[i].length; j++) {
                System.out.print(strNumbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
