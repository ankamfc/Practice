import java.util.ArrayList;
import java.util.Random;



public class Apple {
	public static void main(String args[]){
		//String[] sente = {"a", "b"};
		////ArrayListex a= new ArrayListex();
		//ArrayList<String> k = a.addToSentence(sente, sente);
		
		//System.out.println(a.addToSentence(sente, sente));
		Lists l1 = new Lists("a");
		//l1.appendToTail(l1, "a");
		l1.appendToTail(l1, "b");
		l1.appendToTail(l1, "c");
		l1.appendToTail(l1, "d");
		l1.deleteNth(l1, 4);
		l1.display(l1);

		//CompressString c = new CompressString();
		
		//System.out.println(s);
		//Stringbuilderex s = new Stringbuilderex();
		/*System.out.println("Enter s string to parse");
		
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		uniqueCharsinString u = new uniqueCharsinString();
		Character t = u.isItUnique(str);
		System.out.println(t); */
		//IsAPowerOf i = new IsAPowerOf();
		//System.out.println(i.poweroff(8));
		// System.out.println(Math.abs(10));
		//DivideTwoNumbers d = new DivideTwoNumbers();
		//System.out.println(d.divide(20, 3));
		//Multiply m = new Multiply();
		//System.out.println(m.multiply2(3,2));
		//Random r = new Random();
		//System.out.println(r.nextInt(5));
		//DistanceBetween2Words d = new DistanceBetween2Words();
		//System.out.println(d.distance("Hey there my name my is akshay", "my", "akshay"));
		//DivideTwoNumbers d = new DivideTwoNumbers();
		//System.out.println(d.division(10, 3));
		//System.out.println(m.multiply(10,8));;
		//LongestSumSequence l = new LongestSumSequence();
		//int[] a = {1,-1,-3,-4,-5,-5};
		//System.out.println(Integer.parseInt(Integer.toBinaryString(8)));
		//System.out.println(Integer.parseInt("8", 2));
		//System.out.println(l.MaxSum(a));
		//AddandSub2Nos s = new AddandSub2Nos();
		//System.out.println(s.sub(35, 45));
		//NumbersToWords t = new NumbersToWords();
		//System.out.println(t.numbersToString(99));
		
		//ReverseString st = new ReverseString();
		
		//System.out.println(st.recursionReverse(str));
	//	st.RReverseString(str);
		
		//RemoveDuplicates r = new RemoveDuplicates();
		//r.duplicatesRemoved(str);
		//System.out.println(str);
		
		//CommonElement c = new CommonElement();
		//c.CommonElement1(A, i, B, j)
		//AnagramFinder a = new AnagramFinder();
		//System.out.println(a.isAnagram("abcd", "cda"));
		//char[] c = {'a','b',' ', 'c'};
		//DivideTwoNumbers d = new DivideTwoNumbers();
		//System.out.println(d.division(77, 10));
		//ReplaceSpaceBy r = new ReplaceSpaceBy();
		//r.Replace(c, c.length);
		
		/*int[][] a = new int[3][2];
		a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;
		a[2][0]=5;
		a[2][1]=6;
		
		ImageRotate i = new ImageRotate();
		i.Transpose(a, 3, 2);
		i.rotate(a, 3, 2);*/
		AnagramFinder a = new AnagramFinder();
		//System.out.println(a.isAnagram("abcd", "dbca"));
		
	Lists l = new Lists("1");
		l.appendToTail(l, "2");
		l.appendToTail(l, "3");
		l.appendToTail(l, "4");
		l.appendToTail(l, "5");
		l.appendToTail(l, "7");
		l.appendToTail(l, "7");
		//int[] p={8,9,9};
		//int[] q = {1,5,2};
		
		//Add1toArray add = new Add1toArray();
		
		
		//ArrayList<Integer> b = add.add1(p, q, 0);
		//for(int i =0; i <b.size(); i++)
		//System.out.print(b.get(i)+" ");
		
	//	List l1 = new List();
		//l1.appendToTail(l1, 1);
	//	l1.appendToTail(l1, 2);
	//	List l2 = new List();
	//	l2.appendToTail(l2, 1);
	//	l2.appendToTail(l2, 2);
		
		List l3 = new List();
		
		//l3.sumOfTwoLinkedLists(l1, l2);

		
		//l.display(l.recurse(l,null));
		//l.removeDuplicates(l);
		//l.addatNth(l, 8,"3.5");
		
			/*ArrayList<Integer> al = new ArrayList<Integer>();
			al.add(10);
			al.add(5);
			al.add(4);
			al.add(3);
			al.add(2);
			al.add(1);
			al.add(11);
			for(int i = 0; i< al.size(); i++){
				System.out.print(al.get(i) + " ");
			}
	//	System.out.println(al.indexOf(11));
		Heap h = new Heap();
		h.siftup(al);
		//System.out.println(al.indexOf(11));
		System.out.println();
		for(int i = 0; i< al.size(); i++){
			System.out.print(al.get(i) + " ");
		}
		//l.display(l.nthToLast(l, 3));
		//System.out.println(l.gotoNth(l, 3).data);
		//System.out.println(l.HalfReverse(l).data);
		//System.out.println();
		
		//l.display(l.deleteatNth(4, l));
		//System.out.println(l.getLength(l));
		//l.display(l);
		//l.removeDuplicates(l);
		//System.out.println();
		//l.removeDuplicates2(l);
		
		//l.display(l.nthToLast(l, 3));
		//l.display(l);
		
		/*List l1 = new List(1);
		l1.appendToTail(l1, 2);
		l1.appendToTail(l1, 3);
		//l1.appendToTail(l1, 3);
		
		List l2 = new List(1);
		l2.appendToTail(l2, 2);
		l2.appendToTail(l2, 3);
		//l2.appendToTail(l2, 3);
		
		List l3 = new List();
		l3.data=0;
		l3.sumOfTwoLinkedLists(l1, l2);*/
		
		
		
	}
}
