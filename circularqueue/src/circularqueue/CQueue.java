

package circularqueue;

public class CQueue {
	int arr[];
	int F,R;

	CQueue(){
		arr =new int[1];
		F=R=-1;
	}
	CQueue(int size){
		arr =new int[size];
		F=R=-1;
	}

	public void sameAs(CQueue q) {
		this.F =q.F;
		this.R =q.R;
		int i= this.F;
		while(i!=this.R) {
			this.arr[i] = q.arr[i];
			i++;
			if(i == this.R) {
				
				break;
			}
			 if(i == this.arr.length-1) {
				 this.arr[i] = q.arr[i];
				i=0;
			}
		}
		if(i == -1) {
			return;
		}
		else {
		this.arr[i] = q.arr[i];
		}
	}
	
//	public void sameAs(CQueue q) {
//		int i,j,flag=0;
//		for(i =this.F,j=q.F;i<this.R-1 && j<q.R;i++,j++) {
//			if(this.arr[i] == q.arr[j]) {
//				flag++;
//			}
//			else {
//				flag=0;
//				
//			}
//		}
//		if(flag ==0) {
//			System.out.println("Not same");
//		}
//		else
//			System.out.println("Queue is same");
//	}
//	
//	
	public void insert(int value) {

		if((F==0)&&(R==arr.length-1)||(R==F-1) ) {
			System.out.println("Full");
		}
		else {
			//Some space
			if(R==arr.length-1) {
				R=0;
			}else
				R++;
			arr[R] = value;
			if(F==-1) {
				F=0;
			}
		}
	}

	public int delet() {
		int value=0;
		if(F==-1) { 
			System.out.println("Queue is Empty");
			//return 0;
		}
		else {
			value = arr[F];
			if(F== R)	{
				F=R=-1;
			}
			else {
				if(F==arr.length-1) F=0;

				else
					F++;
			}
		}
		return value;
	}

	public String toString() {
		String str="";
		int i=F;
		if(F==-1)  return str ="Empty";
		else {
			while(i!=R) {
				str +=arr[i]+",";
				if(i==arr.length-1) i=0;
				else i++;

			}
			str +=arr[i];
			return str;
		}
	}

}
