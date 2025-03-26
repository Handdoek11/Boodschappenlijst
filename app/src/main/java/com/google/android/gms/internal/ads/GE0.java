package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* loaded from: classes.dex */
public final class GE0 {

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f15330d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f15331e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a, reason: collision with root package name */
    private ByteBuffer f15332a = InterfaceC1143Au.f13686a;

    /* renamed from: c, reason: collision with root package name */
    private int f15334c = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f15333b = 2;

    private static final void c(ByteBuffer byteBuffer, long j8, int i8, int i9, boolean z7) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(true != z7 ? (byte) 0 : (byte) 2);
        byteBuffer.putLong(j8);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i8);
        byteBuffer.putInt(0);
        byteBuffer.put(AbstractC2107aj0.a(i9));
    }

    public final void a(C4530wy0 c4530wy0, List list) {
        int i8;
        ByteBuffer byteBuffer = c4530wy0.f27695d;
        byteBuffer.getClass();
        if (byteBuffer.limit() - c4530wy0.f27695d.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.f15333b == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        ByteBuffer byteBuffer2 = c4530wy0.f27695d;
        int position = byteBuffer2.position();
        int limit = byteBuffer2.limit();
        int i9 = limit - position;
        int i10 = (i9 + 255) / 255;
        int i11 = i10 + 27 + i9;
        if (this.f15333b == 2) {
            i8 = bArr != null ? bArr.length + 28 : 47;
            i11 += i8 + 44;
        } else {
            i8 = 0;
        }
        if (this.f15332a.capacity() < i11) {
            this.f15332a = ByteBuffer.allocate(i11).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f15332a.clear();
        }
        ByteBuffer byteBuffer3 = this.f15332a;
        if (this.f15333b == 2) {
            if (bArr != null) {
                c(byteBuffer3, 0L, 0, 1, true);
                int length = bArr.length;
                byteBuffer3.put(AbstractC2107aj0.a(length));
                byteBuffer3.put(bArr);
                int i12 = length + 28;
                byteBuffer3.putInt(22, AbstractC2301cW.x(byteBuffer3.array(), byteBuffer3.arrayOffset(), i12, 0));
                byteBuffer3.position(i12);
            } else {
                byteBuffer3.put(f15330d);
            }
            byteBuffer3.put(f15331e);
        }
        int c8 = this.f15334c + N0.c(byteBuffer2);
        this.f15334c = c8;
        c(byteBuffer3, c8, this.f15333b, i10, false);
        for (int i13 = 0; i13 < i10; i13++) {
            if (i9 >= 255) {
                byteBuffer3.put((byte) -1);
                i9 -= 255;
            } else {
                byteBuffer3.put((byte) i9);
                i9 = 0;
            }
        }
        while (position < limit) {
            byteBuffer3.put(byteBuffer2.get(position));
            position++;
        }
        byteBuffer2.position(byteBuffer2.limit());
        byteBuffer3.flip();
        if (this.f15333b == 2) {
            byteBuffer3.putInt(i8 + 66, AbstractC2301cW.x(byteBuffer3.array(), byteBuffer3.arrayOffset() + i8 + 44, byteBuffer3.limit() - byteBuffer3.position(), 0));
        } else {
            byteBuffer3.putInt(22, AbstractC2301cW.x(byteBuffer3.array(), byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0));
        }
        this.f15333b++;
        this.f15332a = byteBuffer3;
        c4530wy0.b();
        c4530wy0.j(this.f15332a.remaining());
        c4530wy0.f27695d.put(this.f15332a);
        c4530wy0.k();
    }

    public final void b() {
        this.f15332a = InterfaceC1143Au.f13686a;
        this.f15334c = 0;
        this.f15333b = 2;
    }
}
