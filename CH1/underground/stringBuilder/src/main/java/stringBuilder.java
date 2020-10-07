public class stringBuilder {

    private static final int BUFFER_MULTIPLIER = 2;
    private static final int DEFAULT_BUFFER_SIZE = 16;

    private char[] str;
    private int size;
    private int charCount;

    public stringBuilder() {
        this.size = DEFAULT_BUFFER_SIZE;
        this.str = new char[DEFAULT_BUFFER_SIZE];
    }

    public stringBuilder(int size) {
        this.size = size;
    }

    public stringBuilder(String str) {
        this.str = str.toCharArray();
    }

    public stringBuilder(char[] str) {
        this.str = str;
    }

    public stringBuilder append(String str) {
        while (resizeRequired(str)) {
            resizeBuffer(str);
        }
        addString(str);
        updateCharCount(str.length());
        return this;
    }

    private void addString(String str) {
        System.arraycopy(str.toCharArray(), 0, this.str, this.charCount, str.length());
    }

    private void updateCharCount(int length) {
        this.charCount += length;
    }

    private boolean resizeRequired(String newInput) {
        return this.charCount + newInput.length() > this.size;
    }

    private void resizeBuffer(String str) {
        int oldSize = this.size;
        this.size *= BUFFER_MULTIPLIER;
        char[] newStr = new char[this.size];
        System.arraycopy(this.str, 0, newStr, 0, oldSize);
        this.str = newStr;
    }

    @Override
    public String toString() {
        return String.valueOf(str);
    }
}
