package Buoi9;

public class Calculator extends Thread {
    public long sum1(){
        long sum = 0;
        for(int i = 0; i < 100000000; i++){
            sum += i;
        }
        return sum;
    }
    public long sum2(){
        long sum = 0;
        for(int i = 100000000; i < 200000000; i++){
            sum += i;
        }
        return sum;
    }
    public long sum3(){
        long sum = 0;
        for(int i = 200000000; i < 300000000; i++){
            sum += i;
        }
        return sum;
    }
    public long sum4(){
        long sum = 0;
        for(int i = 300000000; i < 400000000; i++){
            sum += i;
        }
        return sum;
    }
    public long sum5(){
        long sum = 0;
        for(int i = 400000000; i < 500000000; i++){
            sum += i;
        }
        return sum;
    }
    public long sum6(){
        long sum = 0;
        for(int i = 500000000; i < 600000000; i++){
            sum += i;
        }
        return sum;
    }
    public long sum7(){
        long sum = 0;
        for(int i = 600000000; i < 700000000; i++){
            sum += i;
        }
        return sum;
    }
    public long sum8(){
        long sum = 0;
        for(int i = 700000000; i < 800000000; i++){
            sum += i;
        }
        return sum;
    }
    public long sum9(){
        long sum = 0;
        for(int i = 800000000; i < 900000000; i++){
            sum += i;
        }
        return sum;
    }
    public long sum10(){
        long sum = 0;
        for(int i = 900000000; i <= 1000000000; i++){
            sum += i;
        }
        return sum;
    }
    @Override
    public void run(){
        System.err.println(sum1()+sum2()+sum3()+sum4()+sum5()+sum6()+sum7()+sum8()+sum9()+sum10());
    }
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        
        long start = System.currentTimeMillis();
        cal.start();
        long end = System.currentTimeMillis();
        System.out.println("Time is ms: " + (end - start));
    }       
}
