package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class k2 extends AbstractC0813a implements B3.G {
    public static final Parcelable.Creator<k2> CREATOR = new l2();

    /* renamed from: A, reason: collision with root package name */
    private final byte f991A;

    /* renamed from: B, reason: collision with root package name */
    private final byte f992B;

    /* renamed from: C, reason: collision with root package name */
    private final String f993C;

    /* renamed from: o, reason: collision with root package name */
    private final int f994o;

    /* renamed from: s, reason: collision with root package name */
    private final String f995s;

    /* renamed from: t, reason: collision with root package name */
    private final String f996t;

    /* renamed from: u, reason: collision with root package name */
    private final String f997u;

    /* renamed from: v, reason: collision with root package name */
    private final String f998v;

    /* renamed from: w, reason: collision with root package name */
    private final String f999w;

    /* renamed from: x, reason: collision with root package name */
    private final String f1000x;

    /* renamed from: y, reason: collision with root package name */
    private final byte f1001y;

    /* renamed from: z, reason: collision with root package name */
    private final byte f1002z;

    public k2(int i8, String str, String str2, String str3, String str4, String str5, String str6, byte b8, byte b9, byte b10, byte b11, String str7) {
        this.f994o = i8;
        this.f995s = str;
        this.f996t = str2;
        this.f997u = str3;
        this.f998v = str4;
        this.f999w = str5;
        this.f1000x = str6;
        this.f1001y = b8;
        this.f1002z = b9;
        this.f991A = b10;
        this.f992B = b11;
        this.f993C = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k2.class != obj.getClass()) {
            return false;
        }
        k2 k2Var = (k2) obj;
        if (this.f994o != k2Var.f994o || this.f1001y != k2Var.f1001y || this.f1002z != k2Var.f1002z || this.f991A != k2Var.f991A || this.f992B != k2Var.f992B || !this.f995s.equals(k2Var.f995s)) {
            return false;
        }
        String str = this.f996t;
        if (str == null ? k2Var.f996t != null : !str.equals(k2Var.f996t)) {
            return false;
        }
        if (!this.f997u.equals(k2Var.f997u) || !this.f998v.equals(k2Var.f998v) || !this.f999w.equals(k2Var.f999w)) {
            return false;
        }
        String str2 = this.f1000x;
        if (str2 == null ? k2Var.f1000x != null : !str2.equals(k2Var.f1000x)) {
            return false;
        }
        String str3 = this.f993C;
        return str3 != null ? str3.equals(k2Var.f993C) : k2Var.f993C == null;
    }

    public final int hashCode() {
        int hashCode = ((this.f994o + 31) * 31) + this.f995s.hashCode();
        String str = this.f996t;
        int hashCode2 = ((((((((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.f997u.hashCode()) * 31) + this.f998v.hashCode()) * 31) + this.f999w.hashCode()) * 31;
        String str2 = this.f1000x;
        int hashCode3 = (((((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f1001y) * 31) + this.f1002z) * 31) + this.f991A) * 31) + this.f992B) * 31;
        String str3 = this.f993C;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "AncsNotificationParcelable{, id=" + this.f994o + ", appId='" + this.f995s + "', dateTime='" + this.f996t + "', eventId=" + ((int) this.f1001y) + ", eventFlags=" + ((int) this.f1002z) + ", categoryId=" + ((int) this.f991A) + ", categoryCount=" + ((int) this.f992B) + ", packageName='" + this.f993C + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 2, this.f994o);
        AbstractC0814b.s(parcel, 3, this.f995s, false);
        AbstractC0814b.s(parcel, 4, this.f996t, false);
        AbstractC0814b.s(parcel, 5, this.f997u, false);
        AbstractC0814b.s(parcel, 6, this.f998v, false);
        AbstractC0814b.s(parcel, 7, this.f999w, false);
        String str = this.f1000x;
        if (str == null) {
            str = this.f995s;
        }
        AbstractC0814b.s(parcel, 8, str, false);
        AbstractC0814b.f(parcel, 9, this.f1001y);
        AbstractC0814b.f(parcel, 10, this.f1002z);
        AbstractC0814b.f(parcel, 11, this.f991A);
        AbstractC0814b.f(parcel, 12, this.f992B);
        AbstractC0814b.s(parcel, 13, this.f993C, false);
        AbstractC0814b.b(parcel, a8);
    }
}
