public class Numbers {
    public static void main(String[] args) {
        int sum=0;

        for (int i=0; i<101; i++){
            if (i%2!=0){
                continue;
            }

            System.out.println(i);
            sum+=i;
        }

        System.out.println("Suma wynosi: "+ sum);
    }
}
