package D2;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class b2 {

    /* renamed from: a, reason: collision with root package name */
    public static final b2 f1210a = new b2();

    protected b2() {
    }

    public final X1 a(Context context, C0501f1 c0501f1) {
        Context context2;
        List list;
        String str;
        String i8 = c0501f1.i();
        Set n8 = c0501f1.n();
        if (n8.isEmpty()) {
            context2 = context;
            list = null;
        } else {
            list = DesugarCollections.unmodifiableList(new ArrayList(n8));
            context2 = context;
        }
        boolean q8 = c0501f1.q(context2);
        Bundle e8 = c0501f1.e(AdMobAdapter.class);
        String j8 = c0501f1.j();
        c0501f1.g();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            C0555y.b();
            str = H2.g.u(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        boolean p8 = c0501f1.p();
        w2.t e9 = C0528o1.h().e();
        return new X1(8, -1L, e8, -1, list, q8, Math.max(c0501f1.b(), e9.c()), false, j8, null, null, i8, c0501f1.f(), c0501f1.d(), DesugarCollections.unmodifiableList(new ArrayList(c0501f1.m())), c0501f1.k(), str, p8, null, e9.d(), (String) Collections.max(Arrays.asList(null, e9.a()), new Comparator() { // from class: D2.a2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list2 = w2.t.f44300f;
                return list2.indexOf((String) obj) - list2.indexOf((String) obj2);
            }
        }), c0501f1.l(), c0501f1.a(), c0501f1.h(), e9.b().a(), c0501f1.c());
    }
}
