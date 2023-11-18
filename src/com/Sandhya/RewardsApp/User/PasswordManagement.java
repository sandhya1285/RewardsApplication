package com.Sandhya.RewardsApp.User;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.HashMap;
import java.util.Map;

class PasswordManagement {
	static Map<String,String> credentials=new HashMap<>();
	static {
		credentials.put("Sandhya", "Sony1234");
		credentials.put("Harshitha", "Chinni12");
		credentials.put("Madhumitha", "Madhu13");
		credentials.put("Sirisha", "Siri132");
		credentials.put("Amrutha", "Ammu13");
	}
    public static String Encrypt(String password) {
    	String encryptedPassword="";
    	Encoder encoder = Base64.getEncoder();
        encryptedPassword = encoder.encodeToString(password.getBytes());
    	return encryptedPassword;
	}
    public static String decrypt(String encrypted) {
    	Decoder decoder = Base64.getDecoder();
        byte[] bytes = decoder.decode(encrypted);
        String original=new String(bytes);
        return original;
    }

}
