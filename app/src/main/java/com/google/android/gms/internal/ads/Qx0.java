package com.google.android.gms.internal.ads;

import android.util.Log;

/* loaded from: classes.dex */
public final class Qx0 extends Vx0 {

    /* renamed from: a, reason: collision with root package name */
    final String f18571a;

    public Qx0(String str) {
        this.f18571a = str;
    }

    @Override // com.google.android.gms.internal.ads.Vx0
    public final void a(String str) {
        String str2 = this.f18571a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        Log.d("isoparser", sb.toString());
    }
}
