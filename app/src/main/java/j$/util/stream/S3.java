package j$.util.stream;

import java.util.function.IntPredicate;

/* loaded from: classes3.dex */
final class S3 extends AbstractC5955i2 implements d4 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ T3 f37569b;

    @Override // j$.util.stream.d4
    public final long f() {
        return 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    S3(T3 t32, InterfaceC5985o2 interfaceC5985o2, boolean z7) {
        super(interfaceC5985o2);
        this.f37569b = t32;
    }

    @Override // j$.util.stream.InterfaceC5975m2, j$.util.stream.InterfaceC5985o2
    public final void accept(int i8) {
        this.f37569b.getClass();
        IntPredicate intPredicate = null;
        intPredicate.test(i8);
        throw null;
    }
}
