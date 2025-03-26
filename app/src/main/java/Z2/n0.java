package Z2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: f, reason: collision with root package name */
    private static final Uri f6376f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a, reason: collision with root package name */
    private final String f6377a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6378b;

    /* renamed from: c, reason: collision with root package name */
    private final ComponentName f6379c;

    /* renamed from: d, reason: collision with root package name */
    private final int f6380d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f6381e;

    public n0(String str, String str2, int i8, boolean z7) {
        r.f(str);
        this.f6377a = str;
        r.f(str2);
        this.f6378b = str2;
        this.f6379c = null;
        this.f6380d = 4225;
        this.f6381e = z7;
    }

    public final ComponentName a() {
        return this.f6379c;
    }

    public final Intent b(Context context) {
        Bundle bundle;
        if (this.f6377a == null) {
            return new Intent().setComponent(this.f6379c);
        }
        if (this.f6381e) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", this.f6377a);
            try {
                bundle = context.getContentResolver().call(f6376f, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e8) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e8.toString()));
                bundle = null;
            }
            r2 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
            if (r2 == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f6377a)));
            }
        }
        return r2 == null ? new Intent(this.f6377a).setPackage(this.f6378b) : r2;
    }

    public final String c() {
        return this.f6378b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return AbstractC0777p.a(this.f6377a, n0Var.f6377a) && AbstractC0777p.a(this.f6378b, n0Var.f6378b) && AbstractC0777p.a(this.f6379c, n0Var.f6379c) && this.f6381e == n0Var.f6381e;
    }

    public final int hashCode() {
        return AbstractC0777p.b(this.f6377a, this.f6378b, this.f6379c, 4225, Boolean.valueOf(this.f6381e));
    }

    public final String toString() {
        String str = this.f6377a;
        if (str != null) {
            return str;
        }
        r.l(this.f6379c);
        return this.f6379c.flattenToString();
    }
}
