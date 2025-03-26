package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import j2.AbstractC6067p;
import j2.u;
import u2.AbstractC6812a;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i8 = jobParameters.getExtras().getInt("priority");
        int i9 = jobParameters.getExtras().getInt("attemptNumber");
        u.f(getApplicationContext());
        AbstractC6067p.a d8 = AbstractC6067p.a().b(string).d(AbstractC6812a.b(i8));
        if (string2 != null) {
            d8.c(Base64.decode(string2, 0));
        }
        u.c().e().v(d8.a(), i9, new Runnable() { // from class: q2.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f40944o.b(jobParameters);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
