import java.io.BufferedReader;
import java.io.InputStreamReader;


public class LinearAlgebra3
{
  public static void main(String[] args)
  {
    int row = 3;
    int col = 3;
    
    Matrix m = new Matrix(row, col);
    
    int[][] matrix = m.enterDetails();
    m.display(matrix);
  
  }
}

public class Matrix
{
  public static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
  public static BufferedReader reader = new BufferedReader(inputStreamReader);
  private int row;
  private int col;
  
  public Matrix(int row, int col)
  {
    this.row = row;
    this.col = col;
  }
  
  public int getRow()
  {
    return row;
  }
  
  public int getCol()
  {
    return col;
  }
  
  public int[][] enterDetails()
  {
    int matrix[][] = new int[row][col];
    
    for (int i = 0; i < row; i++)
    {
      for (int j = 0; j < col; j++)
      {
        try
        {
          System.out.printf("Enter number of row %d of column %d: ", i + 1, j + 1);
          matrix[i][j] = Integer.parseInt(reader.readLine());
        
        }
        catch(Exception e)
        {
          System.out.println("Error!");
        
        }
      }
      System.out.println();
    
    }
    
    return matrix;
  
  }
  
  public void display(int[][] matrix)
  {
    for (int i = 0; i < row; i++)
    {
      System.out.println();
      for (int j = 0; j < col; j++)
      {
        System.out.printf("%d   ", matrix[i][j]);
      }
    
    }
  }

}
