package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* loaded from: classes.dex */
public final class FE0 extends JF0 implements Zz0 {

    /* renamed from: A0, reason: collision with root package name */
    private final ID0 f15103A0;

    /* renamed from: B0, reason: collision with root package name */
    private final MD0 f15104B0;

    /* renamed from: C0, reason: collision with root package name */
    private final C3803qF0 f15105C0;

    /* renamed from: D0, reason: collision with root package name */
    private int f15106D0;

    /* renamed from: E0, reason: collision with root package name */
    private boolean f15107E0;

    /* renamed from: F0, reason: collision with root package name */
    private boolean f15108F0;

    /* renamed from: G0, reason: collision with root package name */
    private D f15109G0;

    /* renamed from: H0, reason: collision with root package name */
    private D f15110H0;

    /* renamed from: I0, reason: collision with root package name */
    private long f15111I0;

    /* renamed from: J0, reason: collision with root package name */
    private boolean f15112J0;

    /* renamed from: K0, reason: collision with root package name */
    private boolean f15113K0;

    /* renamed from: L0, reason: collision with root package name */
    private boolean f15114L0;

    /* renamed from: M0, reason: collision with root package name */
    private int f15115M0;

    /* renamed from: z0, reason: collision with root package name */
    private final Context f15116z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FE0(Context context, InterfaceC4129tF0 interfaceC4129tF0, LF0 lf0, boolean z7, Handler handler, JD0 jd0, MD0 md0) {
        super(1, interfaceC4129tF0, lf0, false, 44100.0f);
        EE0 ee0 = null;
        C3803qF0 c3803qF0 = AbstractC2301cW.f21206a >= 35 ? new C3803qF0(InterfaceC3258lF0.f24292a) : null;
        this.f15116z0 = context.getApplicationContext();
        this.f15104B0 = md0;
        this.f15105C0 = c3803qF0;
        this.f15115M0 = -1000;
        this.f15103A0 = new ID0(handler, jd0);
        md0.p(new DE0(this, ee0));
    }

    private final int a1(C4565xF0 c4565xF0, D d8) {
        int i8;
        if (!"OMX.google.raw.decoder".equals(c4565xF0.f27773a) || (i8 = AbstractC2301cW.f21206a) >= 24 || (i8 == 23 && AbstractC2301cW.m(this.f15116z0))) {
            return d8.f14335p;
        }
        return -1;
    }

    private static List b1(LF0 lf0, D d8, boolean z7, MD0 md0) {
        C4565xF0 a8;
        return d8.f14334o == null ? AbstractC4169th0.w() : (!md0.k(d8) || (a8 = AbstractC2065aG0.a()) == null) ? AbstractC2065aG0.e(lf0, d8, false, false) : AbstractC4169th0.x(a8);
    }

