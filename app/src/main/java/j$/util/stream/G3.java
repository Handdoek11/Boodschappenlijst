package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class G3 implements InterfaceC5985o2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37470a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f37471b;

    public /* synthetic */ G3(Consumer consumer, int i8) {
        this.f37470a = i8;
        this.f37471b = consumer;
    }

    private final /* synthetic */ void b(long j8) {
    }

    private final /* synthetic */ void c(long j8) {
    }

    private final /* synthetic */ void d() {
    }

    private final /* synthetic */ void e() {
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final /* synthetic */ void accept(double d8) {
        switch (this.f37470a) {
            case 0:
                AbstractC6032y0.a();
                throw null;
            default:
                AbstractC6032y0.a();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final /* synthetic */ void accept(int i8) {
        switch (this.f37470a) {
            case 0:
                AbstractC6032y0.k();
                throw null;
            default:
                AbstractC6032y0.k();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC5985o2, j$.util.stream.InterfaceC5980n2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j8) {
        switch (this.f37470a) {
            case 0:
                AbstractC6032y0.l();
                throw null;
            default:
                AbstractC6032y0.l();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void p(Object obj) {
        switch (this.f37470a) {
            case 0:
                ((Y2) this.f37471b).p(obj);
                break;
            default:
                this.f37471b.p(obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f37470a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final /* synthetic */ void k() {
        int i8 = this.f37470a;
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final /* synthetic */ void l(long j8) {
        int i8 = this.f37470a;
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final /* synthetic */ boolean n() {
        switch (this.f37470a) {
        }
        return false;
    }
}
