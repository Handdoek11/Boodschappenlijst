package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class F implements o {
    public static final F BEFORE_ROC;
    public static final F ROC;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ F[] f37024a;

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

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }

    public static F[] values() {
        return (F[]) f37024a.clone();
    }

    static {
        F f8 = new F("BEFORE_ROC", 0);
        BEFORE_ROC = f8;
        F f9 = new F("ROC", 1);
        ROC = f9;
        f37024a = new F[]{f8, f9};
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
