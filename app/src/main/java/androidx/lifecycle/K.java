package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class K {

    /* renamed from: a, reason: collision with root package name */
    private final Map f10246a = new LinkedHashMap();

    public final void a() {
        Iterator it = this.f10246a.values().iterator();
        while (it.hasNext()) {
            ((G) it.next()).a();
        }
        this.f10246a.clear();
    }

    public final G b(String str) {
        J6.r.e(str, "key");
        return (G) this.f10246a.get(str);
    }

    public final Set c() {
        return new HashSet(this.f10246a.keySet());
    }

    public final void d(String str, G g8) {
        J6.r.e(str, "key");
        J6.r.e(g8, "viewModel");
        G g9 = (G) this.f10246a.put(str, g8);
        if (g9 != null) {
            g9.d();
        }
    }
}
