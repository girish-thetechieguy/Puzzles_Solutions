public class _12_ReverseString {
    public static void main(String[] args) {
        String inputString=  "I am a good boy wit bad habit";
        StringBuffer stringBuffer = new StringBuffer(inputString);
        String outputString = stringBuffer.reverse().toString();
        System.out.println(outputString);
    }
}
