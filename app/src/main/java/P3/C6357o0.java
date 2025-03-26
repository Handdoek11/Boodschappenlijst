package p3;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: p3.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6357o0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f40368a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f40369b = new HashMap();

    public C6357o0(Context context) {
        this.f40368a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences.Editor d(String str) {
        if (!this.f40369b.containsKey(str)) {
            this.f40369b.put(str, this.f40368a.getSharedPreferences(str, 0).edit());
        }
        return (SharedPreferences.Editor) this.f40369b.get(str);
    }

    public final void b() {
        Iterator it = this.f40369b.values().iterator();
        while (it.hasNext()) {
            ((SharedPreferences.Editor) it.next()).apply();
        }
    }

    public final boolean c(String str, Object obj) {
        C6355n0 a8 = AbstractC6359p0.a(this.f40368a, str);
        if (a8 == null) {
            return false;
        }
        SharedPreferences.Editor d8 = d(a8.f40361a);
        if (obj instanceof Integer) {
            d8.putInt(a8.f40362b, ((Integer) obj).intValue());
            return true;
        }
        if (obj instanceof Long) {
            d8.putLong(a8.f40362b, ((Long) obj).longValue());
            return true;
        }
        if (obj instanceof Double) {
            d8.putFloat(a8.f40362b, ((Double) obj).floatValue());
            return true;
        }
        if (obj instanceof Float) {
            d8.putFloat(a8.f40362b, ((Float) obj).floatValue());
            return true;
        }
        if (obj instanceof Boolean) {
            d8.putBoolean(a8.f40362b, ((Boolean) obj).booleanValue());
            return true;
        }
        if (!(obj instanceof String)) {
            return false;
        }
        d8.putString(a8.f40362b, (String) obj);
        return true;
    }
}
