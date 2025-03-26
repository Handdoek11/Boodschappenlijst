package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class Sx0 extends Vx0 {

    /* renamed from: a, reason: collision with root package name */
    final Logger f18985a;

    public Sx0(String str) {
        this.f18985a = Logger.getLogger(str);
    }

    @Override // com.google.android.gms.internal.ads.Vx0
    public final void a(String str) {
        this.f18985a.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}
