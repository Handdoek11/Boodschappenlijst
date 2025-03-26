package o4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m4.AbstractC6203i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class f {

    /* renamed from: b, reason: collision with root package name */
    private static final Charset f39834b = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    private final s4.g f39835a;

    class a extends JSONObject {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f39836a;

        a(String str) {
            this.f39836a = str;
            put("userId", str);
        }
    }

    public f(s4.g gVar) {
        this.f39835a = gVar;
    }

    private static Map e(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, p(jSONObject, next));
        }
        return hashMap;
    }

    private static List f(String str) {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < jSONArray.length(); i8++) {
            String string = jSONArray.getString(i8);
            try {
                arrayList.add(i.a(string));
            } catch (Exception e8) {
                j4.g.f().l("Failed de-serializing rollouts state. " + string, e8);
            }
        }
        return arrayList;
    }

    private String g(String str) {
        return p(new JSONObject(str), "userId");
    }

    private static String h(Map map) {
        return new JSONObject(map).toString();
    }

    private static String l(List list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i8 = 0; i8 < list.size(); i8++) {
            try {
                jSONArray.put(new JSONObject(i.f39862a.b(list.get(i8))));
            } catch (JSONException e8) {
                j4.g.f().l("Exception parsing rollout assignment!", e8);
            }
        }
        hashMap.put("rolloutsState", jSONArray);
        return new JSONObject(hashMap).toString();
    }

    private static void m(File file) {
        if (file.exists() && file.delete()) {
            j4.g.f().g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    private static void n(File file, String str) {
        if (file.exists() && file.delete()) {
            j4.g.f().g(String.format("Deleted corrupt file: %s\nReason: %s", file.getAbsolutePath(), str));
        }
    }

    private static String o(String str) {
        return new a(str).toString();
    }

    private static String p(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    public File a(String str) {
        return this.f39835a.q(str, "internal-keys");
    }

    public File b(String str) {
        return this.f39835a.q(str, "keys");
    }

    public File c(String str) {
        return this.f39835a.q(str, "rollouts-state");
    }

    public File d(String str) {
        return this.f39835a.q(str, "user-data");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Closeable] */
    Map i(String str, boolean z7) {
        Throwable th;
        FileInputStream fileInputStream;
        Exception e8;
        File a8 = z7 ? a(str) : b(str);
        if (!a8.exists() || a8.length() == 0) {
            n(a8, "The file has a length of zero for session: " + str);
            return Collections.emptyMap();
        }
        try {
            try {
                fileInputStream = new FileInputStream(a8);
            } catch (Exception e9) {
                fileInputStream = null;
                e8 = e9;
            } catch (Throwable th2) {
                ?? r12 = 0;
                th = th2;
                AbstractC6203i.f(r12, "Failed to close user metadata file.");
                throw th;
            }
            try {
                Map e10 = e(AbstractC6203i.A(fileInputStream));
                AbstractC6203i.f(fileInputStream, "Failed to close user metadata file.");
                return e10;
            } catch (Exception e11) {
                e8 = e11;
                j4.g.f().l("Error deserializing user metadata.", e8);
                m(a8);
                AbstractC6203i.f(fileInputStream, "Failed to close user metadata file.");
                return Collections.emptyMap();
            }
        } catch (Throwable th3) {
            th = th3;
            AbstractC6203i.f(r12, "Failed to close user metadata file.");
            throw th;
        }
    }

    public List j(String str) {
        File c8 = c(str);
        if (!c8.exists() || c8.length() == 0) {
            n(c8, "The file has a length of zero for session: " + str);
            return Collections.emptyList();
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(c8);
                try {
                    List f8 = f(AbstractC6203i.A(fileInputStream2));
                    j4.g.f().b("Loaded rollouts state:\n" + f8 + "\nfor session " + str);
                    AbstractC6203i.f(fileInputStream2, "Failed to close rollouts state file.");
                    return f8;
                } catch (Exception e8) {
                    e = e8;
                    fileInputStream = fileInputStream2;
                    j4.g.f().l("Error deserializing rollouts state.", e);
                    m(c8);
                    AbstractC6203i.f(fileInputStream, "Failed to close rollouts state file.");
                    return Collections.emptyList();
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    AbstractC6203i.f(fileInputStream, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e9) {
            e = e9;
        }
    }

    public String k(String str) {
        FileInputStream fileInputStream;
        File d8 = d(str);
        FileInputStream fileInputStream2 = null;
        if (!d8.exists() || d8.length() == 0) {
            j4.g.f().b("No userId set for session " + str);
            m(d8);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(d8);
        } catch (Exception e8) {
            e = e8;
            fileInputStream = null;
        } catch (Throwable th) {
            th = th;
            AbstractC6203i.f(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
        try {
            try {
                String g8 = g(AbstractC6203i.A(fileInputStream));
                j4.g.f().b("Loaded userId " + g8 + " for session " + str);
                AbstractC6203i.f(fileInputStream, "Failed to close user metadata file.");
                return g8;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                AbstractC6203i.f(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e9) {
            e = e9;
            j4.g.f().l("Error deserializing user metadata.", e);
            m(d8);
            AbstractC6203i.f(fileInputStream, "Failed to close user metadata file.");
            return null;
        }
    }

    public void q(String str, Map map) {
        r(str, map, false);
    }

    public void r(String str, Map map, boolean z7) {
        File a8 = z7 ? a(str) : b(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String h8 = h(map);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(a8), f39834b));
                try {
                    bufferedWriter2.write(h8);
                    bufferedWriter2.flush();
                    AbstractC6203i.f(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Exception e8) {
                    e = e8;
                    bufferedWriter = bufferedWriter2;
                    j4.g.f().l("Error serializing key/value metadata.", e);
                    m(a8);
                    AbstractC6203i.f(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    AbstractC6203i.f(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Exception e9) {
                e = e9;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public void s(String str, List list) {
        Throwable th;
        BufferedWriter bufferedWriter;
        Exception e8;
        String l8;
        File c8 = c(str);
        ?? isEmpty = list.isEmpty();
        if (isEmpty != 0) {
            n(c8, "Rollout state is empty for session: " + str);
            return;
        }
        try {
            try {
                l8 = l(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c8), f39834b));
            } catch (Exception e9) {
                bufferedWriter = null;
                e8 = e9;
            } catch (Throwable th2) {
                isEmpty = 0;
                th = th2;
                AbstractC6203i.f(isEmpty, "Failed to close rollouts state file.");
                throw th;
            }
            try {
                bufferedWriter.write(l8);
                bufferedWriter.flush();
                isEmpty = bufferedWriter;
            } catch (Exception e10) {
                e8 = e10;
                j4.g.f().l("Error serializing rollouts state.", e8);
                m(c8);
                isEmpty = bufferedWriter;
                AbstractC6203i.f(isEmpty, "Failed to close rollouts state file.");
            }
            AbstractC6203i.f(isEmpty, "Failed to close rollouts state file.");
        } catch (Throwable th3) {
            th = th3;
            AbstractC6203i.f(isEmpty, "Failed to close rollouts state file.");
            throw th;
        }
    }

    public void t(String str, String str2) {
        File d8 = d(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String o8 = o(str2);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(d8), f39834b));
                try {
                    bufferedWriter2.write(o8);
                    bufferedWriter2.flush();
                    AbstractC6203i.f(bufferedWriter2, "Failed to close user metadata file.");
                } catch (Exception e8) {
                    e = e8;
                    bufferedWriter = bufferedWriter2;
                    j4.g.f().l("Error serializing user metadata.", e);
                    AbstractC6203i.f(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    AbstractC6203i.f(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e9) {
            e = e9;
        }
    }
}
