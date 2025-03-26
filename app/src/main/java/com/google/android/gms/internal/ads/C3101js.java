package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.js, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3101js {

    /* renamed from: a, reason: collision with root package name */
    private long f23352a;

    public final long a(ByteBuffer byteBuffer) {
        H7 h72;
        G7 g72;
        long j8 = this.f23352a;
        if (j8 > 0) {
            return j8;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            Iterator it = new B7(new C2993is(duplicate), C3428ms.f24596c).g().iterator();
            while (true) {
                h72 = null;
                if (!it.hasNext()) {
                    g72 = null;
                    break;
                }
                D7 d72 = (D7) it.next();
                if (d72 instanceof G7) {
                    g72 = (G7) d72;
                    break;
                }
            }
            Iterator it2 = g72.g().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                D7 d73 = (D7) it2.next();
                if (d73 instanceof H7) {
                    h72 = (H7) d73;
                    break;
                }
            }
            long g8 = (h72.g() * 1000) / h72.h();
            this.f23352a = g8;
            return g8;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
