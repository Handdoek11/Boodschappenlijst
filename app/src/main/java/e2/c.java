package e2;

/* loaded from: classes.dex */
public abstract class c {

    private static class b extends c {

        /* renamed from: a, reason: collision with root package name */
        private volatile boolean f35322a;

        b() {
            super();
        }

        @Override // e2.c
        public void b(boolean z7) {
            this.f35322a = z7;
        }

        @Override // e2.c
        public void c() {
            if (this.f35322a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    public static c a() {
        return new b();
    }

    abstract void b(boolean z7);

    public abstract void c();

    private c() {
    }
}
