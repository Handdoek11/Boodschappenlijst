package g1;

/* renamed from: g1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5798a implements e {

    /* renamed from: o, reason: collision with root package name */
    private final String f35996o;

    /* renamed from: s, reason: collision with root package name */
    private final Object[] f35997s;

    public C5798a(String str, Object[] objArr) {
        this.f35996o = str;
        this.f35997s = objArr;
    }

    private static void a(d dVar, int i8, Object obj) {
        if (obj == null) {
            dVar.f0(i8);
            return;
        }
        if (obj instanceof byte[]) {
            dVar.R(i8, (byte[]) obj);
            return;
        }
        if (obj instanceof Float) {
            dVar.F(i8, ((Float) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            dVar.F(i8, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Long) {
            dVar.O(i8, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof Integer) {
            dVar.O(i8, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Short) {
            dVar.O(i8, ((Short) obj).shortValue());
            return;
        }
        if (obj instanceof Byte) {
            dVar.O(i8, ((Byte) obj).byteValue());
            return;
        }
        if (obj instanceof String) {
            dVar.w(i8, (String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            dVar.O(i8, ((Boolean) obj).booleanValue() ? 1L : 0L);
            return;
        }
        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i8 + " Supported types: null, byte[], float, double, long, int, short, byte, string");
    }

    public static void b(d dVar, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i8 = 0;
        while (i8 < length) {
            Object obj = objArr[i8];
            i8++;
            a(dVar, i8, obj);
        }
    }

    @Override // g1.e
    public void d(d dVar) {
        b(dVar, this.f35997s);
    }

    @Override // g1.e
    public String e() {
        return this.f35996o;
    }

    public C5798a(String str) {
        this(str, null);
    }
}
