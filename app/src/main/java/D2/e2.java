package D2;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e2 extends AbstractC0813a {
    public static final Parcelable.Creator<e2> CREATOR = new f2();

    /* renamed from: o, reason: collision with root package name */
    public final int f1246o;

    /* renamed from: s, reason: collision with root package name */
    public final int f1247s;

    /* renamed from: t, reason: collision with root package name */
    public final String f1248t;

    /* renamed from: u, reason: collision with root package name */
    public final long f1249u;

    public e2(int i8, int i9, String str, long j8) {
        this.f1246o = i8;
        this.f1247s = i9;
        this.f1248t = str;
        this.f1249u = j8;
    }

    public static e2 A0(JSONObject jSONObject) {
        return new e2(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString("currency"), jSONObject.getLong("value"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f1246o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, i9);
        AbstractC0814b.m(parcel, 2, this.f1247s);
        AbstractC0814b.s(parcel, 3, this.f1248t, false);
        AbstractC0814b.p(parcel, 4, this.f1249u);
        AbstractC0814b.b(parcel, a8);
    }
}
