public class forLoop {

    public static void main(String[] args){

        System.out.println("helloworld");

        float sum2 = 0;
        for(int n = 1; n < 1000000; n++){
            sum2 = sum2 + (1/((float)n * (float) n));
        }

        System.out.println("Small to big sum2: " + sum2);


        sum2 = 0;
        for(double n = 1000000; n >= 1; n--){
            sum2 = sum2 + (1/((float)n * (float) n));
        }

        System.out.println("Small to big sum2: " + sum2);
    }
}
