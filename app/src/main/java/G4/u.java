package g4;

/* loaded from: classes2.dex */
public class u implements H4.b {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f36077c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile Object f36078a = f36077c;

    /* renamed from: b, reason: collision with root package name */
    private volatile H4.b f36079b;

    public u(H4.b bVar) {
        this.f36079b = bVar;
    }

    @Override // H4.b
    public Object get() {
        Object obj = this.f36078a;
        Object obj2 = f36077c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f36078a;
                    if (obj == obj2) {
                        obj = this.f36079b.get();
                        this.f36078a = obj;
                        this.f36079b = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
