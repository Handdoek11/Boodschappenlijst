package Z2;

import a3.AbstractC0814b;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C1105d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class m0 implements Parcelable.Creator {
    static void a(C0768g c0768g, Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, c0768g.f6345o);
        AbstractC0814b.m(parcel, 2, c0768g.f6346s);
        AbstractC0814b.m(parcel, 3, c0768g.f6347t);
        AbstractC0814b.s(parcel, 4, c0768g.f6348u, false);
        AbstractC0814b.l(parcel, 5, c0768g.f6349v, false);
        AbstractC0814b.v(parcel, 6, c0768g.f6350w, i8, false);
        AbstractC0814b.e(parcel, 7, c0768g.f6351x, false);
        AbstractC0814b.r(parcel, 8, c0768g.f6352y, i8, false);
        AbstractC0814b.v(parcel, 10, c0768g.f6353z, i8, false);
        AbstractC0814b.v(parcel, 11, c0768g.f6340A, i8, false);
        AbstractC0814b.c(parcel, 12, c0768g.f6341B);
        AbstractC0814b.m(parcel, 13, c0768g.f6342C);
        AbstractC0814b.c(parcel, 14, c0768g.f6343D);
        AbstractC0814b.s(parcel, 15, c0768g.A0(), false);
        AbstractC0814b.b(parcel, a8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        Scope[] scopeArr = C0768g.f6338F;
        Bundle bundle = new Bundle();
        C1105d[] c1105dArr = C0768g.f6339G;
        C1105d[] c1105dArr2 = c1105dArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        boolean z7 = false;
        int i11 = 0;
        boolean z8 = false;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t7)) {
                case 1:
                    i8 = SafeParcelReader.v(parcel, t7);
                    break;
                case 2:
                    i9 = SafeParcelReader.v(parcel, t7);
                    break;
                case 3:
                    i10 = SafeParcelReader.v(parcel, t7);
                    break;
                case 4:
                    str = SafeParcelReader.f(parcel, t7);
                    break;
                case 5:
                    iBinder = SafeParcelReader.u(parcel, t7);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.i(parcel, t7, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.a(parcel, t7);
                    break;
                case 8:
                    account = (Account) SafeParcelReader.e(parcel, t7, Account.CREATOR);
                    break;
                case 9:
                default:
                    SafeParcelReader.z(parcel, t7);
                    break;
                case 10:
                    c1105dArr = (C1105d[]) SafeParcelReader.i(parcel, t7, C1105d.CREATOR);
                    break;
                case 11:
                    c1105dArr2 = (C1105d[]) SafeParcelReader.i(parcel, t7, C1105d.CREATOR);
                    break;
                case 12:
                    z7 = SafeParcelReader.m(parcel, t7);
                    break;
                case 13:
                    i11 = SafeParcelReader.v(parcel, t7);
                    break;
                case 14:
                    z8 = SafeParcelReader.m(parcel, t7);
                    break;
                case 15:
                    str2 = SafeParcelReader.f(parcel, t7);
                    break;
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new C0768g(i8, i9, i10, str, iBinder, scopeArr, bundle, account, c1105dArr, c1105dArr2, z7, i11, z8, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C0768g[i8];
    }
}
