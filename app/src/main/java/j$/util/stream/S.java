package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
abstract class S implements J3, K3 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f37564a;

    public /* synthetic */ void accept(double d8) {
        AbstractC6032y0.a();
        throw null;
    }

    public /* synthetic */ void accept(int i8) {
        AbstractC6032y0.k();
        throw null;
    }

    public /* synthetic */ void accept(long j8) {
        AbstractC6032y0.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final /* synthetic */ void l(long j8) {
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final /* synthetic */ boolean n() {
        return false;
    }

    protected S(boolean z7) {
        this.f37564a = z7;
    }

    @Override // j$.util.stream.J3
    public final int d() {
        if (this.f37564a) {
            return 0;
        }
        return EnumC5931d3.f37656r;
    }

    public final void e(AbstractC5917b abstractC5917b, Spliterator spliterator) {
        if (this.f37564a) {
            new T(abstractC5917b, spliterator, this).invoke();
        } else {
            new U(abstractC5917b, spliterator, abstractC5917b.V(this)).invoke();
        }
    }
}
