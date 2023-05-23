import java.util.HashMap;
import java.util.Map;

public class SharedData {

    private static SharedData datas;
    private Map<String, String> sharedData = new HashMap<>();

    private SharedData() {
    }

    public static SharedData getSharedData() {
        if (datas == null) {
            datas = new SharedData();
        }

        return datas;
    }

    public boolean addSharedData(Map data) {
        sharedData.get(data);
        return true;
    }
}
