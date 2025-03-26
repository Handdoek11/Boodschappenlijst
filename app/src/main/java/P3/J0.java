package p3;

import java.util.Iterator;

/* loaded from: classes.dex */
final class J0 extends G0 {

    /* renamed from: y, reason: collision with root package name */
    private static final Object[] f40180y;

    /* renamed from: z, reason: collision with root package name */
    static final J0 f40181z;

    /* renamed from: t, reason: collision with root package name */
    final transient Object[] f40182t;

    /* renamed from: u, reason: collision with root package name */
    private final transient int f40183u;

    /* renamed from: v, reason: collision with root package name */
    final transient Object[] f40184v;

    /* renamed from: w, reason: collision with root package name */
    private final transient int f40185w;

    /* renamed from: x, reason: collision with root package name */
    private final transient int f40186x;

    static {
        Object[] objArr = new Object[0];
        f40180y = objArr;
        f40181z = new J0(objArr, 0, objArr, 0, 0);
    }

    J0(Object[] objArr, int i8, Object[] objArr2, int i9, int i10) {
        this.f40182t = objArr;
        this.f40183u = i8;
        this.f40184v = objArr2;
        this.f40185w = i9;
        this.f40186x = i10;
    }

    @Override // p3.B0
    final int b(Object[] objArr, int i8) {
        System.arraycopy(this.f40182t, 0, objArr, 0, this.f40186x);
        return this.f40186x;
    }

    @Override // p3.B0
    final int c() {
        return this.f40186x;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f40184v;
            if (objArr.length != 0) {
                int a8 = A0.a(obj.hashCode());
                while (true) {
                    int i8 = a8 & this.f40185w;
                    Object obj2 = objArr[i8];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    a8 = i8 + 1;
                }
            }
        }
        return false;
    }

    @Override // p3.B0
    final int d() {
        return 0;
    }

    @Override // p3.B0
    final Object[] e() {
        return this.f40182t;
    }

    @Override // p3.G0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f40183u;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return n().listIterator(0);
    }

    @Override // p3.G0
    final F0 o() {
        return F0.n(this.f40182t, this.f40186x);
    }

    @Override // p3.G0
    final boolean r() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f40186x;
    }
}
