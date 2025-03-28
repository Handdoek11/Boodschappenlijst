package com.google.firebase.messaging;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.google.firebase.messaging.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C5491q implements Application.ActivityLifecycleCallbacks {

    /* renamed from: o, reason: collision with root package name */
    private final Queue f33016o = new ArrayDeque(10);

    C5491q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(Intent intent) {
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String h8 = H.h(extras);
                if (!TextUtils.isEmpty(h8)) {
                    if (this.f33016o.contains(h8)) {
                        return;
                    } else {
                        this.f33016o.add(h8);
                    }
                }
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e8) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e8);
        }
        if (H.E(bundle)) {
            H.x(bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        final Intent intent = activity.getIntent();
        if (intent == null) {
            return;
        }
        if (Build.VERSION.SDK_INT <= 25) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.firebase.messaging.p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33014o.b(intent);
                }
            });
        } else {
            b(intent);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
