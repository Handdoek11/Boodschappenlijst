package p3;

/* loaded from: classes.dex */
public final class N0 implements P0 {

    /* renamed from: a, reason: collision with root package name */
    private S0 f40196a;

    public static void a(S0 s02, S0 s03) {
        N0 n02 = (N0) s02;
        if (n02.f40196a != null) {
            throw new IllegalStateException();
        }
        n02.f40196a = s03;
    }

    @Override // p3.T0
    public final Object zza() {
        S0 s02 = this.f40196a;
        if (s02 != null) {
            return s02.zza();
        }
        throw new IllegalStateException();
    }
}
