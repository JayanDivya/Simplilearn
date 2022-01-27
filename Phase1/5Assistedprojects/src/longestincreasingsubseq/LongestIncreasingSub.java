package longestincreasingsubseq;
import java.util.Arrays;
public class LongestIncreasingSub {
		static int m_ref; 
		static int lis(int arr[], int n)
		{
			if (n == 1)
				return 1;
			int res, max_ending_here = 1;			
			for (int i = 1; i < n; i++) {
				res = lis(arr, i);
				if (arr[i - 1] < arr[n - 1] && res + 1 > max_ending_here)
					max_ending_here = res + 1;
			}			
			if (m_ref < max_ending_here)
				m_ref = max_ending_here;			
			return max_ending_here;
		}		
		static int list(int arr[], int n)
		{			
			m_ref = 1;			
			lis(arr, n);			
			return m_ref;
		}
		public static void main(String args[])
		{
			int arr[] = {10, 22, 9, 20, 11, 50, 69, 60};
			int n = arr.length;
			System.out.println("Original Array:"+Arrays.toString(arr));
			System.out.println("Length of lis is " + lis(arr, n));
		}
	}
