package Challenge;

class SumOfArrayElement {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6};
        int sum=CalculateSum(numbers);
        System.out.println(sum);
    }
    public static int CalculateSum(int[] array){
        int sum=0;
        for(int i=0; i<array.length; i++){
            sum=sum + array[i];
        }
        return sum;
    }
}
