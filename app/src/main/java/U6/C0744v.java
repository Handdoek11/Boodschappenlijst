package U6;

import x6.C6916E;

/* renamed from: U6.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0744v extends AbstractC0747w0 implements InterfaceC0742u {

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC0746w f5484v;

    public C0744v(InterfaceC0746w interfaceC0746w) {
        this.f5484v = interfaceC0746w;
    }

    @Override // U6.InterfaceC0742u
    public boolean f(Throwable th) {
        return w().Q(th);
    }

    @Override // U6.InterfaceC0742u
    public InterfaceC0745v0 getParent() {
        return w();
    }

    @Override // I6.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((Throwable) obj);
        return C6916E.f44463a;
    }

    @Override // U6.E
    public void v(Throwable th) {
        this.f5484v.B(w());
    }
}
