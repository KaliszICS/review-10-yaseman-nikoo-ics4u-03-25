public class PracticeProblem {

	public static void main(String args[]) {
		
	}
	public static String pyramid(int num){
		String word="";
		for (int i=1 ;i <num; i++){
			int x=num-i;
			for (int z=1; z<num+1;z++){
				
				if (z<x){
					word = word+ " ";}

				else if (z>x) {
					word = word+ " *";
				}
			}
			if (i<num){
			word = word +"\n";}
		}
		for (int z=0; z<num-1; z++){
			word = word + "* ";
		}
		word = word +"*";
		return word;
	}
	public static String square(int num){
		String word="";
		for (int i=0;i<(num); i++){
			for(int z=0;z<num;z++){
				if (i==0 || i == num-1){
					word= word + "*";
				}
				else{
					if (z==0 || z==num-1){
						word = word +"*";
					}
					else{
						word= word+" ";
					}
				}
			}
			if (i<num-1){
			word=word + "\n";}
		}
		return word;
	}
	public static boolean hasLowercase(String word){
		boolean answer=false;
		for (int i=0; i<word.length();i++){
			if ((word.charAt(i)).isLowerCase()){
				answer=true;
			}
		}
		return answer;
	}
}
