package B1;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import s1.s;
import z1.InterfaceC7064a;

/* loaded from: classes.dex */
public class p implements s1.f {

    /* renamed from: d, reason: collision with root package name */
    private static final String f366d = s1.j.f("WMFgUpdater");

    /* renamed from: a, reason: collision with root package name */
    private final C1.a f367a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC7064a f368b;

    /* renamed from: c, reason: collision with root package name */
    final A1.q f369c;

    class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f370o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ UUID f371s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ s1.e f372t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ Context f373u;

        a(androidx.work.impl.utils.futures.c cVar, UUID uuid, s1.e eVar, Context context) {
            this.f370o = cVar;
            this.f371s = uuid;
            this.f372t = eVar;
            this.f373u = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.f370o.isCancelled()) {
                    String uuid = this.f371s.toString();
                    s l8 = p.this.f369c.l(uuid);
                    if (l8 == null || l8.a()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    p.this.f368b.b(uuid, this.f372t);
                    this.f373u.startService(androidx.work.impl.foreground.a.a(this.f373u, uuid, this.f372t));
                }
                this.f370o.q(null);
            } catch (Throwable th) {
                this.f370o.r(th);
            }
        }
    }

    public p(WorkDatabase workDatabase, InterfaceC7064a interfaceC7064a, C1.a aVar) {
        this.f368b = interfaceC7064a;
        this.f367a = aVar;
        this.f369c = workDatabase.B();
    }

    @Override // s1.f
    public com.google.common.util.concurrent.d a(Context context, UUID uuid, s1.e eVar) {
        androidx.work.impl.utils.futures.c u7 = androidx.work.impl.utils.futures.c.u();
        this.f367a.b(new a(u7, uuid, eVar, context));
        return u7;
    }
}
