package Z2;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* loaded from: classes.dex */
public final class f0 extends V {

    /* renamed from: o, reason: collision with root package name */
    private AbstractC0765d f6336o;

    /* renamed from: s, reason: collision with root package name */
    private final int f6337s;

    public f0(AbstractC0765d abstractC0765d, int i8) {
        this.f6336o = abstractC0765d;
        this.f6337s = i8;
    }

    @Override // Z2.InterfaceC0773l
    public final void D2(int i8, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // Z2.InterfaceC0773l
    public final void P1(int i8, IBinder iBinder, j0 j0Var) {
        AbstractC0765d abstractC0765d = this.f6336o;
        r.m(abstractC0765d, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        r.l(j0Var);
        AbstractC0765d.c0(abstractC0765d, j0Var);
        d4(i8, iBinder, j0Var.f6369o);
    }

    @Override // Z2.InterfaceC0773l
    public final void d4(int i8, IBinder iBinder, Bundle bundle) {
        r.m(this.f6336o, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f6336o.N(i8, iBinder, bundle, this.f6337s);
        this.f6336o = null;
    }
}
