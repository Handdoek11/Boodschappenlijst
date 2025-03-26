package v1;

import A1.p;
import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;
import s1.C6722b;
import s1.EnumC6721a;
import s1.c;
import v0.C6822a;

/* loaded from: classes.dex */
class k {

    /* renamed from: b, reason: collision with root package name */
    private static final String f44076b = s1.j.f("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    private final ComponentName f44077a;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f44078a;

        static {
            int[] iArr = new int[s1.k.values().length];
            f44078a = iArr;
            try {
                iArr[s1.k.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44078a[s1.k.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44078a[s1.k.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44078a[s1.k.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44078a[s1.k.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    k(Context context) {
        this.f44077a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    private static JobInfo.TriggerContentUri b(c.a aVar) {
        boolean b8 = aVar.b();
        AbstractC6832i.a();
        return AbstractC6831h.a(aVar.a(), b8 ? 1 : 0);
    }

    static int c(s1.k kVar) {
        int i8 = a.f44078a[kVar.ordinal()];
        if (i8 == 1) {
            return 0;
        }
        if (i8 == 2) {
            return 1;
        }
        if (i8 == 3) {
            return 2;
        }
        if (i8 != 4) {
            if (i8 == 5 && Build.VERSION.SDK_INT >= 26) {
                return 4;
            }
        } else if (Build.VERSION.SDK_INT >= 24) {
            return 3;
        }
        s1.j.c().a(f44076b, String.format("API version too low. Cannot convert network type value %s", kVar), new Throwable[0]);
        return 1;
    }

    static void d(JobInfo.Builder builder, s1.k kVar) {
        if (Build.VERSION.SDK_INT < 30 || kVar != s1.k.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(c(kVar));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    JobInfo a(p pVar, int i8) {
        C6722b c6722b = pVar.f104j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", pVar.f95a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", pVar.d());
        JobInfo.Builder extras = new JobInfo.Builder(i8, this.f44077a).setRequiresCharging(c6722b.g()).setRequiresDeviceIdle(c6722b.h()).setExtras(persistableBundle);
        d(extras, c6722b.b());
        if (!c6722b.h()) {
            extras.setBackoffCriteria(pVar.f107m, pVar.f106l == EnumC6721a.LINEAR ? 0 : 1);
        }
        long max = Math.max(pVar.a() - System.currentTimeMillis(), 0L);
        int i9 = Build.VERSION.SDK_INT;
        if (i9 <= 28 || max > 0) {
            extras.setMinimumLatency(max);
        } else if (!pVar.f111q) {
            extras.setImportantWhileForeground(true);
        }
        if (i9 >= 24 && c6722b.e()) {
            Iterator it = c6722b.a().b().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(b((c.a) it.next()));
            }
            extras.setTriggerContentUpdateDelay(c6722b.c());
            extras.setTriggerContentMaxDelay(c6722b.d());
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(c6722b.f());
            extras.setRequiresStorageNotLow(c6722b.i());
        }
        boolean z7 = pVar.f105k > 0;
        if (C6822a.b() && pVar.f111q && !z7) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
