package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;
import j$.util.Objects;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.cD0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2276cD0 {

    /* renamed from: d, reason: collision with root package name */
    public static final C2276cD0 f21105d;

    /* renamed from: a, reason: collision with root package name */
    public final int f21106a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21107b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC4714yh0 f21108c;

    static {
        C2276cD0 c2276cD0;
        if (AbstractC2301cW.f21206a >= 33) {
            C4605xh0 c4605xh0 = new C4605xh0();
            for (int i8 = 1; i8 <= 10; i8++) {
                c4605xh0.g(Integer.valueOf(AbstractC2301cW.A(i8)));
            }
            c2276cD0 = new C2276cD0(2, c4605xh0.j());
        } else {
            c2276cD0 = new C2276cD0(2, 10);
        }
        f21105d = c2276cD0;
    }

    public C2276cD0(int i8, int i9) {
        this.f21106a = i8;
        this.f21107b = i9;
        this.f21108c = null;
    }

    public final int a(int i8, WR wr) {
        if (this.f21108c != null) {
            return this.f21107b;
        }
        if (AbstractC2301cW.f21206a < 29) {
            Integer num = (Integer) C3254lD0.f24289e.getOrDefault(Integer.valueOf(this.f21106a), 0);
            num.getClass();
            return num.intValue();
        }
        int i9 = this.f21106a;
        for (int i10 = 10; i10 > 0; i10--) {
            int A7 = AbstractC2301cW.A(i10);
            if (A7 != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i9).setSampleRate(i8).setChannelMask(A7).build(), wr.a().f18545a)) {
                return i10;
            }
        }
        return 0;
    }

    public final boolean b(int i8) {
        if (this.f21108c == null) {
            return i8 <= this.f21107b;
        }
        int A7 = AbstractC2301cW.A(i8);
        if (A7 == 0) {
            return false;
        }
        return this.f21108c.contains(Integer.valueOf(A7));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2276cD0)) {
            return false;
        }
        C2276cD0 c2276cD0 = (C2276cD0) obj;
        return this.f21106a == c2276cD0.f21106a && this.f21107b == c2276cD0.f21107b && Objects.equals(this.f21108c, c2276cD0.f21108c);
    }

    public final int hashCode() {
        AbstractC4714yh0 abstractC4714yh0 = this.f21108c;
        return (((this.f21106a * 31) + this.f21107b) * 31) + (abstractC4714yh0 == null ? 0 : abstractC4714yh0.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f21106a + ", maxChannelCount=" + this.f21107b + ", channelMasks=" + String.valueOf(this.f21108c) + "]";
    }

    public C2276cD0(int i8, Set set) {
        this.f21106a = i8;
        AbstractC4714yh0 t7 = AbstractC4714yh0.t(set);
        this.f21108c = t7;
        AbstractC4825zi0 j8 = t7.j();
        int i9 = 0;
        while (j8.hasNext()) {
            i9 = Math.max(i9, Integer.bitCount(((Integer) j8.next()).intValue()));
        }
        this.f21107b = i9;
    }
}
