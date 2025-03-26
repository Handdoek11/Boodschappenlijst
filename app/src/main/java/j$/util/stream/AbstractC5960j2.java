package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.j2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5960j2 implements InterfaceC5980n2 {

    /* renamed from: a, reason: collision with root package name */
    protected final InterfaceC5985o2 f37720a;

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

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC5980n2
    public final /* synthetic */ void j(Long l8) {
        AbstractC6032y0.i(this, l8);
    }

    public AbstractC5960j2(InterfaceC5985o2 interfaceC5985o2) {
        this.f37720a = (InterfaceC5985o2) Objects.requireNonNull(interfaceC5985o2);
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public void l(long j8) {
        this.f37720a.l(j8);
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public void k() {
        this.f37720a.k();
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public boolean n() {
        return this.f37720a.n();
    }
}
