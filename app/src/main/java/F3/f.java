package f3;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import q.C6397a;
import q.C6398b;

/* loaded from: classes.dex */
public abstract class f {
    public static List a(Object obj) {
        return Collections.singletonList(obj);
    }

    public static List b(Object... objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? DesugarCollections.unmodifiableList(Arrays.asList(objArr)) : Collections.singletonList(objArr[0]) : Collections.emptyList();
    }

    public static Map c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Map g8 = g(3, false);
        g8.put(obj, obj2);
        g8.put(obj3, obj4);
        g8.put(obj5, obj6);
        return DesugarCollections.unmodifiableMap(g8);
    }

    public static Map d(Object[] objArr, Object[] objArr2) {
        int length = objArr.length;
        int length2 = objArr2.length;
        if (length != length2) {
            throw new IllegalArgumentException("Key and values array lengths not equal: " + length + " != " + length2);
        }
        if (length == 0) {
            return Collections.emptyMap();
        }
        if (length == 1) {
            return Collections.singletonMap(objArr[0], objArr2[0]);
        }
        Map g8 = g(length, false);
        for (int i8 = 0; i8 < objArr.length; i8++) {
            g8.put(objArr[i8], objArr2[i8]);
        }
        return DesugarCollections.unmodifiableMap(g8);
    }

    public static Set e(Object obj, Object obj2, Object obj3) {
        Set h8 = h(3, false);
        h8.add(obj);
        h8.add(obj2);
        h8.add(obj3);
        return DesugarCollections.unmodifiableSet(h8);
    }

    public static Set f(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return Collections.emptySet();
        }
        if (length == 1) {
            return Collections.singleton(objArr[0]);
        }
        if (length == 2) {
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Set h8 = h(2, false);
            h8.add(obj);
            h8.add(obj2);
            return DesugarCollections.unmodifiableSet(h8);
        }
        if (length == 3) {
            return e(objArr[0], objArr[1], objArr[2]);
        }
        if (length != 4) {
            Set h9 = h(length, false);
            Collections.addAll(h9, objArr);
            return DesugarCollections.unmodifiableSet(h9);
        }
        Object obj3 = objArr[0];
        Object obj4 = objArr[1];
        Object obj5 = objArr[2];
        Object obj6 = objArr[3];
        Set h10 = h(4, false);
        h10.add(obj3);
        h10.add(obj4);
        h10.add(obj5);
        h10.add(obj6);
        return DesugarCollections.unmodifiableSet(h10);
    }

    private static Map g(int i8, boolean z7) {
        return i8 <= 256 ? new C6397a(i8) : new HashMap(i8, 1.0f);
    }

    private static Set h(int i8, boolean z7) {
        if (i8 <= (true != z7 ? 256 : 128)) {
            return new C6398b(i8);
        }
        return new HashSet(i8, true != z7 ? 1.0f : 0.75f);
    }
}
