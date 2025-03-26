package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class IE0 extends AbstractC2239bv {

    /* renamed from: i, reason: collision with root package name */
    private static final int f15914i = Float.floatToIntBits(Float.NaN);

    IE0() {
    }

    private static void n(int i8, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i8 * 4.656612875245797E-10d));
        if (floatToIntBits == f15914i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1143Au
    public final void b(ByteBuffer byteBuffer) {
        ByteBuffer i8;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i9 = limit - position;
        int i10 = this.f21000b.f28219c;
        if (i10 == 21) {
            i8 = i((i9 / 3) * 4);
            while (position < limit) {
                n(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), i8);
                position += 3;
            }
        } else if (i10 == 22) {
            i8 = i(i9);
            while (position < limit) {
                int i11 = byteBuffer.get(position) & 255;
                int i12 = (byteBuffer.get(position + 1) & 255) << 8;
                n(i11 | i12 | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), i8);
                position += 4;
            }
        } else if (i10 == 1342177280) {
            i8 = i((i9 / 3) * 4);
            while (position < limit) {
                n(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), i8);
                position += 3;
            }
        } else {
            if (i10 != 1610612736) {
                throw new IllegalStateException();
            }
            i8 = i(i9);
            while (position < limit) {
                int i13 = byteBuffer.get(position + 3) & 255;
                int i14 = (byteBuffer.get(position + 2) & 255) << 8;
                n(i13 | i14 | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), i8);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        i8.flip();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2239bv
    public final C4737yt h(C4737yt c4737yt) {
        int i8 = c4737yt.f28219c;
        int i9 = AbstractC2301cW.f21206a;
        if (i8 == 21 || i8 == 1342177280 || i8 == 22 || i8 == 1610612736) {
            return new C4737yt(c4737yt.f28217a, c4737yt.f28218b, 4);
        }
        if (i8 == 4) {
            return C4737yt.f28216e;
        }
        throw new zzcg("Unhandled input format:", c4737yt);
    }
}
