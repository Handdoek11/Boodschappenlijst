package B1;

import androidx.work.impl.WorkDatabase;
import s1.s;
import t1.C6783d;
import t1.C6789j;

/* loaded from: classes.dex */
public class m implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    private static final String f349u = s1.j.f("StopWorkRunnable");

    /* renamed from: o, reason: collision with root package name */
    private final C6789j f350o;

    /* renamed from: s, reason: collision with root package name */
    private final String f351s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f352t;

    public m(C6789j c6789j, String str, boolean z7) {
        this.f350o = c6789j;
        this.f351s = str;
        this.f352t = z7;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean o8;
        WorkDatabase o9 = this.f350o.o();
        C6783d m8 = this.f350o.m();
        A1.q B7 = o9.B();
        o9.c();
        try {
            boolean h8 = m8.h(this.f351s);
            if (this.f352t) {
                o8 = this.f350o.m().n(this.f351s);
            } else {
                if (!h8 && B7.l(this.f351s) == s.RUNNING) {
                    B7.u(s.ENQUEUED, this.f351s);
                }
                o8 = this.f350o.m().o(this.f351s);
            }
            s1.j.c().a(f349u, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f351s, Boolean.valueOf(o8)), new Throwable[0]);
            o9.r();
            o9.g();
        } catch (Throwable th) {
            o9.g();
            throw th;
        }
    }
}
