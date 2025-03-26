package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.w0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6022w0 implements J3 {

    /* renamed from: a, reason: collision with root package name */
    final EnumC6017v0 f37809a;

    /* renamed from: b, reason: collision with root package name */
    final Supplier f37810b;

    C6022w0(EnumC5936e3 enumC5936e3, EnumC6017v0 enumC6017v0, Supplier supplier) {
        this.f37809a = enumC6017v0;
        this.f37810b = supplier;
    }

    @Override // j$.util.stream.J3
    public final int d() {
        return EnumC5931d3.f37659u | EnumC5931d3.f37656r;
    }

    @Override // j$.util.stream.J3
    public final Object b(AbstractC5917b abstractC5917b, Spliterator spliterator) {
        AbstractC6012u0 abstractC6012u0 = (AbstractC6012u0) this.f37810b.get();
        abstractC5917b.U(spliterator, abstractC6012u0);
        return Boolean.valueOf(abstractC6012u0.f37796b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.J3
    public final Object c(AbstractC5917b abstractC5917b, Spliterator spliterator) {
        return (Boolean) new C6027x0(this, abstractC5917b, spliterator).invoke();
    }
}
