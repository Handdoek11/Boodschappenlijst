package com.headcode.ourgroceries.android;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import q5.AbstractC6635a;

/* loaded from: classes2.dex */
public final class SyncService extends Service {
    public static f6.d b(final Context context) {
        return new f6.d() { // from class: com.headcode.ourgroceries.android.M4
            @Override // f6.d
            public final void accept(Object obj) {
                SyncService.c(context, (Boolean) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(Context context, Boolean bool) {
        if (bool.booleanValue()) {
            d(context);
        } else {
            e(context);
        }
    }

    private static void d(Context context) {
        try {
            context.startService(new Intent(context, (Class<?>) SyncService.class));
        } catch (IllegalStateException e8) {
            AbstractC6635a.f("OG-SyncService", "Failed to start SyncService: " + e8.getMessage());
        }
    }

    private static void e(Context context) {
        try {
            context.stopService(new Intent(context, (Class<?>) SyncService.class));
        } catch (IllegalStateException e8) {
            AbstractC6635a.f("OG-SyncService", "Failed to stop SyncService: " + e8.getMessage());
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        AbstractC6635a.a("OG-SyncService", "onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        AbstractC6635a.a("OG-SyncService", "onDestroy");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i8, int i9) {
        AbstractC6635a.a("OG-SyncService", "onStartCommand()");
        return 2;
    }
}
