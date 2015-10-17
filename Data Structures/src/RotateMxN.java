
public class RotateMxN {

	public static void main(String args[])
	{
		int [][]matrix={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		RotateMxN rm = new RotateMxN();
		//System.out.println(rm.rotateMatrix(matrix));
		int [][] printMatrix=rm.rotateMatrix(matrix, false);
		
		for(int i=0;i<printMatrix.length;i++)
		{
			for(int j=0; j < printMatrix[0].length;j++)
			{
				System.out.print(printMatrix[i][j]);
			}
			System.out.println();
		}
	}
	
	public int[][] rotateMatrix(int [][]matrix, boolean flg)
	{
		
		int [][]newMatrix= new int[matrix[0].length][matrix.length];
		if(flg == true)
		{
		int newRow=matrix.length-1;
		for(int i=0;i<matrix.length;i++)
		{
			
			for(int j=0;j<matrix[0].length;j++)
			{
				newMatrix[j][newRow]=matrix[i][j];
			}
			newRow--;
		}
		
		}
		else
		{
			//int newColumn=matrix[0].length-1;
			for(int i=0;i<matrix.length;i++)
			{
				int newColumn=matrix[0].length-1;
				for(int j=0;j<matrix[0].length;j++)
				{
					newMatrix[newColumn--][i]=matrix[i][j];
				}
				//newColumn--;
			}
		}
		
		return newMatrix;
	}
//
//	public void newRotate(int [][] matrix,boolean flg)
//	{
//		if (flg == true)
//		{
//			int w = 
//		}
//		else
//		{
//			
//		}
//	}
	private int[][] rotateRight(int[][] matrix) {
		// TODO Auto-generated method stub
		swap(matrix);
		transpose(matrix);
		return matrix;
	}
	
	private void transpose(int[][] matrix) {
		// TODO Auto-generated method stub
		for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int x = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = x;
            }
        }
	}

	private void swap(int[][] m) {
		// TODO Auto-generated method stub
		for (int  i = 0, k = m.length - 1; i < k; ++i, --k) {
	        int[] x = m[i];
	        m[i] = m[k];
	        m[k] = x;
	    }
	}

	private int[][] rotateLeft(int[][] matrix) {
		// TODO Auto-generated method stub
		transpose(matrix);
		swap(matrix);
		return matrix;
	}
	
	
}
