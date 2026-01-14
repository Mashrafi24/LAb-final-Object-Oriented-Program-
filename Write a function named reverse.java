
public class ReverseArrayExample {

    public static void reverse(double[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            double temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        double[] data = {5.8, 2.6, 9.0, 3.4, 7.1};

        reverse(data);

        for (double x : data) {
            System.out.print(x + " ");
        }
    }
}
