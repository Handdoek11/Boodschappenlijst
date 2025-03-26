package j$.util.stream;

import j$.util.Map;
import j$.util.Spliterator;
import java.util.EnumMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: j$.util.stream.d3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class EnumC5931d3 {
    public static final EnumC5931d3 DISTINCT;
    public static final EnumC5931d3 ORDERED;
    public static final EnumC5931d3 SHORT_CIRCUIT;
    public static final EnumC5931d3 SIZED;
    public static final EnumC5931d3 SORTED;

    /* renamed from: f, reason: collision with root package name */
    static final int f37644f;

    /* renamed from: g, reason: collision with root package name */
    static final int f37645g;

    /* renamed from: h, reason: collision with root package name */
    static final int f37646h;

    /* renamed from: i, reason: collision with root package name */
    private static final int f37647i;

    /* renamed from: j, reason: collision with root package name */
    private static final int f37648j;

    /* renamed from: k, reason: collision with root package name */
    private static final int f37649k;

    /* renamed from: l, reason: collision with root package name */
    static final int f37650l;

    /* renamed from: m, reason: collision with root package name */
    static final int f37651m;

    /* renamed from: n, reason: collision with root package name */
    static final int f37652n;

    /* renamed from: o, reason: collision with root package name */
    static final int f37653o;

    /* renamed from: p, reason: collision with root package name */
    static final int f37654p;

    /* renamed from: q, reason: collision with root package name */
    static final int f37655q;

    /* renamed from: r, reason: collision with root package name */
    static final int f37656r;

    /* renamed from: s, reason: collision with root package name */
    static final int f37657s;

    /* renamed from: t, reason: collision with root package name */
    static final int f37658t;

    /* renamed from: u, reason: collision with root package name */
    static final int f37659u;

    /* renamed from: v, reason: collision with root package name */
    private static final /* synthetic */ EnumC5931d3[] f37660v;

    /* renamed from: a, reason: collision with root package name */
    private final EnumMap f37661a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37662b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37663c;

    /* renamed from: d, reason: collision with root package name */
    private final int f37664d;

    /* renamed from: e, reason: collision with root package name */
    private final int f37665e;

    public static EnumC5931d3 valueOf(String str) {
        return (EnumC5931d3) Enum.valueOf(EnumC5931d3.class, str);
    }

    public static EnumC5931d3[] values() {
        return (EnumC5931d3[]) f37660v.clone();
    }

    static {
        EnumC5926c3 enumC5926c3 = EnumC5926c3.SPLITERATOR;
        C5921b3 v7 = v(enumC5926c3);
        EnumC5926c3 enumC5926c32 = EnumC5926c3.STREAM;
        v7.a(enumC5926c32);
        EnumC5926c3 enumC5926c33 = EnumC5926c3.OP;
        v7.f37631a.put((EnumMap) enumC5926c33, (EnumC5926c3) 3);
        EnumC5931d3 enumC5931d3 = new EnumC5931d3("DISTINCT", 0, 0, v7);
        DISTINCT = enumC5931d3;
        C5921b3 v8 = v(enumC5926c3);
        v8.a(enumC5926c32);
        v8.f37631a.put((EnumMap) enumC5926c33, (EnumC5926c3) 3);
        EnumC5931d3 enumC5931d32 = new EnumC5931d3("SORTED", 1, 1, v8);
        SORTED = enumC5931d32;
        C5921b3 v9 = v(enumC5926c3);
        v9.a(enumC5926c32);
        EnumMap enumMap = v9.f37631a;
        enumMap.put((EnumMap) enumC5926c33, (EnumC5926c3) 3);
        EnumC5926c3 enumC5926c34 = EnumC5926c3.TERMINAL_OP;
        enumMap.put((EnumMap) enumC5926c34, (EnumC5926c3) 2);
        EnumC5926c3 enumC5926c35 = EnumC5926c3.UPSTREAM_TERMINAL_OP;
        enumMap.put((EnumMap) enumC5926c35, (EnumC5926c3) 2);
        EnumC5931d3 enumC5931d33 = new EnumC5931d3("ORDERED", 2, 2, v9);
        ORDERED = enumC5931d33;
        C5921b3 v10 = v(enumC5926c3);
        v10.a(enumC5926c32);
        v10.f37631a.put((EnumMap) enumC5926c33, (EnumC5926c3) 2);
        EnumC5931d3 enumC5931d34 = new EnumC5931d3("SIZED", 3, 3, v10);
        SIZED = enumC5931d34;
        C5921b3 v11 = v(enumC5926c33);
        v11.a(enumC5926c34);
        EnumC5931d3 enumC5931d35 = new EnumC5931d3("SHORT_CIRCUIT", 4, 12, v11);
        SHORT_CIRCUIT = enumC5931d35;
        f37660v = new EnumC5931d3[]{enumC5931d3, enumC5931d32, enumC5931d33, enumC5931d34, enumC5931d35};
        f37644f = k(enumC5926c3);
        f37645g = k(enumC5926c32);
        f37646h = k(enumC5926c33);
        k(enumC5926c34);
        k(enumC5926c35);
        int i8 = 0;
        for (EnumC5931d3 enumC5931d36 : values()) {
            i8 |= enumC5931d36.f37665e;
        }
        f37647i = i8;
        int i9 = f37645g;
        f37648j = i9;
        int i10 = i9 << 1;
        f37649k = i10;
        f37650l = i9 | i10;
        EnumC5931d3 enumC5931d37 = DISTINCT;
        f37651m = enumC5931d37.f37663c;
        f37652n = enumC5931d37.f37664d;
        EnumC5931d3 enumC5931d38 = SORTED;
        f37653o = enumC5931d38.f37663c;
        f37654p = enumC5931d38.f37664d;
        EnumC5931d3 enumC5931d39 = ORDERED;
        f37655q = enumC5931d39.f37663c;
        f37656r = enumC5931d39.f37664d;
        EnumC5931d3 enumC5931d310 = SIZED;
        f37657s = enumC5931d310.f37663c;
        f37658t = enumC5931d310.f37664d;
        f37659u = SHORT_CIRCUIT.f37663c;
    }

    private static C5921b3 v(EnumC5926c3 enumC5926c3) {
        C5921b3 c5921b3 = new C5921b3(new EnumMap(EnumC5926c3.class));
        c5921b3.a(enumC5926c3);
        return c5921b3;
    }

    private EnumC5931d3(String str, int i8, int i9, C5921b3 c5921b3) {
        EnumC5926c3[] values = EnumC5926c3.values();
        int length = values.length;
        int i10 = 0;
        while (true) {
            EnumMap enumMap = c5921b3.f37631a;
            if (i10 < length) {
                Map.EL.b(enumMap, values[i10], 0);
                i10++;
            } else {
                this.f37661a = enumMap;
                int i11 = i9 * 2;
                this.f37662b = i11;
                this.f37663c = 1 << i11;
                this.f37664d = 2 << i11;
                this.f37665e = 3 << i11;
                return;
            }
        }
    }

    final boolean n(int i8) {
        return (i8 & this.f37665e) == this.f37663c;
    }

    final boolean s(int i8) {
        int i9 = this.f37665e;
        return (i8 & i9) == i9;
    }

    private static int k(EnumC5926c3 enumC5926c3) {
        int i8 = 0;
        for (EnumC5931d3 enumC5931d3 : values()) {
            i8 |= ((Integer) enumC5931d3.f37661a.get(enumC5926c3)).intValue() << enumC5931d3.f37662b;
        }
        return i8;
    }

    static int j(int i8, int i9) {
        int i10;
        if (i8 == 0) {
            i10 = f37647i;
        } else {
            i10 = ~(((f37648j & i8) << 1) | i8 | ((f37649k & i8) >> 1));
        }
        return i8 | (i9 & i10);
    }

    static int w(int i8) {
        return i8 & ((~i8) >> 1) & f37648j;
    }

    static int m(Spliterator spliterator) {
        int characteristics = spliterator.characteristics();
        int i8 = characteristics & 4;
        int i9 = f37644f;
        return (i8 == 0 || spliterator.getComparator() == null) ? characteristics & i9 : characteristics & i9 & (-5);
    }
}
