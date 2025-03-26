package r6;

/* renamed from: r6.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6716h {

    /* renamed from: a, reason: collision with root package name */
    final float f42623a;

    /* renamed from: b, reason: collision with root package name */
    int f42624b;

    /* renamed from: c, reason: collision with root package name */
    int f42625c;

    /* renamed from: d, reason: collision with root package name */
    int f42626d;

    /* renamed from: e, reason: collision with root package name */
    Object[] f42627e;

    public C6716h() {
        this(16, 0.75f);
    }

    static int c(int i8) {
        int i9 = i8 * (-1640531527);
        return i9 ^ (i9 >>> 16);
    }

    public boolean a(Object obj) {
        Object obj2;
        Object[] objArr = this.f42627e;
        int i8 = this.f42624b;
        int c8 = c(obj.hashCode()) & i8;
        Object obj3 = objArr[c8];
        if (obj3 != null) {
            if (obj3.equals(obj)) {
                return false;
            }
            do {
                c8 = (c8 + 1) & i8;
                obj2 = objArr[c8];
                if (obj2 == null) {
                }
            } while (!obj2.equals(obj));
            return false;
        }
        objArr[c8] = obj;
        int i9 = this.f42625c + 1;
        this.f42625c = i9;
        if (i9 >= this.f42626d) {
            d();
        }
        return true;
    }

    public Object[] b() {
        return this.f42627e;
    }

    void d() {
        Object obj;
        Object[] objArr = this.f42627e;
        int length = objArr.length;
        int i8 = length << 1;
        int i9 = i8 - 1;
        Object[] objArr2 = new Object[i8];
        int i10 = this.f42625c;
        while (true) {
            int i11 = i10 - 1;
            if (i10 == 0) {
                this.f42624b = i9;
                this.f42626d = (int) (i8 * this.f42623a);
                this.f42627e = objArr2;
                return;
            }
            do {
                length--;
                obj = objArr[length];
            } while (obj == null);
            int c8 = c(obj.hashCode()) & i9;
            if (objArr2[c8] != null) {
                do {
                    c8 = (c8 + 1) & i9;
                } while (objArr2[c8] != null);
            }
            objArr2[c8] = objArr[length];
            i10 = i11;
        }
    }

    public boolean e(Object obj) {
        Object obj2;
        Object[] objArr = this.f42627e;
        int i8 = this.f42624b;
        int c8 = c(obj.hashCode()) & i8;
        Object obj3 = objArr[c8];
        if (obj3 == null) {
            return false;
        }
        if (obj3.equals(obj)) {
            return f(c8, objArr, i8);
        }
        do {
            c8 = (c8 + 1) & i8;
            obj2 = objArr[c8];
            if (obj2 == null) {
                return false;
            }
        } while (!obj2.equals(obj));
        return f(c8, objArr, i8);
    }

    boolean f(int i8, Object[] objArr, int i9) {
        int i10;
        Object obj;
        this.f42625c--;
        while (true) {
            int i11 = i8 + 1;
            while (true) {
                i10 = i11 & i9;
                obj = objArr[i10];
                if (obj == null) {
                    objArr[i8] = null;
                    return true;
                }
                int c8 = c(obj.hashCode()) & i9;
                if (i8 <= i10) {
                    if (i8 >= c8 || c8 > i10) {
                        break;
                    }
                    i11 = i10 + 1;
                } else if (i8 < c8 || c8 <= i10) {
                    i11 = i10 + 1;
                }
            }
            objArr[i8] = obj;
            i8 = i10;
        }
    }

    public C6716h(int i8, float f8) {
        this.f42623a = f8;
        int a8 = AbstractC6717i.a(i8);
        this.f42624b = a8 - 1;
        this.f42626d = (int) (f8 * a8);
        this.f42627e = new Object[a8];
    }
}
