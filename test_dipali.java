import java.util.Scanner;
public class test_dipali
{
    static int currentRow, lineNumber, space = 1;
    public static void main(String args[]) 
    {
        int totalRows;
        System.out.println("Number of Rows : ");
        Scanner input = new Scanner(System.in);
        totalRows = input.nextInt();
        // Exception handling around this for totalRows
        if (totalRows <= 1)
               System.out.print("Input Invalid") ; 
        printUpperPartOfDiamond(totalRows);
        printLowerPartOfDiamond(totalRows);
    }
    private static void printUpperPartOfDiamond(int totalRows)
    {
        space = totalRows - 1;
        for (lineNumber = 1; lineNumber <= totalRows; lineNumber++) 
        {
            for (currentRow = 1; currentRow <= space; currentRow++) 
            {
                System.out.print(" ");
            }
            space--;
            for (currentRow = 1; currentRow <= 2 * lineNumber - 1; currentRow++) 
            {
                System.out.print("*");                
            }
            System.out.println("");
        }
    }
    private static void printLowerPartOfDiamond(int totalRows)
    {
        space = 1;
        for (lineNumber = 1; lineNumber <= totalRows- 1; lineNumber++) 
        {
            for (currentRow = 1; currentRow <= space; currentRow++) 
            {
                System.out.print(" ");
            }
            space++;
            for (currentRow = 1; currentRow <= 2 * (totalRows - lineNumber) - 1; currentRow++) 
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
