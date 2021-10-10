// Java program to Sort a String Alphabetically
// Using toCharArray() method
// With using the sort() method

// Importing Arrays class from java.util package
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

interface Lamda
{
	void testLamda(int x);
}

class Test{
	
	static ArrayList<String> setList  = new ArrayList();
	public static void main(String [] args)
	{
		/*
		 * int arr [] = {3,5,3,1,3}; Arrays.sort(arr);
		 * Arrays.stream(arr).forEach(System.out::print);
		 * System.out.println(Arrays.toString(arr));
		 * 
		 * HashMap<Integer,Integer> map = new HashMap<>(); for (int i= 0;i <10; i++)
		 * map.put(i, i*10); System.out.println(map); List<Integer> PrimeNumbers =
		 * Arrays.asList(1,1,5, 7, 11,13);
		 * 
		 * // Creating a list of Odd Numbers List<Integer> OddNumbers = Arrays.asList(1,
		 * 3, 5);
		 * 
		 * // Creating a list of Even Numbers List<Integer> EvenNumbers =
		 * Arrays.asList(2, 4, 6, 8);
		 * 
		 * List<List<Integer>> finalList =
		 * Arrays.asList(PrimeNumbers,OddNumbers,EvenNumbers); List<Integer> flatMap =
		 * finalList.stream().flatMap(list ->
		 * list.stream()).collect(Collectors.toList()); System.out.println(flatMap);
		 * 
		 * int a = (int a,int b) -> {System.out.println(a+b);return a+b;}
		 */
		double startTime = System.currentTimeMillis();
		Lamda lObj = (int x) -> System.out.print(x);
		lObj.testLamda(5);
		System.out.println(System.currentTimeMillis()-startTime);
		
		HashSet<String> hSet = new HashSet<>();
		
		String testString = "abc";
		printPowerset(testString,0, "");
		printCombination(testString,0,testString.length());
		hSet.addAll(setList);
		System.out.println("ArrayList "+setList);
		System.out.println("HashSet "+hSet);
	}

	
	
	private static void printCombination(String testString, int l, int r) {
		if (l == r) {
			System.out.println(testString);
			setList.add(testString);
			return;
		}
		for (int i= l ; i<r ; i++)
		{
			testString= swap (testString,l,i);
			printCombination(testString, l+1, r);
			testString = swap (testString,l,i);
			
		}
		
	}

	private static String swap(String testString, int l, int i) {
		StringBuilder sb = new StringBuilder(testString);
		sb.setCharAt(i, testString.charAt(l));
		sb.setCharAt(l, testString.charAt(i));
		return sb.toString();
	}

	private static void printPowerset(String testString, int i, String currString) {
		if (i == testString.length())
		{
			System.out.println(currString);
			setList.add(currString);
			return ;
		}
		printPowerset(testString,i+1,currString+testString.charAt(i));
		printPowerset(testString, i+1, currString);
		
	}
}