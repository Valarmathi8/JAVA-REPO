class PrimeNum
{
	public static void main(String ags[]){
	int num = 3;
	for (int i = 2; i <= num; i++){
	if(num % i != 0){
	System.out.println(num + " is a prime number");
	break;
	}
	else
	System.out.println(num + " is not a prime number");
	}
	}
}