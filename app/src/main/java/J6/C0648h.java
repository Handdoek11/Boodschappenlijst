package J6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import x6.C6933o;
import y6.AbstractC6971J;
import y6.AbstractC6987o;

/* renamed from: J6.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0648h implements Q6.b, InterfaceC0647g {

    /* renamed from: b, reason: collision with root package name */
    public static final a f3571b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Map f3572c;

    /* renamed from: d, reason: collision with root package name */
    private static final HashMap f3573d;

    /* renamed from: e, reason: collision with root package name */
    private static final HashMap f3574e;

    /* renamed from: f, reason: collision with root package name */
    private static final HashMap f3575f;

    /* renamed from: g, reason: collision with root package name */
    private static final Map f3576g;

    /* renamed from: a, reason: collision with root package name */
    private final Class f3577a;

    /* renamed from: J6.h$a */
    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
        
            if (r2 == null) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String a(java.lang.Class r7) {
            /*
                r6 = this;
                java.lang.String r0 = "jClass"
                J6.r.e(r7, r0)
                boolean r0 = r7.isAnonymousClass()
                r1 = 0
                if (r0 == 0) goto Le
                goto Lb3
            Le:
                boolean r0 = r7.isLocalClass()
                if (r0 == 0) goto L6a
                java.lang.String r0 = r7.getSimpleName()
                java.lang.reflect.Method r2 = r7.getEnclosingMethod()
                r3 = 2
                r4 = 36
                if (r2 == 0) goto L41
                J6.r.b(r0)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r2 = r2.getName()
                r5.append(r2)
                r5.append(r4)
                java.lang.String r2 = r5.toString()
                java.lang.String r2 = S6.h.u0(r0, r2, r1, r3, r1)
                if (r2 != 0) goto L3e
                goto L41
            L3e:
                r1 = r2
                goto Lb3
            L41:
                java.lang.reflect.Constructor r7 = r7.getEnclosingConstructor()
                if (r7 == 0) goto L62
                J6.r.b(r0)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r7 = r7.getName()
                r2.append(r7)
                r2.append(r4)
                java.lang.String r7 = r2.toString()
                java.lang.String r1 = S6.h.u0(r0, r7, r1, r3, r1)
                goto Lb3
            L62:
                J6.r.b(r0)
                java.lang.String r1 = S6.h.t0(r0, r4, r1, r3, r1)
                goto Lb3
            L6a:
                boolean r0 = r7.isArray()
                if (r0 == 0) goto L9e
                java.lang.Class r7 = r7.getComponentType()
                boolean r0 = r7.isPrimitive()
                java.lang.String r2 = "Array"
                if (r0 == 0) goto L9b
                java.util.Map r0 = J6.C0648h.e()
                java.lang.String r7 = r7.getName()
                java.lang.Object r7 = r0.get(r7)
                java.lang.String r7 = (java.lang.String) r7
                if (r7 == 0) goto L9b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r7)
                r0.append(r2)
                java.lang.String r1 = r0.toString()
            L9b:
                if (r1 != 0) goto Lb3
                goto L3e
            L9e:
                java.util.Map r0 = J6.C0648h.e()
                java.lang.String r1 = r7.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto Lb3
                java.lang.String r1 = r7.getSimpleName()
            Lb3:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: J6.C0648h.a.a(java.lang.Class):java.lang.String");
        }

        public final boolean b(Object obj, Class cls) {
            r.e(cls, "jClass");
            Map map = C0648h.f3572c;
            r.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(cls);
            if (num != null) {
                return L.i(obj, num.intValue());
            }
            if (cls.isPrimitive()) {
                cls = H6.a.b(H6.a.c(cls));
            }
            return cls.isInstance(obj);
        }

        private a() {
        }
    }

    static {
        int i8 = 0;
        List g8 = AbstractC6987o.g(I6.a.class, I6.l.class, I6.p.class, I6.q.class, I6.r.class, I6.s.class, I6.t.class, I6.u.class, I6.v.class, I6.w.class, I6.b.class, I6.c.class, I6.d.class, I6.e.class, I6.f.class, I6.g.class, I6.h.class, I6.i.class, I6.j.class, I6.k.class, I6.m.class, I6.n.class, I6.o.class);
        ArrayList arrayList = new ArrayList(AbstractC6987o.l(g8, 10));
        for (Object obj : g8) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                AbstractC6987o.k();
            }
            arrayList.add(x6.u.a((Class) obj, Integer.valueOf(i8)));
            i8 = i9;
        }
        f3572c = AbstractC6971J.k(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f3573d = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f3574e = hashMap2;
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        r.d(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            r.b(str);
            sb.append(S6.h.w0(str, '.', null, 2, null));
            sb.append("CompanionObject");
            C6933o a8 = x6.u.a(sb.toString(), str + ".Companion");
            hashMap3.put(a8.c(), a8.d());
        }
        for (Map.Entry entry : f3572c.entrySet()) {
            hashMap3.put(((Class) entry.getKey()).getName(), "kotlin.Function" + ((Number) entry.getValue()).intValue());
        }
        f3575f = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC6971J.b(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), S6.h.w0((String) entry2.getValue(), '.', null, 2, null));
        }
        f3576g = linkedHashMap;
    }

    public C0648h(Class cls) {
        r.e(cls, "jClass");
        this.f3577a = cls;
    }

    @Override // Q6.b
    public String a() {
        return f3571b.a(c());
    }

    @Override // Q6.b
    public boolean b(Object obj) {
        return f3571b.b(obj, c());
    }

    @Override // J6.InterfaceC0647g
    public Class c() {
        return this.f3577a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0648h) && r.a(H6.a.b(this), H6.a.b((Q6.b) obj));
    }

    public int hashCode() {
        return H6.a.b(this).hashCode();
    }

    public String toString() {
        return c().toString() + " (Kotlin reflection is not available)";
    }
}
