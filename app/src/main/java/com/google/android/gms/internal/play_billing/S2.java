package com.google.android.gms.internal.play_billing;

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
/* loaded from: classes2.dex */
public final class S2 {

    /* renamed from: A, reason: collision with root package name */
    public static final S2 f29816A;

    /* renamed from: B, reason: collision with root package name */
    public static final S2 f29817B;

    /* renamed from: C, reason: collision with root package name */
    private static final /* synthetic */ S2[] f29818C;

    /* renamed from: s, reason: collision with root package name */
    public static final S2 f29819s;

    /* renamed from: t, reason: collision with root package name */
    public static final S2 f29820t;

    /* renamed from: u, reason: collision with root package name */
    public static final S2 f29821u;

    /* renamed from: v, reason: collision with root package name */
    public static final S2 f29822v;

    /* renamed from: w, reason: collision with root package name */
    public static final S2 f29823w;

    /* renamed from: x, reason: collision with root package name */
    public static final S2 f29824x;

    /* renamed from: y, reason: collision with root package name */
    public static final S2 f29825y;

    /* renamed from: z, reason: collision with root package name */
    public static final S2 f29826z;

    /* renamed from: o, reason: collision with root package name */
    private final Class f29827o;

    static {
        S2 s22 = new S2("VOID", 0, Void.class, Void.class, null);
        f29819s = s22;
        Class cls = Integer.TYPE;
        S2 s23 = new S2("INT", 1, cls, Integer.class, 0);
        f29820t = s23;
        S2 s24 = new S2("LONG", 2, Long.TYPE, Long.class, 0L);
        f29821u = s24;
        S2 s25 = new S2("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f29822v = s25;
        S2 s26 = new S2("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f29823w = s26;
        S2 s27 = new S2("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f29824x = s27;
        S2 s28 = new S2("STRING", 6, String.class, String.class, "");
        f29825y = s28;
        S2 s29 = new S2("BYTE_STRING", 7, AbstractC5176q2.class, AbstractC5176q2.class, AbstractC5176q2.f29971s);
        f29826z = s29;
        S2 s210 = new S2("ENUM", 8, cls, Integer.class, null);
        f29816A = s210;
        S2 s211 = new S2("MESSAGE", 9, Object.class, Object.class, null);
        f29817B = s211;
        f29818C = new S2[]{s22, s23, s24, s25, s26, s27, s28, s29, s210, s211};
    }

    private S2(String str, int i8, Class cls, Class cls2, Object obj) {
        this.f29827o = cls2;
    }

    public static S2[] values() {
        return (S2[]) f29818C.clone();
    }

    public final Class a() {
        return this.f29827o;
    }
}
