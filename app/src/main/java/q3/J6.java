package q3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class J6 extends AbstractC0813a {
    public static final Parcelable.Creator<J6> CREATOR = new X6();

    /* renamed from: o, reason: collision with root package name */
    private final String f41200o;

    /* renamed from: s, reason: collision with root package name */
    private final String f41201s;

    /* renamed from: t, reason: collision with root package name */
    private final String f41202t;

    /* renamed from: u, reason: collision with root package name */
    private final String f41203u;

    /* renamed from: v, reason: collision with root package name */
    private final String f41204v;

    /* renamed from: w, reason: collision with root package name */
    private final String f41205w;

    /* renamed from: x, reason: collision with root package name */
    private final String f41206x;

    public J6(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f41200o = str;
        this.f41201s = str2;
        this.f41202t = str3;
        this.f41203u = str4;
        this.f41204v = str5;
        this.f41205w = str6;
        this.f41206x = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 1, this.f41200o, false);
        AbstractC0814b.s(parcel, 2, this.f41201s, false);
        AbstractC0814b.s(parcel, 3, this.f41202t, false);
        AbstractC0814b.s(parcel, 4, this.f41203u, false);
        AbstractC0814b.s(parcel, 5, this.f41204v, false);
        AbstractC0814b.s(parcel, 6, this.f41205w, false);
        AbstractC0814b.s(parcel, 7, this.f41206x, false);
        AbstractC0814b.b(parcel, a8);
    }
}
