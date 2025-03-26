package B3;

import Z2.AbstractC0764c;
import android.util.Log;
import com.google.android.gms.internal.wearable.A1;
import com.google.android.gms.internal.wearable.B1;
import com.google.android.gms.wearable.Asset;
import java.util.List;

/* renamed from: B3.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0400t {

    /* renamed from: a, reason: collision with root package name */
    private final C0401u f464a;

    /* renamed from: b, reason: collision with root package name */
    private final C0394m f465b;

    private C0400t(C0401u c0401u, C0394m c0394m) {
        this.f464a = c0401u;
        C0394m c0394m2 = new C0394m();
        this.f465b = c0394m2;
        if (c0394m != null) {
            c0394m2.k(c0394m);
        }
    }

    public static C0400t b(String str) {
        AbstractC0764c.a(str, "path must not be null");
        return new C0400t(C0401u.A0(str), null);
    }

    public C0401u a() {
        A1 b8 = B1.b(this.f465b);
        this.f464a.D0(b8.f30041a.d());
        int size = b8.f30042b.size();
        for (int i8 = 0; i8 < size; i8++) {
            List list = b8.f30042b;
            String num = Integer.toString(i8);
            Asset asset = (Asset) list.get(i8);
            if (num == null) {
                throw new IllegalStateException("asset key cannot be null: ".concat(String.valueOf(asset)));
            }
            if (asset == null) {
                throw new IllegalStateException("asset cannot be null: key=".concat(num));
            }
            if (Log.isLoggable("DataMap", 3)) {
                Log.d("DataMap", "asPutDataRequest: adding asset: " + num + " " + asset.toString());
            }
            this.f464a.C0(num, asset);
        }
        return this.f464a;
    }

    public C0394m c() {
        return this.f465b;
    }
}
