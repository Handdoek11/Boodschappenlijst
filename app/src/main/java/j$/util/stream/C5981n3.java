package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.n3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5981n3 implements InterfaceC5970l2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37753a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DoubleConsumer f37754b;

    public /* synthetic */ C5981n3(DoubleConsumer doubleConsumer, int i8) {
        this.f37753a = i8;
        this.f37754b = doubleConsumer;
    }

    private final /* synthetic */ void b(long j8) {
    }

    private final /* synthetic */ void c(long j8) {
    }

    private final /* synthetic */ void d() {
    }

    private final /* synthetic */ void e() {
    }

    @Override // j$.util.stream.InterfaceC5970l2, j$.util.stream.InterfaceC5985o2
    public final void accept(double d8) {
        switch (this.f37753a) {
            case 0:
                ((R2) this.f37754b).accept(d8);
                break;
            default:
                this.f37754b.accept(d8);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final /* synthetic */ void accept(int i8) {
        switch (this.f37753a) {
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
        switch (this.f37753a) {
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
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        switch (this.f37753a) {
            case 0:
                p((Double) obj);
                break;
            default:
                p((Double) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f37753a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.f37753a) {
        }
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final /* synthetic */ void k() {
        int i8 = this.f37753a;
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final /* synthetic */ void l(long j8) {
        int i8 = this.f37753a;
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final /* synthetic */ boolean n() {
        switch (this.f37753a) {
        }
        return false;
    }

    @Override // j$.util.stream.InterfaceC5970l2
    public final /* synthetic */ void p(Double d8) {
        switch (this.f37753a) {
            case 0:
                AbstractC6032y0.e(this, d8);
                break;
            default:
                AbstractC6032y0.e(this, d8);
                break;
        }
    }
}
