package androidx.compose.runtime.snapshots;

import I6.l;
import J6.AbstractC0650j;
import u.C6806a;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: e, reason: collision with root package name */
    public static final a f8092e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f8093f = 8;

    /* renamed from: a, reason: collision with root package name */
    private d f8094a;

    /* renamed from: b, reason: collision with root package name */
    private int f8095b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8096c;

    /* renamed from: d, reason: collision with root package name */
    private int f8097d;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final c a() {
            return e.k((c) e.f8111b.a(), null, false, 6, null);
        }

        public final c b() {
            return e.m();
        }

        public final void c() {
            boolean z7;
            synchronized (e.n()) {
                C6806a n8 = ((androidx.compose.runtime.snapshots.a) e.f8119j.get()).n();
                z7 = false;
                if (n8 != null) {
                    if (n8.n()) {
                        z7 = true;
                    }
                }
            }
            if (z7) {
                e.h();
            }
        }

        private a() {
        }
    }

    public /* synthetic */ c(int i8, d dVar, AbstractC0650j abstractC0650j) {
        this(i8, dVar);
    }

    public abstract void a();

    public int b() {
        return this.f8095b;
    }

    public d c() {
        return this.f8094a;
    }

    public abstract l d();

    public abstract boolean e();

    public int f() {
        return 0;
    }

    public abstract l g();

    public c h() {
        c cVar = (c) e.f8111b.a();
        e.f8111b.b(this);
        return cVar;
    }

    public abstract void i(z.g gVar);

    public final void j() {
        int i8 = this.f8097d;
        if (i8 >= 0) {
            e.z(i8);
            this.f8097d = -1;
        }
    }

    public void k(c cVar) {
        e.f8111b.b(cVar);
    }

    public final void l(boolean z7) {
        this.f8096c = z7;
    }

    public void m(int i8) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    private c(int i8, d dVar) {
        this.f8094a = dVar;
        this.f8095b = i8;
        this.f8097d = i8 != 0 ? e.B(i8, c()) : -1;
    }
}
