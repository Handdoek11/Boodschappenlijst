package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.C1103b;

/* loaded from: classes.dex */
final class u implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ C1103b f13365o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ v f13366s;

    u(v vVar, C1103b c1103b) {
        this.f13366s = vVar;
        this.f13365o = c1103b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v vVar = this.f13366s;
        s sVar = (s) vVar.f13372f.f13294A.get(vVar.f13368b);
        if (sVar == null) {
            return;
        }
        if (!this.f13365o.E0()) {
            sVar.E(this.f13365o, null);
            return;
        }
        this.f13366s.f13371e = true;
        if (this.f13366s.f13367a.o()) {
            this.f13366s.i();
            return;
        }
        try {
            v vVar2 = this.f13366s;
            vVar2.f13367a.n(null, vVar2.f13367a.b());
        } catch (SecurityException e8) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e8);
            this.f13366s.f13367a.c("Failed to get service from broker.");
            sVar.E(new C1103b(10), null);
        }
    }
}
