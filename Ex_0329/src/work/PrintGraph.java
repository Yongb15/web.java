package work;

import java.util.Random;

public class PrintGraph {

	Random rd = new Random();
	
	public PrintGraph(int arr[])
	{
//		String[] gr = {"", "", "", "", "", "", "", "", "", ""};
		String[] gr = new String [10];
		
		
		int[] count = new int[10];

		for(int i = 0; i < 100; i++)
		{
			arr[i] = rd.nextInt(10);
		}
		
		for(int i = 0; i < gr.length; i++)
		{
			gr[i] = "";
		}
		
		for(int i = 0; i < 100; i++)
		{
			switch(arr[i]) 
			{
			case 0:
				count[0]++;
				gr[0] += "#";
				break;
			case 1:
				count[1]++;
				gr[1] += "#";
				break;
			case 2:
				count[2]++;
				gr[2] += "#";
				break;
			case 3:
				count[3]++;
				gr[3] += "#";
				break;
			case 4:
				count[4]++;
				gr[4] += "#";
				break;
			case 5:
				count[5]++;
				gr[5] += "#";
				break;
			case 6:
				count[6]++;
				gr[6] += "#";
				break;
			case 7:
				count[7]++;
				gr[7] += "#";
				break;
			case 8:
				count[8]++;
				gr[8] += "#";
				break;
			default :
				count[9]++;
				gr[9] += "#";
				break;
			}
		}
		for(int i = 0; i < 10; i++)
		{
			System.out.println(i + "의 갯수 : " + gr[i] + " " + count[i]);
		}
	}
	
	public String print(char ch, int num)
	{
		char[] val = new char[num];
		String str = "";
		
		for(int i = 0; i  <val.length; i++)
		{
			str += val[i] = ch;
		}
		return str;
	}
}
