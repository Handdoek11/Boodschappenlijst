package B3;

import Z2.AbstractC0777p;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.wearable.Asset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

/* renamed from: B3.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0394m {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f461a = new HashMap();

    private static final void C(String str, Object obj, String str2, Object obj2, ClassCastException classCastException) {
        Log.w("DataMap", "Key " + str + " expected " + str2 + " but value was a " + obj.getClass().getName() + ".  The default value " + obj2 + " was returned.");
        Log.w("DataMap", "Attempt to cast generated internal exception:", classCastException);
    }

    public void A(String str, ArrayList arrayList) {
        this.f461a.put(str, arrayList);
    }

    public int B() {
        return this.f461a.size();
    }

    public boolean a(String str) {
        return this.f461a.containsKey(str);
    }

    public Object b(String str) {
        return this.f461a.get(str);
    }

    public boolean c(String str) {
        return d(str, false);
    }

    public boolean d(String str, boolean z7) {
        Object obj = this.f461a.get(str);
        if (obj == null) {
            return z7;
        }
        try {
            return ((Boolean) obj).booleanValue();
        } catch (ClassCastException e8) {
            C(str, obj, "Boolean", Boolean.valueOf(z7), e8);
            return z7;
        }
    }

    public int e(String str) {
        return f(str, 0);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0394m)) {
            return false;
        }
        C0394m c0394m = (C0394m) obj;
        if (B() != c0394m.B()) {
            return false;
        }
        for (String str : j()) {
            Object b8 = b(str);
            Object b9 = c0394m.b(str);
            if (b8 instanceof Asset) {
                if (!(b9 instanceof Asset)) {
                    return false;
                }
                Asset asset = (Asset) b8;
                Asset asset2 = (Asset) b9;
                if (asset == null || asset2 == null) {
                    if (asset != asset2) {
                        return false;
                    }
                } else {
                    if (!(!TextUtils.isEmpty(asset.C0()) ? ((String) Z2.r.l(asset.C0())).equals(asset2.C0()) : Arrays.equals(asset.E0(), asset2.E0()))) {
                        return false;
                    }
                }
            } else if (b8 instanceof String[]) {
                if (!(b9 instanceof String[]) || !Arrays.equals((String[]) b8, (String[]) b9)) {
                    return false;
                }
            } else if (b8 instanceof long[]) {
                if (!(b9 instanceof long[]) || !Arrays.equals((long[]) b8, (long[]) b9)) {
                    return false;
                }
            } else if (b8 instanceof float[]) {
                if (!(b9 instanceof float[]) || !Arrays.equals((float[]) b8, (float[]) b9)) {
                    return false;
                }
            } else if (b8 instanceof byte[]) {
                if (!(b9 instanceof byte[]) || !Arrays.equals((byte[]) b8, (byte[]) b9)) {
                    return false;
                }
            } else if (!AbstractC0777p.a(b8, b9)) {
                return false;
            }
        }
        return true;
    }

    public int f(String str, int i8) {
        Object obj = this.f461a.get(str);
        if (obj == null) {
            return i8;
        }
        try {
            return ((Integer) obj).intValue();
        } catch (ClassCastException e8) {
            C(str, obj, "Integer", "<null>", e8);
            return i8;
        }
    }

    public long g(String str) {
        return h(str, 0L);
    }

    public long h(String str, long j8) {
        Object obj = this.f461a.get(str);
        if (obj == null) {
            return j8;
        }
        try {
            return ((Long) obj).longValue();
        } catch (ClassCastException e8) {
            C(str, obj, "long", "<null>", e8);
            return j8;
        }
    }

    public int hashCode() {
        return this.f461a.hashCode() * 29;
    }

    public String i(String str) {
        Object obj = this.f461a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (String) obj;
        } catch (ClassCastException e8) {
            C(str, obj, "String", "<null>", e8);
            return null;
        }
    }

    public Set j() {
        return this.f461a.keySet();
    }

    public void k(C0394m c0394m) {
        for (String str : c0394m.j()) {
            this.f461a.put(str, c0394m.b(str));
        }
    }

    public void l(String str, Asset asset) {
        this.f461a.put(str, asset);
    }

    public void m(String str, boolean z7) {
        this.f461a.put(str, Boolean.valueOf(z7));
    }

    public void n(String str, byte b8) {
        this.f461a.put(str, Byte.valueOf(b8));
    }

    public void o(String str, byte[] bArr) {
        this.f461a.put(str, bArr);
    }

    public void p(String str, C0394m c0394m) {
        this.f461a.put(str, c0394m);
    }

    public void q(String str, ArrayList arrayList) {
        this.f461a.put(str, arrayList);
    }

    public void r(String str, double d8) {
        this.f461a.put(str, Double.valueOf(d8));
    }

    public void s(String str, float f8) {
        this.f461a.put(str, Float.valueOf(f8));
    }

    public void t(String str, float[] fArr) {
        this.f461a.put(str, fArr);
    }

    public String toString() {
        return this.f461a.toString();
    }

    public void u(String str, int i8) {
        this.f461a.put(str, Integer.valueOf(i8));
    }

    public void v(String str, ArrayList arrayList) {
        this.f461a.put(str, arrayList);
    }

    public void w(String str, long j8) {
        this.f461a.put(str, Long.valueOf(j8));
    }

    public void x(String str, long[] jArr) {
        this.f461a.put(str, jArr);
    }

    public void y(String str, String str2) {
        this.f461a.put(str, str2);
    }

    public void z(String str, String[] strArr) {
        this.f461a.put(str, strArr);
    }
}
