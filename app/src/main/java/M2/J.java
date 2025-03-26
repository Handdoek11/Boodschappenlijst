package M2;

import android.os.Bundle;
import com.google.android.gms.internal.ads.AbstractC1497Kq;
import com.google.android.gms.internal.ads.AbstractC2326ck0;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.AbstractC3332ly0;
import com.google.android.gms.internal.ads.C2056aC;
import com.google.android.gms.internal.ads.C3533nq;
import com.google.android.gms.internal.ads.EnumC3706pN;
import com.google.android.gms.internal.ads.GG;
import com.google.android.gms.internal.ads.InterfaceC2462dy0;
import com.google.android.gms.internal.ads.InterfaceC4203ty0;
import com.google.android.gms.internal.ads.LB;
import com.google.android.gms.internal.ads.M80;
import com.google.android.gms.internal.ads.MB;
import com.google.android.gms.internal.ads.S80;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class J implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f3788a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f3789b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4203ty0 f3790c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4203ty0 f3791d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC4203ty0 f3792e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC4203ty0 f3793f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC4203ty0 f3794g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC4203ty0 f3795h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC4203ty0 f3796i;

    public J(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03, InterfaceC4203ty0 interfaceC4203ty04, InterfaceC4203ty0 interfaceC4203ty05, InterfaceC4203ty0 interfaceC4203ty06, InterfaceC4203ty0 interfaceC4203ty07, InterfaceC4203ty0 interfaceC4203ty08, InterfaceC4203ty0 interfaceC4203ty09) {
        this.f3788a = interfaceC4203ty0;
        this.f3789b = interfaceC4203ty02;
        this.f3790c = interfaceC4203ty03;
        this.f3791d = interfaceC4203ty04;
        this.f3792e = interfaceC4203ty05;
        this.f3793f = interfaceC4203ty06;
        this.f3794g = interfaceC4203ty07;
        this.f3795h = interfaceC4203ty08;
        this.f3796i = interfaceC4203ty09;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        com.google.common.util.concurrent.d a8;
        BinderC0675w binderC0675w = (BinderC0675w) this.f3788a.zzb();
        S80 s80 = (S80) this.f3789b.zzb();
        L zzb = ((M) this.f3790c).zzb();
        LB zzb2 = ((MB) this.f3791d).zzb();
        GG gg = (GG) this.f3792e.zzb();
        C c8 = (C) this.f3793f.zzb();
        C3533nq c3533nq = (C3533nq) this.f3794g.zzb();
        int intValue = ((Integer) this.f3795h.zzb()).intValue();
        Bundle bundle = ((C2056aC) this.f3796i).a().f16781s;
        N n8 = null;
        if (intValue == 1 && c3533nq != null) {
            bundle.putLong(EnumC3706pN.READ_FROM_DISK_START.a(), C2.v.c().a());
            n8 = c8.a(c3533nq, binderC0675w, bundle);
            bundle.putLong(EnumC3706pN.READ_FROM_DISK_END.a(), C2.v.c().a());
        }
        if (n8 != null) {
            gg.m1(n8);
            a8 = AbstractC2326ck0.h(n8);
        } else {
            a8 = s80.b(M80.GENERATE_SIGNALS, zzb2.c()).f(zzb).i(((Integer) D2.A.c().a(AbstractC3184kf.f24055y5)).intValue(), TimeUnit.SECONDS).a();
            AbstractC2326ck0.r(a8, new C0677y(gg), AbstractC1497Kq.f16644a);
        }
        AbstractC3332ly0.b(a8);
        return a8;
    }
}
