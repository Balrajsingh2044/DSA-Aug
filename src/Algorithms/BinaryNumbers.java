public class BinaryNumbers {
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
        int num = 4;
        System.out.println(decToBinary(num));
    }
}
