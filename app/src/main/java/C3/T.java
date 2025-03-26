package C3;

import B3.InterfaceC0391j;
import B3.InterfaceC0392k;
import android.net.Uri;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class T implements InterfaceC0391j {

    /* renamed from: o, reason: collision with root package name */
    private final Uri f904o;

    /* renamed from: s, reason: collision with root package name */
    private final byte[] f905s;

    /* renamed from: t, reason: collision with root package name */
    private final Map f906t;

    public T(InterfaceC0391j interfaceC0391j) {
        this.f904o = interfaceC0391j.u0();
        this.f905s = interfaceC0391j.getData();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : interfaceC0391j.j().entrySet()) {
            if (entry.getKey() != null) {
                hashMap.put((String) entry.getKey(), (InterfaceC0392k) ((InterfaceC0392k) entry.getValue()).q0());
            }
        }
        this.f906t = DesugarCollections.unmodifiableMap(hashMap);
    }

    @Override // B3.InterfaceC0391j
    public final byte[] getData() {
        return this.f905s;
    }

    @Override // B3.InterfaceC0391j
    public final Map j() {
        return this.f906t;
    }

    public final String toString() {
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb = new StringBuilder("DataItemEntity{ ");
        sb.append("uri=".concat(String.valueOf(this.f904o)));
        byte[] bArr = this.f905s;
        sb.append(", dataSz=".concat((bArr == null ? "null" : Integer.valueOf(bArr.length)).toString()));
        sb.append(", numAssets=" + this.f906t.size());
        if (isLoggable && !this.f906t.isEmpty()) {
            sb.append(", assets=[");
            String str = "";
            for (Map.Entry entry : this.f906t.entrySet()) {
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
        return this.f904o;
    }

    @Override // Y2.f
    public final /* bridge */ /* synthetic */ Object q0() {
        return this;
    }
}
