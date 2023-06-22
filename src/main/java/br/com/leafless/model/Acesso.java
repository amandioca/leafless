package br.com.leafless.model;

import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

import br.com.leafless.db.Conexao;

public class Acesso {

    private static final String ALGORITHM = "AES";
    private static final String TRANSFORMATION = "AES/ECB/PKCS5Padding";
    private static final String KEY = "Leaƒl€sS@2O23";

    public static String encriptar(String param) {
        try {
            SecretKeySpec sks = new SecretKeySpec(KEY.getBytes(StandardCharsets.UTF_8), ALGORITHM);
            Cipher cipher = Cipher.getInstance(TRANSFORMATION);
            cipher.init(Cipher.ENCRYPT_MODE, sks);

            byte[] encryptedBytes = cipher.doFinal(param.getBytes(StandardCharsets.UTF_8));

            return Base64.getEncoder().encodeToString(encryptedBytes);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException
                | BadPaddingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    public static String decriptar(String param) {
        try {
            SecretKeySpec sks = new SecretKeySpec(KEY.getBytes(StandardCharsets.UTF_8), ALGORITHM);
            Cipher cipher = Cipher.getInstance(TRANSFORMATION);
            cipher.init(Cipher.DECRYPT_MODE, sks);

            byte[] decodedBytes = Base64.getDecoder().decode(param);
            byte[] decryptedBytes = cipher.doFinal(decodedBytes);

            return new String(decryptedBytes, StandardCharsets.UTF_8);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException
                | BadPaddingException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return null;
    }
}
