package j$.util.stream;

import j$.util.Optional;

/* loaded from: classes3.dex */
final class K extends L {

    /* renamed from: c, reason: collision with root package name */
    static final G f37493c;

    /* renamed from: d, reason: collision with root package name */
    static final G f37494d;

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f37499a) {
            return Optional.of(this.f37500b);
        }
        return null;
    }

    static {
        EnumC5936e3 enumC5936e3 = EnumC5936e3.REFERENCE;
        f37493c = new G(true, enumC5936e3, Optional.empty(), new r(7), new C5962k(9));
        f37494d = new G(false, enumC5936e3, Optional.empty(), new r(7), new C5962k(9));
    }
}
