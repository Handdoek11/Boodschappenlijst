package androidx.fragment.app;

import android.view.View;
import androidx.transition.C0939e;
import java.util.ArrayList;
import q.C6397a;

/* loaded from: classes.dex */
abstract class F {

    /* renamed from: a, reason: collision with root package name */
    static final H f9856a = new G();

    /* renamed from: b, reason: collision with root package name */
    static final H f9857b = b();

    static void a(Fragment fragment, Fragment fragment2, boolean z7, C6397a c6397a, boolean z8) {
        if (z7) {
            fragment2.P();
        } else {
            fragment.P();
        }
    }

    private static H b() {
        try {
            return (H) C0939e.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    static void c(C6397a c6397a, C6397a c6397a2) {
        for (int size = c6397a.size() - 1; size >= 0; size--) {
            if (!c6397a2.containsKey((String) c6397a.k(size))) {
                c6397a.i(size);
            }
        }
    }

    static void d(ArrayList arrayList, int i8) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((View) arrayList.get(size)).setVisibility(i8);
        }
    }
}
