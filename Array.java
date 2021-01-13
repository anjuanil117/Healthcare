
public class ArraySize {
	
	
	void incrArr() {
		
		int[] copyFrom= {1,2,3,4,5,5,6,7};
		
		System.out.println("Before increasing array\n");
		for(int val=0;val<copyFrom.length;val++) {
			System.out.print(copyFrom[val]);
			
		}
		int[] temp=copyFrom;
		copyFrom=new int[10];
		System.out.println("\nafter increasing array");
		System.out.println();
		for(int val=0;val<copyFrom.length;val++) {
			System.out.print(copyFrom[val]+"");
			

		System.arraycopy(temp, 0, copyFrom, 0,temp.length);
		System.out.println();
		for(int val1=0; val1<copyFrom.length; val1++) {
			System.out.println(copyFrom[val1]);
		
	}
		}
	}
		
		public static void main(String[] args) {
		
		new ArraySize().incrArr();
		
		
	}
}
