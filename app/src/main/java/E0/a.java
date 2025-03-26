package E0;

import J6.r;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import z0.AbstractC7018c0;
import z0.AbstractC7020d0;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int f2125a = c.f2129b;

    /* renamed from: b, reason: collision with root package name */
    private static final int f2126b = c.f2128a;

    public static final void a(View view) {
        r.e(view, "<this>");
        Iterator it = AbstractC7020d0.a(view).iterator();
        while (it.hasNext()) {
            c((View) it.next()).a();
        }
    }

    public static final void b(ViewGroup viewGroup) {
        r.e(viewGroup, "<this>");
        Iterator it = AbstractC7018c0.a(viewGroup).iterator();
        while (it.hasNext()) {
            c((View) it.next()).a();
        }
    }

    private static final b c(View view) {
        int i8 = f2125a;
        b bVar = (b) view.getTag(i8);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        view.setTag(i8, bVar2);
        return bVar2;
    }

    public static final void d(View view, boolean z7) {
        r.e(view, "<this>");
        view.setTag(f2126b, Boolean.valueOf(z7));
    }
}
