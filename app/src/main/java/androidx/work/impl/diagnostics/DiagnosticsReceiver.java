package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import s1.j;
import s1.l;
import s1.t;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11891a = j.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        j.c().a(f11891a, "Requesting diagnostics", new Throwable[0]);
        try {
            t.d(context).c(l.d(DiagnosticsWorker.class));
        } catch (IllegalStateException e8) {
            j.c().b(f11891a, "WorkManager is not initialized", e8);
        }
    }
}
