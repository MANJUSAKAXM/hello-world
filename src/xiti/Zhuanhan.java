package xiti;

import array.Num2Rmb;

public class Zhuanhan 
{
	private String[] hanArr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
	private String[] unitArr = {"十","百","千"};
	private String toHanStr(String numStr)
	{
		String result = "";
		int numLen = numStr.length();
		for(int i = 0; i<numLen; i++)
		{
			int num = numStr.charAt(i) - 48;
			if(i!=numLen - 1 && num != 0)
			{
				result += hanArr[num] + unitArr[numLen - 2 - i];
			}
			else
			{
				result += hanArr[num];
			}
		}
		return result;
	}
	public static void main(String[] args)
	{
		Num2Rmb nr = new Num2Rmb();
		System.out.println(nr.toHanStr("1006.333"));
	}
			
}
