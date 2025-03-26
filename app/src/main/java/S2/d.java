package S2;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class d extends AbstractC0813a {
    public static final Parcelable.Creator<d> CREATOR = new e();

    /* renamed from: o, reason: collision with root package name */
    private final String f5078o;

    /* renamed from: s, reason: collision with root package name */
    private final String f5079s;

    public d(String str, String str2) {
        this.f5078o = str;
        this.f5079s = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 1, this.f5078o, false);
        AbstractC0814b.s(parcel, 2, this.f5079s, false);
        AbstractC0814b.b(parcel, a8);
    }
}
