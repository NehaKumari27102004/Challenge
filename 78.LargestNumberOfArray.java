package Challenge;

class LargestNumberOfArray {
    public static void main(String[] args) {
        int[] numbers={2,64,32,556,24,44};
        int largest=FindLargestNumber(numbers);
        System.out.println(largest);
    }

    public static int FindLargestNumber(int[] array){
        int largest=array[0];

        for(int i=1; i< array.length; i++){
            if(largest < array[i]){
                 largest = array[i];
            }
        }
        return largest;
    }
}
