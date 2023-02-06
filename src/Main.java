public class Main {

    public static void main(String[] args) {
	int numToExamine = 25;
	int remainder;
	remainder = numToExamine % 2; // this divides numToExamine by 2 and stores the remainder. If it is 1, numToExamine is odd. If it is 0, numToExamine is even because there is no remainder
	if (remainder == 1) System.out.println("The value is odd"); // this says that if remainder = 1, the output tells us that the value is odd
	if (remainder == 0) System.out.println("The value is even"); // this says that if remainder = 0, the output tells us that the value is even



    }
}
