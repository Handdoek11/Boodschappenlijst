package com.google.android.gms.internal.wearable;

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
/* renamed from: com.google.android.gms.internal.wearable.t0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC5271t0 {

    /* renamed from: A, reason: collision with root package name */
    public static final EnumC5271t0 f30215A;

    /* renamed from: B, reason: collision with root package name */
    public static final EnumC5271t0 f30216B;

    /* renamed from: C, reason: collision with root package name */
    private static final /* synthetic */ EnumC5271t0[] f30217C;

    /* renamed from: s, reason: collision with root package name */
    public static final EnumC5271t0 f30218s;

    /* renamed from: t, reason: collision with root package name */
    public static final EnumC5271t0 f30219t;

    /* renamed from: u, reason: collision with root package name */
    public static final EnumC5271t0 f30220u;

    /* renamed from: v, reason: collision with root package name */
    public static final EnumC5271t0 f30221v;

    /* renamed from: w, reason: collision with root package name */
    public static final EnumC5271t0 f30222w;

    /* renamed from: x, reason: collision with root package name */
    public static final EnumC5271t0 f30223x;

    /* renamed from: y, reason: collision with root package name */
    public static final EnumC5271t0 f30224y;

    /* renamed from: z, reason: collision with root package name */
    public static final EnumC5271t0 f30225z;

    /* renamed from: o, reason: collision with root package name */
    private final Class f30226o;

    static {
        EnumC5271t0 enumC5271t0 = new EnumC5271t0("VOID", 0, Void.class, Void.class, null);
        f30218s = enumC5271t0;
        Class cls = Integer.TYPE;
        EnumC5271t0 enumC5271t02 = new EnumC5271t0("INT", 1, cls, Integer.class, 0);
        f30219t = enumC5271t02;
        EnumC5271t0 enumC5271t03 = new EnumC5271t0("LONG", 2, Long.TYPE, Long.class, 0L);
        f30220u = enumC5271t03;
        EnumC5271t0 enumC5271t04 = new EnumC5271t0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f30221v = enumC5271t04;
        EnumC5271t0 enumC5271t05 = new EnumC5271t0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f30222w = enumC5271t05;
        EnumC5271t0 enumC5271t06 = new EnumC5271t0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f30223x = enumC5271t06;
        EnumC5271t0 enumC5271t07 = new EnumC5271t0("STRING", 6, String.class, String.class, "");
        f30224y = enumC5271t07;
        EnumC5271t0 enumC5271t08 = new EnumC5271t0("BYTE_STRING", 7, Q.class, Q.class, Q.f30081s);
        f30225z = enumC5271t08;
        EnumC5271t0 enumC5271t09 = new EnumC5271t0("ENUM", 8, cls, Integer.class, null);
        f30215A = enumC5271t09;
        EnumC5271t0 enumC5271t010 = new EnumC5271t0("MESSAGE", 9, Object.class, Object.class, null);
        f30216B = enumC5271t010;
        f30217C = new EnumC5271t0[]{enumC5271t0, enumC5271t02, enumC5271t03, enumC5271t04, enumC5271t05, enumC5271t06, enumC5271t07, enumC5271t08, enumC5271t09, enumC5271t010};
    }

    private EnumC5271t0(String str, int i8, Class cls, Class cls2, Object obj) {
        this.f30226o = cls2;
    }

    public static EnumC5271t0[] values() {
        return (EnumC5271t0[]) f30217C.clone();
    }

    public final Class a() {
        return this.f30226o;
    }
}
