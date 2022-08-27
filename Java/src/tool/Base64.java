package tool;

public class Base64 {
    static void printBase64Encode(String text) {
        System.out.println("Encode String to Base64(RFC4648):\t\t\t" + java.util.Base64.getEncoder().encodeToString(text.getBytes()));
        System.out.println("Encode String to Base64(RFC4648_URLSAFE):\t" + java.util.Base64.getUrlEncoder().encodeToString(text.getBytes()));
        System.out.println("Encode String to Base64(RFC2045):\t\t\t" + java.util.Base64.getMimeEncoder().encodeToString(text.getBytes()));
    }

    static void printBase64Decode(byte[] bytes) {
        System.out.println("Decode Base64 to String:\t" + new String(java.util.Base64.getDecoder().decode(bytes)));
    }

    static void printBinaryEncode(String text) {

        StringBuilder builder = new StringBuilder();
        for(var data : text.getBytes()) {
            builder.append(String.format("%02X", data)); // Hex
        }

        System.out.println("Encode String to Hex:\t\t" + builder.toString());
    }

    static void printBinaryDecode(byte[] bytes) {
        System.out.println("Decode Hex to String:\t\t" + new String(bytes));
    }

    static void print(String text) {
        System.out.println(text);
        printBase64Encode(text);
        printBinaryEncode(text);
        printBase64Decode(java.util.Base64.getEncoder().encode(text.getBytes()));
        printBinaryDecode(text.getBytes());

        System.out.println("---------------------------------");
    }

    static void run() {

        print("abcdcba");
        print("abc");
        print("abcd");
        print("abcde");
        print("Hello World!");
        print("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=");
        print("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_=");
        print("ABCDEFGHIJKLMNOPQRSTUVWXYZ abcdefghijklmnopqrstuvwxyz 1234567890 `~!@#$%^&*()_-+=[{]}\\|;:'\",<.>/? \r\n\t all about text");
    }
}

/**
 *
 * YWJjZGVmZ2hpamtsbW5vcHFyc3R1dnd4eXogMTIzNDU2Nzg5MCBgfiFAIyQlXiYqKClfLSs9W3tdfVx8OzonIiw8Lj4vPw==
 *
 * YWJjZGVmZ2hpamtsbW5vcHFyc3R1dnd4eXogMTIzNDU2Nzg5MCBgfiFAIyQlXiYqKClfLSs9W3tdfVx8OzonIiw8Lj4vPw==
 *
 * YWJjZGVmZ2hpamtsbW5vcHFyc3R1dnd4eXogMTIzNDU2Nzg5MCBgfiFAIyQlXiYqKClfLSs9W3td
 * fVx8OzonIiw8Lj4vPw==
 *
 */