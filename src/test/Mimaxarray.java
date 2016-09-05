package test;

public class Mimaxarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nums[] = new int[5];
int i, min, max;
nums[0] = 155;
nums[1] = -1;
nums[2] = 15005;
nums[3] = -1882;
nums[4] = 1550054;

min = max = nums[0];

for (i=1; i < 5; i++) {
	if(nums[i]<min) min = nums[i];
	if (nums[i]>max) max = nums[i];
	
}
	System.out.println("Min is :" +min+ "\nMax is :" + max);	
	}

}
