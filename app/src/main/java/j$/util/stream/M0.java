package j$.util.stream;

/* loaded from: classes3.dex */
abstract class M0 implements K0 {

    /* renamed from: a, reason: collision with root package name */
    protected final K0 f37510a;

    /* renamed from: b, reason: collision with root package name */
    protected final K0 f37511b;

    /* renamed from: c, reason: collision with root package name */
    private final long f37512c;

    @Override // j$.util.stream.K0
    public final int q() {
        return 2;
    }

    M0(K0 k02, K0 k03) {
        this.f37510a = k02;
        this.f37511b = k03;
        this.f37512c = k02.count() + k03.count();
    }

    @Override // j$.util.stream.K0
    public final K0 b(int i8) {
        if (i8 == 0) {
            return this.f37510a;
        }
        if (i8 == 1) {
            return this.f37511b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.K0
    public final long count() {
        return this.f37512c;
    }

    @Override // j$.util.stream.K0
    public /* bridge */ /* synthetic */ J0 b(int i8) {
        return (J0) b(i8);
    }
}
