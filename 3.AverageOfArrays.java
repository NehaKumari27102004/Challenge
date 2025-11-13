package Challenge;

class AverageOfArrays {
    public static void main(String[] args) {
        int [] arr={5,10,15,20,25,30,35,40,45,50,55,60};
        int sum=0;

        for(int i=0; i< arr.length; i++){
            sum = sum + arr[i];
        }

        float average= sum / arr.length;
        System.out.println("The average of the number are:" + average);

    }
}
