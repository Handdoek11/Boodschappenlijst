package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class JE0 extends AbstractC2239bv {

    /* renamed from: i, reason: collision with root package name */
    private int f16145i;

    /* renamed from: j, reason: collision with root package name */
    private int f16146j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f16147k;

    /* renamed from: l, reason: collision with root package name */
    private int f16148l;

    /* renamed from: m, reason: collision with root package name */
    private byte[] f16149m = AbstractC2301cW.f21211f;

    /* renamed from: n, reason: collision with root package name */
    private int f16150n;

    /* renamed from: o, reason: collision with root package name */
    private long f16151o;

    @Override // com.google.android.gms.internal.ads.InterfaceC1143Au
    public final void b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i8 = limit - position;
        if (i8 == 0) {
            return;
        }
        int min = Math.min(i8, this.f16148l);
        this.f16151o += min / this.f21000b.f28220d;
        this.f16148l -= min;
        byteBuffer.position(position + min);
        if (this.f16148l <= 0) {
            int i9 = i8 - min;
            int length = (this.f16150n + i9) - this.f16149m.length;
            ByteBuffer i10 = i(length);
            int max = Math.max(0, Math.min(length, this.f16150n));
            i10.put(this.f16149m, 0, max);
            int max2 = Math.max(0, Math.min(length - max, i9));
            byteBuffer.limit(byteBuffer.position() + max2);
            i10.put(byteBuffer);
            byteBuffer.limit(limit);
            int i11 = i9 - max2;
            int i12 = this.f16150n - max;
            this.f16150n = i12;
            byte[] bArr = this.f16149m;
            System.arraycopy(bArr, max, bArr, 0, i12);
            byteBuffer.get(this.f16149m, this.f16150n, i11);
            this.f16150n += i11;
            i10.flip();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2239bv, com.google.android.gms.internal.ads.InterfaceC1143Au
    public final boolean e() {
        return super.e() && this.f16150n == 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2239bv
    public final C4737yt h(C4737yt c4737yt) {
        if (c4737yt.f28219c != 2) {
            throw new zzcg("Unhandled input format:", c4737yt);
        }
        this.f16147k = true;
        return (this.f16145i == 0 && this.f16146j == 0) ? C4737yt.f28216e : c4737yt;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2239bv
    protected final void j() {
        if (this.f16147k) {
            this.f16147k = false;
            int i8 = this.f16146j;
            int i9 = this.f21000b.f28220d;
            this.f16149m = new byte[i8 * i9];
            this.f16148l = this.f16145i * i9;
        }
        this.f16150n = 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2239bv
    protected final void k() {
        if (this.f16147k) {
            if (this.f16150n > 0) {
                this.f16151o += r0 / this.f21000b.f28220d;
            }
            this.f16150n = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2239bv
    protected final void l() {
        this.f16149m = AbstractC2301cW.f21211f;
    }

    public final long n() {
        return this.f16151o;
    }

    public final void o() {
        this.f16151o = 0L;
    }

    public final void p(int i8, int i9) {
        this.f16145i = i8;
        this.f16146j = i9;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2239bv, com.google.android.gms.internal.ads.InterfaceC1143Au
    public final ByteBuffer zzb() {
        int i8;
        if (super.e() && (i8 = this.f16150n) > 0) {
            i(i8).put(this.f16149m, 0, this.f16150n).flip();
            this.f16150n = 0;
        }
        return super.zzb();
    }
}
