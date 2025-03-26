package c4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public abstract class x {
    static boolean a(List list, Object obj) {
        if (obj == b4.h.i(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return w.b(list.iterator(), list2.iterator());
        }
        for (int i8 = 0; i8 < size; i8++) {
            if (!b4.f.a(list.get(i8), list2.get(i8))) {
                return false;
            }
        }
        return true;
    }

    static int b(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return c(list, obj);
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (b4.f.a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    private static int c(List list, Object obj) {
        int size = list.size();
        int i8 = 0;
        if (obj == null) {
            while (i8 < size) {
                if (list.get(i8) == null) {
                    return i8;
                }
                i8++;
            }
            return -1;
        }
        while (i8 < size) {
            if (obj.equals(list.get(i8))) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    static int d(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return e(list, obj);
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (b4.f.a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    private static int e(List list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    public static ArrayList f() {
        return new ArrayList();
    }

    public static ArrayList g(Iterator it) {
        ArrayList f8 = f();
        w.a(f8, it);
        return f8;
    }
}
