package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class Jx0 implements D7 {

    /* renamed from: y, reason: collision with root package name */
    private static final Vx0 f16470y = Vx0.b(Jx0.class);

    /* renamed from: o, reason: collision with root package name */
    protected final String f16471o;

    /* renamed from: u, reason: collision with root package name */
    private ByteBuffer f16474u;

    /* renamed from: v, reason: collision with root package name */
    long f16475v;

    /* renamed from: x, reason: collision with root package name */
    Px0 f16477x;

    /* renamed from: w, reason: collision with root package name */
    long f16476w = -1;

    /* renamed from: t, reason: collision with root package name */
    boolean f16473t = true;

    /* renamed from: s, reason: collision with root package name */
    boolean f16472s = true;

    protected Jx0(String str) {
        this.f16471o = str;
    }

    private final synchronized void a() {
        try {
            if (this.f16473t) {
                return;
            }
            try {
                Vx0 vx0 = f16470y;
                String str = this.f16471o;
                vx0.a(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                this.f16474u = this.f16477x.v0(this.f16475v, this.f16476w);
                this.f16473t = true;
            } catch (IOException e8) {
                throw new RuntimeException(e8);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    protected abstract void b(ByteBuffer byteBuffer);

    public final synchronized void c() {
        try {
            a();
            Vx0 vx0 = f16470y;
            String str = this.f16471o;
            vx0.a(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.f16474u;
            if (byteBuffer != null) {
                this.f16472s = true;
                byteBuffer.rewind();
                b(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.slice();
                }
                this.f16474u = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.D7
    public final void d(Px0 px0, ByteBuffer byteBuffer, long j8, A7 a72) {
        this.f16475v = px0.zzb();
        byteBuffer.remaining();
        this.f16476w = j8;
        this.f16477x = px0;
        px0.b(px0.zzb() + j8);
        this.f16473t = false;
        this.f16472s = false;
        c();
    }

    @Override // com.google.android.gms.internal.ads.D7
    public final String zza() {
        return this.f16471o;
    }
}
