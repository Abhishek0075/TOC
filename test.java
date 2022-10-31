public class test {
    public static void main(String[] args) {
        String s="argsAAA@$)";
        int  count=0;
        for(int i=0;i<s.length();i++){
        if (!Character.isDigit(s.charAt(i))
            && !Character.isLetter(s.charAt(i))
            && !Character.isWhitespace(s.charAt(i))) {
                count++;
            }
        }
        System.out.println("The number of special characters in "+s+" is "+count);
        return;
    }
}
