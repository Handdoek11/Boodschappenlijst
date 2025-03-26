package H;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f2781a = new h();

    /* renamed from: b, reason: collision with root package name */
    private static final float[] f2782b;

    /* renamed from: c, reason: collision with root package name */
    private static final float[] f2783c;

    /* renamed from: d, reason: collision with root package name */
    private static final z f2784d;

    /* renamed from: e, reason: collision with root package name */
    private static final z f2785e;

    /* renamed from: f, reason: collision with root package name */
    private static final x f2786f;

    /* renamed from: g, reason: collision with root package name */
    private static final x f2787g;

    /* renamed from: h, reason: collision with root package name */
    private static final x f2788h;

    /* renamed from: i, reason: collision with root package name */
    private static final x f2789i;

    /* renamed from: j, reason: collision with root package name */
    private static final x f2790j;

    /* renamed from: k, reason: collision with root package name */
    private static final x f2791k;

    /* renamed from: l, reason: collision with root package name */
    private static final x f2792l;

    /* renamed from: m, reason: collision with root package name */
    private static final x f2793m;

    /* renamed from: n, reason: collision with root package name */
    private static final x f2794n;

    /* renamed from: o, reason: collision with root package name */
    private static final x f2795o;

    /* renamed from: p, reason: collision with root package name */
    private static final x f2796p;

    /* renamed from: q, reason: collision with root package name */
    private static final x f2797q;

    /* renamed from: r, reason: collision with root package name */
    private static final x f2798r;

    /* renamed from: s, reason: collision with root package name */
    private static final x f2799s;

    /* renamed from: t, reason: collision with root package name */
    private static final d f2800t;

    /* renamed from: u, reason: collision with root package name */
    private static final d f2801u;

    /* renamed from: v, reason: collision with root package name */
    private static final x f2802v;

    /* renamed from: w, reason: collision with root package name */
    private static final d f2803w;

    /* renamed from: x, reason: collision with root package name */
    private static final d[] f2804x;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f2782b = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f2783c = fArr2;
        z zVar = new z(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        f2784d = zVar;
        z zVar2 = new z(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        f2785e = zVar2;
        k kVar = k.f2818a;
        x xVar = new x("sRGB IEC61966-2.1", fArr, kVar.e(), zVar, 0);
        f2786f = xVar;
        x xVar2 = new x("sRGB IEC61966-2.1 (Linear)", fArr, kVar.e(), 1.0d, 0.0f, 1.0f, 1);
        f2787g = xVar2;
        x xVar3 = new x("scRGB-nl IEC 61966-2-2:2003", fArr, kVar.e(), null, new j() { // from class: H.f
            @Override // H.j
            public final double a(double d8) {
                return h.c(d8);
            }
        }, new j() { // from class: H.g
            @Override // H.j
            public final double a(double d8) {
                return h.d(d8);
            }
        }, -0.799f, 2.399f, zVar, 2);
        f2788h = xVar3;
        x xVar4 = new x("scRGB IEC 61966-2-2:2003", fArr, kVar.e(), 1.0d, -0.5f, 7.499f, 3);
        f2789i = xVar4;
        x xVar5 = new x("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, kVar.e(), new z(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 4);
        f2790j = xVar5;
        x xVar6 = new x("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, kVar.e(), new z(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, null), 5);
        f2791k = xVar6;
        x xVar7 = new x("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new A(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f2792l = xVar7;
        x xVar8 = new x("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, kVar.e(), zVar, 7);
        f2793m = xVar8;
        x xVar9 = new x("NTSC (1953)", fArr2, kVar.a(), new z(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 8);
        f2794n = xVar9;
        x xVar10 = new x("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, kVar.e(), new z(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 9);
        f2795o = xVar10;
        x xVar11 = new x("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, kVar.e(), 2.2d, 0.0f, 1.0f, 10);
        f2796p = xVar11;
        x xVar12 = new x("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, kVar.b(), new z(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d, 96, null), 11);
        f2797q = xVar12;
        x xVar13 = new x("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, kVar.d(), 1.0d, -65504.0f, 65504.0f, 12);
        f2798r = xVar13;
        x xVar14 = new x("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, kVar.d(), 1.0d, -65504.0f, 65504.0f, 13);
        f2799s = xVar14;
        B b8 = new B("Generic XYZ", 14);
        f2800t = b8;
        l lVar = new l("Generic L*a*b*", 15);
        f2801u = lVar;
        x xVar15 = new x("None", fArr, kVar.e(), zVar2, 16);
        f2802v = xVar15;
        m mVar = new m("Oklab", 17);
        f2803w = mVar;
        f2804x = new d[]{xVar, xVar2, xVar3, xVar4, xVar5, xVar6, xVar7, xVar8, xVar9, xVar10, xVar11, xVar12, xVar13, xVar14, b8, lVar, xVar15, mVar};
    }

    private h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double c(double d8) {
        return e.a(d8, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double d(double d8) {
        return e.b(d8, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    public final d[] e() {
        return f2804x;
    }

    public final float[] f() {
        return f2783c;
    }

    public final d g() {
        return f2803w;
    }

    public final x h() {
        return f2786f;
    }

    public final float[] i() {
        return f2782b;
    }

    public final x j() {
        return f2802v;
    }
}
