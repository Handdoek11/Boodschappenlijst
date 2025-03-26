package u2;

import android.util.SparseArray;
import h2.EnumC5832f;
import java.util.HashMap;

/* renamed from: u2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6812a {

    /* renamed from: a, reason: collision with root package name */
    private static SparseArray f43964a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    private static HashMap f43965b;

    static {
        HashMap hashMap = new HashMap();
        f43965b = hashMap;
        hashMap.put(EnumC5832f.DEFAULT, 0);
        f43965b.put(EnumC5832f.VERY_LOW, 1);
        f43965b.put(EnumC5832f.HIGHEST, 2);
        for (EnumC5832f enumC5832f : f43965b.keySet()) {
            f43964a.append(((Integer) f43965b.get(enumC5832f)).intValue(), enumC5832f);
        }
    }

    public static int a(EnumC5832f enumC5832f) {
        Integer num = (Integer) f43965b.get(enumC5832f);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC5832f);
    }

    public static EnumC5832f b(int i8) {
        EnumC5832f enumC5832f = (EnumC5832f) f43964a.get(i8);
        if (enumC5832f != null) {
            return enumC5832f;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i8);
    }
}
