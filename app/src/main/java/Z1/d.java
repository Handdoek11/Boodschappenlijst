package Z1;

/* loaded from: classes.dex */
public interface d {

    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);


        /* renamed from: o, reason: collision with root package name */
        private final boolean f6198o;

        a(boolean z7) {
            this.f6198o = z7;
        }

        boolean c() {
            return this.f6198o;
        }
    }

    boolean a(c cVar);

    boolean b();

    boolean c(c cVar);

    d d();

    void f(c cVar);

    boolean g(c cVar);

    void h(c cVar);
}