    private final void v0() {
        long O7 = this.f15104B0.O(e());
        if (O7 != Long.MIN_VALUE) {
            if (!this.f15112J0) {
                O7 = Math.max(this.f15111I0, O7);
            }
            this.f15111I0 = O7;
            this.f15112J0 = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.Gy0
    protected final void B() {
        C3803qF0 c3803qF0;
        this.f15104B0.i();
        if (AbstractC2301cW.f21206a < 35 || (c3803qF0 = this.f15105C0) == null) {
            return;
        }
        c3803qF0.b();
    }

    @Override // com.google.android.gms.internal.ads.JF0
    protected final int B0(LF0 lf0, D d8) {
        int i8;
        boolean z7;
        if (!AbstractC1650Pc.g(d8.f14334o)) {
            return 128;
        }
        int i9 = d8.f14318K;
        boolean s02 = JF0.s0(d8);
        int i10 = 1;
        if (!s02 || (i9 != 0 && AbstractC2065aG0.a() == null)) {
            i8 = 0;
        } else {
            C4234uD0 q8 = this.f15104B0.q(d8);
            if (q8.f27010a) {
                i8 = true != q8.f27011b ? 512 : 1536;
                if (q8.f27012c) {
                    i8 |= 2048;
                }
            } else {
                i8 = 0;
            }
            if (this.f15104B0.k(d8)) {
                return i8 | 172;
            }
        }
        if ((!"audio/raw".equals(d8.f14334o) || this.f15104B0.k(d8)) && this.f15104B0.k(AbstractC2301cW.a(2, d8.f14311D, d8.f14312E))) {
            List b12 = b1(lf0, d8, false, this.f15104B0);
            if (!b12.isEmpty()) {
                if (s02) {
                    C4565xF0 c4565xF0 = (C4565xF0) b12.get(0);
                    boolean e8 = c4565xF0.e(d8);
                    if (e8) {
                        z7 = true;
                    } else {
                        for (int i11 = 1; i11 < b12.size(); i11++) {
                            C4565xF0 c4565xF02 = (C4565xF0) b12.get(i11);
                            if (c4565xF02.e(d8)) {
                                z7 = false;
                                e8 = true;
                                c4565xF0 = c4565xF02;
                                break;
                            }
                        }
                        z7 = true;
                    }
                    int i12 = true != e8 ? 3 : 4;
                    int i13 = 8;
                    if (e8 && c4565xF0.f(d8)) {
                        i13 = 16;
                    }
                    return i12 | i13 | 32 | (true != c4565xF0.f27779g ? 0 : 64) | (true != z7 ? 0 : 128) | i8;
                }
                i10 = 2;
            }
        }
        return i10 | 128;
    }

    @Override // com.google.android.gms.internal.ads.JF0
    protected final Iy0 C0(C4565xF0 c4565xF0, D d8, D d9) {
        int i8;
        int i9;
        Iy0 b8 = c4565xF0.b(d8, d9);
        int i10 = b8.f16080e;
        if (p0(d9)) {
            i10 |= 32768;
        }
        if (a1(c4565xF0, d9) > this.f15106D0) {
            i10 |= 64;
        }
        String str = c4565xF0.f27773a;
        if (i10 != 0) {
            i9 = i10;
            i8 = 0;
        } else {
            i8 = b8.f16079d;
            i9 = 0;
        }
        return new Iy0(str, d8, d9, i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.JF0, com.google.android.gms.internal.ads.Gy0
    protected final void D() {
        this.f15114L0 = false;
        try {
            super.D();
            if (this.f15113K0) {
                this.f15113K0 = false;
                this.f15104B0.j();
            }
        } catch (Throwable th) {
            if (this.f15113K0) {
                this.f15113K0 = false;
                this.f15104B0.j();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.JF0
    protected final Iy0 D0(Tz0 tz0) {
        D d8 = tz0.f19205a;
        d8.getClass();
        this.f15109G0 = d8;
        Iy0 D02 = super.D0(tz0);
        this.f15103A0.i(d8, D02);
        return D02;
    }

    @Override // com.google.android.gms.internal.ads.Gy0
    protected final void E() {
        this.f15104B0.f();
    }

    @Override // com.google.android.gms.internal.ads.Gy0
    protected final void G() {
        v0();
        this.f15104B0.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1  */
    @Override // com.google.android.gms.internal.ads.JF0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final com.google.android.gms.internal.ads.C4020sF0 G0(com.google.android.gms.internal.ads.C4565xF0 r8, com.google.android.gms.internal.ads.D r9, android.media.MediaCrypto r10, float r11) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.FE0.G0(com.google.android.gms.internal.ads.xF0, com.google.android.gms.internal.ads.D, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.sF0");
    }

    @Override // com.google.android.gms.internal.ads.JF0
    protected final List H0(LF0 lf0, D d8, boolean z7) {
        return AbstractC2065aG0.f(b1(lf0, d8, false, this.f15104B0), d8);
    }

    @Override // com.google.android.gms.internal.ads.JF0
    protected final void K0(C4530wy0 c4530wy0) {
        D d8;
        if (AbstractC2301cW.f21206a < 29 || (d8 = c4530wy0.f27693b) == null || !Objects.equals(d8.f14334o, "audio/opus") || !o0()) {
            return;
        }
        ByteBuffer byteBuffer = c4530wy0.f27698g;
        byteBuffer.getClass();
        D d9 = c4530wy0.f27693b;
        d9.getClass();
        int i8 = d9.f14314G;
        if (byteBuffer.remaining() == 8) {
            this.f15104B0.d(i8, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // com.google.android.gms.internal.ads.JF0
    protected final void L0(Exception exc) {
        HL.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f15103A0.a(exc);
    }

    @Override // com.google.android.gms.internal.ads.JF0
    protected final void M0(String str, C4020sF0 c4020sF0, long j8, long j9) {
        this.f15103A0.e(str, j8, j9);
    }

    @Override // com.google.android.gms.internal.ads.JF0
    protected final void N0(String str) {
        this.f15103A0.f(str);
    }

    @Override // com.google.android.gms.internal.ads.JF0
    protected final void O0(D d8, MediaFormat mediaFormat) {
        int i8;
        D d9 = this.f15110H0;
        int[] iArr = null;
        boolean z7 = true;
        if (d9 != null) {
            d8 = d9;
        } else if (Z0() != null) {
            mediaFormat.getClass();
            int F7 = "audio/raw".equals(d8.f14334o) ? d8.f14313F : (AbstractC2301cW.f21206a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? AbstractC2301cW.F(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            C2723gJ0 c2723gJ0 = new C2723gJ0();
            c2723gJ0.B("audio/raw");
            c2723gJ0.u(F7);
            c2723gJ0.g(d8.f14314G);
            c2723gJ0.h(d8.f14315H);
            c2723gJ0.t(d8.f14331l);
            c2723gJ0.m(d8.f14320a);
            c2723gJ0.o(d8.f14321b);
            c2723gJ0.p(d8.f14322c);
            c2723gJ0.q(d8.f14323d);
            c2723gJ0.D(d8.f14324e);
            c2723gJ0.y(d8.f14325f);
            c2723gJ0.r0(mediaFormat.getInteger("channel-count"));
            c2723gJ0.C(mediaFormat.getInteger("sample-rate"));
            D H7 = c2723gJ0.H();
            if (this.f15107E0 && H7.f14311D == 6 && (i8 = d8.f14311D) < 6) {
                iArr = new int[i8];
                for (int i9 = 0; i9 < d8.f14311D; i9++) {
                    iArr[i9] = i9;
                }
            } else if (this.f15108F0) {
                int i10 = H7.f14311D;
                if (i10 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i10 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i10 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i10 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i10 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
            d8 = H7;
        }
        try {
            int i11 = AbstractC2301cW.f21206a;
            if (i11 >= 29) {
                if (o0()) {
                    V();
                }
                if (i11 < 29) {
                    z7 = false;
                }
                AbstractC3796qC.f(z7);
            }
            this.f15104B0.u(d8, 0, iArr);
        } catch (zzph e8) {
            throw N(e8, e8.f28774o, false, 5001);
        }
    }

    @Override // com.google.android.gms.internal.ads.Zz0
    public final void P(C2006Zf c2006Zf) {
        this.f15104B0.m(c2006Zf);
    }

    protected final void P0() {
        this.f15112J0 = true;
    }

    @Override // com.google.android.gms.internal.ads.JF0
    protected final void Q0() {
        this.f15104B0.g();
    }

    @Override // com.google.android.gms.internal.ads.JF0
    protected final void R0() {
        try {
            this.f15104B0.h();
        } catch (zzpl e8) {
            throw N(e8, e8.f28779t, e8.f28778s, true != o0() ? 5002 : 5003);
        }
    }

    @Override // com.google.android.gms.internal.ads.JF0
    protected final boolean S0(long j8, long j9, InterfaceC4347vF0 interfaceC4347vF0, ByteBuffer byteBuffer, int i8, int i9, int i10, long j10, boolean z7, boolean z8, D d8) {
        byteBuffer.getClass();
        if (this.f15110H0 != null && (i9 & 2) != 0) {
            interfaceC4347vF0.getClass();
            interfaceC4347vF0.j(i8, false);
            return true;
        }
        if (z7) {
            if (interfaceC4347vF0 != null) {
                interfaceC4347vF0.j(i8, false);
            }
            this.f16200s0.f15829f += i10;
            this.f15104B0.g();
            return true;
        }
        try {
            if (!this.f15104B0.r(byteBuffer, j10, i10)) {
                return false;
            }
            if (interfaceC4347vF0 != null) {
                interfaceC4347vF0.j(i8, false);
            }
            this.f16200s0.f15828e += i10;
            return true;
        } catch (zzpi e8) {
            D d9 = this.f15109G0;
            if (o0()) {
                V();
            }
            throw N(e8, d9, e8.f28776s, 5001);
        } catch (zzpl e9) {
            if (o0()) {
                V();
            }
            throw N(e9, d8, e9.f28778s, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.JF0
    protected final boolean T0(D d8) {
        V();
        return this.f15104B0.k(d8);
    }

    @Override // com.google.android.gms.internal.ads.JF0, com.google.android.gms.internal.ads.Gy0
    protected final void X() {
        this.f15113K0 = true;
        this.f15109G0 = null;
        try {
            this.f15104B0.c();
            super.X();
        } catch (Throwable th) {
            super.X();
            throw th;
        } finally {
            this.f15103A0.g(this.f16200s0);
        }
    }

    @Override // com.google.android.gms.internal.ads.JF0, com.google.android.gms.internal.ads.InterfaceC4773zA0
    public final boolean Y() {
        return this.f15104B0.V() || super.Y();
    }

    @Override // com.google.android.gms.internal.ads.JF0, com.google.android.gms.internal.ads.Gy0
    protected final void Z(boolean z7, boolean z8) {
        super.Z(z7, z8);
        this.f15103A0.h(this.f16200s0);
        V();
        this.f15104B0.s(W());
        this.f15104B0.t(T());
    }

    @Override // com.google.android.gms.internal.ads.Zz0
    public final C2006Zf a() {
        return this.f15104B0.a();
    }

    @Override // com.google.android.gms.internal.ads.JF0, com.google.android.gms.internal.ads.Gy0
    protected final void a0(long j8, boolean z7) {
        super.a0(j8, z7);
        this.f15104B0.c();
        this.f15111I0 = j8;
        this.f15114L0 = false;
        this.f15112J0 = true;
    }

    @Override // com.google.android.gms.internal.ads.JF0
    protected final float b0(float f8, D d8, D[] dArr) {
        int i8 = -1;
        for (D d9 : dArr) {
            int i9 = d9.f14312E;
            if (i9 != -1) {
                i8 = Math.max(i8, i9);
            }
        }
        if (i8 == -1) {
            return -1.0f;
        }
        return i8 * f8;
    }

    @Override // com.google.android.gms.internal.ads.JF0, com.google.android.gms.internal.ads.InterfaceC4773zA0
    public final boolean e() {
        return super.e() && this.f15104B0.I();
    }

    @Override // com.google.android.gms.internal.ads.Zz0
    public final boolean h() {
        boolean z7 = this.f15114L0;
        this.f15114L0 = false;
        return z7;
    }

    @Override // com.google.android.gms.internal.ads.Gy0, com.google.android.gms.internal.ads.InterfaceC4773zA0
    public final Zz0 j() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4773zA0, com.google.android.gms.internal.ads.CA0
    public final String u() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.JF0, com.google.android.gms.internal.ads.InterfaceC4228uA0
    public final void x(int i8, Object obj) {
        C3803qF0 c3803qF0;
        if (i8 == 2) {
            MD0 md0 = this.f15104B0;
            obj.getClass();
            md0.l(((Float) obj).floatValue());
            return;
        }
        if (i8 == 3) {
            WR wr = (WR) obj;
            MD0 md02 = this.f15104B0;
            wr.getClass();
            md02.v(wr);
            return;
        }
        if (i8 == 6) {
            C4763z50 c4763z50 = (C4763z50) obj;
            MD0 md03 = this.f15104B0;
            c4763z50.getClass();
            md03.o(c4763z50);
            return;
        }
        if (i8 == 12) {
            if (AbstractC2301cW.f21206a >= 23) {
                this.f15104B0.n((AudioDeviceInfo) obj);
                return;
            }
            return;
        }
        if (i8 == 16) {
            obj.getClass();
            this.f15115M0 = ((Integer) obj).intValue();
            InterfaceC4347vF0 Z02 = Z0();
            if (Z02 == null || AbstractC2301cW.f21206a < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f15115M0));
            Z02.T(bundle);
            return;
        }
        if (i8 == 9) {
            MD0 md04 = this.f15104B0;
            obj.getClass();
            md04.S(((Boolean) obj).booleanValue());
        } else {
            if (i8 != 10) {
                super.x(i8, obj);
                return;
            }
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            this.f15104B0.x(intValue);
            if (AbstractC2301cW.f21206a < 35 || (c3803qF0 = this.f15105C0) == null) {
                return;
            }
            c3803qF0.d(intValue);
        }
    }

    @Override // com.google.android.gms.internal.ads.Zz0
    public final long zza() {
        if (d() == 2) {
            v0();
        }
        return this.f15111I0;
    }
}
