package Challenge;

class SecondLargestNumber {
    public static void main(String[] args) {
        int[] array={34,86,45,98,436,9};
        int SecondLargest= FindSecondLarge(array);
        System.out.println(SecondLargest);
    }

    public static int FindSecondLarge(int[] array){
        int largest= Integer.MIN_VALUE;
        int SecondLargest= Integer.MIN_VALUE;

        for(int i=1; i< array.length; i++){
            int num=array[i];
            if(largest < num){
                SecondLargest=largest;
                largest=num;
            }
        }
        return SecondLargest;
    }
}
