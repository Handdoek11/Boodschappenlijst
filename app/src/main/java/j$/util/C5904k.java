package j$.util;

import java.util.RandomAccess;

/* renamed from: j$.util.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5904k extends C5902i implements RandomAccess {
    private static final long serialVersionUID = 1530674583602358482L;

    @Override // j$.util.C5902i, java.util.List
    public final java.util.List subList(int i8, int i9) {
        C5904k c5904k;
        synchronized (this.f37379b) {
            c5904k = new C5904k(this.f37383c.subList(i8, i9), this.f37379b);
        }
        return c5904k;
    }

    private Object writeReplace() {
        return new C5902i(this.f37383c);
    }
}
