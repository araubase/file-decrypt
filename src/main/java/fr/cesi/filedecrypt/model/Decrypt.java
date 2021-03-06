package fr.cesi.filedecrypt.model;

/**
 * Model class that will perform decryption algorithm
 */
public class Decrypt {

    /**
     * Constructor
     */
    public Decrypt() {}

    /**
     * Decrypt a string with key through XOR algorithm
     * @param data
     * @param key
     * @return decryption result
     */
    public String decrypt(String data, String key) {
        StringBuilder sb1;
        char c1, c2, c3;
        int i, ii;

        ii = 0;
        sb1 = new StringBuilder();

        for (i = 0; i < data.length(); i++) {
            c1 = data.charAt(i);
            c2 = key.charAt(ii);
            c3 = (char)(c1 ^ c2);
            sb1.append(c3);

            ii++;

            if (ii == key.length()) {
                ii = 0;
            }
        }
        return sb1.toString();
    }

}
