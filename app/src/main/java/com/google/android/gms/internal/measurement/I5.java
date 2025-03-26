package com.google.android.gms.internal.measurement;

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
/* loaded from: classes.dex */
public class I5 {

    /* renamed from: A, reason: collision with root package name */
    public static final I5 f28894A;

    /* renamed from: B, reason: collision with root package name */
    public static final I5 f28895B;

    /* renamed from: C, reason: collision with root package name */
    public static final I5 f28896C;

    /* renamed from: D, reason: collision with root package name */
    public static final I5 f28897D;

    /* renamed from: E, reason: collision with root package name */
    public static final I5 f28898E;

    /* renamed from: F, reason: collision with root package name */
    public static final I5 f28899F;

    /* renamed from: G, reason: collision with root package name */
    public static final I5 f28900G;

    /* renamed from: H, reason: collision with root package name */
    public static final I5 f28901H;

    /* renamed from: I, reason: collision with root package name */
    public static final I5 f28902I;

    /* renamed from: J, reason: collision with root package name */
    public static final I5 f28903J;

    /* renamed from: K, reason: collision with root package name */
    public static final I5 f28904K;

    /* renamed from: L, reason: collision with root package name */
    private static final /* synthetic */ I5[] f28905L;

    /* renamed from: t, reason: collision with root package name */
    public static final I5 f28906t;

    /* renamed from: u, reason: collision with root package name */
    public static final I5 f28907u;

    /* renamed from: v, reason: collision with root package name */
    public static final I5 f28908v;

    /* renamed from: w, reason: collision with root package name */
    public static final I5 f28909w;

    /* renamed from: x, reason: collision with root package name */
    public static final I5 f28910x;

    /* renamed from: y, reason: collision with root package name */
    public static final I5 f28911y;

    /* renamed from: z, reason: collision with root package name */
    public static final I5 f28912z;

    /* renamed from: o, reason: collision with root package name */
    private final P5 f28913o;

    /* renamed from: s, reason: collision with root package name */
    private final int f28914s;

    static {
        I5 i52 = new I5("DOUBLE", 0, P5.DOUBLE, 1);
        f28906t = i52;
        I5 i53 = new I5("FLOAT", 1, P5.FLOAT, 5);
        f28907u = i53;
        P5 p52 = P5.LONG;
        I5 i54 = new I5("INT64", 2, p52, 0);
        f28908v = i54;
        I5 i55 = new I5("UINT64", 3, p52, 0);
        f28909w = i55;
        P5 p53 = P5.INT;
        I5 i56 = new I5("INT32", 4, p53, 0);
        f28910x = i56;
        I5 i57 = new I5("FIXED64", 5, p52, 1);
        f28911y = i57;
        I5 i58 = new I5("FIXED32", 6, p53, 5);
        f28912z = i58;
        I5 i59 = new I5("BOOL", 7, P5.BOOLEAN, 0);
        f28894A = i59;
        int i8 = 2;
        L5 l52 = new L5("STRING", P5.STRING);
        f28895B = l52;
        P5 p54 = P5.MESSAGE;
        K5 k52 = new K5("GROUP", p54);
        f28896C = k52;
        N5 n52 = new N5("MESSAGE", p54);
        f28897D = n52;
        M5 m52 = new M5("BYTES", P5.BYTE_STRING);
        f28898E = m52;
        I5 i510 = new I5("UINT32", 12, p53, 0);
        f28899F = i510;
        I5 i511 = new I5("ENUM", 13, P5.ENUM, 0);
        f28900G = i511;
        I5 i512 = new I5("SFIXED32", 14, p53, 5);
        f28901H = i512;
        I5 i513 = new I5("SFIXED64", 15, p52, 1);
        f28902I = i513;
        I5 i514 = new I5("SINT32", 16, p53, 0);
        f28903J = i514;
        I5 i515 = new I5("SINT64", 17, p52, 0);
        f28904K = i515;
        f28905L = new I5[]{i52, i53, i54, i55, i56, i57, i58, i59, l52, k52, n52, m52, i510, i511, i512, i513, i514, i515};
    }

    public static I5[] values() {
        return (I5[]) f28905L.clone();
    }

    public final P5 a() {
        return this.f28913o;
    }

    private I5(String str, int i8, P5 p52, int i9) {
        this.f28913o = p52;
        this.f28914s = i9;
    }
}
