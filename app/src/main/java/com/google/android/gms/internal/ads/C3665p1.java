package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.p1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3665p1 implements InterfaceC2795h1 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC4169th0 f25316a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25317b;

    private C3665p1(int i8, AbstractC4169th0 abstractC4169th0) {
        this.f25317b = i8;
        this.f25316a = abstractC4169th0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static C3665p1 b(int i8, UQ uq) {
        InterfaceC2795h1 c3774q1;
        String str;
        C3843qh0 c3843qh0 = new C3843qh0();
        int u7 = uq.u();
        int i9 = -2;
        while (uq.r() > 8) {
            int y7 = uq.y();
            int t7 = uq.t() + uq.y();
            uq.k(t7);
            if (y7 != 1414744396) {
                C3774q1 c3774q12 = null;
                switch (y7) {
                    case 1718776947:
                        if (i9 == 2) {
                            uq.m(4);
                            int y8 = uq.y();
                            int y9 = uq.y();
                            uq.m(4);
                            int y10 = uq.y();
                            switch (y10) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str == null) {
                                HL.f("StreamFormatChunk", "Ignoring track with unsupported compression " + y10);
                            } else {
                                C2723gJ0 c2723gJ0 = new C2723gJ0();
                                c2723gJ0.G(y8);
                                c2723gJ0.k(y9);
                                c2723gJ0.B(str);
                                c3774q12 = new C3774q1(c2723gJ0.H());
                            }
                        } else if (i9 == 1) {
                            int A7 = uq.A();
                            String str2 = A7 != 1 ? A7 != 85 ? A7 != 255 ? A7 != 8192 ? A7 != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                            if (str2 != null) {
                                int A8 = uq.A();
                                int y11 = uq.y();
                                uq.m(6);
                                int F7 = AbstractC2301cW.F(uq.A());
                                int A9 = uq.r() > 0 ? uq.A() : 0;
                                byte[] bArr = new byte[A9];
                                uq.h(bArr, 0, A9);
                                C2723gJ0 c2723gJ02 = new C2723gJ0();
                                c2723gJ02.B(str2);
                                c2723gJ02.r0(A8);
                                c2723gJ02.C(y11);
                                if ("audio/raw".equals(str2) && F7 != 0) {
                                    c2723gJ02.u(F7);
                                }
                                if ("audio/mp4a-latm".equals(str2) && A9 > 0) {
                                    c2723gJ02.n(AbstractC4169th0.x(bArr));
                                }
                                c3774q1 = new C3774q1(c2723gJ02.H());
                                break;
                            } else {
                                HL.f("StreamFormatChunk", "Ignoring track with unsupported format tag " + A7);
                            }
                        } else {
                            HL.f("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(AbstractC2301cW.d(i9)));
                        }
                        c3774q1 = c3774q12;
                        break;
                    case 1751742049:
                        c3774q1 = C3338m1.a(uq);
                        break;
                    case 1752331379:
                        c3774q1 = C3447n1.a(uq);
                        break;
                    case 1852994675:
                        c3774q1 = C3882r1.a(uq);
                        break;
                    default:
                        c3774q1 = c3774q12;
                        break;
                }
            } else {
                c3774q1 = b(uq.y(), uq);
            }
            if (c3774q1 != null) {
                if (c3774q1.zza() == 1752331379) {
                    int i10 = ((C3447n1) c3774q1).f24855a;
                    if (i10 == 1935960438) {
                        i9 = 2;
                    } else if (i10 == 1935963489) {
                        i9 = 1;
                    } else if (i10 != 1937012852) {
                        HL.f("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i10))));
                        i9 = -1;
                    } else {
                        i9 = 3;
                    }
                }
                c3843qh0.g(c3774q1);
            }
            uq.l(t7);
            uq.k(u7);
        }
        return new C3665p1(i8, c3843qh0.j());
    }

    public final InterfaceC2795h1 a(Class cls) {
        AbstractC4169th0 abstractC4169th0 = this.f25316a;
        int size = abstractC4169th0.size();
        int i8 = 0;
        while (i8 < size) {
            InterfaceC2795h1 interfaceC2795h1 = (InterfaceC2795h1) abstractC4169th0.get(i8);
            i8++;
            if (interfaceC2795h1.getClass() == cls) {
                return interfaceC2795h1;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2795h1
    public final int zza() {
        return this.f25317b;
    }
}
