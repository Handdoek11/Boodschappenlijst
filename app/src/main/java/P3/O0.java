package p3;

/* loaded from: classes.dex */
public final class O0 implements S0 {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f40199c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile S0 f40200a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f40201b = f40199c;

    private O0(S0 s02) {
        this.f40200a = s02;
    }

    public static S0 a(S0 s02) {
        return s02 instanceof O0 ? s02 : new O0(s02);
    }

    private final synchronized Object b() {
        try {
            Object obj = this.f40201b;
            Object obj2 = f40199c;
            if (obj != obj2) {
                return obj;
            }
            Object zza = this.f40200a.zza();
            Object obj3 = this.f40201b;
            if (obj3 != obj2 && obj3 != zza) {
                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + zza + ". This is likely due to a circular dependency.");
            }
            this.f40201b = zza;
            this.f40200a = null;
            return zza;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p3.T0
    public final Object zza() {
        Object obj = this.f40201b;
        return obj == f40199c ? b() : obj;
    }
}
