package j$.util;

import java.util.RandomAccess;

/* renamed from: j$.util.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6043v extends C5909p implements RandomAccess {
    private static final long serialVersionUID = -2542308836966382001L;

    @Override // j$.util.C5909p, java.util.List
    public final java.util.List subList(int i8, int i9) {
        return new C6043v(this.f37407b.subList(i8, i9));
    }

    private Object writeReplace() {
        return new C5909p(this.f37407b);
    }
}
