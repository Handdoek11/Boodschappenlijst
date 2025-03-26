package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.pG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3696pG0 implements BH0 {

    /* renamed from: o, reason: collision with root package name */
    private final AbstractC4169th0 f25364o;

    /* renamed from: s, reason: collision with root package name */
    private long f25365s;

    public C3696pG0(List list, List list2) {
        C3843qh0 c3843qh0 = new C3843qh0();
        AbstractC3796qC.d(list.size() == list2.size());
        for (int i8 = 0; i8 < list.size(); i8++) {
            c3843qh0.g(new C3587oG0((BH0) list.get(i8), (List) list2.get(i8)));
        }
        this.f25364o = c3843qh0.j();
        this.f25365s = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.BH0
    public final long a() {
        long j8 = Long.MAX_VALUE;
        for (int i8 = 0; i8 < this.f25364o.size(); i8++) {
            long a8 = ((C3587oG0) this.f25364o.get(i8)).a();
            if (a8 != Long.MIN_VALUE) {
                j8 = Math.min(j8, a8);
            }
        }
        if (j8 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j8;
    }

    @Override // com.google.android.gms.internal.ads.BH0
    public final void c(long j8) {
        for (int i8 = 0; i8 < this.f25364o.size(); i8++) {
            ((C3587oG0) this.f25364o.get(i8)).c(j8);
        }
    }

    @Override // com.google.android.gms.internal.ads.BH0
    public final boolean f(Yz0 yz0) {
        boolean z7;
        boolean z8 = false;
        do {
            long a8 = a();
            if (a8 == Long.MIN_VALUE) {
                break;
            }
            z7 = false;
            for (int i8 = 0; i8 < this.f25364o.size(); i8++) {
                long a9 = ((C3587oG0) this.f25364o.get(i8)).a();
                boolean z9 = a9 != Long.MIN_VALUE && a9 <= yz0.f20368a;
                if (a9 == a8 || z9) {
                    z7 |= ((C3587oG0) this.f25364o.get(i8)).f(yz0);
                }
            }
            z8 |= z7;
        } while (z7);
        return z8;
    }

    @Override // com.google.android.gms.internal.ads.BH0
    public final boolean p() {
        for (int i8 = 0; i8 < this.f25364o.size(); i8++) {
            if (((C3587oG0) this.f25364o.get(i8)).p()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.BH0
    public final long zzb() {
        long j8 = Long.MAX_VALUE;
        long j9 = Long.MAX_VALUE;
        for (int i8 = 0; i8 < this.f25364o.size(); i8++) {
            C3587oG0 c3587oG0 = (C3587oG0) this.f25364o.get(i8);
            long zzb = c3587oG0.zzb();
            if ((c3587oG0.g().contains(1) || c3587oG0.g().contains(2) || c3587oG0.g().contains(4)) && zzb != Long.MIN_VALUE) {
                j8 = Math.min(j8, zzb);
            }
            if (zzb != Long.MIN_VALUE) {
                j9 = Math.min(j9, zzb);
            }
        }
        if (j8 != Long.MAX_VALUE) {
            this.f25365s = j8;
            return j8;
        }
        if (j9 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j10 = this.f25365s;
        return j10 != -9223372036854775807L ? j10 : j9;
    }
}
