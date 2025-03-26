package P1;

import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class k implements i {

    /* renamed from: c, reason: collision with root package name */
    private final Map f4332c;

    /* renamed from: d, reason: collision with root package name */
    private volatile Map f4333d;

    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        private static final String f4334d;

        /* renamed from: e, reason: collision with root package name */
        private static final Map f4335e;

        /* renamed from: a, reason: collision with root package name */
        private boolean f4336a = true;

        /* renamed from: b, reason: collision with root package name */
        private Map f4337b = f4335e;

        /* renamed from: c, reason: collision with root package name */
        private boolean f4338c = true;

        static {
            String b8 = b();
            f4334d = b8;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(b8)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(b8)));
            }
            f4335e = DesugarCollections.unmodifiableMap(hashMap);
        }

        static String b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i8 = 0; i8 < length; i8++) {
                char charAt = property.charAt(i8);
                if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                    sb.append(charAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        public k a() {
            this.f4336a = true;
            return new k(this.f4337b);
        }
    }

    static final class b implements j {

        /* renamed from: a, reason: collision with root package name */
        private final String f4339a;

        b(String str) {
            this.f4339a = str;
        }

        @Override // P1.j
        public String a() {
            return this.f4339a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f4339a.equals(((b) obj).f4339a);
            }
            return false;
        }

        public int hashCode() {
            return this.f4339a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f4339a + "'}";
        }
    }

    k(Map map) {
        this.f4332c = DesugarCollections.unmodifiableMap(map);
    }

    private String b(List list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            String a8 = ((j) list.get(i8)).a();
            if (!TextUtils.isEmpty(a8)) {
                sb.append(a8);
                if (i8 != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    private Map c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f4332c.entrySet()) {
            String b8 = b((List) entry.getValue());
            if (!TextUtils.isEmpty(b8)) {
                hashMap.put(entry.getKey(), b8);
            }
        }
        return hashMap;
    }

    @Override // P1.i
    public Map a() {
        if (this.f4333d == null) {
            synchronized (this) {
                try {
                    if (this.f4333d == null) {
                        this.f4333d = DesugarCollections.unmodifiableMap(c());
                    }
                } finally {
                }
            }
        }
        return this.f4333d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f4332c.equals(((k) obj).f4332c);
        }
        return false;
    }

    public int hashCode() {
        return this.f4332c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f4332c + '}';
    }
}
