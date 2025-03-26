package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.k2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5965k2 implements InterfaceC5985o2 {

    /* renamed from: a, reason: collision with root package name */
    protected final InterfaceC5985o2 f37727a;

    @Override // j$.util.stream.InterfaceC5985o2
    public final /* synthetic */ void accept(double d8) {
        AbstractC6032y0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final /* synthetic */ void accept(int i8) {
        AbstractC6032y0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC5985o2, j$.util.stream.InterfaceC5980n2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j8) {
        AbstractC6032y0.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public AbstractC5965k2(InterfaceC5985o2 interfaceC5985o2) {
        this.f37727a = (InterfaceC5985o2) Objects.requireNonNull(interfaceC5985o2);
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public void l(long j8) {
        this.f37727a.l(j8);
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public void k() {
        this.f37727a.k();
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public boolean n() {
        return this.f37727a.n();
    }
}
