package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.Cb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1188Cb0 {

    /* renamed from: d, reason: collision with root package name */
    private static final C1188Cb0 f14200d = new C1188Cb0();

    /* renamed from: a, reason: collision with root package name */
    private WeakReference f14201a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f14202b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14203c = false;

    public static C1188Cb0 a() {
        return f14200d;
    }

    public final void c() {
        Context context = (Context) this.f14201a.get();
        if (context == null) {
            return;
        }
        boolean isDeviceLocked = ((KeyguardManager) context.getSystemService("keyguard")).isDeviceLocked();
        d(this.f14202b, isDeviceLocked);
        this.f14203c = isDeviceLocked;
    }

    public final void d(boolean z7, boolean z8) {
        if ((z8 || z7) == (this.f14203c || this.f14202b)) {
            return;
        }
        Iterator it = C4048sb0.a().c().iterator();
        while (it.hasNext()) {
            ((C2200bb0) it.next()).g().m(z8 || z7);
        }
    }

    public final void e(Context context) {
        if (context == null) {
            return;
        }
        this.f14201a = new WeakReference(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new C1152Bb0(this), intentFilter);
    }
}
