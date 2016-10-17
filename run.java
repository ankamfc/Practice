import java.util.ArrayList;
import java.util.PriorityQueue;


public class run{
	
	
	

	
	public static void main(String[] args){

		//SearchTree s8 = new SearchTree(8, null,null);
		
		SearchTree s1 = new SearchTree(1, null,null);

		SearchTree s2 = new SearchTree(2, s1, null);
		SearchTree s4 = new SearchTree(4, null, null);
		SearchTree s3 = new SearchTree(3, s2, s4);
		
		SearchTree s6 = new SearchTree(6, null,null);
		SearchTree s7 = new SearchTree(7, s6,null);
		SearchTree s5 = new SearchTree(5, s3,s7);
		//System.out.println("a");
		Multiply m = new Multiply();
		//System.out.println(m.multiply(4, 5));
		SearchTree s = new SearchTree();
		ArrayList a = new ArrayList();
		a.add(s5);
		/*a.add(s3);
		a.add(s7);
		a.add(s2);
		a.add(s4);
		a.add(s6);
		a.add(s1); */
		//s.byLevel(s5);
		s.levelOrder(a);
		//SentenceReverse s = new SentenceReverse();
		//s.reverse("My name is akhay");
		/*String str = "akshay hathwar";
		
		char[] c = str.toCharArray();
				
		for(int i=0; i< str.length();i++){
			if(c[i]==' ') c[i]='@';
			else continue;
		}
		
		for(int i=0; i< str.length();i++)
			System.out.print(c[i]); */
		
			
		//SearchTree s = new SearchTree();
		//System.out.println(s.height(null));
		//FirstRepeatedString f = new FirstRepeatedString();
		//System.out.println(f.repeatedString("abcxrrxabcrr"));
		//int[] a = {1,2,5,1,1,6,5,2};
		//Top3RepeatedNumbers t = new Top3RepeatedNumbers();
		//t.top3(a);
		// PrimeNumber p = new PrimeNumber();
		//System.out.println(p.isPrime(5));
		//p.allPrimesUsingPrimeSieve(10);
		//Character c = new Character('1');
		//System.out.println(c.charValue());
		//LeastCommonAncestorBST l = new LeastCommonAncestorBST();
		//SearchTree ancestor = l.LCA(s5,1, 8);
		//System.out.println(ancestor.data);
		//Distance2NodesinBST d = new Distance2NodesinBST();
		//System.out.println(d.distance(ancestor, s1, s8));
		RemoveCharacter r = new RemoveCharacter();
		//System.out.println(r.removeCharacter("abc", 'a'));
		//r.removeStr("amazon", "amazonnnn");
		//System.out.println(d.distance(s5, s1, s4));
		PrimeNumber p = new PrimeNumber();
		//p.PrimesInARange(10, 20);
		int [] i = {10,12,20};
		//for(int j=0; j<i.length;j++){
			//System.out.println(i[j]);
		//}
		//SearchTree s = new SearchTree();
		//Descendent d = new Descendent();
		//System.out.println(d.findDescendent(s5).data);
		//LeastCommonAncestorBST l = new LeastCommonAncestorBST();
		//System.out.println(l.LCA(s5, 1, 4).data);
		//System.out.println(s5.left.data);
		//System.out.println(s.findMin(s4).data);
		//System.out.println(s4.left.data);
		//System.out.println(s.countNumberOfNodes(s4));
		//s.remove(s4, s1);
		//System.out.println(s.deleteMinimum(s4).data);
		
	//	System.out.println(s4.left.data); 
		
		//StringPermutations s = new StringPermutations();
		//s.Permuations("ak");
		//Random r = new Random();
		//r.nextInt();
		//int a;
		//while(true){
		//a = (int) (Math.random()*(10-5)) + 5;
		//System.out.println(a);
		//if(a==7) break;
		//}
	//}
		//int a[]= {2,1,3,4,5};
		//SumOf2 s = new SumOf2();
		//s.traverse(a, 5);
		//StringPermutations s = new StringPermutations();
		//s.Permuations("abcd");
		//RemoveCharacter r = new RemoveCharacter();
		//r.removeCharacter("akshay", 'a');
		//char[] c1 = {'a', 'b', 'd'};
		//char[] c2= {'a', 'b'};
		//LongestPalindrome l = new LongestPalindrome();
		//System.out.println(l.lcs(c1, c2, 3, 2));
	//	Rand7Using5 r = new Rand7Using5();
	//	System.out.println(r.rand77());
		//int a =4;
		//System.out.println(64>>2);
		/*ArrayList<Integer> set= new ArrayList<>();
		set.add(10);
		set.add(20);
		set.add(30);
		SubSets s = new SubSets();
		s.getSubsets(set); */
		
		//String a = "abc";
		//System.out.println(a.substring(1));
		//WordFrequency w = new WordFrequency();
		//System.out.println(w.wordFrequencyHash("Hey Algorithms. algorithms and maths are seeing Algorithms", "algorithms"));
		
	//	SentenceReverse r = new SentenceReverse();
	//	r.reverse("Algorithms and mathematics");
		//NumberOfZeroesInFactorial l = new NumberOfZeroesInFactorial();
		//System.out.println(l.calculateZeros(10));
}
}
