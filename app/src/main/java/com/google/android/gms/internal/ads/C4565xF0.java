package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.xF0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4565xF0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f27773a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27774b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27775c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f27776d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f27777e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f27778f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f27779g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f27780h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f27781i;

    C4565xF0(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        str.getClass();
        this.f27773a = str;
        this.f27774b = str2;
        this.f27775c = str3;
        this.f27776d = codecCapabilities;
        this.f27779g = z7;
        this.f27777e = z10;
        this.f27778f = z12;
        this.f27780h = z13;
        this.f27781i = AbstractC1650Pc.i(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.C4565xF0 c(java.lang.String r13, java.lang.String r14, java.lang.String r15, android.media.MediaCodecInfo.CodecCapabilities r16, boolean r17, boolean r18, boolean r19, boolean r20, boolean r21) {
        /*
            r1 = r13
            r4 = r16
            com.google.android.gms.internal.ads.xF0 r12 = new com.google.android.gms.internal.ads.xF0
            r0 = 1
            r2 = 0
            if (r4 == 0) goto L3c
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r4.isFeatureSupported(r3)
            if (r3 == 0) goto L3c
            int r3 = com.google.android.gms.internal.ads.AbstractC2301cW.f21206a
            r5 = 22
            if (r3 > r5) goto L2a
            java.lang.String r3 = com.google.android.gms.internal.ads.AbstractC2301cW.f21209d
            java.lang.String r5 = "ODROID-XU3"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L2c
            java.lang.String r5 = "Nexus 10"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L2a
            goto L2c
        L2a:
            r8 = r0
            goto L3d
        L2c:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r13)
            if (r3 != 0) goto L3c
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r13)
            if (r3 == 0) goto L2a
        L3c:
            r8 = r2
        L3d:
            if (r4 == 0) goto L49
            java.lang.String r3 = "tunneled-playback"
            boolean r3 = r4.isFeatureSupported(r3)
            if (r3 == 0) goto L49
            r9 = r0
            goto L4a
        L49:
            r9 = r2
        L4a:
            if (r21 != 0) goto L56
            if (r4 == 0) goto L58
            java.lang.String r3 = "secure-playback"
            boolean r3 = r4.isFeatureSupported(r3)
            if (r3 == 0) goto L58
        L56:
            r10 = r0
            goto L59
        L58:
            r10 = r2
        L59:
            int r3 = com.google.android.gms.internal.ads.AbstractC2301cW.f21206a
            r5 = 35
            if (r3 < r5) goto L6b
            if (r4 == 0) goto L6b
            java.lang.String r3 = "detached-surface"
            boolean r3 = r4.isFeatureSupported(r3)
            if (r3 == 0) goto L6b
            r11 = r0
            goto L6c
        L6b:
            r11 = r2
        L6c:
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4565xF0.c(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.internal.ads.xF0");
    }

    private static Point i(MediaCodecInfo.VideoCapabilities videoCapabilities, int i8, int i9) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i10 = AbstractC2301cW.f21206a;
        return new Point((((i8 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i9 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    private final void j(String str) {
        HL.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f27773a + ", " + this.f27774b + "] [" + AbstractC2301cW.f21210e + "]");
    }

    private static boolean k(MediaCodecInfo.VideoCapabilities videoCapabilities, int i8, int i9, double d8) {
        Point i10 = i(videoCapabilities, i8, i9);
        int i11 = i10.x;
        int i12 = i10.y;
        return (d8 == -1.0d || d8 < 1.0d) ? videoCapabilities.isSizeSupported(i11, i12) : videoCapabilities.areSizeAndRateSupported(i11, i12, Math.floor(d8));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean l(com.google.android.gms.internal.ads.D r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4565xF0.l(com.google.android.gms.internal.ads.D, boolean):boolean");
    }

    private final boolean m(D d8) {
        return this.f27774b.equals(d8.f14334o) || this.f27774b.equals(AbstractC2065aG0.b(d8));
    }

    public final Point a(int i8, int i9) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f27776d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return i(videoCapabilities, i8, i9);
    }

    public final Iy0 b(D d8, D d9) {
        int i8 = true != Objects.equals(d8.f14334o, d9.f14334o) ? 8 : 0;
        if (this.f27781i) {
            if (d8.f14344y != d9.f14344y) {
                i8 |= 1024;
            }
            if (!this.f27777e && (d8.f14341v != d9.f14341v || d8.f14342w != d9.f14342w)) {
                i8 |= 512;
            }
            if ((!Pz0.g(d8.f14310C) || !Pz0.g(d9.f14310C)) && !Objects.equals(d8.f14310C, d9.f14310C)) {
                i8 |= 2048;
            }
            String str = this.f27773a;
            if (AbstractC2301cW.f21209d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !d8.d(d9)) {
                i8 |= 2;
            }
            if (i8 == 0) {
                return new Iy0(this.f27773a, d8, d9, true == d8.d(d9) ? 3 : 2, 0);
            }
        } else {
            if (d8.f14311D != d9.f14311D) {
                i8 |= 4096;
            }
            if (d8.f14312E != d9.f14312E) {
                i8 |= 8192;
            }
            if (d8.f14313F != d9.f14313F) {
                i8 |= 16384;
            }
            if (i8 == 0 && "audio/mp4a-latm".equals(this.f27774b)) {
                int i9 = AbstractC2065aG0.f20673b;
                Pair a8 = AbstractC4015sD.a(d8);
                Pair a9 = AbstractC4015sD.a(d9);
                if (a8 != null && a9 != null) {
                    int intValue = ((Integer) a8.first).intValue();
                    int intValue2 = ((Integer) a9.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new Iy0(this.f27773a, d8, d9, 3, 0);
                    }
                }
            }
            if (!d8.d(d9)) {
                i8 |= 32;
            }
            if ("audio/opus".equals(this.f27774b)) {
                i8 |= 2;
            }
            if (i8 == 0) {
                return new Iy0(this.f27773a, d8, d9, 1, 0);
            }
        }
        return new Iy0(this.f27773a, d8, d9, 0, i8);
    }

    public final boolean d(D d8) {
        return m(d8) && l(d8, false);
    }

    public final boolean e(D d8) {
        int i8;
        if (!m(d8) || !l(d8, true)) {
            return false;
        }
        if (this.f27781i) {
            int i9 = d8.f14341v;
            if (i9 <= 0 || (i8 = d8.f14342w) <= 0) {
                return true;
            }
            return g(i9, i8, d8.f14343x);
        }
        int i10 = d8.f14312E;
        if (i10 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f27776d;
            if (codecCapabilities == null) {
                j("sampleRate.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                j("sampleRate.aCaps");
                return false;
            }
            if (!audioCapabilities.isSampleRateSupported(i10)) {
                j("sampleRate.support, " + i10);
                return false;
            }
        }
        int i11 = d8.f14311D;
        if (i11 == -1) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.f27776d;
        if (codecCapabilities2 == null) {
            j("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
        if (audioCapabilities2 == null) {
            j("channelCount.aCaps");
            return false;
        }
        String str = this.f27773a;
        String str2 = this.f27774b;
        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
        if (maxInputChannelCount <= 1 && ((AbstractC2301cW.f21206a < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
            int i12 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
            HL.f("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i12 + "]");
            maxInputChannelCount = i12;
        }
        if (maxInputChannelCount >= i11) {
            return true;
        }
        j("channelCount.support, " + i11);
        return false;
    }

    public final boolean f(D d8) {
        if (this.f27781i) {
            return this.f27777e;
        }
        int i8 = AbstractC2065aG0.f20673b;
        Pair a8 = AbstractC4015sD.a(d8);
        return a8 != null && ((Integer) a8.first).intValue() == 42;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(int r8, int r9, double r10) {
        /*
            r7 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r7.f27776d
            r1 = 0
            if (r0 != 0) goto Lb
            java.lang.String r8 = "sizeAndRate.caps"
            r7.j(r8)
            return r1
        Lb:
            android.media.MediaCodecInfo$VideoCapabilities r0 = r0.getVideoCapabilities()
            if (r0 != 0) goto L17
            java.lang.String r8 = "sizeAndRate.vCaps"
            r7.j(r8)
            return r1
        L17:
            int r2 = com.google.android.gms.internal.ads.AbstractC2301cW.f21206a
            r3 = 29
            r4 = 1
            java.lang.String r5 = "@"
            java.lang.String r6 = "x"
            if (r2 < r3) goto L4f
            int r2 = com.google.android.gms.internal.ads.EF0.a(r0, r8, r9, r10)
            r3 = 2
            if (r2 != r3) goto L2b
            goto Le8
        L2b:
            if (r2 == r4) goto L2e
            goto L4f
        L2e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "sizeAndRate.cover, "
            r0.append(r2)
            r0.append(r8)
            r0.append(r6)
            r0.append(r9)
            r0.append(r5)
            r0.append(r10)
            java.lang.String r8 = r0.toString()
            r7.j(r8)
            return r1
        L4f:
            boolean r2 = k(r0, r8, r9, r10)
            if (r2 != 0) goto Le8
            if (r8 >= r9) goto Lc7
            java.lang.String r2 = r7.f27773a
            java.lang.String r3 = "OMX.MTK.VIDEO.DECODER.HEVC"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L6b
            java.lang.String r2 = "mcv5a"
            java.lang.String r3 = com.google.android.gms.internal.ads.AbstractC2301cW.f21207b
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lc7
        L6b:
            boolean r0 = k(r0, r9, r8, r10)
            if (r0 != 0) goto L72
            goto Lc7
        L72:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "sizeAndRate.rotated, "
            r0.append(r1)
            r0.append(r8)
            r0.append(r6)
            r0.append(r9)
            r0.append(r5)
            r0.append(r10)
            java.lang.String r8 = r0.toString()
            java.lang.String r9 = r7.f27773a
            java.lang.String r10 = r7.f27774b
            java.lang.String r11 = com.google.android.gms.internal.ads.AbstractC2301cW.f21210e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AssumedSupport ["
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = "] ["
            r0.append(r8)
            r0.append(r9)
            java.lang.String r9 = ", "
            r0.append(r9)
            r0.append(r10)
            r0.append(r8)
            r0.append(r11)
            java.lang.String r8 = "]"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.String r9 = "MediaCodecInfo"
            com.google.android.gms.internal.ads.HL.b(r9, r8)
            goto Le8
        Lc7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "sizeAndRate.support, "
            r0.append(r2)
            r0.append(r8)
            r0.append(r6)
            r0.append(r9)
            r0.append(r5)
            r0.append(r10)
            java.lang.String r8 = r0.toString()
            r7.j(r8)
            return r1
        Le8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4565xF0.g(int, int, double):boolean");
    }

    public final MediaCodecInfo.CodecProfileLevel[] h() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f27776d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public final String toString() {
        return this.f27773a;
    }
}
