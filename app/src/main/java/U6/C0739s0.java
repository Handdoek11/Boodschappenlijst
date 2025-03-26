package U6;

import x6.C6916E;

/* renamed from: U6.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0739s0 extends AbstractC0727m {

    /* renamed from: o, reason: collision with root package name */
    private final I6.l f5479o;

    public C0739s0(I6.l lVar) {
        this.f5479o = lVar;
    }

    @Override // U6.AbstractC0729n
    public void b(Throwable th) {
        this.f5479o.invoke(th);
    }

    @Override // I6.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Throwable) obj);
        return C6916E.f44463a;
    }

    public String toString() {
        return "InvokeOnCancel[" + Q.a(this.f5479o) + '@' + Q.b(this) + ']';
    }
}
