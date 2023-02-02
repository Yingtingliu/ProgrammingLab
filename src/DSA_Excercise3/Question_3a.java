package DSA_Excercise3;

public class Question_3a {
	
	public boolean isSort(Comparable[] a) {
		for(int i=0; i<a.length; i++) {
			if(a[i].compareTo(a[i+1])<0) {
				return false;
			}			
		}
		return true;
	}

}
