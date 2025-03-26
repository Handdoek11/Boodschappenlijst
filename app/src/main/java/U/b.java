package U;

import U.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final a f5321a = new a("", null, null, 6, null);

    public static final boolean b(int i8, int i9, int i10, int i11) {
        if (i8 > i10 || i11 > i9) {
            return false;
        }
        if (i9 == i11) {
            if ((i10 == i11) != (i8 == i9)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List c(List list, int i8, int i9) {
        if (i8 > i9) {
            throw new IllegalArgumentException(("start (" + i8 + ") should be less than or equal to end (" + i9 + ')').toString());
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            a.C0108a c0108a = (a.C0108a) obj;
            if (d(i8, i9, c0108a.f(), c0108a.d())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            a.C0108a c0108a2 = (a.C0108a) arrayList.get(i11);
            arrayList2.add(new a.C0108a(c0108a2.e(), Math.max(i8, c0108a2.f()) - i8, Math.min(i9, c0108a2.d()) - i8, c0108a2.g()));
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    public static final boolean d(int i8, int i9, int i10, int i11) {
        return Math.max(i8, i10) < Math.min(i9, i11) || b(i8, i9, i10, i11) || b(i10, i11, i8, i9);
    }
}
