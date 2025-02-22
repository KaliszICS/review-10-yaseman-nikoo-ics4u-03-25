public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(pyramid(4));
	}
	public static String pyramid(int num){
		String word="";
		for (int i=1 ;i <num+1; i++){
			int x=num-i;
			for (int z=1; z<num+1;z++){
				
				if (z<x){
					word = word+ " ";}
				else if(num==1){
					word="*";
				}
				else {
					word = word+ " *";
				x--;
				}
			}
			if (i<num-1){
			word = word +"\n";}
		}
		return word;
	}

}
