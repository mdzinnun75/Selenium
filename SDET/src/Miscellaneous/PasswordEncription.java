package Miscellaneous;

import org.apache.commons.codec.binary.Base64;

public class PasswordEncription {

	public static void main(String[] args) {

		String str="test123";
		
		byte[] encodedStr=Base64.encodeBase64(str.getBytes());
		//System.out.println(encodedStr);
		System.out.println("encoded string: "+new String(encodedStr));
		
		byte[] decodeStr= Base64.decodeBase64(encodedStr);
		System.out.println("decoded string: "+new String(decodeStr));
	}

}
