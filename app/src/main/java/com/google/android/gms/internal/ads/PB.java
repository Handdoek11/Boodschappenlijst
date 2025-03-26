package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class PB {

    /* renamed from: b, reason: collision with root package name */
    private static final String f18147b = Integer.toString(0, 36);

    /* renamed from: a, reason: collision with root package name */
    public final String f18148a;

    public PB(String str) {
        this.f18148a = str;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString(f18147b, this.f18148a);
        return bundle;
    }
}
