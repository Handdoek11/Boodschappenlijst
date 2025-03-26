package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* renamed from: com.google.android.gms.internal.ads.nE0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3474nE0 {

    /* renamed from: a, reason: collision with root package name */
    private Exception f24905a;

    /* renamed from: b, reason: collision with root package name */
    private long f24906b = -9223372036854775807L;

    /* renamed from: c, reason: collision with root package name */
    private long f24907c = -9223372036854775807L;

    public final void a() {
        this.f24905a = null;
        this.f24906b = -9223372036854775807L;
        this.f24907c = -9223372036854775807L;
    }

    public final void b(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f24905a == null) {
            this.f24905a = exc;
        }
        if (this.f24906b == -9223372036854775807L && !C4781zE0.G()) {
            this.f24906b = 200 + elapsedRealtime;
        }
        long j8 = this.f24906b;
        if (j8 == -9223372036854775807L || elapsedRealtime < j8) {
            this.f24907c = elapsedRealtime + 50;
            return;
        }
        Exception exc2 = this.f24905a;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = this.f24905a;
        a();
        throw exc3;
    }

    public final boolean c() {
        if (this.f24905a == null) {
            return false;
        }
        return C4781zE0.G() || SystemClock.elapsedRealtime() < this.f24907c;
    }
}
