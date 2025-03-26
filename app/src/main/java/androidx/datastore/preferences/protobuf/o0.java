package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    static final int f9464a = c(1, 3);

    /* renamed from: b, reason: collision with root package name */
    static final int f9465b = c(1, 4);

    /* renamed from: c, reason: collision with root package name */
    static final int f9466c = c(2, 0);

    /* renamed from: d, reason: collision with root package name */
    static final int f9467d = c(3, 2);

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'v' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static class b {

        /* renamed from: A, reason: collision with root package name */
        public static final b f9468A;

        /* renamed from: B, reason: collision with root package name */
        public static final b f9469B;

        /* renamed from: C, reason: collision with root package name */
        public static final b f9470C;

        /* renamed from: D, reason: collision with root package name */
        public static final b f9471D;

        /* renamed from: E, reason: collision with root package name */
        public static final b f9472E;

        /* renamed from: F, reason: collision with root package name */
        public static final b f9473F;

        /* renamed from: G, reason: collision with root package name */
        public static final b f9474G;

        /* renamed from: H, reason: collision with root package name */
        public static final b f9475H;

        /* renamed from: I, reason: collision with root package name */
        public static final b f9476I;

        /* renamed from: J, reason: collision with root package name */
        public static final b f9477J;

        /* renamed from: K, reason: collision with root package name */
        public static final b f9478K;

        /* renamed from: L, reason: collision with root package name */
        private static final /* synthetic */ b[] f9479L;

        /* renamed from: t, reason: collision with root package name */
        public static final b f9480t;

        /* renamed from: u, reason: collision with root package name */
        public static final b f9481u;

        /* renamed from: v, reason: collision with root package name */
        public static final b f9482v;

        /* renamed from: w, reason: collision with root package name */
        public static final b f9483w;

        /* renamed from: x, reason: collision with root package name */
        public static final b f9484x;

        /* renamed from: y, reason: collision with root package name */
        public static final b f9485y;

        /* renamed from: z, reason: collision with root package name */
        public static final b f9486z;

        /* renamed from: o, reason: collision with root package name */
        private final c f9487o;

        /* renamed from: s, reason: collision with root package name */
        private final int f9488s;

        enum a extends b {
            a(String str, int i8, c cVar, int i9) {
                super(str, i8, cVar, i9);
            }
        }

        /* renamed from: androidx.datastore.preferences.protobuf.o0$b$b, reason: collision with other inner class name */
        enum C0158b extends b {
            C0158b(String str, int i8, c cVar, int i9) {
                super(str, i8, cVar, i9);
            }
        }

        enum c extends b {
            c(String str, int i8, c cVar, int i9) {
                super(str, i8, cVar, i9);
            }
        }

        enum d extends b {
            d(String str, int i8, c cVar, int i9) {
                super(str, i8, cVar, i9);
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f9480t = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f9481u = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f9482v = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f9483w = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f9484x = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f9485y = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f9486z = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f9468A = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f9469B = aVar;
            c cVar3 = c.MESSAGE;
            C0158b c0158b = new C0158b("GROUP", 9, cVar3, 3);
            f9470C = c0158b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f9471D = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f9472E = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f9473F = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f9474G = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f9475H = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f9476I = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f9477J = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f9478K = bVar14;
            f9479L = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0158b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f9479L.clone();
        }

        public c a() {
            return this.f9487o;
        }

        public int c() {
            return this.f9488s;
        }

        private b(String str, int i8, c cVar, int i9) {
            this.f9487o = cVar;
            this.f9488s = i9;
        }
    }

    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(AbstractC0883g.f9378s),
        ENUM(null),
        MESSAGE(null);


        /* renamed from: o, reason: collision with root package name */
        private final Object f9499o;

        c(Object obj) {
            this.f9499o = obj;
        }
    }

    public static int a(int i8) {
        return i8 >>> 3;
    }

    public static int b(int i8) {
        return i8 & 7;
    }

    static int c(int i8, int i9) {
        return (i8 << 3) | i9;
    }
}
