import java.util.*;

class Sort{
	public static int countBits(int n) {
		int sum = 0;
		while(n!=0) {
			if(n%2==1) {
				sum++;
			}
			n/=2;
		}
		return sum;
	}
	static int[] sortByBits(int arr[]) {
		int temp;
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr.length-1;j++) {
				if(countBits(arr[j])>countBits(arr[j+1])) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
}
public class LaunchIteratorExample {
	
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(1,100);
		System.out.println(ll);
		
		PriorityQueue pq = new PriorityQueue();
		pq.add(100);
		pq.add(50);
		pq.add(150);
		pq.add(25);
		pq.add(75);
		pq.add(125);
		pq.add(175);
		System.out.println(pq);
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		System.out.println(Collections.binarySearch(al, 30));
		
		ListIterator litr = al.listIterator(); //forward & backwards, add method permitted
		litr.next();
		litr.add(1000);
		System.out.println(al);
		
		Iterator itr = al.iterator(); //forward only, add method not permitted
		itr.next();
		System.out.println(itr.next());
		
		TreeSet ts = new TreeSet();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(15);
		ts.add(35);
		ts.add(90);
		ts.add(125);
		ts.add(180);
		ts.add(140);
		System.out.println(ts);
		
		int arr[] = {0,1,2,3,7,8,10,11};
		int[] result = Sort.sortByBits(arr);
		System.out.println(Arrays.toString(result));
	}

}
