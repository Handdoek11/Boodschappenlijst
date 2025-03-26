package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.g5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2694g5 implements InterfaceC3562o4 {

    /* renamed from: a, reason: collision with root package name */
    private final UQ f22226a = new UQ();

    /* renamed from: b, reason: collision with root package name */
    private final W4 f22227b = new W4();

    @Override // com.google.android.gms.internal.ads.InterfaceC3562o4
    public final void a(byte[] bArr, int i8, int i9, C3453n4 c3453n4, WE we) {
        this.f22226a.j(bArr, i9 + i8);
        this.f22226a.l(i8);
        ArrayList arrayList = new ArrayList();
        try {
            UQ uq = this.f22226a;
            int t7 = uq.t();
            Charset charset = StandardCharsets.UTF_8;
            String P7 = uq.P(charset);
            if (P7 == null || !P7.startsWith("WEBVTT")) {
                uq.l(t7);
                throw zzbc.a("Expected WEBVTT. Got ".concat(String.valueOf(uq.P(charset))), null);
            }
            while (!TextUtils.isEmpty(this.f22226a.P(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                UQ uq2 = this.f22226a;
                char c8 = 65535;
                int i10 = 0;
                while (c8 == 65535) {
                    i10 = uq2.t();
                    String P8 = uq2.P(StandardCharsets.UTF_8);
                    c8 = P8 == null ? (char) 0 : "STYLE".equals(P8) ? (char) 2 : P8.startsWith("NOTE") ? (char) 1 : (char) 3;
                }
                uq2.l(i10);
                if (c8 == 0) {
                    AbstractC2910i4.a(new C3019j5(arrayList2), c3453n4, we);
                    return;
                }
                if (c8 == 1) {
                    while (!TextUtils.isEmpty(this.f22226a.P(StandardCharsets.UTF_8))) {
                    }
                } else if (c8 != 2) {
                    Y4 c9 = AbstractC2585f5.c(this.f22226a, arrayList);
                    if (c9 != null) {
                        arrayList2.add(c9);
                    }
                } else {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.f22226a.P(StandardCharsets.UTF_8);
                    arrayList.addAll(this.f22227b.b(this.f22226a));
                }
            }
        } catch (zzbc e8) {
            throw new IllegalArgumentException(e8);
        }
    }
}
