package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import s1.j;
import t1.C6789j;
import t1.InterfaceC6781b;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements InterfaceC6781b {

    /* renamed from: t, reason: collision with root package name */
    private static final String f11888t = j.f("SystemJobService");

    /* renamed from: o, reason: collision with root package name */
    private C6789j f11889o;

    /* renamed from: s, reason: collision with root package name */
    private final Map f11890s = new HashMap();

    private static String a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // t1.InterfaceC6781b
    public void c(String str, boolean z7) {
        JobParameters jobParameters;
        j.c().a(f11888t, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.f11890s) {
            jobParameters = (JobParameters) this.f11890s.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z7);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            C6789j k8 = C6789j.k(getApplicationContext());
            this.f11889o = k8;
            k8.m().d(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            j.c().h(f11888t, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        C6789j c6789j = this.f11889o;
        if (c6789j != null) {
            c6789j.m().i(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        WorkerParameters.a aVar;
        if (this.f11889o == null) {
            j.c().a(f11888t, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        String a8 = a(jobParameters);
        if (TextUtils.isEmpty(a8)) {
            j.c().b(f11888t, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f11890s) {
            try {
                if (this.f11890s.containsKey(a8)) {
                    j.c().a(f11888t, String.format("Job is already being executed by SystemJobService: %s", a8), new Throwable[0]);
                    return false;
                }
                j.c().a(f11888t, String.format("onStartJob for %s", a8), new Throwable[0]);
                this.f11890s.put(a8, jobParameters);
                int i8 = Build.VERSION.SDK_INT;
                if (i8 >= 24) {
                    aVar = new WorkerParameters.a();
                    if (jobParameters.getTriggeredContentUris() != null) {
                        aVar.f11793b = Arrays.asList(jobParameters.getTriggeredContentUris());
                    }
                    if (jobParameters.getTriggeredContentAuthorities() != null) {
                        aVar.f11792a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                    }
                    if (i8 >= 28) {
                        aVar.f11794c = jobParameters.getNetwork();
                    }
                } else {
                    aVar = null;
                }
                this.f11889o.v(a8, aVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f11889o == null) {
            j.c().a(f11888t, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String a8 = a(jobParameters);
        if (TextUtils.isEmpty(a8)) {
            j.c().b(f11888t, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        j.c().a(f11888t, String.format("onStopJob for %s", a8), new Throwable[0]);
        synchronized (this.f11890s) {
            this.f11890s.remove(a8);
        }
        this.f11889o.x(a8);
        return !this.f11889o.m().f(a8);
    }
}
