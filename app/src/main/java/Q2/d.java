package q2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import j2.AbstractC6067p;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import n2.AbstractC6247a;
import r2.InterfaceC6662d;
import u2.AbstractC6812a;

/* loaded from: classes.dex */
public class d implements x {

    /* renamed from: a, reason: collision with root package name */
    private final Context f40941a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6662d f40942b;

    /* renamed from: c, reason: collision with root package name */
    private final f f40943c;

    public d(Context context, InterfaceC6662d interfaceC6662d, f fVar) {
        this.f40941a = context;
        this.f40942b = interfaceC6662d;
        this.f40943c = fVar;
    }

    private boolean d(JobScheduler jobScheduler, int i8, int i9) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i10 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i8) {
                return i10 >= i9;
            }
        }
        return false;
    }

    @Override // q2.x
    public void a(AbstractC6067p abstractC6067p, int i8, boolean z7) {
        ComponentName componentName = new ComponentName(this.f40941a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f40941a.getSystemService("jobscheduler");
        int c8 = c(abstractC6067p);
        if (!z7 && d(jobScheduler, c8, i8)) {
            AbstractC6247a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", abstractC6067p);
            return;
        }
        long S7 = this.f40942b.S(abstractC6067p);
        JobInfo.Builder c9 = this.f40943c.c(new JobInfo.Builder(c8, componentName), abstractC6067p.d(), S7, i8);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i8);
        persistableBundle.putString("backendName", abstractC6067p.b());
        persistableBundle.putInt("priority", AbstractC6812a.a(abstractC6067p.d()));
        if (abstractC6067p.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(abstractC6067p.c(), 0));
        }
        c9.setExtras(persistableBundle);
        AbstractC6247a.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", abstractC6067p, Integer.valueOf(c8), Long.valueOf(this.f40943c.g(abstractC6067p.d(), S7, i8)), Long.valueOf(S7), Integer.valueOf(i8));
        jobScheduler.schedule(c9.build());
    }

    @Override // q2.x
    public void b(AbstractC6067p abstractC6067p, int i8) {
        a(abstractC6067p, i8, false);
    }

    int c(AbstractC6067p abstractC6067p) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f40941a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(abstractC6067p.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(AbstractC6812a.a(abstractC6067p.d())).array());
        if (abstractC6067p.c() != null) {
            adler32.update(abstractC6067p.c());
        }
        return (int) adler32.getValue();
    }
}
