package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class A extends AbstractC0813a {
    public static final Parcelable.Creator<A> CREATOR = new B();

    /* renamed from: o, reason: collision with root package name */
    private final int f845o;

    /* renamed from: s, reason: collision with root package name */
    private final String f846s;

    public A(int i8, String str) {
        this.f845o = i8;
        this.f846s = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a8 = (A) obj;
        return this.f845o == a8.f845o && Objects.equals(this.f846s, a8.f846s);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f845o), this.f846s);
    }

    public final String toString() {
        String str;
        int i8 = this.f845o;
        switch (i8) {
            case -9:
                str = "Migration was cancelled";
                break;
            case -8:
                str = "Another migration is already in progress";
                break;
            case -7:
                str = "Connect message malformed";
                break;
            case -6:
                str = "Migration status mismatch between watch and phone";
                break;
            case -5:
                str = "Phone switching feature disabled";
                break;
            case -4:
                str = "Did not receive connect msg";
                break;
            case -3:
                str = "No bluetooth connection";
                break;
            case -2:
                str = "Accounts mismatch";
                break;
            case -1:
                str = "Unknown failure";
                break;
            case 0:
                str = "Connected";
                break;
            case 1:
                str = "Connection handshake in progress";
                break;
            case 2:
                str = "Connection handshake complete";
                break;
            case 3:
                str = "Sync with old node suspended";
                break;
            case 4:
                str = "Control plane transport connected";
                break;
            case 5:
                str = "Accounts Matched";
                break;
            case 6:
                str = "Association to watch terminated";
                break;
            default:
                str = "Unrecognized state value: " + i8;
                break;
        }
        return String.format("ConnectionStateEvent: address: %s, state: %s", this.f846s, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f845o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, i9);
        AbstractC0814b.s(parcel, 2, this.f846s, false);
        AbstractC0814b.b(parcel, a8);
    }
}
