package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4842zr implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ boolean f28716o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ C1140Ar f28717s;

    RunnableC4842zr(C1140Ar c1140Ar, boolean z7) {
        this.f28716o = z7;
        this.f28717s = c1140Ar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f28717s.t("windowVisibilityChanged", "isVisible", String.valueOf(this.f28716o));
    }
}
