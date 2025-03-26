package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class Mx0 extends Jx0 implements D7 {

    /* renamed from: z, reason: collision with root package name */
    private int f17440z;

    protected Mx0(String str) {
        super("mvhd");
    }

    public final int e() {
        if (!this.f16472s) {
            c();
        }
        return this.f17440z;
    }

    protected final long f(ByteBuffer byteBuffer) {
        this.f17440z = C7.c(byteBuffer.get());
        C7.d(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
