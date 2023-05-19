import java.util.Collections;
import java.util.Map;

public class SharedData {
    Map<String, String> sharedData = Collections.singletonMap("key", "value");

    private SharedData(String key, String value) {
    }

    public static Map<String, String> getSharedData(String key, String value) {
        return Collections.singletonMap(key, value);
    }
}
