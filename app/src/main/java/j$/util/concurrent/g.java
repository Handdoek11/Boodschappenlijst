package j$.util.concurrent;

/* loaded from: classes3.dex */
final class g extends l {

    /* renamed from: e, reason: collision with root package name */
    final l[] f37314e;

    g(l[] lVarArr) {
        super(-1, null, null);
        this.f37314e = lVarArr;
    }

    @Override // j$.util.concurrent.l
    final l a(int i8, Object obj) {
        int length;
        l k8;
        Object obj2;
        l[] lVarArr = this.f37314e;
        loop0: while (obj != null && lVarArr != null && (length = lVarArr.length) != 0 && (k8 = ConcurrentHashMap.k(lVarArr, (length - 1) & i8)) != null) {
            do {
                int i9 = k8.f37321a;
                if (i9 == i8 && ((obj2 = k8.f37322b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return k8;
                }
                if (i9 < 0) {
                    if (k8 instanceof g) {
                        lVarArr = ((g) k8).f37314e;
                    } else {
                        return k8.a(i8, obj);
                    }
                } else {
                    k8 = k8.f37324d;
                }
            } while (k8 != null);
        }
        return null;
    }
}
