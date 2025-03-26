package B3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import j$.util.DesugarCollections;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: B3.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0401u extends AbstractC0813a {
    public static final Parcelable.Creator<C0401u> CREATOR = new P();

    /* renamed from: v, reason: collision with root package name */
    private static final long f466v = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: w, reason: collision with root package name */
    private static final Random f467w = new SecureRandom();

    /* renamed from: o, reason: collision with root package name */
    private final Uri f468o;

    /* renamed from: s, reason: collision with root package name */
    private final Bundle f469s;

    /* renamed from: t, reason: collision with root package name */
    private byte[] f470t;

    /* renamed from: u, reason: collision with root package name */
    private long f471u;

    private C0401u(Uri uri) {
        this(uri, new Bundle(), null, f466v);
    }

    public static C0401u A0(String str) {
        Z2.r.m(str, "path must not be null");
        return G0(H0(str));
    }

    public static C0401u G0(Uri uri) {
        Z2.r.m(uri, "uri must not be null");
        return new C0401u(uri);
    }

    private static Uri H0(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("An empty path was supplied.");
        }
        if (!str.startsWith("/")) {
            throw new IllegalArgumentException("A path must start with a single / .");
        }
        if (str.startsWith("//")) {
            throw new IllegalArgumentException("A path must start with a single / .");
        }
        return new Uri.Builder().scheme("wear").path(str).build();
    }

    public boolean B0() {
        return this.f471u == 0;
    }

    public C0401u C0(String str, Asset asset) {
        Z2.r.l(str);
        Z2.r.l(asset);
        this.f469s.putParcelable(str, asset);
        return this;
    }

    public C0401u D0(byte[] bArr) {
        this.f470t = bArr;
        return this;
    }

    public C0401u E0() {
        this.f471u = 0L;
        return this;
    }

    public String F0(boolean z7) {
        StringBuilder sb = new StringBuilder("PutDataRequest[");
        byte[] bArr = this.f470t;
        sb.append("dataSz=".concat((bArr == null ? "null" : Integer.valueOf(bArr.length)).toString()));
        sb.append(", numAssets=" + this.f469s.size());
        sb.append(", uri=".concat(String.valueOf(this.f468o)));
        sb.append(", syncDeadline=" + this.f471u);
        if (!z7) {
            sb.append("]");
            return sb.toString();
        }
        sb.append("]\n  assets: ");
        for (String str : this.f469s.keySet()) {
            sb.append("\n    " + str + ": " + String.valueOf(this.f469s.getParcelable(str)));
        }
        sb.append("\n  ]");
        return sb.toString();
    }

    public byte[] getData() {
        return this.f470t;
    }

    public Map j() {
        HashMap hashMap = new HashMap();
        for (String str : this.f469s.keySet()) {
            hashMap.put(str, (Asset) this.f469s.getParcelable(str));
        }
        return DesugarCollections.unmodifiableMap(hashMap);
    }

    public String toString() {
        return F0(Log.isLoggable("DataMap", 3));
    }

    public Uri u0() {
        return this.f468o;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        Z2.r.m(parcel, "dest must not be null");
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.r(parcel, 2, u0(), i8, false);
        AbstractC0814b.e(parcel, 4, this.f469s, false);
        AbstractC0814b.g(parcel, 5, getData(), false);
        AbstractC0814b.p(parcel, 6, this.f471u);
        AbstractC0814b.b(parcel, a8);
    }

    C0401u(Uri uri, Bundle bundle, byte[] bArr, long j8) {
        this.f468o = uri;
        this.f469s = bundle;
        bundle.setClassLoader((ClassLoader) Z2.r.l(DataItemAssetParcelable.class.getClassLoader()));
        this.f470t = bArr;
        this.f471u = j8;
    }
}
