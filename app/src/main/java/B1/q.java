package B1;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import s1.s;

/* loaded from: classes.dex */
public class q implements s1.o {

    /* renamed from: c, reason: collision with root package name */
    static final String f375c = s1.j.f("WorkProgressUpdater");

    /* renamed from: a, reason: collision with root package name */
    final WorkDatabase f376a;

    /* renamed from: b, reason: collision with root package name */
    final C1.a f377b;

    class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ UUID f378o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ androidx.work.b f379s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f380t;

        a(UUID uuid, androidx.work.b bVar, androidx.work.impl.utils.futures.c cVar) {
            this.f378o = uuid;
            this.f379s = bVar;
            this.f380t = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            A1.p m8;
            String uuid = this.f378o.toString();
            s1.j c8 = s1.j.c();
            String str = q.f375c;
            c8.a(str, String.format("Updating progress for %s (%s)", this.f378o, this.f379s), new Throwable[0]);
            q.this.f376a.c();
            try {
                m8 = q.this.f376a.B().m(uuid);
            } finally {
                try {
                } finally {
                }
            }
            if (m8 == null) {
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            if (m8.f96b == s.RUNNING) {
                q.this.f376a.A().b(new A1.m(uuid, this.f379s));
            } else {
                s1.j.c().h(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", uuid), new Throwable[0]);
            }
            this.f380t.q(null);
            q.this.f376a.r();
        }
    }

    public q(WorkDatabase workDatabase, C1.a aVar) {
        this.f376a = workDatabase;
        this.f377b = aVar;
    }

    @Override // s1.o
    public com.google.common.util.concurrent.d a(Context context, UUID uuid, androidx.work.b bVar) {
        androidx.work.impl.utils.futures.c u7 = androidx.work.impl.utils.futures.c.u();
        this.f377b.b(new a(uuid, bVar, u7));
        return u7;
    }
}
