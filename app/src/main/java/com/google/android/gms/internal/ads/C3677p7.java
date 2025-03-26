package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* renamed from: com.google.android.gms.internal.ads.p7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3677p7 extends FilterInputStream {

    /* renamed from: o, reason: collision with root package name */
    private final HttpURLConnection f25351o;

    /* JADX WARN: Illegal instructions before constructor call */
    C3677p7(HttpURLConnection httpURLConnection) {
        InputStream errorStream;
        try {
            errorStream = httpURLConnection.getInputStream();
        } catch (IOException unused) {
            errorStream = httpURLConnection.getErrorStream();
        }
        super(errorStream);
        this.f25351o = httpURLConnection;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        this.f25351o.disconnect();
    }
}
