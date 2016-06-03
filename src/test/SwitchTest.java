package test;

public class SwitchTest {
	public static void main(String[] args){
	//声明变量season
	String season="秋天";
	//执行Switch分支语句
	switch (season){
		case "春天":
			System.out.println("春暖花开");
			break;
		case "夏天":
			System.out.println("烈日炎炎");
			break;
		case "秋天":
			System.out.println("秋高气爽");
			break;
		case "冬天":
			System.out.println("白雪皑皑");
			break;
		default:
			System.out.println("季节输入错误");
		}
	}
}
