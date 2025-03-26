package com.google.firebase.messaging;

import A3.AbstractC0379m;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.k;
import com.google.firebase.messaging.AbstractC5478d;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.firebase.messaging.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C5480f {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f32965a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f32966b;

    /* renamed from: c, reason: collision with root package name */
    private final J f32967c;

    public C5480f(Context context, J j8, ExecutorService executorService) {
        this.f32965a = executorService;
        this.f32966b = context;
        this.f32967c = j8;
    }

    private boolean b() {
        if (((KeyguardManager) this.f32966b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!f3.m.f()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f32966b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                return runningAppProcessInfo.importance == 100;
            }
        }
        return false;
    }

    private void c(AbstractC5478d.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f32966b.getSystemService("notification")).notify(aVar.f32948b, aVar.f32949c, aVar.f32947a.b());
    }

    private F d() {
        F g8 = F.g(this.f32967c.p("gcm.n.image"));
        if (g8 != null) {
            g8.j(this.f32965a);
        }
        return g8;
    }

    private void e(k.e eVar, F f8) {
        if (f8 == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) AbstractC0379m.b(f8.h(), 5L, TimeUnit.SECONDS);
            eVar.n(bitmap);
            eVar.v(new k.b().i(bitmap).h(null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            f8.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e8) {
            Log.w("FirebaseMessaging", "Failed to download image: " + e8.getCause());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            f8.close();
        }
    }

    boolean a() {
        if (this.f32967c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        F d8 = d();
        AbstractC5478d.a e8 = AbstractC5478d.e(this.f32966b, this.f32967c);
        e(e8.f32947a, d8);
        c(e8);
        return true;
    }
}
