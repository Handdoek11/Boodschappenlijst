package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 't' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class B4 {

    /* renamed from: A, reason: collision with root package name */
    public static final B4 f28804A;

    /* renamed from: B, reason: collision with root package name */
    public static final B4 f28805B;

    /* renamed from: C, reason: collision with root package name */
    private static final /* synthetic */ B4[] f28806C;

    /* renamed from: s, reason: collision with root package name */
    public static final B4 f28807s;

    /* renamed from: t, reason: collision with root package name */
    public static final B4 f28808t;

    /* renamed from: u, reason: collision with root package name */
    public static final B4 f28809u;

    /* renamed from: v, reason: collision with root package name */
    public static final B4 f28810v;

    /* renamed from: w, reason: collision with root package name */
    public static final B4 f28811w;

    /* renamed from: x, reason: collision with root package name */
    public static final B4 f28812x;

    /* renamed from: y, reason: collision with root package name */
    public static final B4 f28813y;

    /* renamed from: z, reason: collision with root package name */
    public static final B4 f28814z;

    /* renamed from: o, reason: collision with root package name */
    private final Class f28815o;

    static {
        B4 b42 = new B4("VOID", 0, Void.class, Void.class, null);
        f28807s = b42;
        Class cls = Integer.TYPE;
        B4 b43 = new B4("INT", 1, cls, Integer.class, 0);
        f28808t = b43;
        B4 b44 = new B4("LONG", 2, Long.TYPE, Long.class, 0L);
        f28809u = b44;
        B4 b45 = new B4("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f28810v = b45;
        B4 b46 = new B4("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f28811w = b46;
        B4 b47 = new B4("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f28812x = b47;
        B4 b48 = new B4("STRING", 6, String.class, String.class, "");
        f28813y = b48;
        B4 b49 = new B4("BYTE_STRING", 7, K3.class, K3.class, K3.f28931s);
        f28814z = b49;
        B4 b410 = new B4("ENUM", 8, cls, Integer.class, null);
        f28804A = b410;
        B4 b411 = new B4("MESSAGE", 9, Object.class, Object.class, null);
        f28805B = b411;
        f28806C = new B4[]{b42, b43, b44, b45, b46, b47, b48, b49, b410, b411};
    }

    private B4(String str, int i8, Class cls, Class cls2, Object obj) {
        this.f28815o = cls2;
    }

    public static B4[] values() {
        return (B4[]) f28806C.clone();
    }

    public final Class a() {
        return this.f28815o;
    }
}
