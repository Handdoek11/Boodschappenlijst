package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
final class I extends L implements InterfaceC5975m2 {

    /* renamed from: c, reason: collision with root package name */
    static final G f37478c;

    /* renamed from: d, reason: collision with root package name */
    static final G f37479d;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // j$.util.stream.L, j$.util.stream.InterfaceC5985o2
    public final void accept(int i8) {
        p(Integer.valueOf(i8));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f37499a) {
            return j$.util.C.d(((Integer) this.f37500b).intValue());
        }
        return null;
    }

    static {
        EnumC5936e3 enumC5936e3 = EnumC5936e3.INT_VALUE;
        f37478c = new G(true, enumC5936e3, j$.util.C.a(), new r(5), new C5962k(7));
        f37479d = new G(false, enumC5936e3, j$.util.C.a(), new r(5), new C5962k(7));
    }
}
