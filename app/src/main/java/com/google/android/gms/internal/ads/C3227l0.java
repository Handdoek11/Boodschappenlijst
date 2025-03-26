package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3227l0 implements InterfaceC4425w0 {

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f24240c = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* renamed from: d, reason: collision with root package name */
    private static final C3118k0 f24241d = new C3118k0(new InterfaceC3009j0() { // from class: com.google.android.gms.internal.ads.h0
        @Override // com.google.android.gms.internal.ads.InterfaceC3009j0
        public final Constructor zza() {
            if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(InterfaceC3880r0.class).getConstructor(Integer.TYPE);
            }
            return null;
        }
    });

    /* renamed from: e, reason: collision with root package name */
    private static final C3118k0 f24242e = new C3118k0(new InterfaceC3009j0() { // from class: com.google.android.gms.internal.ads.i0
        @Override // com.google.android.gms.internal.ads.InterfaceC3009j0
        public final Constructor zza() {
            return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(InterfaceC3880r0.class).getConstructor(null);
        }
    });

    /* renamed from: a, reason: collision with root package name */
    private AbstractC4169th0 f24243a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3344m4 f24244b = new C2801h4();

    private final void b(int i8, List list) {
        switch (i8) {
            case 0:
                list.add(new C3237l5());
                break;
            case 1:
                list.add(new C3455n5());
                break;
            case 2:
                list.add(new C3673p5(0));
                break;
            case 3:
                list.add(new C2686g1(0));
                break;
            case 4:
                InterfaceC3880r0 a8 = f24241d.a(0);
                if (a8 == null) {
                    list.add(new C4645y1(0));
                    break;
                } else {
                    list.add(a8);
                    break;
                }
            case 5:
                list.add(new A1());
                break;
            case 6:
                list.add(new U2(this.f24244b, 0));
                break;
            case 7:
                list.add(new Z2(0));
                break;
            case 8:
                list.add(new C4649y3(this.f24244b, 0, null, null, AbstractC4169th0.w(), null));
                list.add(new D3(this.f24244b, 0));
                break;
            case 9:
                list.add(new U3());
                break;
            case 10:
                list.add(new V5());
                break;
            case 11:
                if (this.f24243a == null) {
                    this.f24243a = AbstractC4169th0.w();
                }
                list.add(new C2587f6(1, 0, this.f24244b, new BU(0L), new C3890r5(0, this.f24243a), 112800));
                break;
            case 12:
                list.add(new C3892r6());
                break;
            case 14:
                list.add(new G1(0));
                break;
            case 15:
                InterfaceC3880r0 a9 = f24242e.a(new Object[0]);
                if (a9 != null) {
                    list.add(a9);
                    break;
                }
                break;
            case 16:
                list.add(new C3229l1(0, this.f24244b));
                break;
            case 17:
                list.add(new C2583f4());
                break;
            case 18:
                list.add(new C4437w6());
                break;
            case 19:
                list.add(new C4100t1());
                break;
            case 20:
                list.add(new E1());
                break;
            case C1445Je.zzm /* 21 */:
                list.add(new C3991s1());
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0204  */
    @Override // com.google.android.gms.internal.ads.InterfaceC4425w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.google.android.gms.internal.ads.InterfaceC3880r0[] a(android.net.Uri r25, java.util.Map r26) {
        /*
            Method dump skipped, instructions count: 1180
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3227l0.a(android.net.Uri, java.util.Map):com.google.android.gms.internal.ads.r0[]");
    }
}
