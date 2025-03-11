public class _13_Palindrom {
    public static void main(String[] args) {
        String inputString = "Ga3daG";
        StringBuffer stringBuffer = new StringBuffer(inputString);
        String reverseString = stringBuffer.reverse().toString();
        if(inputString.equals(reverseString))
            System.out.println("Its palindrom!");
        else
            System.out.println("Its Not a Palindrom!");
    }
}
