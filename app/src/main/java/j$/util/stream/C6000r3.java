package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.r3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6000r3 implements InterfaceC5980n2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37780a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LongConsumer f37781b;

    public /* synthetic */ C6000r3(LongConsumer longConsumer, int i8) {
        this.f37780a = i8;
        this.f37781b = longConsumer;
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
        switch (this.f37780a) {
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
        switch (this.f37780a) {
            case 0:
                AbstractC6032y0.k();
                throw null;
            default:
                AbstractC6032y0.k();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC5980n2, java.util.function.LongConsumer
    public final void accept(long j8) {
        switch (this.f37780a) {
            case 0:
                ((V2) this.f37781b).accept(j8);
                break;
            default:
                this.f37781b.accept(j8);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        switch (this.f37780a) {
            case 0:
                j((Long) obj);
                break;
            default:
                j((Long) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f37780a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.f37780a) {
        }
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC5980n2
    public final /* synthetic */ void j(Long l8) {
        switch (this.f37780a) {
            case 0:
                AbstractC6032y0.i(this, l8);
                break;
            default:
                AbstractC6032y0.i(this, l8);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final /* synthetic */ void k() {
        int i8 = this.f37780a;
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final /* synthetic */ void l(long j8) {
        int i8 = this.f37780a;
    }

    @Override // j$.util.stream.InterfaceC5985o2
    public final /* synthetic */ boolean n() {
        switch (this.f37780a) {
        }
        return false;
    }
}
