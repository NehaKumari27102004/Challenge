package Challenge;

class SumOfArray {
    public static void main(String[] args) {
        int[] arr={2,4,8,75,20,9};
        int sum =0;
        for(int i : arr)
            sum +=i;
        System.out.println("The sum of arr : " + sum);
    }
}
