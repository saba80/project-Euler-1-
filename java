If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.





public class Bakhshpaziri {

    public static void main(String[] args) {
        int sum = 0 ;
        
        for( int a=1 ; a<1000 ; a++){
            if (a % 3 ==0 || a % 5 ==0) sum += a;
                            
                        
            }
       System.out.println(sum);
