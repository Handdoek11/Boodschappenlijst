package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class V4 implements InterfaceC3562o4 {

    /* renamed from: a, reason: collision with root package name */
    private final UQ f19523a = new UQ();

    @Override // com.google.android.gms.internal.ads.InterfaceC3562o4
    public final void a(byte[] bArr, int i8, int i9, C3453n4 c3453n4, WE we) {
        C3004iy p8;
        this.f19523a.j(bArr, i9 + i8);
        this.f19523a.l(i8);
        ArrayList arrayList = new ArrayList();
        while (true) {
            UQ uq = this.f19523a;
            if (uq.r() <= 0) {
                we.a(new C2692g4(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
            AbstractC3796qC.e(uq.r() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            UQ uq2 = this.f19523a;
            int w7 = uq2.w() - 8;
            if (uq2.w() == 1987343459) {
                UQ uq3 = this.f19523a;
                CharSequence charSequence = null;
                C2677fx c2677fx = null;
                while (w7 > 0) {
                    AbstractC3796qC.e(w7 >= 8, "Incomplete vtt cue box header found.");
                    int w8 = uq3.w();
                    int w9 = uq3.w();
                    int i10 = w7 - 8;
                    int i11 = w8 - 8;
                    String c8 = AbstractC2301cW.c(uq3.n(), uq3.t(), i11);
                    uq3.m(i11);
                    if (w9 == 1937011815) {
                        c2677fx = AbstractC2585f5.b(c8);
                    } else if (w9 == 1885436268) {
                        charSequence = AbstractC2585f5.a(null, c8.trim(), Collections.emptyList());
                    }
                    w7 = i10 - i11;
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (c2677fx != null) {
                    c2677fx.l(charSequence);
                    p8 = c2677fx.p();
                } else {
                    C2368d5 c2368d5 = new C2368d5();
                    c2368d5.f21410c = charSequence;
                    p8 = c2368d5.a().p();
                }
                arrayList.add(p8);
            } else {
                this.f19523a.m(w7);
            }
        }
    }
}
