package g7;

import J6.H;
import J6.r;
import androidx.appcompat.app.E;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k7.AbstractC6146p0;
import k7.AbstractC6148q0;
import k7.C6116a0;
import k7.C6125f;
import k7.M;
import k7.O;
import k7.Y;
import k7.z0;
import kotlin.KotlinNothingValueException;
import x6.C6933o;
import x6.C6934p;
import x6.t;
import y6.AbstractC6987o;

/* loaded from: classes2.dex */
abstract /* synthetic */ class k {
    private static final b a(Q6.b bVar, List list, List list2) {
        if (r.a(bVar, H.b(Collection.class)) ? true : r.a(bVar, H.b(List.class)) ? true : r.a(bVar, H.b(List.class)) ? true : r.a(bVar, H.b(ArrayList.class))) {
            return new C6125f((b) list2.get(0));
        }
        if (r.a(bVar, H.b(HashSet.class))) {
            return new O((b) list2.get(0));
        }
        if (r.a(bVar, H.b(Set.class)) ? true : r.a(bVar, H.b(Set.class)) ? true : r.a(bVar, H.b(LinkedHashSet.class))) {
            return new C6116a0((b) list2.get(0));
        }
        if (r.a(bVar, H.b(HashMap.class))) {
            return new M((b) list2.get(0), (b) list2.get(1));
        }
        if (r.a(bVar, H.b(Map.class)) ? true : r.a(bVar, H.b(Map.class)) ? true : r.a(bVar, H.b(LinkedHashMap.class))) {
            return new Y((b) list2.get(0), (b) list2.get(1));
        }
        if (r.a(bVar, H.b(Map.Entry.class))) {
            return h7.a.j((b) list2.get(0), (b) list2.get(1));
        }
        if (r.a(bVar, H.b(C6933o.class))) {
            return h7.a.l((b) list2.get(0), (b) list2.get(1));
        }
        if (r.a(bVar, H.b(t.class))) {
            return h7.a.o((b) list2.get(0), (b) list2.get(1), (b) list2.get(2));
        }
        if (!AbstractC6146p0.l(bVar)) {
            return null;
        }
        Q6.c c8 = ((Q6.k) list.get(0)).c();
        r.c(c8, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        return h7.a.a((Q6.b) c8, (b) list2.get(0));
    }

    private static final b b(Q6.b bVar, List list) {
        Object[] array = list.toArray(new b[0]);
        r.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        b[] bVarArr = (b[]) array;
        return AbstractC6146p0.c(bVar, (b[]) Arrays.copyOf(bVarArr, bVarArr.length));
    }

    private static final b c(b bVar, boolean z7) {
        if (z7) {
            return h7.a.t(bVar);
        }
        r.c(bVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
        return bVar;
    }

    public static final b d(Q6.b bVar, List list, List list2) {
        r.e(bVar, "<this>");
        r.e(list, "types");
        r.e(list2, "serializers");
        b a8 = a(bVar, list, list2);
        return a8 == null ? b(bVar, list2) : a8;
    }

    public static final b e(Q6.b bVar) {
        r.e(bVar, "<this>");
        b d8 = j.d(bVar);
        if (d8 != null) {
            return d8;
        }
        AbstractC6148q0.d(bVar);
        throw new KotlinNothingValueException();
    }

    public static final b f(n7.b bVar, Q6.k kVar) {
        r.e(bVar, "<this>");
        r.e(kVar, "type");
        b g8 = g(bVar, kVar, true);
        if (g8 != null) {
            return g8;
        }
        AbstractC6146p0.m(AbstractC6148q0.c(kVar));
        throw new KotlinNothingValueException();
    }

    private static final b g(n7.b bVar, Q6.k kVar, boolean z7) {
        b bVar2;
        b b8;
        Q6.b c8 = AbstractC6148q0.c(kVar);
        boolean a8 = kVar.a();
        List b9 = kVar.b();
        ArrayList arrayList = new ArrayList(AbstractC6987o.l(b9, 10));
        Iterator it = b9.iterator();
        if (it.hasNext()) {
            E.a(it.next());
            throw null;
        }
        if (arrayList.isEmpty()) {
            bVar2 = i.a(c8, a8);
        } else {
            Object b10 = i.b(c8, arrayList, a8);
            if (z7) {
                if (C6934p.g(b10)) {
                    b10 = null;
                }
                bVar2 = (b) b10;
            } else {
                if (C6934p.e(b10) != null) {
                    return null;
                }
                bVar2 = (b) b10;
            }
        }
        if (bVar2 != null) {
            return bVar2;
        }
        if (arrayList.isEmpty()) {
            b8 = n7.b.c(bVar, c8, null, 2, null);
        } else {
            List f8 = j.f(bVar, arrayList, z7);
            if (f8 == null) {
                return null;
            }
            b a9 = j.a(c8, arrayList, f8);
            b8 = a9 == null ? bVar.b(c8, f8) : a9;
        }
        if (b8 != null) {
            return c(b8, a8);
        }
        return null;
    }

    public static final b h(Q6.b bVar) {
        r.e(bVar, "<this>");
        b b8 = AbstractC6146p0.b(bVar);
        return b8 == null ? z0.b(bVar) : b8;
    }

    public static final b i(n7.b bVar, Q6.k kVar) {
        r.e(bVar, "<this>");
        r.e(kVar, "type");
        return g(bVar, kVar, false);
    }

    public static final List j(n7.b bVar, List list, boolean z7) {
        ArrayList arrayList;
        r.e(bVar, "<this>");
        r.e(list, "typeArguments");
        if (z7) {
            List list2 = list;
            arrayList = new ArrayList(AbstractC6987o.l(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(j.c(bVar, (Q6.k) it.next()));
            }
        } else {
            List list3 = list;
            arrayList = new ArrayList(AbstractC6987o.l(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                b e8 = j.e(bVar, (Q6.k) it2.next());
                if (e8 == null) {
                    return null;
                }
                arrayList.add(e8);
            }
        }
        return arrayList;
    }
}
