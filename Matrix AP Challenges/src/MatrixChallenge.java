public class MatrixChallenge
	{

		static int [] [] myArray = {{3, 5, 9, 2, -1, 8, 13}, {-2, 5, 1, 11, 8, 2, 0}, {9, 1, -3, 4, 8, 4, 8}, 
					{6, 0, 0, -1, 4, 12, 7}, {2, 6, -1, 5, 3, 10, 0}, {2, 5, 1, 7, 9, 2, 3}, {-3, 1, 1, 4, 11, 12, 4}};
		static int highestNum = 0;
		static int lowestNum = 0;
		static int sum;
		static int divide;
		
		public static void main(String[] args)
			{
			maxNum();
			minNum();
			averageNum();
			
			}
		
			public static void maxNum()
			{
				for(int row = 0; row < myArray.length; row++) 
					{
					for(int col = 0; col < myArray[0].length; col++)
						{
							if (myArray[row][col] > highestNum)
								{
									highestNum = myArray[row][col];
								}
						}				
					}
				System.out.println("The highest number is " + highestNum);	
			}
			
			public static void minNum()
			{
				for(int row = 0; row < myArray.length; row++) 
					{
					for(int col = 0; col < myArray[0].length; col++)
						{
							if (myArray[row][col] < lowestNum)
								{
									lowestNum = myArray[row][col];
								}
						}				
					}
				System.out.println("The lowestNum number is " + lowestNum);
			}

			public static void averageNum()
			{
				for(int row = 0; row < myArray.length; row++)
					{
						for(int col = 0; col < myArray[0].length; col++)
							{
								sum += myArray[row][col];
							}
					}
				divide = sum / 49;
				System.out.println("The average is " + divide);
			}
			
	}