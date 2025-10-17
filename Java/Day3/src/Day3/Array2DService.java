package Day3;
public class Array2DService {

	public static void displayData(int[][] arr) {
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.println(arr[i][j]+'\t');
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		
	}

	public static int addAllNumbers(int[][] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				sum +=arr[i][j];
			}
		}
		return sum;
	}

	public static int[] addRowwise(int[][] arr) {
		int[] temp=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			temp[i]=0;
			for(int j=0;j<arr[i].length;j++) {
				temp[i]+=arr[i][j];
			}
		}
		return temp;
	}

	public static int[] addColumnwise(int[][] arr) {
		int[] temp=new int[arr[0].length];
		for(int i=0;i<arr.length;i++) {
			temp[i]=0;
			for(int j=0;j<arr[i].length;j++) {
				temp[i]+=arr[j][i];
			}
		}
		return null;
	}

	
	
	
	public static int[][] add2Darrays(int[][] arr, int[][] arr1) {
		int [][]temp=new int[arr.length][];
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				temp[i][j]=arr[i][j]+arr1[i][j];
				
			}
		}
		return temp;
	}
	
	
	

	public static int[][] multiplyArray(int[][] arr, int[][] arr1) {
		int [][]temp=new int[arr.length][];
		if(arr.length==arr[0].length) {
			for(int i=0;i<arr.length;i++) {
				
				for(int j=0;j<arr[i].length;j++)
				{
					for(int k=0;k<arr[0].length;k++)
					{
						temp[i][j]=arr[i][k]*arr1[k][j];
					}
				}
			}
			return temp;
		}
		
		return null;
	}

	public static int[][] findTranspose(int[][] arr) {
		if(arr.length==arr[0].length)
		{
			int [][]temp=new int[arr.length][];
			for(int i=0;i<arr.length;i++) {
				
				for(int j=0;j<arr[i].length;j++)
				{
					temp[i][j]=arr[i][j];
				}
			}
			return temp;
			
		}
		return null;
	}

	public static boolean checkIdentity(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++)
			{
				if((i==j)&&(arr[i][j]!=1))
				{
					return false;
				}
				else if((i!=j)&& arr[i][j]!=0)
				{
					return false;
				}
			}
		}
		return true;
	}

	public static int[][] rotateRow(int[][] arr, int n) {
		int [][] temp = new int [arr.length][];
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++)
			{
				temp[i][j]=arr[i][j];
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			temp[i]=arr[i+1];
		}
		return temp;
	}

	public static int[][] rotateColumn(int[][] arr, int n) {
		int [][] temp = new int [arr.length][];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++)
			{
				temp[i][j]=arr[i][j];
			}
		}
		//Copy last colume in temp
		
		int []temp1=new int[temp.length];
		for(int i=0;i<temp1.length;i++)
		{
			temp1[i]=temp[i][temp[0].length-1];
		}
		
		//shift all colume toword the right by 1 colume
		//Starting from 2nd last
		for(int i=0;i<temp.length;i++)
		{
			for(int j=temp[0].length-2;j<=0;j--)
			{
				temp[i][j+1]=temp[i][j];
			}
		}
		
		//copy the temp into oth column
		for(int i=0;i<temp.length;i++)
		{
			temp[i][0]=temp1[i];
		}
		return temp;
	}

	public static int[] convertTo1DArray(int[][] arr) {
		int []temp=new int [arr.length*arr[0].length];
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++)
			{
				temp[cnt]=arr[i][j];
				cnt++;
			}
		}
		return temp;
	}

	