package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;

/* loaded from: classes.dex */
public abstract class JF0 extends Gy0 {

    /* renamed from: y0, reason: collision with root package name */
    private static final byte[] f16153y0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A, reason: collision with root package name */
    private final GE0 f16154A;

    /* renamed from: B, reason: collision with root package name */
    private D f16155B;

    /* renamed from: C, reason: collision with root package name */
    private D f16156C;

    /* renamed from: D, reason: collision with root package name */
    private InterfaceC4664yA0 f16157D;

    /* renamed from: E, reason: collision with root package name */
    private MediaCrypto f16158E;

    /* renamed from: F, reason: collision with root package name */
    private float f16159F;

    /* renamed from: G, reason: collision with root package name */
    private float f16160G;

    /* renamed from: H, reason: collision with root package name */
    private InterfaceC4347vF0 f16161H;

    /* renamed from: I, reason: collision with root package name */
    private D f16162I;

    /* renamed from: J, reason: collision with root package name */
    private MediaFormat f16163J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f16164K;

    /* renamed from: L, reason: collision with root package name */
    private float f16165L;

    /* renamed from: M, reason: collision with root package name */
    private ArrayDeque f16166M;

    /* renamed from: N, reason: collision with root package name */
    private zzsj f16167N;

    /* renamed from: O, reason: collision with root package name */
    private C4565xF0 f16168O;

    /* renamed from: P, reason: collision with root package name */
    private int f16169P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f16170Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f16171R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f16172S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f16173T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f16174U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f16175V;

    /* renamed from: W, reason: collision with root package name */
    private long f16176W;

    /* renamed from: X, reason: collision with root package name */
    private long f16177X;

    /* renamed from: Y, reason: collision with root package name */
    private int f16178Y;

    /* renamed from: Z, reason: collision with root package name */
    private int f16179Z;

    /* renamed from: a0, reason: collision with root package name */
    private ByteBuffer f16180a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f16181b0;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f16182c0;

    /* renamed from: d0, reason: collision with root package name */
    private boolean f16183d0;

    /* renamed from: e0, reason: collision with root package name */
    private boolean f16184e0;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f16185f0;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f16186g0;

    /* renamed from: h0, reason: collision with root package name */
    private int f16187h0;

    /* renamed from: i0, reason: collision with root package name */
    private int f16188i0;

    /* renamed from: j0, reason: collision with root package name */
    private int f16189j0;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f16190k0;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f16191l0;

    /* renamed from: m0, reason: collision with root package name */
    private boolean f16192m0;

    /* renamed from: n0, reason: collision with root package name */
    private long f16193n0;

    /* renamed from: o0, reason: collision with root package name */
    private long f16194o0;

    /* renamed from: p0, reason: collision with root package name */
    private boolean f16195p0;

    /* renamed from: q0, reason: collision with root package name */
    private boolean f16196q0;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC4129tF0 f16197r;

    /* renamed from: r0, reason: collision with root package name */
    private boolean f16198r0;

    /* renamed from: s, reason: collision with root package name */
    private final LF0 f16199s;

    /* renamed from: s0, reason: collision with root package name */
    protected Hy0 f16200s0;

    /* renamed from: t, reason: collision with root package name */
    private final float f16201t;

    /* renamed from: t0, reason: collision with root package name */
    private GF0 f16202t0;

    /* renamed from: u, reason: collision with root package name */
    private final C4530wy0 f16203u;

    /* renamed from: u0, reason: collision with root package name */
    private long f16204u0;

    /* renamed from: v, reason: collision with root package name */
    private final C4530wy0 f16205v;

    /* renamed from: v0, reason: collision with root package name */
    private boolean f16206v0;

    /* renamed from: w, reason: collision with root package name */
    private final C4530wy0 f16207w;

    /* renamed from: w0, reason: collision with root package name */
    private SE0 f16208w0;

    /* renamed from: x, reason: collision with root package name */
    private final C2824hF0 f16209x;

    /* renamed from: x0, reason: collision with root package name */
    private SE0 f16210x0;

    /* renamed from: y, reason: collision with root package name */
    private final MediaCodec.BufferInfo f16211y;

    /* renamed from: z, reason: collision with root package name */
    private final ArrayDeque f16212z;

    public JF0(int i8, InterfaceC4129tF0 interfaceC4129tF0, LF0 lf0, boolean z7, float f8) {
        super(i8);
        this.f16197r = interfaceC4129tF0;
        this.f16199s = lf0;
        this.f16201t = f8;
        this.f16203u = new C4530wy0(0, 0);
        this.f16205v = new C4530wy0(0, 0);
        this.f16207w = new C4530wy0(2, 0);
        C2824hF0 c2824hF0 = new C2824hF0();
        this.f16209x = c2824hF0;
        this.f16211y = new MediaCodec.BufferInfo();
        this.f16159F = 1.0f;
        this.f16160G = 1.0f;
        this.f16212z = new ArrayDeque();
        this.f16202t0 = GF0.f15335e;
        c2824hF0.j(0);
        c2824hF0.f27695d.order(ByteOrder.nativeOrder());
        this.f16154A = new GE0();
        this.f16165L = -1.0f;
        this.f16169P = 0;
        this.f16187h0 = 0;
        this.f16178Y = -1;
        this.f16179Z = -1;
        this.f16177X = -9223372036854775807L;
        this.f16193n0 = -9223372036854775807L;
        this.f16194o0 = -9223372036854775807L;
        this.f16204u0 = -9223372036854775807L;
        this.f16176W = -9223372036854775807L;
        this.f16188i0 = 0;
        this.f16189j0 = 0;
        this.f16200s0 = new Hy0();
    }

