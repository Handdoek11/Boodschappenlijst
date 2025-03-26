package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class L implements o {
    public static final L BE;
    public static final L BEFORE_BE;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ L[] f37031a;

    @Override // j$.time.temporal.o
    public final /* synthetic */ boolean f(j$.time.temporal.r rVar) {
        return AbstractC5889i.i(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ int k(j$.time.temporal.r rVar) {
        return AbstractC5889i.f(this, (j$.time.temporal.a) rVar);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ long s(j$.time.temporal.r rVar) {
        return AbstractC5889i.g(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ Object v(j$.time.temporal.t tVar) {
        return AbstractC5889i.m(this, tVar);
    }

    public static L valueOf(String str) {
        return (L) Enum.valueOf(L.class, str);
    }

    public static L[] values() {
        return (L[]) f37031a.clone();
    }

    static {
        L l8 = new L("BEFORE_BE", 0);
        BEFORE_BE = l8;
        L l9 = new L("BE", 1);
        BE = l9;
        f37031a = new L[]{l8, l9};
    }

    @Override // j$.time.chrono.o
    public final int getValue() {
        return ordinal();
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w n(j$.time.temporal.r rVar) {
        return j$.time.temporal.n.d(this, rVar);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        return mVar.d(getValue(), j$.time.temporal.a.ERA);
    }
}
