import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class LinearAlgebra2
{
  public static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
  public static BufferedReader reader = new BufferedReader(inputStreamReader);
  public static ArrayList<String> matrixContainer = new ArrayList<>(); 
  
  static final int NUM_OF_ROWS = 100;
  static final int NUM_OF_COL = 100;
  
  public static int promptRow() throws IOException
  {
    int actual_row = 0;
    
    while(actual_row <= 0 || actual_row > NUM_OF_ROWS)
    {
      System.out.print("Enter number of rows: ");
      actual_row = Integer.parseInt(reader.readLine());
    }
    return actual_row;
  }
  
  public static int promptCol() throws IOException
  {
    int actual_col = 0;
    
    while(actual_col <= 0 || actual_col > NUM_OF_COL)
    {
      System.out.print("Enter number of columns: ");
      actual_col = Integer.parseInt(reader.readLine());
    }
    return actual_col;
  }
  
  public static void enterValues(int arr[][], int actual_row, int actual_col) throws IOException
  {
    for (int i = 0; i < actual_row; i++)
    {
      for (int j = 0; j < actual_col; j++)
      {
        System.out.printf("Enter number in row %d of column %d: ", i + 1, j + 1);
        arr[i][j] = Integer.parseInt(reader.readLine());
      }
      System.out.println();
    }
  }
  
  public static void displayMatrix(int arr[][], int actual_row, int actual_col)
  {
    for (int i = 0; i < actual_row; i++)
    {
      System.out.println();
      for (int j = 0; j < actual_col; j++)
      {
        System.out.printf("%d   ", arr[i][j]);
      }
    }
  }

  public static String stringifyMatrix(int arr[][])
  {
    return "Hello";
  }

  public static void optionsMenu()
  {
    System.out.println("=======================");
    System.out.println("<1> Enter a Matrix");
    System.out.println("<2> Display a Matrix");
    System.out.println("<9> Exit");

  }

  public static void commandLine() throws IOException
  {
    boolean flag = true;
    int input = 0;
    int actual_row = 0;
    int actual_col = 0;

    while (flag)
    {
      optionsMenu();
      System.out.print("Enter your choice: ");
      input = Integer.parseInt(reader.readLine());
      switch (input)
      {
        case 1:
          actual_row = promptRow();
          actual_col = promptCol();
          int[][] arr = new int[actual_row][actual_col];
          enterValues(arr, actual_row, actual_row);
          matrixContainer.add(Arrays.toString(arr));
          break;
        case 2:
          System.out.println(matrixContainer);
          break;
        case 9:
          flag = false;
          break;
        default:
          break;
      }

    }


  }
  

  public static void main(String[] args) throws Exception
  {
    commandLine();
  
  }
}
