package nwwalgorithm;

public class NWWAlgorithm {
	public static void main(String[] args) {
		System.out.println(nwd(28,24));
		System.out.println(nww(24,36));
	}
	
	static int nww(int a, int b){
		//(a / NWD(a,b)) * b
		return (a/nwd(a,b)) * b;
	}
	
	static int nwd(int a, int b){
		int result;
		while(b!=0){
			result = b;
			b= a%b;
			a = result;
		}
		return a;
	}
}
