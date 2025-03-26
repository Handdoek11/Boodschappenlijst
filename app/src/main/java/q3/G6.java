package q3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class G6 extends AbstractC0813a {
    public static final Parcelable.Creator<G6> CREATOR = new U6();

    /* renamed from: A, reason: collision with root package name */
    private final String f41131A;

    /* renamed from: B, reason: collision with root package name */
    private final String f41132B;

    /* renamed from: C, reason: collision with root package name */
    private final String f41133C;

    /* renamed from: D, reason: collision with root package name */
    private final String f41134D;

    /* renamed from: E, reason: collision with root package name */
    private final String f41135E;

    /* renamed from: o, reason: collision with root package name */
    private final String f41136o;

    /* renamed from: s, reason: collision with root package name */
    private final String f41137s;

    /* renamed from: t, reason: collision with root package name */
    private final String f41138t;

    /* renamed from: u, reason: collision with root package name */
    private final String f41139u;

    /* renamed from: v, reason: collision with root package name */
    private final String f41140v;

    /* renamed from: w, reason: collision with root package name */
    private final String f41141w;

    /* renamed from: x, reason: collision with root package name */
    private final String f41142x;

    /* renamed from: y, reason: collision with root package name */
    private final String f41143y;

    /* renamed from: z, reason: collision with root package name */
    private final String f41144z;

    public G6(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f41136o = str;
        this.f41137s = str2;
        this.f41138t = str3;
        this.f41139u = str4;
        this.f41140v = str5;
        this.f41141w = str6;
        this.f41142x = str7;
        this.f41143y = str8;
        this.f41144z = str9;
        this.f41131A = str10;
        this.f41132B = str11;
        this.f41133C = str12;
        this.f41134D = str13;
        this.f41135E = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 1, this.f41136o, false);
        AbstractC0814b.s(parcel, 2, this.f41137s, false);
        AbstractC0814b.s(parcel, 3, this.f41138t, false);
        AbstractC0814b.s(parcel, 4, this.f41139u, false);
        AbstractC0814b.s(parcel, 5, this.f41140v, false);
        AbstractC0814b.s(parcel, 6, this.f41141w, false);
        AbstractC0814b.s(parcel, 7, this.f41142x, false);
        AbstractC0814b.s(parcel, 8, this.f41143y, false);
        AbstractC0814b.s(parcel, 9, this.f41144z, false);
        AbstractC0814b.s(parcel, 10, this.f41131A, false);
        AbstractC0814b.s(parcel, 11, this.f41132B, false);
        AbstractC0814b.s(parcel, 12, this.f41133C, false);
        AbstractC0814b.s(parcel, 13, this.f41134D, false);
        AbstractC0814b.s(parcel, 14, this.f41135E, false);
        AbstractC0814b.b(parcel, a8);
    }
}
