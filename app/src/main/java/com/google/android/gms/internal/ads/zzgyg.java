package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public class zzgyg extends IOException {

    /* renamed from: o, reason: collision with root package name */
    private boolean f28766o;

    public zzgyg(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    final void a() {
        this.f28766o = true;
    }

    final boolean b() {
        return this.f28766o;
    }

    public zzgyg(String str) {
        super(str);
    }
}
