package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class Kx0 extends Ox0 implements D7 {

    /* renamed from: y, reason: collision with root package name */
    protected final String f16693y = "moov";

    public Kx0(String str) {
    }

    @Override // com.google.android.gms.internal.ads.D7
    public final void d(Px0 px0, ByteBuffer byteBuffer, long j8, A7 a72) {
        px0.zzb();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.f18087s = px0;
        this.f18089u = px0.zzb();
        px0.b(px0.zzb() + j8);
        this.f18090v = px0.zzb();
        this.f18086o = a72;
    }

    @Override // com.google.android.gms.internal.ads.D7
    public final String zza() {
        return this.f16693y;
    }
}