    private final boolean A0(D d8) {
        if (AbstractC2301cW.f21206a >= 23 && this.f16161H != null && this.f16189j0 != 3 && d() != 0) {
            float f8 = this.f16160G;
            d8.getClass();
            float b02 = b0(f8, d8, K());
            float f9 = this.f16165L;
            if (f9 != b02) {
                if (b02 == -1.0f) {
                    F0();
                    return false;
                }
                if (f9 != -1.0f || b02 > this.f16201t) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", b02);
                    InterfaceC4347vF0 interfaceC4347vF0 = this.f16161H;
                    interfaceC4347vF0.getClass();
                    interfaceC4347vF0.T(bundle);
                    this.f16165L = b02;
                }
            }
        }
        return true;
    }

    private final void E0() {
        this.f16185f0 = false;
        this.f16209x.b();
        this.f16207w.b();
        this.f16184e0 = false;
        this.f16183d0 = false;
        this.f16154A.b();
    }

    private final void F0() {
        if (this.f16190k0) {
            this.f16188i0 = 1;
            this.f16189j0 = 3;
        } else {
            j0();
            f0();
        }
    }

    private final void I0() {
        try {
            InterfaceC4347vF0 interfaceC4347vF0 = this.f16161H;
            AbstractC3796qC.b(interfaceC4347vF0);
            interfaceC4347vF0.h();
        } finally {
            k0();
        }
    }

    private final void J0() {
        int i8 = this.f16189j0;
        if (i8 == 1) {
            I0();
            return;
        }
        if (i8 == 2) {
            I0();
            v0();
        } else if (i8 != 3) {
            this.f16196q0 = true;
            R0();
        } else {
            j0();
            f0();
        }
    }

    private final void P0() {
        this.f16178Y = -1;
        this.f16205v.f27695d = null;
    }

    protected static boolean s0(D d8) {
        return d8.f14318K == 0;
    }

    private final void t0() {
        this.f16179Z = -1;
        this.f16180a0 = null;
    }

    private final void u0(GF0 gf0) {
        this.f16202t0 = gf0;
        if (gf0.f15338c != -9223372036854775807L) {
            this.f16206v0 = true;
        }
    }

    private final void v0() {
        SE0 se0 = this.f16210x0;
        se0.getClass();
        this.f16208w0 = se0;
        this.f16188i0 = 0;
        this.f16189j0 = 0;
    }

    private final boolean w0() {
        if (this.f16190k0) {
            this.f16188i0 = 1;
            if (this.f16171R) {
                this.f16189j0 = 3;
                return false;
            }
            this.f16189j0 = 2;
        } else {
            v0();
        }
        return true;
    }

    private final boolean x0() {
        return this.f16179Z >= 0;
    }

    private final boolean y0(long j8, long j9) {
        if (j9 >= j8) {
            return false;
        }
        D d8 = this.f16156C;
        if (d8 == null || !Objects.equals(d8.f14334o, "audio/opus")) {
            return true;
        }
        return !N0.f(j8, j9);
    }

    private final boolean z0(int i8) {
        C4530wy0 c4530wy0 = this.f16203u;
        Tz0 U7 = U();
        c4530wy0.b();
        int M7 = M(U7, this.f16203u, i8 | 4);
        if (M7 == -5) {
            D0(U7);
            return true;
        }
        if (M7 != -4 || !this.f16203u.f()) {
            return false;
        }
        this.f16195p0 = true;
        J0();
        return false;
    }

    protected abstract int B0(LF0 lf0, D d8);

    protected abstract Iy0 C0(C4565xF0 c4565xF0, D d8, D d9);

    @Override // com.google.android.gms.internal.ads.Gy0
    protected void D() {
        try {
            E0();
            j0();
        } finally {
            this.f16210x0 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected com.google.android.gms.internal.ads.Iy0 D0(com.google.android.gms.internal.ads.Tz0 r12) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.JF0.D0(com.google.android.gms.internal.ads.Tz0):com.google.android.gms.internal.ads.Iy0");
    }

    protected abstract C4020sF0 G0(C4565xF0 c4565xF0, D d8, MediaCrypto mediaCrypto, float f8);

    protected abstract List H0(LF0 lf0, D d8, boolean z7);

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r5 >= r1) goto L14;
     */
    @Override // com.google.android.gms.internal.ads.Gy0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void I(com.google.android.gms.internal.ads.D[] r13, long r14, long r16, com.google.android.gms.internal.ads.GG0 r18) {
        /*
            r12 = this;
            r0 = r12
            com.google.android.gms.internal.ads.GF0 r1 = r0.f16202t0
            long r1 = r1.f15338c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L20
            com.google.android.gms.internal.ads.GF0 r1 = new com.google.android.gms.internal.ads.GF0
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.u0(r1)
            return
        L20:
            java.util.ArrayDeque r1 = r0.f16212z
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L55
            long r1 = r0.f16193n0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L38
            long r5 = r0.f16204u0
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L55
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto L55
        L38:
            com.google.android.gms.internal.ads.GF0 r1 = new com.google.android.gms.internal.ads.GF0
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.u0(r1)
            com.google.android.gms.internal.ads.GF0 r1 = r0.f16202t0
            long r1 = r1.f15338c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L54
            r12.Q0()
        L54:
            return
        L55:
            java.util.ArrayDeque r1 = r0.f16212z
            com.google.android.gms.internal.ads.GF0 r9 = new com.google.android.gms.internal.ads.GF0
            long r3 = r0.f16193n0
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.JF0.I(com.google.android.gms.internal.ads.D[], long, long, com.google.android.gms.internal.ads.GG0):void");
    }

    protected abstract void K0(C4530wy0 c4530wy0);

    protected abstract void L0(Exception exc);

    protected abstract void M0(String str, C4020sF0 c4020sF0, long j8, long j9);

    protected abstract void N0(String str);

    protected abstract void O0(D d8, MediaFormat mediaFormat);

    protected abstract void Q0();

    protected void R0() {
    }

    protected abstract boolean S0(long j8, long j9, InterfaceC4347vF0 interfaceC4347vF0, ByteBuffer byteBuffer, int i8, int i9, int i10, long j10, boolean z7, boolean z8, D d8);

    protected boolean T0(D d8) {
        return false;
    }

    protected final float U0() {
        return this.f16159F;
    }

    protected int V0(C4530wy0 c4530wy0) {
        return 0;
    }

    protected final long W0() {
        return this.f16202t0.f15338c;
    }

    @Override // com.google.android.gms.internal.ads.Gy0
    protected void X() {
        this.f16155B = null;
        u0(GF0.f15335e);
        this.f16212z.clear();
        n0();
    }

    protected final long X0() {
        return this.f16202t0.f15337b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4773zA0
    public boolean Y() {
        if (this.f16155B == null) {
            return false;
        }
        if (J() || x0()) {
            return true;
        }
        return this.f16177X != -9223372036854775807L && T().zzb() < this.f16177X;
    }

    @Override // com.google.android.gms.internal.ads.Gy0
    protected void Z(boolean z7, boolean z8) {
        this.f16200s0 = new Hy0();
    }

    protected final InterfaceC4347vF0 Z0() {
        return this.f16161H;
    }

    @Override // com.google.android.gms.internal.ads.Gy0
    protected void a0(long j8, boolean z7) {
        this.f16195p0 = false;
        this.f16196q0 = false;
        if (this.f16183d0) {
            this.f16209x.b();
            this.f16207w.b();
            this.f16184e0 = false;
            this.f16154A.b();
        } else {
            m0();
        }
        C2082aU c2082aU = this.f16202t0.f15339d;
        if (c2082aU.a() > 0) {
            this.f16198r0 = true;
        }
        c2082aU.e();
        this.f16212z.clear();
    }

    @Override // com.google.android.gms.internal.ads.CA0
    public final int b() {
        return 8;
    }

    protected abstract float b0(float f8, D d8, D[] dArr);

    protected zzsf c0(Throwable th, C4565xF0 c4565xF0) {
        return new zzsf(th, c4565xF0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4773zA0
    public boolean e() {
        return this.f16196q0;
    }

    protected final C4565xF0 e0() {
        return this.f16168O;
    }

    @Override // com.google.android.gms.internal.ads.CA0
    public final int f(D d8) {
        try {
            return B0(this.f16199s, d8);
        } catch (zzsu e8) {
            throw N(e8, d8, false, 4002);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0298 A[Catch: Exception -> 0x01cf, TryCatch #0 {Exception -> 0x01cf, blocks: (B:93:0x01b4, B:95:0x01b8, B:97:0x01c6, B:116:0x0230, B:103:0x01d8, B:105:0x01e0, B:106:0x01e6, B:108:0x01ee, B:109:0x01f4, B:111:0x01fc, B:112:0x0202, B:114:0x020a, B:115:0x0210, B:117:0x0237, B:123:0x0255, B:125:0x025a, B:127:0x025e, B:128:0x0272, B:130:0x0276, B:132:0x027c, B:134:0x0282, B:135:0x0290, B:137:0x0298, B:138:0x02a2, B:140:0x02a7, B:141:0x02b1, B:143:0x02b6, B:144:0x02c0, B:146:0x02c4, B:147:0x02ce, B:150:0x02d8, B:151:0x02ee, B:153:0x02f2, B:155:0x0303, B:156:0x0308, B:158:0x030c, B:159:0x0311, B:160:0x0317, B:162:0x031e, B:164:0x032f, B:165:0x0334, B:167:0x0339, B:168:0x033e, B:170:0x0342, B:171:0x0347, B:173:0x034b, B:174:0x0350, B:176:0x0354, B:177:0x0359, B:179:0x035f, B:180:0x0364, B:182:0x0368, B:183:0x036d, B:185:0x0371, B:186:0x0376, B:188:0x037a, B:189:0x037f, B:191:0x0383, B:192:0x0388, B:194:0x038c, B:195:0x0391, B:197:0x0395, B:198:0x039a, B:200:0x039e, B:201:0x03a3, B:203:0x03a7, B:204:0x03ac, B:206:0x03b0, B:207:0x03b5, B:209:0x03b8, B:210:0x03bd, B:211:0x03c3, B:213:0x03c8, B:214:0x03d2, B:218:0x03f6, B:220:0x0402, B:222:0x040a, B:224:0x0414, B:226:0x041c, B:228:0x0424, B:248:0x0468, B:250:0x046e, B:254:0x0479, B:256:0x047f, B:260:0x048a, B:262:0x0490, B:266:0x049b, B:268:0x04a1, B:293:0x04f8, B:295:0x04fe, B:273:0x04ae, B:275:0x04b6, B:277:0x04be, B:279:0x04c6, B:281:0x04ce, B:283:0x04d6, B:285:0x04de, B:287:0x04e8, B:289:0x04f2, B:233:0x0432, B:235:0x043a, B:239:0x0445, B:241:0x044f, B:243:0x0457, B:245:0x045f), top: B:342:0x01b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02a7 A[Catch: Exception -> 0x01cf, TryCatch #0 {Exception -> 0x01cf, blocks: (B:93:0x01b4, B:95:0x01b8, B:97:0x01c6, B:116:0x0230, B:103:0x01d8, B:105:0x01e0, B:106:0x01e6, B:108:0x01ee, B:109:0x01f4, B:111:0x01fc, B:112:0x0202, B:114:0x020a, B:115:0x0210, B:117:0x0237, B:123:0x0255, B:125:0x025a, B:127:0x025e, B:128:0x0272, B:130:0x0276, B:132:0x027c, B:134:0x0282, B:135:0x0290, B:137:0x0298, B:138:0x02a2, B:140:0x02a7, B:141:0x02b1, B:143:0x02b6, B:144:0x02c0, B:146:0x02c4, B:147:0x02ce, B:150:0x02d8, B:151:0x02ee, B:153:0x02f2, B:155:0x0303, B:156:0x0308, B:158:0x030c, B:159:0x0311, B:160:0x0317, B:162:0x031e, B:164:0x032f, B:165:0x0334, B:167:0x0339, B:168:0x033e, B:170:0x0342, B:171:0x0347, B:173:0x034b, B:174:0x0350, B:176:0x0354, B:177:0x0359, B:179:0x035f, B:180:0x0364, B:182:0x0368, B:183:0x036d, B:185:0x0371, B:186:0x0376, B:188:0x037a, B:189:0x037f, B:191:0x0383, B:192:0x0388, B:194:0x038c, B:195:0x0391, B:197:0x0395, B:198:0x039a, B:200:0x039e, B:201:0x03a3, B:203:0x03a7, B:204:0x03ac, B:206:0x03b0, B:207:0x03b5, B:209:0x03b8, B:210:0x03bd, B:211:0x03c3, B:213:0x03c8, B:214:0x03d2, B:218:0x03f6, B:220:0x0402, B:222:0x040a, B:224:0x0414, B:226:0x041c, B:228:0x0424, B:248:0x0468, B:250:0x046e, B:254:0x0479, B:256:0x047f, B:260:0x048a, B:262:0x0490, B:266:0x049b, B:268:0x04a1, B:293:0x04f8, B:295:0x04fe, B:273:0x04ae, B:275:0x04b6, B:277:0x04be, B:279:0x04c6, B:281:0x04ce, B:283:0x04d6, B:285:0x04de, B:287:0x04e8, B:289:0x04f2, B:233:0x0432, B:235:0x043a, B:239:0x0445, B:241:0x044f, B:243:0x0457, B:245:0x045f), top: B:342:0x01b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02b6 A[Catch: Exception -> 0x01cf, TryCatch #0 {Exception -> 0x01cf, blocks: (B:93:0x01b4, B:95:0x01b8, B:97:0x01c6, B:116:0x0230, B:103:0x01d8, B:105:0x01e0, B:106:0x01e6, B:108:0x01ee, B:109:0x01f4, B:111:0x01fc, B:112:0x0202, B:114:0x020a, B:115:0x0210, B:117:0x0237, B:123:0x0255, B:125:0x025a, B:127:0x025e, B:128:0x0272, B:130:0x0276, B:132:0x027c, B:134:0x0282, B:135:0x0290, B:137:0x0298, B:138:0x02a2, B:140:0x02a7, B:141:0x02b1, B:143:0x02b6, B:144:0x02c0, B:146:0x02c4, B:147:0x02ce, B:150:0x02d8, B:151:0x02ee, B:153:0x02f2, B:155:0x0303, B:156:0x0308, B:158:0x030c, B:159:0x0311, B:160:0x0317, B:162:0x031e, B:164:0x032f, B:165:0x0334, B:167:0x0339, B:168:0x033e, B:170:0x0342, B:171:0x0347, B:173:0x034b, B:174:0x0350, B:176:0x0354, B:177:0x0359, B:179:0x035f, B:180:0x0364, B:182:0x0368, B:183:0x036d, B:185:0x0371, B:186:0x0376, B:188:0x037a, B:189:0x037f, B:191:0x0383, B:192:0x0388, B:194:0x038c, B:195:0x0391, B:197:0x0395, B:198:0x039a, B:200:0x039e, B:201:0x03a3, B:203:0x03a7, B:204:0x03ac, B:206:0x03b0, B:207:0x03b5, B:209:0x03b8, B:210:0x03bd, B:211:0x03c3, B:213:0x03c8, B:214:0x03d2, B:218:0x03f6, B:220:0x0402, B:222:0x040a, B:224:0x0414, B:226:0x041c, B:228:0x0424, B:248:0x0468, B:250:0x046e, B:254:0x0479, B:256:0x047f, B:260:0x048a, B:262:0x0490, B:266:0x049b, B:268:0x04a1, B:293:0x04f8, B:295:0x04fe, B:273:0x04ae, B:275:0x04b6, B:277:0x04be, B:279:0x04c6, B:281:0x04ce, B:283:0x04d6, B:285:0x04de, B:287:0x04e8, B:289:0x04f2, B:233:0x0432, B:235:0x043a, B:239:0x0445, B:241:0x044f, B:243:0x0457, B:245:0x045f), top: B:342:0x01b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02c4 A[Catch: Exception -> 0x01cf, TryCatch #0 {Exception -> 0x01cf, blocks: (B:93:0x01b4, B:95:0x01b8, B:97:0x01c6, B:116:0x0230, B:103:0x01d8, B:105:0x01e0, B:106:0x01e6, B:108:0x01ee, B:109:0x01f4, B:111:0x01fc, B:112:0x0202, B:114:0x020a, B:115:0x0210, B:117:0x0237, B:123:0x0255, B:125:0x025a, B:127:0x025e, B:128:0x0272, B:130:0x0276, B:132:0x027c, B:134:0x0282, B:135:0x0290, B:137:0x0298, B:138:0x02a2, B:140:0x02a7, B:141:0x02b1, B:143:0x02b6, B:144:0x02c0, B:146:0x02c4, B:147:0x02ce, B:150:0x02d8, B:151:0x02ee, B:153:0x02f2, B:155:0x0303, B:156:0x0308, B:158:0x030c, B:159:0x0311, B:160:0x0317, B:162:0x031e, B:164:0x032f, B:165:0x0334, B:167:0x0339, B:168:0x033e, B:170:0x0342, B:171:0x0347, B:173:0x034b, B:174:0x0350, B:176:0x0354, B:177:0x0359, B:179:0x035f, B:180:0x0364, B:182:0x0368, B:183:0x036d, B:185:0x0371, B:186:0x0376, B:188:0x037a, B:189:0x037f, B:191:0x0383, B:192:0x0388, B:194:0x038c, B:195:0x0391, B:197:0x0395, B:198:0x039a, B:200:0x039e, B:201:0x03a3, B:203:0x03a7, B:204:0x03ac, B:206:0x03b0, B:207:0x03b5, B:209:0x03b8, B:210:0x03bd, B:211:0x03c3, B:213:0x03c8, B:214:0x03d2, B:218:0x03f6, B:220:0x0402, B:222:0x040a, B:224:0x0414, B:226:0x041c, B:228:0x0424, B:248:0x0468, B:250:0x046e, B:254:0x0479, B:256:0x047f, B:260:0x048a, B:262:0x0490, B:266:0x049b, B:268:0x04a1, B:293:0x04f8, B:295:0x04fe, B:273:0x04ae, B:275:0x04b6, B:277:0x04be, B:279:0x04c6, B:281:0x04ce, B:283:0x04d6, B:285:0x04de, B:287:0x04e8, B:289:0x04f2, B:233:0x0432, B:235:0x043a, B:239:0x0445, B:241:0x044f, B:243:0x0457, B:245:0x045f), top: B:342:0x01b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02d8 A[Catch: Exception -> 0x01cf, TRY_ENTER, TryCatch #0 {Exception -> 0x01cf, blocks: (B:93:0x01b4, B:95:0x01b8, B:97:0x01c6, B:116:0x0230, B:103:0x01d8, B:105:0x01e0, B:106:0x01e6, B:108:0x01ee, B:109:0x01f4, B:111:0x01fc, B:112:0x0202, B:114:0x020a, B:115:0x0210, B:117:0x0237, B:123:0x0255, B:125:0x025a, B:127:0x025e, B:128:0x0272, B:130:0x0276, B:132:0x027c, B:134:0x0282, B:135:0x0290, B:137:0x0298, B:138:0x02a2, B:140:0x02a7, B:141:0x02b1, B:143:0x02b6, B:144:0x02c0, B:146:0x02c4, B:147:0x02ce, B:150:0x02d8, B:151:0x02ee, B:153:0x02f2, B:155:0x0303, B:156:0x0308, B:158:0x030c, B:159:0x0311, B:160:0x0317, B:162:0x031e, B:164:0x032f, B:165:0x0334, B:167:0x0339, B:168:0x033e, B:170:0x0342, B:171:0x0347, B:173:0x034b, B:174:0x0350, B:176:0x0354, B:177:0x0359, B:179:0x035f, B:180:0x0364, B:182:0x0368, B:183:0x036d, B:185:0x0371, B:186:0x0376, B:188:0x037a, B:189:0x037f, B:191:0x0383, B:192:0x0388, B:194:0x038c, B:195:0x0391, B:197:0x0395, B:198:0x039a, B:200:0x039e, B:201:0x03a3, B:203:0x03a7, B:204:0x03ac, B:206:0x03b0, B:207:0x03b5, B:209:0x03b8, B:210:0x03bd, B:211:0x03c3, B:213:0x03c8, B:214:0x03d2, B:218:0x03f6, B:220:0x0402, B:222:0x040a, B:224:0x0414, B:226:0x041c, B:228:0x0424, B:248:0x0468, B:250:0x046e, B:254:0x0479, B:256:0x047f, B:260:0x048a, B:262:0x0490, B:266:0x049b, B:268:0x04a1, B:293:0x04f8, B:295:0x04fe, B:273:0x04ae, B:275:0x04b6, B:277:0x04be, B:279:0x04c6, B:281:0x04ce, B:283:0x04d6, B:285:0x04de, B:287:0x04e8, B:289:0x04f2, B:233:0x0432, B:235:0x043a, B:239:0x0445, B:241:0x044f, B:243:0x0457, B:245:0x045f), top: B:342:0x01b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02f2 A[Catch: Exception -> 0x01cf, TryCatch #0 {Exception -> 0x01cf, blocks: (B:93:0x01b4, B:95:0x01b8, B:97:0x01c6, B:116:0x0230, B:103:0x01d8, B:105:0x01e0, B:106:0x01e6, B:108:0x01ee, B:109:0x01f4, B:111:0x01fc, B:112:0x0202, B:114:0x020a, B:115:0x0210, B:117:0x0237, B:123:0x0255, B:125:0x025a, B:127:0x025e, B:128:0x0272, B:130:0x0276, B:132:0x027c, B:134:0x0282, B:135:0x0290, B:137:0x0298, B:138:0x02a2, B:140:0x02a7, B:141:0x02b1, B:143:0x02b6, B:144:0x02c0, B:146:0x02c4, B:147:0x02ce, B:150:0x02d8, B:151:0x02ee, B:153:0x02f2, B:155:0x0303, B:156:0x0308, B:158:0x030c, B:159:0x0311, B:160:0x0317, B:162:0x031e, B:164:0x032f, B:165:0x0334, B:167:0x0339, B:168:0x033e, B:170:0x0342, B:171:0x0347, B:173:0x034b, B:174:0x0350, B:176:0x0354, B:177:0x0359, B:179:0x035f, B:180:0x0364, B:182:0x0368, B:183:0x036d, B:185:0x0371, B:186:0x0376, B:188:0x037a, B:189:0x037f, B:191:0x0383, B:192:0x0388, B:194:0x038c, B:195:0x0391, B:197:0x0395, B:198:0x039a, B:200:0x039e, B:201:0x03a3, B:203:0x03a7, B:204:0x03ac, B:206:0x03b0, B:207:0x03b5, B:209:0x03b8, B:210:0x03bd, B:211:0x03c3, B:213:0x03c8, B:214:0x03d2, B:218:0x03f6, B:220:0x0402, B:222:0x040a, B:224:0x0414, B:226:0x041c, B:228:0x0424, B:248:0x0468, B:250:0x046e, B:254:0x0479, B:256:0x047f, B:260:0x048a, B:262:0x0490, B:266:0x049b, B:268:0x04a1, B:293:0x04f8, B:295:0x04fe, B:273:0x04ae, B:275:0x04b6, B:277:0x04be, B:279:0x04c6, B:281:0x04ce, B:283:0x04d6, B:285:0x04de, B:287:0x04e8, B:289:0x04f2, B:233:0x0432, B:235:0x043a, B:239:0x0445, B:241:0x044f, B:243:0x0457, B:245:0x045f), top: B:342:0x01b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x031e A[Catch: Exception -> 0x01cf, TryCatch #0 {Exception -> 0x01cf, blocks: (B:93:0x01b4, B:95:0x01b8, B:97:0x01c6, B:116:0x0230, B:103:0x01d8, B:105:0x01e0, B:106:0x01e6, B:108:0x01ee, B:109:0x01f4, B:111:0x01fc, B:112:0x0202, B:114:0x020a, B:115:0x0210, B:117:0x0237, B:123:0x0255, B:125:0x025a, B:127:0x025e, B:128:0x0272, B:130:0x0276, B:132:0x027c, B:134:0x0282, B:135:0x0290, B:137:0x0298, B:138:0x02a2, B:140:0x02a7, B:141:0x02b1, B:143:0x02b6, B:144:0x02c0, B:146:0x02c4, B:147:0x02ce, B:150:0x02d8, B:151:0x02ee, B:153:0x02f2, B:155:0x0303, B:156:0x0308, B:158:0x030c, B:159:0x0311, B:160:0x0317, B:162:0x031e, B:164:0x032f, B:165:0x0334, B:167:0x0339, B:168:0x033e, B:170:0x0342, B:171:0x0347, B:173:0x034b, B:174:0x0350, B:176:0x0354, B:177:0x0359, B:179:0x035f, B:180:0x0364, B:182:0x0368, B:183:0x036d, B:185:0x0371, B:186:0x0376, B:188:0x037a, B:189:0x037f, B:191:0x0383, B:192:0x0388, B:194:0x038c, B:195:0x0391, B:197:0x0395, B:198:0x039a, B:200:0x039e, B:201:0x03a3, B:203:0x03a7, B:204:0x03ac, B:206:0x03b0, B:207:0x03b5, B:209:0x03b8, B:210:0x03bd, B:211:0x03c3, B:213:0x03c8, B:214:0x03d2, B:218:0x03f6, B:220:0x0402, B:222:0x040a, B:224:0x0414, B:226:0x041c, B:228:0x0424, B:248:0x0468, B:250:0x046e, B:254:0x0479, B:256:0x047f, B:260:0x048a, B:262:0x0490, B:266:0x049b, B:268:0x04a1, B:293:0x04f8, B:295:0x04fe, B:273:0x04ae, B:275:0x04b6, B:277:0x04be, B:279:0x04c6, B:281:0x04ce, B:283:0x04d6, B:285:0x04de, B:287:0x04e8, B:289:0x04f2, B:233:0x0432, B:235:0x043a, B:239:0x0445, B:241:0x044f, B:243:0x0457, B:245:0x045f), top: B:342:0x01b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03c8 A[Catch: Exception -> 0x01cf, TryCatch #0 {Exception -> 0x01cf, blocks: (B:93:0x01b4, B:95:0x01b8, B:97:0x01c6, B:116:0x0230, B:103:0x01d8, B:105:0x01e0, B:106:0x01e6, B:108:0x01ee, B:109:0x01f4, B:111:0x01fc, B:112:0x0202, B:114:0x020a, B:115:0x0210, B:117:0x0237, B:123:0x0255, B:125:0x025a, B:127:0x025e, B:128:0x0272, B:130:0x0276, B:132:0x027c, B:134:0x0282, B:135:0x0290, B:137:0x0298, B:138:0x02a2, B:140:0x02a7, B:141:0x02b1, B:143:0x02b6, B:144:0x02c0, B:146:0x02c4, B:147:0x02ce, B:150:0x02d8, B:151:0x02ee, B:153:0x02f2, B:155:0x0303, B:156:0x0308, B:158:0x030c, B:159:0x0311, B:160:0x0317, B:162:0x031e, B:164:0x032f, B:165:0x0334, B:167:0x0339, B:168:0x033e, B:170:0x0342, B:171:0x0347, B:173:0x034b, B:174:0x0350, B:176:0x0354, B:177:0x0359, B:179:0x035f, B:180:0x0364, B:182:0x0368, B:183:0x036d, B:185:0x0371, B:186:0x0376, B:188:0x037a, B:189:0x037f, B:191:0x0383, B:192:0x0388, B:194:0x038c, B:195:0x0391, B:197:0x0395, B:198:0x039a, B:200:0x039e, B:201:0x03a3, B:203:0x03a7, B:204:0x03ac, B:206:0x03b0, B:207:0x03b5, B:209:0x03b8, B:210:0x03bd, B:211:0x03c3, B:213:0x03c8, B:214:0x03d2, B:218:0x03f6, B:220:0x0402, B:222:0x040a, B:224:0x0414, B:226:0x041c, B:228:0x0424, B:248:0x0468, B:250:0x046e, B:254:0x0479, B:256:0x047f, B:260:0x048a, B:262:0x0490, B:266:0x049b, B:268:0x04a1, B:293:0x04f8, B:295:0x04fe, B:273:0x04ae, B:275:0x04b6, B:277:0x04be, B:279:0x04c6, B:281:0x04ce, B:283:0x04d6, B:285:0x04de, B:287:0x04e8, B:289:0x04f2, B:233:0x0432, B:235:0x043a, B:239:0x0445, B:241:0x044f, B:243:0x0457, B:245:0x045f), top: B:342:0x01b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x046e A[Catch: Exception -> 0x01cf, TryCatch #0 {Exception -> 0x01cf, blocks: (B:93:0x01b4, B:95:0x01b8, B:97:0x01c6, B:116:0x0230, B:103:0x01d8, B:105:0x01e0, B:106:0x01e6, B:108:0x01ee, B:109:0x01f4, B:111:0x01fc, B:112:0x0202, B:114:0x020a, B:115:0x0210, B:117:0x0237, B:123:0x0255, B:125:0x025a, B:127:0x025e, B:128:0x0272, B:130:0x0276, B:132:0x027c, B:134:0x0282, B:135:0x0290, B:137:0x0298, B:138:0x02a2, B:140:0x02a7, B:141:0x02b1, B:143:0x02b6, B:144:0x02c0, B:146:0x02c4, B:147:0x02ce, B:150:0x02d8, B:151:0x02ee, B:153:0x02f2, B:155:0x0303, B:156:0x0308, B:158:0x030c, B:159:0x0311, B:160:0x0317, B:162:0x031e, B:164:0x032f, B:165:0x0334, B:167:0x0339, B:168:0x033e, B:170:0x0342, B:171:0x0347, B:173:0x034b, B:174:0x0350, B:176:0x0354, B:177:0x0359, B:179:0x035f, B:180:0x0364, B:182:0x0368, B:183:0x036d, B:185:0x0371, B:186:0x0376, B:188:0x037a, B:189:0x037f, B:191:0x0383, B:192:0x0388, B:194:0x038c, B:195:0x0391, B:197:0x0395, B:198:0x039a, B:200:0x039e, B:201:0x03a3, B:203:0x03a7, B:204:0x03ac, B:206:0x03b0, B:207:0x03b5, B:209:0x03b8, B:210:0x03bd, B:211:0x03c3, B:213:0x03c8, B:214:0x03d2, B:218:0x03f6, B:220:0x0402, B:222:0x040a, B:224:0x0414, B:226:0x041c, B:228:0x0424, B:248:0x0468, B:250:0x046e, B:254:0x0479, B:256:0x047f, B:260:0x048a, B:262:0x0490, B:266:0x049b, B:268:0x04a1, B:293:0x04f8, B:295:0x04fe, B:273:0x04ae, B:275:0x04b6, B:277:0x04be, B:279:0x04c6, B:281:0x04ce, B:283:0x04d6, B:285:0x04de, B:287:0x04e8, B:289:0x04f2, B:233:0x0432, B:235:0x043a, B:239:0x0445, B:241:0x044f, B:243:0x0457, B:245:0x045f), top: B:342:0x01b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x04fe A[Catch: Exception -> 0x01cf, TRY_LEAVE, TryCatch #0 {Exception -> 0x01cf, blocks: (B:93:0x01b4, B:95:0x01b8, B:97:0x01c6, B:116:0x0230, B:103:0x01d8, B:105:0x01e0, B:106:0x01e6, B:108:0x01ee, B:109:0x01f4, B:111:0x01fc, B:112:0x0202, B:114:0x020a, B:115:0x0210, B:117:0x0237, B:123:0x0255, B:125:0x025a, B:127:0x025e, B:128:0x0272, B:130:0x0276, B:132:0x027c, B:134:0x0282, B:135:0x0290, B:137:0x0298, B:138:0x02a2, B:140:0x02a7, B:141:0x02b1, B:143:0x02b6, B:144:0x02c0, B:146:0x02c4, B:147:0x02ce, B:150:0x02d8, B:151:0x02ee, B:153:0x02f2, B:155:0x0303, B:156:0x0308, B:158:0x030c, B:159:0x0311, B:160:0x0317, B:162:0x031e, B:164:0x032f, B:165:0x0334, B:167:0x0339, B:168:0x033e, B:170:0x0342, B:171:0x0347, B:173:0x034b, B:174:0x0350, B:176:0x0354, B:177:0x0359, B:179:0x035f, B:180:0x0364, B:182:0x0368, B:183:0x036d, B:185:0x0371, B:186:0x0376, B:188:0x037a, B:189:0x037f, B:191:0x0383, B:192:0x0388, B:194:0x038c, B:195:0x0391, B:197:0x0395, B:198:0x039a, B:200:0x039e, B:201:0x03a3, B:203:0x03a7, B:204:0x03ac, B:206:0x03b0, B:207:0x03b5, B:209:0x03b8, B:210:0x03bd, B:211:0x03c3, B:213:0x03c8, B:214:0x03d2, B:218:0x03f6, B:220:0x0402, B:222:0x040a, B:224:0x0414, B:226:0x041c, B:228:0x0424, B:248:0x0468, B:250:0x046e, B:254:0x0479, B:256:0x047f, B:260:0x048a, B:262:0x0490, B:266:0x049b, B:268:0x04a1, B:293:0x04f8, B:295:0x04fe, B:273:0x04ae, B:275:0x04b6, B:277:0x04be, B:279:0x04c6, B:281:0x04ce, B:283:0x04d6, B:285:0x04de, B:287:0x04e8, B:289:0x04f2, B:233:0x0432, B:235:0x043a, B:239:0x0445, B:241:0x044f, B:243:0x0457, B:245:0x045f), top: B:342:0x01b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x057c A[Catch: zzsj -> 0x057f, TryCatch #9 {zzsj -> 0x057f, blocks: (B:318:0x055f, B:320:0x057c, B:324:0x0587, B:327:0x0593, B:328:0x0595, B:323:0x0581, B:330:0x0599, B:331:0x059a, B:334:0x05a3, B:335:0x05a4, B:336:0x05b1, B:338:0x05b5), top: B:359:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0581 A[Catch: zzsj -> 0x057f, TryCatch #9 {zzsj -> 0x057f, blocks: (B:318:0x055f, B:320:0x057c, B:324:0x0587, B:327:0x0593, B:328:0x0595, B:323:0x0581, B:330:0x0599, B:331:0x059a, B:334:0x05a3, B:335:0x05a4, B:336:0x05b1, B:338:0x05b5), top: B:359:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0183 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0542 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0593 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019a A[Catch: Exception -> 0x018e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x018e, blocks: (B:80:0x0183, B:86:0x019a), top: B:344:0x0183 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a8 A[Catch: Exception -> 0x024b, TRY_LEAVE, TryCatch #2 {Exception -> 0x024b, blocks: (B:84:0x0196, B:87:0x01a4, B:89:0x01a8), top: B:346:0x0196 }] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v16, types: [com.google.android.gms.internal.ads.FF0, com.google.android.gms.internal.ads.uF0] */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v3, types: [com.google.android.gms.internal.ads.xF0] */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.gms.internal.ads.vF0] */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.google.android.gms.internal.ads.Gy0, com.google.android.gms.internal.ads.JF0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.android.gms.internal.ads.xF0] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.media.MediaCrypto, com.google.android.gms.internal.ads.HF0] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void f0() {
        /*
            Method dump skipped, instructions count: 1473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.JF0.f0():void");
    }

    protected void g0(long j8) {
        this.f16204u0 = j8;
        while (!this.f16212z.isEmpty() && j8 >= ((GF0) this.f16212z.peek()).f15336a) {
            GF0 gf0 = (GF0) this.f16212z.poll();
            gf0.getClass();
            u0(gf0);
            Q0();
        }
    }

    protected void h0(C4530wy0 c4530wy0) {
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.android.gms.internal.ads.InterfaceC4773zA0
    public void i(long r23, long r25) {
        /*
            Method dump skipped, instructions count: 1731
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.JF0.i(long, long):void");
    }

    protected void i0(D d8) {
    }

    protected final void j0() {
        try {
            InterfaceC4347vF0 interfaceC4347vF0 = this.f16161H;
            if (interfaceC4347vF0 != null) {
                interfaceC4347vF0.k();
                this.f16200s0.f15825b++;
                C4565xF0 c4565xF0 = this.f16168O;
                if (c4565xF0 == null) {
                    throw null;
                }
                N0(c4565xF0.f27773a);
            }
            this.f16161H = null;
            this.f16158E = null;
            this.f16208w0 = null;
            l0();
        } catch (Throwable th) {
            this.f16161H = null;
            this.f16158E = null;
            this.f16208w0 = null;
            l0();
            throw th;
        }
    }

    protected void k0() {
        P0();
        t0();
        this.f16177X = -9223372036854775807L;
        this.f16191l0 = false;
        this.f16176W = -9223372036854775807L;
        this.f16190k0 = false;
        this.f16173T = false;
        this.f16174U = false;
        this.f16181b0 = false;
        this.f16182c0 = false;
        this.f16193n0 = -9223372036854775807L;
        this.f16194o0 = -9223372036854775807L;
        this.f16204u0 = -9223372036854775807L;
        this.f16188i0 = 0;
        this.f16189j0 = 0;
        this.f16187h0 = this.f16186g0 ? 1 : 0;
    }

    protected final void l0() {
        k0();
        this.f16166M = null;
        this.f16168O = null;
        this.f16162I = null;
        this.f16163J = null;
        this.f16164K = false;
        this.f16192m0 = false;
        this.f16165L = -1.0f;
        this.f16169P = 0;
        this.f16170Q = false;
        this.f16171R = false;
        this.f16172S = false;
        this.f16175V = false;
        this.f16186g0 = false;
        this.f16187h0 = 0;
    }

    protected final boolean m0() {
        boolean n02 = n0();
        if (n02) {
            f0();
        }
        return n02;
    }

    protected final boolean n0() {
        if (this.f16161H == null) {
            return false;
        }
        int i8 = this.f16189j0;
        if (i8 == 3 || ((this.f16170Q && !this.f16192m0) || (this.f16171R && this.f16191l0))) {
            j0();
            return true;
        }
        if (i8 == 2) {
            int i9 = AbstractC2301cW.f21206a;
            AbstractC3796qC.f(i9 >= 23);
            if (i9 >= 23) {
                try {
                    v0();
                } catch (zzib e8) {
                    HL.g("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e8);
                    j0();
                    return true;
                }
            }
        }
        I0();
        return false;
    }

    protected final boolean o0() {
        return this.f16183d0;
    }

    protected final boolean p0(D d8) {
        return this.f16210x0 == null && T0(d8);
    }

    protected boolean q0(C4565xF0 c4565xF0) {
        return true;
    }

    protected boolean r0(C4530wy0 c4530wy0) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4773zA0
    public void s(float f8, float f9) {
        this.f16159F = f8;
        this.f16160G = f9;
        A0(this.f16162I);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4228uA0
    public void x(int i8, Object obj) {
        if (i8 == 11) {
            this.f16157D = (InterfaceC4664yA0) obj;
        }
    }
}
