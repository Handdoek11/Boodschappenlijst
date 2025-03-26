package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.h2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5950h2 implements InterfaceC5970l2 {

    /* renamed from: a, reason: collision with root package name */
    protected final InterfaceC5985o2 f37708a;

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

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC5970l2
    public final /* synthetic */ void p(Double d8) {
        AbstractC6032y0.e(this, d8);
    }

    public AbstractC5950h2(InterfaceC5985o2 interfaceC5985o2) {
        this.f37708a = (InterfaceC5985o2) Objects.requireNonNull(interfaceC5985o2);
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public void l(long j8) {
        this.f37708a.l(j8);
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public void k() {
        this.f37708a.k();
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public boolean n() {
        return this.f37708a.n();
    }
}
