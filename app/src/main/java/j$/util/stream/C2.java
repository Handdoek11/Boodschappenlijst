package j$.util.stream;

import java.util.Comparator;

/* loaded from: classes3.dex */
abstract class C2 extends AbstractC5965k2 {

    /* renamed from: b, reason: collision with root package name */
    protected final Comparator f37436b;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f37437c;

    C2(InterfaceC5985o2 interfaceC5985o2, Comparator comparator) {
        super(interfaceC5985o2);
        this.f37436b = comparator;
    }

    @Override // j$.util.stream.AbstractC5965k2, j$.util.stream.InterfaceC5985o2
    public final boolean n() {
        this.f37437c = true;
        return false;
    }
}
