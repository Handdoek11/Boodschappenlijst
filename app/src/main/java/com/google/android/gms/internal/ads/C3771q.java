package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.view.Display;

/* renamed from: com.google.android.gms.internal.ads.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3771q implements DisplayManager.DisplayListener {

    /* renamed from: a, reason: collision with root package name */
    private final DisplayManager f25685a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3988s f25686b;

    public C3771q(C3988s c3988s, DisplayManager displayManager) {
        this.f25686b = c3988s;
        this.f25685a = displayManager;
    }

    private final Display c() {
        return this.f25685a.getDisplay(0);
    }

    public final void a() {
        this.f25685a.registerDisplayListener(this, AbstractC2301cW.Q(null));
        C3988s.b(this.f25686b, c());
    }

    public final void b() {
        this.f25685a.unregisterDisplayListener(this);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i8) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i8) {
        if (i8 == 0) {
            C3988s.b(this.f25686b, c());
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i8) {
    }
}
