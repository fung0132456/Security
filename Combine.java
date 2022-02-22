import java.util.Scanner;

public class Combine {

    public static void main(String[] args) {
        // For the users choosing Encryption or Decryption
        System.out.print("1. Encryption\n2. Decryption\nChoose(1,2): ");
        try (Scanner in = new Scanner(System.in)) {
            int choice = in.nextInt();

            // Encryption start
            if (choice == 1) {
                System.out.println("1Encryption");
                // to pass empty line to scanner to avoid erros
                in.nextLine();

                System.out.println("Message can only be lower or uppercase alphabet");
                System.out.print("Enter Message: ");
                String msg = in.nextLine();

                // 26 is the length of alphabet
                System.out.print("Enter key (0-25): ");
                int key = in.nextInt();

                String encrypMsg = "";

                for (int i = 0; i < msg.length(); i++) {
                    // Again casting, ignoring space, casting int to char
                    if ((int) msg.charAt(i) == 32) {
                        encrypMsg += (char) 32;

                    } else if ((int) msg.charAt(i) + key > 122) {
                        int temp = ((int) msg.charAt(i) + key) - 122;
                        encrypMsg += (char) (96 + temp);

                    } else if ((int) msg.charAt(i) + key > 90 && (int) msg.charAt(i) < 96) {
                        int temp = ((int) msg.charAt(i) + key) - 90;
                        encrypMsg += (char) (64 + temp);

                    } else {
                        encrypMsg += (char) ((int) msg.charAt(i) + key);

                    }
                }

                // Using ASCII in this, with the Caesar Cipher message
                System.out.println(encrypMsg);
                String msg2 = encrypMsg;
                System.out.print("Enter key: ");
                String skey = in.next();

                String encrypHexa = "";
                int keyItr = 0;
                // XOR encryption start
                for (int a = 0; a < msg2.length(); a++) {

                    // XOR Operation
                    int temp = msg2.charAt(a) ^ skey.charAt(keyItr);

                    encrypHexa += String.format("%02x", (byte) temp);
                    keyItr++;
                    if (keyItr >= skey.length()) {
                        // Once all of key's letters are used, repeat the key
                        keyItr = 0;
                    }

                }
                // Finally print the encrypted text to the users
                System.out.println("Encrypted Text: " + encrypHexa);

            } else if (choice == 2) {
                System.out.println("Decryption");
                System.out.print("Enter message: ");
                in.nextLine();

                String msg = in.nextLine();

                System.out.print("Enter key: ");
                String key = in.nextLine();

                String hexToDeci = "";
                for (int i = 0; i < msg.length() - 1; i += 2) {
                    // splitting hex into a pair of two
                    String output = msg.substring(i, (i + 2));
                    int decimal = Integer.parseInt(output, 16);
                    hexToDeci += (char) decimal;
                }

                // decryption
                String decrypText = "";
                int keyItr = 0;
                for (int i = 0; i < hexToDeci.length(); i++) {
                    // XOR Operation
                    int temp = hexToDeci.charAt(i) ^ key.charAt(keyItr);

                    decrypText += (char) temp;
                    keyItr++;

                    if (keyItr >= key.length()) {
                        // once all of key's letters are used, repeat the key
                        keyItr = 0;
                    }

                }
                System.out.println("Decrypted Text: " + decrypText);

                /**
                 * After the XOR Decryption, now is moving to the CaesarCipher Decryprtion.
                 * First the user need to enter the key(0-25) that enter before at the
                 * Encryption Part.
                 * And the encryption text(encrypText) is the decrypted text of XOR .
                 */

                System.out.println("Enter key (0-25): ");
                int dcyptkey = in.nextInt();

                String decrypMsg = "";
                String encrypText = decrypText;
                for (int i = 0; i < encrypText.length(); i++) {

                    // type casting
                    if ((int) encrypText.charAt(i) == 32) {
                        decrypMsg += (char) 32;

                    } else if (((int) encrypText.charAt(i) - dcyptkey) < 97
                            && ((int) encrypText.charAt(i) - dcyptkey) > 90) {
                        // For lower case
                        int temp = ((int) encrypText.charAt(i) - dcyptkey) + 26;
                        decrypMsg += (char) temp;

                    } else if ((encrypText.charAt(i) - dcyptkey) < 65) {
                        // For upper case
                        int temp = ((int) encrypText.charAt(i) - dcyptkey) + 26;
                        decrypMsg += (char) temp;

                    } else {
                        decrypMsg += (char) ((int) encrypText.charAt(i) - dcyptkey);

                    }

                }
                // Finally print the original message to the users
                System.out.println(decrypMsg);

            } else {
                // If the users is not choose 1.Encryption or 2.Decryption, it will show the
                // "Wrong Choice" to remind the users
                System.out.println("Wrong Choice");
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}