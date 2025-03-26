package p5;

import com.headcode.ourgroceries.android.Z0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: p5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6395a {

    /* renamed from: a, reason: collision with root package name */
    private final List f40825a;

    /* renamed from: b, reason: collision with root package name */
    private final List f40826b = new ArrayList();

    public C6395a(int i8) {
        this.f40825a = new ArrayList(i8);
    }

    public void a(Object obj) {
        if (this.f40826b.isEmpty()) {
            l(null, false);
        }
        b bVar = (b) this.f40826b.get(r0.size() - 1);
        this.f40825a.add(obj);
        bVar.e();
    }

    public void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public b c(int i8) {
        return (b) this.f40826b.get(i8);
    }

    public int d() {
        return this.f40826b.size();
    }

    public d e(int i8) {
        for (int i9 = 0; i9 < this.f40826b.size(); i9++) {
            b bVar = (b) this.f40826b.get(i9);
            if (i8 >= bVar.d() && i8 <= bVar.b()) {
                int a8 = i8 - bVar.a();
                if (a8 < 0) {
                    return null;
                }
                return new d(i9, a8);
            }
        }
        return null;
    }

    public d f(int i8) {
        for (int i9 = 0; i9 < this.f40826b.size(); i9++) {
            b bVar = (b) this.f40826b.get(i9);
            if (i8 >= bVar.d() && i8 < bVar.b()) {
                return new d(i9, i8 - bVar.a());
            }
        }
        return null;
    }

    public Object g(int i8) {
        return this.f40825a.get(i8);
    }

    public int h() {
        return this.f40825a.size();
    }

    public List i(int i8) {
        b bVar = (b) this.f40826b.get(i8);
        return DesugarCollections.unmodifiableList(this.f40825a.subList(bVar.a(), bVar.b()));
    }

    public List j(int i8) {
        List i9 = i(i8);
        for (Object obj : i9) {
            if (!(obj instanceof Z0)) {
                throw new IllegalStateException("item is not ItemList: " + obj);
            }
        }
        return i9;
    }

    public int k(Object obj) {
        return this.f40825a.indexOf(obj);
    }

    public b l(c cVar, boolean z7) {
        if (cVar != null && cVar.c() != null) {
            this.f40825a.add(cVar);
        }
        b bVar = new b(cVar, this.f40825a.size(), z7);
        this.f40826b.add(bVar);
        return bVar;
    }
}
