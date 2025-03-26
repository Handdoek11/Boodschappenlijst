package C3;

import B3.InterfaceC0391j;
import B3.InterfaceC0392k;
import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class U extends AbstractC0813a implements InterfaceC0391j {
    public static final Parcelable.Creator<U> CREATOR = new V();

    /* renamed from: o, reason: collision with root package name */
    private final Uri f907o;

    /* renamed from: s, reason: collision with root package name */
    private final Map f908s;

    /* renamed from: t, reason: collision with root package name */
    private byte[] f909t;

    U(Uri uri, Bundle bundle, byte[] bArr) {
        this.f907o = uri;
        HashMap hashMap = new HashMap();
        bundle.setClassLoader((ClassLoader) Z2.r.l(DataItemAssetParcelable.class.getClassLoader()));
        for (String str : bundle.keySet()) {
            hashMap.put(str, (DataItemAssetParcelable) Z2.r.l(bundle.getParcelable(str)));
        }
        this.f908s = hashMap;
        this.f909t = bArr;
    }

    @Override // B3.InterfaceC0391j
    public final byte[] getData() {
        return this.f909t;
    }

    @Override // B3.InterfaceC0391j
    public final Map j() {
        return this.f908s;
    }

    public final String toString() {
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb = new StringBuilder("DataItemParcelable[");
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        byte[] bArr = this.f909t;
        sb.append(",dataSz=".concat((bArr == null ? "null" : Integer.valueOf(bArr.length)).toString()));
        sb.append(", numAssets=" + this.f908s.size());
        sb.append(", uri=".concat(String.valueOf(this.f907o)));
        if (!isLoggable) {
            sb.append("]");
            return sb.toString();
        }
        sb.append("]\n  assets: ");
        for (String str : this.f908s.keySet()) {
            sb.append("\n    " + str + ": " + String.valueOf(this.f908s.get(str)));
        }
        sb.append("\n  ]");
        return sb.toString();
    }

    @Override // B3.InterfaceC0391j
    public final Uri u0() {
        return this.f907o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.r(parcel, 2, this.f907o, i8, false);
        Bundle bundle = new Bundle();
        bundle.setClassLoader((ClassLoader) Z2.r.l(DataItemAssetParcelable.class.getClassLoader()));
        for (Map.Entry entry : this.f908s.entrySet()) {
            bundle.putParcelable((String) entry.getKey(), new DataItemAssetParcelable((InterfaceC0392k) entry.getValue()));
        }
        AbstractC0814b.e(parcel, 4, bundle, false);
        AbstractC0814b.g(parcel, 5, this.f909t, false);
        AbstractC0814b.b(parcel, a8);
    }

    @Override // Y2.f
    public final /* bridge */ /* synthetic */ Object q0() {
        return this;
    }
}
