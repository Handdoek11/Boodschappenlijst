package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.p3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5991p3 implements InterfaceC5975m2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37769a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IntConsumer f37770b;

    public /* synthetic */ C5991p3(IntConsumer intConsumer, int i8) {
        this.f37769a = i8;
        this.f37770b = intConsumer;
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
        switch (this.f37769a) {
            case 0:
                AbstractC6032y0.a();
                throw null;
            default:
                AbstractC6032y0.a();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC5975m2, j$.util.stream.InterfaceC5985o2
    public final void accept(int i8) {
        switch (this.f37769a) {
            case 0:
                ((T2) this.f37770b).accept(i8);
                break;
            default:
                this.f37770b.accept(i8);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC5985o2, j$.util.stream.InterfaceC5980n2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j8) {
        switch (this.f37769a) {
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
        switch (this.f37769a) {
            case 0:
                m((Integer) obj);
                break;
            default:
                m((Integer) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f37769a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.f37769a) {
        }
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final /* synthetic */ void k() {
        int i8 = this.f37769a;
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final /* synthetic */ void l(long j8) {
        int i8 = this.f37769a;
    }

    @Override // j$.util.stream.InterfaceC5975m2
    public final /* synthetic */ void m(Integer num) {
        switch (this.f37769a) {
            case 0:
                AbstractC6032y0.g(this, num);
                break;
            default:
                AbstractC6032y0.g(this, num);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final /* synthetic */ boolean n() {
        switch (this.f37769a) {
        }
        return false;
    }
}
