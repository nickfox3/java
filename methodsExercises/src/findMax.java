public class findMax {

    public static int findMax(int a, int b, int c) {
        int max;

        if (a>=b && a>=c) {
            max = a;
        } else if (b >=a && b>=c) {
            max = b;
        } else {
            max = c;
        }
        return max;

    }
    public static void main(String[] args) {
        int max1 = findMax(3,4,5);
        int max2 = findMax(10,13,17);
        int max3 = findMax(26,5,1);

        System.out.println(max1);
        System.out.println(max2);
        System.out.println(max3);
    }


}
