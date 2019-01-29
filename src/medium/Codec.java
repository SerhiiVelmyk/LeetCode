package medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Codec {

    private Map<String, String> codes = new HashMap<>();
    private static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static Random rnd = new Random();

    public String encode(String longUrl) {
        String encodedUrl = randomString();

        codes.put(encodedUrl, longUrl);

        return encodedUrl;
    }

    public String decode(String shortUrl) {
        return codes.get(shortUrl);
    }

    private String randomString() {
        StringBuilder sb = new StringBuilder(6);
        for (int i = 0; i < 6; i++) {
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        }
        return sb.toString();
    }

}
