package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.vy0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4421vy0 extends androidx.browser.customtabs.e {

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f27409b;

    public C4421vy0(C1517Lf c1517Lf) {
        this.f27409b = new WeakReference(c1517Lf);
    }

    @Override // androidx.browser.customtabs.e
    public final void a(ComponentName componentName, androidx.browser.customtabs.c cVar) {
        C1517Lf c1517Lf = (C1517Lf) this.f27409b.get();
        if (c1517Lf != null) {
            c1517Lf.c(cVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C1517Lf c1517Lf = (C1517Lf) this.f27409b.get();
        if (c1517Lf != null) {
            c1517Lf.d();
        }
    }
}
