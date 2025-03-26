package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class v implements o {
    public static final v BCE;
    public static final v CE;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ v[] f37069a;

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

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f37069a.clone();
    }

    static {
        v vVar = new v("BCE", 0);
        BCE = vVar;
        v vVar2 = new v("CE", 1);
        CE = vVar2;
        f37069a = new v[]{vVar, vVar2};
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
