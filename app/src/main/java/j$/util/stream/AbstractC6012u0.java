package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.u0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC6012u0 implements InterfaceC5985o2 {

    /* renamed from: a, reason: collision with root package name */
    boolean f37795a;

    /* renamed from: b, reason: collision with root package name */
    boolean f37796b;

    @Override // j$.util.stream.InterfaceC5985o2
    public /* synthetic */ void accept(double d8) {
        AbstractC6032y0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public /* synthetic */ void accept(int i8) {
        AbstractC6032y0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC5985o2, j$.util.stream.InterfaceC5980n2, java.util.function.LongConsumer
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

    AbstractC6012u0(EnumC6017v0 enumC6017v0) {
        this.f37796b = !enumC6017v0.f37803b;
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final boolean n() {
        return this.f37795a;
    }
}
