package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
abstract class L implements K3 {

    /* renamed from: a, reason: collision with root package name */
    boolean f37499a;

    /* renamed from: b, reason: collision with root package name */
    Object f37500b;

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

    @Override // java.util.function.Consumer
    /* renamed from: accept, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void p(Object obj) {
        if (this.f37499a) {
            return;
        }
        this.f37499a = true;
        this.f37500b = obj;
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final boolean n() {
        return this.f37499a;
    }
}
