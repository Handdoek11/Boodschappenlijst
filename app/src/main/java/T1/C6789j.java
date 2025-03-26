package t1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import s1.j;
import s1.m;
import s1.p;
import s1.t;
import u1.C6811b;
import v1.l;

/* renamed from: t1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6789j extends t {

    /* renamed from: j, reason: collision with root package name */
    private static final String f43820j = s1.j.f("WorkManagerImpl");

    /* renamed from: k, reason: collision with root package name */
    private static C6789j f43821k = null;

    /* renamed from: l, reason: collision with root package name */
    private static C6789j f43822l = null;

    /* renamed from: m, reason: collision with root package name */
    private static final Object f43823m = new Object();

    /* renamed from: a, reason: collision with root package name */
    private Context f43824a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.work.a f43825b;

    /* renamed from: c, reason: collision with root package name */
    private WorkDatabase f43826c;

    /* renamed from: d, reason: collision with root package name */
    private C1.a f43827d;

    /* renamed from: e, reason: collision with root package name */
    private List f43828e;

    /* renamed from: f, reason: collision with root package name */
    private C6783d f43829f;

    /* renamed from: g, reason: collision with root package name */
    private B1.h f43830g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f43831h;

    /* renamed from: i, reason: collision with root package name */
    private BroadcastReceiver.PendingResult f43832i;

    public C6789j(Context context, androidx.work.a aVar, C1.a aVar2) {
        this(context, aVar, aVar2, context.getResources().getBoolean(p.f42699a));
    }

    public static void e(Context context, androidx.work.a aVar) {
        synchronized (f43823m) {
            try {
                C6789j c6789j = f43821k;
                if (c6789j != null && f43822l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (c6789j == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f43822l == null) {
                        f43822l = new C6789j(applicationContext, aVar, new C1.b(aVar.l()));
                    }
                    f43821k = f43822l;
                }
            } finally {
            }
        }
    }

    public static C6789j j() {
        synchronized (f43823m) {
            try {
                C6789j c6789j = f43821k;
                if (c6789j != null) {
                    return c6789j;
                }
                return f43822l;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C6789j k(Context context) {
        C6789j j8;
        synchronized (f43823m) {
            try {
                j8 = j();
                if (j8 == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j8;
    }

    private void q(Context context, androidx.work.a aVar, C1.a aVar2, WorkDatabase workDatabase, List list, C6783d c6783d) {
        Context applicationContext = context.getApplicationContext();
        this.f43824a = applicationContext;
        this.f43825b = aVar;
        this.f43827d = aVar2;
        this.f43826c = workDatabase;
        this.f43828e = list;
        this.f43829f = c6783d;
        this.f43830g = new B1.h(workDatabase);
        this.f43831h = false;
        if (Build.VERSION.SDK_INT >= 24 && applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f43827d.b(new ForceStopRunnable(applicationContext, this));
    }

    @Override // s1.t
    public m a(String str) {
        B1.a d8 = B1.a.d(str, this);
        this.f43827d.b(d8);
        return d8.e();
    }

    @Override // s1.t
    public m b(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new C6786g(this, list).a();
    }

    public m f(UUID uuid) {
        B1.a b8 = B1.a.b(uuid, this);
        this.f43827d.b(b8);
        return b8.e();
    }

    public List g(Context context, androidx.work.a aVar, C1.a aVar2) {
        return Arrays.asList(AbstractC6785f.a(context, this), new C6811b(context, aVar, aVar2, this));
    }

    public Context h() {
        return this.f43824a;
    }

    public androidx.work.a i() {
        return this.f43825b;
    }

    public B1.h l() {
        return this.f43830g;
    }

    public C6783d m() {
        return this.f43829f;
    }

    public List n() {
        return this.f43828e;
    }

    public WorkDatabase o() {
        return this.f43826c;
    }

    public C1.a p() {
        return this.f43827d;
    }

    public void r() {
        synchronized (f43823m) {
            try {
                this.f43831h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f43832i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f43832i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void s() {
        l.b(h());
        o().B().t();
        AbstractC6785f.b(i(), o(), n());
    }

    public void t(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f43823m) {
            try {
                this.f43832i = pendingResult;
                if (this.f43831h) {
                    pendingResult.finish();
                    this.f43832i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void u(String str) {
        v(str, null);
    }

    public void v(String str, WorkerParameters.a aVar) {
        this.f43827d.b(new B1.l(this, str, aVar));
    }

    public void w(String str) {
        this.f43827d.b(new B1.m(this, str, true));
    }

    public void x(String str) {
        this.f43827d.b(new B1.m(this, str, false));
    }

    public C6789j(Context context, androidx.work.a aVar, C1.a aVar2, boolean z7) {
        this(context, aVar, aVar2, WorkDatabase.s(context.getApplicationContext(), aVar2.c(), z7));
    }

    public C6789j(Context context, androidx.work.a aVar, C1.a aVar2, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        s1.j.e(new j.a(aVar.j()));
        List g8 = g(applicationContext, aVar, aVar2);
        q(context, aVar, aVar2, workDatabase, g8, new C6783d(context, aVar, aVar2, workDatabase, g8));
    }
}
