import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class LinearAlgebra
{
    public static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    public static BufferedReader reader = new BufferedReader(inputStreamReader);

    public static void EnterValues(int[][] arr) throws IOException
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                System.out.print("Enter number: ");
                arr[i][j] = Integer.parseInt(reader.readLine());

            }
            System.out.println();
        }

    }

    public static void displayValues(int[][] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println();
            for (int j = 0; j < arr.length; j++)
            {
                System.out.print(arr[i][j] + "  ");

            }
        }

    }

    public static void matrixAddition(int[][] arr1, int[][] arr2)
    {
        for (int i = 0; i < arr1.length; i++)
        {
            System.out.println();
            for (int j = 0; j < arr1.length; j++)
            {
                System.out.print((arr1[i][j] + arr2[i][j]) + "  ");
            }
        }
    }


    public static void main(String[] args) throws Exception
    {
        int[][] arr = new int[3][3];
        int[][] arr2 = new int[3][3];
        
        EnterValues(arr);
        System.out.println("\nMatrix 1");

        displayValues(arr);
        System.out.println();
        EnterValues(arr2);

        System.out.println("\nMatrix 2");
        displayValues(arr2);

        System.out.println("\nMatrix1 + Matrix2 = ");
        matrixAddition(arr, arr2);
    }


}
