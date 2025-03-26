package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.is, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2993is implements Px0 {

    /* renamed from: o, reason: collision with root package name */
    private final ByteBuffer f23073o;

    C2993is(ByteBuffer byteBuffer) {
        this.f23073o = byteBuffer.duplicate();
    }

    @Override // com.google.android.gms.internal.ads.Px0
    public final long a() {
        return this.f23073o.limit();
    }

    @Override // com.google.android.gms.internal.ads.Px0
    public final void b(long j8) {
        this.f23073o.position((int) j8);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.Px0
    public final int s0(ByteBuffer byteBuffer) {
        if (this.f23073o.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), this.f23073o.remaining());
        byte[] bArr = new byte[min];
        this.f23073o.get(bArr);
        byteBuffer.put(bArr);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.Px0
    public final ByteBuffer v0(long j8, long j9) {
        ByteBuffer byteBuffer = this.f23073o;
        int position = byteBuffer.position();
        byteBuffer.position((int) j8);
        ByteBuffer slice = this.f23073o.slice();
        slice.limit((int) j9);
        this.f23073o.position(position);
        return slice;
    }

    @Override // com.google.android.gms.internal.ads.Px0
    public final long zzb() {
        return this.f23073o.position();
    }
}
