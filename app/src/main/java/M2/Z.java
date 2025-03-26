package M2;

import android.content.pm.PackageInfo;
import com.google.android.gms.internal.ads.C1323Fu;
import com.google.android.gms.internal.ads.InterfaceC2462dy0;
import com.google.android.gms.internal.ads.InterfaceC4203ty0;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class Z implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f3831a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f3832b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4203ty0 f3833c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4203ty0 f3834d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC4203ty0 f3835e;

    public Z(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03, InterfaceC4203ty0 interfaceC4203ty04, InterfaceC4203ty0 interfaceC4203ty05) {
        this.f3831a = interfaceC4203ty0;
        this.f3832b = interfaceC4203ty02;
        this.f3833c = interfaceC4203ty03;
        this.f3834d = interfaceC4203ty04;
        this.f3835e = interfaceC4203ty05;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C(((C1323Fu) this.f3831a).a(), ((Long) this.f3832b.zzb()).longValue(), (PackageInfo) this.f3833c.zzb(), (a0) this.f3834d.zzb(), (ScheduledExecutorService) this.f3835e.zzb());
    }
}
