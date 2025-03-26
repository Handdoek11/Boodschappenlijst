package m7;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.internal.JsonException;
import m7.r;
import y6.AbstractC6971J;
import y6.AbstractC6987o;

/* loaded from: classes2.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    private static final r.a f39466a = new r.a();

    /* synthetic */ class a extends J6.o implements I6.a {
        a(Object obj) {
            super(0, obj, v.class, "buildAlternativeNamesMap", "buildAlternativeNamesMap(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/util/Map;", 1);
        }

        @Override // I6.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public final Map invoke() {
            return v.a((i7.f) this.f3564s);
        }
    }

    public static final Map a(i7.f fVar) {
        String[] names;
        J6.r.e(fVar, "<this>");
        int g8 = fVar.g();
        Map map = null;
        for (int i8 = 0; i8 < g8; i8++) {
            List j8 = fVar.j(i8);
            ArrayList arrayList = new ArrayList();
            for (Object obj : j8) {
                if (obj instanceof l7.q) {
                    arrayList.add(obj);
                }
            }
            l7.q qVar = (l7.q) AbstractC6987o.T(arrayList);
            if (qVar != null && (names = qVar.names()) != null) {
                for (String str : names) {
                    if (map == null) {
                        map = q.a(fVar.g());
                    }
                    J6.r.b(map);
                    b(map, fVar, str, i8);
                }
            }
        }
        return map == null ? AbstractC6971J.e() : map;
    }

    private static final void b(Map map, i7.f fVar, String str, int i8) {
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i8));
            return;
        }
        throw new JsonException("The suggested name '" + str + "' for property " + fVar.h(i8) + " is already one of the names for property " + fVar.h(((Number) AbstractC6971J.f(map, str)).intValue()) + " in " + fVar);
    }

    public static final r.a c() {
        return f39466a;
    }

    public static final int d(i7.f fVar, l7.a aVar, String str) {
        J6.r.e(fVar, "<this>");
        J6.r.e(aVar, "json");
        J6.r.e(str, "name");
        int d8 = fVar.d(str);
        if (d8 != -3 || !aVar.d().j()) {
            return d8;
        }
        Integer num = (Integer) ((Map) l7.x.a(aVar).b(fVar, f39466a, new a(fVar))).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int e(i7.f fVar, l7.a aVar, String str, String str2) {
        J6.r.e(fVar, "<this>");
        J6.r.e(aVar, "json");
        J6.r.e(str, "name");
        J6.r.e(str2, "suffix");
        int d8 = d(fVar, aVar, str);
        if (d8 != -3) {
            return d8;
        }
        throw new SerializationException(fVar.a() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static /* synthetic */ int f(i7.f fVar, l7.a aVar, String str, String str2, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            str2 = "";
        }
        return e(fVar, aVar, str, str2);
    }
}
