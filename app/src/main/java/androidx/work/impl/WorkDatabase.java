package androidx.work.impl;

import A1.e;
import A1.k;
import A1.n;
import A1.q;
import A1.t;
import android.content.Context;
import androidx.room.g;
import androidx.room.h;
import androidx.work.impl.a;
import g1.c;
import h1.C5825c;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import t1.AbstractC6787h;

/* loaded from: classes.dex */
public abstract class WorkDatabase extends h {

    /* renamed from: l, reason: collision with root package name */
    private static final long f11823l = TimeUnit.DAYS.toMillis(1);

    class a implements c.InterfaceC0258c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f11824a;

        a(Context context) {
            this.f11824a = context;
        }

        @Override // g1.c.InterfaceC0258c
        public c a(c.b bVar) {
            c.b.a a8 = c.b.a(this.f11824a);
            a8.c(bVar.f36000b).b(bVar.f36001c).d(true);
            return new C5825c().a(a8.a());
        }
    }

    class b extends h.b {
        b() {
        }

        @Override // androidx.room.h.b
        public void c(g1.b bVar) {
            super.c(bVar);
            bVar.n();
            try {
                bVar.v(WorkDatabase.w());
                bVar.P();
            } finally {
                bVar.Y();
            }
        }
    }

    public static WorkDatabase s(Context context, Executor executor, boolean z7) {
        h.a a8;
        if (z7) {
            a8 = g.c(context, WorkDatabase.class).c();
        } else {
            a8 = g.a(context, WorkDatabase.class, AbstractC6787h.d());
            a8.f(new a(context));
        }
        return (WorkDatabase) a8.g(executor).a(u()).b(androidx.work.impl.a.f11833a).b(new a.h(context, 2, 3)).b(androidx.work.impl.a.f11834b).b(androidx.work.impl.a.f11835c).b(new a.h(context, 5, 6)).b(androidx.work.impl.a.f11836d).b(androidx.work.impl.a.f11837e).b(androidx.work.impl.a.f11838f).b(new a.i(context)).b(new a.h(context, 10, 11)).b(androidx.work.impl.a.f11839g).e().d();
    }

    static h.b u() {
        return new b();
    }

    static long v() {
        return System.currentTimeMillis() - f11823l;
    }

    static String w() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + v() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    public abstract n A();

    public abstract q B();

    public abstract t C();

    public abstract A1.b t();

    public abstract e x();

    public abstract A1.h y();

    public abstract k z();
}
