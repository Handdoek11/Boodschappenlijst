package androidx.work.impl.workers;

import A1.g;
import A1.h;
import A1.k;
import A1.p;
import A1.q;
import A1.t;
import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import s1.j;
import t1.C6789j;

/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {

    /* renamed from: x, reason: collision with root package name */
    private static final String f11965x = j.f("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    private static String a(p pVar, String str, Integer num, String str2) {
        return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", pVar.f95a, pVar.f97c, num, pVar.f96b.name(), str, str2);
    }

    private static String c(k kVar, t tVar, h hVar, List list) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", "Job Id"));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            g c8 = hVar.c(pVar.f95a);
            sb.append(a(pVar, TextUtils.join(",", kVar.b(pVar.f95a)), c8 != null ? Integer.valueOf(c8.f73b) : null, TextUtils.join(",", tVar.a(pVar.f95a))));
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public ListenableWorker.a doWork() {
        WorkDatabase o8 = C6789j.k(getApplicationContext()).o();
        q B7 = o8.B();
        k z7 = o8.z();
        t C7 = o8.C();
        h y7 = o8.y();
        List e8 = B7.e(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List i8 = B7.i();
        List s8 = B7.s(200);
        if (e8 != null && !e8.isEmpty()) {
            j c8 = j.c();
            String str = f11965x;
            c8.d(str, "Recently completed work:\n\n", new Throwable[0]);
            j.c().d(str, c(z7, C7, y7, e8), new Throwable[0]);
        }
        if (i8 != null && !i8.isEmpty()) {
            j c9 = j.c();
            String str2 = f11965x;
            c9.d(str2, "Running work:\n\n", new Throwable[0]);
            j.c().d(str2, c(z7, C7, y7, i8), new Throwable[0]);
        }
        if (s8 != null && !s8.isEmpty()) {
            j c10 = j.c();
            String str3 = f11965x;
            c10.d(str3, "Enqueued work:\n\n", new Throwable[0]);
            j.c().d(str3, c(z7, C7, y7, s8), new Throwable[0]);
        }
        return ListenableWorker.a.c();
    }
}
