package C3;

import B3.InterfaceC0405y;
import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class W1 extends AbstractC0813a implements InterfaceC0405y {
    public static final Parcelable.Creator<W1> CREATOR = new j2();

    /* renamed from: o, reason: collision with root package name */
    private final byte f914o;

    /* renamed from: s, reason: collision with root package name */
    private final byte f915s;

    /* renamed from: t, reason: collision with root package name */
    private final String f916t;

    public W1(byte b8, byte b9, String str) {
        this.f914o = b8;
        this.f915s = b9;
        this.f916t = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || W1.class != obj.getClass()) {
            return false;
        }
        W1 w12 = (W1) obj;
        return this.f914o == w12.f914o && this.f915s == w12.f915s && this.f916t.equals(w12.f916t);
    }

    public final int hashCode() {
        return ((((this.f914o + 31) * 31) + this.f915s) * 31) + this.f916t.hashCode();
    }

    public final String toString() {
        return "AmsEntityUpdateParcelable{, mEntityId=" + ((int) this.f914o) + ", mAttributeId=" + ((int) this.f915s) + ", mValue='" + this.f916t + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.f(parcel, 2, this.f914o);
        AbstractC0814b.f(parcel, 3, this.f915s);
        AbstractC0814b.s(parcel, 4, this.f916t, false);
        AbstractC0814b.b(parcel, a8);
    }
}
