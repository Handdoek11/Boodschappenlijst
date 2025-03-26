package androidx.coordinatorlayout.widget;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import q.C6407k;
import y0.f;
import y0.g;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final f f9065a = new g(10);

    /* renamed from: b, reason: collision with root package name */
    private final C6407k f9066b = new C6407k();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f9067c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet f9068d = new HashSet();

    private void e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) this.f9066b.get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i8 = 0; i8 < size; i8++) {
                e(arrayList2.get(i8), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    private ArrayList f() {
        ArrayList arrayList = (ArrayList) this.f9065a.b();
        return arrayList == null ? new ArrayList() : arrayList;
    }

    private void k(ArrayList arrayList) {
        arrayList.clear();
        this.f9065a.a(arrayList);
    }

    public void a(Object obj, Object obj2) {
        if (!this.f9066b.containsKey(obj) || !this.f9066b.containsKey(obj2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = (ArrayList) this.f9066b.get(obj);
        if (arrayList == null) {
            arrayList = f();
            this.f9066b.put(obj, arrayList);
        }
        arrayList.add(obj2);
    }

    public void b(Object obj) {
        if (this.f9066b.containsKey(obj)) {
            return;
        }
        this.f9066b.put(obj, null);
    }

    public void c() {
        int size = this.f9066b.size();
        for (int i8 = 0; i8 < size; i8++) {
            ArrayList arrayList = (ArrayList) this.f9066b.k(i8);
            if (arrayList != null) {
                k(arrayList);
            }
        }
        this.f9066b.clear();
    }

    public boolean d(Object obj) {
        return this.f9066b.containsKey(obj);
    }

    public List g(Object obj) {
        return (List) this.f9066b.get(obj);
    }

    public List h(Object obj) {
        int size = this.f9066b.size();
        ArrayList arrayList = null;
        for (int i8 = 0; i8 < size; i8++) {
            ArrayList arrayList2 = (ArrayList) this.f9066b.k(i8);
            if (arrayList2 != null && arrayList2.contains(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f9066b.g(i8));
            }
        }
        return arrayList;
    }

    public ArrayList i() {
        this.f9067c.clear();
        this.f9068d.clear();
        int size = this.f9066b.size();
        for (int i8 = 0; i8 < size; i8++) {
            e(this.f9066b.g(i8), this.f9067c, this.f9068d);
        }
        return this.f9067c;
    }

    public boolean j(Object obj) {
        int size = this.f9066b.size();
        for (int i8 = 0; i8 < size; i8++) {
            ArrayList arrayList = (ArrayList) this.f9066b.k(i8);
            if (arrayList != null && arrayList.contains(obj)) {
                return true;
            }
        }
        return false;
    }
}
