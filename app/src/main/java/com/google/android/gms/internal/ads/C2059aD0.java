package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.aD0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2059aD0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f20668a;

    /* renamed from: b, reason: collision with root package name */
    private final ZC0 f20669b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f20670c;

    static {
        if (AbstractC2301cW.f21206a < 31) {
            new C2059aD0("");
        } else {
            int i8 = ZC0.f20431b;
        }
    }

    public C2059aD0(LogSessionId logSessionId, String str) {
        this.f20669b = new ZC0(logSessionId);
        this.f20668a = str;
        this.f20670c = new Object();
    }

    public final LogSessionId a() {
        ZC0 zc0 = this.f20669b;
        zc0.getClass();
        return zc0.f20432a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2059aD0)) {
            return false;
        }
        C2059aD0 c2059aD0 = (C2059aD0) obj;
        return Objects.equals(this.f20668a, c2059aD0.f20668a) && Objects.equals(this.f20669b, c2059aD0.f20669b) && Objects.equals(this.f20670c, c2059aD0.f20670c);
    }

    public final int hashCode() {
        return Objects.hash(this.f20668a, this.f20669b, this.f20670c);
    }

    public C2059aD0(String str) {
        AbstractC3796qC.f(AbstractC2301cW.f21206a < 31);
        this.f20668a = str;
        this.f20669b = null;
        this.f20670c = new Object();
    }
}
