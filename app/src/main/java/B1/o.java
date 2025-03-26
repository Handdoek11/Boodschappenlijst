package B1;

import android.content.Context;
import androidx.work.ListenableWorker;
import v0.C6822a;

/* loaded from: classes.dex */
public class o implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    static final String f355x = s1.j.f("WorkForegroundRunnable");

    /* renamed from: o, reason: collision with root package name */
    final androidx.work.impl.utils.futures.c f356o = androidx.work.impl.utils.futures.c.u();

    /* renamed from: s, reason: collision with root package name */
    final Context f357s;

    /* renamed from: t, reason: collision with root package name */
    final A1.p f358t;

    /* renamed from: u, reason: collision with root package name */
    final ListenableWorker f359u;

    /* renamed from: v, reason: collision with root package name */
    final s1.f f360v;

    /* renamed from: w, reason: collision with root package name */
    final C1.a f361w;

    class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f362o;

        a(androidx.work.impl.utils.futures.c cVar) {
            this.f362o = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f362o.s(o.this.f359u.getForegroundInfoAsync());
        }
    }

    class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f364o;

        b(androidx.work.impl.utils.futures.c cVar) {
            this.f364o = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                s1.e eVar = (s1.e) this.f364o.get();
                if (eVar == null) {
                    throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", o.this.f358t.f97c));
                }
                s1.j.c().a(o.f355x, String.format("Updating notification for %s", o.this.f358t.f97c), new Throwable[0]);
                o.this.f359u.setRunInForeground(true);
                o oVar = o.this;
                oVar.f356o.s(oVar.f360v.a(oVar.f357s, oVar.f359u.getId(), eVar));
            } catch (Throwable th) {
                o.this.f356o.r(th);
            }
        }
    }

    public o(Context context, A1.p pVar, ListenableWorker listenableWorker, s1.f fVar, C1.a aVar) {
        this.f357s = context;
        this.f358t = pVar;
        this.f359u = listenableWorker;
        this.f360v = fVar;
        this.f361w = aVar;
    }

    public com.google.common.util.concurrent.d a() {
        return this.f356o;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.f358t.f111q || C6822a.b()) {
            this.f356o.q(null);
            return;
        }
        androidx.work.impl.utils.futures.c u7 = androidx.work.impl.utils.futures.c.u();
        this.f361w.a().execute(new a(u7));
        u7.f(new b(u7), this.f361w.a());
    }
}
