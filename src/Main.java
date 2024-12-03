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

        System.out.println("\n");
        char[] chars1 = {'h', 'e', 'l', 'l', 'o'};
        MyString2 str3 = new MyString2(chars1);

        System.out.println("Original: " + str3);
        System.out.println("Substring (2): " + str3.substring(2));
        System.out.println("Uppercase: " + str3.toUpperCase());
        System.out.println("Character array: " + new String(str3.toChars()));
        System.out.println("Value of true: " + MyString2.valueOf(true));
        System.out.println("Value of false: " + MyString2.valueOf(false));

        System.out.println("\n");
        MyCharacter ch1 = new MyCharacter('a');
        MyCharacter ch2 = new MyCharacter('A');

        System.out.println("Character value of ch1: " + ch1.charValue());
        System.out.println("Comparison of ch1 and ch3: " + ch1.compareTo(ch2));
        System.out.println("Are ch1 and ch3 equal: " + ch1.equals(ch2));
        System.out.println("Is 'a' a digit: " + ch1.isDigit());
        System.out.println("Is '1' a digit: " + MyCharacter.isDigit('1'));
        System.out.println("Is 'a' a letter: " + MyCharacter.isLetter('a'));
        System.out.println("Is '1' a letter or digit: " + MyCharacter.isLetterOrDigit('1'));
        System.out.println("Is 'a' a lowercase letter: " + MyCharacter.isLowerCase('a'));
    }
}