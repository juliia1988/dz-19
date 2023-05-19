import java.util.Collections;
import java.util.Map;

public class SharedData {

    public static Map<String, String> getSharedData(String key, String value) {
        return Collections.singletonMap(key, value);
    }
}
