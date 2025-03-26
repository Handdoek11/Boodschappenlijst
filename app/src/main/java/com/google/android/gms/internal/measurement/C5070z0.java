package com.google.android.gms.internal.measurement;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.google.android.gms.internal.measurement.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5070z0 {

    /* renamed from: b, reason: collision with root package name */
    private static final Method f29655b = e();

    /* renamed from: c, reason: collision with root package name */
    private static final Method f29656c = d();

    /* renamed from: a, reason: collision with root package name */
    private final JobScheduler f29657a;

    private C5070z0(JobScheduler jobScheduler) {
        this.f29657a = jobScheduler;
    }

    private static int a() {
        Method method = f29656c;
        if (method != null) {
            try {
                Integer num = (Integer) method.invoke(UserHandle.class, null);
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            } catch (IllegalAccessException | InvocationTargetException e8) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "myUserId invocation illegal", e8);
                }
            }
        }
        return 0;
    }

    private final int b(JobInfo jobInfo, String str, int i8, String str2) {
        Method method = f29655b;
        if (method != null) {
            try {
                Integer num = (Integer) method.invoke(this.f29657a, jobInfo, str, Integer.valueOf(i8), str2);
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            } catch (IllegalAccessException | InvocationTargetException e8) {
                Log.e(str2, "error calling scheduleAsPackage", e8);
            }
        }
        return this.f29657a.schedule(jobInfo);
    }

    public static int c(Context context, JobInfo jobInfo, String str, String str2) {
        JobScheduler jobScheduler = (JobScheduler) b4.h.i((JobScheduler) context.getSystemService("jobscheduler"));
        return (f29655b == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) ? jobScheduler.schedule(jobInfo) : new C5070z0(jobScheduler).b(jobInfo, str, a(), str2);
    }

    private static Method d() {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return UserHandle.class.getDeclaredMethod("myUserId", null);
            } catch (NoSuchMethodException unused) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "No myUserId method available");
                }
            }
        }
        return null;
    }

    private static Method e() {
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        try {
            return JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
        } catch (NoSuchMethodException unused) {
            if (!Log.isLoggable("JobSchedulerCompat", 6)) {
                return null;
            }
            Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            return null;
        }
    }
}
