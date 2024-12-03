public class Main {
    public static void main(String[] args) {
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        MyString1 str = new MyString1(chars);

        System.out.println("Original: " + str);
        System.out.println("Char at index 1: " + str.charAt(1));
        System.out.println("Length: " + str.length());
        System.out.println("Substring (1, 4): " + str.substring(1, 4));
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Value of 123: " + MyString1.valueOf(123));
        System.out.println("To chars: " + new String(str.toChars()));

        MyString1 str2 = new MyString1(new char[]{'H', 'e', 'l', 'l', 'o'});
        System.out.println("Equals: " + str.equals(str2));
    }
}