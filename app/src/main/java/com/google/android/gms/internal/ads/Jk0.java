package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class Jk0 {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f16298a;

    private Jk0(InputStream inputStream) {
        this.f16298a = inputStream;
    }

    public static Jk0 b(byte[] bArr) {
        return new Jk0(new ByteArrayInputStream(bArr));
    }

    public final As0 a() {
        try {
            return As0.g0(this.f16298a, Eu0.a());
        } finally {
            this.f16298a.close();
        }
    }
}
