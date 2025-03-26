package c4;

/* loaded from: classes2.dex */
final class K extends r {

    /* renamed from: y, reason: collision with root package name */
    private static final Object[] f12148y;

    /* renamed from: z, reason: collision with root package name */
    static final K f12149z;

    /* renamed from: t, reason: collision with root package name */
    final transient Object[] f12150t;

    /* renamed from: u, reason: collision with root package name */
    private final transient int f12151u;

    /* renamed from: v, reason: collision with root package name */
    final transient Object[] f12152v;

    /* renamed from: w, reason: collision with root package name */
    private final transient int f12153w;

    /* renamed from: x, reason: collision with root package name */
    private final transient int f12154x;

    static {
        Object[] objArr = new Object[0];
        f12148y = objArr;
        f12149z = new K(objArr, 0, objArr, 0, 0);
    }

    K(Object[] objArr, int i8, Object[] objArr2, int i9, int i10) {
        this.f12150t = objArr;
        this.f12151u = i8;
        this.f12152v = objArr2;
        this.f12153w = i9;
        this.f12154x = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public S iterator() {
        return n().iterator();
    }

    @Override // c4.AbstractC1011n
    int b(Object[] objArr, int i8) {
        System.arraycopy(this.f12150t, 0, objArr, i8, this.f12154x);
        return i8 + this.f12154x;
    }

    @Override // c4.AbstractC1011n
    Object[] c() {
        return this.f12150t;
    }

    @Override // c4.AbstractC1011n, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.f12152v;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int c8 = AbstractC1010m.c(obj);
        while (true) {
            int i8 = c8 & this.f12153w;
            Object obj2 = objArr[i8];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            c8 = i8 + 1;
        }
    }

    @Override // c4.AbstractC1011n
    int d() {
        return this.f12154x;
    }

    @Override // c4.AbstractC1011n
    int e() {
        return 0;
    }

    @Override // c4.r, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f12151u;
    }

    @Override // c4.AbstractC1011n
    boolean j() {
        return false;
    }

    @Override // c4.r
    AbstractC1012o r() {
        return AbstractC1012o.o(this.f12150t, this.f12154x);
    }

    @Override // c4.r
    boolean s() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f12154x;
    }
}
