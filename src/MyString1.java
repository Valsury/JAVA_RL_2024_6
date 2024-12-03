public class MyString1 {
    private char[] chars;

    // Конструктор, принимающий массив символов
    public MyString1(char[] chars) {
        this.chars = new char[chars.length];
        System.arraycopy(chars, 0, this.chars, 0, chars.length);
    }

    // Метод для получения символа по индексу
    public char charAt(int index) {
        if (index < 0 || index >= chars.length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return chars[index];
    }

    // Метод для получения длины строки
    public int length() {
        return chars.length;
    }

    // Метод для получения подстроки
    public MyString1 substring(int begin, int end) {
        if (begin < 0 || end > chars.length || begin > end) {
            throw new IndexOutOfBoundsException("Invalid substring range");
        }
        char[] subChars = new char[end - begin];
        System.arraycopy(chars, begin, subChars, 0, end - begin);
        return new MyString1(subChars);
    }

    // Метод для преобразования строки в нижний регистр
    public MyString1 toLowerCase() {
        char[] lowerChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            lowerChars[i] = Character.toLowerCase(chars[i]);
        }
        return new MyString1(lowerChars);
    }

    // Статический метод для преобразования числа в строку
    public static MyString1 valueOf(int i) {
        return new MyString1(Integer.toString(i).toCharArray());
    }

    // Метод для получения массива символов
    public char[] toChars() {
        char[] copy = new char[chars.length];
        System.arraycopy(chars, 0, copy, 0, chars.length);
        return copy;
    }

    // Метод для сравнения двух объектов MyString1
    public boolean equals(MyString1 obj) {
        if (obj == null || this.chars.length != obj.chars.length) {
            return false;
        }
        for (int i = 0; i < chars.length; i++) {
            if (this.chars[i] != obj.chars[i]) {
                return false;
            }
        }
        return true;
    }

    // Переопределение метода toString для удобства вывода
    @Override
    public String toString() {
        return new String(chars);
    }
}