package M2;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class q0 extends LinkedHashMap {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ s0 f3924o;

    q0(s0 s0Var) {
        this.f3924o = s0Var;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        synchronized (this.f3924o) {
            try {
                int size = size();
                s0 s0Var = this.f3924o;
                if (size <= s0Var.f3934a) {
                    return false;
                }
                s0Var.f3939f.add(new Pair((String) entry.getKey(), ((r0) entry.getValue()).f3927b));
                return size() > this.f3924o.f3934a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
