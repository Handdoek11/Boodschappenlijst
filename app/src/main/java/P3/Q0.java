package p3;

/* loaded from: classes.dex */
public final class Q0 implements P0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f40205a;

    private Q0(Object obj) {
        this.f40205a = obj;
    }

    public static P0 a(Object obj) {
        if (obj != null) {
            return new Q0(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // p3.T0
    public final Object zza() {
        return this.f40205a;
    }
}
