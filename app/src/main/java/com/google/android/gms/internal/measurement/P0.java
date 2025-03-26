package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class P0 extends S0 {

    /* renamed from: o, reason: collision with root package name */
    private final AtomicReference f28977o = new AtomicReference();

    /* renamed from: s, reason: collision with root package name */
    private boolean f28978s;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
    
        r4 = r4.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object J0(android.os.Bundle r4, java.lang.Class r5) {
        /*
            r0 = 0
            if (r4 == 0) goto L43
            java.lang.String r1 = "r"
            java.lang.Object r4 = r4.get(r1)
            if (r4 == 0) goto L43
            java.lang.Object r4 = r5.cast(r4)     // Catch: java.lang.ClassCastException -> L10
            return r4
        L10:
            r0 = move-exception
            java.lang.String r5 = r5.getCanonicalName()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected object type. Expected, Received"
            r1.append(r2)
            java.lang.String r2 = ": %s, %s"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r4
            java.lang.String r4 = java.lang.String.format(r1, r2)
            java.lang.String r5 = "AM"
            android.util.Log.w(r5, r4, r0)
            throw r0
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.P0.J0(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    public final Bundle D0(long j8) {
        Bundle bundle;
        synchronized (this.f28977o) {
            if (!this.f28978s) {
                try {
                    this.f28977o.wait(j8);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f28977o.get();
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.measurement.T0
    public final void R(Bundle bundle) {
        synchronized (this.f28977o) {
            try {
                try {
                    this.f28977o.set(bundle);
                    this.f28978s = true;
                } finally {
                    this.f28977o.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Long p2(long j8) {
        return (Long) J0(D0(j8), Long.class);
    }

    public final String q2(long j8) {
        return (String) J0(D0(j8), String.class);
    }
}
