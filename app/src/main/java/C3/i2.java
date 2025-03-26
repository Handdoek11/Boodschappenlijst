package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class i2 extends AbstractC0813a {
    public static final Parcelable.Creator<i2> CREATOR = new C0418d1();

    /* renamed from: o, reason: collision with root package name */
    public final String f978o;

    /* renamed from: s, reason: collision with root package name */
    public final int f979s;

    /* renamed from: t, reason: collision with root package name */
    public final int f980t;

    public i2(String str, int i8, int i9) {
        this.f978o = str;
        this.f979s = i8;
        this.f980t = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i2.class == obj.getClass()) {
            i2 i2Var = (i2) obj;
            if (this.f979s == i2Var.f979s && this.f980t == i2Var.f980t && Objects.equals(this.f978o, i2Var.f978o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f978o, Integer.valueOf(this.f979s), Integer.valueOf(this.f980t));
    }

    public final String toString() {
        return String.format(Locale.US, "WebIconParcelable{%dx%d - %s}", Integer.valueOf(this.f979s), Integer.valueOf(this.f980t), this.f978o);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f978o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 1, str, false);
        AbstractC0814b.m(parcel, 2, this.f979s);
        AbstractC0814b.m(parcel, 3, this.f980t);
        AbstractC0814b.b(parcel, a8);
    }
}
