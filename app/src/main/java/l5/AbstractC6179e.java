package l5;

import androidx.recyclerview.widget.RecyclerView;
import f5.AbstractC5790e;
import f5.C5786a;
import f5.C5787b;
import f5.C5791f;
import f5.h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: l5.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6179e {
    public static Object a(RecyclerView.h hVar, Class cls) {
        if (cls.isInstance(hVar)) {
            return cls.cast(hVar);
        }
        if (hVar instanceof AbstractC5790e) {
            return a(((AbstractC5790e) hVar).d0(), cls);
        }
        return null;
    }

    public static Object b(RecyclerView.h hVar, Class cls, int i8) {
        C5786a c5786a = new C5786a();
        if (g(hVar, null, null, i8, c5786a) == -1) {
            return null;
        }
        for (C5787b c5787b : c5786a.f()) {
            if (cls.isInstance(c5787b.f35885a)) {
                return cls.cast(c5787b.f35885a);
            }
        }
        return null;
    }

    public static RecyclerView.h c(RecyclerView.h hVar) {
        return d(hVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static RecyclerView.h d(RecyclerView.h hVar) {
        if (!(hVar instanceof h)) {
            return hVar;
        }
        h hVar2 = (h) hVar;
        ArrayList arrayList = new ArrayList();
        hVar2.h(arrayList);
        hVar2.d();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d((RecyclerView.h) arrayList.get(size));
        }
        arrayList.clear();
        return hVar;
    }

    public static int e(RecyclerView.h hVar, RecyclerView.h hVar2, int i8) {
        return g(hVar, hVar2, null, i8, null);
    }

    public static int f(RecyclerView.h hVar, RecyclerView.h hVar2, Object obj, int i8) {
        return g(hVar, hVar2, obj, i8, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.recyclerview.widget.RecyclerView$h] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.recyclerview.widget.RecyclerView$h] */
    public static int g(RecyclerView.h hVar, RecyclerView.h hVar2, Object obj, int i8, C5786a c5786a) {
        C5791f c5791f = new C5791f();
        if (c5786a != null) {
            c5786a.d();
        }
        if (hVar == 0) {
            return -1;
        }
        Object obj2 = null;
        if (c5786a != null) {
            c5786a.b(new C5787b(hVar, null));
        }
        while (true) {
            if (i8 == -1 || hVar == hVar2) {
                break;
            }
            if (hVar instanceof h) {
                c5791f.a();
                ((h) hVar).k(c5791f, i8);
                i8 = c5791f.f35895c;
                obj2 = c5791f.f35894b;
                if (c5791f.b() && c5786a != null) {
                    c5786a.c(c5791f);
                }
                hVar = c5791f.f35893a;
                if (hVar == 0) {
                    break;
                }
            } else if (hVar2 != null) {
                i8 = -1;
            }
        }
        if (hVar2 != null && hVar != hVar2) {
            i8 = -1;
        }
        if (obj != null && obj2 != obj) {
            i8 = -1;
        }
        if (i8 == -1 && c5786a != null) {
            c5786a.d();
        }
        return i8;
    }

    public static int h(C5786a c5786a, int i8, int i9, int i10) {
        List f8 = c5786a.f();
        while (i8 > i9) {
            i10 = ((h) ((C5787b) f8.get(i8 - 1)).f35885a).e((C5787b) f8.get(i8), i10);
            if (i10 == -1) {
                break;
            }
            i8--;
        }
        return i10;
    }

    public static int i(C5786a c5786a, RecyclerView.h hVar, RecyclerView.h hVar2, int i8) {
        List f8 = c5786a.f();
        int size = f8.size();
        int i9 = hVar == null ? size - 1 : -1;
        int i10 = hVar2 == null ? 0 : -1;
        if (hVar != null || hVar2 != null) {
            for (int i11 = 0; i11 < size; i11++) {
                C5787b c5787b = (C5787b) f8.get(i11);
                if (hVar != null && c5787b.f35885a == hVar) {
                    i9 = i11;
                }
                if (hVar2 != null && c5787b.f35885a == hVar2) {
                    i10 = i11;
                }
            }
        }
        if (i9 == -1 || i10 == -1 || i10 > i9) {
            return -1;
        }
        return h(c5786a, i9, i10, i8);
    }
}
