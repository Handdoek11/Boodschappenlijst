package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class D {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f9824a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f9825b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f9826c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private z f9827d;

    D() {
    }

    void A(z zVar) {
        this.f9827d = zVar;
    }

    B B(String str, B b8) {
        return b8 != null ? (B) this.f9826c.put(str, b8) : (B) this.f9826c.remove(str);
    }

    void a(Fragment fragment) {
        if (this.f9824a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f9824a) {
            this.f9824a.add(fragment);
        }
        fragment.f9861C = true;
    }

    void b() {
        this.f9825b.values().removeAll(Collections.singleton(null));
    }

    boolean c(String str) {
        return this.f9825b.get(str) != null;
    }

    void d(int i8) {
        for (C c8 : this.f9825b.values()) {
            if (c8 != null) {
                c8.t(i8);
            }
        }
    }

    void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f9825b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C c8 : this.f9825b.values()) {
                printWriter.print(str);
                if (c8 != null) {
                    Fragment k8 = c8.k();
                    printWriter.println(k8);
                    k8.l(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f9824a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i8 = 0; i8 < size; i8++) {
                Fragment fragment = (Fragment) this.f9824a.get(i8);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i8);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    Fragment f(String str) {
        C c8 = (C) this.f9825b.get(str);
        if (c8 != null) {
            return c8.k();
        }
        return null;
    }

    Fragment g(int i8) {
        for (int size = this.f9824a.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f9824a.get(size);
            if (fragment != null && fragment.f9873O == i8) {
                return fragment;
            }
        }
        for (C c8 : this.f9825b.values()) {
            if (c8 != null) {
                Fragment k8 = c8.k();
                if (k8.f9873O == i8) {
                    return k8;
                }
            }
        }
        return null;
    }

    Fragment h(String str) {
        if (str != null) {
            for (int size = this.f9824a.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f9824a.get(size);
                if (fragment != null && str.equals(fragment.f9875Q)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C c8 : this.f9825b.values()) {
            if (c8 != null) {
                Fragment k8 = c8.k();
                if (str.equals(k8.f9875Q)) {
                    return k8;
                }
            }
        }
        return null;
    }

    Fragment i(String str) {
        Fragment o8;
        for (C c8 : this.f9825b.values()) {
            if (c8 != null && (o8 = c8.k().o(str)) != null) {
                return o8;
            }
        }
        return null;
    }

    int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.f9883Y;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f9824a.indexOf(fragment);
        for (int i8 = indexOf - 1; i8 >= 0; i8--) {
            Fragment fragment2 = (Fragment) this.f9824a.get(i8);
            if (fragment2.f9883Y == viewGroup && (view2 = fragment2.f9884Z) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f9824a.size()) {
                return -1;
            }
            Fragment fragment3 = (Fragment) this.f9824a.get(indexOf);
            if (fragment3.f9883Y == viewGroup && (view = fragment3.f9884Z) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    List k() {
        ArrayList arrayList = new ArrayList();
        for (C c8 : this.f9825b.values()) {
            if (c8 != null) {
                arrayList.add(c8);
            }
        }
        return arrayList;
    }

    List l() {
        ArrayList arrayList = new ArrayList();
        for (C c8 : this.f9825b.values()) {
            if (c8 != null) {
                arrayList.add(c8.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    ArrayList m() {
        return new ArrayList(this.f9826c.values());
    }

    C n(String str) {
        return (C) this.f9825b.get(str);
    }

    List o() {
        ArrayList arrayList;
        if (this.f9824a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f9824a) {
            arrayList = new ArrayList(this.f9824a);
        }
        return arrayList;
    }

    z p() {
        return this.f9827d;
    }

    B q(String str) {
        return (B) this.f9826c.get(str);
    }

    void r(C c8) {
        Fragment k8 = c8.k();
        if (c(k8.f9908w)) {
            return;
        }
        this.f9825b.put(k8.f9908w, c8);
        if (k8.f9879U) {
            if (k8.f9878T) {
                this.f9827d.f(k8);
            } else {
                this.f9827d.p(k8);
            }
            k8.f9879U = false;
        }
        if (w.G0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + k8);
        }
    }

    void s(C c8) {
        Fragment k8 = c8.k();
        if (k8.f9878T) {
            this.f9827d.p(k8);
        }
        if (((C) this.f9825b.put(k8.f9908w, null)) != null && w.G0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k8);
        }
    }

    void t() {
        Iterator it = this.f9824a.iterator();
        while (it.hasNext()) {
            C c8 = (C) this.f9825b.get(((Fragment) it.next()).f9908w);
            if (c8 != null) {
                c8.m();
            }
        }
        for (C c9 : this.f9825b.values()) {
            if (c9 != null) {
                c9.m();
                Fragment k8 = c9.k();
                if (k8.f9862D && !k8.x0()) {
                    if (k8.f9863E && !this.f9826c.containsKey(k8.f9908w)) {
                        c9.r();
                    }
                    s(c9);
                }
            }
        }
    }

    void u(Fragment fragment) {
        synchronized (this.f9824a) {
            this.f9824a.remove(fragment);
        }
        fragment.f9861C = false;
    }

    void v() {
        this.f9825b.clear();
    }

    void w(List list) {
        this.f9824a.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Fragment f8 = f(str);
                if (f8 == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (w.G0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + f8);
                }
                a(f8);
            }
        }
    }

    void x(ArrayList arrayList) {
        this.f9826c.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            B b8 = (B) it.next();
            this.f9826c.put(b8.f9808s, b8);
        }
    }

    ArrayList y() {
        ArrayList arrayList = new ArrayList(this.f9825b.size());
        for (C c8 : this.f9825b.values()) {
            if (c8 != null) {
                Fragment k8 = c8.k();
                c8.r();
                arrayList.add(k8.f9908w);
                if (w.G0(2)) {
                    Log.v("FragmentManager", "Saved state of " + k8 + ": " + k8.f9904s);
                }
            }
        }
        return arrayList;
    }

    ArrayList z() {
        synchronized (this.f9824a) {
            try {
                if (this.f9824a.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(this.f9824a.size());
                Iterator it = this.f9824a.iterator();
                while (it.hasNext()) {
                    Fragment fragment = (Fragment) it.next();
                    arrayList.add(fragment.f9908w);
                    if (w.G0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment.f9908w + "): " + fragment);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
