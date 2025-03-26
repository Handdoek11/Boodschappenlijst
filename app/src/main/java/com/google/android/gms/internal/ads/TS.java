package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
final class TS extends TimerTask {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ AlertDialog f19132o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ Timer f19133s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ F2.x f19134t;

    TS(US us, AlertDialog alertDialog, Timer timer, F2.x xVar) {
        this.f19132o = alertDialog;
        this.f19133s = timer;
        this.f19134t = xVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f19132o.dismiss();
        this.f19133s.cancel();
        F2.x xVar = this.f19134t;
        if (xVar != null) {
            xVar.zzb();
        }
    }
}
