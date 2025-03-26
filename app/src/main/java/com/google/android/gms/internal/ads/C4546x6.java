package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.google.android.gms.internal.ads.x6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4546x6 implements InterfaceC4655y6 {

    /* renamed from: a, reason: collision with root package name */
    private final ByteBuffer f27748a;

    public C4546x6(ByteBuffer byteBuffer) {
        this.f27748a = byteBuffer.slice();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4655y6
    public final void a(MessageDigest[] messageDigestArr, long j8, int i8) {
        ByteBuffer slice;
        synchronized (this.f27748a) {
            int i9 = (int) j8;
            this.f27748a.position(i9);
            this.f27748a.limit(i9 + i8);
            slice = this.f27748a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4655y6
    public final long zza() {
        return this.f27748a.capacity();
    }
}
