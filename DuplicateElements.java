package BasicPrograms;

public class DuplicateElements {
	
	public static void main(String[] args) {
		
		int[] a=new int[] {2,5,4,3,2,4,6,7,5,8,7,6,4};
		for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				System.out.println(a[j]);
			}
		}
		}
		}

}
