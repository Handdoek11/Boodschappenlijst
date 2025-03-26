package N2;

import android.content.Context;
import com.google.android.gms.internal.ads.InterfaceC2462dy0;
import com.google.android.gms.internal.ads.InterfaceC4203ty0;

/* loaded from: classes.dex */
public final class b implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f4094a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f4095b;

    public b(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f4094a = interfaceC4203ty0;
        this.f4095b = interfaceC4203ty02;
    }

    public static b a(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        return new b(interfaceC4203ty0, interfaceC4203ty02);
    }

    public static a c(Context context, H2.a aVar) {
        return new a(context, aVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a zzb() {
        return c((Context) this.f4094a.zzb(), (H2.a) this.f4095b.zzb());
    }
}
