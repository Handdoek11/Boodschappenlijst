package Q6;

import J6.o;
import J6.r;
import androidx.appcompat.app.E;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import y6.AbstractC6987o;

/* loaded from: classes2.dex */
public abstract class n {

    /* synthetic */ class a extends o implements I6.l {

        /* renamed from: A, reason: collision with root package name */
        public static final a f4746A = new a();

        a() {
            super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
        }

        @Override // I6.l
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public final Class invoke(Class cls) {
            r.e(cls, "p0");
            return cls.getComponentType();
        }
    }

    private static final Type b(k kVar, boolean z7) {
        c c8 = kVar.c();
        if (!(c8 instanceof b)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + kVar);
        }
        b bVar = (b) c8;
        Class b8 = z7 ? H6.a.b(bVar) : H6.a.a(bVar);
        List b9 = kVar.b();
        if (b9.isEmpty()) {
            return b8;
        }
        if (!b8.isArray()) {
            return d(b8, b9);
        }
        if (b8.getComponentType().isPrimitive()) {
            return b8;
        }
        E.a(AbstractC6987o.T(b9));
        throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + kVar);
    }

    static /* synthetic */ Type c(k kVar, boolean z7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z7 = false;
        }
        return b(kVar, z7);
    }

    private static final Type d(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC6987o.l(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                E.a(it.next());
                arrayList.add(f(null));
            }
            return new m(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List list3 = list;
            ArrayList arrayList2 = new ArrayList(AbstractC6987o.l(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                E.a(it2.next());
                arrayList2.add(f(null));
            }
            return new m(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type d8 = d(declaringClass, list.subList(length, list.size()));
        List subList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(AbstractC6987o.l(subList, 10));
        Iterator it3 = subList.iterator();
        while (it3.hasNext()) {
            E.a(it3.next());
            arrayList3.add(f(null));
        }
        return new m(cls, d8, arrayList3);
    }

    public static final Type e(k kVar) {
        r.e(kVar, "<this>");
        return c(kVar, false, 1, null);
    }

    private static final Type f(l lVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(Type type) {
        String name;
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            R6.d f8 = R6.g.f(type, a.f4746A);
            name = ((Class) R6.g.i(f8)).getName() + S6.h.v("[]", R6.g.h(f8));
        } else {
            name = cls.getName();
        }
        r.b(name);
        return name;
    }
}
