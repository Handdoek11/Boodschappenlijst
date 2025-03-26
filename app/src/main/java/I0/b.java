package I0;

/* loaded from: classes.dex */
final class b extends m {

    /* renamed from: a, reason: collision with root package name */
    private final Object f2964a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2965b;

    public b(Object obj, int i8) {
        super(null);
        this.f2964a = obj;
        this.f2965b = i8;
    }

    public final void a() {
        Object obj = this.f2964a;
        if (!((obj != null ? obj.hashCode() : 0) == this.f2965b)) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }

    public final Object b() {
        return this.f2964a;
    }
}
