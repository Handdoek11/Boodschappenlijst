package M2;

import com.google.android.gms.internal.ads.C1323Fu;
import com.google.android.gms.internal.ads.C1815Tu;
import com.google.android.gms.internal.ads.C3436mw;
import com.google.android.gms.internal.ads.InterfaceC2462dy0;
import com.google.android.gms.internal.ads.InterfaceC4203ty0;
import com.google.android.gms.internal.ads.NZ;

/* loaded from: classes.dex */
public final class d0 implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f3863a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f3864b;

    public d0(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03, InterfaceC4203ty0 interfaceC4203ty04) {
        this.f3863a = interfaceC4203ty0;
        this.f3864b = interfaceC4203ty04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new c0(((C1323Fu) this.f3863a).a(), C3436mw.a(), NZ.b(), ((C1815Tu) this.f3864b).a());
    }
}
