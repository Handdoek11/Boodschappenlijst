package j$.util.stream;

/* loaded from: classes3.dex */
final class Z1 extends AbstractC5915a2 {
    @Override // j$.util.stream.V1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f37616b);
    }

    @Override // j$.util.stream.U1
    public final void g(U1 u12) {
        this.f37616b += ((AbstractC5915a2) u12).f37616b;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f37616b++;
    }
}
