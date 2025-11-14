package Challenge;
class StringManipulation {
    public static void main(String[] args) {
        String firstName="Neha";
        String lastName="Kumari";
        String fullName= firstName.concat(" ").concat(lastName);
        System.out.println(fullName.toUpperCase());
        fullName.concat("");
    }
}
