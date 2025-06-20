package logical;

//Input
//String str = "ACCOLITE.COM";
//int row = 4;

public class ZigzagPattern {
    public static void main(String[] args) {
        String str = "ACCOLITE";
        int numRows = 3;
        printZigzag(str, numRows);
    }

    public static void printZigzag(String str, int numRows) {
        if (numRows <= 1) {
            System.out.println(str);
            return;
        }

        // Create an array of StringBuilder to store characters for each row
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int len = str.length();
        int index = 0;

        while (index < len) {
            // Go downwards in the rows
            for (int i = 0; i < numRows && index < len; i++) {
                rows[i].append(str.charAt(index++));
            }
            // Go upwards in the rows
            for (int i = numRows - 2; i > 0 && index < len; i--) {
                rows[i].append(str.charAt(index++));
            }
        }

        // Print the rows
        for (StringBuilder row : rows) {
            System.out.println(row.toString());
        }
    }
}

