package M2;

import com.google.android.gms.internal.ads.C3041jG;
import com.google.android.gms.internal.ads.C3244l80;
import com.google.android.gms.internal.ads.DG;
import com.google.android.gms.internal.ads.InterfaceC2462dy0;
import com.google.android.gms.internal.ads.InterfaceC4203ty0;
import com.google.android.gms.internal.ads.InterfaceExecutorServiceC3522nk0;

/* loaded from: classes.dex */
public final class I implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f3785a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f3786b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4203ty0 f3787c;

    public I(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03, InterfaceC4203ty0 interfaceC4203ty04) {
        this.f3785a = interfaceC4203ty0;
        this.f3786b = interfaceC4203ty02;
        this.f3787c = interfaceC4203ty04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        DG dg = (t0) this.f3785a.zzb();
        DG dg2 = (P) this.f3786b.zzb();
        InterfaceExecutorServiceC3522nk0 b8 = C3244l80.b();
        if (((Integer) this.f3787c.zzb()).intValue() == 2) {
            dg = dg2;
        }
        return new C3041jG(dg, b8);
    }
}
