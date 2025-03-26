package q3;

/* loaded from: classes.dex */
final class k7 extends d7 {

    /* renamed from: w, reason: collision with root package name */
    static final d7 f41792w = new k7(null, new Object[0], 0);

    /* renamed from: u, reason: collision with root package name */
    final transient Object[] f41793u;

    /* renamed from: v, reason: collision with root package name */
    private final transient int f41794v;

    private k7(Object obj, Object[] objArr, int i8) {
        this.f41793u = objArr;
        this.f41794v = i8;
    }

    static k7 h(int i8, Object[] objArr, c7 c7Var) {
        Object obj = objArr[0];
        obj.getClass();
        Object obj2 = objArr[1];
        obj2.getClass();
        AbstractC6503j3.a(obj, obj2);
        return new k7(null, objArr, 1);
    }

    @Override // q3.d7
    final M4 a() {
        return new j7(this.f41793u, 1, this.f41794v);
    }

    @Override // q3.d7
    final e7 e() {
        return new h7(this, this.f41793u, 0, this.f41794v);
    }

    @Override // q3.d7
    final e7 f() {
        return new i7(this, new j7(this.f41793u, 0, this.f41794v));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    @Override // q3.d7, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f41793u
            int r1 = r4.f41794v
            r2 = 0
            if (r5 != 0) goto L9
        L7:
            r5 = r2
            goto L1d
        L9:
            r3 = 1
            if (r1 != r3) goto L7
            r1 = 0
            r1 = r0[r1]
            r1.getClass()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L7
            r5 = r0[r3]
            r5.getClass()
        L1d:
            if (r5 != 0) goto L20
            return r2
        L20:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.k7.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f41794v;
    }
}
