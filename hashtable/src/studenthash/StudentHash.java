package studenthash;

public class StudentHash {

	Student st[];
	public static int count=0;
	public StudentHash(int size) {
		st =new Student[size];
	}
	
	public void insertStd(Student data) {
		int key =(int) hashCode(data.getMob_no());
		
		if(st[key] == null) {
			//key palce is empty insert data
			st[key] =data;
		}
		else {//key is not empty
			while(true) {
				
				
				if(key == st.length) {
					key =0;
				}
				
				if(st[key] == null) {
					st[key] = data;
					count++;
					break;
				}
				key++;
			}
			
		}
	}

	private double hashCode(double mob_no) {
		double key=mob_no %100;
		key=key*key;
		key=key%st.length;
		return  key;
	}
	public String toString() {
		String str="";
		for(int i =0;i<st.length;i++) {
			str +=st[i]+"\n";
			
		}
		return str;
	}


	public void search(Student data) {
		int key = (int)hashCode(data.getMob_no());
		
		if(st[key] == data) {
			System.out.println(data+"\nat "+key);
		}
		else {
			while(true) {
				if(key == st.length)	key =0;
				
				if(st[key]== data) {
					System.out.println(data+"\nat "+key);
					
					break;
				}
				key++;
			}
		}
		
	}
}
