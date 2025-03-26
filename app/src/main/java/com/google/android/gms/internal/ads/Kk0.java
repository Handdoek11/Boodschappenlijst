package com.google.android.gms.internal.ads;

import java.io.OutputStream;

/* loaded from: classes.dex */
public final class Kk0 {

    /* renamed from: a, reason: collision with root package name */
    private final OutputStream f16622a;

    private Kk0(OutputStream outputStream) {
        this.f16622a = outputStream;
    }

    public static Kk0 b(OutputStream outputStream) {
        return new Kk0(outputStream);
    }

    public final void a(As0 as0) {
        try {
            as0.l(this.f16622a);
        } finally {
            this.f16622a.close();
        }
    }
}
