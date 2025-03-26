package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C4922g7;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.t3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class CallableC5420t3 implements Callable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ M5 f31192o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ Bundle f31193s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ X2 f31194t;

    CallableC5420t3(X2 x22, M5 m52, Bundle bundle) {
        this.f31192o = m52;
        this.f31193s = bundle;
        this.f31194t = x22;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        this.f31194t.f30758o.x0();
        H5 h52 = this.f31194t.f30758o;
        M5 m52 = this.f31192o;
        Bundle bundle = this.f31193s;
        h52.j().l();
        if (!C4922g7.a() || !h52.g0().D(m52.f30614o, G.f30387I0) || m52.f30614o == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    h52.h().E().a("Uri sources and timestamps do not match");
                } else {
                    for (int i8 = 0; i8 < intArray.length; i8++) {
                        C5354k j02 = h52.j0();
                        String str = m52.f30614o;
                        int i9 = intArray[i8];
                        long j8 = longArray[i8];
                        Z2.r.f(str);
                        j02.l();
                        j02.s();
                        try {
                            int delete = j02.z().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i9), String.valueOf(j8)});
                            j02.h().I().d("Pruned " + delete + " trigger URIs. appId, source, timestamp", str, Integer.valueOf(i9), Long.valueOf(j8));
                        } catch (SQLiteException e8) {
                            j02.h().E().c("Error pruning trigger URIs. appId", C5378n2.t(str), e8);
                        }
                    }
                }
            }
        }
        return h52.j0().V0(m52.f30614o);
    }
}
