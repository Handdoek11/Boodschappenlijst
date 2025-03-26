package com.google.android.gms.measurement.internal;

import android.net.Uri;

/* renamed from: com.google.android.gms.measurement.internal.q4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5401q4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ boolean f31159o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ Uri f31160s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ String f31161t;

    /* renamed from: u, reason: collision with root package name */
    private final /* synthetic */ String f31162u;

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ C5380n4 f31163v;

    RunnableC5401q4(C5380n4 c5380n4, boolean z7, Uri uri, String str, String str2) {
        this.f31159o = z7;
        this.f31160s = uri;
        this.f31161t = str;
        this.f31162u = str2;
        this.f31163v = c5380n4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5380n4.a(this.f31163v, this.f31159o, this.f31160s, this.f31161t, this.f31162u);
    }
}
