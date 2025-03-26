package androidx.lifecycle;

import J6.AbstractC0650j;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import y6.AbstractC6971J;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: f, reason: collision with root package name */
    public static final a f10346f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Class[] f10347g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    private final Map f10348a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f10349b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f10350c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f10351d;

    /* renamed from: e, reason: collision with root package name */
    private final a.c f10352e;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final z a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new z();
                }
                HashMap hashMap = new HashMap();
                for (String str : bundle2.keySet()) {
                    J6.r.d(str, "key");
                    hashMap.put(str, bundle2.get(str));
                }
                return new z(hashMap);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                Object obj = parcelableArrayList.get(i8);
                J6.r.c(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i8));
            }
            return new z(linkedHashMap);
        }

        public final boolean b(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : z.f10347g) {
                J6.r.b(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }

        private a() {
        }
    }

    public z(Map map) {
        J6.r.e(map, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f10348a = linkedHashMap;
        this.f10349b = new LinkedHashMap();
        this.f10350c = new LinkedHashMap();
        this.f10351d = new LinkedHashMap();
        this.f10352e = new a.c() { // from class: androidx.lifecycle.y
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                return z.d(this.f10345a);
            }
        };
        linkedHashMap.putAll(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle d(z zVar) {
        J6.r.e(zVar, "this$0");
        for (Map.Entry entry : AbstractC6971J.m(zVar.f10349b).entrySet()) {
            zVar.e((String) entry.getKey(), ((a.c) entry.getValue()).a());
        }
        Set<String> keySet = zVar.f10348a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(zVar.f10348a.get(str));
        }
        return v0.d.a(x6.u.a("keys", arrayList), x6.u.a("values", arrayList2));
    }

    public final a.c c() {
        return this.f10352e;
    }

    public final void e(String str, Object obj) {
        J6.r.e(str, "key");
        if (!f10346f.b(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't put value with type ");
            J6.r.b(obj);
            sb.append(obj.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        Object obj2 = this.f10350c.get(str);
        r rVar = obj2 instanceof r ? (r) obj2 : null;
        if (rVar != null) {
            rVar.j(obj);
        } else {
            this.f10348a.put(str, obj);
        }
        X6.k kVar = (X6.k) this.f10351d.get(str);
        if (kVar == null) {
            return;
        }
        kVar.setValue(obj);
    }

    public z() {
        this.f10348a = new LinkedHashMap();
        this.f10349b = new LinkedHashMap();
        this.f10350c = new LinkedHashMap();
        this.f10351d = new LinkedHashMap();
        this.f10352e = new a.c() { // from class: androidx.lifecycle.y
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                return z.d(this.f10345a);
            }
        };
    }
}
