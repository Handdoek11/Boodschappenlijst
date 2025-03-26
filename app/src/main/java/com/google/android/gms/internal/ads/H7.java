package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* loaded from: classes.dex */
public final class H7 extends Mx0 {

    /* renamed from: A, reason: collision with root package name */
    private Date f15644A;

    /* renamed from: B, reason: collision with root package name */
    private Date f15645B;

    /* renamed from: C, reason: collision with root package name */
    private long f15646C;

    /* renamed from: D, reason: collision with root package name */
    private long f15647D;

    /* renamed from: E, reason: collision with root package name */
    private double f15648E;

    /* renamed from: F, reason: collision with root package name */
    private float f15649F;

    /* renamed from: G, reason: collision with root package name */
    private Wx0 f15650G;

    /* renamed from: H, reason: collision with root package name */
    private long f15651H;

    public H7() {
        super("mvhd");
        this.f15648E = 1.0d;
        this.f15649F = 1.0f;
        this.f15650G = Wx0.f19911j;
    }

    @Override // com.google.android.gms.internal.ads.Jx0
    public final void b(ByteBuffer byteBuffer) {
        f(byteBuffer);
        if (e() == 1) {
            this.f15644A = Rx0.a(C7.f(byteBuffer));
            this.f15645B = Rx0.a(C7.f(byteBuffer));
            this.f15646C = C7.e(byteBuffer);
            this.f15647D = C7.f(byteBuffer);
        } else {
            this.f15644A = Rx0.a(C7.e(byteBuffer));
            this.f15645B = Rx0.a(C7.e(byteBuffer));
            this.f15646C = C7.e(byteBuffer);
            this.f15647D = C7.e(byteBuffer);
        }
        this.f15648E = C7.b(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.f15649F = ((short) ((r1[1] & 255) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        C7.d(byteBuffer);
        C7.e(byteBuffer);
        C7.e(byteBuffer);
        this.f15650G = new Wx0(C7.b(byteBuffer), C7.b(byteBuffer), C7.b(byteBuffer), C7.b(byteBuffer), C7.a(byteBuffer), C7.a(byteBuffer), C7.a(byteBuffer), C7.b(byteBuffer), C7.b(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.f15651H = C7.e(byteBuffer);
    }

    public final long g() {
        return this.f15647D;
    }

    public final long h() {
        return this.f15646C;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.f15644A + ";modificationTime=" + this.f15645B + ";timescale=" + this.f15646C + ";duration=" + this.f15647D + ";rate=" + this.f15648E + ";volume=" + this.f15649F + ";matrix=" + this.f15650G + ";nextTrackId=" + this.f15651H + "]";
    }
}
