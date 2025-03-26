package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.yJ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4682yJ0 extends JF0 implements InterfaceC3335m {

    /* renamed from: g1, reason: collision with root package name */
    private static final int[] f28067g1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: h1, reason: collision with root package name */
    private static boolean f28068h1;

    /* renamed from: i1, reason: collision with root package name */
    private static boolean f28069i1;

    /* renamed from: A0, reason: collision with root package name */
    private final boolean f28070A0;

    /* renamed from: B0, reason: collision with root package name */
    private final F f28071B0;

    /* renamed from: C0, reason: collision with root package name */
    private final boolean f28072C0;

    /* renamed from: D0, reason: collision with root package name */
    private final C3444n f28073D0;

    /* renamed from: E0, reason: collision with root package name */
    private final C3226l f28074E0;

    /* renamed from: F0, reason: collision with root package name */
    private C4573xJ0 f28075F0;

    /* renamed from: G0, reason: collision with root package name */
    private boolean f28076G0;

    /* renamed from: H0, reason: collision with root package name */
    private boolean f28077H0;

    /* renamed from: I0, reason: collision with root package name */
    private K f28078I0;

    /* renamed from: J0, reason: collision with root package name */
    private boolean f28079J0;

    /* renamed from: K0, reason: collision with root package name */
    private List f28080K0;

    /* renamed from: L0, reason: collision with root package name */
    private Surface f28081L0;

    /* renamed from: M0, reason: collision with root package name */
    private BJ0 f28082M0;

    /* renamed from: N0, reason: collision with root package name */
    private C4254uR f28083N0;

    /* renamed from: O0, reason: collision with root package name */
    private boolean f28084O0;

    /* renamed from: P0, reason: collision with root package name */
    private int f28085P0;

    /* renamed from: Q0, reason: collision with root package name */
    private int f28086Q0;

    /* renamed from: R0, reason: collision with root package name */
    private long f28087R0;

    /* renamed from: S0, reason: collision with root package name */
    private int f28088S0;

    /* renamed from: T0, reason: collision with root package name */
    private int f28089T0;

    /* renamed from: U0, reason: collision with root package name */
    private int f28090U0;

    /* renamed from: V0, reason: collision with root package name */
    private long f28091V0;

    /* renamed from: W0, reason: collision with root package name */
    private int f28092W0;

    /* renamed from: X0, reason: collision with root package name */
    private long f28093X0;

    /* renamed from: Y0, reason: collision with root package name */
    private C4408vs f28094Y0;

    /* renamed from: Z0, reason: collision with root package name */
    private C4408vs f28095Z0;

    /* renamed from: a1, reason: collision with root package name */
    private int f28096a1;

    /* renamed from: b1, reason: collision with root package name */
    private int f28097b1;

    /* renamed from: c1, reason: collision with root package name */
    private InterfaceC3117k f28098c1;

    /* renamed from: d1, reason: collision with root package name */
    private long f28099d1;

    /* renamed from: e1, reason: collision with root package name */
    private long f28100e1;

    /* renamed from: f1, reason: collision with root package name */
    private boolean f28101f1;

    /* renamed from: z0, reason: collision with root package name */
    private final Context f28102z0;

    public C4682yJ0(Context context, InterfaceC4129tF0 interfaceC4129tF0, LF0 lf0, long j8, boolean z7, Handler handler, G g8, int i8, float f8) {
        super(2, interfaceC4129tF0, lf0, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.f28102z0 = applicationContext;
        this.f28078I0 = null;
        this.f28071B0 = new F(handler, g8);
        this.f28070A0 = true;
        this.f28073D0 = new C3444n(applicationContext, this, 0L);
        this.f28074E0 = new C3226l();
        this.f28072C0 = "NVIDIA".equals(AbstractC2301cW.f21208c);
        this.f28083N0 = C4254uR.f27056c;
        this.f28085P0 = 1;
        this.f28086Q0 = 0;
        this.f28094Y0 = C4408vs.f27376d;
        this.f28097b1 = 0;
        this.f28095Z0 = null;
        this.f28096a1 = -1000;
        this.f28099d1 = -9223372036854775807L;
        this.f28100e1 = -9223372036854775807L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected static final boolean e1(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 2924
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4682yJ0.e1(java.lang.String):boolean");
    }

    protected static final boolean f1(C4565xF0 c4565xF0) {
        return AbstractC2301cW.f21206a >= 35 && c4565xF0.f27780h;
    }

    private final Surface g1(C4565xF0 c4565xF0) {
        K k8 = this.f28078I0;
        if (k8 != null) {
            return k8.zza();
        }
        Surface surface = this.f28081L0;
        if (surface != null) {
            return surface;
        }
        if (f1(c4565xF0)) {
            return null;
        }
        AbstractC3796qC.f(r1(c4565xF0));
        BJ0 bj0 = this.f28082M0;
        if (bj0 != null) {
            if (bj0.f13775o != c4565xF0.f27778f) {
                p1();
            }
        }
        if (this.f28082M0 == null) {
            this.f28082M0 = BJ0.a(this.f28102z0, c4565xF0.f27778f);
        }
        return this.f28082M0;
    }

    private static List h1(Context context, LF0 lf0, D d8, boolean z7, boolean z8) {
        String str = d8.f14334o;
        if (str == null) {
            return AbstractC4169th0.w();
        }
        if (AbstractC2301cW.f21206a >= 26 && "video/dolby-vision".equals(str) && !AbstractC4464wJ0.a(context)) {
            List c8 = AbstractC2065aG0.c(lf0, d8, z7, z8);
            if (!c8.isEmpty()) {
                return c8;
            }
        }
        return AbstractC2065aG0.e(lf0, d8, z7, z8);
    }

    private final void i1() {
        C4408vs c4408vs = this.f28095Z0;
        if (c4408vs != null) {
            this.f28071B0.t(c4408vs);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j1() {
        this.f28071B0.q(this.f28081L0);
        this.f28084O0 = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int k1(com.google.android.gms.internal.ads.C4565xF0 r10, com.google.android.gms.internal.ads.D r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4682yJ0.k1(com.google.android.gms.internal.ads.xF0, com.google.android.gms.internal.ads.D):int");
    }

    protected static int l1(C4565xF0 c4565xF0, D d8) {
        if (d8.f14335p == -1) {
            return k1(c4565xF0, d8);
        }
        int size = d8.f14337r.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += ((byte[]) d8.f14337r.get(i9)).length;
        }
        return d8.f14335p + i8;
    }

    private final void p1() {
        BJ0 bj0 = this.f28082M0;
        if (bj0 != null) {
            bj0.release();
            this.f28082M0 = null;
        }
    }

    private final boolean q1(C4565xF0 c4565xF0) {
        Surface surface = this.f28081L0;
        return (surface != null && surface.isValid()) || f1(c4565xF0) || r1(c4565xF0);
    }

    private final boolean r1(C4565xF0 c4565xF0) {
        if (AbstractC2301cW.f21206a < 23 || e1(c4565xF0.f27773a)) {
            return false;
        }
        return !c4565xF0.f27778f || BJ0.b(this.f28102z0);
    }

    @Override // com.google.android.gms.internal.ads.Gy0
    protected final void B() {
        K k8 = this.f28078I0;
        if (k8 == null || !this.f28070A0) {
            return;
        }
        k8.j();
    }

    @Override // com.google.android.gms.internal.ads.JF0
    protected final int B0(LF0 lf0, D d8) {
        boolean z7;
        if (!AbstractC1650Pc.i(d8.f14334o)) {
            return 128;
        }
        Context context = this.f28102z0;
        int i8 = 0;
        boolean z8 = d8.f14338s != null;
        List h12 = h1(context, lf0, d8, z8, false);
        if (z8 && h12.isEmpty()) {
            h12 = h1(context, lf0, d8, false, false);
        }
        if (h12.isEmpty()) {
            return 129;
        }
        if (!JF0.s0(d8)) {
            return 130;
        }
        C4565xF0 c4565xF0 = (C4565xF0) h12.get(0);
        boolean e8 = c4565xF0.e(d8);
        if (e8) {
            z7 = true;
        } else {
            for (int i9 = 1; i9 < h12.size(); i9++) {
                C4565xF0 c4565xF02 = (C4565xF0) h12.get(i9);
                if (c4565xF02.e(d8)) {
                    e8 = true;
                    z7 = false;
                    c4565xF0 = c4565xF02;
                    break;
                }
            }
            z7 = true;
        }
        int i10 = true != e8 ? 3 : 4;
        int i11 = true != c4565xF0.f(d8) ? 8 : 16;
        int i12 = true != c4565xF0.f27779g ? 0 : 64;
        int i13 = true != z7 ? 0 : 128;
        if (AbstractC2301cW.f21206a >= 26 && "video/dolby-vision".equals(d8.f14334o) && !AbstractC4464wJ0.a(context)) {
            i13 = 256;
        }
        if (e8) {
            List h13 = h1(context, lf0, d8, z8, true);
            if (!h13.isEmpty()) {
                C4565xF0 c4565xF03 = (C4565xF0) AbstractC2065aG0.f(h13, d8).get(0);
                if (c4565xF03.e(d8) && c4565xF03.f(d8)) {
                    i8 = 32;
                }
            }
        }
        return i13 | i10 | i11 | i8 | i12;
    }

    @Override // com.google.android.gms.internal.ads.JF0
    protected final Iy0 C0(C4565xF0 c4565xF0, D d8, D d9) {
        int i8;
        int i9;
        Iy0 b8 = c4565xF0.b(d8, d9);
        int i10 = b8.f16080e;
        C4573xJ0 c4573xJ0 = this.f28075F0;
        c4573xJ0.getClass();
        if (d9.f14341v > c4573xJ0.f27840a || d9.f14342w > c4573xJ0.f27841b) {
            i10 |= 256;
        }
        if (l1(c4565xF0, d9) > c4573xJ0.f27842c) {
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
        try {
            super.D();
        } finally {
            this.f28079J0 = false;
            this.f28099d1 = -9223372036854775807L;
            p1();
        }
    }

    @Override // com.google.android.gms.internal.ads.JF0
    protected final Iy0 D0(Tz0 tz0) {
        Iy0 D02 = super.D0(tz0);
        D d8 = tz0.f19205a;
        d8.getClass();
        this.f28071B0.f(d8, D02);
        return D02;
    }

    @Override // com.google.android.gms.internal.ads.Gy0
    protected final void E() {
        this.f28088S0 = 0;
        this.f28087R0 = T().zzb();
        this.f28091V0 = 0L;
        this.f28092W0 = 0;
        K k8 = this.f28078I0;
        if (k8 != null) {
            k8.h();
        } else {
            this.f28073D0.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.Gy0
    protected final void G() {
        if (this.f28088S0 > 0) {
            long zzb = T().zzb();
            this.f28071B0.d(this.f28088S0, zzb - this.f28087R0);
            this.f28088S0 = 0;
            this.f28087R0 = zzb;
        }
        int i8 = this.f28092W0;
        if (i8 != 0) {
            this.f28071B0.r(this.f28091V0, i8);
            this.f28091V0 = 0L;
            this.f28092W0 = 0;
        }
        K k8 = this.f28078I0;
        if (k8 != null) {
            k8.i();
        } else {
            this.f28073D0.h();
        }
    }

    @Override // com.google.android.gms.internal.ads.JF0
    protected final C4020sF0 G0(C4565xF0 c4565xF0, D d8, MediaCrypto mediaCrypto, float f8) {
        Point point;
        int i8;
        int i9;
        boolean z7;
        int i10;
        int k12;
        D[] K7 = K();
        int length = K7.length;
        int l12 = l1(c4565xF0, d8);
        int i11 = d8.f14341v;
        int i12 = d8.f14342w;
        if (length != 1) {
            boolean z8 = false;
            for (int i13 = 0; i13 < length; i13++) {
                D d9 = K7[i13];
                if (d8.f14310C != null && d9.f14310C == null) {
                    C2723gJ0 b8 = d9.b();
                    b8.b(d8.f14310C);
                    d9 = b8.H();
                }
                if (c4565xF0.b(d8, d9).f16079d != 0) {
                    int i14 = d9.f14341v;
                    z8 |= i14 == -1 || d9.f14342w == -1;
                    i11 = Math.max(i11, i14);
                    i12 = Math.max(i12, d9.f14342w);
                    l12 = Math.max(l12, l1(c4565xF0, d9));
                }
            }
            if (z8) {
                HL.f("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i11 + "x" + i12);
                int i15 = d8.f14342w;
                int i16 = d8.f14341v;
                boolean z9 = i15 > i16;
                int i17 = z9 ? i15 : i16;
                if (true == z9) {
                    i15 = i16;
                }
                int[] iArr = f28067g1;
                int i18 = 0;
                while (i18 < 9) {
                    float f9 = i15;
                    float f10 = i17;
                    int i19 = iArr[i18];
                    int[] iArr2 = iArr;
                    float f11 = i19;
                    if (i19 <= i17 || (i8 = (int) (f11 * (f9 / f10))) <= i15) {
                        break;
                    }
                    int i20 = true != z9 ? i19 : i8;
                    if (true != z9) {
                        i19 = i8;
                    }
                    point = c4565xF0.a(i20, i19);
                    float f12 = d8.f14343x;
                    if (point != null) {
                        z7 = z9;
                        i9 = i15;
                        if (c4565xF0.g(point.x, point.y, f12)) {
                            break;
                        }
                    } else {
                        i9 = i15;
                        z7 = z9;
                    }
                    i18++;
                    z9 = z7;
                    iArr = iArr2;
                    i15 = i9;
                }
                point = null;
                if (point != null) {
                    i11 = Math.max(i11, point.x);
                    i12 = Math.max(i12, point.y);
                    C2723gJ0 b9 = d8.b();
                    b9.G(i11);
                    b9.k(i12);
                    l12 = Math.max(l12, k1(c4565xF0, b9.H()));
                    HL.f("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i11 + "x" + i12);
                }
            }
        } else if (l12 != -1 && (k12 = k1(c4565xF0, d8)) != -1) {
            l12 = Math.min((int) (l12 * 1.5f), k12);
        }
        String str = c4565xF0.f27775c;
        C4573xJ0 c4573xJ0 = new C4573xJ0(i11, i12, l12);
        this.f28075F0 = c4573xJ0;
        boolean z10 = this.f28072C0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", d8.f14341v);
        mediaFormat.setInteger("height", d8.f14342w);
        AbstractC3161kN.b(mediaFormat, d8.f14337r);
        float f13 = d8.f14343x;
        if (f13 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f13);
        }
        AbstractC3161kN.a(mediaFormat, "rotation-degrees", d8.f14344y);
        Pz0 pz0 = d8.f14310C;
        if (pz0 != null) {
            AbstractC3161kN.a(mediaFormat, "color-transfer", pz0.f18324c);
            AbstractC3161kN.a(mediaFormat, "color-standard", pz0.f18322a);
            AbstractC3161kN.a(mediaFormat, "color-range", pz0.f18323b);
            byte[] bArr = pz0.f18325d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(d8.f14334o)) {
            int i21 = AbstractC2065aG0.f20673b;
            Pair a8 = AbstractC4015sD.a(d8);
            if (a8 != null) {
                AbstractC3161kN.a(mediaFormat, "profile", ((Integer) a8.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", c4573xJ0.f27840a);
        mediaFormat.setInteger("max-height", c4573xJ0.f27841b);
        AbstractC3161kN.a(mediaFormat, "max-input-size", c4573xJ0.f27842c);
        int i22 = AbstractC2301cW.f21206a;
        if (i22 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f8 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f8);
            }
        }
        if (z10) {
            mediaFormat.setInteger("no-post-process", 1);
            i10 = 0;
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            i10 = 0;
        }
        if (i22 >= 35) {
            mediaFormat.setInteger("importance", Math.max(i10, -this.f28096a1));
        }
        Surface g12 = g1(c4565xF0);
        if (this.f28078I0 != null && !AbstractC2301cW.k(this.f28102z0)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return C4020sF0.b(c4565xF0, mediaFormat, d8, g12, null);
    }

    @Override // com.google.android.gms.internal.ads.JF0
    protected final List H0(LF0 lf0, D d8, boolean z7) {
        return AbstractC2065aG0.f(h1(this.f28102z0, lf0, d8, false, false), d8);
    }

    @Override // com.google.android.gms.internal.ads.JF0, com.google.android.gms.internal.ads.Gy0
    protected final void I(D[] dArr, long j8, long j9, GG0 gg0) {
        super.I(dArr, j8, j9, gg0);
        if (this.f28099d1 == -9223372036854775807L) {
            this.f28099d1 = j8;
        }
        AbstractC1981Yl S7 = S();
        if (S7.o()) {
            this.f28100e1 = -9223372036854775807L;
        } else {
            this.f28100e1 = S7.n(gg0.f15340a, new C1945Xk()).f20119d;
        }
    }

    @Override // com.google.android.gms.internal.ads.JF0
    protected final void K0(C4530wy0 c4530wy0) {
        if (this.f28077H0) {
            ByteBuffer byteBuffer = c4530wy0.f27698g;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b8 = byteBuffer.get();
                short s8 = byteBuffer.getShort();
                short s9 = byteBuffer.getShort();
                byte b9 = byteBuffer.get();
                byte b10 = byteBuffer.get();
                byteBuffer.position(0);
                if (b8 == -75 && s8 == 60 && s9 == 1 && b9 == 4) {
                    if (b10 == 0 || b10 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        InterfaceC4347vF0 Z02 = Z0();
                        Z02.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        Z02.T(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.JF0
    protected final void L0(Exception exc) {
        HL.d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f28071B0.s(exc);
    }

    @Override // com.google.android.gms.internal.ads.JF0
    protected final void M0(String str, C4020sF0 c4020sF0, long j8, long j9) {
        this.f28071B0.a(str, j8, j9);
        this.f28076G0 = e1(str);
        C4565xF0 e02 = e0();
        e02.getClass();
        boolean z7 = false;
        if (AbstractC2301cW.f21206a >= 29 && "video/x-vnd.on2.vp9".equals(e02.f27774b)) {
            MediaCodecInfo.CodecProfileLevel[] h8 = e02.h();
            int length = h8.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    break;
                }
                if (h8[i8].profile == 16384) {
                    z7 = true;
                    break;
                }
                i8++;
            }
        }
        this.f28077H0 = z7;
    }

    @Override // com.google.android.gms.internal.ads.JF0
    protected final void N0(String str) {
        this.f28071B0.b(str);
    }

    @Override // com.google.android.gms.internal.ads.JF0
    protected final void O0(D d8, MediaFormat mediaFormat) {
        InterfaceC4347vF0 Z02 = Z0();
        if (Z02 != null) {
            Z02.i(this.f28085P0);
        }
        mediaFormat.getClass();
        boolean z7 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z7 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z7 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f8 = d8.f14345z;
        if (AbstractC2301cW.f21206a >= 30 && mediaFormat.containsKey("sar-width") && mediaFormat.containsKey("sar-height")) {
            f8 = mediaFormat.getInteger("sar-width") / mediaFormat.getInteger("sar-height");
        }
        int i8 = d8.f14344y;
        if (i8 == 90 || i8 == 270) {
            f8 = 1.0f / f8;
            int i9 = integer2;
            integer2 = integer;
            integer = i9;
        }
        this.f28094Y0 = new C4408vs(integer, integer2, f8);
        K k8 = this.f28078I0;
        if (k8 == null || !this.f28101f1) {
            this.f28073D0.l(d8.f14343x);
        } else {
            C2723gJ0 b8 = d8.b();
            b8.G(integer);
            b8.k(integer2);
            b8.w(f8);
            k8.z(1, b8.H());
        }
        this.f28101f1 = false;
    }

    @Override // com.google.android.gms.internal.ads.JF0
    protected final void Q0() {
        K k8 = this.f28078I0;
        if (k8 != null) {
            k8.A(X0(), W0(), -this.f28099d1, Q());
        } else {
            this.f28073D0.f();
        }
        this.f28101f1 = true;
    }

    @Override // com.google.android.gms.internal.ads.JF0
    protected final boolean S0(long j8, long j9, InterfaceC4347vF0 interfaceC4347vF0, ByteBuffer byteBuffer, int i8, int i9, int i10, long j10, boolean z7, boolean z8, D d8) {
        boolean z9;
        interfaceC4347vF0.getClass();
        long W02 = j10 - W0();
        K k8 = this.f28078I0;
        if (k8 != null) {
            try {
                z9 = false;
            } catch (zzabg e8) {
                e = e8;
                z9 = false;
            }
            try {
                return k8.H(j10 + (-this.f28099d1), z8, j8, j9, new C4028sJ0(this, interfaceC4347vF0, i8, W02));
            } catch (zzabg e9) {
                e = e9;
                throw N(e, e.f28751o, z9, 7001);
            }
        }
        int a8 = this.f28073D0.a(j10, j8, j9, X0(), z8, this.f28074E0);
        if (a8 == 4) {
            return false;
        }
        if (z7 && !z8) {
            a1(interfaceC4347vF0, i8, W02);
            return true;
        }
        if (this.f28081L0 == null) {
            if (this.f28074E0.c() >= 30000) {
                return false;
            }
            a1(interfaceC4347vF0, i8, W02);
            c1(this.f28074E0.c());
            return true;
        }
        if (a8 == 0) {
            o1(interfaceC4347vF0, i8, W02, T().a());
            c1(this.f28074E0.c());
            return true;
        }
        if (a8 == 1) {
            C3226l c3226l = this.f28074E0;
            long d9 = c3226l.d();
            long c8 = c3226l.c();
            if (d9 == this.f28093X0) {
                a1(interfaceC4347vF0, i8, W02);
            } else {
                o1(interfaceC4347vF0, i8, W02, d9);
            }
            c1(c8);
            this.f28093X0 = d9;
            return true;
        }
        if (a8 == 2) {
            Trace.beginSection("dropVideoBuffer");
            interfaceC4347vF0.j(i8, false);
            Trace.endSection();
            b1(0, 1);
            c1(this.f28074E0.c());
            return true;
        }
        if (a8 != 3) {
            if (a8 == 5) {
                return false;
            }
            throw new IllegalStateException(String.valueOf(a8));
        }
        a1(interfaceC4347vF0, i8, W02);
        c1(this.f28074E0.c());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.JF0
    protected final int V0(C4530wy0 c4530wy0) {
        int i8 = AbstractC2301cW.f21206a;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.JF0, com.google.android.gms.internal.ads.Gy0
    protected final void X() {
        this.f28095Z0 = null;
        this.f28100e1 = -9223372036854775807L;
        K k8 = this.f28078I0;
        if (k8 != null) {
            k8.e();
        } else {
            this.f28073D0.d();
        }
        this.f28084O0 = false;
        try {
            super.X();
        } finally {
            this.f28071B0.c(this.f16200s0);
            this.f28071B0.t(C4408vs.f27376d);
        }
    }

    @Override // com.google.android.gms.internal.ads.JF0, com.google.android.gms.internal.ads.InterfaceC4773zA0
    public final boolean Y() {
        boolean Y7 = super.Y();
        K k8 = this.f28078I0;
        if (k8 != null) {
            return k8.U(Y7);
        }
        if (Y7 && (Z0() == null || this.f28081L0 == null)) {
            return true;
        }
        return this.f28073D0.o(Y7);
    }

    @Override // com.google.android.gms.internal.ads.JF0, com.google.android.gms.internal.ads.Gy0
    protected final void Z(boolean z7, boolean z8) {
        super.Z(z7, z8);
        V();
        this.f28071B0.e(this.f16200s0);
        if (!this.f28079J0) {
            if (this.f28080K0 != null && this.f28078I0 == null) {
                FJ0 fj0 = new FJ0(this.f28102z0, this.f28073D0);
                fj0.d(T());
                this.f28078I0 = fj0.e().h();
            }
            this.f28079J0 = true;
        }
        K k8 = this.f28078I0;
        if (k8 == null) {
            this.f28073D0.k(T());
            this.f28073D0.e(z8);
            return;
        }
        k8.I(new C3919rJ0(this), AbstractC4284uk0.c());
        InterfaceC3117k interfaceC3117k = this.f28098c1;
        if (interfaceC3117k != null) {
            this.f28078I0.B(interfaceC3117k);
        }
        if (this.f28081L0 != null && !this.f28083N0.equals(C4254uR.f27056c)) {
            this.f28078I0.C(this.f28081L0, this.f28083N0);
        }
        this.f28078I0.x(this.f28086Q0);
        this.f28078I0.t0(U0());
        List list = this.f28080K0;
        if (list != null) {
            this.f28078I0.G(list);
        }
        this.f28078I0.F(z8);
    }

    @Override // com.google.android.gms.internal.ads.JF0, com.google.android.gms.internal.ads.Gy0
    protected final void a0(long j8, boolean z7) {
        K k8 = this.f28078I0;
        if (k8 != null) {
            k8.y(true);
            this.f28078I0.A(X0(), W0(), -this.f28099d1, Q());
            this.f28101f1 = true;
        }
        super.a0(j8, z7);
        if (this.f28078I0 == null) {
            this.f28073D0.i();
        }
        if (z7) {
            K k9 = this.f28078I0;
            if (k9 != null) {
                k9.C0(false);
            } else {
                this.f28073D0.c(false);
            }
        }
        this.f28089T0 = 0;
    }

    protected final void a1(InterfaceC4347vF0 interfaceC4347vF0, int i8, long j8) {
        Trace.beginSection("skipVideoBuffer");
        interfaceC4347vF0.j(i8, false);
        Trace.endSection();
        this.f16200s0.f15829f++;
    }

    @Override // com.google.android.gms.internal.ads.JF0
    protected final float b0(float f8, D d8, D[] dArr) {
        float f9 = -1.0f;
        for (D d9 : dArr) {
            float f10 = d9.f14343x;
            if (f10 != -1.0f) {
                f9 = Math.max(f9, f10);
            }
        }
        if (f9 == -1.0f) {
            return -1.0f;
        }
        return f9 * f8;
    }

    protected final void b1(int i8, int i9) {
        Hy0 hy0 = this.f16200s0;
        hy0.f15831h += i8;
        int i10 = i8 + i9;
        hy0.f15830g += i10;
        this.f28088S0 += i10;
        int i11 = this.f28089T0 + i10;
        this.f28089T0 = i11;
        hy0.f15832i = Math.max(i11, hy0.f15832i);
    }

    @Override // com.google.android.gms.internal.ads.JF0
    protected final zzsf c0(Throwable th, C4565xF0 c4565xF0) {
        return new zzzk(th, c4565xF0, this.f28081L0);
    }

    protected final void c1(long j8) {
        Hy0 hy0 = this.f16200s0;
        hy0.f15834k += j8;
        hy0.f15835l++;
        this.f28091V0 += j8;
        this.f28092W0++;
    }

    protected final boolean d1(long j8, boolean z7) {
        int O7 = O(j8);
        if (O7 == 0) {
            return false;
        }
        if (z7) {
            Hy0 hy0 = this.f16200s0;
            hy0.f15827d += O7;
            hy0.f15829f += this.f28090U0;
        } else {
            this.f16200s0.f15833j++;
            b1(O7, this.f28090U0);
        }
        m0();
        K k8 = this.f28078I0;
        if (k8 != null) {
            k8.y(false);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.JF0, com.google.android.gms.internal.ads.InterfaceC4773zA0
    public final boolean e() {
        if (!super.e()) {
            return false;
        }
        K k8 = this.f28078I0;
        if (k8 == null) {
            return true;
        }
        k8.u();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.JF0
    protected final void g0(long j8) {
        super.g0(j8);
        this.f28090U0--;
    }

    @Override // com.google.android.gms.internal.ads.JF0
    protected final void h0(C4530wy0 c4530wy0) {
        this.f28090U0++;
        int i8 = AbstractC2301cW.f21206a;
    }

    @Override // com.google.android.gms.internal.ads.JF0, com.google.android.gms.internal.ads.InterfaceC4773zA0
    public final void i(long j8, long j9) {
        super.i(j8, j9);
        K k8 = this.f28078I0;
        if (k8 != null) {
            try {
                k8.E(j8, j9);
            } catch (zzabg e8) {
                throw N(e8, e8.f28751o, false, 7001);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.JF0
    protected final void i0(D d8) {
        K k8 = this.f28078I0;
        if (k8 == null || k8.w()) {
            return;
        }
        try {
            k8.D(d8);
        } catch (zzabg e8) {
            throw N(e8, d8, false, 7000);
        }
    }

    @Override // com.google.android.gms.internal.ads.JF0
    protected final void k0() {
        super.k0();
        this.f28090U0 = 0;
    }

    protected final void o1(InterfaceC4347vF0 interfaceC4347vF0, int i8, long j8, long j9) {
        Trace.beginSection("releaseOutputBuffer");
        interfaceC4347vF0.d(i8, j9);
        Trace.endSection();
        this.f16200s0.f15828e++;
        this.f28089T0 = 0;
        if (this.f28078I0 == null) {
            C4408vs c4408vs = this.f28094Y0;
            if (!c4408vs.equals(C4408vs.f27376d) && !c4408vs.equals(this.f28095Z0)) {
                this.f28095Z0 = c4408vs;
                this.f28071B0.t(c4408vs);
            }
            if (!this.f28073D0.p() || this.f28081L0 == null) {
                return;
            }
            j1();
        }
    }

    @Override // com.google.android.gms.internal.ads.JF0
    protected final boolean q0(C4565xF0 c4565xF0) {
        return q1(c4565xF0);
    }

    @Override // com.google.android.gms.internal.ads.JF0
    protected final boolean r0(C4530wy0 c4530wy0) {
        if (c4530wy0.i() && !y() && !c4530wy0.h() && this.f28100e1 != -9223372036854775807L) {
            if (this.f28100e1 - (c4530wy0.f27697f - W0()) > 100000 && !c4530wy0.l() && c4530wy0.f27697f < Q()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.JF0, com.google.android.gms.internal.ads.InterfaceC4773zA0
    public final void s(float f8, float f9) {
        super.s(f8, f9);
        K k8 = this.f28078I0;
        if (k8 != null) {
            k8.t0(f8);
        } else {
            this.f28073D0.n(f8);
        }
    }

    @Override // com.google.android.gms.internal.ads.Gy0, com.google.android.gms.internal.ads.InterfaceC4773zA0
    public final void t() {
        K k8 = this.f28078I0;
        if (k8 != null) {
            k8.a();
        } else {
            this.f28073D0.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4773zA0, com.google.android.gms.internal.ads.CA0
    public final String u() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.JF0, com.google.android.gms.internal.ads.InterfaceC4228uA0
    public final void x(int i8, Object obj) {
        if (i8 == 1) {
            Surface surface = obj instanceof Surface ? (Surface) obj : null;
            if (this.f28081L0 == surface) {
                if (surface != null) {
                    i1();
                    Surface surface2 = this.f28081L0;
                    if (surface2 == null || !this.f28084O0) {
                        return;
                    }
                    this.f28071B0.q(surface2);
                    return;
                }
                return;
            }
            this.f28081L0 = surface;
            if (this.f28078I0 == null) {
                this.f28073D0.m(surface);
            }
            this.f28084O0 = false;
            int d8 = d();
            InterfaceC4347vF0 Z02 = Z0();
            if (Z02 != null && this.f28078I0 == null) {
                C4565xF0 e02 = e0();
                e02.getClass();
                boolean q12 = q1(e02);
                int i9 = AbstractC2301cW.f21206a;
                if (i9 < 23 || !q12 || this.f28076G0) {
                    j0();
                    f0();
                } else {
                    Surface g12 = g1(e02);
                    if (i9 >= 23 && g12 != null) {
                        Z02.c(g12);
                    } else {
                        if (i9 < 35) {
                            throw new IllegalStateException();
                        }
                        Z02.f();
                    }
                }
            }
            if (surface == null) {
                this.f28095Z0 = null;
                K k8 = this.f28078I0;
                if (k8 != null) {
                    k8.zzb();
                    return;
                }
                return;
            }
            i1();
            if (d8 == 2) {
                K k9 = this.f28078I0;
                if (k9 != null) {
                    k9.C0(true);
                    return;
                } else {
                    this.f28073D0.c(true);
                    return;
                }
            }
            return;
        }
        if (i8 == 7) {
            obj.getClass();
            InterfaceC3117k interfaceC3117k = (InterfaceC3117k) obj;
            this.f28098c1 = interfaceC3117k;
            K k10 = this.f28078I0;
            if (k10 != null) {
                k10.B(interfaceC3117k);
                return;
            }
            return;
        }
        if (i8 == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.f28097b1 != intValue) {
                this.f28097b1 = intValue;
                return;
            }
            return;
        }
        if (i8 == 16) {
            obj.getClass();
            this.f28096a1 = ((Integer) obj).intValue();
            InterfaceC4347vF0 Z03 = Z0();
            if (Z03 == null || AbstractC2301cW.f21206a < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f28096a1));
            Z03.T(bundle);
            return;
        }
        if (i8 == 4) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.f28085P0 = intValue2;
            InterfaceC4347vF0 Z04 = Z0();
            if (Z04 != null) {
                Z04.i(intValue2);
                return;
            }
            return;
        }
        if (i8 == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            this.f28086Q0 = intValue3;
            K k11 = this.f28078I0;
            if (k11 != null) {
                k11.x(intValue3);
                return;
            } else {
                this.f28073D0.j(intValue3);
                return;
            }
        }
        if (i8 == 13) {
            obj.getClass();
            List list = (List) obj;
            this.f28080K0 = list;
            K k12 = this.f28078I0;
            if (k12 != null) {
                k12.G(list);
                return;
            }
            return;
        }
        if (i8 != 14) {
            super.x(i8, obj);
            return;
        }
        obj.getClass();
        C4254uR c4254uR = (C4254uR) obj;
        if (c4254uR.b() == 0 || c4254uR.a() == 0) {
            return;
        }
        this.f28083N0 = c4254uR;
        K k13 = this.f28078I0;
        if (k13 != null) {
            Surface surface3 = this.f28081L0;
            AbstractC3796qC.b(surface3);
            k13.C(surface3, c4254uR);
        }
    }
}
