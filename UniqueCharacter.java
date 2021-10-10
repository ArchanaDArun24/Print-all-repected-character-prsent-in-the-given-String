package stringInterview;
import java.util.*;
public class UniqueCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String x=sc.nextLine();
		x=x.toUpperCase();
		int n=x.length();
		char y[]=x.toCharArray();
		Map<Character,Integer> map=new HashMap<>();
		int i=0;
		while(i!=n)
		{
			if(map.containsKey(y[i])==false)
			{
				map.put(y[i], 1);
			}
			else
			{
				int old=map.get(y[i]);
				int nev=old+1;
				map.put(y[i],nev);
			}
			++i;
		}
		Set<Map.Entry<Character, Integer>> hmap=map.entrySet();
		for(Map.Entry<Character, Integer> data:hmap)
		{
			if(data.getValue()==1)
			{
				continue;
			}
			else
			{
				System.out.println(data.getKey()+" and "+data.getValue());
				//System.exit(0);(By the it give only character which is repected)
			}
		}
		
	}

}
