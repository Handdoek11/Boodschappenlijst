package l3;

import X2.InterfaceC0756d;
import X2.InterfaceC0761i;
import Z2.AbstractC0769h;
import Z2.C0766e;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C1105d;

/* loaded from: classes.dex */
public final class d extends AbstractC0769h {
    protected d(Context context, Looper looper, C0766e c0766e, InterfaceC0756d interfaceC0756d, InterfaceC0761i interfaceC0761i) {
        super(context, looper, 300, c0766e, interfaceC0756d, interfaceC0761i);
    }

    @Override // Z2.AbstractC0765d
    protected final String E() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // Z2.AbstractC0765d
    protected final String F() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // Z2.AbstractC0765d
    protected final boolean I() {
        return true;
    }

    @Override // Z2.AbstractC0765d
    public final boolean S() {
        return true;
    }

    @Override // Z2.AbstractC0765d, com.google.android.gms.common.api.a.f
    public final int j() {
        return 212800000;
    }

    @Override // Z2.AbstractC0765d
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(iBinder);
    }

    @Override // Z2.AbstractC0765d
    public final C1105d[] v() {
        return S2.h.f5083b;
    }
}
