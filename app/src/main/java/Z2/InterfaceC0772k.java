package Z2;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import o3.AbstractBinderC6287b;

/* renamed from: Z2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0772k extends IInterface {

    /* renamed from: Z2.k$a */
    public static abstract class a extends AbstractBinderC6287b implements InterfaceC0772k {
        public static InterfaceC0772k D0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof InterfaceC0772k ? (InterfaceC0772k) queryLocalInterface : new v0(iBinder);
        }
    }

    Account zzb();
}
