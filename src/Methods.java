public class Methods {

    /* This class contains two methods
    1. Encryption
    2. Decryption
     */

    public int[] encryption (String message, int shift) {
        // Created an empty array that stores encrypted message
        int[] cipher = new int[message.length()];
        for (int i = 0; i < message.length(); i++) {
            int asciiValue = 0;
            asciiValue = message.charAt(i);
            asciiValue = asciiValue + shift;
            cipher[i] = asciiValue;
        }
        return cipher;
    }

    public StringBuffer decryption (int[] cipher, int shift) {
        StringBuffer message = new StringBuffer();
        for (int i = 0; i < cipher.length; i++) {
            char characterValue = (char) (cipher[i] - shift);
            message.append(characterValue);
        }
        return message;
    }
}
