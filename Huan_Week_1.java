class Huan_Week_1
{
	public static void main(String[] args)
	{
		System.out.println("hello world");
		System.out.println("接下来是我的第一个小程序");

		System.out.println("----------------------------");

		System.out.println("九九乘法");
		for(int x=1;x<=9;x++)
		{
			for(int y=1;y<=x;y++)
			{
				System.out.print(y+"*"+x+"="+y*x+"  ");
			}
			System.out.println( );
		}

		System.out.println("----------------------------");

		System.out.println("进制转换");
		System.out.println("60="+Integer.toBinaryString(60));
		int a=60,temp,a1,a2;
		temp=60>>>4;
		a1=temp&15;
		if(a1<9)
		{
			System.out.print("60=0x"+a1);
		}
		else
		{
			System.out.print("60=0x"+(char)a1+'A');
		}
		a2=60&15;
		if(a2<9)
		{
			System.out.println(a2);
		}
		else
		{
			System.out.println((char)(a2-10+'A'));
		}

		System.out.println("----------------------------");

		int b=7;
		if(b>12||b<1)
			System.out.println("Please re-enter")
		else if(b>=3&&b<=5)
			System.out.println(b+"month is Spring");
		else if(b>=6&&b<=8)
			System.out.println(b+"month is Summer");
		else if(b>=9&&b<=11)
			System.out.println(b+"month is Autumn");
		else
			System.out.println(b+"month is Winter");

	}
}