package j$.util.stream;

import java.util.function.DoublePredicate;

/* loaded from: classes3.dex */
final class a4 extends AbstractC5950h2 implements d4 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b4 f37617b;

    @Override // j$.util.stream.d4
    public final long f() {
        return 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a4(b4 b4Var, InterfaceC5985o2 interfaceC5985o2, boolean z7) {
        super(interfaceC5985o2);
        this.f37617b = b4Var;
    }

    @Override // j$.util.stream.InterfaceC5970l2, j$.util.stream.InterfaceC5985o2
    public final void accept(double d8) {
        this.f37617b.getClass();
        DoublePredicate doublePredicate = null;
        doublePredicate.test(d8);
        throw null;
    }
}
