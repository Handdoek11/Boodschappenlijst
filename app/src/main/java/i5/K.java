package I5;

import J6.AbstractC0650j;
import java.util.List;
import x6.AbstractC6929k;
import x6.InterfaceC6928j;

/* loaded from: classes2.dex */
public final class K {

    /* renamed from: q, reason: collision with root package name */
    public static final a f3183q = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final H f3184a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3185b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3186c;

    /* renamed from: d, reason: collision with root package name */
    private final List f3187d;

    /* renamed from: e, reason: collision with root package name */
    private final x f3188e;

    /* renamed from: f, reason: collision with root package name */
    private final String f3189f;

    /* renamed from: g, reason: collision with root package name */
    private final String f3190g;

    /* renamed from: h, reason: collision with root package name */
    private final String f3191h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f3192i;

    /* renamed from: j, reason: collision with root package name */
    private final String f3193j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC6928j f3194k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC6928j f3195l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC6928j f3196m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC6928j f3197n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC6928j f3198o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC6928j f3199p;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    static final class b extends J6.s implements I6.a {
        b() {
            super(0);
        }

        @Override // I6.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            int O7 = S6.h.O(K.this.f3193j, '#', 0, false, 6, null) + 1;
            if (O7 == 0) {
                return "";
            }
            String substring = K.this.f3193j.substring(O7);
            J6.r.d(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
    }

    static final class c extends J6.s implements I6.a {
        c() {
            super(0);
        }

        @Override // I6.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            if (K.this.h() == null) {
                return null;
            }
            if (K.this.h().length() == 0) {
                return "";
            }
            String substring = K.this.f3193j.substring(S6.h.O(K.this.f3193j, ':', K.this.k().d().length() + 3, false, 4, null) + 1, S6.h.O(K.this.f3193j, '@', 0, false, 6, null));
            J6.r.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
    }

    static final class d extends J6.s implements I6.a {
        d() {
            super(0);
        }

        @Override // I6.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            int O7;
            if (K.this.i().isEmpty() || (O7 = S6.h.O(K.this.f3193j, '/', K.this.k().d().length() + 3, false, 4, null)) == -1) {
                return "";
            }
            int R7 = S6.h.R(K.this.f3193j, new char[]{'?', '#'}, O7, false, 4, null);
            if (R7 == -1) {
                String substring = K.this.f3193j.substring(O7);
                J6.r.d(substring, "this as java.lang.String).substring(startIndex)");
                return substring;
            }
            String substring2 = K.this.f3193j.substring(O7, R7);
            J6.r.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring2;
        }
    }

    static final class e extends J6.s implements I6.a {
        e() {
            super(0);
        }

        @Override // I6.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            int O7 = S6.h.O(K.this.f3193j, '/', K.this.k().d().length() + 3, false, 4, null);
            if (O7 == -1) {
                return "";
            }
            int O8 = S6.h.O(K.this.f3193j, '#', O7, false, 4, null);
            if (O8 == -1) {
                String substring = K.this.f3193j.substring(O7);
                J6.r.d(substring, "this as java.lang.String).substring(startIndex)");
                return substring;
            }
            String substring2 = K.this.f3193j.substring(O7, O8);
            J6.r.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring2;
        }
    }

    static final class f extends J6.s implements I6.a {
        f() {
            super(0);
        }

        @Override // I6.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            int O7 = S6.h.O(K.this.f3193j, '?', 0, false, 6, null) + 1;
            if (O7 == 0) {
                return "";
            }
            int O8 = S6.h.O(K.this.f3193j, '#', O7, false, 4, null);
            if (O8 == -1) {
                String substring = K.this.f3193j.substring(O7);
                J6.r.d(substring, "this as java.lang.String).substring(startIndex)");
                return substring;
            }
            String substring2 = K.this.f3193j.substring(O7, O8);
            J6.r.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring2;
        }
    }

    static final class g extends J6.s implements I6.a {
        g() {
            super(0);
        }

        @Override // I6.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            if (K.this.n() == null) {
                return null;
            }
            if (K.this.n().length() == 0) {
                return "";
            }
            int length = K.this.k().d().length() + 3;
            String substring = K.this.f3193j.substring(length, S6.h.R(K.this.f3193j, new char[]{':', '@'}, length, false, 4, null));
            J6.r.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
    }

    public K(H h8, String str, int i8, List list, x xVar, String str2, String str3, String str4, boolean z7, String str5) {
        J6.r.e(h8, "protocol");
        J6.r.e(str, "host");
        J6.r.e(list, "pathSegments");
        J6.r.e(xVar, "parameters");
        J6.r.e(str2, "fragment");
        J6.r.e(str5, "urlString");
        this.f3184a = h8;
        this.f3185b = str;
        this.f3186c = i8;
        this.f3187d = list;
        this.f3188e = xVar;
        this.f3189f = str2;
        this.f3190g = str3;
        this.f3191h = str4;
        this.f3192i = z7;
        this.f3193j = str5;
        if ((i8 < 0 || i8 >= 65536) && i8 != 0) {
            throw new IllegalArgumentException("port must be between 0 and 65535, or 0 if not set");
        }
        this.f3194k = AbstractC6929k.a(new d());
        this.f3195l = AbstractC6929k.a(new f());
        this.f3196m = AbstractC6929k.a(new e());
        this.f3197n = AbstractC6929k.a(new g());
        this.f3198o = AbstractC6929k.a(new c());
        this.f3199p = AbstractC6929k.a(new b());
    }

    public final String b() {
        return (String) this.f3199p.getValue();
    }

    public final String c() {
        return (String) this.f3198o.getValue();
    }

    public final String d() {
        return (String) this.f3194k.getValue();
    }

    public final String e() {
        return (String) this.f3195l.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && J6.r.a(J6.H.b(K.class), J6.H.b(obj.getClass())) && J6.r.a(this.f3193j, ((K) obj).f3193j);
    }

    public final String f() {
        return (String) this.f3197n.getValue();
    }

    public final String g() {
        return this.f3185b;
    }

    public final String h() {
        return this.f3191h;
    }

    public int hashCode() {
        return this.f3193j.hashCode();
    }

    public final List i() {
        return this.f3187d;
    }

    public final int j() {
        Integer valueOf = Integer.valueOf(this.f3186c);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        return valueOf != null ? valueOf.intValue() : this.f3184a.c();
    }

    public final H k() {
        return this.f3184a;
    }

    public final int l() {
        return this.f3186c;
    }

    public final boolean m() {
        return this.f3192i;
    }

    public final String n() {
        return this.f3190g;
    }

    public String toString() {
        return this.f3193j;
    }
}
