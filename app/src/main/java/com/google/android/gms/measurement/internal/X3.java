package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* loaded from: classes2.dex */
final class X3 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ String f30761o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ String f30762s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ long f30763t;

    /* renamed from: u, reason: collision with root package name */
    private final /* synthetic */ Bundle f30764u;

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ boolean f30765v;

    /* renamed from: w, reason: collision with root package name */
    private final /* synthetic */ boolean f30766w;

    /* renamed from: x, reason: collision with root package name */
    private final /* synthetic */ boolean f30767x;

    /* renamed from: y, reason: collision with root package name */
    private final /* synthetic */ String f30768y;

    /* renamed from: z, reason: collision with root package name */
    private final /* synthetic */ F3 f30769z;

    X3(F3 f32, String str, String str2, long j8, Bundle bundle, boolean z7, boolean z8, boolean z9, String str3) {
        this.f30761o = str;
        this.f30762s = str2;
        this.f30763t = j8;
        this.f30764u = bundle;
        this.f30765v = z7;
        this.f30766w = z8;
        this.f30767x = z9;
        this.f30768y = str3;
        this.f30769z = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30769z.b0(this.f30761o, this.f30762s, this.f30763t, this.f30764u, this.f30765v, this.f30766w, this.f30767x, this.f30768y);
    }
}
