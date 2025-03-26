package o4;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import m4.AbstractC6203i;

/* loaded from: classes2.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    private final Map f39828a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final int f39829b;

    /* renamed from: c, reason: collision with root package name */
    private final int f39830c;

    public d(int i8, int i9) {
        this.f39829b = i8;
        this.f39830c = i9;
    }

    private String b(String str) {
        if (str != null) {
            return c(str, this.f39830c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public static String c(String str, int i8) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        return trim.length() > i8 ? trim.substring(0, i8) : trim;
    }

    public synchronized Map a() {
        return DesugarCollections.unmodifiableMap(new HashMap(this.f39828a));
    }

    public synchronized boolean d(String str, String str2) {
        String b8 = b(str);
        if (this.f39828a.size() >= this.f39829b && !this.f39828a.containsKey(b8)) {
            j4.g.f().k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f39829b);
            return false;
        }
        String c8 = c(str2, this.f39830c);
        if (AbstractC6203i.y((String) this.f39828a.get(b8), c8)) {
            return false;
        }
        Map map = this.f39828a;
        if (str2 == null) {
            c8 = "";
        }
        map.put(b8, c8);
        return true;
    }

    public synchronized void e(Map map) {
        try {
            int i8 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String b8 = b((String) entry.getKey());
                if (this.f39828a.size() < this.f39829b || this.f39828a.containsKey(b8)) {
                    String str = (String) entry.getValue();
                    this.f39828a.put(b8, str == null ? "" : c(str, this.f39830c));
                } else {
                    i8++;
                }
            }
            if (i8 > 0) {
                j4.g.f().k("Ignored " + i8 + " entries when adding custom keys. Maximum allowable: " + this.f39829b);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
