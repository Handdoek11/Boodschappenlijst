package com.google.android.gms.internal.ads;

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
/* renamed from: com.google.android.gms.internal.ads.cv0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2348cv0 {

    /* renamed from: A, reason: collision with root package name */
    public static final EnumC2348cv0 f21326A;

    /* renamed from: B, reason: collision with root package name */
    public static final EnumC2348cv0 f21327B;

    /* renamed from: C, reason: collision with root package name */
    private static final /* synthetic */ EnumC2348cv0[] f21328C;

    /* renamed from: s, reason: collision with root package name */
    public static final EnumC2348cv0 f21329s;

    /* renamed from: t, reason: collision with root package name */
    public static final EnumC2348cv0 f21330t;

    /* renamed from: u, reason: collision with root package name */
    public static final EnumC2348cv0 f21331u;

    /* renamed from: v, reason: collision with root package name */
    public static final EnumC2348cv0 f21332v;

    /* renamed from: w, reason: collision with root package name */
    public static final EnumC2348cv0 f21333w;

    /* renamed from: x, reason: collision with root package name */
    public static final EnumC2348cv0 f21334x;

    /* renamed from: y, reason: collision with root package name */
    public static final EnumC2348cv0 f21335y;

    /* renamed from: z, reason: collision with root package name */
    public static final EnumC2348cv0 f21336z;

    /* renamed from: o, reason: collision with root package name */
    private final Class f21337o;

    static {
        EnumC2348cv0 enumC2348cv0 = new EnumC2348cv0("VOID", 0, Void.class, Void.class, null);
        f21329s = enumC2348cv0;
        Class cls = Integer.TYPE;
        EnumC2348cv0 enumC2348cv02 = new EnumC2348cv0("INT", 1, cls, Integer.class, 0);
        f21330t = enumC2348cv02;
        EnumC2348cv0 enumC2348cv03 = new EnumC2348cv0("LONG", 2, Long.TYPE, Long.class, 0L);
        f21331u = enumC2348cv03;
        EnumC2348cv0 enumC2348cv04 = new EnumC2348cv0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f21332v = enumC2348cv04;
        EnumC2348cv0 enumC2348cv05 = new EnumC2348cv0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f21333w = enumC2348cv05;
        EnumC2348cv0 enumC2348cv06 = new EnumC2348cv0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f21334x = enumC2348cv06;
        EnumC2348cv0 enumC2348cv07 = new EnumC2348cv0("STRING", 6, String.class, String.class, "");
        f21335y = enumC2348cv07;
        EnumC2348cv0 enumC2348cv08 = new EnumC2348cv0("BYTE_STRING", 7, AbstractC3542nu0.class, AbstractC3542nu0.class, AbstractC3542nu0.f25048s);
        f21336z = enumC2348cv08;
        EnumC2348cv0 enumC2348cv09 = new EnumC2348cv0("ENUM", 8, cls, Integer.class, null);
        f21326A = enumC2348cv09;
        EnumC2348cv0 enumC2348cv010 = new EnumC2348cv0("MESSAGE", 9, Object.class, Object.class, null);
        f21327B = enumC2348cv010;
        f21328C = new EnumC2348cv0[]{enumC2348cv0, enumC2348cv02, enumC2348cv03, enumC2348cv04, enumC2348cv05, enumC2348cv06, enumC2348cv07, enumC2348cv08, enumC2348cv09, enumC2348cv010};
    }

    private EnumC2348cv0(String str, int i8, Class cls, Class cls2, Object obj) {
        this.f21337o = cls2;
    }

    public static EnumC2348cv0[] values() {
        return (EnumC2348cv0[]) f21328C.clone();
    }

    public final Class a() {
        return this.f21337o;
    }
}
