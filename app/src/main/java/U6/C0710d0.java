package U6;

import x6.C6916E;

/* renamed from: U6.d0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0710d0 extends AbstractC0727m {

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC0708c0 f5439o;

    public C0710d0(InterfaceC0708c0 interfaceC0708c0) {
        this.f5439o = interfaceC0708c0;
    }

    @Override // U6.AbstractC0729n
    public void b(Throwable th) {
        this.f5439o.c();
    }

    @Override // I6.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Throwable) obj);
        return C6916E.f44463a;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f5439o + ']';
    }
}
