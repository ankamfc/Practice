import java.util.HashMap;


public class Lists {
	
	public Lists first;
	
	public String data;
	public Lists next;
	
	public Lists(String s){
		this.data = s;
	}
	
	public static boolean isEmpty(Lists l){
		return l==null;
	}
	
	public void addtofront(String s){
		Lists newNode = new Lists(s);
		newNode.next = first;
	}
	
	public Lists addatNth(Lists l, int n, String s){
		Lists cur= l;
		Lists prev= l;
		if(l==null) return null;
		while(n>1 && cur!=null){
			prev=cur;
			cur=cur.next;
			n--;
		}
		Lists newNode = new Lists(s);
		newNode.next=cur;
		prev.next=newNode;
		newNode=cur;
		return l;
	}
	
	
	public Lists deleteatNth( int n,Lists l){
		
		Lists cur = l;
		Lists toBeDeleted = cur.next;
		if(n==1) return cur.next;
		while(n-1>0 && toBeDeleted.next!=null){
			cur = cur.next;
			toBeDeleted = cur.next;
			n--;
		}		
		cur.data=toBeDeleted.data;
		cur.next=toBeDeleted.next;
		return l;
	}
	
	public void deleteNth(Lists l, int n){
		Lists cur = l;
		Lists prev= cur;
		
		while(n>1){
			prev = cur;
			cur = cur.next;
			--n;
		}
		prev.next= cur.next;
		cur.next=null;
		
	}
	

	
	public void reverse(Lists n,Lists prev)
	{

		if( n==null) return;
		reverse(n.next,n);
		n.next=prev;
	}
	
	public Lists reverseIteration(Lists l){
		Lists result = null;
		Lists cur = l;
		Lists next;
		
		while(cur!=null){
			 next=cur.next;
			 cur.next=result;
			 result = cur;
			 cur = next;
		}
		return result;
	}
	
	
	
	
	
	
	
	public void appendToTail(Lists l, String s){
		
		Lists newNode = new Lists(s);
		
		if(l.next==null){
			
			l.next=newNode;
		}
		
		else{
			Lists n =l;
			
			while(n.next!=null){
				n=n.next;
			}
			//Lists newNode = new Lists(s);
		n.next=newNode;
		}
	}
	
	public void display(Lists l){
		Lists n =l;
		while(n!=null){
			System.out.print(n.data+" ");
			n= n.next;
		}
	}
	
	
	
	// remove duplicates from an unsorted linked lists
	
	public void removeDuplicates(Lists l){
		HashMap h = new HashMap();
		Lists n = l;
		Lists prev = null;
		
		
		while(n!=null){
			if(h.containsKey(n.data)){
				prev.next=n.next;
			}
			else{
				h.put(n.data, true);
				prev=n;
			}
			
			n = n.next;
		}
		}
	
	
	// remove dups from a sorted linked list
	
	public void removeDuplicates2(Lists l){
		Lists n = l;
		Lists prev = l;
		
		//if(l.next.data==l.data) l.next=null;
		
		
		while(n!=null){
			Lists runner = l;
			
			while(runner!=n){
				if(runner.data==n.data){
					prev.next=n.next;
					n=prev.next;
					break;
				}
				runner=runner.next;
				
				}			
					n = n.next;		
			}
			}
			
		
	
	
	
	
	
	public Lists nthToLast(Lists l, int N){
		
		Lists n = l;
		Lists prev = l;
		int count=1;
		
		if(l.next==null) return l;
		
		while(n.next!=null && count!=N){
			prev=n;
			n=n.next;			
			count++;
		}
		
		return n;
	}
	
	
	

	public void deleteNthNodeWithConstraint(Lists c){
		if(c.next== null||c==null) return;
		
		Lists actuallyDeleted = c.next;
		actuallyDeleted.data=c.data;
		c.next=actuallyDeleted.next;		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int getLength(Lists l){
		int length =0;
		while(l!=null){
			l=l.next;
			length++;
		}
		return length;
	}
		
	// 1-2-3-4-5-6-7  7-1-6-2-5-3-4
	
	/*public void halfReverse(Lists l){
		int lastpointer = l.getLength(l);
		int first pointer = l.first
		Lists n=l;
		Lists last=l.gotoNth(l, l.getLength(l));
		
	}
	
	
	public Lists gotoNth(Lists l, int m){
		Lists n=l;
		while(m>1){
			n=n.next;
			--m;
		}
		return n;
	}
	
	
	/*public Lists HalfReverse(Lists l){
		
		Lists last=l.gotoNth(l, l.getLength(l));
		last.next=l;
		
		Lists result=null;
		
		Lists prev=l.gotoNth(l, l.getLength(l)/2-1);
		Lists mid=l.gotoNth(l, l.getLength(l)/2);
		Lists cur=mid;
		Lists next=mid;
		
		
		while(prev!=null){
		next=cur.next;
		cur.next=result;
		result=cur;
		cur=next;
		}
			
		return result;
	}*/
	
	
	
	
	
	
	
	

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Lists getNext() {
		return next;
	}

	public void setNext(Lists next) {
		this.next = next;
	}
	
}
