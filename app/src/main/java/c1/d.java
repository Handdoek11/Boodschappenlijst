package c1;

import androidx.room.h;
import g1.f;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f12106a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private final h f12107b;

    /* renamed from: c, reason: collision with root package name */
    private volatile f f12108c;

    public d(h hVar) {
        this.f12107b = hVar;
    }

    private f c() {
        return this.f12107b.d(d());
    }

    private f e(boolean z7) {
        if (!z7) {
            return c();
        }
        if (this.f12108c == null) {
            this.f12108c = c();
        }
        return this.f12108c;
    }

    public f a() {
        b();
        return e(this.f12106a.compareAndSet(false, true));
    }

    protected void b() {
        this.f12107b.a();
    }

    protected abstract String d();

    public void f(f fVar) {
        if (fVar == this.f12108c) {
            this.f12106a.set(false);
        }
    }
}
