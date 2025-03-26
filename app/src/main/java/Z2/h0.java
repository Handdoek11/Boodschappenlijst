package Z2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C1103b;

/* loaded from: classes.dex */
public final class h0 extends T {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f6359g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ AbstractC0765d f6360h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(AbstractC0765d abstractC0765d, int i8, IBinder iBinder, Bundle bundle) {
        super(abstractC0765d, i8, bundle);
        this.f6360h = abstractC0765d;
        this.f6359g = iBinder;
    }

    @Override // Z2.T
    protected final void f(C1103b c1103b) {
        if (this.f6360h.f6305v != null) {
            this.f6360h.f6305v.D0(c1103b);
        }
        this.f6360h.L(c1103b);
    }

    @Override // Z2.T
    protected final boolean g() {
        try {
            IBinder iBinder = this.f6359g;
            r.l(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f6360h.E().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + this.f6360h.E() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface s8 = this.f6360h.s(this.f6359g);
            if (s8 == null || !(AbstractC0765d.g0(this.f6360h, 2, 4, s8) || AbstractC0765d.g0(this.f6360h, 3, 4, s8))) {
                return false;
            }
            this.f6360h.f6309z = null;
            AbstractC0765d abstractC0765d = this.f6360h;
            Bundle x7 = abstractC0765d.x();
            if (abstractC0765d.f6304u == null) {
                return true;
            }
            this.f6360h.f6304u.J0(x7);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
