package Z2;

import Z2.InterfaceC0772k;
import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: Z2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0762a extends InterfaceC0772k.a {
    public static Account J0(InterfaceC0772k interfaceC0772k) {
        Account account = null;
        if (interfaceC0772k != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                try {
                    account = interfaceC0772k.zzb();
                } catch (RemoteException unused) {
                    Log.w("AccountAccessor", "Remote account accessor probably died");
                }
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return account;
    }
}
