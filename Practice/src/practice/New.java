package practice;

public class New {
	
public static void main(String[] args) {
	
	int a=153; //1+125+27=153
	int sum=0;   //
	
	for(int i=1;i<=a;) {  //1<=153   1<=15 1<=1
		for(int j=1;j<=a;j++) {// 1<=1   1<=1  1<=1
			int c=a%10;  //3  5  1
			
			int m = (int) Math.pow(c, 3); //3^3  5^3  1^1
			sum=sum+m; //27  27+125=152  152+1=153
			a=a/10;   //15   1  
		}
	}
	System.out.println(sum);
	if(sum==a){
	System.out.println("Armstrong number");
	}
	else{
	System.out.println("not Armstrong number");	
	}
}

}
