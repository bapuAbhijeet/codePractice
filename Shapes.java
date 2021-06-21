import java.util.Scanner;
public class Shapes
{
    public static void main(String args[]) 
    {
        int rowsInput,columnInput;
        Scanner input = new Scanner(System.in);
        System.out.println("Number of Rows : ");
        rowsInput = input.nextInt();
        System.out.println("Number of Columns :  ");
        columnInput = input.nextInt();
        // Exception handling around this for totalRows
        if (rowsInput <= 2 && columnInput <= 2)
               System.out.print("Input Invalid") ;
        printRectangleFormat(rowsInput,columnInput);
    }
     private static void printRectangleFormat(int rows, int columns)
     {
        int currentRow, currentColumn;
        for (currentRow = 1; currentRow <= rows; currentRow++) {
            for (currentColumn = 1; currentColumn <= columns; currentColumn++) {
                if (currentRow == 1 || currentRow == rows || currentColumn == 1 || currentColumn == columns)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
     }
}
