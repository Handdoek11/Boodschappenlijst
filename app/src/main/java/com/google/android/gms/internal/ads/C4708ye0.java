package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* renamed from: com.google.android.gms.internal.ads.ye0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4708ye0 extends AbstractC2316cf0 {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f28155a;

    /* renamed from: b, reason: collision with root package name */
    private final String f28156b;

    /* renamed from: c, reason: collision with root package name */
    private final int f28157c;

    /* renamed from: d, reason: collision with root package name */
    private final float f28158d;

    /* renamed from: e, reason: collision with root package name */
    private final int f28159e;

    /* renamed from: f, reason: collision with root package name */
    private final String f28160f;

    /* synthetic */ C4708ye0(IBinder iBinder, String str, int i8, float f8, int i9, int i10, String str2, int i11, String str3, String str4, String str5, AbstractC4599xe0 abstractC4599xe0) {
        this.f28155a = iBinder;
        this.f28156b = str;
        this.f28157c = i8;
        this.f28158d = f8;
        this.f28159e = i11;
        this.f28160f = str4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2316cf0
    public final float a() {
        return this.f28158d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2316cf0
    public final int b() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2316cf0
    public final int c() {
        return this.f28157c;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2316cf0
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2316cf0
    public final int e() {
        return this.f28159e;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2316cf0) {
            AbstractC2316cf0 abstractC2316cf0 = (AbstractC2316cf0) obj;
            if (this.f28155a.equals(abstractC2316cf0.f()) && ((str = this.f28156b) != null ? str.equals(abstractC2316cf0.h()) : abstractC2316cf0.h() == null) && this.f28157c == abstractC2316cf0.c() && Float.floatToIntBits(this.f28158d) == Float.floatToIntBits(abstractC2316cf0.a())) {
                abstractC2316cf0.b();
                abstractC2316cf0.d();
                abstractC2316cf0.j();
                if (this.f28159e == abstractC2316cf0.e()) {
                    abstractC2316cf0.i();
                    String str2 = this.f28160f;
                    if (str2 != null ? str2.equals(abstractC2316cf0.g()) : abstractC2316cf0.g() == null) {
                        abstractC2316cf0.k();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2316cf0
    public final IBinder f() {
        return this.f28155a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2316cf0
    public final String g() {
        return this.f28160f;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2316cf0
    public final String h() {
        return this.f28156b;
    }

    public final int hashCode() {
        int hashCode = this.f28155a.hashCode() ^ 1000003;
        String str = this.f28156b;
        int hashCode2 = (((((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f28157c) * 1000003) ^ Float.floatToIntBits(this.f28158d);
        int i8 = this.f28159e;
        String str2 = this.f28160f;
        return ((((hashCode2 * 1525764945) ^ i8) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2316cf0
    public final String i() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2316cf0
    public final String j() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2316cf0
    public final String k() {
        return null;
    }

    public final String toString() {
        return "OverlayDisplayShowRequest{windowToken=" + this.f28155a.toString() + ", appId=" + this.f28156b + ", layoutGravity=" + this.f28157c + ", layoutVerticalMargin=" + this.f28158d + ", displayMode=0, triggerMode=0, sessionToken=null, windowWidthPx=" + this.f28159e + ", deeplinkUrl=null, adFieldEnifd=" + this.f28160f + ", thirdPartyAuthCallerId=null}";
    }
}
