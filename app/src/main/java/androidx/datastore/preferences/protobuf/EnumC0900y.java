package androidx.datastore.preferences.protobuf;

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
/* renamed from: androidx.datastore.preferences.protobuf.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0900y {

    /* renamed from: A, reason: collision with root package name */
    public static final EnumC0900y f9596A;

    /* renamed from: B, reason: collision with root package name */
    public static final EnumC0900y f9597B;

    /* renamed from: C, reason: collision with root package name */
    public static final EnumC0900y f9598C;

    /* renamed from: D, reason: collision with root package name */
    public static final EnumC0900y f9599D;

    /* renamed from: E, reason: collision with root package name */
    private static final /* synthetic */ EnumC0900y[] f9600E;

    /* renamed from: u, reason: collision with root package name */
    public static final EnumC0900y f9601u;

    /* renamed from: v, reason: collision with root package name */
    public static final EnumC0900y f9602v;

    /* renamed from: w, reason: collision with root package name */
    public static final EnumC0900y f9603w;

    /* renamed from: x, reason: collision with root package name */
    public static final EnumC0900y f9604x;

    /* renamed from: y, reason: collision with root package name */
    public static final EnumC0900y f9605y;

    /* renamed from: z, reason: collision with root package name */
    public static final EnumC0900y f9606z;

    /* renamed from: o, reason: collision with root package name */
    private final Class f9607o;

    /* renamed from: s, reason: collision with root package name */
    private final Class f9608s;

    /* renamed from: t, reason: collision with root package name */
    private final Object f9609t;

    static {
        EnumC0900y enumC0900y = new EnumC0900y("VOID", 0, Void.class, Void.class, null);
        f9601u = enumC0900y;
        Class cls = Integer.TYPE;
        EnumC0900y enumC0900y2 = new EnumC0900y("INT", 1, cls, Integer.class, 0);
        f9602v = enumC0900y2;
        EnumC0900y enumC0900y3 = new EnumC0900y("LONG", 2, Long.TYPE, Long.class, 0L);
        f9603w = enumC0900y3;
        EnumC0900y enumC0900y4 = new EnumC0900y("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f9604x = enumC0900y4;
        EnumC0900y enumC0900y5 = new EnumC0900y("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f9605y = enumC0900y5;
        EnumC0900y enumC0900y6 = new EnumC0900y("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f9606z = enumC0900y6;
        EnumC0900y enumC0900y7 = new EnumC0900y("STRING", 6, String.class, String.class, "");
        f9596A = enumC0900y7;
        EnumC0900y enumC0900y8 = new EnumC0900y("BYTE_STRING", 7, AbstractC0883g.class, AbstractC0883g.class, AbstractC0883g.f9378s);
        f9597B = enumC0900y8;
        EnumC0900y enumC0900y9 = new EnumC0900y("ENUM", 8, cls, Integer.class, null);
        f9598C = enumC0900y9;
        EnumC0900y enumC0900y10 = new EnumC0900y("MESSAGE", 9, Object.class, Object.class, null);
        f9599D = enumC0900y10;
        f9600E = new EnumC0900y[]{enumC0900y, enumC0900y2, enumC0900y3, enumC0900y4, enumC0900y5, enumC0900y6, enumC0900y7, enumC0900y8, enumC0900y9, enumC0900y10};
    }

    private EnumC0900y(String str, int i8, Class cls, Class cls2, Object obj) {
        this.f9607o = cls;
        this.f9608s = cls2;
        this.f9609t = obj;
    }

    public static EnumC0900y valueOf(String str) {
        return (EnumC0900y) Enum.valueOf(EnumC0900y.class, str);
    }

    public static EnumC0900y[] values() {
        return (EnumC0900y[]) f9600E.clone();
    }

    public Class a() {
        return this.f9608s;
    }
}
