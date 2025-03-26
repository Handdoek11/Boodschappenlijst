package d3;

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
public final class y extends AbstractC0769h {
    protected y(Context context, Looper looper, C0766e c0766e, InterfaceC0756d interfaceC0756d, InterfaceC0761i interfaceC0761i) {
        super(context, looper, 308, c0766e, interfaceC0756d, interfaceC0761i);
    }

    @Override // Z2.AbstractC0765d
    protected final String E() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    @Override // Z2.AbstractC0765d
    protected final String F() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
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
        return 17895000;
    }

    @Override // Z2.AbstractC0765d
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        return queryLocalInterface instanceof C5719i ? (C5719i) queryLocalInterface : new C5719i(iBinder);
    }

    @Override // Z2.AbstractC0765d
    public final C1105d[] v() {
        return m3.i.f38967b;
    }
}
