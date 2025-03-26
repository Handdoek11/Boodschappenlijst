package C3;

import B3.InterfaceC0391j;
import B3.InterfaceC0392k;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class W extends Y2.d implements InterfaceC0391j {

    /* renamed from: u, reason: collision with root package name */
    private final int f913u;

    public W(DataHolder dataHolder, int i8, int i9) {
        super(dataHolder, i8);
        this.f913u = i9;
    }

    @Override // B3.InterfaceC0391j
    public final byte[] getData() {
        return a("data");
    }

    @Override // B3.InterfaceC0391j
    public final Map j() {
        HashMap hashMap = new HashMap(this.f913u);
        for (int i8 = 0; i8 < this.f913u; i8++) {
            S s8 = new S(this.f6065o, this.f6066s + i8);
            if (s8.c("asset_key") != null) {
                hashMap.put(s8.c("asset_key"), s8);
            }
        }
        return hashMap;
    }

    @Override // Y2.f
    public final /* synthetic */ Object q0() {
        return new T(this);
    }

    public final String toString() {
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        byte[] a8 = a("data");
        Map j8 = j();
        StringBuilder sb = new StringBuilder("DataItemRef{ ");
        sb.append("uri=".concat(String.valueOf(u0())));
        sb.append(", dataSz=".concat((a8 == null ? "null" : Integer.valueOf(a8.length)).toString()));
        sb.append(", numAssets=" + j8.size());
        if (isLoggable && !j8.isEmpty()) {
            sb.append(", assets=[");
            String str = "";
            for (Map.Entry entry : j8.entrySet()) {
                sb.append(str + ((String) entry.getKey()) + ": " + ((InterfaceC0392k) entry.getValue()).d());
                str = ", ";
            }
            sb.append("]");
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override // B3.InterfaceC0391j
    public final Uri u0() {
        return Uri.parse(c("path"));
    }
}
