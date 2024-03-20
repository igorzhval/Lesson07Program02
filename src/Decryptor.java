public class Decryptor {
    public String decryptMessage(String encryptedMessage, String key) {
        int keyAsInt = key.hashCode();
        StringBuilder decryptedMessage = new StringBuilder();
        for (int i = 0; i < encryptedMessage.length(); i++) {
            char encryptedChar = encryptedMessage.charAt(i);
            char decryptedChar = (char) (encryptedChar ^ keyAsInt);
            decryptedMessage.append(decryptedChar);
        }
        return decryptedMessage.toString();
    }
}