package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes3.dex */
final class H extends L implements InterfaceC5970l2 {

    /* renamed from: c, reason: collision with root package name */
    static final G f37472c;

    /* renamed from: d, reason: collision with root package name */
    static final G f37473d;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // j$.util.stream.L, j$.util.stream.InterfaceC5985o2
    public final void accept(double d8) {
        p(Double.valueOf(d8));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f37499a) {
            return j$.util.B.d(((Double) this.f37500b).doubleValue());
        }
        return null;
    }

    static {
        EnumC5936e3 enumC5936e3 = EnumC5936e3.DOUBLE_VALUE;
        f37472c = new G(true, enumC5936e3, j$.util.B.a(), new r(4), new C5962k(6));
        f37473d = new G(false, enumC5936e3, j$.util.B.a(), new r(4), new C5962k(6));
    }
}
