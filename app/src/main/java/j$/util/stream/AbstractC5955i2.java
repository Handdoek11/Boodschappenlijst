package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.i2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5955i2 implements InterfaceC5975m2 {

    /* renamed from: a, reason: collision with root package name */
    protected final InterfaceC5985o2 f37715a;

    @Override // j$.util.stream.InterfaceC5985o2
    public final /* synthetic */ void accept(double d8) {
        AbstractC6032y0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC5985o2, j$.util.stream.InterfaceC5980n2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j8) {
        AbstractC6032y0.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC5975m2
    public final /* synthetic */ void m(Integer num) {
        AbstractC6032y0.g(this, num);
    }

    public AbstractC5955i2(InterfaceC5985o2 interfaceC5985o2) {
        this.f37715a = (InterfaceC5985o2) Objects.requireNonNull(interfaceC5985o2);
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public void l(long j8) {
        this.f37715a.l(j8);
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public void k() {
        this.f37715a.k();
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public boolean n() {
        return this.f37715a.n();
    }
}
