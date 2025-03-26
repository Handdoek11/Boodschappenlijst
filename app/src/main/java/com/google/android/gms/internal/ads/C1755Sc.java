package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.PushbackInputStream;

/* renamed from: com.google.android.gms.internal.ads.Sc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1755Sc extends PushbackInputStream {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ C1790Tc f18933o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1755Sc(C1790Tc c1790Tc, InputStream inputStream, int i8) {
        super(inputStream, 1);
        this.f18933o = c1790Tc;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        C1860Vc.e(this.f18933o.f19158c);
        super.close();
    }
}
