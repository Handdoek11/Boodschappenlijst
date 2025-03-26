package com.google.android.gms.wearable.internal;

import B3.InterfaceC0392k;
import Z2.r;
import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.ReflectedParcelable;

@KeepName
/* loaded from: classes2.dex */
public class DataItemAssetParcelable extends AbstractC0813a implements InterfaceC0392k, ReflectedParcelable {
    public static final Parcelable.Creator<DataItemAssetParcelable> CREATOR = new a();

    /* renamed from: o, reason: collision with root package name */
    private final String f31348o;

    /* renamed from: s, reason: collision with root package name */
    private final String f31349s;

    public DataItemAssetParcelable(InterfaceC0392k interfaceC0392k) {
        this.f31348o = (String) r.l(interfaceC0392k.d());
        this.f31349s = (String) r.l(interfaceC0392k.e());
    }

    @Override // B3.InterfaceC0392k
    public final String d() {
        return this.f31348o;
    }

    @Override // B3.InterfaceC0392k
    public final String e() {
        return this.f31349s;
    }

    @Override // Y2.f
    public final /* bridge */ /* synthetic */ Object q0() {
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DataItemAssetParcelable[@");
        sb.append(Integer.toHexString(hashCode()));
        if (this.f31348o == null) {
            sb.append(",noid");
        } else {
            sb.append(",");
            sb.append(this.f31348o);
        }
        sb.append(", key=");
        sb.append(this.f31349s);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f31348o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 2, str, false);
        AbstractC0814b.s(parcel, 3, this.f31349s, false);
        AbstractC0814b.b(parcel, a8);
    }

    DataItemAssetParcelable(String str, String str2) {
        this.f31348o = str;
        this.f31349s = str2;
    }
}
