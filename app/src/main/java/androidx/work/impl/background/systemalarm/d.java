package androidx.work.impl.background.systemalarm;

import A1.p;
import B1.n;
import B1.r;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.e;
import java.util.Collections;
import java.util.List;
import s1.j;
import t1.InterfaceC6781b;
import w1.C6868d;
import w1.InterfaceC6867c;

/* loaded from: classes.dex */
public class d implements InterfaceC6867c, InterfaceC6781b, r.b {

    /* renamed from: A, reason: collision with root package name */
    private static final String f11862A = j.f("DelayMetCommandHandler");

    /* renamed from: o, reason: collision with root package name */
    private final Context f11863o;

    /* renamed from: s, reason: collision with root package name */
    private final int f11864s;

    /* renamed from: t, reason: collision with root package name */
    private final String f11865t;

    /* renamed from: u, reason: collision with root package name */
    private final e f11866u;

    /* renamed from: v, reason: collision with root package name */
    private final C6868d f11867v;

    /* renamed from: y, reason: collision with root package name */
    private PowerManager.WakeLock f11870y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f11871z = false;

    /* renamed from: x, reason: collision with root package name */
    private int f11869x = 0;

    /* renamed from: w, reason: collision with root package name */
    private final Object f11868w = new Object();

    d(Context context, int i8, String str, e eVar) {
        this.f11863o = context;
        this.f11864s = i8;
        this.f11866u = eVar;
        this.f11865t = str;
        this.f11867v = new C6868d(context, eVar.f(), this);
    }

    private void d() {
        synchronized (this.f11868w) {
            try {
                this.f11867v.e();
                this.f11866u.h().c(this.f11865t);
                PowerManager.WakeLock wakeLock = this.f11870y;
                if (wakeLock != null && wakeLock.isHeld()) {
                    j.c().a(f11862A, String.format("Releasing wakelock %s for WorkSpec %s", this.f11870y, this.f11865t), new Throwable[0]);
                    this.f11870y.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void g() {
        synchronized (this.f11868w) {
            try {
                if (this.f11869x < 2) {
                    this.f11869x = 2;
                    j c8 = j.c();
                    String str = f11862A;
                    c8.a(str, String.format("Stopping work for WorkSpec %s", this.f11865t), new Throwable[0]);
                    Intent f8 = b.f(this.f11863o, this.f11865t);
                    e eVar = this.f11866u;
                    eVar.k(new e.b(eVar, f8, this.f11864s));
                    if (this.f11866u.e().g(this.f11865t)) {
                        j.c().a(str, String.format("WorkSpec %s needs to be rescheduled", this.f11865t), new Throwable[0]);
                        Intent e8 = b.e(this.f11863o, this.f11865t);
                        e eVar2 = this.f11866u;
                        eVar2.k(new e.b(eVar2, e8, this.f11864s));
                    } else {
                        j.c().a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f11865t), new Throwable[0]);
                    }
                } else {
                    j.c().a(f11862A, String.format("Already stopped work for %s", this.f11865t), new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // B1.r.b
    public void a(String str) {
        j.c().a(f11862A, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        g();
    }

    @Override // w1.InterfaceC6867c
    public void b(List list) {
        g();
    }

    @Override // t1.InterfaceC6781b
    public void c(String str, boolean z7) {
        j.c().a(f11862A, String.format("onExecuted %s, %s", str, Boolean.valueOf(z7)), new Throwable[0]);
        d();
        if (z7) {
            Intent e8 = b.e(this.f11863o, this.f11865t);
            e eVar = this.f11866u;
            eVar.k(new e.b(eVar, e8, this.f11864s));
        }
        if (this.f11871z) {
            Intent a8 = b.a(this.f11863o);
            e eVar2 = this.f11866u;
            eVar2.k(new e.b(eVar2, a8, this.f11864s));
        }
    }

    void e() {
        this.f11870y = n.b(this.f11863o, String.format("%s (%s)", this.f11865t, Integer.valueOf(this.f11864s)));
        j c8 = j.c();
        String str = f11862A;
        c8.a(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.f11870y, this.f11865t), new Throwable[0]);
        this.f11870y.acquire();
        p m8 = this.f11866u.g().o().B().m(this.f11865t);
        if (m8 == null) {
            g();
            return;
        }
        boolean b8 = m8.b();
        this.f11871z = b8;
        if (b8) {
            this.f11867v.d(Collections.singletonList(m8));
        } else {
            j.c().a(str, String.format("No constraints for %s", this.f11865t), new Throwable[0]);
            f(Collections.singletonList(this.f11865t));
        }
    }

    @Override // w1.InterfaceC6867c
    public void f(List list) {
        if (list.contains(this.f11865t)) {
            synchronized (this.f11868w) {
                try {
                    if (this.f11869x == 0) {
                        this.f11869x = 1;
                        j.c().a(f11862A, String.format("onAllConstraintsMet for %s", this.f11865t), new Throwable[0]);
                        if (this.f11866u.e().j(this.f11865t)) {
                            this.f11866u.h().b(this.f11865t, 600000L, this);
                        } else {
                            d();
                        }
                    } else {
                        j.c().a(f11862A, String.format("Already started work for %s", this.f11865t), new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
