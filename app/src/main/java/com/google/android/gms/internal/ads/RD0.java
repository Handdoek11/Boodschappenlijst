package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class RD0 extends AbstractC2239bv {

    /* renamed from: i, reason: collision with root package name */
    private int[] f18621i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f18622j;

    RD0() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1143Au
    public final void b(ByteBuffer byteBuffer) {
        int[] iArr = this.f18622j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer i8 = i(((limit - position) / this.f21000b.f28220d) * this.f21001c.f28220d);
        while (position < limit) {
            for (int i9 : iArr) {
                i8.putShort(byteBuffer.getShort(i9 + i9 + position));
            }
            position += this.f21000b.f28220d;
        }
        byteBuffer.position(limit);
        i8.flip();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2239bv
    public final C4737yt h(C4737yt c4737yt) {
        int[] iArr = this.f18621i;
        if (iArr == null) {
            return C4737yt.f28216e;
        }
        if (c4737yt.f28219c != 2) {
            throw new zzcg("Unhandled input format:", c4737yt);
        }
        boolean z7 = c4737yt.f28218b != iArr.length;
        int i8 = 0;
        while (true) {
            int length = iArr.length;
            if (i8 >= length) {
                return z7 ? new C4737yt(c4737yt.f28217a, length, 2) : C4737yt.f28216e;
            }
            int i9 = iArr[i8];
            if (i9 >= c4737yt.f28218b) {
                throw new zzcg("Unhandled input format:", c4737yt);
            }
            z7 |= i9 != i8;
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2239bv
    protected final void j() {
        this.f18622j = this.f18621i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2239bv
    protected final void l() {
        this.f18622j = null;
        this.f18621i = null;
    }

    public final void n(int[] iArr) {
        this.f18621i = iArr;
    }
}
