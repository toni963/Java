/**
 *
 * @author Antonio Jozinoviæ
 */
import java.util.*;
import java.lang.*;

class zad3{


static int isprintajsvesljedbene(int N[], int i, ArrayList<Integer> v, int B){
	
	if (B == 0){
		return (int)v.size();
	}

	if (B < 0)
		return -1;
		
	if (i == 0)
		return -1;

	int x = isprintajsvesljedbene(N, i - 1, v, B);

	v.add(N[i - 1]);
	
	int y = isprintajsvesljedbene(N, i, v, B - N[i - 1]);
	v.remove(v.size() - 1);
	
	return Math.min(x, y);
}

static int printAllSubsets(int N[], int B, int sum)
{
	ArrayList<Integer> v = new ArrayList<>();
	return isprintajsvesljedbene(N, B, v, sum);
}


public static void main(String[] args)
{
	int N[] = { 2, 4, 5};
	int B = 3;
	int i = N.length;
	
	System.out.println(printAllSubsets(N, i, B));
}
}
