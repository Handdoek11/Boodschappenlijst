package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* renamed from: com.google.android.gms.internal.ads.hf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2859hf implements InterfaceC1161Bg {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SharedPreferences f22592a;

    C2859hf(Cif cif, SharedPreferences sharedPreferences) {
        this.f22592a = sharedPreferences;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1161Bg
    public final String a(String str, String str2) {
        return this.f22592a.getString(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1161Bg
    public final Double b(String str, double d8) {
        try {
            return Double.valueOf(this.f22592a.getFloat(str, (float) d8));
        } catch (ClassCastException unused) {
            return Double.valueOf(this.f22592a.getString(str, String.valueOf(d8)));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1161Bg
    public final Long c(String str, long j8) {
        try {
            return Long.valueOf(this.f22592a.getLong(str, j8));
        } catch (ClassCastException unused) {
            return Long.valueOf(this.f22592a.getInt(str, (int) j8));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1161Bg
    public final Boolean d(String str, boolean z7) {
        try {
            return Boolean.valueOf(this.f22592a.getBoolean(str, z7));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(this.f22592a.getString(str, String.valueOf(z7)));
        }
    }
}
