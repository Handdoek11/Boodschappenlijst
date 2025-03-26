package t1;

import A1.p;
import A1.q;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;
import java.util.List;
import v1.l;

/* renamed from: t1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6785f {

    /* renamed from: a, reason: collision with root package name */
    private static final String f43807a = s1.j.f("Schedulers");

    static InterfaceC6784e a(Context context, C6789j c6789j) {
        l lVar = new l(context, c6789j);
        B1.g.a(context, SystemJobService.class, true);
        s1.j.c().a(f43807a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
        return lVar;
    }

    public static void b(androidx.work.a aVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        q B7 = workDatabase.B();
        workDatabase.c();
        try {
            List f8 = B7.f(aVar.h());
            List s8 = B7.s(200);
            if (f8 != null && f8.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = f8.iterator();
                while (it.hasNext()) {
                    B7.c(((p) it.next()).f95a, currentTimeMillis);
                }
            }
            workDatabase.r();
            workDatabase.g();
            if (f8 != null && f8.size() > 0) {
                p[] pVarArr = (p[]) f8.toArray(new p[f8.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC6784e interfaceC6784e = (InterfaceC6784e) it2.next();
                    if (interfaceC6784e.a()) {
                        interfaceC6784e.e(pVarArr);
                    }
                }
            }
            if (s8 == null || s8.size() <= 0) {
                return;
            }
            p[] pVarArr2 = (p[]) s8.toArray(new p[s8.size()]);
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                InterfaceC6784e interfaceC6784e2 = (InterfaceC6784e) it3.next();
                if (!interfaceC6784e2.a()) {
                    interfaceC6784e2.e(pVarArr2);
                }
            }
        } catch (Throwable th) {
            workDatabase.g();
            throw th;
        }
    }
}
