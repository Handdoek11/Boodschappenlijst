package D2;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.internal.ads.AbstractBinderC3315lq;
import com.google.android.gms.internal.ads.InterfaceC1242Dl;
import com.google.android.gms.internal.ads.InterfaceC3424mq;
import i3.BinderC5853b;

/* renamed from: D2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0508i extends AbstractC0552x {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f1278b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC1242Dl f1279c;

    C0508i(C0549w c0549w, Context context, InterfaceC1242Dl interfaceC1242Dl) {
        this.f1278b = context;
        this.f1279c = interfaceC1242Dl;
    }

    @Override // D2.AbstractC0552x
    protected final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // D2.AbstractC0552x
    public final /* bridge */ /* synthetic */ Object b(InterfaceC0518l0 interfaceC0518l0) {
        return interfaceC0518l0.L5(BinderC5853b.p2(this.f1278b), this.f1279c, 244410000);
    }

    @Override // D2.AbstractC0552x
    public final /* bridge */ /* synthetic */ Object c() {
        try {
            return ((InterfaceC3424mq) H2.s.b(this.f1278b, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", new H2.r() { // from class: D2.h
                @Override // H2.r
                public final Object a(Object obj) {
                    return AbstractBinderC3315lq.t7((IBinder) obj);
                }
            })).p0(BinderC5853b.p2(this.f1278b), this.f1279c, 244410000);
        } catch (RemoteException | zzr | NullPointerException unused) {
            return null;
        }
    }
}
