class MapDataException extends Exception {
	public MapDataException(String value)
	{
		super(value);
	}
}


public class Example02 {
	
	public static int[][] searchPath(int sx, int sy, int[][] map) throws MapDataException
	{
		int x = sx;
		int y = sy;
		int[][] result = new int[10][10];
		
		boolean met1 = false;
		
		// 1. 별도의 메모리 할당
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				if(map[i][j] != 0 &&
				   map[i][j] != 1 &&
				   map[i][j] != 2    )
				{
					throw new MapDataException("잘못된 데이터입니다.");
				}
				result[i][j] = map[i][j];
			}
		}
		
		// 2. 경로 찾기
		while(true)
		{
			// 0
			if(result[y][x] == 0)
			{
				result[y][x] = 9;
				x++;
				
				if(met1 == true)
				{
					met1 = false;
				}
			}
			
			// 1
			else if(result[y][x] == 1)
			{
				if(met1 == true)
				{
					result = null;
					break;
				}
				
				x--;
				y++;
				met1 = true;
			}
			
			// 2
			else if(result[y][x] == 2)
			{
				break;
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		// 쥐가 먹이를(2) 찾는 알고리즘
		// 시작 : [1, 1]
		// 목표 : 2를 찾는것
		// 오른쪽으로 가다가 벽(1)을 만나면 아래로 간다.
		// (단, 아래로 내려갔을 떄에도 벽(1)이 있다면 종료시킨다.
		// 갔던 길을 9로 표시한다.
		
		// ==> 길이없는 경우 null 리턴
		// ==> 잘못된 데이터인 경우, 예외처
		
		int [][] map = {
				{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
				{1, 0, 0, 1, 0, 0, 0, 0, 0, 1},
				{1, 0, 0, 1, 1, 1, 0, 0, 0, 1},
				{1, 0, 0, 0, 0, 0, 0, 1, 0, 1},
				{1, 0, 0, 0, 0, 0, 0, 1, 0, 1},
				{1, 0, 0, 0, 0, 1, 0, 1, 0, 1},
				{1, 0, 0, 0, 0, 1, 2, 1, 0, 1},
				{1, 0, 0, 0, 0, 1, 0, 0, 0, 1},
				{1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
				{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
		};
		
		int [][] result_map;
		
		try
		{
			result_map = searchPath(1, 1, map);
		}
		
		catch (MapDataException e)
		{
			System.out.println(e.getMessage());
			return;
		}
		
		if(result_map == null)
		{
			System.out.println("경로가 없습니다.");
		}
		
		else 
		{
			for(int i = 0; i < 10; i++)
			{
				for(int j = 0; j < 10; j++)
				{
					System.out.print(result_map[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

}
