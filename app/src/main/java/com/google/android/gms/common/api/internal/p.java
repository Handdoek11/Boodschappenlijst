package com.google.android.gms.common.api.internal;

/* loaded from: classes.dex */
final class p implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ int f13346o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ s f13347s;

    p(s sVar, int i8) {
        this.f13347s = sVar;
        this.f13346o = i8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13347s.i(this.f13346o);
    }
}
