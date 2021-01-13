
public class BreakExample {
	
	void breakMethod() {
		System.out.println("Break Concept");
		for(int var1=0; var1<=10; var1++) {
			if(var1==6) {
				break;
				//when we call the break code after the the statement is not executed
			}
			System.out.println(var1);
		}
	}
	void contineMethod() {
		System.out.println("Contine Concept");
		for(int var1=0; var1<=10; var1++) {
			if(var1==6) {
				//System.out.println(var1);
				continue;/*continue statement continue the
				 				execution .here for the value 6 it never executed*/
			}
			System.out.println(var1);
		}
	}

	public static void main(String[] args) {
		BreakExample be=new BreakExample();
		be.breakMethod();
		be.contineMethod();

	}

}
