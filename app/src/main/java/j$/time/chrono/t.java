package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class t implements o {
    public static final t AH;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ t[] f37067a;

    @Override // j$.time.temporal.o
    public final /* synthetic */ boolean f(j$.time.temporal.r rVar) {
        return AbstractC5889i.i(this, rVar);
    }

    @Override // j$.time.chrono.o
    public final int getValue() {
        return 1;
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

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f37067a.clone();
    }

    static {
        t tVar = new t("AH", 0);
        AH = tVar;
        f37067a = new t[]{tVar};
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w n(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.ERA) {
            return j$.time.temporal.w.j(1L, 1L);
        }
        return j$.time.temporal.n.d(this, rVar);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        return mVar.d(1, j$.time.temporal.a.ERA);
    }
}
