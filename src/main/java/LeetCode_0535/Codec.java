package LeetCode_0535;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * TODO
 * <p>
 * Create Time: 2019-07-03 15:56
 * Last Modify: 2019-07-03
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Codec {

    private Map<String, String> map1 = new HashMap<>();
    private Map<String, String> map2 = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if (!map1.containsKey(longUrl)) {
            String tiny;
            while (true) {
                tiny = String.format("http://tinyurl.com/%s", randomSuffix());
                if (!map2.containsKey(tiny))
                    break;
            }

            map1.put(longUrl, tiny);
            map2.put(tiny, longUrl);
        }

        return map1.get(longUrl);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map2.getOrDefault(shortUrl, "");
    }

    private String randomSuffix() {
        char[] array = new char[] {
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
        };

        String result = "";
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            result = String.format("%s%s", result, array[random.nextInt(62)]);
        }

        return result;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));