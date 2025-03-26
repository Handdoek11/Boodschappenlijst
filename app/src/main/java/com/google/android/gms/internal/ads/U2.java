package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class U2 implements InterfaceC3880r0 {

    /* renamed from: e0, reason: collision with root package name */
    private static final byte[] f19215e0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: f0, reason: collision with root package name */
    private static final byte[] f19216f0;

    /* renamed from: g0, reason: collision with root package name */
    private static final byte[] f19217g0;

    /* renamed from: h0, reason: collision with root package name */
    private static final byte[] f19218h0;

    /* renamed from: i0, reason: collision with root package name */
    private static final UUID f19219i0;

    /* renamed from: j0, reason: collision with root package name */
    private static final Map f19220j0;

    /* renamed from: A, reason: collision with root package name */
    private long f19221A;

    /* renamed from: B, reason: collision with root package name */
    private long f19222B;

    /* renamed from: C, reason: collision with root package name */
    private long f19223C;

    /* renamed from: D, reason: collision with root package name */
    private C2944iM f19224D;

    /* renamed from: E, reason: collision with root package name */
    private C2944iM f19225E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f19226F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f19227G;

    /* renamed from: H, reason: collision with root package name */
    private int f19228H;

    /* renamed from: I, reason: collision with root package name */
    private long f19229I;

    /* renamed from: J, reason: collision with root package name */
    private long f19230J;

    /* renamed from: K, reason: collision with root package name */
    private int f19231K;

    /* renamed from: L, reason: collision with root package name */
    private int f19232L;

    /* renamed from: M, reason: collision with root package name */
    private int[] f19233M;

    /* renamed from: N, reason: collision with root package name */
    private int f19234N;

    /* renamed from: O, reason: collision with root package name */
    private int f19235O;

    /* renamed from: P, reason: collision with root package name */
    private int f19236P;

    /* renamed from: Q, reason: collision with root package name */
    private int f19237Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f19238R;

    /* renamed from: S, reason: collision with root package name */
    private long f19239S;

    /* renamed from: T, reason: collision with root package name */
    private int f19240T;

    /* renamed from: U, reason: collision with root package name */
    private int f19241U;

    /* renamed from: V, reason: collision with root package name */
    private int f19242V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f19243W;

    /* renamed from: X, reason: collision with root package name */
    private boolean f19244X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f19245Y;

    /* renamed from: Z, reason: collision with root package name */
    private int f19246Z;

    /* renamed from: a, reason: collision with root package name */
    private final W2 f19247a;

    /* renamed from: a0, reason: collision with root package name */
    private byte f19248a0;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray f19249b;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f19250b0;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f19251c;

    /* renamed from: c0, reason: collision with root package name */
    private InterfaceC4207u0 f19252c0;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f19253d;

    /* renamed from: d0, reason: collision with root package name */
    private final P2 f19254d0;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3344m4 f19255e;

    /* renamed from: f, reason: collision with root package name */
    private final UQ f19256f;

    /* renamed from: g, reason: collision with root package name */
    private final UQ f19257g;

    /* renamed from: h, reason: collision with root package name */
    private final UQ f19258h;

    /* renamed from: i, reason: collision with root package name */
    private final UQ f19259i;

    /* renamed from: j, reason: collision with root package name */
    private final UQ f19260j;

    /* renamed from: k, reason: collision with root package name */
    private final UQ f19261k;

    /* renamed from: l, reason: collision with root package name */
    private final UQ f19262l;

    /* renamed from: m, reason: collision with root package name */
    private final UQ f19263m;

    /* renamed from: n, reason: collision with root package name */
    private final UQ f19264n;

    /* renamed from: o, reason: collision with root package name */
    private final UQ f19265o;

    /* renamed from: p, reason: collision with root package name */
    private ByteBuffer f19266p;

    /* renamed from: q, reason: collision with root package name */
    private long f19267q;

    /* renamed from: r, reason: collision with root package name */
    private long f19268r;

    /* renamed from: s, reason: collision with root package name */
    private long f19269s;

    /* renamed from: t, reason: collision with root package name */
    private long f19270t;

    /* renamed from: u, reason: collision with root package name */
    private long f19271u;

    /* renamed from: v, reason: collision with root package name */
    private S2 f19272v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f19273w;

    /* renamed from: x, reason: collision with root package name */
    private int f19274x;

    /* renamed from: y, reason: collision with root package name */
    private long f19275y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f19276z;

    static {
        int i8 = AbstractC2301cW.f21206a;
        f19216f0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f19217g0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f19218h0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f19219i0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f19220j0 = DesugarCollections.unmodifiableMap(hashMap);
    }

    public U2() {
        this(new P2(), 2, InterfaceC3344m4.f24432a);
    }

    private final int p(InterfaceC3989s0 interfaceC3989s0, S2 s22, int i8, boolean z7) {
        int i9;
        if ("S_TEXT/UTF8".equals(s22.f18762b)) {
            x(interfaceC3989s0, f19215e0, i8);
            int i10 = this.f19241U;
            w();
            return i10;
        }
        if ("S_TEXT/ASS".equals(s22.f18762b)) {
            x(interfaceC3989s0, f19217g0, i8);
            int i11 = this.f19241U;
            w();
            return i11;
        }
        if ("S_TEXT/WEBVTT".equals(s22.f18762b)) {
            x(interfaceC3989s0, f19218h0, i8);
            int i12 = this.f19241U;
            w();
            return i12;
        }
        Y0 y02 = s22.f18759Y;
        if (!this.f19243W) {
            if (s22.f18768h) {
                this.f19236P &= -1073741825;
                if (!this.f19244X) {
                    interfaceC3989s0.H(this.f19258h.n(), 0, 1);
                    this.f19240T++;
                    if ((this.f19258h.n()[0] & 128) == 128) {
                        throw zzbc.a("Extension bit is set in signal byte", null);
                    }
                    this.f19248a0 = this.f19258h.n()[0];
                    this.f19244X = true;
                }
                byte b8 = this.f19248a0;
                if ((b8 & 1) == 1) {
                    int i13 = b8 & 2;
                    this.f19236P |= 1073741824;
                    if (!this.f19250b0) {
                        interfaceC3989s0.H(this.f19263m.n(), 0, 8);
                        this.f19240T += 8;
                        this.f19250b0 = true;
                        this.f19258h.n()[0] = (byte) ((i13 != 2 ? 0 : 128) | 8);
                        this.f19258h.l(0);
                        y02.g(this.f19258h, 1, 1);
                        this.f19241U++;
                        this.f19263m.l(0);
                        y02.g(this.f19263m, 8, 1);
                        this.f19241U += 8;
                    }
                    if (i13 == 2) {
                        if (!this.f19245Y) {
                            interfaceC3989s0.H(this.f19258h.n(), 0, 1);
                            this.f19240T++;
                            this.f19258h.l(0);
                            this.f19246Z = this.f19258h.C();
                            this.f19245Y = true;
                        }
                        int i14 = this.f19246Z * 4;
                        this.f19258h.i(i14);
                        interfaceC3989s0.H(this.f19258h.n(), 0, i14);
                        this.f19240T += i14;
                        int i15 = (this.f19246Z >> 1) + 1;
                        int i16 = (i15 * 6) + 2;
                        ByteBuffer byteBuffer = this.f19266p;
                        if (byteBuffer == null || byteBuffer.capacity() < i16) {
                            this.f19266p = ByteBuffer.allocate(i16);
                        }
                        this.f19266p.position(0);
                        this.f19266p.putShort((short) i15);
                        int i17 = 0;
                        int i18 = 0;
                        while (true) {
                            i9 = this.f19246Z;
                            if (i17 >= i9) {
                                break;
                            }
                            int F7 = this.f19258h.F();
                            int i19 = F7 - i18;
                            if (i17 % 2 == 0) {
                                this.f19266p.putShort((short) i19);
                            } else {
                                this.f19266p.putInt(i19);
                            }
                            i17++;
                            i18 = F7;
                        }
                        int i20 = (i8 - this.f19240T) - i18;
                        if ((i9 & 1) == 1) {
                            this.f19266p.putInt(i20);
                        } else {
                            this.f19266p.putShort((short) i20);
                            this.f19266p.putInt(0);
                        }
                        this.f19264n.j(this.f19266p.array(), i16);
                        y02.g(this.f19264n, i16, 1);
                        this.f19241U += i16;
                    }
                }
            } else {
                byte[] bArr = s22.f18769i;
                if (bArr != null) {
                    this.f19261k.j(bArr, bArr.length);
                }
            }
            if (!"A_OPUS".equals(s22.f18762b) ? s22.f18766f > 0 : z7) {
                this.f19236P |= 268435456;
                this.f19265o.i(0);
                int u7 = (this.f19261k.u() + i8) - this.f19240T;
                this.f19258h.i(4);
                this.f19258h.n()[0] = (byte) ((u7 >> 24) & 255);
                this.f19258h.n()[1] = (byte) ((u7 >> 16) & 255);
                this.f19258h.n()[2] = (byte) ((u7 >> 8) & 255);
                this.f19258h.n()[3] = (byte) (u7 & 255);
                y02.g(this.f19258h, 4, 2);
                this.f19241U += 4;
            }
            this.f19243W = true;
        }
        int u8 = i8 + this.f19261k.u();
        if (!"V_MPEG4/ISO/AVC".equals(s22.f18762b) && !"V_MPEGH/ISO/HEVC".equals(s22.f18762b)) {
            if (s22.f18755U != null) {
                AbstractC3796qC.f(this.f19261k.u() == 0);
                s22.f18755U.d(interfaceC3989s0);
            }
            while (true) {
                int i21 = this.f19240T;
                if (i21 >= u8) {
                    break;
                }
                int q8 = q(interfaceC3989s0, y02, u8 - i21);
                this.f19240T += q8;
                this.f19241U += q8;
            }
        } else {
            byte[] n8 = this.f19257g.n();
            n8[0] = 0;
            n8[1] = 0;
            n8[2] = 0;
            int i22 = s22.f18760Z;
            int i23 = 4 - i22;
            while (this.f19240T < u8) {
                int i24 = this.f19242V;
                if (i24 == 0) {
                    int min = Math.min(i22, this.f19261k.r());
                    interfaceC3989s0.H(n8, i23 + min, i22 - min);
                    if (min > 0) {
                        this.f19261k.h(n8, i23, min);
                    }
                    this.f19240T += i22;
                    this.f19257g.l(0);
                    this.f19242V = this.f19257g.F();
                    this.f19256f.l(0);
                    y02.a(this.f19256f, 4);
                    this.f19241U += 4;
                } else {
                    int q9 = q(interfaceC3989s0, y02, i24);
                    this.f19240T += q9;
                    this.f19241U += q9;
                    this.f19242V -= q9;
                }
            }
        }
        if ("A_VORBIS".equals(s22.f18762b)) {
            this.f19259i.l(0);
            y02.a(this.f19259i, 4);
            this.f19241U += 4;
        }
        int i25 = this.f19241U;
        w();
        return i25;
    }

    private final int q(InterfaceC3989s0 interfaceC3989s0, Y0 y02, int i8) {
        int r8 = this.f19261k.r();
        if (r8 <= 0) {
            return y02.e(interfaceC3989s0, i8, false);
        }
        int min = Math.min(i8, r8);
        y02.a(this.f19261k, min);
        return min;
    }

    private final long r(long j8) {
        long j9 = this.f19269s;
        if (j9 != -9223372036854775807L) {
            return AbstractC2301cW.M(j8, j9, 1000L, RoundingMode.DOWN);
        }
        throw zzbc.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private final void s(int i8) {
        if (this.f19224D == null || this.f19225E == null) {
            throw zzbc.a("Element " + i8 + " must be in a Cues", null);
        }
    }

    private final void t(int i8) {
        if (this.f19272v != null) {
            return;
        }
        throw zzbc.a("Element " + i8 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e0 A[EDGE_INSN: B:62:0x00e0->B:51:0x00e0 BREAK  A[LOOP:0: B:45:0x00c5->B:50:0x00dd], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void u(com.google.android.gms.internal.ads.S2 r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.U2.u(com.google.android.gms.internal.ads.S2, long, int, int, int):void");
    }

    private final void v(InterfaceC3989s0 interfaceC3989s0, int i8) {
        if (this.f19258h.u() >= i8) {
            return;
        }
        if (this.f19258h.s() < i8) {
            UQ uq = this.f19258h;
            int s8 = uq.s();
            uq.f(Math.max(s8 + s8, i8));
        }
        UQ uq2 = this.f19258h;
        interfaceC3989s0.H(uq2.n(), uq2.u(), i8 - uq2.u());
        this.f19258h.k(i8);
    }

    private final void w() {
        this.f19240T = 0;
        this.f19241U = 0;
        this.f19242V = 0;
        this.f19243W = false;
        this.f19244X = false;
        this.f19245Y = false;
        this.f19246Z = 0;
        this.f19248a0 = (byte) 0;
        this.f19250b0 = false;
        this.f19261k.i(0);
    }

    private final void x(InterfaceC3989s0 interfaceC3989s0, byte[] bArr, int i8) {
        int length = bArr.length;
        int i9 = length + i8;
        if (this.f19262l.s() < i9) {
            UQ uq = this.f19262l;
            byte[] copyOf = Arrays.copyOf(bArr, i9 + i8);
            uq.j(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.f19262l.n(), 0, length);
        }
        interfaceC3989s0.H(this.f19262l.n(), length, i8);
        this.f19262l.l(0);
        this.f19262l.k(i9);
    }

    private static byte[] y(long j8, String str, long j9) {
        AbstractC3796qC.d(j8 != -9223372036854775807L);
        Locale locale = Locale.US;
        int i8 = (int) (j8 / 3600000000L);
        Integer valueOf = Integer.valueOf(i8);
        long j10 = j8 - (i8 * 3600000000L);
        int i9 = (int) (j10 / 60000000);
        Integer valueOf2 = Integer.valueOf(i9);
        long j11 = j10 - (i9 * 60000000);
        int i10 = (int) (j11 / 1000000);
        String format = String.format(locale, str, valueOf, valueOf2, Integer.valueOf(i10), Integer.valueOf((int) ((j11 - (i10 * 1000000)) / j9)));
        int i11 = AbstractC2301cW.f21206a;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    private static int[] z(int[] iArr, int i8) {
        if (iArr == null) {
            return new int[i8];
        }
        int length = iArr.length;
        return length >= i8 ? iArr : new int[Math.max(length + length, i8)];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final /* synthetic */ InterfaceC3880r0 a() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final /* synthetic */ List d() {
        return AbstractC4169th0.w();
    }

    protected final void e(int i8, int i9, InterfaceC3989s0 interfaceC3989s0) {
        int i10;
        long j8;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = i8;
        Throwable th = null;
        int i17 = 1;
        if (i16 != 161 && i16 != 163) {
            if (i16 == 165) {
                if (this.f19228H != 2) {
                    return;
                }
                S2 s22 = (S2) this.f19249b.get(this.f19234N);
                if (this.f19237Q != 4 || !"V_VP9".equals(s22.f18762b)) {
                    interfaceC3989s0.D(i9);
                    return;
                } else {
                    this.f19265o.i(i9);
                    interfaceC3989s0.H(this.f19265o.n(), 0, i9);
                    return;
                }
            }
            if (i16 == 16877) {
                t(i8);
                S2 s23 = this.f19272v;
                if (s23.f18767g != 1685485123 && s23.f18767g != 1685480259) {
                    interfaceC3989s0.D(i9);
                    return;
                }
                byte[] bArr = new byte[i9];
                s23.f18749O = bArr;
                interfaceC3989s0.H(bArr, 0, i9);
                return;
            }
            if (i16 == 16981) {
                t(i8);
                byte[] bArr2 = new byte[i9];
                this.f19272v.f18769i = bArr2;
                interfaceC3989s0.H(bArr2, 0, i9);
                return;
            }
            if (i16 == 18402) {
                byte[] bArr3 = new byte[i9];
                interfaceC3989s0.H(bArr3, 0, i9);
                t(i8);
                this.f19272v.f18770j = new X0(1, bArr3, 0, 0);
                return;
            }
            if (i16 == 21419) {
                Arrays.fill(this.f19260j.n(), (byte) 0);
                interfaceC3989s0.H(this.f19260j.n(), 4 - i9, i9);
                this.f19260j.l(0);
                this.f19274x = (int) this.f19260j.K();
                return;
            }
            if (i16 == 25506) {
                t(i8);
                byte[] bArr4 = new byte[i9];
                this.f19272v.f18771k = bArr4;
                interfaceC3989s0.H(bArr4, 0, i9);
                return;
            }
            if (i16 != 30322) {
                throw zzbc.a("Unexpected id: " + i16, null);
            }
            t(i8);
            byte[] bArr5 = new byte[i9];
            this.f19272v.f18783w = bArr5;
            interfaceC3989s0.H(bArr5, 0, i9);
            return;
        }
        if (this.f19228H == 0) {
            this.f19234N = (int) this.f19247a.d(interfaceC3989s0, false, true, 8);
            this.f19235O = this.f19247a.a();
            this.f19230J = -9223372036854775807L;
            this.f19228H = 1;
            this.f19258h.i(0);
        }
        S2 s24 = (S2) this.f19249b.get(this.f19234N);
        if (s24 == null) {
            interfaceC3989s0.D(i9 - this.f19235O);
            this.f19228H = 0;
            return;
        }
        s24.f18759Y.getClass();
        if (this.f19228H == 1) {
            v(interfaceC3989s0, 3);
            int i18 = (this.f19258h.n()[2] & 6) >> 1;
            byte b8 = 255;
            if (i18 == 0) {
                this.f19232L = 1;
                int[] z7 = z(this.f19233M, 1);
                this.f19233M = z7;
                z7[0] = (i9 - this.f19235O) - 3;
            } else {
                v(interfaceC3989s0, 4);
                int i19 = (this.f19258h.n()[3] & 255) + 1;
                this.f19232L = i19;
                int[] z8 = z(this.f19233M, i19);
                this.f19233M = z8;
                if (i18 == 2) {
                    int i20 = (i9 - this.f19235O) - 4;
                    int i21 = this.f19232L;
                    Arrays.fill(z8, 0, i21, i20 / i21);
                } else {
                    if (i18 != 1) {
                        if (i18 != 3) {
                            throw zzbc.a("Unexpected lacing value: 2", null);
                        }
                        int i22 = 0;
                        int i23 = 0;
                        int i24 = 4;
                        while (true) {
                            int i25 = this.f19232L - 1;
                            if (i22 >= i25) {
                                this.f19233M[i25] = ((i9 - this.f19235O) - i24) - i23;
                                break;
                            }
                            this.f19233M[i22] = 0;
                            int i26 = i24 + 1;
                            v(interfaceC3989s0, i26);
                            if (this.f19258h.n()[i24] == 0) {
                                throw zzbc.a("No valid varint length mask found", th);
                            }
                            int i27 = 0;
                            while (true) {
                                if (i27 >= 8) {
                                    j8 = 0;
                                    i11 = i26;
                                    break;
                                }
                                int i28 = i17 << (7 - i27);
                                if ((this.f19258h.n()[i24] & i28) != 0) {
                                    int i29 = i26 + i27;
                                    v(interfaceC3989s0, i29);
                                    j8 = this.f19258h.n()[i24] & b8 & (~i28);
                                    int i30 = i24 + 1;
                                    while (i30 < i29) {
                                        j8 = (j8 << 8) | (this.f19258h.n()[i30] & b8);
                                        i30++;
                                        i29 = i29;
                                        b8 = 255;
                                    }
                                    i11 = i29;
                                    if (i22 > 0) {
                                        j8 -= (1 << ((i27 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i27++;
                                    i17 = 1;
                                    b8 = 255;
                                }
                            }
                            if (j8 < -2147483648L || j8 > 2147483647L) {
                                break;
                            }
                            int[] iArr = this.f19233M;
                            int i31 = (int) j8;
                            if (i22 != 0) {
                                i31 += iArr[i22 - 1];
                            }
                            iArr[i22] = i31;
                            i23 += i31;
                            i22++;
                            i24 = i11;
                            th = null;
                            i17 = 1;
                            b8 = 255;
                        }
                        throw zzbc.a("EBML lacing sample size out of range.", null);
                    }
                    int i32 = 0;
                    int i33 = 0;
                    int i34 = 4;
                    while (true) {
                        i12 = this.f19232L - 1;
                        if (i32 >= i12) {
                            break;
                        }
                        this.f19233M[i32] = 0;
                        while (true) {
                            i13 = i34 + 1;
                            v(interfaceC3989s0, i13);
                            int i35 = this.f19258h.n()[i34] & 255;
                            int[] iArr2 = this.f19233M;
                            i14 = iArr2[i32] + i35;
                            iArr2[i32] = i14;
                            if (i35 != 255) {
                                break;
                            } else {
                                i34 = i13;
                            }
                        }
                        i33 += i14;
                        i32++;
                        i34 = i13;
                    }
                    this.f19233M[i12] = ((i9 - this.f19235O) - i34) - i33;
                }
            }
            this.f19229I = this.f19223C + r((this.f19258h.n()[0] << 8) | (this.f19258h.n()[1] & 255));
            if (s24.f18764d == 2) {
                i15 = 1;
                this.f19236P = i15;
                this.f19228H = 2;
                this.f19231K = 0;
                i10 = 163;
            } else {
                if (i16 != 163) {
                    i15 = 0;
                } else if ((this.f19258h.n()[2] & 128) == 128) {
                    i16 = 163;
                    i15 = 1;
                } else {
                    i15 = 0;
                    i16 = 163;
                }
                this.f19236P = i15;
                this.f19228H = 2;
                this.f19231K = 0;
                i10 = 163;
            }
        } else {
            i10 = 163;
        }
        if (i16 == i10) {
            while (true) {
                int i36 = this.f19231K;
                if (i36 >= this.f19232L) {
                    this.f19228H = 0;
                    return;
                }
                u(s24, ((this.f19231K * s24.f18765e) / 1000) + this.f19229I, this.f19236P, p(interfaceC3989s0, s24, this.f19233M[i36], false), 0);
                this.f19231K++;
            }
        } else {
            while (true) {
                int i37 = this.f19231K;
                if (i37 >= this.f19232L) {
                    return;
                }
                int[] iArr3 = this.f19233M;
                iArr3[i37] = p(interfaceC3989s0, s24, iArr3[i37], true);
                this.f19231K++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final void f(long j8, long j9) {
        this.f19223C = -9223372036854775807L;
        this.f19228H = 0;
        this.f19254d0.b();
        this.f19247a.e();
        w();
        for (int i8 = 0; i8 < this.f19249b.size(); i8++) {
            Z0 z02 = ((S2) this.f19249b.valueAt(i8)).f18755U;
            if (z02 != null) {
                z02.b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final int g(InterfaceC3989s0 interfaceC3989s0, O0 o02) {
        this.f19227G = false;
        while (!this.f19227G) {
            if (!this.f19254d0.c(interfaceC3989s0)) {
                for (int i8 = 0; i8 < this.f19249b.size(); i8++) {
                    S2 s22 = (S2) this.f19249b.valueAt(i8);
                    s22.f18759Y.getClass();
                    Z0 z02 = s22.f18755U;
                    if (z02 != null) {
                        z02.a(s22.f18759Y, s22.f18770j);
                    }
                }
                return -1;
            }
            long c8 = interfaceC3989s0.c();
            if (this.f19276z) {
                this.f19222B = c8;
                o02.f17813a = this.f19221A;
                this.f19276z = false;
                return 1;
            }
            if (this.f19273w) {
                long j8 = this.f19222B;
                if (j8 != -1) {
                    o02.f17813a = j8;
                    this.f19222B = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final boolean h(InterfaceC3989s0 interfaceC3989s0) {
        return new V2().a(interfaceC3989s0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final void i(InterfaceC4207u0 interfaceC4207u0) {
        if (this.f19253d) {
            interfaceC4207u0 = new C3671p4(interfaceC4207u0, this.f19255e);
        }
        this.f19252c0 = interfaceC4207u0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:186:0x030e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void j(int r21) {
        /*
            Method dump skipped, instructions count: 1138
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.U2.j(int):void");
    }

    protected final void k(int i8, double d8) {
        if (i8 == 181) {
            t(i8);
            this.f19272v.f18752R = (int) d8;
            return;
        }
        if (i8 == 17545) {
            this.f19270t = (long) d8;
            return;
        }
        switch (i8) {
            case 21969:
                t(i8);
                this.f19272v.f18739E = (float) d8;
                break;
            case 21970:
                t(i8);
                this.f19272v.f18740F = (float) d8;
                break;
            case 21971:
                t(i8);
                this.f19272v.f18741G = (float) d8;
                break;
            case 21972:
                t(i8);
                this.f19272v.f18742H = (float) d8;
                break;
            case 21973:
                t(i8);
                this.f19272v.f18743I = (float) d8;
                break;
            case 21974:
                t(i8);
                this.f19272v.f18744J = (float) d8;
                break;
            case 21975:
                t(i8);
                this.f19272v.f18745K = (float) d8;
                break;
            case 21976:
                t(i8);
                this.f19272v.f18746L = (float) d8;
                break;
            case 21977:
                t(i8);
                this.f19272v.f18747M = (float) d8;
                break;
            case 21978:
                t(i8);
                this.f19272v.f18748N = (float) d8;
                break;
            default:
                switch (i8) {
                    case 30323:
                        t(i8);
                        this.f19272v.f18780t = (float) d8;
                        break;
                    case 30324:
                        t(i8);
                        this.f19272v.f18781u = (float) d8;
                        break;
                    case 30325:
                        t(i8);
                        this.f19272v.f18782v = (float) d8;
                        break;
                }
        }
    }

    protected final void l(int i8, long j8) {
        boolean z7;
        if (i8 == 20529) {
            if (j8 == 0) {
                return;
            }
            throw zzbc.a("ContentEncodingOrder " + j8 + " not supported", null);
        }
        if (i8 == 20530) {
            if (j8 == 1) {
                return;
            }
            throw zzbc.a("ContentEncodingScope " + j8 + " not supported", null);
        }
        switch (i8) {
            case 131:
                t(i8);
                this.f19272v.f18764d = (int) j8;
                return;
            case 136:
                z7 = j8 == 1;
                t(i8);
                this.f19272v.f18757W = z7;
                return;
            case 155:
                this.f19230J = r(j8);
                return;
            case 159:
                t(i8);
                this.f19272v.f18750P = (int) j8;
                return;
            case 176:
                t(i8);
                this.f19272v.f18773m = (int) j8;
                return;
            case 179:
                s(i8);
                this.f19224D.c(r(j8));
                return;
            case 186:
                t(i8);
                this.f19272v.f18774n = (int) j8;
                return;
            case 215:
                t(i8);
                this.f19272v.f18763c = (int) j8;
                return;
            case 231:
                this.f19223C = r(j8);
                return;
            case 238:
                this.f19237Q = (int) j8;
                return;
            case 241:
                if (this.f19226F) {
                    return;
                }
                s(i8);
                this.f19225E.c(j8);
                this.f19226F = true;
                return;
            case 251:
                this.f19238R = true;
                return;
            case 16871:
                t(i8);
                this.f19272v.f18767g = (int) j8;
                return;
            case 16980:
                if (j8 == 3) {
                    return;
                }
                throw zzbc.a("ContentCompAlgo " + j8 + " not supported", null);
            case 17029:
                if (j8 < 1 || j8 > 2) {
                    throw zzbc.a("DocTypeReadVersion " + j8 + " not supported", null);
                }
                return;
            case 17143:
                if (j8 == 1) {
                    return;
                }
                throw zzbc.a("EBMLReadVersion " + j8 + " not supported", null);
            case 18401:
                if (j8 == 5) {
                    return;
                }
                throw zzbc.a("ContentEncAlgo " + j8 + " not supported", null);
            case 18408:
                if (j8 == 1) {
                    return;
                }
                throw zzbc.a("AESSettingsCipherMode " + j8 + " not supported", null);
            case 21420:
                this.f19275y = j8 + this.f19268r;
                return;
            case 21432:
                int i9 = (int) j8;
                t(i8);
                if (i9 == 0) {
                    this.f19272v.f18784x = 0;
                    return;
                }
                if (i9 == 1) {
                    this.f19272v.f18784x = 2;
                    return;
                } else if (i9 == 3) {
                    this.f19272v.f18784x = 1;
                    return;
                } else {
                    if (i9 != 15) {
                        return;
                    }
                    this.f19272v.f18784x = 3;
                    return;
                }
            case 21680:
                t(i8);
                this.f19272v.f18776p = (int) j8;
                return;
            case 21682:
                t(i8);
                this.f19272v.f18778r = (int) j8;
                return;
            case 21690:
                t(i8);
                this.f19272v.f18777q = (int) j8;
                return;
            case 21930:
                z7 = j8 == 1;
                t(i8);
                this.f19272v.f18756V = z7;
                return;
            case 21938:
                t(i8);
                S2 s22 = this.f19272v;
                s22.f18785y = true;
                s22.f18775o = (int) j8;
                return;
            case 21998:
                t(i8);
                this.f19272v.f18766f = (int) j8;
                return;
            case 22186:
                t(i8);
                this.f19272v.f18753S = j8;
                return;
            case 22203:
                t(i8);
                this.f19272v.f18754T = j8;
                return;
            case 25188:
                t(i8);
                this.f19272v.f18751Q = (int) j8;
                return;
            case 30114:
                this.f19239S = j8;
                return;
            case 30321:
                int i10 = (int) j8;
                t(i8);
                if (i10 == 0) {
                    this.f19272v.f18779s = 0;
                    return;
                }
                if (i10 == 1) {
                    this.f19272v.f18779s = 1;
                    return;
                } else if (i10 == 2) {
                    this.f19272v.f18779s = 2;
                    return;
                } else {
                    if (i10 != 3) {
                        return;
                    }
                    this.f19272v.f18779s = 3;
                    return;
                }
            case 2352003:
                t(i8);
                this.f19272v.f18765e = (int) j8;
                return;
            case 2807729:
                this.f19269s = j8;
                return;
            default:
                switch (i8) {
                    case 21945:
                        int i11 = (int) j8;
                        t(i8);
                        if (i11 == 1) {
                            this.f19272v.f18736B = 2;
                            return;
                        } else {
                            if (i11 != 2) {
                                return;
                            }
                            this.f19272v.f18736B = 1;
                            return;
                        }
                    case 21946:
                        t(i8);
                        int b8 = Pz0.b((int) j8);
                        if (b8 != -1) {
                            this.f19272v.f18735A = b8;
                            return;
                        }
                        return;
                    case 21947:
                        t(i8);
                        this.f19272v.f18785y = true;
                        int a8 = Pz0.a((int) j8);
                        if (a8 != -1) {
                            this.f19272v.f18786z = a8;
                            return;
                        }
                        return;
                    case 21948:
                        t(i8);
                        this.f19272v.f18737C = (int) j8;
                        return;
                    case 21949:
                        t(i8);
                        this.f19272v.f18738D = (int) j8;
                        return;
                    default:
                        return;
                }
        }
    }

    protected final void m(int i8, long j8, long j9) {
        AbstractC3796qC.b(this.f19252c0);
        if (i8 == 160) {
            this.f19238R = false;
            this.f19239S = 0L;
            return;
        }
        if (i8 == 174) {
            this.f19272v = new S2();
            return;
        }
        if (i8 == 187) {
            this.f19226F = false;
            return;
        }
        if (i8 == 19899) {
            this.f19274x = -1;
            this.f19275y = -1L;
            return;
        }
        if (i8 == 20533) {
            t(i8);
            this.f19272v.f18768h = true;
            return;
        }
        if (i8 == 21968) {
            t(i8);
            this.f19272v.f18785y = true;
            return;
        }
        if (i8 == 408125543) {
            long j10 = this.f19268r;
            if (j10 != -1 && j10 != j8) {
                throw zzbc.a("Multiple Segment elements not supported", null);
            }
            this.f19268r = j8;
            this.f19267q = j9;
            return;
        }
        if (i8 == 475249515) {
            this.f19224D = new C2944iM(32);
            this.f19225E = new C2944iM(32);
        } else if (i8 == 524531317 && !this.f19273w) {
            if (this.f19251c && this.f19221A != -1) {
                this.f19276z = true;
            } else {
                this.f19252c0.Q(new Q0(this.f19271u, 0L));
                this.f19273w = true;
            }
        }
    }

    protected final void n(int i8, String str) {
        if (i8 == 134) {
            t(i8);
            this.f19272v.f18762b = str;
            return;
        }
        if (i8 == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            throw zzbc.a("DocType " + str + " not supported", null);
        }
        if (i8 == 21358) {
            t(i8);
            this.f19272v.f18761a = str;
        } else {
            if (i8 != 2274716) {
                return;
            }
            t(i8);
            this.f19272v.f18758X = str;
        }
    }

    U2(P2 p22, int i8, InterfaceC3344m4 interfaceC3344m4) {
        this.f19268r = -1L;
        this.f19269s = -9223372036854775807L;
        this.f19270t = -9223372036854775807L;
        this.f19271u = -9223372036854775807L;
        this.f19221A = -1L;
        this.f19222B = -1L;
        this.f19223C = -9223372036854775807L;
        this.f19254d0 = p22;
        p22.a(new R2(this, null));
        this.f19255e = interfaceC3344m4;
        this.f19251c = 1 == ((i8 & 1) ^ 1);
        this.f19253d = (i8 & 2) == 0;
        this.f19247a = new W2();
        this.f19249b = new SparseArray();
        this.f19258h = new UQ(4);
        this.f19259i = new UQ(ByteBuffer.allocate(4).putInt(-1).array());
        this.f19260j = new UQ(4);
        this.f19256f = new UQ(AbstractC1366Ha0.f15750a);
        this.f19257g = new UQ(4);
        this.f19261k = new UQ();
        this.f19262l = new UQ();
        this.f19263m = new UQ(8);
        this.f19264n = new UQ();
        this.f19265o = new UQ();
        this.f19233M = new int[1];
    }

    public U2(InterfaceC3344m4 interfaceC3344m4, int i8) {
        this(new P2(), 0, interfaceC3344m4);
    }
}
