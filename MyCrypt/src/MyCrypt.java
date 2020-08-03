public class MyCrypt {
    //StringToIntArray------------------------------------------------------------------------------------------------------
    static int[] stringToIntArray(String text) {
        char[] msgArr;
        msgArr = text.toCharArray();
        int[] intArr = new int[msgArr.length];

        for (int i = 0; i < msgArr.length; i++) {
            intArr[i] = (int) msgArr[i];
        }

        return (intArr);
    }

    //IntArrayToString------------------------------------------------------------------------------------------------------
    static String intArrayToString(int[] arr) {
        char[] msgArray = new char[arr.length];
        String text = "";
        for (int i = 0; i < arr.length; i++) {
            text += (char) arr[i];
        }

        return (text);
    }

    //encryptIntArray---------------------------------------------------------------------------------------------------------------
    static int[] encryptIntArray(int[] arr, int[] key) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = (((arr[i] + key[i % key.length]) - 32) % 95) + 32;
        }
        return (newArr);
    }

    //decryptIntArray---------------------------------------------------------------------------------------------------------------
    static int[] decryptIntArray(int[] arr, int[] key) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = (((arr[i] - key[i % key.length]) - 32 + 190) % 95) + 32;
        }
        return (newArr);
    }
    //encryptMsg---------------------------------------------------------------------------------------------------------------
    public static String encryptMsg(String msg, String key) {

        return (intArrayToString((encryptIntArray(stringToIntArray(msg), stringToIntArray(key)))));
    }
    //decryptMsg---------------------------------------------------------------------------------------------------------------
    public static String decryptMsg(String msg, String key) {

        return (intArrayToString((decryptIntArray(stringToIntArray(msg), stringToIntArray(key)))));
    }

    //Main------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        String message = "___";
        String password = " !";

        String encrypted = encryptMsg(message, password);
        System.out.println(encrypted);

        String decrypted = decryptMsg(encrypted, password);

        System.out.println(decrypted);

        int[] dad = encryptIntArray(stringToIntArray(message), stringToIntArray(password));

        for (int i = 0; i < dad.length; i++) {
            System.out.println(dad[i]);

        }

        System.out.println(intArrayToString(dad));

        int[] decryptdad = decryptIntArray(dad, stringToIntArray(message));

        for (int i = 0; i < dad.length; i++) {
            System.out.println(decryptdad[i]);
        }
    }
}
