package y5;

import J6.s;
import U6.InterfaceC0745v0;
import java.util.concurrent.CancellationException;
import x6.C6916E;

/* loaded from: classes2.dex */
public final class k extends s implements I6.l {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ InterfaceC0745v0 f44627o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(InterfaceC0745v0 interfaceC0745v0) {
        super(1);
        this.f44627o = interfaceC0745v0;
    }

    public final void b(Throwable th) {
        if (th == null) {
            return;
        }
        this.f44627o.l0(new CancellationException(th.getMessage()));
    }

    @Override // I6.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Throwable) obj);
        return C6916E.f44463a;
    }
}
