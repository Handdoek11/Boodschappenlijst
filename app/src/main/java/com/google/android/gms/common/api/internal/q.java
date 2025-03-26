package com.google.android.gms.common.api.internal;

/* loaded from: classes.dex */
final class q implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ r f13348o;

    q(r rVar) {
        this.f13348o = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s sVar = this.f13348o.f13349a;
        sVar.f13355s.c(sVar.f13355s.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
