package G2;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import com.google.android.gms.internal.ads.C4220u60;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class U {
    public static Bundle a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        Bundle bundle = new Bundle();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt != null) {
                if (opt instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) opt).booleanValue());
                } else if (opt instanceof Double) {
                    bundle.putDouble(next, ((Double) opt).doubleValue());
                } else if (opt instanceof Integer) {
                    bundle.putInt(next, ((Integer) opt).intValue());
                } else if (opt instanceof Long) {
                    bundle.putLong(next, ((Long) opt).longValue());
                } else if (opt instanceof String) {
                    bundle.putString(next, (String) opt);
                } else if (opt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) opt;
                    if (jSONArray.length() != 0) {
                        int length = jSONArray.length();
                        Object obj = null;
                        for (int i8 = 0; obj == null && i8 < length; i8++) {
                            obj = !jSONArray.isNull(i8) ? jSONArray.opt(i8) : null;
                        }
                        if (obj == null) {
                            H2.p.g("Expected JSONArray with at least 1 non-null element for key:".concat(String.valueOf(next)));
                        } else if (obj instanceof JSONObject) {
                            Bundle[] bundleArr = new Bundle[length];
                            for (int i9 = 0; i9 < length; i9++) {
                                bundleArr[i9] = !jSONArray.isNull(i9) ? a(jSONArray.optJSONObject(i9)) : null;
                            }
                            bundle.putParcelableArray(next, bundleArr);
                        } else if (obj instanceof Number) {
                            double[] dArr = new double[jSONArray.length()];
                            for (int i10 = 0; i10 < length; i10++) {
                                dArr[i10] = jSONArray.optDouble(i10);
                            }
                            bundle.putDoubleArray(next, dArr);
                        } else if (obj instanceof CharSequence) {
                            String[] strArr = new String[length];
                            for (int i11 = 0; i11 < length; i11++) {
                                strArr[i11] = !jSONArray.isNull(i11) ? jSONArray.optString(i11) : null;
                            }
                            bundle.putStringArray(next, strArr);
                        } else if (obj instanceof Boolean) {
                            boolean[] zArr = new boolean[length];
                            for (int i12 = 0; i12 < length; i12++) {
                                zArr[i12] = jSONArray.optBoolean(i12);
                            }
                            bundle.putBooleanArray(next, zArr);
                        } else {
                            H2.p.g(String.format("JSONArray with unsupported type %s for key:%s", obj.getClass().getCanonicalName(), next));
                        }
                    }
                } else if (opt instanceof JSONObject) {
                    bundle.putBundle(next, a((JSONObject) opt));
                } else {
                    H2.p.g("Unsupported type for key:".concat(String.valueOf(next)));
                }
            }
        }
        return bundle;
    }

    public static String b(String str, JSONObject jSONObject, String... strArr) {
        JSONObject n8 = n(jSONObject, strArr);
        return n8 == null ? "" : n8.optString(strArr[0], "");
    }

    public static List c(JSONArray jSONArray, List list) {
        if (list == null) {
            list = new ArrayList();
        }
        if (jSONArray != null) {
            for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                list.add(jSONArray.getString(i8));
            }
        }
        return list;
    }

    public static List d(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(jsonReader.nextString());
        }
        jsonReader.endArray();
        return arrayList;
    }

    public static Map e(JsonReader jsonReader) {
        HashMap hashMap = new HashMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            HashMap hashMap2 = new HashMap();
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                hashMap2.put(jsonReader.nextName(), jsonReader.nextString());
            }
            jsonReader.endObject();
            hashMap.put(nextName, hashMap2);
        }
        jsonReader.endObject();
        return hashMap;
    }

    public static JSONArray f(JsonReader jsonReader) {
        JSONArray jSONArray = new JSONArray();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            JsonToken peek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(peek)) {
                jSONArray.put(f(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(peek)) {
                jSONArray.put(i(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(peek)) {
                jSONArray.put(jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(peek)) {
                jSONArray.put(jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(peek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(peek)));
                }
                jSONArray.put(jsonReader.nextString());
            }
        }
        jsonReader.endArray();
        return jSONArray;
    }

    public static JSONObject g(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getJSONObject(str);
        } catch (JSONException unused) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        }
    }

    public static JSONObject h(JSONObject jSONObject, String... strArr) {
        JSONObject n8 = n(jSONObject, strArr);
        if (n8 == null) {
            return null;
        }
        return n8.optJSONObject(strArr[1]);
    }

    public static JSONObject i(JsonReader jsonReader) {
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            JsonToken peek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(peek)) {
                jSONObject.put(nextName, f(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(peek)) {
                jSONObject.put(nextName, i(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(peek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(peek)));
                }
                jSONObject.put(nextName, jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return jSONObject;
    }

    public static void j(JsonWriter jsonWriter, JSONArray jSONArray) {
        try {
            jsonWriter.beginArray();
            for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                Object obj = jSONArray.get(i8);
                if (obj instanceof String) {
                    jsonWriter.value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    k(jsonWriter, (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        throw new JSONException("unable to write field: " + String.valueOf(obj));
                    }
                    j(jsonWriter, (JSONArray) obj);
                }
            }
            jsonWriter.endArray();
        } catch (JSONException e8) {
            throw new IOException(e8);
        }
    }

    public static void k(JsonWriter jsonWriter, JSONObject jSONObject) {
        try {
            jsonWriter.beginObject();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    jsonWriter.name(next).value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.name(next).value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.name(next).value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    k(jsonWriter.name(next), (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        throw new JSONException("unable to write field: " + String.valueOf(obj));
                    }
                    j(jsonWriter.name(next), (JSONArray) obj);
                }
            }
            jsonWriter.endObject();
        } catch (JSONException e8) {
            throw new IOException(e8);
        }
    }

    public static boolean l(boolean z7, JSONObject jSONObject, String... strArr) {
        JSONObject n8 = n(jSONObject, strArr);
        if (n8 == null) {
            return false;
        }
        return n8.optBoolean(strArr[strArr.length - 1], false);
    }

    public static String m(C4220u60 c4220u60) {
        if (c4220u60 == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            o(jsonWriter, c4220u60);
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e8) {
            H2.p.e("Error when writing JSON.", e8);
            return null;
        }
    }

    private static JSONObject n(JSONObject jSONObject, String[] strArr) {
        for (int i8 = 0; i8 < strArr.length - 1; i8 = 1) {
            if (jSONObject == null) {
                return null;
            }
            jSONObject = jSONObject.optJSONObject(strArr[0]);
        }
        return jSONObject;
    }

    private static void o(JsonWriter jsonWriter, Object obj) {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return;
        }
        if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            jsonWriter.value((String) obj);
            return;
        }
        if (obj instanceof C4220u60) {
            k(jsonWriter, ((C4220u60) obj).f26999d);
            return;
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                o(jsonWriter, it.next());
            }
            jsonWriter.endArray();
            return;
        }
        jsonWriter.beginObject();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            if (key instanceof String) {
                o(jsonWriter.name((String) key), entry.getValue());
            }
        }
        jsonWriter.endObject();
    }
}
