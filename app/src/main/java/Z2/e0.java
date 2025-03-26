package Z2;

import android.util.Log;

/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    private Object f6327a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f6328b = false;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC0765d f6329c;

    public e0(AbstractC0765d abstractC0765d, Object obj) {
        this.f6329c = abstractC0765d;
        this.f6327a = obj;
    }

    protected abstract void a(Object obj);

    protected abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.f6327a;
                if (this.f6328b) {
                    Log.w("GmsClient", "Callback proxy " + toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.f6328b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.f6327a = null;
        }
    }

    public final void e() {
        d();
        synchronized (this.f6329c.f6301r) {
            this.f6329c.f6301r.remove(this);
        }
    }
}
