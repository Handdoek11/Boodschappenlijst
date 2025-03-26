package B3;

import Z2.AbstractC0764c;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.wearable.A1;
import com.google.android.gms.internal.wearable.B1;
import com.google.android.gms.internal.wearable.C5238d0;
import com.google.android.gms.internal.wearable.C5249i;
import com.google.android.gms.internal.wearable.zzcx;
import com.google.android.gms.wearable.Asset;
import java.util.ArrayList;

/* renamed from: B3.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0395n {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f462a;

    /* renamed from: b, reason: collision with root package name */
    private final C0394m f463b;

    private C0395n(InterfaceC0391j interfaceC0391j) {
        C0394m a8;
        this.f462a = interfaceC0391j.u0();
        InterfaceC0391j interfaceC0391j2 = (InterfaceC0391j) interfaceC0391j.q0();
        byte[] data = interfaceC0391j2.getData();
        if (data == null && !interfaceC0391j2.j().isEmpty()) {
            throw new IllegalArgumentException("Cannot create DataMapItem from a DataItem  that wasn't made with DataMapItem.");
        }
        if (data == null) {
            a8 = new C0394m();
        } else {
            try {
                ArrayList arrayList = new ArrayList();
                int size = interfaceC0391j2.j().size();
                for (int i8 = 0; i8 < size; i8++) {
                    InterfaceC0392k interfaceC0392k = (InterfaceC0392k) interfaceC0391j2.j().get(Integer.toString(i8));
                    if (interfaceC0392k == null) {
                        throw new IllegalStateException("Cannot find DataItemAsset referenced in data at " + i8 + " for " + interfaceC0391j2.toString());
                    }
                    arrayList.add(Asset.B0(interfaceC0392k.d()));
                }
                a8 = B1.a(new A1(C5249i.E(data, C5238d0.a()), arrayList));
            } catch (zzcx e8) {
                e = e8;
                Log.w("DataItem", "Unable to parse datamap from dataItem. uri=" + String.valueOf(interfaceC0391j2.u0()) + ", data=" + Base64.encodeToString(data, 0));
                throw new IllegalStateException("Unable to parse datamap from dataItem.  uri=".concat(String.valueOf(interfaceC0391j2.u0())), e);
            } catch (NullPointerException e9) {
                e = e9;
                Log.w("DataItem", "Unable to parse datamap from dataItem. uri=" + String.valueOf(interfaceC0391j2.u0()) + ", data=" + Base64.encodeToString(data, 0));
                throw new IllegalStateException("Unable to parse datamap from dataItem.  uri=".concat(String.valueOf(interfaceC0391j2.u0())), e);
            }
        }
        this.f463b = a8;
    }

    public static C0395n a(InterfaceC0391j interfaceC0391j) {
        AbstractC0764c.a(interfaceC0391j, "dataItem must not be null");
        return new C0395n(interfaceC0391j);
    }

    public C0394m b() {
        return this.f463b;
    }
}
