public class MyString2 {
    private char[] chars;


    public MyString2(char[] chars) {
        this.chars = new char[chars.length];
        System.arraycopy(chars, 0, this.chars, 0, chars.length);
    }


    public MyString2 substring(int begin) {
        if (begin < 0 || begin >= chars.length) {
            throw new IndexOutOfBoundsException("Invalid start index for substring");
        }
        char[] subChars = new char[chars.length - begin];
        System.arraycopy(chars, begin, subChars, 0, chars.length - begin);
        return new MyString2(subChars);
    }


    public MyString2 toUpperCase() {
        char[] upperChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            upperChars[i] = Character.toUpperCase(chars[i]);
        }
        return new MyString2(upperChars);
    }


    public char[] toChars() {
        char[] copy = new char[chars.length];
        System.arraycopy(chars, 0, copy, 0, chars.length);
        return copy;
    }


    public static MyString2 valueOf(boolean b) {
        return b ? new MyString2(new char[]{'t', 'r', 'u', 'e'}) : new MyString2(new char[]{'f', 'a', 'l', 's', 'e'});
    }


    @Override
    public String toString() {
        return new String(chars);
    }
}