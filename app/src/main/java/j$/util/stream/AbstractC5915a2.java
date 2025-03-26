package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.a2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC5915a2 extends V1 implements U1 {

    /* renamed from: b, reason: collision with root package name */
    long f37616b;

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
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final void l(long j8) {
        this.f37616b = 0L;
    }
}
