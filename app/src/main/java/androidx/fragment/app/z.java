package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.H;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
final class z extends androidx.lifecycle.G {

    /* renamed from: k, reason: collision with root package name */
    private static final H.b f10196k = new a();

    /* renamed from: g, reason: collision with root package name */
    private final boolean f10200g;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f10197d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final HashMap f10198e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final HashMap f10199f = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private boolean f10201h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f10202i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f10203j = false;

    class a implements H.b {
        a() {
        }

        @Override // androidx.lifecycle.H.b
        public androidx.lifecycle.G a(Class cls) {
            return new z(true);
        }

        @Override // androidx.lifecycle.H.b
        public /* synthetic */ androidx.lifecycle.G b(Class cls, T0.a aVar) {
            return androidx.lifecycle.I.b(this, cls, aVar);
        }
    }

    z(boolean z7) {
        this.f10200g = z7;
    }

    private void i(String str) {
        z zVar = (z) this.f10198e.get(str);
        if (zVar != null) {
            zVar.d();
            this.f10198e.remove(str);
        }
        androidx.lifecycle.K k8 = (androidx.lifecycle.K) this.f10199f.get(str);
        if (k8 != null) {
            k8.a();
            this.f10199f.remove(str);
        }
    }

    static z l(androidx.lifecycle.K k8) {
        return (z) new androidx.lifecycle.H(k8, f10196k).a(z.class);
    }

    @Override // androidx.lifecycle.G
    protected void d() {
        if (w.G0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f10201h = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z.class != obj.getClass()) {
            return false;
        }
        z zVar = (z) obj;
        return this.f10197d.equals(zVar.f10197d) && this.f10198e.equals(zVar.f10198e) && this.f10199f.equals(zVar.f10199f);
    }

    void f(Fragment fragment) {
        if (this.f10203j) {
            if (w.G0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f10197d.containsKey(fragment.f9908w)) {
                return;
            }
            this.f10197d.put(fragment.f9908w, fragment);
            if (w.G0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    void g(Fragment fragment) {
        if (w.G0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        i(fragment.f9908w);
    }

    void h(String str) {
        if (w.G0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        i(str);
    }

    public int hashCode() {
        return (((this.f10197d.hashCode() * 31) + this.f10198e.hashCode()) * 31) + this.f10199f.hashCode();
    }

    Fragment j(String str) {
        return (Fragment) this.f10197d.get(str);
    }

    z k(Fragment fragment) {
        z zVar = (z) this.f10198e.get(fragment.f9908w);
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z(this.f10200g);
        this.f10198e.put(fragment.f9908w, zVar2);
        return zVar2;
    }

    Collection m() {
        return new ArrayList(this.f10197d.values());
    }

    androidx.lifecycle.K n(Fragment fragment) {
        androidx.lifecycle.K k8 = (androidx.lifecycle.K) this.f10199f.get(fragment.f9908w);
        if (k8 != null) {
            return k8;
        }
        androidx.lifecycle.K k9 = new androidx.lifecycle.K();
        this.f10199f.put(fragment.f9908w, k9);
        return k9;
    }

    boolean o() {
        return this.f10201h;
    }

    void p(Fragment fragment) {
        if (this.f10203j) {
            if (w.G0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f10197d.remove(fragment.f9908w) == null || !w.G0(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    void q(boolean z7) {
        this.f10203j = z7;
    }

    boolean r(Fragment fragment) {
        if (this.f10197d.containsKey(fragment.f9908w)) {
            return this.f10200g ? this.f10201h : !this.f10202i;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f10197d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f10198e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f10199f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
