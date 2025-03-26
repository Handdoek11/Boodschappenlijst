package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.x2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4538x2 extends AbstractC3558o2 {
    public static final Parcelable.Creator<C4538x2> CREATOR = new C4429w2();

    /* renamed from: s, reason: collision with root package name */
    public final String f27711s;

    /* renamed from: t, reason: collision with root package name */
    public final AbstractC4169th0 f27712t;

    public C4538x2(String str, String str2, List list) {
        super(str);
        AbstractC3796qC.d(!list.isEmpty());
        this.f27711s = str2;
        AbstractC4169th0 t7 = AbstractC4169th0.t(list);
        this.f27712t = t7;
    }

    private static List a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0115  */
    @Override // com.google.android.gms.internal.ads.AbstractC3558o2, com.google.android.gms.internal.ads.InterfaceC1541Ma
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I(com.google.android.gms.internal.ads.G8 r10) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4538x2.I(com.google.android.gms.internal.ads.G8):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4538x2.class == obj.getClass()) {
            C4538x2 c4538x2 = (C4538x2) obj;
            if (Objects.equals(this.f25085o, c4538x2.f25085o) && Objects.equals(this.f27711s, c4538x2.f27711s) && this.f27712t.equals(c4538x2.f27712t)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f25085o.hashCode() + 527;
        String str = this.f27711s;
        return (((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.f27712t.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3558o2
    public final String toString() {
        return this.f25085o + ": description=" + this.f27711s + ": values=" + String.valueOf(this.f27712t);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f25085o);
        parcel.writeString(this.f27711s);
        parcel.writeStringArray((String[]) this.f27712t.toArray(new String[0]));
    }
}
