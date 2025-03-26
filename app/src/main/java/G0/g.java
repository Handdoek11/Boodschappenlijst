package g0;

/* loaded from: classes.dex */
class g implements f {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f35946a;

    /* renamed from: b, reason: collision with root package name */
    private int f35947b;

    g(int i8) {
        if (i8 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f35946a = new Object[i8];
    }

    @Override // g0.f
    public boolean a(Object obj) {
        int i8 = this.f35947b;
        Object[] objArr = this.f35946a;
        if (i8 >= objArr.length) {
            return false;
        }
        objArr[i8] = obj;
        this.f35947b = i8 + 1;
        return true;
    }

    @Override // g0.f
    public Object b() {
        int i8 = this.f35947b;
        if (i8 <= 0) {
            return null;
        }
        int i9 = i8 - 1;
        Object[] objArr = this.f35946a;
        Object obj = objArr[i9];
        objArr[i9] = null;
        this.f35947b = i8 - 1;
        return obj;
    }

    @Override // g0.f
    public void c(Object[] objArr, int i8) {
        if (i8 > objArr.length) {
            i8 = objArr.length;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            Object obj = objArr[i9];
            int i10 = this.f35947b;
            Object[] objArr2 = this.f35946a;
            if (i10 < objArr2.length) {
                objArr2[i10] = obj;
                this.f35947b = i10 + 1;
            }
        }
    }
}
