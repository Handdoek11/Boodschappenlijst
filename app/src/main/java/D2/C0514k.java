package D2;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.internal.ads.AbstractBinderC3636on;
import com.google.android.gms.internal.ads.InterfaceC1242Dl;
import com.google.android.gms.internal.ads.InterfaceC3854qn;
import i3.BinderC5853b;

/* renamed from: D2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0514k extends AbstractC0552x {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f1297b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC1242Dl f1298c;

    C0514k(C0549w c0549w, Context context, InterfaceC1242Dl interfaceC1242Dl) {
        this.f1297b = context;
        this.f1298c = interfaceC1242Dl;
    }

    @Override // D2.AbstractC0552x
    protected final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // D2.AbstractC0552x
    public final /* bridge */ /* synthetic */ Object b(InterfaceC0518l0 interfaceC0518l0) {
        return interfaceC0518l0.K2(BinderC5853b.p2(this.f1297b), this.f1298c, 244410000);
    }

    @Override // D2.AbstractC0552x
    public final /* bridge */ /* synthetic */ Object c() {
        try {
            return ((InterfaceC3854qn) H2.s.b(this.f1297b, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", new H2.r() { // from class: D2.j
                @Override // H2.r
                public final Object a(Object obj) {
                    return AbstractBinderC3636on.t7((IBinder) obj);
                }
            })).p0(BinderC5853b.p2(this.f1297b), this.f1298c, 244410000);
        } catch (RemoteException | zzr | NullPointerException unused) {
            return null;
        }
    }
}
