public class methodPrime {
    static void isPrime(int num){
        if (num <= 1) {
            System.out.println(num+" not a prime number");
            return;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                System.out.println(num+" is not a prime number");
                return;
            }
            else{
                System.out.println(num+" is prime number");
            }
        }


    }
    public static void main(String[] args) {
        isPrime(5);
        isPrime(6);
        isPrime(-45);
        isPrime(0);
        isPrime(1);
    }
}
