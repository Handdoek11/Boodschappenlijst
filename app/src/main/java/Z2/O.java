package Z2;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public final class O extends AbstractC0813a {
    public static final Parcelable.Creator<O> CREATOR = new P();

    /* renamed from: o, reason: collision with root package name */
    final int f6262o;

    /* renamed from: s, reason: collision with root package name */
    private final Account f6263s;

    /* renamed from: t, reason: collision with root package name */
    private final int f6264t;

    /* renamed from: u, reason: collision with root package name */
    private final GoogleSignInAccount f6265u;

    O(int i8, Account account, int i9, GoogleSignInAccount googleSignInAccount) {
        this.f6262o = i8;
        this.f6263s = account;
        this.f6264t = i9;
        this.f6265u = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f6262o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, i9);
        AbstractC0814b.r(parcel, 2, this.f6263s, i8, false);
        AbstractC0814b.m(parcel, 3, this.f6264t);
        AbstractC0814b.r(parcel, 4, this.f6265u, i8, false);
        AbstractC0814b.b(parcel, a8);
    }

    public O(Account account, int i8, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i8, googleSignInAccount);
    }
}
