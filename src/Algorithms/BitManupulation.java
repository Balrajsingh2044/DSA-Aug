public class BitManupulation {
    static int decToBinary(int dec){
        int ans = 0;
        int pow = 1;

        while(dec > 0){
            int rem = dec % 2;
            dec /= 2;

            ans += (rem * pow);
            pow *= 10;
        }

        return ans;
    }
    public static void main(String[] args) {
        int num1 = decToBinary(3);
        int num2 = decToBinary(4);

        System.out.println(num1 & num2);
    }
}
