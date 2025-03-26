package c4;

import java.util.Map;

/* loaded from: classes2.dex */
public abstract class z {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static abstract class a implements b4.c {

        /* renamed from: o, reason: collision with root package name */
        public static final a f12233o = new C0210a("KEY", 0);

        /* renamed from: s, reason: collision with root package name */
        public static final a f12234s = new b("VALUE", 1);

        /* renamed from: t, reason: collision with root package name */
        private static final /* synthetic */ a[] f12235t = a();

        /* renamed from: c4.z$a$a, reason: collision with other inner class name */
        enum C0210a extends a {
            C0210a(String str, int i8) {
                super(str, i8, null);
            }

            @Override // b4.c
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getKey();
            }
        }

        enum b extends a {
            b(String str, int i8) {
                super(str, i8, null);
            }

            @Override // b4.c
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getValue();
            }
        }

        private a(String str, int i8) {
        }

        private static /* synthetic */ a[] a() {
            return new a[]{f12233o, f12234s};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f12235t.clone();
        }

        /* synthetic */ a(String str, int i8, y yVar) {
            this(str, i8);
        }
    }

    static boolean a(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    static b4.c b() {
        return a.f12233o;
    }

    static String c(Map map) {
        StringBuilder a8 = AbstractC1005h.a(map.size());
        a8.append('{');
        boolean z7 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z7) {
                a8.append(", ");
            }
            a8.append(entry.getKey());
            a8.append('=');
            a8.append(entry.getValue());
            z7 = false;
        }
        a8.append('}');
        return a8.toString();
    }

    static b4.c d() {
        return a.f12234s;
    }
}
