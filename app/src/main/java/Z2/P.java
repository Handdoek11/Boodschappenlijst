package Z2;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class P implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        Account account = null;
        int i8 = 0;
        int i9 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            int l8 = SafeParcelReader.l(t7);
            if (l8 == 1) {
                i8 = SafeParcelReader.v(parcel, t7);
            } else if (l8 == 2) {
                account = (Account) SafeParcelReader.e(parcel, t7, Account.CREATOR);
            } else if (l8 == 3) {
                i9 = SafeParcelReader.v(parcel, t7);
            } else if (l8 != 4) {
                SafeParcelReader.z(parcel, t7);
            } else {
                googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.e(parcel, t7, GoogleSignInAccount.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new O(i8, account, i9, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new O[i8];
    }
}
