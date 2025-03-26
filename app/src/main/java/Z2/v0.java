package Z2;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import o3.AbstractC6286a;

/* loaded from: classes.dex */
public final class v0 extends AbstractC6286a implements InterfaceC0772k {
    v0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // Z2.InterfaceC0772k
    public final Account zzb() {
        Parcel w02 = w0(2, D0());
        Account account = (Account) o3.c.a(w02, Account.CREATOR);
        w02.recycle();
        return account;
    }
}
