package v1;

import A1.p;
import A1.q;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import s1.s;
import t1.C6789j;
import t1.InterfaceC6784e;

/* loaded from: classes.dex */
public class l implements InterfaceC6784e {

    /* renamed from: v, reason: collision with root package name */
    private static final String f44079v = s1.j.f("SystemJobScheduler");

    /* renamed from: o, reason: collision with root package name */
    private final Context f44080o;

    /* renamed from: s, reason: collision with root package name */
    private final JobScheduler f44081s;

    /* renamed from: t, reason: collision with root package name */
    private final C6789j f44082t;

    /* renamed from: u, reason: collision with root package name */
    private final k f44083u;

    public l(Context context, C6789j c6789j) {
        this(context, c6789j, (JobScheduler) context.getSystemService("jobscheduler"), new k(context));
    }

    public static void b(Context context) {
        List g8;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (g8 = g(context, jobScheduler)) == null || g8.isEmpty()) {
            return;
        }
        Iterator it = g8.iterator();
        while (it.hasNext()) {
            c(jobScheduler, ((JobInfo) it.next()).getId());
        }
    }

    private static void c(JobScheduler jobScheduler, int i8) {
        try {
            jobScheduler.cancel(i8);
        } catch (Throwable th) {
            s1.j.c().b(f44079v, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i8)), th);
        }
    }

    private static List f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> g8 = g(context, jobScheduler);
        if (g8 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : g8) {
            if (str.equals(h(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    private static List g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            s1.j.c().b(f44079v, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    private static String h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static boolean i(Context context, C6789j c6789j) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> g8 = g(context, jobScheduler);
        List a8 = c6789j.o().y().a();
        boolean z7 = false;
        HashSet hashSet = new HashSet(g8 != null ? g8.size() : 0);
        if (g8 != null && !g8.isEmpty()) {
            for (JobInfo jobInfo : g8) {
                String h8 = h(jobInfo);
                if (TextUtils.isEmpty(h8)) {
                    c(jobScheduler, jobInfo.getId());
                } else {
                    hashSet.add(h8);
                }
            }
        }
        Iterator it = a8.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!hashSet.contains((String) it.next())) {
                s1.j.c().a(f44079v, "Reconciling jobs", new Throwable[0]);
                z7 = true;
                break;
            }
        }
        if (z7) {
            WorkDatabase o8 = c6789j.o();
            o8.c();
            try {
                q B7 = o8.B();
                Iterator it2 = a8.iterator();
                while (it2.hasNext()) {
                    B7.c((String) it2.next(), -1L);
                }
                o8.r();
                o8.g();
            } catch (Throwable th) {
                o8.g();
                throw th;
            }
        }
        return z7;
    }

    @Override // t1.InterfaceC6784e
    public boolean a() {
        return true;
    }

    @Override // t1.InterfaceC6784e
    public void d(String str) {
        List f8 = f(this.f44080o, this.f44081s, str);
        if (f8 == null || f8.isEmpty()) {
            return;
        }
        Iterator it = f8.iterator();
        while (it.hasNext()) {
            c(this.f44081s, ((Integer) it.next()).intValue());
        }
        this.f44082t.o().y().d(str);
    }

    @Override // t1.InterfaceC6784e
    public void e(p... pVarArr) {
        List f8;
        WorkDatabase o8 = this.f44082t.o();
        B1.f fVar = new B1.f(o8);
        for (p pVar : pVarArr) {
            o8.c();
            try {
                p m8 = o8.B().m(pVar.f95a);
                if (m8 == null) {
                    s1.j.c().h(f44079v, "Skipping scheduling " + pVar.f95a + " because it's no longer in the DB", new Throwable[0]);
                    o8.r();
                } else if (m8.f96b != s.ENQUEUED) {
                    s1.j.c().h(f44079v, "Skipping scheduling " + pVar.f95a + " because it is no longer enqueued", new Throwable[0]);
                    o8.r();
                } else {
                    A1.g c8 = o8.y().c(pVar.f95a);
                    int d8 = c8 != null ? c8.f73b : fVar.d(this.f44082t.i().i(), this.f44082t.i().g());
                    if (c8 == null) {
                        this.f44082t.o().y().b(new A1.g(pVar.f95a, d8));
                    }
                    j(pVar, d8);
                    if (Build.VERSION.SDK_INT == 23 && (f8 = f(this.f44080o, this.f44081s, pVar.f95a)) != null) {
                        int indexOf = f8.indexOf(Integer.valueOf(d8));
                        if (indexOf >= 0) {
                            f8.remove(indexOf);
                        }
                        j(pVar, !f8.isEmpty() ? ((Integer) f8.get(0)).intValue() : fVar.d(this.f44082t.i().i(), this.f44082t.i().g()));
                    }
                    o8.r();
                }
            } finally {
                o8.g();
            }
        }
    }

    public void j(p pVar, int i8) {
        JobInfo a8 = this.f44083u.a(pVar, i8);
        s1.j c8 = s1.j.c();
        String str = f44079v;
        c8.a(str, String.format("Scheduling work ID %s Job ID %s", pVar.f95a, Integer.valueOf(i8)), new Throwable[0]);
        try {
            if (this.f44081s.schedule(a8) == 0) {
                s1.j.c().h(str, String.format("Unable to schedule work ID %s", pVar.f95a), new Throwable[0]);
                if (pVar.f111q && pVar.f112r == s1.n.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    pVar.f111q = false;
                    s1.j.c().a(str, String.format("Scheduling a non-expedited job (work ID %s)", pVar.f95a), new Throwable[0]);
                    j(pVar, i8);
                }
            }
        } catch (IllegalStateException e8) {
            List g8 = g(this.f44080o, this.f44081s);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(g8 != null ? g8.size() : 0), Integer.valueOf(this.f44082t.o().B().g().size()), Integer.valueOf(this.f44082t.i().h()));
            s1.j.c().b(f44079v, format, new Throwable[0]);
            throw new IllegalStateException(format, e8);
        } catch (Throwable th) {
            s1.j.c().b(f44079v, String.format("Unable to schedule %s", pVar), th);
        }
    }

    public l(Context context, C6789j c6789j, JobScheduler jobScheduler, k kVar) {
        this.f44080o = context;
        this.f44082t = c6789j;
        this.f44081s = jobScheduler;
        this.f44083u = kVar;
    }
}
