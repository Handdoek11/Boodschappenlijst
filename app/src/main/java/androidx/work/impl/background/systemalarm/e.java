package androidx.work.impl.background.systemalarm;

import B1.k;
import B1.n;
import B1.r;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import s1.j;
import t1.C6783d;
import t1.C6789j;
import t1.InterfaceC6781b;

/* loaded from: classes.dex */
public class e implements InterfaceC6781b {

    /* renamed from: B, reason: collision with root package name */
    static final String f11872B = j.f("SystemAlarmDispatcher");

    /* renamed from: A, reason: collision with root package name */
    private c f11873A;

    /* renamed from: o, reason: collision with root package name */
    final Context f11874o;

    /* renamed from: s, reason: collision with root package name */
    private final C1.a f11875s;

    /* renamed from: t, reason: collision with root package name */
    private final r f11876t;

    /* renamed from: u, reason: collision with root package name */
    private final C6783d f11877u;

    /* renamed from: v, reason: collision with root package name */
    private final C6789j f11878v;

    /* renamed from: w, reason: collision with root package name */
    final androidx.work.impl.background.systemalarm.b f11879w;

    /* renamed from: x, reason: collision with root package name */
    private final Handler f11880x;

    /* renamed from: y, reason: collision with root package name */
    final List f11881y;

    /* renamed from: z, reason: collision with root package name */
    Intent f11882z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar;
            d dVar;
            synchronized (e.this.f11881y) {
                e eVar2 = e.this;
                eVar2.f11882z = (Intent) eVar2.f11881y.get(0);
            }
            Intent intent = e.this.f11882z;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = e.this.f11882z.getIntExtra("KEY_START_ID", 0);
                j c8 = j.c();
                String str = e.f11872B;
                c8.a(str, String.format("Processing command %s, %s", e.this.f11882z, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock b8 = n.b(e.this.f11874o, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    j.c().a(str, String.format("Acquiring operation wake lock (%s) %s", action, b8), new Throwable[0]);
                    b8.acquire();
                    e eVar3 = e.this;
                    eVar3.f11879w.o(eVar3.f11882z, intExtra, eVar3);
                    j.c().a(str, String.format("Releasing operation wake lock (%s) %s", action, b8), new Throwable[0]);
                    b8.release();
                    eVar = e.this;
                    dVar = new d(eVar);
                } catch (Throwable th) {
                    try {
                        j c9 = j.c();
                        String str2 = e.f11872B;
                        c9.b(str2, "Unexpected error in onHandleIntent", th);
                        j.c().a(str2, String.format("Releasing operation wake lock (%s) %s", action, b8), new Throwable[0]);
                        b8.release();
                        eVar = e.this;
                        dVar = new d(eVar);
                    } catch (Throwable th2) {
                        j.c().a(e.f11872B, String.format("Releasing operation wake lock (%s) %s", action, b8), new Throwable[0]);
                        b8.release();
                        e eVar4 = e.this;
                        eVar4.k(new d(eVar4));
                        throw th2;
                    }
                }
                eVar.k(dVar);
            }
        }
    }

    static class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private final e f11884o;

        /* renamed from: s, reason: collision with root package name */
        private final Intent f11885s;

        /* renamed from: t, reason: collision with root package name */
        private final int f11886t;

        b(e eVar, Intent intent, int i8) {
            this.f11884o = eVar;
            this.f11885s = intent;
            this.f11886t = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11884o.a(this.f11885s, this.f11886t);
        }
    }

    interface c {
        void a();
    }

    static class d implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private final e f11887o;

        d(e eVar) {
            this.f11887o = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11887o.d();
        }
    }

    e(Context context) {
        this(context, null, null);
    }

    private void b() {
        if (this.f11880x.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    private boolean i(String str) {
        b();
        synchronized (this.f11881y) {
            try {
                Iterator it = this.f11881y.iterator();
                while (it.hasNext()) {
                    if (str.equals(((Intent) it.next()).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void l() {
        b();
        PowerManager.WakeLock b8 = n.b(this.f11874o, "ProcessCommand");
        try {
            b8.acquire();
            this.f11878v.p().b(new a());
        } finally {
            b8.release();
        }
    }

    public boolean a(Intent intent, int i8) {
        j c8 = j.c();
        String str = f11872B;
        c8.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i8)), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            j.c().h(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i8);
        synchronized (this.f11881y) {
            try {
                boolean isEmpty = this.f11881y.isEmpty();
                this.f11881y.add(intent);
                if (isEmpty) {
                    l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    @Override // t1.InterfaceC6781b
    public void c(String str, boolean z7) {
        k(new b(this, androidx.work.impl.background.systemalarm.b.d(this.f11874o, str, z7), 0));
    }

    void d() {
        j c8 = j.c();
        String str = f11872B;
        c8.a(str, "Checking if commands are complete.", new Throwable[0]);
        b();
        synchronized (this.f11881y) {
            try {
                if (this.f11882z != null) {
                    j.c().a(str, String.format("Removing command %s", this.f11882z), new Throwable[0]);
                    if (!((Intent) this.f11881y.remove(0)).equals(this.f11882z)) {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                    this.f11882z = null;
                }
                k c9 = this.f11875s.c();
                if (!this.f11879w.n() && this.f11881y.isEmpty() && !c9.a()) {
                    j.c().a(str, "No more commands & intents.", new Throwable[0]);
                    c cVar = this.f11873A;
                    if (cVar != null) {
                        cVar.a();
                    }
                } else if (!this.f11881y.isEmpty()) {
                    l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    C6783d e() {
        return this.f11877u;
    }

    C1.a f() {
        return this.f11875s;
    }

    C6789j g() {
        return this.f11878v;
    }

    r h() {
        return this.f11876t;
    }

    void j() {
        j.c().a(f11872B, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f11877u.i(this);
        this.f11876t.a();
        this.f11873A = null;
    }

    void k(Runnable runnable) {
        this.f11880x.post(runnable);
    }

    void m(c cVar) {
        if (this.f11873A != null) {
            j.c().b(f11872B, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.f11873A = cVar;
        }
    }

    e(Context context, C6783d c6783d, C6789j c6789j) {
        Context applicationContext = context.getApplicationContext();
        this.f11874o = applicationContext;
        this.f11879w = new androidx.work.impl.background.systemalarm.b(applicationContext);
        this.f11876t = new r();
        c6789j = c6789j == null ? C6789j.k(context) : c6789j;
        this.f11878v = c6789j;
        c6783d = c6783d == null ? c6789j.m() : c6783d;
        this.f11877u = c6783d;
        this.f11875s = c6789j.p();
        c6783d.d(this);
        this.f11881y = new ArrayList();
        this.f11882z = null;
        this.f11880x = new Handler(Looper.getMainLooper());
    }
}
