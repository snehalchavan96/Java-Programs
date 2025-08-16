import java.util.HashSet;
import java.util.TreeSet;

public class HashSetAndTreeSet {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		hs.add("snehal");
		hs.add(20);
		hs.add('R');
		hs.add(28.09);
		// we can store heterogeneous type of data
		hs.add("ruchi");
		hs.add(20);
		//Duplicates are not allowed in HashSet
		System.out.println(hs);
		// It does not maintained Insertion order
		hs.add(null);
		System.out.println(hs);
		// It allows Null object
		
		
		HashSet hs1=new HashSet();
		hs1.add("Happy");
		hs1.add(290);
		hs1.add(10.30);
		
		System.out.println(hs.equals(hs1));
	
		
		
	
		
		TreeSet ts=new TreeSet();
		ts.add("asmita");
	//	ts.add(79);
		ts.add("hell");
		ts.add("joey");
		ts.add("sneha");
		// We can store only homogeneous type of data
		System.out.println(ts);	
		// It maintain the insertion order
		ts.add("sneha");
		ts.add("joey");
		System.out.println(ts);
		// It does not allow duplicate values
		//ts.add(null);
		System.out.println(ts);
		// It does not allow null objects Throw NullPointerException
	
		
		
		TreeSet ts1=new TreeSet();
		ts1.add("rucha");
		ts1.add("yup");
		ts1.add("sad");
		
		System.out.println(ts.equals(ts1));
		System.out.println();
	}
}
