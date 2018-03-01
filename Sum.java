public class Sum {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in());
        int N=sc.nextint();
        int num =N, sum = 0;

        for(int i = 1; i <= num; ++i)
        {
            // sum = sum + i;
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}
