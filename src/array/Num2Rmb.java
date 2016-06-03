package array;

import java.util.Arrays;

public class Num2Rmb
{
	private String[] hanArr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
	private String[] unitArr = {"十","百","千"};
	/**
	 * 把一个浮点数分解成整数部分和小数部分字符串
	 * @param num 需要被分解的浮点数
	 * @return 分解出来的整数部分和小数部分。第一个数组元素是整数部分，第二个数组元素是小数部分
	 */
	private String[] divide(double num)
	{
		//将一个浮点数强制类型转换为long型，即得到他的整数部分
		long zheng = (long)num;
		//浮点数减去整数部分，得到小数部分，小数部分乘以100后再取整得到两位小数
		long xiao = Math.round((num-zheng) * 100);
		//下面用了两种方法把整数转换成字符串
		return new String[] {zheng + "", String.valueOf(xiao)};
	}
	/**
	 * 把一个四位的数字字符串变成汉字字符串
	 * @param numStr 需要被转换的四位数字字符串
	 * @return 四位的数字字符串被转换成汉字字符串
	 */
	public String toHanStr(String numStr)
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
		System.out.println(Arrays.toString(nr.divide(263711125.132)));
		System.out.println(nr.toHanStr("1314"));
	}
	
}
