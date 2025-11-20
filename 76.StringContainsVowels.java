package Challenge;

class StringContainsVowels {

    public static void main(String[] args) {
        System.out.println(StringContainsVowels("Neha"));
        System.out.println(StringContainsVowels("Gunja"));
        System.out.println(StringContainsVowels("NEHA"));
        System.out.println(StringContainsVowels("XYz"));
    }
    public static boolean StringContainsVowels(String input){
        return  input.toLowerCase().matches(".*[aeio].*") ;
    }
}
