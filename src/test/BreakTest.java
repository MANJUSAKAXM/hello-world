package test;

public class BreakTest 
{
	public static void main(String[] args)
	{	
		outer:
			for(int i = 0; i<5; i++)
			{
				for(int j = 0; j<3; j++)
				{
					System.out.println("i的值是：" + i 	+ "j的值是：" + j);
					if(j==1)
					{
						break outer;
					}
				}
			}
			System.out.println("结束啦！");
			
		outer:
		for(int i = 0; i<5; i++)
		{
			for(int j = 0; j<3; j++)
			{
				System.out.println("i的值是：" + i 	+ "j的值是：" + j);
				if(j==1)
				{
					continue outer;
				}
			}
		}
		System.out.println("结束啦！");
		
		/*for(int i =0; i<3; i++)
		{
			System.out.println("i的值是：" + i);
			if(i==1)
			{
				continue;
			}
			System.out.println("continue后的输出语句是：");
		}*/
		
		/*for(int i = 0; i<5; i++)
		{
			for(int j = 0; j<3; j++)
			{
				System.out.println("i的值是：" + i 	+ "j的值是：" + j);
				if(j==1)
				{
					break;
				}
			}
		}
		System.out.println("结束啦！");*/
	}

}
