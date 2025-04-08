public class Largest {
    public static void main(String[] args) {
        int arr[] =  {7, 8, 15, 78, 89};
        // int arr[] = {45, 78, 32, 99, 81};
        int max = 0;
        int s_max = 0;

        for (int i = 0; i<arr.length-1; i++){

            if (max < arr[i]){
                s_max = max;
                max = arr[i];
            }
        }
        System.out.println(s_max);

    }
}
