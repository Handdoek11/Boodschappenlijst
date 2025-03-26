package u5;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: u5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6818b {
    protected static C6817a a(JSONObject jSONObject) {
        if (!jSONObject.has("emoji")) {
            return null;
        }
        return new C6817a(jSONObject.has("description") ? jSONObject.getString("description") : null, jSONObject.has("supports_fitzpatrick") ? jSONObject.getBoolean("supports_fitzpatrick") : false, c(jSONObject.getJSONArray("aliases")), c(jSONObject.getJSONArray("tags")), jSONObject.getString("emoji").getBytes("UTF-8"));
    }

    private static String b(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                bufferedReader.close();
                return sb.toString();
            }
            sb.append(readLine);
        }
    }

    private static List c(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i8 = 0; i8 < jSONArray.length(); i8++) {
            arrayList.add(jSONArray.getString(i8));
        }
        return arrayList;
    }

    public static List d(InputStream inputStream) {
        JSONArray jSONArray = new JSONArray(b(inputStream));
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i8 = 0; i8 < jSONArray.length(); i8++) {
            C6817a a8 = a(jSONArray.getJSONObject(i8));
            if (a8 != null) {
                arrayList.add(a8);
            }
        }
        return arrayList;
    }
}
