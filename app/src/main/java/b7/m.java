package b7;

import U6.I;
import Z6.AbstractC0799m;

/* loaded from: classes2.dex */
final class m extends I {

    /* renamed from: t, reason: collision with root package name */
    public static final m f12062t = new m();

    private m() {
    }

    @Override // U6.I
    public void q0(A6.g gVar, Runnable runnable) {
        c.f12043z.B0(runnable, l.f12061h, false);
    }

    @Override // U6.I
    public void u0(A6.g gVar, Runnable runnable) {
        c.f12043z.B0(runnable, l.f12061h, true);
    }

    @Override // U6.I
    public I z0(int i8) {
        AbstractC0799m.a(i8);
        return i8 >= l.f12057d ? this : super.z0(i8);
    }
}
