public class GCD {


    public int getGcd(int a, int b) {
        if (b == 0){
            return a;
        }
        return getGcd(b, a % b);
    }




}
