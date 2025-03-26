package U6;

import java.util.concurrent.Future;
import x6.C6916E;

/* renamed from: U6.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0725l extends AbstractC0727m {

    /* renamed from: o, reason: collision with root package name */
    private final Future f5465o;

    public C0725l(Future future) {
        this.f5465o = future;
    }

    @Override // U6.AbstractC0729n
    public void b(Throwable th) {
        if (th != null) {
            this.f5465o.cancel(false);
        }
    }

    @Override // I6.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Throwable) obj);
        return C6916E.f44463a;
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f5465o + ']';
    }
}
