package d2;

/* renamed from: d2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5704f {

    /* renamed from: d2.f$a */
    class a implements b {

        /* renamed from: a, reason: collision with root package name */
        private volatile Object f35217a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f35218b;

        a(b bVar) {
            this.f35218b = bVar;
        }

        @Override // d2.AbstractC5704f.b
        public Object get() {
            if (this.f35217a == null) {
                synchronized (this) {
                    try {
                        if (this.f35217a == null) {
                            this.f35217a = AbstractC5709k.d(this.f35218b.get());
                        }
                    } finally {
                    }
                }
            }
            return this.f35217a;
        }
    }

    /* renamed from: d2.f$b */
    public interface b {
        Object get();
    }

    public static b a(b bVar) {
        return new a(bVar);
    }
}
