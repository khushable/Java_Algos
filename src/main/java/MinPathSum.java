import java.util.Arrays;

public class MinPathSum {

	public static void main(String[] args) {
		int[][] grid = new int[3][4];
		for(int i = 0;i<grid.length;i++){
			for(int j=0;j<grid[i].length;j++){
				grid[i][j] = (int)(Math.random()*10);
			}
		}
		System.out.println(Arrays.deepToString(grid));
		;
		
	}

	
}
