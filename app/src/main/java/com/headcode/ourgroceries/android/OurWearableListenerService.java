package com.headcode.ourgroceries.android;

import B3.AbstractServiceC0403w;
import B3.C0390i;
import android.os.Handler;
import android.os.Looper;
import j$.util.Objects;

/* loaded from: classes2.dex */
public class OurWearableListenerService extends AbstractServiceC0403w {

    /* renamed from: z, reason: collision with root package name */
    private static final Handler f34306z = new Handler(Looper.getMainLooper());

    @Override // B3.AbstractServiceC0403w, B3.InterfaceC0388g.b
    public void e(C0390i c0390i) {
        Handler handler = f34306z;
        final D6 d62 = D6.f33357d;
        Objects.requireNonNull(d62);
        handler.post(new Runnable() { // from class: com.headcode.ourgroceries.android.r2
            @Override // java.lang.Runnable
            public final void run() {
                d62.L();
            }
        });
    }

    @Override // B3.AbstractServiceC0403w, android.app.Service
    public void onCreate() {
        super.onCreate();
    }
}
