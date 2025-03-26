package I5;

import J6.AbstractC0650j;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import y6.AbstractC6971J;
import y6.AbstractC6987o;

/* loaded from: classes2.dex */
public final class H {

    /* renamed from: c, reason: collision with root package name */
    public static final a f3173c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final H f3174d;

    /* renamed from: e, reason: collision with root package name */
    private static final H f3175e;

    /* renamed from: f, reason: collision with root package name */
    private static final H f3176f;

    /* renamed from: g, reason: collision with root package name */
    private static final H f3177g;

    /* renamed from: h, reason: collision with root package name */
    private static final H f3178h;

    /* renamed from: i, reason: collision with root package name */
    private static final Map f3179i;

    /* renamed from: a, reason: collision with root package name */
    private final String f3180a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3181b;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final H a(String str) {
            J6.r.e(str, "name");
            String c8 = N5.w.c(str);
            H h8 = (H) H.f3173c.b().get(c8);
            return h8 == null ? new H(c8, 0) : h8;
        }

        public final Map b() {
            return H.f3179i;
        }

        public final H c() {
            return H.f3174d;
        }

        private a() {
        }
    }

    static {
        H h8 = new H("http", 80);
        f3174d = h8;
        H h9 = new H("https", 443);
        f3175e = h9;
        H h10 = new H("ws", 80);
        f3176f = h10;
        H h11 = new H("wss", 443);
        f3177g = h11;
        H h12 = new H("socks", 1080);
        f3178h = h12;
        List g8 = AbstractC6987o.g(h8, h9, h10, h11, h12);
        LinkedHashMap linkedHashMap = new LinkedHashMap(P6.m.c(AbstractC6971J.b(AbstractC6987o.l(g8, 10)), 16));
        for (Object obj : g8) {
            linkedHashMap.put(((H) obj).f3180a, obj);
        }
        f3179i = linkedHashMap;
    }

    public H(String str, int i8) {
        J6.r.e(str, "name");
        this.f3180a = str;
        this.f3181b = i8;
        for (int i9 = 0; i9 < str.length(); i9++) {
            if (!N5.i.a(str.charAt(i9))) {
                throw new IllegalArgumentException("All characters should be lower case");
            }
        }
    }

    public final int c() {
        return this.f3181b;
    }

    public final String d() {
        return this.f3180a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h8 = (H) obj;
        return J6.r.a(this.f3180a, h8.f3180a) && this.f3181b == h8.f3181b;
    }

    public int hashCode() {
        return (this.f3180a.hashCode() * 31) + this.f3181b;
    }

    public String toString() {
        return "URLProtocol(name=" + this.f3180a + ", defaultPort=" + this.f3181b + ')';
    }
}
