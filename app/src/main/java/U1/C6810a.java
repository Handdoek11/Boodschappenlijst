package u1;

import A1.p;
import java.util.HashMap;
import java.util.Map;
import s1.j;
import s1.q;

/* renamed from: u1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6810a {

    /* renamed from: d, reason: collision with root package name */
    static final String f43949d = j.f("DelayedWorkTracker");

    /* renamed from: a, reason: collision with root package name */
    final C6811b f43950a;

    /* renamed from: b, reason: collision with root package name */
    private final q f43951b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f43952c = new HashMap();

    /* renamed from: u1.a$a, reason: collision with other inner class name */
    class RunnableC0334a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ p f43953o;

        RunnableC0334a(p pVar) {
            this.f43953o = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.c().a(C6810a.f43949d, String.format("Scheduling work %s", this.f43953o.f95a), new Throwable[0]);
            C6810a.this.f43950a.e(this.f43953o);
        }
    }

    public C6810a(C6811b c6811b, q qVar) {
        this.f43950a = c6811b;
        this.f43951b = qVar;
    }

    public void a(p pVar) {
        Runnable runnable = (Runnable) this.f43952c.remove(pVar.f95a);
        if (runnable != null) {
            this.f43951b.b(runnable);
        }
        RunnableC0334a runnableC0334a = new RunnableC0334a(pVar);
        this.f43952c.put(pVar.f95a, runnableC0334a);
        this.f43951b.a(pVar.a() - System.currentTimeMillis(), runnableC0334a);
    }

    public void b(String str) {
        Runnable runnable = (Runnable) this.f43952c.remove(str);
        if (runnable != null) {
            this.f43951b.b(runnable);
        }
    }
}
