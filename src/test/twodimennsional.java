package test;

public class twodimennsional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int two [][] = new int [3] [4];
int t;
for (t =0; t < 3; t++) {
	for (int i =0; i < 4;  i++) {
		two [t][i] = (t*4) +i + 1;
		System.out.println(two [t][i] + "");
	}
}
	System.out.println();
	}

}
